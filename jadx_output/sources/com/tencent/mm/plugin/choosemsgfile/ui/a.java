package com.tencent.mm.plugin.choosemsgfile.ui;

/* loaded from: classes12.dex */
public class a implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileListUI f95611d;

    public a(com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileListUI chooseMsgFileListUI) {
        this.f95611d = chooseMsgFileListUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f95611d.finish();
        return true;
    }
}
