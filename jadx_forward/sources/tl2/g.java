package tl2;

/* loaded from: classes8.dex */
public final class g implements com.p314xaae8f345.mm.ui.fa {

    /* renamed from: d, reason: collision with root package name */
    public int f501778d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tl2.u f501779e;

    public g(tl2.u uVar) {
        this.f501779e = uVar;
    }

    @Override // com.p314xaae8f345.mm.ui.fa
    /* renamed from: onConfigurationChanged */
    public void mo74853x50e1c15d(android.content.res.Configuration it) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.q1 q1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        if (it.orientation != this.f501778d) {
            java.lang.ref.WeakReference weakReference = this.f501779e.f501812i;
            if (weakReference != null && (q1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.q1) weakReference.get()) != null && q1Var.m74860x58a9c73b()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.m1) q1Var).dismiss();
            }
            this.f501778d = it.orientation;
        }
    }
}
