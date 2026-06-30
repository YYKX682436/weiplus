package y;

/* loaded from: classes16.dex */
public final class o2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {
    public final /* synthetic */ android.view.View C;
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14327xf6cdefc6 D;
    public final /* synthetic */ mi2.h E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14327xf6cdefc6 c14327xf6cdefc6, mi2.h hVar) {
        super(0);
        this.C = view;
        this.D = c14327xf6cdefc6;
        this.E = hVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.ViewPropertyAnimator translationX;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator withEndAction;
        float width = this.D.getWidth();
        android.view.View view = this.C;
        view.setTranslationX(width);
        mi2.h hVar = this.E;
        hVar.X(true);
        android.view.ViewPropertyAnimator animate = view.animate();
        if (animate == null || (translationX = animate.translationX(0.0f)) == null || (duration = translationX.setDuration(300L)) == null || (withEndAction = duration.withEndAction(new y.n2(hVar))) == null) {
            return null;
        }
        withEndAction.start();
        return jz5.f0.f384359a;
    }
}
