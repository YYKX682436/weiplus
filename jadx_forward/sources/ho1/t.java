package ho1;

/* loaded from: classes15.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f364341d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ho1.v f364342e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f364343f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f364344g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f364345h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f364346i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(java.lang.String str, ho1.v vVar, long j17, long j18, java.lang.String str2, long j19) {
        super(0);
        this.f364341d = str;
        this.f364342e = vVar;
        this.f364343f = j17;
        this.f364344g = j18;
        this.f364345h = str2;
        this.f364346i = j19;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str = this.f364341d;
        long length = new java.io.File(str).length();
        ho1.v vVar = this.f364342e;
        java.lang.String str2 = vVar.f364362a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("uploadFileAsync taskId = ");
        long j17 = this.f364343f;
        sb6.append(j17);
        sb6.append(", go in thread time = ");
        sb6.append(java.lang.System.currentTimeMillis() - this.f364344g);
        sb6.append(",localPath = ");
        sb6.append(str);
        sb6.append(", localFileSize = ");
        sb6.append(length);
        sb6.append(", exist = ");
        sb6.append(new java.io.File(str).exists());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ro1.g gVar = vVar.f364364c;
        if (gVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mUDiskChannel");
            throw null;
        }
        ro1.f k17 = gVar.k(str, this.f364345h, new ho1.s(vVar, this.f364343f, currentTimeMillis, this.f364346i));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(vVar.f364362a, "copy2Udisk errCode = " + k17.f479519d + " uploadFileAsync taskId = " + j17 + ", time = " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + " localPath = " + str + ", localFileSize = " + length + ", exist = " + new java.io.File(str).exists());
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.t0 t0Var = vVar.f364369h;
        if (t0Var != null) {
            t0Var.f1(j17, k17.f479519d);
        }
        return jz5.f0.f384359a;
    }
}
