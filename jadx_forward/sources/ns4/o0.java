package ns4;

/* loaded from: classes8.dex */
public final class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ns4.p0 f421136d;

    public o0(ns4.p0 p0Var) {
        this.f421136d = p0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c2 = this.f421136d.f421146f;
        if (viewOnFocusChangeListenerC22907xe18534c2 != null) {
            viewOnFocusChangeListenerC22907xe18534c2.p();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("inputArea");
            throw null;
        }
    }
}
