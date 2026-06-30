package qn2;

/* loaded from: classes3.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.f f446609d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qn2.n f446610e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.p314xaae8f345.mm.p944x882e457a.f fVar, qn2.n nVar) {
        super(0);
        this.f446609d = fVar;
        this.f446610e = nVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String string;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = this.f446609d;
        int i17 = fVar.f152148a;
        qn2.n nVar = this.f446610e;
        if (i17 == 0 && fVar.f152149b == 0) {
            if (((r45.cz1) ((r45.go1) fVar.f152151d).m75936x14adae67(1)) == null) {
                pm0.v.X(new on2.l2((on2.z2) nVar.P0(on2.z2.class)));
            } else {
                ((on2.z2) nVar.P0(on2.z2.class)).g7((r45.cz1) ((r45.go1) fVar.f152151d).m75936x14adae67(1));
            }
            qo0.c.a(nVar.A, qo0.b.f446911l3, null, 2, null);
            string = nVar.f446856d.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.doy);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            if (nVar.A.mo11219xd0598cf8() == 1) {
                ((ml2.j0) i95.n0.c(ml2.j0.class)).Fj(ml2.j1.f409136s, "");
            }
        } else {
            string = nVar.f446856d.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dox);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        }
        db5.t7.m123883x26a183b(nVar.f446856d.getContext(), string, 0).show();
        return jz5.f0.f384359a;
    }
}
