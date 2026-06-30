package bd4;

/* loaded from: classes4.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout f19359d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout improveInteractionLayout) {
        super(0);
        this.f19359d = improveInteractionLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout$callback$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout$callback$2");
        android.content.Context context = this.f19359d.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        com.tencent.mm.plugin.sns.ui.q1 q1Var = new com.tencent.mm.plugin.sns.ui.q1((android.app.Activity) context, 0, new com.tencent.mm.plugin.sns.model.k5(2));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout$callback$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout$callback$2");
        return q1Var;
    }
}
