package pv3;

/* loaded from: classes4.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pv3.m f440129d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(pv3.m mVar) {
        super(0);
        this.f440129d = mVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h0 h0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.j0.f257165a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i0 scene = this.f440129d.f440147a;
        h0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        java.lang.String str = (java.lang.String) com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h0.f257127b.get(scene);
        if (str == null) {
            str = "";
        }
        if (str.length() > 0) {
            return new nv3.l("FeedLoading", str);
        }
        return null;
    }
}
