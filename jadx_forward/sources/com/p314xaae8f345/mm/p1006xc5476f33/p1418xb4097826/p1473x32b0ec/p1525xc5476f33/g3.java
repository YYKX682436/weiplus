package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes.dex */
public final class g3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 f194159d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f194160e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f194161f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f194162g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 v3Var, km2.b bVar, boolean z17, boolean z18, boolean z19) {
        super(2);
        this.f194159d = v3Var;
        this.f194160e = z17;
        this.f194161f = z18;
        this.f194162g = z19;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Integer num = (java.lang.Integer) obj;
        java.lang.String str = (java.lang.String) obj2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 v3Var = this.f194159d;
        if (num != null && num.intValue() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3.x1(v3Var, 3);
            km2.b bVar = v3Var.S;
            r45.sl1 sl1Var = bVar != null ? bVar.f390604u : null;
            if (sl1Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.LiveAnchorAfterPlugin", "shouldShowAutoGenWidget:autoGenReplayOption is null, return false");
            } else {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("FINDER_LIVE_MMKV");
                boolean z17 = sl1Var.m75939xb282bd08(0) == 1 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(M != null ? java.lang.Boolean.valueOf(M.getBoolean("HAS_SHOW_AUTO_GEN_REPLAY_ID", false)) : null, java.lang.Boolean.FALSE);
                sl1Var.m75939xb282bd08(0);
                r1 = z17;
            }
            android.view.ViewGroup viewGroup = v3Var.f446856d;
            if (r1) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showSetAutoReplayGenWidget() called with: needDanmu=");
                boolean z18 = this.f194160e;
                sb6.append(z18);
                sb6.append(", onlyMember=");
                boolean z19 = this.f194161f;
                sb6.append(z19);
                sb6.append(", genHighlight=");
                boolean z27 = this.f194162g;
                sb6.append(z27);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveAnchorAfterPlugin", sb6.toString());
                if (v3Var.V == null) {
                    android.content.Context context = viewGroup.getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                    v3Var.V = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.l8(context, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o3(v3Var, z18, z19, z27));
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveAnchorAfterPlugin", "showSetAutoReplayGenWidget");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.l8 l8Var = v3Var.V;
                if (l8Var != null) {
                    l8Var.w();
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveAnchorAfterPlugin", "shouldShowAutoGenWidget returned false, skipping widget display");
            }
            java.lang.String string = viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nun);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            android.content.Context context2 = viewGroup.getContext();
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context2);
            e4Var.f293309c = string;
            e4Var.b(com.p314xaae8f345.mm.R.raw.f78821xb211a201);
            e4Var.c();
        } else {
            if (str == null || str.length() == 0) {
                java.lang.String string2 = v3Var.f446856d.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e6x);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                android.content.Context context3 = v3Var.f446856d.getContext();
                int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context3);
                e4Var2.f293309c = string2;
                e4Var2.c();
            }
        }
        return jz5.f0.f384359a;
    }
}
