package b00;

/* loaded from: classes8.dex */
public final class v2 extends com.tencent.mm.app.s2 {
    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
        h00.h.a(h00.h.f277820a, 1, null, 2, null);
        i95.m c17 = i95.n0.c(c00.x3.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        c00.x3.m8((c00.x3) c17, bw5.n9.FOREGROUND, null, 2, null);
    }
}
