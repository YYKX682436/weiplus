package cw1;

/* loaded from: classes12.dex */
public class r6 extends b75.f {
    public r6(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13122x435a878b activityC13122x435a878b, int i17, java.util.Map map, java.lang.String str) {
        super(i17, map, str);
    }

    @Override // b75.f
    public void a() {
        try {
            new org.json.JSONObject(this.f99770c);
            c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CLEANUI_QQMGRINFO_STRING, this.f99770c);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CleanNewUI", e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(714L, 6L, 1L, false);
        }
    }
}
