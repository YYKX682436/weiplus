package ex3;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ex3.c f338739a = new ex3.c();

    public final void a(android.content.Context context, java.lang.String filePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        if (!com.p314xaae8f345.mm.vfs.w6.j(filePath)) {
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
            e4Var.f293309c = "文件不存在";
            e4Var.c();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Repairer.RepairerInnerLogic", "sendFile ".concat(filePath));
        ec5.a aVar = new ec5.a();
        aVar.l(filePath);
        n13.r rVar = new n13.r();
        rVar.f415650a = true;
        if (!(context instanceof android.app.Activity)) {
            rVar.f415661l = new ex3.b();
        }
        ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(context, aVar, rVar);
    }
}
