package y80;

/* loaded from: classes3.dex */
public final class d1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f541369d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y80.e1 f541370e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f541371f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z80.q0 f541372g;

    public d1(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var, y80.e1 e1Var, android.content.Context context, z80.q0 q0Var) {
        this.f541369d = y1Var;
        this.f541370e = e1Var;
        this.f541371f = context;
        this.f541372g = q0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/location/POICorrectLogicService$showCorrectGuideView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f541369d.q();
        this.f541370e.getClass();
        android.content.Context context = this.f541371f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        z80.q0 actionInfo = this.f541372g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionInfo, "actionInfo");
        if (i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.POICorrectLogicService", "jumpTencentMapWeAppForCorrect: failed");
        } else {
            r45.aq aqVar = new r45.aq();
            aqVar.f451715e = "wx7643d5f831302ab0";
            aqVar.f451719i = "modules/ugc/pages/index/index.html";
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6 h6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class);
            l81.b1 b1Var = new l81.b1();
            b1Var.f398547b = aqVar.f451715e;
            b1Var.f398545a = aqVar.f451714d;
            b1Var.f398549c = 0;
            b1Var.f398551d = aqVar.f451720m;
            java.lang.String page_url = aqVar.f451719i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(page_url, "page_url");
            android.net.Uri.Builder buildUpon = android.net.Uri.parse(page_url).buildUpon();
            buildUpon.appendQueryParameter("src", "wxlocation");
            buildUpon.appendQueryParameter("latitude", java.lang.String.valueOf(actionInfo.f552197e));
            buildUpon.appendQueryParameter("longitude", java.lang.String.valueOf(actionInfo.f552196d));
            buildUpon.appendQueryParameter(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, actionInfo.f552194b);
            buildUpon.appendQueryParameter("address", actionInfo.f552195c);
            if (r26.i0.A(actionInfo.f552193a, "qqmap_", false, 2, null)) {
                buildUpon.appendQueryParameter("poi_id", r26.i0.v(actionInfo.f552193a, "qqmap_", "", false, 4, null));
            }
            java.lang.String uri = buildUpon.build().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uri, "toString(...)");
            b1Var.f398555f = uri;
            b1Var.f398565k = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.u1.f33827x366c91de;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) h6Var).bj(context, b1Var);
        }
        yj0.a.h(this, "com/tencent/mm/feature/location/POICorrectLogicService$showCorrectGuideView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
