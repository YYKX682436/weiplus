package bf3;

/* loaded from: classes7.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bf3.z f19668d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f19669e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(bf3.z zVar, boolean z17) {
        super(0);
        this.f19668d = zVar;
        this.f19669e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        bf3.z zVar = this.f19668d;
        boolean z17 = this.f19669e;
        zVar.f19684i = z17;
        if (z17) {
            android.widget.FrameLayout frameLayout = zVar.f19680e;
            if (frameLayout != null) {
                zVar.e(frameLayout);
            }
        } else {
            zVar.b();
        }
        return jz5.f0.f302826a;
    }
}
