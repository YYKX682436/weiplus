package nd1;

/* loaded from: classes7.dex */
public class s0 extends nd1.e0 {

    /* renamed from: CTRL_INDEX */
    public static final int f72973x366c91de = 453;

    /* renamed from: NAME */
    public static final java.lang.String f72974x24728b = "setBackgroundColor";

    public s0() {
        super(ni1.h.class);
    }

    @Override // nd1.e0
    public void C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, org.json.JSONObject jSONObject, int i17, java.lang.Object obj) {
        try {
            ((ni1.h) obj).h(ni1.g.IGNORE, ik1.w.l(jSONObject.optString("backgroundColor", "")));
            yVar.a(i17, o("ok"));
        } catch (java.lang.Exception unused) {
            yVar.a(i17, o("fail:invalid color"));
        }
    }
}
