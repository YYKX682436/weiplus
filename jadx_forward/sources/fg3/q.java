package fg3;

/* loaded from: classes3.dex */
public final class q implements ig3.d {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f343980d;

    public q(java.lang.ref.WeakReference ref) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ref, "ref");
        this.f343980d = ref;
    }

    @Override // ig3.d
    public void C(android.view.View view, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        ig3.d dVar = (ig3.d) this.f343980d.get();
        if (dVar != null) {
            dVar.C(view, i17, i18);
        }
    }

    @Override // ig3.d
    public void I(ig3.c state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        ig3.d dVar = (ig3.d) this.f343980d.get();
        if (dVar != null) {
            dVar.I(state);
        }
    }
}
