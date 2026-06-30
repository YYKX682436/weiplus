package bf3;

/* loaded from: classes7.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bf3.z f101201d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f101202e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(bf3.z zVar, boolean z17) {
        super(0);
        this.f101201d = zVar;
        this.f101202e = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        bf3.z zVar = this.f101201d;
        boolean z17 = this.f101202e;
        zVar.f101217i = z17;
        if (z17) {
            android.widget.FrameLayout frameLayout = zVar.f101213e;
            if (frameLayout != null) {
                zVar.e(frameLayout);
            }
        } else {
            zVar.b();
        }
        return jz5.f0.f384359a;
    }
}
