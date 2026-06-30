package wh;

/* loaded from: classes12.dex */
public final class h0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wh.a0 f527328d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(wh.a0 a0Var) {
        super(1);
        this.f527328d = a0Var;
    }

    public final void a(wh.z node) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(node, "node");
        wh.d0 d0Var = node.f527437c;
        boolean z17 = d0Var instanceof wh.b0;
        wh.a0 a0Var = this.f527328d;
        if (z17) {
            a0Var.a("at " + d0Var);
        } else {
            a0Var.a("#00 " + d0Var);
        }
        wh.z zVar = node.f527438d;
        if (zVar != null) {
            a(zVar);
        }
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ java.lang.Object mo146xb9724478(java.lang.Object obj) {
        a((wh.z) obj);
        return jz5.f0.f384359a;
    }
}
