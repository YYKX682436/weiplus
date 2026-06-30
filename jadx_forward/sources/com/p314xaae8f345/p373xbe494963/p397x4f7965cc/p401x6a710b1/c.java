package com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1;

/* loaded from: classes13.dex */
public final class c {

    /* renamed from: f, reason: collision with root package name */
    private static final java.lang.Object f128340f = new java.lang.Object();

    /* renamed from: g, reason: collision with root package name */
    private static com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.c f128341g;

    /* renamed from: a, reason: collision with root package name */
    final android.content.Context f128342a;

    /* renamed from: e, reason: collision with root package name */
    private final android.os.Handler f128346e;

    /* renamed from: b, reason: collision with root package name */
    final java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<com.tencent.liteav.videobase.utils.c.b>> f128343b = new java.util.HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final java.util.HashMap<java.lang.String, java.util.ArrayList<com.tencent.liteav.videobase.utils.c.b>> f128345d = new java.util.HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    final java.util.ArrayList<com.tencent.liteav.videobase.utils.c.a> f128344c = new java.util.ArrayList<>();

    /* loaded from: classes13.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        final android.content.Intent f128348a;

        /* renamed from: b, reason: collision with root package name */
        final java.util.ArrayList<com.tencent.liteav.videobase.utils.c.b> f128349b;

        public a(android.content.Intent intent, java.util.ArrayList<com.tencent.liteav.videobase.utils.c.b> arrayList) {
            this.f128348a = intent;
            this.f128349b = arrayList;
        }
    }

    /* loaded from: classes13.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        final android.content.IntentFilter f128350a;

        /* renamed from: b, reason: collision with root package name */
        final android.content.BroadcastReceiver f128351b;

        /* renamed from: c, reason: collision with root package name */
        boolean f128352c;

        /* renamed from: d, reason: collision with root package name */
        boolean f128353d;

        /* renamed from: toString */
        public final java.lang.String m31209x9616526c() {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(128);
            sb6.append("Receiver{");
            sb6.append(this.f128351b);
            sb6.append(" filter=");
            sb6.append(this.f128350a);
            if (this.f128353d) {
                sb6.append(" DEAD");
            }
            sb6.append("}");
            return sb6.toString();
        }
    }

    private c(android.content.Context context) {
        this.f128342a = context;
        this.f128346e = new android.os.Handler(context.getMainLooper()) { // from class: com.tencent.liteav.videobase.utils.c.1
            @Override // android.os.Handler
            public final void handleMessage(android.os.Message message) {
                int size;
                com.tencent.liteav.videobase.utils.c.a[] aVarArr;
                if (message.what != 1) {
                    super.handleMessage(message);
                    return;
                }
                com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.c cVar = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.c.this;
                while (true) {
                    synchronized (cVar.f128343b) {
                        size = cVar.f128344c.size();
                        if (size <= 0) {
                            return;
                        }
                        aVarArr = new com.tencent.liteav.videobase.utils.c.a[size];
                        cVar.f128344c.toArray(aVarArr);
                        cVar.f128344c.clear();
                    }
                    for (int i17 = 0; i17 < size; i17++) {
                        com.tencent.liteav.videobase.utils.c.a aVar = aVarArr[i17];
                        int size2 = aVar.f128349b.size();
                        for (int i18 = 0; i18 < size2; i18++) {
                            com.tencent.liteav.videobase.utils.c.b bVar = aVar.f128349b.get(i18);
                            if (!bVar.f128353d) {
                                bVar.f128351b.onReceive(cVar.f128342a, aVar.f128348a);
                            }
                        }
                    }
                }
            }
        };
    }

    public static com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.c a() {
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.c cVar;
        synchronized (f128340f) {
            if (f128341g == null) {
                f128341g = new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.c(com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29240x6e669035());
            }
            cVar = f128341g;
        }
        return cVar;
    }

    public final boolean a(android.content.Intent intent) {
        int i17;
        java.lang.String str;
        java.util.ArrayList arrayList;
        java.util.ArrayList<com.tencent.liteav.videobase.utils.c.b> arrayList2;
        java.lang.String str2;
        synchronized (this.f128343b) {
            java.lang.String action = intent.getAction();
            java.lang.String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f128342a.getContentResolver());
            android.net.Uri data = intent.getData();
            java.lang.String scheme = intent.getScheme();
            java.util.Set<java.lang.String> categories = intent.getCategories();
            boolean z17 = (intent.getFlags() & 8) != 0;
            if (z17) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
            }
            java.util.ArrayList<com.tencent.liteav.videobase.utils.c.b> arrayList3 = this.f128345d.get(intent.getAction());
            if (arrayList3 != null) {
                if (z17) {
                    com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.v("LocalBroadcastManager", "Action list: ".concat(java.lang.String.valueOf(arrayList3)));
                }
                java.util.ArrayList arrayList4 = null;
                int i18 = 0;
                while (i18 < arrayList3.size()) {
                    com.tencent.liteav.videobase.utils.c.b bVar = arrayList3.get(i18);
                    if (z17) {
                        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.v("LocalBroadcastManager", "Matching against filter " + bVar.f128350a);
                    }
                    if (bVar.f128352c) {
                        if (z17) {
                            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.v("LocalBroadcastManager", "  Filter's target already added");
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
                        int match = bVar.f128350a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (match >= 0) {
                            if (z17) {
                                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.v("LocalBroadcastManager", "  Filter matched!  match=0x" + java.lang.Integer.toHexString(match));
                            }
                            arrayList4 = arrayList == null ? new java.util.ArrayList() : arrayList;
                            arrayList4.add(bVar);
                            bVar.f128352c = true;
                            i18 = i17 + 1;
                            action = str;
                            arrayList3 = arrayList2;
                            resolveTypeIfNeeded = str2;
                        } else if (z17) {
                            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.v("LocalBroadcastManager", "  Filter did not match: ".concat(match != -4 ? match != -3 ? match != -2 ? match != -1 ? "unknown reason" : "type" : com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306 : "action" : "category"));
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
                        ((com.tencent.liteav.videobase.utils.c.b) arrayList5.get(i19)).f128352c = false;
                    }
                    this.f128344c.add(new com.tencent.liteav.videobase.utils.c.a(intent, arrayList5));
                    if (!this.f128346e.hasMessages(1)) {
                        this.f128346e.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }
}
