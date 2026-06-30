package com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c;

/* loaded from: classes5.dex */
public class q0 extends s35.b {

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f289097m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f289098n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f289099o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f289100p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f289101q;

    public q0(android.content.Context context) {
        super(context);
        this.f289099o = null;
        this.f289100p = false;
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5648xf65557cf> abstractC20980x9b9ad01d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5648xf65557cf>(a0Var) { // from class: com.tencent.mm.ui.conversation.banner.TryNewInitBanner$1
            {
                this.f39173x3fe91575 = -1671484961;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5648xf65557cf c5648xf65557cf) {
                boolean z17 = c5648xf65557cf.f135974g.f89245a;
                com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.q0 q0Var = com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.q0.this;
                if (z17) {
                    q0Var.f289100p = false;
                    q0Var.i();
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TryNewInitBanner", "summerinit onSceneEnd -1 show tryNewInitBanner[%s]", q0Var);
                    q0Var.f289100p = true;
                    q0Var.i();
                }
                return false;
            }
        };
        this.f289101q = abstractC20980x9b9ad01d;
        abstractC20980x9b9ad01d.mo48813x58998cd();
    }

    @Override // s35.b
    public void a() {
        this.f289101q.mo48814x2efc64();
    }

    @Override // s35.b
    public int b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d2e;
    }

    @Override // s35.b
    public void h(android.view.View view) {
        if (view != null) {
            this.f289099o = view.findViewById(com.p314xaae8f345.mm.R.id.ody);
            this.f289097m = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.odw);
            this.f289098n = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.odx);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    @Override // s35.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean i() {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.q0.i():boolean");
    }

    @Override // s35.b
    public void k(int i17) {
        if (!this.f484377i) {
            if (i17 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TryNewInitBanner", "isViewInitialized() should not be false!");
                return;
            }
            return;
        }
        android.view.View view = this.f289099o;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/conversation/banner/TryNewInitBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/conversation/banner/TryNewInitBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
