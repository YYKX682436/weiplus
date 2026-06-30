package zu3;

/* loaded from: classes10.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2004x317b13.C17058xaee30621 f557340d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f557341e;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2004x317b13.C17058xaee30621 c17058xaee30621, android.view.View view) {
        this.f557340d = c17058xaee30621;
        this.f557341e = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2004x317b13.C17058xaee30621 c17058xaee30621 = this.f557340d;
        c17058xaee30621.f237660p.removeView(c17058xaee30621.f237669y);
        yz5.l itemChangeListener = c17058xaee30621.getItemChangeListener();
        if (itemChangeListener != null) {
            itemChangeListener.mo146xb9724478(c17058xaee30621.f237669y);
        }
        c17058xaee30621.f237669y = null;
        c17058xaee30621.B = null;
        android.view.View view = this.f557341e;
        if (view instanceof zu3.z) {
            c17058xaee30621.m68316x93c2f97c(null);
        } else if (view instanceof zu3.v) {
            c17058xaee30621.m68317xe3da82bb(null);
        } else if (view instanceof zu3.c0) {
            c17058xaee30621.m68323x41f77c51(null);
        }
    }
}
