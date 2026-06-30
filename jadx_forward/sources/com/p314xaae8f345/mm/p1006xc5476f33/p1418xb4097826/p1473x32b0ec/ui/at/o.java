package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ui.at;

/* loaded from: classes.dex */
public class o extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.l {
    public final jz5.g B;
    public final jz5.g C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(android.content.Context context, java.lang.Boolean bool, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.a callback) {
        super(context, bool, callback);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.B = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ui.at.m.f196949d);
        this.C = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ui.at.n(this));
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6205xeec13785 c6205xeec13785 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6205xeec13785();
        c6205xeec13785.f136457g.f87952a = 0L;
        c6205xeec13785.e();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.l
    public in5.s K() {
        return new in5.s() { // from class: com.tencent.mm.plugin.finder.live.ui.at.FinderLiveAtSomeoneDialog$buildItemConvertFactory$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                return type != 2 ? type != 4 ? new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ui.at.q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ui.at.o.this.f210420r) : new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ui.at.p(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ui.at.o.this.f210420r) : new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ui.at.t(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ui.at.o.this.f210420r);
            }
        };
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.l
    public java.lang.String L(com.p314xaae8f345.mm.p2621x8fb0427b.z3 ct6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ct6, "ct");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(ct6.d1(), "notify@all")) {
            java.lang.String string = getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573005d63);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            return string;
        }
        java.lang.String f27 = ct6.f2();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f27);
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
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ui.at.C14286x273d7d5a) ((jz5.n) this.C).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.l
    public int P() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.anv;
    }
}
