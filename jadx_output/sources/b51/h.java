package b51;

/* loaded from: classes10.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b51.m f18020d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f18021e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f18022f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f18023g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v65.n f18024h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(b51.m mVar, java.lang.String str, java.lang.String str2, java.lang.String str3, v65.n nVar) {
        super(1);
        this.f18020d = mVar;
        this.f18021e = str;
        this.f18022f = str2;
        this.f18023g = str3;
        this.f18024h = nVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i(this.f18020d.f18041a, "[load] finished tag:" + this.f18021e + ", url:" + this.f18022f + ", path:" + this.f18023g + '}');
        this.f18024h.a((org.libpag.PAGFile) obj);
        return jz5.f0.f302826a;
    }
}
