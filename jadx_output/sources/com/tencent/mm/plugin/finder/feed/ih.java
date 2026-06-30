package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes3.dex */
public final class ih extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f107030d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f107031e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f107032f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zy2.i5 f107033g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ih(java.lang.String str, java.lang.String str2, java.lang.String str3, zy2.i5 i5Var) {
        super(2);
        this.f107030d = str;
        this.f107031e = str2;
        this.f107032f = str3;
        this.f107033g = i5Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str;
        r45.j32 j32Var = (r45.j32) obj2;
        if (!((java.lang.Boolean) obj).booleanValue() || j32Var == null) {
            com.tencent.mars.xlog.Log.e("FinderLiveForMiniAppLauncher", "request full list failed");
            this.f107033g.a(0);
        } else {
            com.tencent.mars.xlog.Log.i("FinderLiveForMiniAppLauncher", "show more list with CGI data: username=" + this.f107030d + ", count=" + j32Var.getList(0).size() + ", totalNotice=" + j32Var.getInteger(2) + ", totalReserve=" + j32Var.getInteger(3));
            com.tencent.mm.plugin.finder.feed.jh jhVar = com.tencent.mm.plugin.finder.feed.jh.f107101a;
            com.tencent.mm.plugin.finder.profile.widget.s4 s4Var = com.tencent.mm.plugin.finder.feed.jh.f107103c;
            kotlin.jvm.internal.o.d(s4Var);
            s4Var.g(j32Var, "", false, "", -1, 0, null);
            ml2.i5 i5Var = ml2.i5.f327570e;
            java.lang.String str2 = this.f107030d;
            java.lang.String str3 = this.f107031e;
            java.util.LinkedList list = j32Var.getList(0);
            kotlin.jvm.internal.o.f(list, "getNotice_info(...)");
            r45.h32 h32Var = (r45.h32) kz5.n0.Z(list);
            if (h32Var == null || (str = h32Var.getString(4)) == null) {
                str = "";
            }
            jhVar.d(i5Var, str2, 0L, 0, str3, str, this.f107032f);
        }
        return jz5.f0.f302826a;
    }
}
