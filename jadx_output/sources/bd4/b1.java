package bd4;

/* loaded from: classes4.dex */
public final class b1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.view.ImproveRepostView f19297d;

    public b1(com.tencent.mm.plugin.sns.ui.improve.view.ImproveRepostView improveRepostView) {
        this.f19297d = improveRepostView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRepostView$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/view/ImproveRepostView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.model.k6 Jj = com.tencent.mm.plugin.sns.model.l4.Jj();
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveRepostView improveRepostView = this.f19297d;
        Jj.b(improveRepostView.getContext());
        android.content.Context context = improveRepostView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.mvvmlist.MvvmList S6 = ((com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC.class)).S6();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getItem$p", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRepostView");
        zc4.b bVar = improveRepostView.f169174d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getItem$p", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRepostView");
        kotlin.jvm.internal.o.d(bVar);
        S6.u(bVar);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/improve/view/ImproveRepostView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRepostView$1");
    }
}
