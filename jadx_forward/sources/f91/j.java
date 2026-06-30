package f91;

/* loaded from: classes13.dex */
public class j implements f91.a {
    @Override // f91.a
    public boolean a(android.graphics.Path path, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.p1042x346425.C11791x6a1daa2a c11791x6a1daa2a) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.p1042x346425.C11800xe03b6e09 c11800xe03b6e09 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.p1042x346425.C11800xe03b6e09) c11791x6a1daa2a;
        if (c11791x6a1daa2a == null) {
            return false;
        }
        path.quadTo(c11800xe03b6e09.f158690e, c11800xe03b6e09.f158691f, c11800xe03b6e09.f158692g, c11800xe03b6e09.f158693h);
        return true;
    }

    @Override // f91.a
    public boolean b(android.graphics.Path path, org.json.JSONArray jSONArray) {
        if (jSONArray.length() < 4) {
            return false;
        }
        path.quadTo(ik1.w.g(jSONArray, 0), ik1.w.g(jSONArray, 1), ik1.w.g(jSONArray, 2), ik1.w.g(jSONArray, 3));
        return true;
    }

    @Override // f91.a
    /* renamed from: getMethod */
    public java.lang.String mo129197x24dcf3d7() {
        return "quadraticCurveTo";
    }
}
