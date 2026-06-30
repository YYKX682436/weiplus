package sz3;

/* loaded from: classes15.dex */
public final class r0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sz3.v0 f495642d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f495643e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f495644f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Point f495645g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ sz3.a1 f495646h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ sz3.c1 f495647i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(sz3.v0 v0Var, byte[] bArr, int i17, int i18, android.graphics.Point point, sz3.a1 a1Var, sz3.c1 c1Var) {
        super(0);
        this.f495642d = v0Var;
        this.f495643e = bArr;
        this.f495644f = i18;
        this.f495645g = point;
        this.f495646h = a1Var;
        this.f495647i = c1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        sz3.v0 v0Var = this.f495642d;
        byte[] bArr = this.f495643e;
        int i17 = this.f495644f;
        android.graphics.Point point = this.f495645g;
        jz5.l f17 = v0Var.f(bArr, 5, i17, point);
        byte[] bArr2 = (byte[]) f17.f384366d;
        int intValue = ((java.lang.Number) f17.f384367e).intValue();
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleProductDetectedForAff asyncEncodeUploadImage cost: ");
        sb6.append(currentTimeMillis2 - currentTimeMillis);
        sb6.append(", ret: ");
        sb6.append(bArr2 != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MixScanGoodsImageHandler", sb6.toString());
        if (bArr2 != null) {
            sz3.a1 a1Var = this.f495646h;
            sz3.y0 y0Var = a1Var.f495496e;
            y0Var.f495702j = bArr2.length;
            int i18 = 2;
            if (intValue != 1) {
                if (intValue != 2) {
                    i18 = 3;
                    if (intValue != 3) {
                        i18 = -1;
                    }
                } else {
                    i18 = 1;
                }
            }
            y0Var.f495707o = i18;
            sz3.b1 b1Var = new sz3.b1(bArr2);
            b1Var.f495501c = intValue;
            b1Var.f495502d = point.x;
            b1Var.f495503e = point.y;
            a1Var.f495495d = b1Var;
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.c cVar = a1Var.f495497f;
            if (cVar != null) {
                cVar.f240362f = 1;
                sz3.y0 y0Var2 = a1Var.f495496e;
                cVar.f240357a = y0Var2.f495707o;
                cVar.f240358b = y0Var2.f495702j;
            }
            this.f495647i.f495511e = null;
        }
        return jz5.f0.f384359a;
    }
}
