package e33;

/* loaded from: classes10.dex */
public class o5 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15659x3c9ebdbd f328960d;

    public o5(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15659x3c9ebdbd activityC15659x3c9ebdbd) {
        this.f328960d = activityC15659x3c9ebdbd;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (3 != i17) {
            return false;
        }
        java.lang.String charSequence = textView.getText().toString();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(charSequence)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15659x3c9ebdbd.T6(this.f328960d, charSequence, true);
        return true;
    }
}
