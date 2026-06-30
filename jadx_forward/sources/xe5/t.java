package xe5;

/* loaded from: classes10.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xe5.g0 f535635d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f535636e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yb5.d f535637f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f535638g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f535639h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f535640i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f535641m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f535642n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f535643o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f535644p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f535645q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f535646r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f535647s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f535648t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f535649u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f535650v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ xe5.i f535651w;

    public t(xe5.g0 g0Var, java.lang.String str, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.util.Map map, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17, java.lang.String str5, java.lang.String str6, long j17, java.lang.String str7, long j18, boolean z18, int i18, xe5.i iVar) {
        this.f535635d = g0Var;
        this.f535636e = str;
        this.f535637f = dVar;
        this.f535638g = f9Var;
        this.f535639h = map;
        this.f535640i = i17;
        this.f535641m = str2;
        this.f535642n = str3;
        this.f535643o = z17;
        this.f535644p = str5;
        this.f535645q = str6;
        this.f535646r = j17;
        this.f535647s = str7;
        this.f535648t = j18;
        this.f535649u = z18;
        this.f535650v = i18;
        this.f535651w = iVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$filling$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xe5.g0 g0Var = this.f535635d;
        j31.e.b(4, g0Var.f535564e, g0Var.f535565f, this.f535636e);
        yb5.d dVar = this.f535637f;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f535638g;
        java.util.Map map = this.f535639h;
        tb5.o0.c(dVar, f9Var, map, 4);
        g0Var.f535560a = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) dVar.g(), 1, false);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = xe5.g0.f535559g;
        boolean z17 = this.f535640i < 9 ? o4Var.getBoolean(this.f535641m, false) : o4Var.getBoolean(this.f535642n, false);
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(view.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.awb, (android.view.ViewGroup) null);
        java.lang.String str = (java.lang.String) map.get(".msg.appmsg.extinfo.notifymsg.title.nickname");
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.odf);
        if (textView != null) {
            textView.setText(str);
        }
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.a6j);
        mn2.g1 g1Var = mn2.g1.f411508a;
        vo0.d a17 = g1Var.a();
        vd2.i5 i5Var = (vd2.i5) i95.n0.c(vd2.i5.class);
        java.lang.String str2 = (java.lang.String) map.get(".msg.appmsg.extinfo.notifymsg.title.avatar");
        if (str2 == null) {
            str2 = "";
        }
        mn2.h3 Ai = ((c61.i8) i5Var).Ai(str2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
        a17.c(Ai, imageView, g1Var.h(mn2.f1.f411495p));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = g0Var.f535560a;
        if (k0Var != null) {
            k0Var.s(inflate, false);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = g0Var.f535560a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k0Var2);
        boolean z18 = this.f535643o;
        xe5.g0 g0Var2 = this.f535635d;
        k0Var2.f293405n = new xe5.k(z18, z17, g0Var2, this.f535644p, this.f535645q);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var3 = g0Var2.f535560a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k0Var3);
        xe5.g0 g0Var3 = this.f535635d;
        java.lang.String str3 = this.f535641m;
        yb5.d dVar2 = this.f535637f;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = this.f535638g;
        java.util.Map map2 = this.f535639h;
        java.lang.String str4 = this.f535636e;
        k0Var3.f293414s = new xe5.r(g0Var3, str3, dVar2, f9Var2, map2, str4, this.f535646r, this.f535647s, this.f535648t, this.f535649u, this.f535650v, this.f535651w, this.f535642n);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var4 = g0Var3.f535560a;
        if (k0Var4 != null) {
            k0Var4.C = new xe5.s(g0Var3, str4, dVar2, f9Var2, map2);
        }
        if (k0Var4 != null) {
            k0Var4.v();
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$filling$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
