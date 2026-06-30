package bs2;

/* loaded from: classes2.dex */
public final class p0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bs2.n1 f105464d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2495xc50a8b8b.g f105465e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f105466f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f105467g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f105468h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(bs2.n1 n1Var, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, r45.qt2 qt2Var, java.util.LinkedList linkedList, boolean z17) {
        super(0);
        this.f105464d = n1Var;
        this.f105465e = gVar;
        this.f105466f = qt2Var;
        this.f105467g = linkedList;
        this.f105468h = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        bs2.n1 n1Var = this.f105464d;
        db2.n3 n3Var = new db2.n3(n1Var.f105440a, 0, this.f105465e, this.f105466f, this.f105467g, true, false, false, 0, false, null, null, null, 8128, null);
        n3Var.f309625t = new bs2.n0(this.f105468h, n1Var);
        n3Var.f309624s = new bs2.o0(n1Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r1 e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1.f206926a.e(n1Var.f105440a);
        if (e17 != null) {
            if (!(e17.f206824a && !e17.f206826b)) {
                e17 = null;
            }
            if (e17 != null) {
                e17.f206841i0 = 1;
            }
        }
        return n3Var;
    }
}
