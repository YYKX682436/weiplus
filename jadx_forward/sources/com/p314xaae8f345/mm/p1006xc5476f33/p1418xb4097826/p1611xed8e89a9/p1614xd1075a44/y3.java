package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44;

/* loaded from: classes3.dex */
public final class y3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4 f206361d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.m3 f206362e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f206363f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f206364g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.e4 f206365h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4 s4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.m3 m3Var, int i17, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.e4 e4Var) {
        super(2);
        this.f206361d = s4Var;
        this.f206362e = m3Var;
        this.f206363f = i17;
        this.f206364g = z17;
        this.f206365h = e4Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f206363f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.m3 m3Var = this.f206362e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4 s4Var = this.f206361d;
        if (intValue != 0) {
            s4Var.c(m3Var, intValue == 1 ? 1 : 2, i17);
        }
        if (this.f206364g) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("finder_username", s4Var.f206280a);
            java.lang.String m75945x2fec8307 = m3Var.f206157a.m75945x2fec8307(8);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            hashMap.put("activityId", m75945x2fec8307);
            i95.m c17 = i95.n0.c(zy2.zb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.u1 u1Var = ml2.u1.K1;
            r45.qt2 qt2Var = s4Var.f206283d;
            zy2.zb.I8(zbVar, u1Var, hashMap, qt2Var.m75945x2fec8307(1), java.lang.String.valueOf(qt2Var.m75939xb282bd08(5)), null, null, false, 112, null);
            r45.h32 h32Var = m3Var.f206157a;
            java.lang.String m75945x2fec83072 = h32Var.m75945x2fec8307(8);
            java.lang.String str = m75945x2fec83072 == null ? "" : m75945x2fec83072;
            java.lang.String m75945x2fec83073 = h32Var.m75945x2fec8307(4);
            pq5.g l17 = new db2.b2(str, null, null, 0L, 0L, m75945x2fec83073 == null ? "" : m75945x2fec83073, 1, false, 158, null).l();
            android.content.Context context = s4Var.f206281b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            l17.f((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context);
            l17.K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.j4(s4Var));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4.b(s4Var);
        this.f206365h.m8147xed6e4d18(i17);
        return jz5.f0.f384359a;
    }
}
