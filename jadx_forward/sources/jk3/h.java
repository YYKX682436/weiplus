package jk3;

/* loaded from: classes8.dex */
public final class h extends qn5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f381616d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jk3.v f381617e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f381618f;

    public h(boolean z17, jk3.v vVar, android.graphics.Bitmap bitmap) {
        this.f381616d = z17;
        this.f381617e = vVar;
        this.f381618f = bitmap;
    }

    @Override // qn5.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        android.graphics.Bitmap bitmap;
        android.graphics.Bitmap P;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageMultiTaskHelper", "hideFloatBallContainer onAnimationCancel");
        boolean z17 = this.f381616d;
        jk3.v vVar = this.f381617e;
        if (!z17) {
            if (vVar.E()) {
                ak3.c cVar = vVar.f381644d;
                if (cVar == null || (P = ((ak3.i) cVar).f87121m) == null) {
                    P = vVar.P(this.f381618f, vVar.f381657q);
                }
                bitmap = P;
            } else {
                bitmap = null;
            }
            jk3.v vVar2 = this.f381617e;
            vVar2.X(bitmap, true, true, true, vVar2.f381661u);
        }
        kk3.d dVar = vVar.f381650j;
        if (dVar != null) {
            kk3.d.f(dVar, 0, 1, null);
        }
        jk3.v.M(vVar);
    }

    @Override // qn5.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        android.graphics.Bitmap bitmap;
        android.graphics.Bitmap P;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageMultiTaskHelper", "hideFloatBallContainer onAnimationEnd");
        boolean z17 = this.f381616d;
        android.graphics.Bitmap bitmap2 = this.f381618f;
        jk3.v vVar = this.f381617e;
        if (!z17) {
            if (vVar.E()) {
                ak3.c cVar = vVar.f381644d;
                if (cVar == null || (P = ((ak3.i) cVar).f87121m) == null) {
                    P = vVar.P(bitmap2, vVar.f381657q);
                }
                bitmap = P;
            } else {
                bitmap = null;
            }
            jk3.v vVar2 = this.f381617e;
            vVar2.X(bitmap, true, true, true, vVar2.f381661u);
        }
        kk3.d dVar = vVar.f381650j;
        if (dVar != null) {
            kk3.d.a(dVar, bitmap2, 0, 2, null);
        }
        jk3.v.M(vVar);
    }
}
