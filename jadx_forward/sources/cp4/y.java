package cp4;

/* loaded from: classes8.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cp4.z f302626d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f302627e;

    public y(cp4.z zVar, android.content.Context context) {
        this.f302626d = zVar;
        this.f302627e = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cp4.z zVar = this.f302626d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = zVar.f302630e.getLayoutManager();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        android.view.View mo7935xa188593e = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager).mo7935xa188593e(zVar.f302635m);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = mo7935xa188593e != null ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) mo7935xa188593e.findViewById(com.p314xaae8f345.mm.R.id.f565077b62) : null;
        if (c22621x7603e017 != null) {
            c22621x7603e017.requestFocus();
        }
        if (c22621x7603e017 != null) {
            c22621x7603e017.mo81549xf579a34a(c22621x7603e017.getText().length());
        }
        zVar.f302636n++;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorEditCaptionView", "repeat " + zVar.f302636n);
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) this.f302627e.getSystemService("input_method");
        if (inputMethodManager == null || inputMethodManager.showSoftInput(c22621x7603e017, 0) || zVar.f302636n >= 5) {
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).E(zVar.f302637o, 50L);
    }
}
