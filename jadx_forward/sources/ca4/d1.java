package ca4;

/* loaded from: classes.dex */
public final class d1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f121402d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f121403e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f121404f;

    public d1(android.view.View view, long j17, yz5.a aVar) {
        this.f121402d = view;
        this.f121403e = j17;
        this.f121404f = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion$setThrottleOnClickListener$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/data/SnsUtilExt$Companion$setThrottleOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f121402d;
        view2.setClickable(false);
        view2.postDelayed(new ca4.c1(view2), this.f121403e);
        this.f121404f.mo152xb9724478();
        yj0.a.h(this, "com/tencent/mm/plugin/sns/data/SnsUtilExt$Companion$setThrottleOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion$setThrottleOnClickListener$1");
    }
}
