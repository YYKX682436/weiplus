package fm3;

/* loaded from: classes10.dex */
public final class m implements fm3.n {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 f345626a;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 mediaItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaItem, "mediaItem");
        this.f345626a = mediaItem;
    }

    @Override // fm3.n
    public void a(android.widget.ImageView thumbView, f60.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbView, "thumbView");
        e60.b1 b1Var = (e60.b1) i95.n0.c(e60.b1.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = this.f345626a;
        int mo63659xfb85f7b0 = abstractC15633xee433078.mo63659xfb85f7b0();
        java.lang.String o17 = abstractC15633xee433078.o();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getThumbPath(...)");
        java.lang.String str = abstractC15633xee433078.f219963e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getOriginalPath(...)");
        ((o23.i) b1Var).wi(thumbView, mo63659xfb85f7b0, o17, str, abstractC15633xee433078.f219967i, -1, aVar, abstractC15633xee433078.f219968m);
    }
}
