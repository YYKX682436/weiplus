package va3;

/* loaded from: classes12.dex */
public class h0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.g6 {

    /* renamed from: d, reason: collision with root package name */
    public byte[] f515833d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f515834e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f515835f;

    /* renamed from: g, reason: collision with root package name */
    public final int f515836g;

    /* renamed from: h, reason: collision with root package name */
    public final int f515837h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f515838i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ va3.i0 f515839m;

    public h0(va3.i0 i0Var, boolean z17, java.lang.String str, java.lang.String str2) {
        this.f515839m = i0Var;
        this.f515834e = "";
        this.f515835f = true;
        this.f515835f = z17;
        this.f515836g = i0Var.f515845h;
        this.f515837h = i0Var.f515846i;
        this.f515834e = str;
        while (true) {
            int i17 = this.f515836g;
            int i18 = this.f515837h;
            if (i17 * i18 <= 270000) {
                break;
            }
            this.f515836g = (int) (i17 / 1.2d);
            this.f515837h = (int) (i18 / 1.2d);
        }
        this.f515838i = str2;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = str;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        objArr[1] = str2 == null ? "" : str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StaticMapServer", "get url %s %s", objArr);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.g6
    public boolean a() {
        byte[] u07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.u0(this.f515834e);
        this.f515833d = u07;
        if (u07 == null) {
            return true;
        }
        com.p314xaae8f345.mm.vfs.w6.S(this.f515838i, u07, 0, u07.length);
        return true;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.g6
    public boolean b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("http onPostExecute ");
        sb6.append(this.f515833d == null);
        sb6.append(" isGoole: ");
        boolean z17 = this.f515835f;
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StaticMapServer", sb6.toString());
        byte[] bArr = this.f515833d;
        va3.i0 i0Var = this.f515839m;
        if (bArr != null) {
            java.lang.String str = va3.i0.f515840m;
            i0Var.b(true, 0);
            return false;
        }
        if (!z17) {
            java.lang.String str2 = va3.i0.f515840m;
            i0Var.b(false, 0);
            return false;
        }
        if (i0Var.f515843f == null) {
            i0Var.b(false, 0);
            return false;
        }
        java.lang.String format = java.lang.String.format(va3.i0.f515840m, java.lang.Integer.valueOf(this.f515836g), java.lang.Integer.valueOf(this.f515837h), java.lang.Float.valueOf(i0Var.f515843f.f524187b), java.lang.Float.valueOf(i0Var.f515843f.f524186a), java.lang.Integer.valueOf(i0Var.f515843f.f524188c));
        this.f515834e = format;
        i0Var.f515841d.a(new va3.h0(i0Var, false, format, va3.i0.a(i0Var.f515843f)));
        return false;
    }
}
