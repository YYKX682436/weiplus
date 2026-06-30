package u94;

/* loaded from: classes4.dex */
public class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f507401d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 f507402e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u94.o f507403f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f507404g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ u94.p f507405h;

    public k(u94.p pVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9, u94.o oVar, android.content.Context context) {
        this.f507405h = pVar;
        this.f507401d = c17933xe8d1b226;
        this.f507402e = c17702x544f64e9;
        this.f507403f = oVar;
        this.f507404g = context;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9 = this.f507402e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/controller/HalfSubscribeController$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f507401d;
        if (c17933xe8d1b226 != null) {
            try {
                java.lang.String m70375x338a8cc7 = c17933xe8d1b226.m70375x338a8cc7();
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                java.lang.String str = "";
                java.lang.String str2 = m70375x338a8cc7 == null ? "" : m70375x338a8cc7;
                java.lang.String m70355xb5882a06 = c17933xe8d1b226.m70355xb5882a06();
                if (m70355xb5882a06 != null) {
                    str = m70355xb5882a06;
                }
                ib4.j jVar = new ib4.j(c17702x544f64e9.f244116h, str2, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(str), c17702x544f64e9.f244144v);
                gm0.j1.d().a(2810, this.f507403f);
                gm0.j1.d().g(jVar);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new u94.j(this));
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HalfSubscribeController", th6.toString());
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/controller/HalfSubscribeController$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$3");
    }
}
