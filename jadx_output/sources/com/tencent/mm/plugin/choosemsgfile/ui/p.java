package com.tencent.mm.plugin.choosemsgfile.ui;

/* loaded from: classes12.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileUI f95630d;

    public p(com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileUI chooseMsgFileUI) {
        this.f95630d = chooseMsgFileUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileUI chooseMsgFileUI = this.f95630d;
        android.widget.Button button = chooseMsgFileUI.f95607u;
        java.util.Map map = chooseMsgFileUI.f95599m.f457388b;
        button.setEnabled((map == null ? 0 : ((java.util.concurrent.ConcurrentHashMap) map).size()) > 0);
    }
}
