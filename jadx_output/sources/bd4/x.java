package bd4;

/* loaded from: classes4.dex */
public final class x implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView f19407d;

    public x(com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView improveContentView) {
        this.f19407d = improveContentView;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLayoutChange", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$setText$$inlined$doOnLayout$2");
        view.removeOnLayoutChangeListener(this);
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView improveContentView = this.f19407d;
        improveContentView.post(new bd4.z(improveContentView));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLayoutChange", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$setText$$inlined$doOnLayout$2");
    }
}
