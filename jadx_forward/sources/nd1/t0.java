package nd1;

/* loaded from: classes7.dex */
public class t0 extends nd1.e0 {

    /* renamed from: CTRL_INDEX */
    public static final int f72975x366c91de = 454;

    /* renamed from: NAME */
    public static final java.lang.String f72976x24728b = "setBackgroundTextStyle";

    public t0() {
        super(ni1.h.class);
    }

    @Override // nd1.e0
    public void C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, org.json.JSONObject jSONObject, int i17, java.lang.Object obj) {
        ((ni1.h) obj).a(jSONObject.optString("textStyle", "IGNORE".toLowerCase()));
        yVar.a(i17, o("ok"));
    }
}
