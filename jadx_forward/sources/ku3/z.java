package ku3;

/* loaded from: classes10.dex */
public final class z implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.i0 f394024d;

    public z(ku3.i0 i0Var) {
        this.f394024d = i0Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        int i17 = ((zt3.d) obj).f557126b;
        ku3.i0 i0Var = this.f394024d;
        if (i17 != 0) {
            i0Var.a().animate().alpha(0.0f).withEndAction(new ku3.t(i0Var)).start();
        } else {
            i0Var.a().setVisibility(0);
            i0Var.a().animate().alpha(1.0f).start();
        }
    }
}
