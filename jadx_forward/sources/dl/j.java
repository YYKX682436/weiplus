package dl;

/* loaded from: classes10.dex */
public class j implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dl.t f316640d;

    public j(dl.t tVar) {
        this.f316640d = tVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CropArtist", "onAnimationEnd");
        dl.t tVar = this.f316640d;
        int i17 = tVar.Y - 1;
        tVar.Y = i17;
        if (i17 == 0) {
            tVar.G = false;
            android.graphics.RectF rectF = new android.graphics.RectF();
            rectF.set(tVar.f316663x);
            tVar.f316662w.mapRect(rectF);
            tVar.f316662w.reset();
            tVar.f316663x.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            tVar.O();
        }
        dl.t.G(tVar, 200L, false, true);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        dl.t tVar = this.f316640d;
        tVar.E = false;
        tVar.P = true;
        tVar.G = true;
    }
}
