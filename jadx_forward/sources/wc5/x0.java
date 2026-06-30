package wc5;

/* loaded from: classes10.dex */
public final class x0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f526186d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(java.util.HashMap hashMap) {
        super(1);
        this.f526186d = hashMap;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.ArrayList<uc5.l0> snapshotList = (java.util.ArrayList) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snapshotList, "snapshotList");
        for (uc5.l0 l0Var : snapshotList) {
            uc5.h0 h0Var = l0Var instanceof uc5.h0 ? (uc5.h0) l0Var : null;
            if (h0Var != null) {
                uc5.d dVar = h0Var.f508027d;
                uc5.c cVar = (uc5.c) this.f526186d.get(dVar.v());
                if (cVar != null) {
                    dVar.f508009d = cVar;
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
