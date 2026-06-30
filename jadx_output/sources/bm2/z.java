package bm2;

/* loaded from: classes3.dex */
public final class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.a0 f22468d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.x f22469e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.vg f22470f;

    public z(bm2.a0 a0Var, bm2.x xVar, dk2.vg vgVar) {
        this.f22468d = a0Var;
        this.f22469e = xVar;
        this.f22470f = vgVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorMusicSearchAdapter$bindMusicItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bm2.a0 a0Var = this.f22468d;
        dk2.p Z6 = ((mm2.c1) a0Var.f21748e.business(mm2.c1.class)).Z6();
        boolean z17 = Z6.f233876e.size() < Z6.f233872a;
        com.tencent.mars.xlog.Log.i("FinderLiveAnchorMusicData", "songId size:" + Z6.f233876e.size() + ", musicList id size:" + Z6.f233877f.size() + ", canAddMusic :" + z17);
        bm2.x xVar = this.f22469e;
        if (!z17) {
            db5.t7.makeText(xVar.itemView.getContext(), xVar.itemView.getContext().getResources().getString(com.tencent.mm.R.string.d4x), 0).show();
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorMusicSearchAdapter$bindMusicItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        dk2.vg vgVar = this.f22470f;
        if (vgVar.f234256c == 51) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorMusicSearchAdapter$bindMusicItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        vgVar.f234256c = 51;
        sf2.e0 e0Var = a0Var.f21748e;
        r45.d22 d22Var = new r45.d22();
        r45.d22 d22Var2 = vgVar.f234254a;
        java.lang.String string = d22Var2.getString(1);
        java.lang.Integer num = null;
        d22Var.set(1, string != null ? bm2.a0.x(a0Var, string) : null);
        java.lang.String string2 = d22Var2.getString(2);
        d22Var.set(2, string2 != null ? bm2.a0.x(a0Var, string2) : null);
        d22Var.set(12, java.lang.Integer.valueOf(d22Var2.getInteger(12)));
        d22Var.set(10, java.lang.Integer.valueOf(d22Var2.getInteger(10)));
        d22Var.set(0, java.lang.Integer.valueOf(d22Var2.getInteger(0)));
        d22Var.set(3, d22Var2.getString(3));
        d22Var.set(4, d22Var2.getString(4));
        d22Var.set(5, d22Var2.getString(5));
        d22Var.set(11, java.lang.Boolean.valueOf(d22Var2.getBoolean(11)));
        d22Var.set(9, d22Var2.getString(9));
        d22Var.set(6, java.lang.Boolean.valueOf(d22Var2.getBoolean(6)));
        d22Var.set(8, d22Var2.getString(8));
        d22Var.set(7, d22Var2.getString(7));
        dk2.vg vgVar2 = new dk2.vg(d22Var, vgVar.f234255b, vgVar.f234256c, vgVar.f234257d, vgVar.f234258e, 0L, 32, null);
        e0Var.getClass();
        ((mm2.c1) e0Var.business(mm2.c1.class)).Z6().a(vgVar2, false);
        qo0.b bVar = qo0.b.K2;
        android.os.Bundle bundle = new android.os.Bundle();
        r45.d22 d22Var3 = vgVar2.f234254a;
        bundle.putString("PARAM_FINDER_LIVE_MUSIC_ID", dk2.q.e(d22Var3));
        e0Var.X6(bVar, bundle);
        long j17 = ((mm2.e1) e0Var.business(mm2.e1.class)).f328988r.getLong(0);
        byte[] bArr = ((mm2.e1) e0Var.business(mm2.e1.class)).f328985o;
        java.lang.String e17 = xy2.c.e(e0Var.O6());
        long j18 = ((mm2.e1) e0Var.business(mm2.e1.class)).f328983m;
        r45.xl1 f17 = ((mm2.c1) e0Var.business(mm2.c1.class)).Z6().f();
        new ek2.p1(j17, bArr, e17, j18, f17, 3, new xl2.a(j17, bArr, e17, j18, f17)).l();
        df2.od odVar = (df2.od) e0Var.controller(df2.od.class);
        if (odVar != null) {
            odVar.e7(r45.n72.kActionType_SetBackGroundMusic);
        }
        te2.d4 d4Var = te2.d4.f417948a;
        boolean a86 = ((mm2.c1) e0Var.business(mm2.c1.class)).a8();
        ml2.u2[] u2VarArr = ml2.u2.f328109d;
        d4Var.a(a86, 2, dk2.q.e(d22Var3), e0Var.f407115q);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", 4);
        com.tencent.mm.plugin.finder.live.widget.i8 i8Var = e0Var.f407111m;
        if (i8Var != null) {
            if (i8Var.W) {
                i17 = 4;
            } else {
                int i18 = i8Var.T;
                i17 = (i18 < 0 || i18 >= i8Var.X.size()) ? 0 : ((te2.u1) i8Var.X.get(i8Var.T)).getType().f390089d;
            }
            num = java.lang.Integer.valueOf(i17);
        }
        jSONObject.put("tab_type", num);
        jSONObject.put("base_listenid", d22Var3.getString(9));
        java.lang.String str = e0Var.f407115q;
        if (!(str == null || str.length() == 0)) {
            jSONObject.put("ai_msg_id", e0Var.f407115q);
        }
        if (dk2.ef.f233372a.x()) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.O1, jSONObject.toString(), null, 4, null);
        } else {
            i95.m c18 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c18;
            ml2.c1 c1Var = ml2.c1.f327325e;
            zy2.zb.j5(zbVar, 48L, jSONObject.toString(), null, 4, null);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = xVar.f22423g;
        kotlin.jvm.internal.o.f(weImageView, "<get-musicFavTips>(...)");
        a0Var.y(weImageView, true);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorMusicSearchAdapter$bindMusicItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
