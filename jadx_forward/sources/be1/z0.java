package be1;

/* loaded from: classes7.dex */
public class z0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f4244x366c91de = 231;

    /* renamed from: NAME */
    public static final java.lang.String f4245x24728b = "vibrateLong";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (lVar.mo48799xc0ccc466() != u81.b.FOREGROUND) {
            lVar.a(i17, o("fail:not allowed in background"));
            return;
        }
        android.os.Vibrator vibrator = (android.os.Vibrator) lVar.mo50352x76847179().getSystemService("vibrator");
        if (vibrator != null) {
            vibrator.vibrate(400L);
        }
        lVar.a(i17, o("ok"));
    }
}
