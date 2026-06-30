package sz3;

/* loaded from: classes15.dex */
public final class m0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f495605d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sz3.a1 f495606e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.q f495607f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, sz3.a1 a1Var, yz5.q qVar) {
        super(0);
        this.f495605d = h0Var;
        this.f495606e = a1Var;
        this.f495607f = qVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        sz3.a1 a1Var = this.f495606e;
        sz3.b1 b1Var = a1Var.f495495d;
        byte[] a17 = b1Var != null ? b1Var.a() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f495605d;
        h0Var.f391656d = a17;
        sz3.b1 b1Var2 = a1Var.f495495d;
        int i17 = b1Var2 != null ? b1Var2.f495501c : 0;
        int i18 = b1Var2 != null ? b1Var2.f495502d : 0;
        int i19 = b1Var2 != null ? b1Var2.f495503e : 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.C17282x335f2f60 c17282x335f2f60 = a1Var.f495492a;
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MixScanGoodsImageHandler", "handleClickProductAff uploadImageData null and use showImageData");
            sz3.b1 b1Var3 = a1Var.f495494c;
            h0Var.f391656d = b1Var3 != null ? b1Var3.a() : null;
            sz3.b1 b1Var4 = a1Var.f495494c;
            i17 = b1Var4 != null ? b1Var4.f495501c : 0;
            i18 = b1Var4 != null ? b1Var4.f495502d : 0;
            int i27 = b1Var4 != null ? b1Var4.f495503e : 0;
            c17282x335f2f60.m68625x68436bb(0.0f);
            c17282x335f2f60.m68627x68436da(0.0f);
            c17282x335f2f60.m68626x68436bc(1.0f);
            c17282x335f2f60.m68628x68436db(1.0f);
            i19 = i27;
        }
        java.lang.Object obj = h0Var.f391656d;
        if (obj != null) {
            a1Var.f495496e.f495702j = ((byte[]) obj).length;
            sz3.y0 y0Var = a1Var.f495496e;
            int i28 = 2;
            if (i17 != 1) {
                if (i17 != 2) {
                    i28 = 3;
                    if (i17 != 3) {
                        i28 = -1;
                    }
                } else {
                    i28 = 1;
                }
            }
            y0Var.f495707o = i28;
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.c cVar = a1Var.f495497f;
            if (cVar != null) {
                cVar.f240362f = 1;
                cVar.f240357a = i28;
                cVar.f240358b = y0Var.f495702j;
            }
            byte[] bArr = (byte[]) h0Var.f391656d;
            if (bArr != null) {
                this.f495607f.mo147xb9724478(bArr, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MixScanGoodsImageHandler", "handleClickProductAff uploadImageData null, id: " + c17282x335f2f60.getId() + ", classId: " + c17282x335f2f60.getClassId());
        }
        return jz5.f0.f384359a;
    }
}
