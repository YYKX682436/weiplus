package hf2;

/* loaded from: classes10.dex */
public final class l1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hf2.p1 f362636d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(hf2.p1 p1Var) {
        super(1);
        this.f362636d = p1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        qc0.g1 g1Var;
        qc0.j2 status = (qc0.j2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(status, qc0.d2.f442908c);
        hf2.p1 p1Var = this.f362636d;
        if (b17 && (g1Var = p1Var.f362672d) != null) {
            qc0.g1.a(g1Var, null, 1, null);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(p1Var.f362670b, "dropBitmap StickerItemBehaviorStatus: " + status);
        return jz5.f0.f384359a;
    }
}
