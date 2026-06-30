package m12;

/* loaded from: classes10.dex */
public final class b extends m12.a {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f404353f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f404354g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String inputPath, java.lang.String outputPath) {
        super(inputPath, outputPath);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inputPath, "inputPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outputPath, "outputPath");
        this.f404353f = inputPath;
        this.f404354g = outputPath;
    }

    @Override // m12.a
    public java.lang.Object c(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.String str = this.f404354g;
        if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
            com.p314xaae8f345.mm.vfs.w6.h(str);
        }
        com.p314xaae8f345.mm.vfs.w6.c(this.f404353f, str);
        if (this.f404352e) {
            try {
                b(str);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GifEmojiGenerator", "doAddUserData error: " + e17);
                return java.lang.Boolean.FALSE;
            }
        }
        return java.lang.Boolean.TRUE;
    }
}
