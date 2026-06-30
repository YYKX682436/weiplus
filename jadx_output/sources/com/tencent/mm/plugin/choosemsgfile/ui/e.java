package com.tencent.mm.plugin.choosemsgfile.ui;

/* loaded from: classes12.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileListUI f95619d;

    public e(com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileListUI chooseMsgFileListUI) {
        this.f95619d = chooseMsgFileListUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileListUI chooseMsgFileListUI = this.f95619d;
        android.widget.Button button = chooseMsgFileListUI.f95575o;
        java.util.Map map = chooseMsgFileListUI.f95572i.f457388b;
        button.setEnabled((map == null ? 0 : ((java.util.concurrent.ConcurrentHashMap) map).size()) > 0);
    }
}
