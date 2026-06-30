package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes3.dex */
public final class ih extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f188563d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f188564e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f188565f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zy2.i5 f188566g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ih(java.lang.String str, java.lang.String str2, java.lang.String str3, zy2.i5 i5Var) {
        super(2);
        this.f188563d = str;
        this.f188564e = str2;
        this.f188565f = str3;
        this.f188566g = i5Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str;
        r45.j32 j32Var = (r45.j32) obj2;
        if (!((java.lang.Boolean) obj).booleanValue() || j32Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveForMiniAppLauncher", "request full list failed");
            this.f188566g.a(0);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveForMiniAppLauncher", "show more list with CGI data: username=" + this.f188563d + ", count=" + j32Var.m75941xfb821914(0).size() + ", totalNotice=" + j32Var.m75939xb282bd08(2) + ", totalReserve=" + j32Var.m75939xb282bd08(3));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.jh jhVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.jh.f188634a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4 s4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.jh.f188636c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(s4Var);
            s4Var.g(j32Var, "", false, "", -1, 0, null);
            ml2.i5 i5Var = ml2.i5.f409103e;
            java.lang.String str2 = this.f188563d;
            java.lang.String str3 = this.f188564e;
            java.util.LinkedList m75941xfb821914 = j32Var.m75941xfb821914(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getNotice_info(...)");
            r45.h32 h32Var = (r45.h32) kz5.n0.Z(m75941xfb821914);
            if (h32Var == null || (str = h32Var.m75945x2fec8307(4)) == null) {
                str = "";
            }
            jhVar.d(i5Var, str2, 0L, 0, str3, str, this.f188565f);
        }
        return jz5.f0.f384359a;
    }
}
