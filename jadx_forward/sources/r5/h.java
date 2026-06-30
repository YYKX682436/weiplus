package r5;

/* loaded from: classes13.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r5.i f474057d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(r5.i iVar) {
        super(0);
        this.f474057d = iVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        long j17;
        l36.p0 p0Var = new l36.p0();
        android.content.Context context = this.f474057d.f474058a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.io.File file = new java.io.File(context.getCacheDir(), "image_cache");
        file.mkdirs();
        try {
            android.os.StatFs statFs = new android.os.StatFs(file.getAbsolutePath());
            j17 = e06.p.h((long) (statFs.getBlockCountLong() * 0.02d * statFs.getBlockSizeLong()), 10485760L, 262144000L);
        } catch (java.lang.Exception unused) {
            j17 = 10485760;
        }
        p0Var.f397102j = new l36.j(file, j17);
        p0Var.f397103k = null;
        return new l36.q0(p0Var);
    }
}
