package rk4;

/* loaded from: classes11.dex */
public final class r8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rk4.z8 f478490d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.fr0 f478491e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ il4.e f478492f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8(rk4.z8 z8Var, bw5.fr0 fr0Var, il4.e eVar) {
        super(0);
        this.f478490d = z8Var;
        this.f478491e = fr0Var;
        this.f478492f = eVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        jm4.n5 n5Var = (jm4.n5) ((jz5.n) this.f478490d.f478672m).mo141623x754a37bb();
        jm4.d3 d3Var = n5Var != null ? (jm4.d3) p3380x6a61f93.p3381xf512d0a5.C30490x21b8a710.m169318x21b8f7dd(((jm4.p5) n5Var).m105978x2737f10()) : null;
        zk4.l lVar = zk4.l.f555071a;
        jm4.g3 b17 = lVar.b();
        if (d3Var != null && b17 != null) {
            bw5.mp0 mp0Var = new bw5.mp0();
            mp0Var.f111873f = this.f478492f.f373639c;
            mp0Var.K[3] = true;
            bw5.fr0 snapshot = this.f478491e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snapshot, "snapshot");
            byte[] mo14344x5f01b1f6 = snapshot.mo14344x5f01b1f6();
            byte[] mo14344x5f01b1f62 = mp0Var.mo14344x5f01b1f6();
            long m105978x2737f10 = ((jm4.e3) d3Var).m105978x2737f10();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo14344x5f01b1f6);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo14344x5f01b1f62);
            p3380x6a61f93.p3381xf512d0a5.C30486x21b88ac2.m169285x21b05892(m105978x2737f10, mo14344x5f01b1f6, mo14344x5f01b1f62);
            lVar.c(b17);
        }
        return jz5.f0.f384359a;
    }
}
