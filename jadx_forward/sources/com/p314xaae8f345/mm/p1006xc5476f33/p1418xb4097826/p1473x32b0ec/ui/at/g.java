package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ui.at;

/* loaded from: classes.dex */
public final class g extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ui.at.o {
    public final java.lang.String D;
    public final jz5.g E;
    public final jz5.g F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.lang.String groupId, android.content.Context context, java.lang.Boolean bool, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.a callback) {
        super(context, bool, callback);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(groupId, "groupId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.D = groupId;
        this.E = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ui.at.e(this));
        this.F = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ui.at.f(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ui.at.o, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.l
    public in5.s K() {
        return new in5.s() { // from class: com.tencent.mm.plugin.finder.live.ui.at.FinderLiveAtGroupMemberDialog$buildItemConvertFactory$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                return type != 2 ? type != 4 ? new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ui.at.j(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ui.at.g.this.f210420r) : new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ui.at.p(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ui.at.g.this.f210420r) : new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ui.at.t(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ui.at.g.this.f210420r);
            }
        };
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ui.at.o, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.l
    public java.lang.String L(com.p314xaae8f345.mm.p2621x8fb0427b.z3 ct6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ct6, "ct");
        java.lang.String z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(this.D).z0(ct6.d1());
        if (z07.length() == 0) {
            z07 = ct6.f2();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(z07);
        return z07;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ui.at.o, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.l
    public ym3.a N() {
        return (ym3.a) ((jz5.n) this.E).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ui.at.o, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.l
    public ym3.b O() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ui.at.C14284x86ffdfa7) ((jz5.n) this.F).mo141623x754a37bb();
    }
}
