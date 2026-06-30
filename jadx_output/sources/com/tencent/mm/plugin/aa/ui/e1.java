package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes5.dex */
public class e1 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnClickListener f72621d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.AARemittanceUI f72622e;

    public e1(com.tencent.mm.plugin.aa.ui.AARemittanceUI aARemittanceUI, android.view.View.OnClickListener onClickListener) {
        this.f72622e = aARemittanceUI;
        this.f72621d = onClickListener;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 66 && this.f72622e.f72456i.isShown()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AARemittanceUI", "click pay");
            this.f72621d.onClick(null);
        }
        return true;
    }
}
