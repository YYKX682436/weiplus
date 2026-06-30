package kd2;

/* loaded from: classes10.dex */
public final class o implements f25.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kd2.q f388312d;

    public o(kd2.q qVar) {
        this.f388312d = qVar;
    }

    @Override // f25.f
    public void c(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BaseFinderMiniViewHelper", "onPause: loss focus");
        pm0.v.X(new kd2.l(this.f388312d));
    }

    @Override // f25.f
    /* renamed from: onResume */
    public void mo44161x57429eec() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BaseFinderMiniViewHelper", "onResume: gain focus");
        pm0.v.X(new kd2.m(this.f388312d));
    }

    @Override // f25.f
    /* renamed from: onStop */
    public void mo44162xc39f8281() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BaseFinderMiniViewHelper", "onStop: loss focus");
        pm0.v.X(new kd2.n(this.f388312d));
    }
}
