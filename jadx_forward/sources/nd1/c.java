package nd1;

/* loaded from: classes7.dex */
public class c extends nd1.e0 {

    /* renamed from: CTRL_INDEX */
    public static final int f72913x366c91de = 139;

    /* renamed from: NAME */
    public static final java.lang.String f72914x24728b = "disableScrollBounce";

    public c() {
        super(ni1.h.class);
    }

    @Override // nd1.e0
    public void C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, org.json.JSONObject jSONObject, int i17, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) yVar;
        ni1.h hVar = (ni1.h) obj;
        if (!jSONObject.has("disable")) {
            v5Var.a(i17, o("ok"));
            return;
        }
        if (jSONObject.optBoolean("disable", false)) {
            hVar.c(false);
        } else {
            k91.f M1 = v5Var.M1();
            if (M1 == null) {
                hVar.c(false);
            } else {
                hVar.c(M1.f387254j);
            }
        }
        v5Var.a(i17, o("ok"));
    }
}
