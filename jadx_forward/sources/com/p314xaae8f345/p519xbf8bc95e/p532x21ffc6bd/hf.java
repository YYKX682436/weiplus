package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class hf extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hh {

    /* renamed from: a, reason: collision with root package name */
    private static final java.lang.String f131273a = "PromoteImageRecord";

    /* renamed from: b, reason: collision with root package name */
    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "promote_images")
    private java.util.List<com.tencent.mapsdk.internal.hf.a> f131274b;

    /* loaded from: classes13.dex */
    public static class a extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hh {

        /* renamed from: a, reason: collision with root package name */
        @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "image_id")
        java.lang.String f131275a;

        /* renamed from: b, reason: collision with root package name */
        @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "showCount")
        int f131276b;

        public a() {
        }

        public static /* synthetic */ int a(com.tencent.mapsdk.internal.hf.a aVar) {
            int i17 = aVar.f131276b;
            aVar.f131276b = i17 + 1;
            return i17;
        }

        public a(long j17) {
            super(j17);
        }
    }

    public hf() {
    }

    public final void a(java.lang.String str) {
        boolean z17;
        if (this.f131274b == null) {
            this.f131274b = new java.util.ArrayList();
        }
        java.util.Iterator<com.tencent.mapsdk.internal.hf.a> it = this.f131274b.iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            }
            com.tencent.mapsdk.internal.hf.a next = it.next();
            if (next.f131275a.equals(str)) {
                com.tencent.mapsdk.internal.hf.a.a(next);
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(f131273a, "statisticData promoteRecord[" + str + "]... showInc:" + next.f131276b);
                z17 = true;
                break;
            }
        }
        if (z17) {
            return;
        }
        com.tencent.mapsdk.internal.hf.a aVar = new com.tencent.mapsdk.internal.hf.a(java.lang.System.currentTimeMillis());
        aVar.f131275a = str;
        com.tencent.mapsdk.internal.hf.a.a(aVar);
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(f131273a, "statisticData promoteRecord[" + str + "]... showInc:" + aVar.f131276b);
        this.f131274b.add(aVar);
    }

    public hf(long j17) {
        super(j17);
    }
}
