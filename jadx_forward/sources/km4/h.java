package km4;

/* loaded from: classes11.dex */
public final class h implements l81.v0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f390817a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f390818b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f390819c;

    public h(yz5.l lVar, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f390817a = lVar;
        this.f390818b = c0Var;
        this.f390819c = h0Var;
    }

    @Override // l81.v0
    public void a(int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingAdHelper", "prerender WeApp fail, errCode:" + i17 + ", errMsg:" + str);
        km4.l.c(this.f390817a, this.f390818b, this.f390819c, com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.EnumC24972xf15f2364.f44771x3ffc7f3);
        km4.l.f390829a.a(12, null);
    }

    @Override // l81.v0
    /* renamed from: onSuccess */
    public void mo50385xe05b4124() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingAdHelper", "prerender WeApp success!");
    }
}
