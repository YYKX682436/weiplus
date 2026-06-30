package xc2;

/* loaded from: classes2.dex */
public final class v2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f534848d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f534849e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f534850f;

    public v2(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var) {
        this.f534848d = context;
        this.f534849e = c14994x9b99c079;
        this.f534850f = y1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/jumper/JumperUtils$showPromotionUserListGuide$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1641xd05cfca3.ActivityC15134x1c9eca3a.f211187t.a(this.f534848d, this.f534849e.getFeedObject(), true, false);
        this.f534850f.q();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/jumper/JumperUtils$showPromotionUserListGuide$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
