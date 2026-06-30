package nd1;

/* loaded from: classes7.dex */
public class n extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1 {

    /* renamed from: CTRL_INDEX */
    public static final int f72961x366c91de = -2;

    /* renamed from: NAME */
    public static final java.lang.String f72962x24728b = "initReady";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public java.lang.String z(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, org.json.JSONObject jSONObject) {
        java.lang.String mo48798x74292566 = yVar.mo48798x74292566();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t37 = yVar.t3();
        nd1.m mVar = new nd1.m(this, yVar, jSONObject, mo48798x74292566);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ff ffVar = t37.f156332h;
        android.os.Handler handler = ffVar.f159587b;
        if (handler != null) {
            handler.postAtFrontOfQueue(mVar);
        } else {
            ffVar.f159586a.mo50294x9395cba4(mVar);
        }
        return o("ok");
    }
}
