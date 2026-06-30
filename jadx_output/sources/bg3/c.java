package bg3;

/* loaded from: classes3.dex */
public final class c implements zb0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f20721a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bg3.e f20722b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mf3.k f20723c;

    public c(java.lang.String str, bg3.e eVar, mf3.k kVar) {
        this.f20721a = str;
        this.f20722b = eVar;
        this.f20723c = kVar;
    }

    @Override // zb0.a0
    public void a(java.lang.String srcPath, java.lang.String destPath) {
        kotlin.jvm.internal.o.g(srcPath, "srcPath");
        kotlin.jvm.internal.o.g(destPath, "destPath");
        com.tencent.mars.xlog.Log.i("MediaGallery.DefaultSaveComponent", "save video success, srcPath: " + this.f20721a + " , destPath: " + destPath);
        bg3.e eVar = this.f20722b;
        eVar.getClass();
        ((ku5.t0) ku5.t0.f312615d).B(new bg3.d(eVar));
        q75.c.f(destPath, eVar.getActivity());
        eVar.W6(this.f20723c, destPath);
    }

    @Override // zb0.a0
    public void b(java.lang.String srcPath, java.lang.String destPath) {
        kotlin.jvm.internal.o.g(srcPath, "srcPath");
        kotlin.jvm.internal.o.g(destPath, "destPath");
        com.tencent.mars.xlog.Log.e("MediaGallery.DefaultSaveComponent", "save video failed, srcPath: " + this.f20721a + " , destPath: " + destPath);
        bg3.e eVar = this.f20722b;
        dp.a.makeText(eVar.getContext(), eVar.getContext().getString(com.tencent.mm.R.string.f492195o51), 1).show();
    }
}
