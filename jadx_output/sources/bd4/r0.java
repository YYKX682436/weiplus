package bd4;

/* loaded from: classes4.dex */
public final class r0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout f19384d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xc4.p f19385e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f19386f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f19387g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout improveInteractionLayout, xc4.p pVar, boolean z17, int i17) {
        super(2);
        this.f19384d = improveInteractionLayout;
        this.f19385e = pVar;
        this.f19386f = z17;
        this.f19387g = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout$setupSingleCommentLayout$textMeasureLayoutBuilder$1");
        android.widget.TextView tv6 = (android.widget.TextView) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout$setupSingleCommentLayout$textMeasureLayoutBuilder$1");
        kotlin.jvm.internal.o.g(tv6, "tv");
        android.text.Layout e17 = ad4.y.f3210a.e(tv6, this.f19384d.j(this.f19385e, this.f19386f, this.f19387g), intValue);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout$setupSingleCommentLayout$textMeasureLayoutBuilder$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout$setupSingleCommentLayout$textMeasureLayoutBuilder$1");
        return e17;
    }
}
