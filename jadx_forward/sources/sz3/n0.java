package sz3;

/* loaded from: classes15.dex */
public final class n0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sz3.c1 f495609d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sz3.a1 f495610e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sz3.v0 f495611f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f495612g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f495613h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(sz3.c1 c1Var, sz3.a1 a1Var, sz3.v0 v0Var, int i17, int i18) {
        super(3);
        this.f495609d = c1Var;
        this.f495610e = a1Var;
        this.f495611f = v0Var;
        this.f495612g = i17;
        this.f495613h = i18;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        byte[] uploadImageData = (byte[]) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        int intValue2 = ((java.lang.Number) obj3).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uploadImageData, "uploadImageData");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1259, 247);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MixScanGoodsImageHandler", "handleClickProduct uploadImageData: " + uploadImageData.length + ", width: " + intValue + ", height: " + intValue2);
        sz3.c1 c1Var = this.f495609d;
        if (c1Var.f495509c == 0) {
            c1Var.f495509c = 1001;
        }
        sz3.p pVar = new sz3.p(this.f495610e, 1, uploadImageData, intValue, intValue2);
        pVar.f495480d = c1Var.f495507a;
        pVar.f495479c = c1Var.f495508b;
        pVar.f495481e = c1Var.f495509c;
        sz3.z0 z0Var = new sz3.z0(this.f495612g, this.f495613h);
        pVar.f495483g = z0Var;
        r45.sk6 sk6Var = new r45.sk6();
        sz3.a1 a1Var = this.f495610e;
        float x17 = a1Var.f495492a.getX1();
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.C17282x335f2f60 c17282x335f2f60 = a1Var.f495492a;
        float f17 = 2;
        sk6Var.f467351d = (x17 + c17282x335f2f60.getX2()) / f17;
        sk6Var.f467352e = (c17282x335f2f60.getY1() + c17282x335f2f60.getY2()) / f17;
        z0Var.f495714c = sk6Var;
        pVar.f495622k = false;
        this.f495611f.f495661h.n(pVar);
        return jz5.f0.f384359a;
    }
}
