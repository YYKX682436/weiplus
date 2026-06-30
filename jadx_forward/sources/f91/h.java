package f91;

/* loaded from: classes13.dex */
public class h implements f91.a {
    @Override // f91.a
    public boolean a(android.graphics.Path path, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.p1042x346425.C11791x6a1daa2a c11791x6a1daa2a) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.p1042x346425.C11798x1164606c c11798x1164606c = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.p1042x346425.C11798x1164606c) c11791x6a1daa2a;
        if (c11798x1164606c == null) {
            return false;
        }
        path.lineTo(c11798x1164606c.f158686e, c11798x1164606c.f158687f);
        return true;
    }

    @Override // f91.a
    public boolean b(android.graphics.Path path, org.json.JSONArray jSONArray) {
        if (jSONArray.length() < 2) {
            return false;
        }
        path.lineTo(ik1.w.g(jSONArray, 0), ik1.w.g(jSONArray, 1));
        return true;
    }

    @Override // f91.a
    /* renamed from: getMethod */
    public java.lang.String mo129197x24dcf3d7() {
        return "lineTo";
    }
}
