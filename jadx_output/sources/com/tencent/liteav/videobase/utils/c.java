package com.tencent.liteav.videobase.utils;

/* loaded from: classes13.dex */
public final class c {

    /* renamed from: f, reason: collision with root package name */
    private static final java.lang.Object f46807f = new java.lang.Object();

    /* renamed from: g, reason: collision with root package name */
    private static com.tencent.liteav.videobase.utils.c f46808g;

    /* renamed from: a, reason: collision with root package name */
    final android.content.Context f46809a;

    /* renamed from: e, reason: collision with root package name */
    private final android.os.Handler f46813e;

    /* renamed from: b, reason: collision with root package name */
    final java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<com.tencent.liteav.videobase.utils.c.b>> f46810b = new java.util.HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final java.util.HashMap<java.lang.String, java.util.ArrayList<com.tencent.liteav.videobase.utils.c.b>> f46812d = new java.util.HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    final java.util.ArrayList<com.tencent.liteav.videobase.utils.c.a> f46811c = new java.util.ArrayList<>();

    /* loaded from: classes13.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        final android.content.Intent f46815a;

        /* renamed from: b, reason: collision with root package name */
        final java.util.ArrayList<com.tencent.liteav.videobase.utils.c.b> f46816b;

        public a(android.content.Intent intent, java.util.ArrayList<com.tencent.liteav.videobase.utils.c.b> arrayList) {
            this.f46815a = intent;
            this.f46816b = arrayList;
        }
    }

    /* loaded from: classes13.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        final android.content.IntentFilter f46817a;

        /* renamed from: b, reason: collision with root package name */
        final android.content.BroadcastReceiver f46818b;

        /* renamed from: c, reason: collision with root package name */
        boolean f46819c;

        /* renamed from: d, reason: collision with root package name */
        boolean f46820d;

        public final java.lang.String toString() {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(128);
            sb6.append("Receiver{");
            sb6.append(this.f46818b);
            sb6.append(" filter=");
            sb6.append(this.f46817a);
            if (this.f46820d) {
                sb6.append(" DEAD");
            }
            sb6.append("}");
            return sb6.toString();
        }
    }

    private c(android.content.Context context) {
        this.f46809a = context;
        this.f46813e = new android.os.Handler(context.getMainLooper()) { // from class: com.tencent.liteav.videobase.utils.c.1
            @Override // android.os.Handler
            public final void handleMessage(android.os.Message message) {
                int size;
                com.tencent.liteav.videobase.utils.c.a[] aVarArr;
                if (message.what != 1) {
                    super.handleMessage(message);
                    return;
                }
                com.tencent.liteav.videobase.utils.c cVar = com.tencent.liteav.videobase.utils.c.this;
                while (true) {
                    synchronized (cVar.f46810b) {
                        size = cVar.f46811c.size();
                        if (size <= 0) {
                            return;
                        }
                        aVarArr = new com.tencent.liteav.videobase.utils.c.a[size];
                        cVar.f46811c.toArray(aVarArr);
                        cVar.f46811c.clear();
                    }
                    for (int i17 = 0; i17 < size; i17++) {
                        com.tencent.liteav.videobase.utils.c.a aVar = aVarArr[i17];
                        int size2 = aVar.f46816b.size();
                        for (int i18 = 0; i18 < size2; i18++) {
                            com.tencent.liteav.videobase.utils.c.b bVar = aVar.f46816b.get(i18);
                            if (!bVar.f46820d) {
                                bVar.f46818b.onReceive(cVar.f46809a, aVar.f46815a);
                            }
                        }
                    }
                }
            }
        };
    }

    public static com.tencent.liteav.videobase.utils.c a() {
        com.tencent.liteav.videobase.utils.c cVar;
        synchronized (f46807f) {
            if (f46808g == null) {
                f46808g = new com.tencent.liteav.videobase.utils.c(com.tencent.liteav.base.ContextUtils.getApplicationContext());
            }
            cVar = f46808g;
        }
        return cVar;
    }

    public final boolean a(android.content.Intent intent) {
        int i17;
        java.lang.String str;
        java.util.ArrayList arrayList;
        java.util.ArrayList<com.tencent.liteav.videobase.utils.c.b> arrayList2;
        java.lang.String str2;
        synchronized (this.f46810b) {
            java.lang.String action = intent.getAction();
            java.lang.String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f46809a.getContentResolver());
            android.net.Uri data = intent.getData();
            java.lang.String scheme = intent.getScheme();
            java.util.Set<java.lang.String> categories = intent.getCategories();
            boolean z17 = (intent.getFlags() & 8) != 0;
            if (z17) {
                com.tencent.liteav.base.util.LiteavLog.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
            }
            java.util.ArrayList<com.tencent.liteav.videobase.utils.c.b> arrayList3 = this.f46812d.get(intent.getAction());
            if (arrayList3 != null) {
                if (z17) {
                    com.tencent.liteav.base.util.LiteavLog.v("LocalBroadcastManager", "Action list: ".concat(java.lang.String.valueOf(arrayList3)));
                }
                java.util.ArrayList arrayList4 = null;
                int i18 = 0;
                while (i18 < arrayList3.size()) {
                    com.tencent.liteav.videobase.utils.c.b bVar = arrayList3.get(i18);
                    if (z17) {
                        com.tencent.liteav.base.util.LiteavLog.v("LocalBroadcastManager", "Matching against filter " + bVar.f46817a);
                    }
                    if (bVar.f46819c) {
                        if (z17) {
                            com.tencent.liteav.base.util.LiteavLog.v("LocalBroadcastManager", "  Filter's target already added");
                        }
                        i17 = i18;
                        arrayList2 = arrayList3;
                        str = action;
                        str2 = resolveTypeIfNeeded;
                        arrayList = arrayList4;
                    } else {
                        i17 = i18;
                        str = action;
                        arrayList = arrayList4;
                        arrayList2 = arrayList3;
                        str2 = resolveTypeIfNeeded;
                        int match = bVar.f46817a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (match >= 0) {
                            if (z17) {
                                com.tencent.liteav.base.util.LiteavLog.v("LocalBroadcastManager", "  Filter matched!  match=0x" + java.lang.Integer.toHexString(match));
                            }
                            arrayList4 = arrayList == null ? new java.util.ArrayList() : arrayList;
                            arrayList4.add(bVar);
                            bVar.f46819c = true;
                            i18 = i17 + 1;
                            action = str;
                            arrayList3 = arrayList2;
                            resolveTypeIfNeeded = str2;
                        } else if (z17) {
                            com.tencent.liteav.base.util.LiteavLog.v("LocalBroadcastManager", "  Filter did not match: ".concat(match != -4 ? match != -3 ? match != -2 ? match != -1 ? "unknown reason" : "type" : com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA : "action" : "category"));
                        }
                    }
                    arrayList4 = arrayList;
                    i18 = i17 + 1;
                    action = str;
                    arrayList3 = arrayList2;
                    resolveTypeIfNeeded = str2;
                }
                java.util.ArrayList arrayList5 = arrayList4;
                if (arrayList5 != null) {
                    for (int i19 = 0; i19 < arrayList5.size(); i19++) {
                        ((com.tencent.liteav.videobase.utils.c.b) arrayList5.get(i19)).f46819c = false;
                    }
                    this.f46811c.add(new com.tencent.liteav.videobase.utils.c.a(intent, arrayList5));
                    if (!this.f46813e.hasMessages(1)) {
                        this.f46813e.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }
}
