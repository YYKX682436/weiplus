package aq4;

/* loaded from: classes4.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.video.remux.work.RemuxBackgroundWork f13207d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f13208e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.plugin.vlog.ui.video.remux.work.RemuxBackgroundWork remuxBackgroundWork, kotlin.coroutines.Continuation continuation) {
        super(2);
        this.f13207d = remuxBackgroundWork;
        this.f13208e = continuation;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String errMsg = (java.lang.String) obj2;
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        com.tencent.mars.xlog.Log.i(this.f13207d.f176108o, "export callback " + java.lang.Thread.currentThread().getName());
        java.lang.String c17 = this.f13207d.f12459e.f12466b.c("KEY_EXPORT_BACKGROUND_WORK_TAG_ID");
        com.tencent.mars.xlog.Log.i(this.f13207d.f176108o, "export callback >> code: " + intValue + ", errMsg: " + errMsg + ", workTagId: " + c17);
        ((ku5.t0) ku5.t0.f312615d).h(new aq4.b(this.f13207d, c17, this.f13208e, intValue), "sns_background_thread");
        return jz5.f0.f302826a;
    }
}
