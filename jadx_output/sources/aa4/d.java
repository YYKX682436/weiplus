package aa4;

/* loaded from: classes4.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView f2642d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView snsCoverDefaultView) {
        super(0);
        this.f2642d = snsCoverDefaultView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView$changeCoverTxt$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView$changeCoverTxt$2");
        android.widget.TextView textView = (android.widget.TextView) this.f2642d.findViewById(com.tencent.mm.R.id.n7j);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView$changeCoverTxt$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView$changeCoverTxt$2");
        return textView;
    }
}
