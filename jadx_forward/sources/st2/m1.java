package st2;

/* loaded from: classes3.dex */
public final class m1 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ st2.s1 f493929d;

    public m1(st2.s1 s1Var) {
        this.f493929d = s1Var;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 3) {
            return true;
        }
        this.f493929d.f493979f.performClick();
        return true;
    }
}
