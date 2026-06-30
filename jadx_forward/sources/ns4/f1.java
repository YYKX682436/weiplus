package ns4;

/* loaded from: classes5.dex */
public final class f1 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnClickListener f421052d;

    public f1(android.view.View.OnClickListener onClickListener) {
        this.f421052d = onClickListener;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 66) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinEncashView", "click enter");
            this.f421052d.onClick(null);
        }
        return true;
    }
}
