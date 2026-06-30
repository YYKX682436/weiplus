package yr2;

/* loaded from: classes2.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yr2.o f546243d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(yr2.o oVar) {
        super(1);
        this.f546243d = oVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.it2 response = (r45.it2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        if (response.m75939xb282bd08(2) > 0) {
            yr2.o.f546245c = response.m75939xb282bd08(2) * 1000;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PreloadGlobalInfoCGIFetcher", "onSceneEnd min_refresh_interval:" + response.m75939xb282bd08(2));
        yr2.a.f546192a.b((r45.sq2) response.m75936x14adae67(1), new java.util.LinkedList(), nd1.p1.f72967x366c91de);
        this.f546243d.f546247b.set(false);
        return jz5.f0.f384359a;
    }
}
