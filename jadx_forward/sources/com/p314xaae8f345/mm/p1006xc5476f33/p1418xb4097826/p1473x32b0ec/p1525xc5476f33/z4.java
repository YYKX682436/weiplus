package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class z4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a5 f196813d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a5 a5Var) {
        super(0);
        this.f196813d = a5Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a5 a5Var = this.f196813d;
        a5Var.w1();
        android.view.ViewGroup viewGroup = a5Var.f446856d;
        android.content.Context context = viewGroup.getContext();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 ? (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context : null;
        ll2.e eVar = ll2.e.f400666a;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa1122 = activityC0065xcd7aa112;
        ll2.e.l(eVar, activityC0065xcd7aa1122, a5Var.D1(), a5Var.I, a5Var.H, null, 16, null);
        ll2.e.l(eVar, activityC0065xcd7aa1122, a5Var.E1(), a5Var.f193343z, a5Var.A, null, 16, null);
        ll2.e.l(eVar, activityC0065xcd7aa1122, a5Var.G1(), a5Var.f193335t, a5Var.f193336u, null, 16, null);
        ll2.e.l(eVar, activityC0065xcd7aa1122, a5Var.F1(), a5Var.R, a5Var.S, null, 16, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a5.u1(a5Var, true);
        if (((mm2.c1) a5Var.P0(mm2.c1.class)).l7()) {
            a5Var.B1(null);
        } else {
            long E0 = zl2.r4.f555483a.E0(a5Var.S0());
            boolean A = pm0.v.A(E0, 256L);
            boolean A2 = pm0.v.A(E0, 512L);
            int size = je2.g.S6((je2.g) a5Var.P0(je2.g.class), false, 1, null).size();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveAnchorCameraOptPanelPlugin", "checkStickerEntranceVisible liveFunSwitchFlags:" + E0 + ",enableTextSticker:" + A + ",enablePictureSticker:" + A2 + ",textBubbleSize:" + size + '!');
            android.widget.RelativeLayout relativeLayout = a5Var.f193337v;
            if ((!A || size <= 0) && !A2) {
                relativeLayout.setVisibility(8);
            } else {
                relativeLayout.setVisibility(0);
            }
            a5Var.f193340x0 = 1;
            viewGroup.setVisibility(0);
            viewGroup.animate().translationY(0.0f).setDuration(200L).setListener(null).start();
            android.view.ViewGroup viewGroup2 = a5Var.D;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(viewGroup2, "access$getMenuBeauty$p(...)");
            a5Var.J1(viewGroup2, ml2.u1.V, a5Var.I1() ? "anchorlive.bottom.videosetting.beauty" : "startlive.bottom.videosetting.beauty");
            android.view.ViewGroup viewGroup3 = a5Var.f193338w;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(viewGroup3, "access$getMenuMirror$p(...)");
            a5Var.J1(viewGroup3, ml2.u1.W, a5Var.E1());
            android.view.ViewGroup viewGroup4 = a5Var.f193334s;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(viewGroup4, "access$getMenuSwitchCamera$p(...)");
            a5Var.J1(viewGroup4, ml2.u1.X, a5Var.G1());
            android.view.View view = a5Var.L;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(view, "access$getChangeModeView$p(...)");
            a5Var.J1(view, ml2.u1.f409605p0, null);
            eVar.j(a5Var.I1() ? "anchorlive.bottom.videosetting.makeup" : "startlive.bottom.videosetting.makeup", false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.fe.b(a5Var.X, 1, null, null, 0L, 14, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sv.b(a5Var.Y, 1, null, null, 0L, 14, null);
            if (relativeLayout.getVisibility() == 0) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("type", 1);
                java.lang.String jSONObject2 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                if (((mm2.c1) a5Var.P0(mm2.c1.class)).S) {
                    i95.m c17 = i95.n0.c(ml2.j0.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    zy2.zb.y6((zy2.zb) c17, ml2.z4.G1, jSONObject2, null, 4, null);
                } else {
                    i95.m c18 = i95.n0.c(ml2.j0.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                    zy2.zb zbVar = (zy2.zb) c18;
                    ml2.c1 c1Var = ml2.c1.f408858e;
                    zy2.zb.j5(zbVar, 39L, jSONObject2, null, 4, null);
                }
            }
            if (a5Var.Q.getVisibility() == 0) {
                eVar.j(a5Var.F1(), false);
            }
            if (a5Var.G.isShown()) {
                eVar.j(a5Var.D1(), false);
            }
            a5Var.w1();
        }
        return jz5.f0.f384359a;
    }
}
