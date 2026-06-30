package mm2;

/* loaded from: classes3.dex */
public final class f1 extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public r45.z02 f410553f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f410554g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
    }

    public final void N6(r45.z02 z02Var) {
        this.f410553f = z02Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        super.mo528x82b764cd();
        this.f410553f = null;
        this.f410554g = false;
    }
}
