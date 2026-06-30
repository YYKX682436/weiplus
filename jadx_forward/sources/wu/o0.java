package wu;

/* loaded from: classes9.dex */
public final class o0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wu.w0 f531139d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(wu.w0 w0Var) {
        super(2);
        this.f531139d = w0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        android.view.View v17 = (android.view.View) obj;
        hu.b item = (hu.b) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        s15.k z17 = item.f366530e.z();
        if (z17 != null) {
            java.lang.String talker = this.f531139d.f531143e.q();
            r45.aw2 aw2Var = new r45.aw2();
            aw2Var.set(0, z17.m163597x93d5ac12());
            aw2Var.set(1, z17.k());
            aw2Var.set(2, z17.m163598x8010e5e4());
            aw2Var.set(3, z17.o());
            aw2Var.set(4, z17.m163596x74292566());
            aw2Var.set(5, z17.m163599xfb83cc9b());
            aw2Var.set(6, z17.j());
            aw2Var.set(7, z17.B());
            aw2Var.set(8, z17.r());
            aw2Var.set(9, z17.s());
            aw2Var.set(10, z17.t());
            wu.n0 n0Var = new wu.n0(v17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
            java.lang.String m75945x2fec8307 = aw2Var.m75945x2fec8307(0);
            if (m75945x2fec8307 != null) {
                if (!(m75945x2fec8307.length() == 0)) {
                    ((ku5.t0) ku5.t0.f394148d).q(new yu.l(talker, m75945x2fec8307, aw2Var, n0Var));
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RecordOtherItemHelper", "share item finderUserName not set");
            n0Var.mo146xb9724478(aw2Var);
        }
        return jz5.f0.f384359a;
    }
}
