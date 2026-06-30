package f91;

/* loaded from: classes13.dex */
public class k implements f91.a {
    @Override // f91.a
    public boolean a(android.graphics.Path path, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.p1042x346425.C11791x6a1daa2a c11791x6a1daa2a) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.p1042x346425.C11801x5eeaa677 c11801x5eeaa677 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.p1042x346425.C11801x5eeaa677) c11791x6a1daa2a;
        if (c11801x5eeaa677 == null) {
            return false;
        }
        float f17 = c11801x5eeaa677.f158694e;
        float f18 = c11801x5eeaa677.f158695f;
        path.addRect(f17, f18, f17 + c11801x5eeaa677.f158696g, f18 + c11801x5eeaa677.f158697h, android.graphics.Path.Direction.CW);
        return true;
    }

    @Override // f91.a
    public boolean b(android.graphics.Path path, org.json.JSONArray jSONArray) {
        if (jSONArray.length() < 4) {
            return false;
        }
        float g17 = ik1.w.g(jSONArray, 0);
        float g18 = ik1.w.g(jSONArray, 1);
        path.addRect(g17, g18, g17 + ik1.w.g(jSONArray, 2), g18 + ik1.w.g(jSONArray, 3), android.graphics.Path.Direction.CW);
        return true;
    }

    @Override // f91.a
    /* renamed from: getMethod */
    public java.lang.String mo129197x24dcf3d7() {
        return "rect";
    }
}
