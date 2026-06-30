package ku3;

/* loaded from: classes3.dex */
public final class j4 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.m4 f393818d;

    public j4(ku3.m4 m4Var) {
        this.f393818d = m4Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        if (((zt3.d) obj).f557126b != 0) {
            ku3.m4 m4Var = this.f393818d;
            if (m4Var.a().getVisibility() == 0) {
                m4Var.a().animate().alpha(0.0f).withEndAction(new ku3.i4(m4Var)).start();
            }
        }
    }
}
