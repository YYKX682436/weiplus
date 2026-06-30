package b4;

/* loaded from: classes13.dex */
public final class d {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.Object f99301f = new java.lang.Object();

    /* renamed from: g, reason: collision with root package name */
    public static b4.d f99302g;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f99303a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f99304b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f99305c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f99306d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Handler f99307e;

    public d(android.content.Context context) {
        this.f99303a = context;
        this.f99307e = new b4.a(this, context.getMainLooper());
    }

    public static b4.d a(android.content.Context context) {
        b4.d dVar;
        synchronized (f99301f) {
            if (f99302g == null) {
                f99302g = new b4.d(context.getApplicationContext());
            }
            dVar = f99302g;
        }
        return dVar;
    }

    public void b(android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter) {
        synchronized (this.f99304b) {
            b4.c cVar = new b4.c(intentFilter, broadcastReceiver);
            java.util.ArrayList arrayList = (java.util.ArrayList) this.f99304b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList(1);
                this.f99304b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(cVar);
            for (int i17 = 0; i17 < intentFilter.countActions(); i17++) {
                java.lang.String action = intentFilter.getAction(i17);
                java.util.ArrayList arrayList2 = (java.util.ArrayList) this.f99305c.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new java.util.ArrayList(1);
                    this.f99305c.put(action, arrayList2);
                }
                arrayList2.add(cVar);
            }
        }
    }

    public boolean c(android.content.Intent intent) {
        int i17;
        java.lang.String str;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.lang.String str2;
        boolean z17;
        synchronized (this.f99304b) {
            java.lang.String action = intent.getAction();
            java.lang.String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f99303a.getContentResolver());
            android.net.Uri data = intent.getData();
            java.lang.String scheme = intent.getScheme();
            java.util.Set<java.lang.String> categories = intent.getCategories();
            boolean z18 = true;
            boolean z19 = (intent.getFlags() & 8) != 0;
            if (z19) {
                intent.toString();
            }
            java.util.ArrayList arrayList3 = (java.util.ArrayList) this.f99305c.get(intent.getAction());
            if (arrayList3 != null) {
                if (z19) {
                    arrayList3.toString();
                }
                java.util.ArrayList arrayList4 = null;
                int i18 = 0;
                while (i18 < arrayList3.size()) {
                    b4.c cVar = (b4.c) arrayList3.get(i18);
                    if (z19) {
                        java.util.Objects.toString(cVar.f99297a);
                    }
                    if (cVar.f99299c) {
                        i17 = i18;
                        arrayList2 = arrayList3;
                        str = action;
                        str2 = resolveTypeIfNeeded;
                        arrayList = arrayList4;
                        z17 = z18;
                    } else {
                        android.content.IntentFilter intentFilter = cVar.f99297a;
                        java.lang.String str3 = action;
                        java.lang.String str4 = resolveTypeIfNeeded;
                        i17 = i18;
                        str = action;
                        arrayList = arrayList4;
                        arrayList2 = arrayList3;
                        str2 = resolveTypeIfNeeded;
                        z17 = z18;
                        int match = intentFilter.match(str3, str4, scheme, data, categories, "LocalBroadcastManager");
                        if (match >= 0) {
                            if (z19) {
                                java.lang.Integer.toHexString(match);
                            }
                            arrayList4 = arrayList == null ? new java.util.ArrayList() : arrayList;
                            arrayList4.add(cVar);
                            cVar.f99299c = z17;
                            i18 = i17 + 1;
                            z18 = z17;
                            action = str;
                            arrayList3 = arrayList2;
                            resolveTypeIfNeeded = str2;
                        }
                    }
                    arrayList4 = arrayList;
                    i18 = i17 + 1;
                    z18 = z17;
                    action = str;
                    arrayList3 = arrayList2;
                    resolveTypeIfNeeded = str2;
                }
                java.util.ArrayList arrayList5 = arrayList4;
                boolean z27 = z18;
                if (arrayList5 != null) {
                    for (int i19 = 0; i19 < arrayList5.size(); i19++) {
                        ((b4.c) arrayList5.get(i19)).f99299c = false;
                    }
                    this.f99306d.add(new b4.b(intent, arrayList5));
                    if (!this.f99307e.hasMessages(z27 ? 1 : 0)) {
                        this.f99307e.sendEmptyMessage(z27 ? 1 : 0);
                    }
                    return z27;
                }
            }
            return false;
        }
    }

    public void d(android.content.BroadcastReceiver broadcastReceiver) {
        synchronized (this.f99304b) {
            java.util.ArrayList arrayList = (java.util.ArrayList) this.f99304b.remove(broadcastReceiver);
            if (arrayList == null) {
                return;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                b4.c cVar = (b4.c) arrayList.get(size);
                cVar.f99300d = true;
                for (int i17 = 0; i17 < cVar.f99297a.countActions(); i17++) {
                    java.lang.String action = cVar.f99297a.getAction(i17);
                    java.util.ArrayList arrayList2 = (java.util.ArrayList) this.f99305c.get(action);
                    if (arrayList2 != null) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            b4.c cVar2 = (b4.c) arrayList2.get(size2);
                            if (cVar2.f99298b == broadcastReceiver) {
                                cVar2.f99300d = true;
                                arrayList2.remove(size2);
                            }
                        }
                        if (arrayList2.size() <= 0) {
                            this.f99305c.remove(action);
                        }
                    }
                }
            }
        }
    }
}
