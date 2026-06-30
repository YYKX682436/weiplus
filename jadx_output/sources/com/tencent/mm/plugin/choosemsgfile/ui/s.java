package com.tencent.mm.plugin.choosemsgfile.ui;

/* loaded from: classes9.dex */
public class s implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileUI f95633d;

    public s(com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileUI chooseMsgFileUI) {
        this.f95633d = chooseMsgFileUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("ERRMSG", "cancel");
        com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileUI chooseMsgFileUI = this.f95633d;
        chooseMsgFileUI.setResult(1, intent);
        chooseMsgFileUI.finish();
        return true;
    }
}
