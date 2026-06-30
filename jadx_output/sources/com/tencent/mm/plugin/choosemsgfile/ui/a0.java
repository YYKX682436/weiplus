package com.tencent.mm.plugin.choosemsgfile.ui;

/* loaded from: classes12.dex */
public class a0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileUI f95612d;

    public a0(com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileUI chooseMsgFileUI) {
        this.f95612d = chooseMsgFileUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileUI chooseMsgFileUI = this.f95612d;
        java.lang.String str = chooseMsgFileUI.f95595f;
        java.lang.String str2 = com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_ALL;
        if (i17 != 0) {
            if (i17 == 1) {
                str2 = "image";
            } else if (i17 == 2) {
                str2 = "video";
            } else if (i17 == 3) {
                str2 = "file";
            }
        }
        chooseMsgFileUI.f95598i.c(true, str2, chooseMsgFileUI.f95597h);
        chooseMsgFileUI.V6(str2);
    }
}
