package cp4;

/* loaded from: classes8.dex */
public final class v implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cp4.x f302617d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f302618e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f302619f;

    public v(cp4.x xVar, int i17, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017) {
        this.f302617d = xVar;
        this.f302618e = i17;
        this.f302619f = c22621x7603e017;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View view, boolean z17) {
        cp4.x xVar = this.f302617d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f302619f;
        if (!z17) {
            c22621x7603e017.removeTextChangedListener(xVar.f302624f);
            return;
        }
        cp4.u uVar = xVar.f302624f;
        uVar.f302614d = this.f302618e;
        c22621x7603e017.addTextChangedListener(uVar);
    }
}
