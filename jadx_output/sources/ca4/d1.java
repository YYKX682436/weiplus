package ca4;

/* loaded from: classes.dex */
public final class d1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f39869d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f39870e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f39871f;

    public d1(android.view.View view, long j17, yz5.a aVar) {
        this.f39869d = view;
        this.f39870e = j17;
        this.f39871f = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion$setThrottleOnClickListener$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/data/SnsUtilExt$Companion$setThrottleOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f39869d;
        view2.setClickable(false);
        view2.postDelayed(new ca4.c1(view2), this.f39870e);
        this.f39871f.invoke();
        yj0.a.h(this, "com/tencent/mm/plugin/sns/data/SnsUtilExt$Companion$setThrottleOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion$setThrottleOnClickListener$1");
    }
}
