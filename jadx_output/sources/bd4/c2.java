package bd4;

/* loaded from: classes4.dex */
public final class c2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bd4.f2 f19304d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(bd4.f2 f2Var) {
        super(0);
        this.f19304d = f2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$touchSlop$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$touchSlop$2");
        java.lang.Integer valueOf = java.lang.Integer.valueOf(android.view.ViewConfiguration.get(bd4.f2.b(this.f19304d)).getScaledTouchSlop());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$touchSlop$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$touchSlop$2");
        return valueOf;
    }
}
