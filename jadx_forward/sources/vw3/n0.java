package vw3;

/* loaded from: classes.dex */
public final class n0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.r6 f522569d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerFileListUI f522570e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.p314xaae8f345.mm.vfs.r6 r6Var, com.tencent.mm.plugin.repairer.ui.RepairerFileListUI repairerFileListUI) {
        super(0);
        this.f522569d = r6Var;
        this.f522570e = repairerFileListUI;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.vfs.r7 r7Var = com.p314xaae8f345.mm.vfs.q7.f294674a;
        com.p314xaae8f345.mm.vfs.r6 h07 = lp0.b.h0("repairer_temp_zip");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.p314xaae8f345.mm.vfs.r6 r6Var = this.f522569d;
        sb6.append(r6Var.m82467xfb82e301());
        sb6.append(".zip");
        com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(h07, sb6.toString());
        if (r6Var2.m()) {
            r6Var2.l();
        }
        boolean T = com.p314xaae8f345.mm.vfs.w6.T(r6Var.o(), r6Var2.o());
        android.content.Context context = this.f522570e;
        if (T) {
            pm0.v.X(new vw3.l0(context));
            ex3.c cVar = ex3.c.f338739a;
            java.lang.String o17 = r6Var2.o();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
            cVar.a(context, o17);
        } else {
            pm0.v.X(new vw3.m0(context));
        }
        return jz5.f0.f384359a;
    }
}
