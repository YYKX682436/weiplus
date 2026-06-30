package ku3;

/* loaded from: classes3.dex */
public final class b3 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.e3 f393705d;

    public b3(ku3.e3 e3Var) {
        this.f393705d = e3Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        if (((zt3.d) obj).f557126b != 0) {
            ku3.e3 e3Var = this.f393705d;
            if (e3Var.c().getVisibility() == 0) {
                e3Var.c().animate().alpha(0.0f).withEndAction(new ku3.a3(e3Var)).start();
            }
        }
    }
}
