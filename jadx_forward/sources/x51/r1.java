package x51;

/* loaded from: classes11.dex */
public class r1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f533610a;

    /* renamed from: b, reason: collision with root package name */
    public final int f533611b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f533612c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f533613d;

    public r1(int i17, int i18, java.lang.String str) {
        java.lang.String str2;
        java.lang.Exception exc;
        int i19;
        java.util.Map d17;
        java.lang.String str3 = "";
        int i27 = 0;
        try {
            d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "e", null);
        } catch (java.lang.Exception e17) {
            str2 = "";
            exc = e17;
            i19 = 0;
        }
        if (d17 == null) {
            throw new java.lang.IllegalArgumentException("values == null");
        }
        int i28 = java.lang.Integer.valueOf((java.lang.String) d17.get(".e.ShowType")).intValue();
        try {
            i27 = java.lang.Integer.valueOf((java.lang.String) d17.get(".e.Action")).intValue();
            java.lang.Integer.valueOf((java.lang.String) d17.get(".e.DispSec")).intValue();
            str2 = (java.lang.String) d17.get(".e.Url");
        } catch (java.lang.Exception e18) {
            e = e18;
            str2 = "";
        }
        try {
            str3 = (java.lang.String) d17.get(".e.Content");
        } catch (java.lang.Exception e19) {
            e = e19;
            java.lang.Exception exc2 = e;
            i19 = i27;
            i27 = i28;
            exc = exc2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UnifyErrorProcessor", exc.toString());
            i28 = i27;
            i27 = i19;
            this.f533610a = i28;
            this.f533611b = i27;
            this.f533612c = str3;
            this.f533613d = str2;
        }
        this.f533610a = i28;
        this.f533611b = i27;
        this.f533612c = str3;
        this.f533613d = str2;
    }
}
