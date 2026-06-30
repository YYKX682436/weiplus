package cc2;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final cc2.d f40478a = new cc2.d();

    public final java.lang.String a(gk2.e liveData, java.lang.String str, java.lang.String clickId) {
        kotlin.jvm.internal.o.g(liveData, "liveData");
        kotlin.jvm.internal.o.g(clickId, "clickId");
        if (zl2.r4.f473950a.w1()) {
            str = ((mm2.e1) liveData.a(mm2.e1.class)).f328988r.getLong(0) == 0 ? "pre_live_detail" : "post_live_detail";
        } else {
            if (str == null || str.length() == 0) {
                str = "live_list_detail";
            }
        }
        return str + ':' + ((mm2.e1) liveData.a(mm2.e1.class)).f328988r.getLong(0) + ':' + ((mm2.c1) liveData.a(mm2.c1.class)).f328852o + "::" + ((mm2.c1) liveData.a(mm2.c1.class)).f328861p2 + ':' + clickId + ':' + ((mm2.c1) liveData.a(mm2.c1.class)).P3 + ':' + ((mm2.c1) liveData.a(mm2.c1.class)).f328791d3;
    }

    public final void b(gk2.e eVar, java.lang.String str, java.lang.String str2) {
        try {
            if (zl2.r4.f473950a.w1()) {
                p52.c cVar = p52.h.f352016a;
                kotlin.jvm.internal.o.g(str, "<set-?>");
                p52.h.f352029n = str;
            } else {
                p52.c cVar2 = p52.h.f352016a;
                n30.r rVar = (n30.r) i95.n0.c(n30.r.class);
                long j17 = ((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0);
                ((m30.m) rVar).getClass();
                java.lang.String q17 = b52.b.q(j17);
                n30.r rVar2 = (n30.r) i95.n0.c(n30.r.class);
                long j18 = ((mm2.c1) eVar.a(mm2.c1.class)).f328861p2;
                ((m30.m) rVar2).getClass();
                cVar2.g(str, str2, q17, "", b52.b.q(j18));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("EcsShoppingJumpHelper", "setVisitorCommerceParams error", e17);
        }
    }
}
