package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes8.dex */
public final class v8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ut2 f187462d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f187463e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f187464f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.x8 f187465g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v8(r45.ut2 ut2Var, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.x8 x8Var) {
        super(1);
        this.f187462d = ut2Var;
        this.f187463e = c0Var;
        this.f187464f = c0Var2;
        this.f187465g = x8Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb ctrlInfo = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctrlInfo, "ctrlInfo");
        boolean contains = this.f187462d.m75941xfb821914(2).contains(ctrlInfo.f65880x11c19d58);
        if (contains) {
            this.f187464f.f391645d = true;
        } else {
            this.f187463e.f391645d = false;
        }
        if (contains) {
            this.f187465g.f187533a.F(ctrlInfo.f65874xb5f7102a, "revokeRedDotPath#1");
        }
        return java.lang.Boolean.valueOf(contains);
    }
}
