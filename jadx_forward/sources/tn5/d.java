package tn5;

/* loaded from: classes15.dex */
public final class d extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tn5.f f502399d;

    public d(tn5.f fVar) {
        this.f502399d = fVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        tn5.a aVar;
        sn5.b bVar;
        sn5.b bVar2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        if (animation.getDuration() == 0) {
            return;
        }
        tn5.f fVar = this.f502399d;
        fVar.f502405e = null;
        mn5.b bVar3 = fVar.f502403c;
        if (bVar3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cValues");
            throw null;
        }
        if (bVar3.f411742b == 0 && (bVar = (aVar = fVar.f502402b).f502384b) != (bVar2 = sn5.b.f491690p) && !bVar.f491704g && !bVar.f491703f) {
            aVar.c(bVar2);
            return;
        }
        tn5.a aVar2 = fVar.f502402b;
        sn5.b bVar4 = aVar2.f502384b;
        if (bVar4 != aVar2.f502385c) {
            aVar2.d(bVar4);
        }
    }
}
