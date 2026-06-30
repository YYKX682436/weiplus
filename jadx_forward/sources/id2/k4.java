package id2;

/* loaded from: classes8.dex */
public final class k4 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f372180d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f372181e;

    public k4(int i17, yz5.l lVar) {
        this.f372180d = i17;
        this.f372181e = lVar;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        bw5.br req = (bw5.br) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        int i17 = req.f107330d;
        int i18 = this.f372180d;
        yz5.l lVar = this.f372181e;
        if (i17 == i18) {
            lVar.mo146xb9724478(java.lang.Boolean.TRUE);
        } else {
            lVar.mo146xb9724478(java.lang.Boolean.FALSE);
        }
    }
}
