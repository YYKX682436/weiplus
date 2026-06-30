package nd1;

/* loaded from: classes7.dex */
public class k2 extends nd1.e0 {

    /* renamed from: CTRL_INDEX */
    @java.lang.Deprecated
    public static final int f72953x366c91de = 584;

    /* renamed from: NAME */
    @java.lang.Deprecated
    public static final java.lang.String f72954x24728b = "private_setPageOrientation";

    public k2() {
        super(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.dc.class);
    }

    @Override // nd1.e0
    public void C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y env, org.json.JSONObject data, int i17, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.dc ext = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.dc) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ext, "ext");
        java.lang.String optString = data.optString("orientation", null);
        if (optString == null) {
            env.a(i17, o("fail:invalid data"));
            return;
        }
        if (xi1.o.d(optString) == null) {
            env.a(i17, o("fail:invalid data"));
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(k(), optString);
        ext.l(optString, hashMap);
        env.a(i17, o("ok"));
    }
}
