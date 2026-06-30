package z32;

/* loaded from: classes12.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f551451d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f551452e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f551453f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z32.s f551454g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.ed6 f551455h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f551456i;

    public l(boolean z17, int i17, org.json.JSONObject jSONObject, z32.s sVar, r45.ed6 ed6Var, java.lang.String str) {
        this.f551451d = z17;
        this.f551452e = i17;
        this.f551453f = jSONObject;
        this.f551454g = sVar;
        this.f551455h = ed6Var;
        this.f551456i = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/exdevice/uic/SportProfileUIC$updateItemView$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f551451d && this.f551452e == 1) {
            java.lang.String optString = this.f551453f.optString("finder_username");
            android.app.Activity context = this.f551454g.m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("finder_username", optString);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.e1.f542005a.w(context, intent);
            a42.c cVar = a42.c.f82733a;
            java.lang.String appName = this.f551455h.f454861e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appName, "appName");
            cVar.a(2, 2, appName, 1, 1, this.f551456i);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/exdevice/uic/SportProfileUIC$updateItemView$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
