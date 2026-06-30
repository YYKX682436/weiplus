package bd4;

/* loaded from: classes3.dex */
public final class n1 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bd4.f2 f19372a;

    public n1(bd4.f2 f2Var) {
        this.f19372a = f2Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDynamicParams", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$buildInnerMenu$3$1");
        java.util.Map e17 = kz5.b1.e(new jz5.l("select_txt_type", java.lang.Integer.valueOf(this.f19372a.q() ? 1 : 2)));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDynamicParams", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$buildInnerMenu$3$1");
        return e17;
    }
}
