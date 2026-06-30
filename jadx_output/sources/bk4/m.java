package bk4;

/* loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f21509d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f21510e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f21511f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(int i17, java.util.List list, java.lang.String str) {
        super(0);
        this.f21509d = i17;
        this.f21510e = list;
        this.f21511f = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.List<com.tencent.mm.vfs.x1> list = this.f21510e;
        int i17 = this.f21509d;
        if (i17 == 7) {
            for (com.tencent.mm.vfs.x1 x1Var : list) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.lang.String str = this.f21511f;
                sb6.append(str);
                sb6.append('/');
                sb6.append(x1Var.f213232b);
                com.tencent.mm.vfs.w6.h(sb6.toString());
                com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.PathProvider", "delete file:" + str + ' ' + x1Var.f213232b);
            }
        } else {
            for (com.tencent.mm.vfs.x1 x1Var2 : list) {
                if ((i17 & 1) > 0) {
                    java.lang.String relPath = x1Var2.f213231a;
                    kotlin.jvm.internal.o.f(relPath, "relPath");
                    if (r26.n0.B(relPath, "thumb", false)) {
                        java.lang.String str2 = x1Var2.f213231a;
                        com.tencent.mm.vfs.w6.h(str2);
                        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.PathProvider", "delete thumb path:" + str2);
                    }
                }
                if ((i17 & 2) > 0) {
                    java.lang.String relPath2 = x1Var2.f213231a;
                    kotlin.jvm.internal.o.f(relPath2, "relPath");
                    if (r26.n0.B(relPath2, "image", false)) {
                        java.lang.String str3 = x1Var2.f213231a;
                        com.tencent.mm.vfs.w6.h(str3);
                        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.PathProvider", "delete image path:" + str3);
                    }
                }
                if ((i17 & 4) > 0) {
                    java.lang.String relPath3 = x1Var2.f213231a;
                    kotlin.jvm.internal.o.f(relPath3, "relPath");
                    if (r26.n0.B(relPath3, "video", false)) {
                        java.lang.String str4 = x1Var2.f213231a;
                        com.tencent.mm.vfs.w6.h(str4);
                        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.PathProvider", "delete video path:" + str4);
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
