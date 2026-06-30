package ix3;

/* loaded from: classes.dex */
public final class b0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ix3.e0 f376900d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(ix3.e0 e0Var) {
        super(0);
        this.f376900d = e0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.vfs.r7 r7Var = com.p314xaae8f345.mm.vfs.q7.f294674a;
        com.p314xaae8f345.mm.vfs.r6 h07 = lp0.b.h0("BlockDetect");
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(h07, "BlockDetectSingle_" + java.lang.System.currentTimeMillis() + ".txt");
        if (!h07.m()) {
            h07.J();
        }
        if (r6Var.m()) {
            r6Var.l();
        }
        ix3.e0 e0Var = this.f376900d;
        java.lang.String stringExtra = e0Var.m158359x1e885992().getStringExtra("TraceInfo");
        java.lang.String o17 = r6Var.o();
        byte[] bytes = java.lang.String.valueOf(stringExtra).getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        com.p314xaae8f345.mm.vfs.w6.S(o17, bytes, 0, bytes.length);
        ex3.c cVar = ex3.c.f338739a;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = e0Var.m158354x19263085();
        java.lang.String o18 = r6Var.o();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o18, "getAbsolutePath(...)");
        cVar.a(m158354x19263085, o18);
        return jz5.f0.f384359a;
    }
}
