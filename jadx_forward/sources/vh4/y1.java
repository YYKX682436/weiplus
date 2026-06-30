package vh4;

/* loaded from: classes9.dex */
public class y1 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f518719a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f518720b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f518721c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f518722d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f518723e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.z3 f518724f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ byte[] f518725g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f518726h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k f518727i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ vh4.t1 f518728j;

    public y1(vh4.t1 t1Var, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, byte[] bArr, android.content.Context context, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k kVar) {
        this.f518728j = t1Var;
        this.f518719a = str;
        this.f518720b = str2;
        this.f518721c = i17;
        this.f518722d = str3;
        this.f518723e = str4;
        this.f518724f = z3Var;
        this.f518725g = bArr;
        this.f518726h = context;
        this.f518727i = kVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j
    public void a(boolean z17, java.lang.String str, int i17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k kVar = this.f518727i;
        vh4.t1 t1Var = this.f518728j;
        if (!z17) {
            t1Var.getClass();
            if (kVar != null) {
                kVar.a(false);
                return;
            }
            return;
        }
        ot0.q qVar = new ot0.q();
        qVar.f430187f = this.f518719a;
        qVar.f430191g = this.f518720b;
        qVar.f430207k = "https://support.weixin.qq.com/update/";
        qVar.f430267z = "http://wxapp.tc.qq.com/251/20304/stodownload?m=adb36df21d075a4c2148a2c0fc361304&filekey=30450201010420301e020200fb0402535a0410adb36df21d075a4c2148a2c0fc3613040202188a041e000000046274667300000001310000000861707073746f72650000000131&hy=SZ&storeid=32303231303932383030353631353030303362636238303062633631346565633763333930613030303030306662&dotrans=0&sourceflag=1&bizid=1023&adaptivelytrans=0";
        int i18 = this.f518721c;
        qVar.f430199i = i18 < 7 ? 84 : 103;
        rt0.e eVar = new rt0.e();
        eVar.f480912d = i18;
        eVar.f480911c = this.f518722d;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.String str2 = this.f518723e;
        if (str2 == null) {
            str2 = "";
        }
        eVar.f480913e = str2;
        qVar.f(eVar);
        ot0.k1 a17 = ot0.j1.a();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f518724f;
        java.lang.String d17 = z3Var.d1();
        byte[] bArr = this.f518725g;
        ((ez.w0) a17).getClass();
        android.util.Pair I = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.I(qVar, "", "", d17, "", bArr);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            ((dk5.s5) tg3.t1.a()).fj(z3Var.d1(), str, c01.e2.C(z3Var.d1()), 0);
        }
        long longValue = ((java.lang.Long) I.second).longValue();
        if (longValue > 0) {
            android.content.Context context = this.f518726h;
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new vh4.x1(this, longValue, db5.e1.Q(context, "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572085yb), true, false, null), z17), true).c(0L, 1000L);
        } else {
            t1Var.getClass();
            if (kVar != null) {
                kVar.a(false);
            }
        }
    }
}
