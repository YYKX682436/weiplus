package am3;

@j95.b
/* loaded from: classes.dex */
public final class s extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f90334d = "MicroMsg.Mv.PluginMv";

    public final void Ai(java.lang.String filePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f90334d, "start to handle default video " + filePath + ' ' + com.p314xaae8f345.mm.vfs.w6.k(filePath));
        pm0.v.O("Thread.Music", new am3.q(this, filePath));
    }

    public final void Bi(java.lang.String filePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f90334d, "start to handle pag " + filePath + ' ' + com.p314xaae8f345.mm.vfs.w6.k(filePath));
        pm0.v.O("Thread.Music", new am3.r(filePath, this));
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo836xb8969aab(context);
        fm3.y yVar = fm3.y.f345694a;
        fm3.y.f345695b.clear();
        fm3.y.f345696c.clear();
    }

    public final void wi(java.lang.String filePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f90334d, "start to handle app icon " + filePath + ' ' + com.p314xaae8f345.mm.vfs.w6.k(filePath));
        pm0.v.O("Thread.Music", new am3.p(filePath, this));
    }
}
