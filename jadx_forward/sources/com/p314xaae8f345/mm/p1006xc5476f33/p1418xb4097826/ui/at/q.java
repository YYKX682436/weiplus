package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at;

/* loaded from: classes.dex */
public final class q extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.l {
    public final jz5.g B;
    public final jz5.g C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(android.content.Context context, java.lang.Boolean bool, com.p314xaae8f345.mm.p2621x8fb0427b.u3 recentAtStorageKey, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.a callback) {
        super(context, bool, callback);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recentAtStorageKey, "recentAtStorageKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.B = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.o(recentAtStorageKey));
        this.C = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.p(this));
    }

    @Override // hg5.d
    public int E() {
        android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        int i17 = b17.x;
        int i18 = b17.y;
        java.lang.System.nanoTime();
        boolean z17 = com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (!z17) {
            if (i18 >= i17) {
                i17 = i18;
            }
            i18 = i17;
        }
        return (int) ((i18 * 0.25d) - com.p314xaae8f345.mm.ui.bl.h(getContext()));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.l, hg5.d
    public void G() {
        z().f(1);
        super.G();
        android.view.Window window = getWindow();
        if (window != null) {
            window.setWindowAnimations(com.p314xaae8f345.mm.R.C30868x68b1db1.f576037ot);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.l
    public in5.s K() {
        return new in5.s() { // from class: com.tencent.mm.plugin.finder.ui.at.FinderAtSomeoneDialog$buildItemConvertFactory$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                return type != 2 ? type != 4 ? new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.s(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.q.this.f210420r) : new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.r(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.q.this.f210420r) : new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.w(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.q.this.f210420r);
            }
        };
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.l
    public java.lang.String L(com.p314xaae8f345.mm.p2621x8fb0427b.z3 ct6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ct6, "ct");
        java.lang.String f27 = ct6.f2();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f27, "getDisplayNick(...)");
        return f27;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.l
    public void M() {
        android.view.View findViewById;
        super.M();
        android.view.View view = this.f362936i;
        if (view == null || (findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.mdb)) == null) {
            return;
        }
        findViewById.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563069vv);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.l
    public ym3.a N() {
        return (ym3.a) ((jz5.n) this.B).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.l
    public ym3.b O() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.C15103x3451e9e6) ((jz5.n) this.C).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.l
    public int P() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ae6;
    }
}
