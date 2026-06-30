package bk4;

/* loaded from: classes.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f103042d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f103043e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f103044f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(int i17, java.util.List list, java.lang.String str) {
        super(0);
        this.f103042d = i17;
        this.f103043e = list;
        this.f103044f = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.List<com.p314xaae8f345.mm.vfs.x1> list = this.f103043e;
        int i17 = this.f103042d;
        if (i17 == 7) {
            for (com.p314xaae8f345.mm.vfs.x1 x1Var : list) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.lang.String str = this.f103044f;
                sb6.append(str);
                sb6.append('/');
                sb6.append(x1Var.f294765b);
                com.p314xaae8f345.mm.vfs.w6.h(sb6.toString());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.PathProvider", "delete file:" + str + ' ' + x1Var.f294765b);
            }
        } else {
            for (com.p314xaae8f345.mm.vfs.x1 x1Var2 : list) {
                if ((i17 & 1) > 0) {
                    java.lang.String relPath = x1Var2.f294764a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(relPath, "relPath");
                    if (r26.n0.B(relPath, "thumb", false)) {
                        java.lang.String str2 = x1Var2.f294764a;
                        com.p314xaae8f345.mm.vfs.w6.h(str2);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.PathProvider", "delete thumb path:" + str2);
                    }
                }
                if ((i17 & 2) > 0) {
                    java.lang.String relPath2 = x1Var2.f294764a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(relPath2, "relPath");
                    if (r26.n0.B(relPath2, "image", false)) {
                        java.lang.String str3 = x1Var2.f294764a;
                        com.p314xaae8f345.mm.vfs.w6.h(str3);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.PathProvider", "delete image path:" + str3);
                    }
                }
                if ((i17 & 4) > 0) {
                    java.lang.String relPath3 = x1Var2.f294764a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(relPath3, "relPath");
                    if (r26.n0.B(relPath3, "video", false)) {
                        java.lang.String str4 = x1Var2.f294764a;
                        com.p314xaae8f345.mm.vfs.w6.h(str4);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.PathProvider", "delete video path:" + str4);
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
