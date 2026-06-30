package qq0;

/* loaded from: classes7.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qq0.u f447441d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(qq0.u uVar) {
        super(0);
        this.f447441d = uVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        qq0.u uVar = this.f447441d;
        if (uVar.f447453i && !uVar.f447452h) {
            if (uVar.f447455k == null) {
                uVar.f447455k = new qq0.p(uVar);
            }
            android.widget.ImageView imageView = uVar.f447449e;
            imageView.removeCallbacks(uVar.f447455k);
            imageView.postDelayed(uVar.f447455k, 300L);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclViewCoverLogic", "CoverLogic, surface update after scl remove cover");
        }
        return jz5.f0.f384359a;
    }
}
