package wc5;

/* loaded from: classes10.dex */
public final class j1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f526119d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uc5.c f526120e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(java.lang.String str, uc5.c cVar) {
        super(1);
        this.f526119d = str;
        this.f526120e = cVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.List<uc5.l0> snapshotList = (java.util.List) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snapshotList, "snapshotList");
        for (uc5.l0 l0Var : snapshotList) {
            uc5.h0 h0Var = l0Var instanceof uc5.h0 ? (uc5.h0) l0Var : null;
            if (h0Var != null) {
                uc5.d dVar = h0Var.f508027d;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(dVar.v(), this.f526119d)) {
                    uc5.c cVar = this.f526120e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cVar, "<set-?>");
                    dVar.f508009d = cVar;
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
