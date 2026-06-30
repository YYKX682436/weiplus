package cs0;

/* loaded from: classes4.dex */
public final class m extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.p864x373aa5.p865x38b7655d.C10901x74919f80 f303588d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cs0.h f303589e;

    public m(com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.p864x373aa5.p865x38b7655d.C10901x74919f80 c10901x74919f80, cs0.h hVar) {
        this.f303588d = c10901x74919f80;
        this.f303589e = hVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation, boolean z17) {
        cs0.h hVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveCameraFocusView", "move ani is finish " + java.lang.Thread.currentThread().getName());
        com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.p864x373aa5.p865x38b7655d.C10901x74919f80 c10901x74919f80 = this.f303588d;
        if (c10901x74919f80.A != null && (hVar = this.f303589e) != null) {
            ((cs0.c) hVar).a(true);
        }
        c10901x74919f80.f150461w = false;
    }
}
