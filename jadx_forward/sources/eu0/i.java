package eu0;

/* loaded from: classes5.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gu0.k2 f338248d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(gu0.k2 k2Var) {
        super(0);
        this.f338248d = k2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        gu0.k2 k2Var = this.f338248d;
        if (k2Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.Session", "onMusicPanelOpen: stop playback");
            k2Var.f357267j = true;
            k2Var.w();
        }
        return jz5.f0.f384359a;
    }
}
