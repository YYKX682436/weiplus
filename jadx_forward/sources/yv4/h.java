package yv4;

/* loaded from: classes4.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f547757d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yv4.k f547758e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(boolean z17, yv4.k kVar) {
        super(0);
        this.f547757d = z17;
        this.f547758e = kVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17 = this.f547757d;
        yv4.k kVar = this.f547758e;
        if (z17) {
            ((android.widget.FrameLayout) ((jz5.n) kVar.f547763f).mo141623x754a37bb()).setAlpha(1.0f);
        } else {
            ((android.widget.FrameLayout) ((jz5.n) kVar.f547763f).mo141623x754a37bb()).animate().alpha(1.0f).setDuration(200L).start();
        }
        return jz5.f0.f384359a;
    }
}
