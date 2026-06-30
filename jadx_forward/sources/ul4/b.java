package ul4;

/* loaded from: classes11.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ul4.i f510139d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ul4.i iVar) {
        super(0);
        this.f510139d = iVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ul4.i iVar = this.f510139d;
        if (iVar.f510156n) {
            b66.n a17 = iVar.a();
            if (a17 != null) {
                bw5.nq0 nq0Var = new bw5.nq0();
                nq0Var.f112320d = true;
                nq0Var.f112321e[1] = true;
                p3380x6a61f93.p3382xf513feca.C30534x21b91836.m169683x21b1d5fb(((b66.q) a17).m105978x2737f10(), nq0Var.mo14344x5f01b1f6());
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingAudioFocusController", "TingAudioFocusController " + iVar.f510151f + " onPause failed for too frequent.");
        }
        return jz5.f0.f384359a;
    }
}
