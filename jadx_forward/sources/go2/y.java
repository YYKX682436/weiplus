package go2;

/* loaded from: classes2.dex */
public final class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go2.z f355614d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f355615e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f355616f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f355617g;

    public y(go2.z zVar, int i17, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079) {
        this.f355614d = zVar;
        this.f355615e = i17;
        this.f355616f = i18;
        this.f355617g = c14994x9b99c079;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/member/area/uic/FinderMemberAreaHeaderUIC$updateCurLive$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        go2.z zVar = this.f355614d;
        if (((r45.tr0) zVar.f534252d) == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/member/area/uic/FinderMemberAreaHeaderUIC$updateCurLive$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = zVar.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).getClass();
        int i17 = this.f355615e;
        if (i17 <= 0) {
            i17 = this.f355616f;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).Jk(zVar.m80379x76847179(), this.f355617g, i17, "204");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/member/area/uic/FinderMemberAreaHeaderUIC$updateCurLive$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
