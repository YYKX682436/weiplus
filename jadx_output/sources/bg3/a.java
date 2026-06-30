package bg3;

/* loaded from: classes3.dex */
public final class a implements zb0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bg3.e f20715a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f20716b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f20717c;

    public a(bg3.e eVar, java.lang.String str, java.lang.String str2) {
        this.f20715a = eVar;
        this.f20716b = str;
        this.f20717c = str2;
    }

    @Override // zb0.a0
    public void a(java.lang.String srcPath, java.lang.String destPath) {
        kotlin.jvm.internal.o.g(srcPath, "srcPath");
        kotlin.jvm.internal.o.g(destPath, "destPath");
        com.tencent.mars.xlog.Log.i("MediaGallery.DefaultSaveComponent", "save image success, srcPath: " + srcPath + " , destPath: " + destPath);
        bg3.e eVar = this.f20715a;
        eVar.getClass();
        ((ku5.t0) ku5.t0.f312615d).B(new bg3.d(eVar));
        java.lang.String str = this.f20716b;
        java.lang.String str2 = this.f20717c;
        if (kotlin.jvm.internal.o.b(str, str2)) {
            return;
        }
        com.tencent.mm.vfs.w6.h(str2);
    }

    @Override // zb0.a0
    public void b(java.lang.String srcPath, java.lang.String destPath) {
        kotlin.jvm.internal.o.g(srcPath, "srcPath");
        kotlin.jvm.internal.o.g(destPath, "destPath");
        com.tencent.mars.xlog.Log.e("MediaGallery.DefaultSaveComponent", "save image failed, srcPath: " + srcPath + " , destPath: " + destPath);
        bg3.e eVar = this.f20715a;
        dp.a.makeText(eVar.getContext(), eVar.getContext().getString(com.tencent.mm.R.string.i87), 1).show();
        java.lang.String str = this.f20716b;
        java.lang.String str2 = this.f20717c;
        if (kotlin.jvm.internal.o.b(str, str2)) {
            return;
        }
        com.tencent.mm.vfs.w6.h(str2);
    }
}
