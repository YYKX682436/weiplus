package bg3;

/* loaded from: classes3.dex */
public final class c implements zb0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f102254a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bg3.e f102255b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mf3.k f102256c;

    public c(java.lang.String str, bg3.e eVar, mf3.k kVar) {
        this.f102254a = str;
        this.f102255b = eVar;
        this.f102256c = kVar;
    }

    @Override // zb0.a0
    public void a(java.lang.String srcPath, java.lang.String destPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(srcPath, "srcPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(destPath, "destPath");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.DefaultSaveComponent", "save video success, srcPath: " + this.f102254a + " , destPath: " + destPath);
        bg3.e eVar = this.f102255b;
        eVar.getClass();
        ((ku5.t0) ku5.t0.f394148d).B(new bg3.d(eVar));
        q75.c.f(destPath, eVar.m158354x19263085());
        eVar.W6(this.f102256c, destPath);
    }

    @Override // zb0.a0
    public void b(java.lang.String srcPath, java.lang.String destPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(srcPath, "srcPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(destPath, "destPath");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.DefaultSaveComponent", "save video failed, srcPath: " + this.f102254a + " , destPath: " + destPath);
        bg3.e eVar = this.f102255b;
        dp.a.m125854x26a183b(eVar.m80379x76847179(), eVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573728o51), 1).show();
    }
}
