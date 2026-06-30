package z32;

/* loaded from: classes12.dex */
public final class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f551489d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f551490e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f551491f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z32.a0 f551492g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.ed6 f551493h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r32.d f551494i;

    public z(boolean z17, int i17, org.json.JSONObject jSONObject, z32.a0 a0Var, r45.ed6 ed6Var, r32.d dVar) {
        this.f551489d = z17;
        this.f551490e = i17;
        this.f551491f = jSONObject;
        this.f551492g = a0Var;
        this.f551493h = ed6Var;
        this.f551494i = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/exdevice/uic/SportRankUIC$handleRankRecordView$1$2$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f551489d && this.f551490e == 1) {
            java.lang.String optString = this.f551491f.optString("finder_username");
            android.app.Activity context = this.f551492g.m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("finder_username", optString);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.e1.f542005a.w(context, intent);
            a42.c cVar = a42.c.f82733a;
            java.lang.String appName = this.f551493h.f454861e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appName, "appName");
            java.lang.String field_username = this.f551494i.f67224xdec927b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_username, "field_username");
            cVar.a(1, 2, appName, 1, 1, field_username);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/exdevice/uic/SportRankUIC$handleRankRecordView$1$2$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
