package az0;

/* loaded from: classes5.dex */
public final class a7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f96858d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az0.n7 f96859e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnRecommendComplete f96860f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a7(java.util.List list, az0.n7 n7Var, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnRecommendComplete onRecommendComplete) {
        super(1);
        this.f96858d = list;
        this.f96859e = n7Var;
        this.f96860f = onRecommendComplete;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnTaskProgress onProgress = (com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnTaskProgress) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onProgress, "onProgress");
        java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078> list = this.f96858d;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 : list) {
            arrayList.add(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.p472x58ceaf0.C4094x2bd762a1(qg.a.Filepath, abstractC15633xee433078.f219963e, abstractC15633xee433078.mo63659xfb85f7b0() == 1 ? qg.c.Image : qg.c.Video));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasMovieSessionManager", "startMovieCreationAutoRecommendTemplate");
        az0.n7 n7Var = this.f96859e;
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4067xeeae5bd2 m33452x89d6f47a = n7Var.f97275a.m33452x89d6f47a(arrayList, n7Var.f97277c, new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4083x57f375ff(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.c.Foreground, n7Var.f97276b.f326388a), az0.n7.a(n7Var), onProgress, this.f96860f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m33452x89d6f47a, "startMovieCreationAutoRecommendTemplate(...)");
        return m33452x89d6f47a;
    }
}
