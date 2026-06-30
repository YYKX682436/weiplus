package ku3;

/* loaded from: classes3.dex */
public final class j3 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.y3 f393817d;

    public j3(ku3.y3 y3Var) {
        this.f393817d = y3Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        if (((zt3.d) obj).f557126b != 0) {
            ku3.y3 y3Var = this.f393817d;
            if (y3Var.c().getVisibility() == 0) {
                y3Var.c().animate().alpha(0.0f).withEndAction(new ku3.i3(y3Var)).start();
            }
        }
    }
}
