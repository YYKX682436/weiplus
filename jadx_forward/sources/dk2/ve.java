package dk2;

/* loaded from: classes3.dex */
public final class ve implements f25.f {

    /* renamed from: d, reason: collision with root package name */
    public final f25.l0 f315782d;

    public ve(f25.l0 l0Var) {
        this.f315782d = l0Var;
    }

    @Override // f25.f
    public void c(boolean z17) {
        dk2.ef.f314905a.E(dk2.ad.f314737d, "onPause scene: " + this.f315782d);
    }

    @Override // f25.f
    /* renamed from: onResume */
    public void mo44161x57429eec() {
        dk2.ef.f314905a.p("onResume scene: " + this.f315782d, false);
    }

    @Override // f25.f
    /* renamed from: onStop */
    public void mo44162xc39f8281() {
        dk2.ef.f314905a.E(dk2.ad.f314738e, "onStop scene: " + this.f315782d);
        dk2.ef.f314934p = null;
    }
}
