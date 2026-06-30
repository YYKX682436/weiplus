package b4;

/* loaded from: classes13.dex */
public final class d {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.Object f17768f = new java.lang.Object();

    /* renamed from: g, reason: collision with root package name */
    public static b4.d f17769g;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f17770a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f17771b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f17772c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f17773d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Handler f17774e;

    public d(android.content.Context context) {
        this.f17770a = context;
        this.f17774e = new b4.a(this, context.getMainLooper());
    }

    public static b4.d a(android.content.Context context) {
        b4.d dVar;
        synchronized (f17768f) {
            if (f17769g == null) {
                f17769g = new b4.d(context.getApplicationContext());
            }
            dVar = f17769g;
        }
        return dVar;
    }

    public void b(android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter) {
        synchronized (this.f17771b) {
            b4.c cVar = new b4.c(intentFilter, broadcastReceiver);
            java.util.ArrayList arrayList = (java.util.ArrayList) this.f17771b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList(1);
                this.f17771b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(cVar);
            for (int i17 = 0; i17 < intentFilter.countActions(); i17++) {
                java.lang.String action = intentFilter.getAction(i17);
                java.util.ArrayList arrayList2 = (java.util.ArrayList) this.f17772c.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new java.util.ArrayList(1);
                    this.f17772c.put(action, arrayList2);
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
        synchronized (this.f17771b) {
            java.lang.String action = intent.getAction();
            java.lang.String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f17770a.getContentResolver());
            android.net.Uri data = intent.getData();
            java.lang.String scheme = intent.getScheme();
            java.util.Set<java.lang.String> categories = intent.getCategories();
            boolean z18 = true;
            boolean z19 = (intent.getFlags() & 8) != 0;
            if (z19) {
                intent.toString();
            }
            java.util.ArrayList arrayList3 = (java.util.ArrayList) this.f17772c.get(intent.getAction());
            if (arrayList3 != null) {
                if (z19) {
                    arrayList3.toString();
                }
                java.util.ArrayList arrayList4 = null;
                int i18 = 0;
                while (i18 < arrayList3.size()) {
                    b4.c cVar = (b4.c) arrayList3.get(i18);
                    if (z19) {
                        java.util.Objects.toString(cVar.f17764a);
                    }
                    if (cVar.f17766c) {
                        i17 = i18;
                        arrayList2 = arrayList3;
                        str = action;
                        str2 = resolveTypeIfNeeded;
                        arrayList = arrayList4;
                        z17 = z18;
                    } else {
                        android.content.IntentFilter intentFilter = cVar.f17764a;
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
                            cVar.f17766c = z17;
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
                        ((b4.c) arrayList5.get(i19)).f17766c = false;
                    }
                    this.f17773d.add(new b4.b(intent, arrayList5));
                    if (!this.f17774e.hasMessages(z27 ? 1 : 0)) {
                        this.f17774e.sendEmptyMessage(z27 ? 1 : 0);
                    }
                    return z27;
                }
            }
            return false;
        }
    }

    public void d(android.content.BroadcastReceiver broadcastReceiver) {
        synchronized (this.f17771b) {
            java.util.ArrayList arrayList = (java.util.ArrayList) this.f17771b.remove(broadcastReceiver);
            if (arrayList == null) {
                return;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                b4.c cVar = (b4.c) arrayList.get(size);
                cVar.f17767d = true;
                for (int i17 = 0; i17 < cVar.f17764a.countActions(); i17++) {
                    java.lang.String action = cVar.f17764a.getAction(i17);
                    java.util.ArrayList arrayList2 = (java.util.ArrayList) this.f17772c.get(action);
                    if (arrayList2 != null) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            b4.c cVar2 = (b4.c) arrayList2.get(size2);
                            if (cVar2.f17765b == broadcastReceiver) {
                                cVar2.f17767d = true;
                                arrayList2.remove(size2);
                            }
                        }
                        if (arrayList2.size() <= 0) {
                            this.f17772c.remove(action);
                        }
                    }
                }
            }
        }
    }
}
