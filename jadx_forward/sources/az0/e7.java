package az0;

/* loaded from: classes5.dex */
public final class e7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f96968d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f96969e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p470x35bb6d35.c f96970f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ az0.n7 f96971g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f96972h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnComplete f96973i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7(java.util.List list, boolean z17, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.c cVar, az0.n7 n7Var, java.lang.String str, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnComplete onComplete) {
        super(2);
        this.f96968d = list;
        this.f96969e = z17;
        this.f96970f = cVar;
        this.f96971g = n7Var;
        this.f96972h = str;
        this.f96973i = onComplete;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnTaskProgress onProgress = (com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnTaskProgress) obj;
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnComplete onComplete = (com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnComplete) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onProgress, "onProgress");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onComplete, "onComplete");
        java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078> list = this.f96968d;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 : list) {
            arrayList.add(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.p472x58ceaf0.C4094x2bd762a1(qg.a.Filepath, abstractC15633xee433078.f219963e, abstractC15633xee433078.mo63659xfb85f7b0() == 1 ? qg.c.Image : qg.c.Video));
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startMovieCreationWithBlankTemplate recommend: ");
        sb6.append(this.f96969e);
        sb6.append(", mode:");
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.c cVar = this.f96970f;
        sb6.append(cVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasMovieSessionManager", sb6.toString());
        az0.n7 n7Var = this.f96971g;
        return n7Var.f97275a.m33453xdd3b6f97(arrayList, this.f96972h, n7Var.f97277c, new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4083x57f375ff(cVar, n7Var.f97276b.f326388a), onProgress, onComplete, this.f96973i);
    }
}
