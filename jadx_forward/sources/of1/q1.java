package of1;

/* loaded from: classes7.dex */
public final class q1 extends com.p314xaae8f345.p3210x3857dc.p3215x21ffc6bd.C27839xa92bc749 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ of1.w1 f426527a;

    public q1(of1.w1 w1Var) {
        this.f426527a = w1Var;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3215x21ffc6bd.C27839xa92bc749
    /* renamed from: onMiscCallBack */
    public java.lang.Object mo52190xdaaffcf0(java.lang.String str, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l m151210xcfccac2b;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || bundle == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b("getCustomHeaders", str)) {
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.HTMLWebViewWithBWC", "method = %s", str);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("getMenuList", str)) {
            java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList<>();
            arrayList.add(1);
            bundle.putIntegerArrayList("menuIds", arrayList);
            java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList<>();
            arrayList2.add("搜一搜");
            bundle.putStringArrayList("menuLabels", arrayList2);
            return bundle;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b("processMenu", str)) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("onJavascriptCloseWindow", str)) {
                return java.lang.Boolean.TRUE;
            }
            return null;
        }
        java.lang.String string = bundle.getString("query");
        int i17 = bundle.getInt("menuId");
        bundle.getString("menuLabel");
        if (1 == i17) {
            m151210xcfccac2b = this.f426527a.m151210xcfccac2b();
            android.content.Context f229340d = m151210xcfccac2b.getF229340d();
            if (f229340d == null) {
                f229340d = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            }
            if (string == null) {
                string = "";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.bwc.C12291xeb50dd93 c12291xeb50dd93 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.bwc.C12291xeb50dd93(string);
            of1.p1 p1Var = of1.p1.f426521a;
            java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.d.f159933a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.W6(f229340d, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.class, c12291xeb50dd93, p1Var, null);
        }
        return null;
    }
}
