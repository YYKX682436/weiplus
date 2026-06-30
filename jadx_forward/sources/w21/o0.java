package w21;

/* loaded from: classes5.dex */
public class o0 implements q25.a {
    @Override // q25.a
    public boolean a(android.content.Context context, java.lang.String[] strArr, java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3 = strArr[0];
        str3.getClass();
        if (!str3.equals("//voicetrymore") || strArr.length <= 1 || (str2 = strArr[1]) == null) {
            return false;
        }
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str2, 1);
        tl.q0.f501624t = P == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreVoice", "summervoicetrymore enable[%d]", java.lang.Integer.valueOf(P));
        return true;
    }
}
