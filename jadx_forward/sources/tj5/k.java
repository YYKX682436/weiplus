package tj5;

/* loaded from: classes8.dex */
public class k implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 f501379d;

    public k(com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 c22479x68a26381) {
        this.f501379d = c22479x68a26381;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 c22479x68a26381 = this.f501379d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSEditTextView", "[hitest] updateEllipsize.onFocusChange, hasFocus=%s, textChangeStatus=%s", valueOf, c22479x68a26381.G);
        tj5.n nVar = c22479x68a26381.E;
        if (nVar != null) {
            nVar.U1(z17);
        }
        if (z17) {
            c22479x68a26381.G = tj5.o.UserInput;
            c22479x68a26381.f291349g.setEllipsize(null);
            c22479x68a26381.f291349g.setKeyListener(new android.text.method.TextKeyListener(android.text.method.TextKeyListener.Capitalize.NONE, false));
            c22479x68a26381.m();
            android.text.Selection.setSelection(c22479x68a26381.f291349g.getText(), c22479x68a26381.f291349g.getText().length());
            c22479x68a26381.s();
        }
        c22479x68a26381.l(z17);
    }
}
