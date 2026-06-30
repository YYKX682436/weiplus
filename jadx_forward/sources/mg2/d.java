package mg2;

/* loaded from: classes10.dex */
public final class d extends jg2.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mg2.e f407753d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f407754e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f407755f;

    public d(mg2.e eVar, yz5.l lVar, yz5.a aVar) {
        this.f407753d = eVar;
        this.f407754e = lVar;
        this.f407755f = aVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        mg2.e eVar = this.f407753d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(eVar.f400090e, "switchInLiveRoom switch view success.");
        eVar.f407757w = true;
        eVar.D("onAnimationEnd1", this.f407754e, this.f407755f);
    }
}
