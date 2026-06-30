package am3;

@j95.b
/* loaded from: classes.dex */
public final class s extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f8801d = "MicroMsg.Mv.PluginMv";

    public final void Ai(java.lang.String filePath) {
        kotlin.jvm.internal.o.g(filePath, "filePath");
        com.tencent.mars.xlog.Log.i(this.f8801d, "start to handle default video " + filePath + ' ' + com.tencent.mm.vfs.w6.k(filePath));
        pm0.v.O("Thread.Music", new am3.q(this, filePath));
    }

    public final void Bi(java.lang.String filePath) {
        kotlin.jvm.internal.o.g(filePath, "filePath");
        com.tencent.mars.xlog.Log.i(this.f8801d, "start to handle pag " + filePath + ' ' + com.tencent.mm.vfs.w6.k(filePath));
        pm0.v.O("Thread.Music", new am3.r(filePath, this));
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountReleased(context);
        fm3.y yVar = fm3.y.f264161a;
        fm3.y.f264162b.clear();
        fm3.y.f264163c.clear();
    }

    public final void wi(java.lang.String filePath) {
        kotlin.jvm.internal.o.g(filePath, "filePath");
        com.tencent.mars.xlog.Log.i(this.f8801d, "start to handle app icon " + filePath + ' ' + com.tencent.mm.vfs.w6.k(filePath));
        pm0.v.O("Thread.Music", new am3.p(filePath, this));
    }
}
