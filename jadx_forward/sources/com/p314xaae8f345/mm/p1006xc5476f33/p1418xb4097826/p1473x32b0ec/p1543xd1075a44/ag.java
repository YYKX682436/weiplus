package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class ag extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f199297d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.gg f199298e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.gg ggVar) {
        super(1);
        this.f199297d = i17;
        this.f199298e = ggVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        yz5.l m58039x8fbfaeb8;
        ((java.lang.Boolean) obj).booleanValue();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showWecoinInfo charge ok:");
        sb6.append(this.f199297d);
        sb6.append(", ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.gg ggVar = this.f199298e;
        sb6.append(ggVar.f199965m);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveFansJoinWidget", sb6.toString());
        if (ggVar.f199965m == null && (m58039x8fbfaeb8 = ggVar.m58039x8fbfaeb8()) != null) {
            m58039x8fbfaeb8.mo146xb9724478(ggVar.f199976x);
        }
        return jz5.f0.f384359a;
    }
}
