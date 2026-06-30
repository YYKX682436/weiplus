package bn5;

/* loaded from: classes10.dex */
public class c implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bn5.d f22931d;

    public c(bn5.d dVar) {
        this.f22931d = dVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f22931d.f345927a = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        float height;
        float f17;
        int width;
        bn5.d dVar = this.f22931d;
        bn5.e eVar = dVar.f22938i;
        if (eVar != null) {
            eVar.b();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AdaptImageAnim", "AdaptImageAnim onAnimationEnd");
        dVar.f345927a = true;
        bn5.f fVar = dVar.f22939j;
        fVar.f22942f.set(fVar.f22941e);
        bn5.f fVar2 = dVar.f22939j;
        fVar2.f22957x = fVar2.e(fVar2.f22942f) * bn5.f.F;
        if (dVar.f22937h) {
            bn5.f fVar3 = dVar.f22939j;
            fVar3.f22956w = fVar3.e(fVar3.f22942f) * 3.0f;
            bn5.f fVar4 = dVar.f22939j;
            android.graphics.Rect rawImageRect = fVar4.getRawImageRect();
            float width2 = (rawImageRect.width() * 1.0f) / rawImageRect.height();
            if (width2 < (fVar4.getBoardRect().width() * 1.0f) / fVar4.getBoardRect().height()) {
                height = fVar4.getBoardRect().width() / width2;
                fVar4.getBoardRect().height();
            } else {
                height = fVar4.getBoardRect().height();
                fVar4.getBoardRect().width();
            }
            if (fVar4.d(fVar4.f22941e) % 180.0f == 0.0f) {
                f17 = height * 1.0f;
                width = rawImageRect.height();
            } else {
                f17 = height * 1.0f;
                width = rawImageRect.width();
            }
            float f18 = f17 / width;
            if (fVar4.f22956w < f18) {
                fVar4.f22956w = f18 * 1.2f;
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AdaptImageAnim", "AdaptImageAnim onAnimationStart");
        bn5.d dVar = this.f22931d;
        bn5.e eVar = dVar.f22938i;
        if (eVar != null) {
            eVar.onStart();
        }
        dVar.f345927a = false;
    }
}
