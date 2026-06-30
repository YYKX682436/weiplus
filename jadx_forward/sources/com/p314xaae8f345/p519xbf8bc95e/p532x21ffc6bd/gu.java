package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class gu extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hh {

    /* renamed from: a, reason: collision with root package name */
    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "styles")
    private java.util.List<com.tencent.mapsdk.internal.gu.a> f131219a;

    public gu() {
        this.f131219a = new java.util.ArrayList();
    }

    public final int a(int i17) {
        for (com.tencent.mapsdk.internal.gu.a aVar : this.f131219a) {
            if (aVar.f131220a == i17) {
                int i18 = aVar.f131221b + 1;
                aVar.f131221b = i18;
                return i18;
            }
        }
        this.f131219a.add(new com.tencent.mapsdk.internal.gu.a(this.f131299g, i17));
        return 1;
    }

    /* loaded from: classes13.dex */
    public static class a extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hh {

        /* renamed from: a, reason: collision with root package name */
        @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = dm.i4.f66865x76d1ec5a)
        int f131220a;

        /* renamed from: b, reason: collision with root package name */
        @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "showCount")
        int f131221b;

        public a() {
            this.f131220a = 0;
            this.f131221b = 0;
        }

        private static /* synthetic */ int b(com.tencent.mapsdk.internal.gu.a aVar) {
            int i17 = aVar.f131221b + 1;
            aVar.f131221b = i17;
            return i17;
        }

        public a(long j17, int i17) {
            super(j17);
            this.f131220a = i17;
            this.f131221b = 1;
        }
    }

    public gu(long j17) {
        super(j17);
        this.f131219a = new java.util.ArrayList();
    }
}
