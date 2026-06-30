package b51;

/* loaded from: classes10.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b51.m f18030d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f18031e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f18032f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f18033g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v65.n f18034h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(b51.m mVar, java.lang.String str, java.lang.String str2, java.lang.String str3, v65.n nVar) {
        super(1);
        this.f18030d = mVar;
        this.f18031e = str;
        this.f18032f = str2;
        this.f18033g = str3;
        this.f18034h = nVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i(this.f18030d.f18041a, "[load] finished tag:" + this.f18031e + ", url:" + this.f18032f + ", path:" + this.f18033g + '}');
        this.f18034h.a((com.tencent.mm.rfx.RfxPagFile) obj);
        return jz5.f0.f302826a;
    }
}
