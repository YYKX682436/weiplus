package ca4;

/* loaded from: classes15.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ca4.x f40032d;

    public w(ca4.x xVar) {
        this.f40032d = xVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper$4$2");
        ca4.x xVar = this.f40032d;
        if (ca4.b0.a(xVar.f40058c) != null) {
            ca4.b0.a(xVar.f40058c).v();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper$4$2");
    }
}
