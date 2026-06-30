package z32;

/* loaded from: classes4.dex */
public final class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z32.s f551463d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f551464e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f551465f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f551466g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f551467h;

    public r(z32.s sVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.f551463d = sVar;
        this.f551464e = str;
        this.f551465f = str2;
        this.f551466g = str3;
        this.f551467h = str4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/exdevice/uic/SportProfileUIC$updateItemView$6$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        a42.g gVar = a42.g.f82739a;
        android.app.Activity m80379x76847179 = this.f551463d.m80379x76847179();
        java.lang.String liteAppId = this.f551464e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(liteAppId, "$liteAppId");
        gVar.b(m80379x76847179, liteAppId, this.f551465f, this.f551466g, this.f551467h);
        yj0.a.h(this, "com/tencent/mm/plugin/exdevice/uic/SportProfileUIC$updateItemView$6$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
