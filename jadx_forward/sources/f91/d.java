package f91;

/* loaded from: classes13.dex */
public class d implements f91.a {
    @Override // f91.a
    public boolean a(android.graphics.Path path, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.p1042x346425.C11791x6a1daa2a c11791x6a1daa2a) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.p1042x346425.C11796xcff43f3a c11796xcff43f3a = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.p1042x346425.C11796xcff43f3a) c11791x6a1daa2a;
        if (c11796xcff43f3a == null) {
            return false;
        }
        path.cubicTo(c11796xcff43f3a.f158680e, c11796xcff43f3a.f158681f, c11796xcff43f3a.f158682g, c11796xcff43f3a.f158683h, c11796xcff43f3a.f158684i, c11796xcff43f3a.f158685m);
        return true;
    }

    @Override // f91.a
    public boolean b(android.graphics.Path path, org.json.JSONArray jSONArray) {
        if (jSONArray.length() < 6) {
            return false;
        }
        path.cubicTo(ik1.w.g(jSONArray, 0), ik1.w.g(jSONArray, 1), ik1.w.g(jSONArray, 2), ik1.w.g(jSONArray, 3), ik1.w.g(jSONArray, 4), ik1.w.g(jSONArray, 5));
        return true;
    }

    @Override // f91.a
    /* renamed from: getMethod */
    public java.lang.String mo129197x24dcf3d7() {
        return "bezierCurveTo";
    }
}
