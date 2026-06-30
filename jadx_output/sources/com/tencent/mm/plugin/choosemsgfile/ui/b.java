package com.tencent.mm.plugin.choosemsgfile.ui;

/* loaded from: classes12.dex */
public class b implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileListUI f95613d;

    public b(com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileListUI chooseMsgFileListUI) {
        this.f95613d = chooseMsgFileListUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("ERRMSG", "cancel");
        com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileListUI chooseMsgFileListUI = this.f95613d;
        chooseMsgFileListUI.setResult(1, intent);
        chooseMsgFileListUI.finish();
        chooseMsgFileListUI.overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477855dd);
        return true;
    }
}
