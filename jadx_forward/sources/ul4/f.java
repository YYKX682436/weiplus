package ul4;

/* loaded from: classes11.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ul4.i f510144d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ul4.i iVar) {
        super(0);
        this.f510144d = iVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ul4.i iVar = this.f510144d;
        if (iVar.f510156n) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingAudioFocusController", "TingAudioFocusController " + iVar.f510151f + " onResume failed for too frequent.");
        } else {
            b66.n a17 = iVar.a();
            if (a17 != null && a17.i() == 0) {
                if (a17 != null) {
                    b66.q qVar = (b66.q) a17;
                    p3380x6a61f93.p3382xf513feca.C30534x21b91836.m169693x21b38426(qVar.m105978x2737f10(), qVar.f());
                }
            } else if (a17 != null) {
                bw5.oq0 oq0Var = new bw5.oq0();
                oq0Var.f112742d = true;
                oq0Var.f112743e[1] = true;
                p3380x6a61f93.p3382xf513feca.C30534x21b91836.m169679x21b1889a(((b66.q) a17).m105978x2737f10(), oq0Var.mo14344x5f01b1f6());
            }
        }
        return jz5.f0.f384359a;
    }
}
