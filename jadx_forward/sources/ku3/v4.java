package ku3;

/* loaded from: classes3.dex */
public final class v4 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.i5 f393971d;

    public v4(ku3.i5 i5Var) {
        this.f393971d = i5Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        if (((zt3.d) obj).f557126b != 0) {
            ku3.i5 i5Var = this.f393971d;
            if (i5Var.b().getVisibility() == 0) {
                i5Var.b().animate().alpha(0.0f).withEndAction(new ku3.u4(i5Var)).start();
            }
        }
    }
}
