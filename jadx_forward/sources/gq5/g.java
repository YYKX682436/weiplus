package gq5;

/* loaded from: classes5.dex */
public final class g implements zb0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gq5.i f356159a;

    public g(gq5.i iVar) {
        this.f356159a = iVar;
    }

    @Override // zb0.a0
    public void a(java.lang.String srcPath, java.lang.String destPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(srcPath, "srcPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(destPath, "destPath");
        com.p314xaae8f345.mm.vfs.w6.h(srcPath);
    }

    @Override // zb0.a0
    public void b(java.lang.String srcPath, java.lang.String destPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(srcPath, "srcPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(destPath, "destPath");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f356159a.f356161m, "exportFile: export fail, srcPath:" + srcPath + ", destPath:" + destPath);
    }
}
