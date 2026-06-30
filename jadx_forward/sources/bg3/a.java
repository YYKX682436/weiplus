package bg3;

/* loaded from: classes3.dex */
public final class a implements zb0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bg3.e f102248a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f102249b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f102250c;

    public a(bg3.e eVar, java.lang.String str, java.lang.String str2) {
        this.f102248a = eVar;
        this.f102249b = str;
        this.f102250c = str2;
    }

    @Override // zb0.a0
    public void a(java.lang.String srcPath, java.lang.String destPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(srcPath, "srcPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(destPath, "destPath");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.DefaultSaveComponent", "save image success, srcPath: " + srcPath + " , destPath: " + destPath);
        bg3.e eVar = this.f102248a;
        eVar.getClass();
        ((ku5.t0) ku5.t0.f394148d).B(new bg3.d(eVar));
        java.lang.String str = this.f102249b;
        java.lang.String str2 = this.f102250c;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, str2)) {
            return;
        }
        com.p314xaae8f345.mm.vfs.w6.h(str2);
    }

    @Override // zb0.a0
    public void b(java.lang.String srcPath, java.lang.String destPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(srcPath, "srcPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(destPath, "destPath");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.DefaultSaveComponent", "save image failed, srcPath: " + srcPath + " , destPath: " + destPath);
        bg3.e eVar = this.f102248a;
        dp.a.m125854x26a183b(eVar.m80379x76847179(), eVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i87), 1).show();
        java.lang.String str = this.f102249b;
        java.lang.String str2 = this.f102250c;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, str2)) {
            return;
        }
        com.p314xaae8f345.mm.vfs.w6.h(str2);
    }
}
