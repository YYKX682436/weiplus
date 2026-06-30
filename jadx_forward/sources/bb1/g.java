package bb1;

/* loaded from: classes7.dex */
public final class g extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f4187x366c91de = 1093;

    /* renamed from: NAME */
    public static final java.lang.String f4188x24728b = "releaseInferenceSession";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (lVar == null) {
            return;
        }
        int optInt = jSONObject != null ? jSONObject.optInt(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, -1) : -1;
        java.lang.String mo48798x74292566 = lVar.mo48798x74292566();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo48798x74292566, "getAppId(...)");
        ((ku5.t0) ku5.t0.f394148d).b(new bb1.f(optInt, lVar, i17, this), "SessionRunnerGuard+" + mo48798x74292566 + '+' + optInt);
    }
}
