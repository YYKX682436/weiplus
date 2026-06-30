package bn5;

/* loaded from: classes10.dex */
public class c implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bn5.d f104464d;

    public c(bn5.d dVar) {
        this.f104464d = dVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f104464d.f427460a = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        float height;
        float f17;
        int width;
        bn5.d dVar = this.f104464d;
        bn5.e eVar = dVar.f104471i;
        if (eVar != null) {
            eVar.b();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdaptImageAnim", "AdaptImageAnim onAnimationEnd");
        dVar.f427460a = true;
        bn5.f fVar = dVar.f104472j;
        fVar.f104475f.set(fVar.f104474e);
        bn5.f fVar2 = dVar.f104472j;
        fVar2.f104490x = fVar2.e(fVar2.f104475f) * bn5.f.F;
        if (dVar.f104470h) {
            bn5.f fVar3 = dVar.f104472j;
            fVar3.f104489w = fVar3.e(fVar3.f104475f) * 3.0f;
            bn5.f fVar4 = dVar.f104472j;
            android.graphics.Rect m10947x9f2f90d = fVar4.m10947x9f2f90d();
            float width2 = (m10947x9f2f90d.width() * 1.0f) / m10947x9f2f90d.height();
            if (width2 < (fVar4.m10934x9faf4b34().width() * 1.0f) / fVar4.m10934x9faf4b34().height()) {
                height = fVar4.m10934x9faf4b34().width() / width2;
                fVar4.m10934x9faf4b34().height();
            } else {
                height = fVar4.m10934x9faf4b34().height();
                fVar4.m10934x9faf4b34().width();
            }
            if (fVar4.d(fVar4.f104474e) % 180.0f == 0.0f) {
                f17 = height * 1.0f;
                width = m10947x9f2f90d.height();
            } else {
                f17 = height * 1.0f;
                width = m10947x9f2f90d.width();
            }
            float f18 = f17 / width;
            if (fVar4.f104489w < f18) {
                fVar4.f104489w = f18 * 1.2f;
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdaptImageAnim", "AdaptImageAnim onAnimationStart");
        bn5.d dVar = this.f104464d;
        bn5.e eVar = dVar.f104471i;
        if (eVar != null) {
            eVar.mo10932xb05099c3();
        }
        dVar.f427460a = false;
    }
}
