package rc3;

/* loaded from: classes7.dex */
public final class o0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f475577d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(rc3.w0 w0Var) {
        super(0);
        this.f475577d = w0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        rc3.w0 w0Var = this.f475577d;
        if (!bf3.h0.a(w0Var.f475632t, 8)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("resume, has service?");
            sb6.append(w0Var.A != null);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c(w0Var.f475638z, sb6.toString(), new java.lang.Object[0]);
            w0Var.f475632t = 4;
            java.util.Iterator it = w0Var.f475625m.iterator();
            while (it.hasNext()) {
                ((jc3.u) it.next()).mo127085x57429eec();
            }
            qc3.f fVar = w0Var.A;
            if (fVar != null) {
                fVar.uc();
            }
        }
        return jz5.f0.f384359a;
    }
}
