package ou1;

/* loaded from: classes5.dex */
public final class b extends s35.b {

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f430449m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f430450n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5978x27be076f> abstractC20980x9b9ad01d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5978x27be076f>(a0Var) { // from class: com.tencent.mm.plugin.cast.banner.ScreenCastBanner$_initialize$1
            {
                this.f39173x3fe91575 = 949107551;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5978x27be076f c5978x27be076f) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5978x27be076f event = c5978x27be076f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                boolean z17 = event.f136275g.f88239a;
                ou1.b bVar = ou1.b.this;
                if (z17) {
                    bVar.f();
                    bVar.k(0);
                } else {
                    bVar.k(8);
                }
                return false;
            }
        };
        this.f430450n = abstractC20980x9b9ad01d;
        abstractC20980x9b9ad01d.mo48813x58998cd();
    }

    @Override // s35.b
    public void a() {
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.f430450n;
        if (abstractC20980x9b9ad01d != null) {
            abstractC20980x9b9ad01d.mo48814x2efc64();
        }
    }

    @Override // s35.b
    public int b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569909rn;
    }

    @Override // s35.b
    public int c() {
        return 5;
    }

    @Override // s35.b
    public void h(android.view.View view) {
        if (view != null) {
            this.f430449m = view.findViewById(com.p314xaae8f345.mm.R.id.bd8);
            view.setOnClickListener(ou1.a.f430448d);
        }
        k(8);
    }

    @Override // s35.b
    public void k(int i17) {
        super.k(i17);
        if (!this.f484377i) {
            if (i17 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScreenCastBanner", "isViewInitialized() should not be false!");
                return;
            }
            return;
        }
        android.view.View findViewById = this.f484376h.findViewById(com.p314xaae8f345.mm.R.id.bd8);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/cast/banner/ScreenCastBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/cast/banner/ScreenCastBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
