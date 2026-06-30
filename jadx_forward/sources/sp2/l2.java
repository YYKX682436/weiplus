package sp2;

/* loaded from: classes2.dex */
public final class l2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f492613d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var) {
        super(1);
        this.f492613d = f0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.List<so2.j5> it = (java.util.List) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        if (!it.isEmpty()) {
            for (so2.j5 j5Var : it) {
                if (j5Var instanceof vp2.d0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.y2.f203576n.a((wp2.b) j5Var, true);
                } else if (j5Var instanceof vp2.j0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.x4.f203563n.a((vp2.j0) j5Var, true);
                }
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f492613d;
            int size = f0Var.f391649d - it.size();
            if (size < 0) {
                size = 0;
            }
            f0Var.f391649d = size;
        }
        return jz5.f0.f384359a;
    }
}
