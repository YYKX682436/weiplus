package com.tencent.mm.plugin.choosemsgfile.ui;

/* loaded from: classes12.dex */
public class q implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lo.j f95631d;

    public q(lo.j jVar) {
        this.f95631d = jVar;
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChooseMsgFileUI", "requestCode:%d, resultCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        xv1.d.b(i17, i18, intent, this.f95631d);
    }
}
