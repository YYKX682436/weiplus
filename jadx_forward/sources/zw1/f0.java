package zw1;

/* loaded from: classes5.dex */
public class f0 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnClickListener f558153d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13142x725f2ac0 f558154e;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13142x725f2ac0 activityC13142x725f2ac0, android.view.View.OnClickListener onClickListener) {
        this.f558154e = activityC13142x725f2ac0;
        this.f558153d = onClickListener;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 66 && this.f558154e.f177914h.isShown()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CollectCreateQRCodeNewUI", "click enter");
            this.f558153d.onClick(null);
        }
        return true;
    }
}
