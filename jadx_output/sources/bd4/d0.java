package bd4;

/* loaded from: classes.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f19306d;

    public d0(yz5.a aVar) {
        this.f19306d = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$spreadContent$1");
        yz5.a aVar = this.f19306d;
        if (aVar != null) {
            aVar.invoke();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$spreadContent$1");
    }
}
