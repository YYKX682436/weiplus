package gc0;

/* loaded from: classes5.dex */
public final class x extends tg3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f351881e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f351882f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f351883g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f351884h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f351885i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(java.lang.ref.WeakReference weakReference, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17) {
        super(1, null);
        this.f351881e = weakReference;
        this.f351882f = str;
        this.f351883g = str2;
        this.f351884h = str3;
        this.f351885i = j17;
    }

    @Override // tg3.a
    public void a(android.view.View widget) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        android.content.Context context = (android.content.Context) this.f351881e.get();
        if (context != null) {
            java.lang.String str = this.f351883g;
            java.lang.String str2 = this.f351884h;
            android.content.Intent intent = new android.content.Intent();
            java.lang.String str3 = this.f351882f;
            intent.putExtra("Contact_User", str3);
            intent.putExtra("view_mode", true);
            intent.putExtra("contact_set_remark_from_recommend", str);
            intent.putExtra("contact_add_phone_from_recommend", str2);
            gc0.y0 y0Var = gc0.y0.f351898a;
            pm0.v.K(null, new gc0.p0(str3 == null ? "" : str3));
            long j17 = this.f351885i;
            if (j17 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HandleRecommendRemarkSendTipClickListener", "onClickImp() called launch no img");
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.m(intent, context);
                if (context instanceof android.app.Activity) {
                    ((android.app.Activity) context).overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
                    return;
                }
                return;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = pt0.f0.f439742b1.k(str3, j17);
            android.content.Context context2 = widget.getContext();
            p3325xe03a0797.p3326xc267989b.y0 a17 = v65.m.a(widget);
            if (k17 != null) {
                p3325xe03a0797.p3326xc267989b.l.d(a17, null, null, new gc0.w(context2, k17, intent, str, str2, context, null), 3, null);
            }
        }
    }
}
