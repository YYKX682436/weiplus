package vw3;

/* loaded from: classes10.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerBlockDetectUI f522720d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.tencent.mm.plugin.repairer.ui.RepairerBlockDetectUI repairerBlockDetectUI) {
        super(0);
        this.f522720d = repairerBlockDetectUI;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.vfs.r7 r7Var = com.p314xaae8f345.mm.vfs.q7.f294674a;
        com.p314xaae8f345.mm.vfs.r6 h07 = lp0.b.h0("BlockDetect");
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(h07, "BlockDetect_" + java.lang.System.currentTimeMillis() + ".txt");
        if (!h07.m()) {
            h07.J();
        }
        if (r6Var.m()) {
            r6Var.l();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = ix3.i.f376967j.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                java.lang.String o17 = r6Var.o();
                java.lang.String sb7 = sb6.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
                byte[] bytes = sb7.getBytes(r26.c.f450398a);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                com.p314xaae8f345.mm.vfs.w6.S(o17, bytes, 0, bytes.length);
                ex3.c cVar = ex3.c.f338739a;
                java.lang.String o18 = r6Var.o();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o18, "getAbsolutePath(...)");
                cVar.a(this.f522720d, o18);
                return jz5.f0.f384359a;
            }
            ix3.c cVar2 = (ix3.c) it.next();
            sb6.append("========================================================\n");
            sb6.append("时间点: " + cVar2.f376904a + '(' + k35.m1.e(cVar2.f376904a) + ")\n");
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("Block时间: ");
            sb8.append(cVar2.f376905b);
            sb8.append("ms\n");
            sb6.append(sb8.toString());
            sb6.append("堆栈:\n");
            for (java.lang.StackTraceElement stackTraceElement : cVar2.f376906c) {
                sb6.append("    ");
                sb6.append(stackTraceElement.toString());
                sb6.append("\n");
            }
            sb6.append("\n\n");
        }
    }
}
