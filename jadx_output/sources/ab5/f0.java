package ab5;

/* loaded from: classes9.dex */
public class f0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ab5.i0 f2930d;

    public f0(ab5.i0 i0Var) {
        this.f2930d = i0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        db5.d5 d5Var = this.f2930d.f2953f;
        if (d5Var == null) {
            return false;
        }
        d5Var.dismiss();
        return false;
    }
}
