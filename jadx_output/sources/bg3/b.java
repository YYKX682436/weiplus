package bg3;

/* loaded from: classes3.dex */
public final class b implements zb0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bg3.e f20718a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f20719b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f20720c;

    public b(bg3.e eVar, java.lang.String str, java.lang.String str2) {
        this.f20718a = eVar;
        this.f20719b = str;
        this.f20720c = str2;
    }

    @Override // zb0.a0
    public void a(java.lang.String srcPath, java.lang.String destPath) {
        kotlin.jvm.internal.o.g(srcPath, "srcPath");
        kotlin.jvm.internal.o.g(destPath, "destPath");
        com.tencent.mars.xlog.Log.i("MediaGallery.DefaultSaveComponent", "save translated image success, srcPath: " + srcPath + " , destPath: " + destPath);
        bg3.e eVar = this.f20718a;
        eVar.getClass();
        ((ku5.t0) ku5.t0.f312615d).B(new bg3.d(eVar));
        java.lang.String str = this.f20719b;
        java.lang.String str2 = this.f20720c;
        if (kotlin.jvm.internal.o.b(str, str2)) {
            return;
        }
        com.tencent.mm.vfs.w6.h(str2);
    }

    @Override // zb0.a0
    public void b(java.lang.String srcPath, java.lang.String destPath) {
        kotlin.jvm.internal.o.g(srcPath, "srcPath");
        kotlin.jvm.internal.o.g(destPath, "destPath");
        com.tencent.mars.xlog.Log.e("MediaGallery.DefaultSaveComponent", "save translated image failed, srcPath: " + srcPath + " , destPath: " + destPath);
        bg3.e eVar = this.f20718a;
        dp.a.makeText(eVar.getContext(), eVar.getContext().getString(com.tencent.mm.R.string.i87), 1).show();
        java.lang.String str = this.f20719b;
        java.lang.String str2 = this.f20720c;
        if (kotlin.jvm.internal.o.b(str, str2)) {
            return;
        }
        com.tencent.mm.vfs.w6.h(str2);
    }
}
