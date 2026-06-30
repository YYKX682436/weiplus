package mx0;

/* loaded from: classes5.dex */
public final class x5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced f413964d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p907x2eba90.C10986x82320575 f413965e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 f413966f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p907x2eba90.C10986x82320575 c10986x82320575, p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787) {
        super(1);
        this.f413964d = c10977x8e40eced;
        this.f413965e = c10986x82320575;
        this.f413966f = c1073x7e08a787;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4023x59e5ad63 desc = (com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4023x59e5ad63) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced = this.f413964d;
        yx0.b8 b8Var = c10977x8e40eced.f151090v;
        mx0.w5 w5Var = new mx0.w5(this.f413965e, this.f413966f, c10977x8e40eced);
        b8Var.getClass();
        mx0.e1 e1Var = b8Var.X1;
        if (e1Var != null) {
            if (e1Var.f413468b != mx0.d0.f413433n) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MaterialImportHelper", "exitImportCrop: importPreviewState " + e1Var.f413468b);
                w5Var.mo146xb9724478(java.lang.Boolean.FALSE);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaterialImportHelper", "exitImportCrop: importPreviewState " + e1Var.f413468b);
                e1Var.f(mx0.d0.f413434o);
                p3325xe03a0797.p3326xc267989b.l.d(e1Var.f413471e, null, null, new mx0.o0(e1Var, desc, w5Var, null), 3, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
