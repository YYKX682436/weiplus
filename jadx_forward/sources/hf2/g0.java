package hf2;

/* loaded from: classes10.dex */
public final class g0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hf2.h0 f362595d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f362596e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(hf2.h0 h0Var, int i17) {
        super(1);
        this.f362595d = h0Var;
        this.f362596e = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        qc0.j2 status = (qc0.j2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        hf2.h0 h0Var = this.f362595d;
        java.lang.String str = h0Var.f362604b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("launchStickerOperationContainer StickerItemBehaviorStatus: ");
        sb6.append(status);
        sb6.append(",stickerType:");
        int i17 = this.f362596e;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(status, qc0.i2.f442922c)) {
            qc0.g1 g1Var = h0Var.f362605c;
            if (g1Var != null) {
                qc0.g1.a(g1Var, null, 1, null);
            }
        } else {
            boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(status, qc0.c2.f442895c);
            hf2.x xVar = h0Var.f362603a;
            if (b17) {
                xVar.n7("click item");
                h0Var.a();
                xVar.w7(i17, "");
            } else {
                ((hf2.f1) ((jz5.n) xVar.B).mo141623x754a37bb()).a(i17, status);
            }
        }
        return jz5.f0.f384359a;
    }
}
