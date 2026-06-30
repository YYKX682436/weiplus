package nu0;

/* loaded from: classes5.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nu0.q0 f421677d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(nu0.q0 q0Var) {
        super(0);
        this.f421677d = q0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ImageControlUIC", "[callbackSaveSnapshot]");
        nu0.q0 q0Var = this.f421677d;
        nu0.v vVar = q0Var.f421611u;
        if (vVar != null) {
            java.util.List snapshotList = q0Var.f421610t;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snapshotList, "snapshotList");
            ju0.d dVar = ((nu0.c2) vVar).f421436a.f421410J;
            if (dVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentImageAdapter");
                throw null;
            }
            dVar.f383215d = snapshotList;
            dVar.m8146xced61ae5();
        }
        return jz5.f0.f384359a;
    }
}
