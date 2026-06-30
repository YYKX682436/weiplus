package cj5;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.f f42089d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(cj5.f fVar) {
        super(1);
        this.f42089d = fVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ri5.j jVar;
        si5.c cVar;
        boolean z17;
        p13.r rVar;
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        wi5.a0 a0Var = (wi5.a0) state.a(wi5.a0.class);
        if (a0Var != null && (jVar = a0Var.f446278b) != null && ((z17 = (cVar = jVar.f396113h) instanceof ti5.d))) {
            ti5.d dVar = z17 ? (ti5.d) cVar : null;
            java.lang.String str = (dVar == null || (rVar = dVar.f419665b) == null) ? null : rVar.f351129a;
            if (str == null) {
                str = "";
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.DeleteSearchQueryAfterSelectStrictDupUIC", "originQuery: ".concat(str));
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                boolean D = r26.n0.D(r26.n0.u0(str).toString(), " ", false, 2, null);
                cj5.f fVar = this.f42089d;
                if (D) {
                    fVar.hideVKB();
                } else {
                    android.text.Editable text = fVar.U6().getText();
                    kotlin.jvm.internal.o.f(text, "getText(...)");
                    java.lang.String obj2 = r26.n0.u0(text).toString();
                    java.lang.String obj3 = obj2 != null ? r26.n0.u0(r26.i0.t(obj2, str, "", false)).toString() : null;
                    com.tencent.mars.xlog.Log.i("MicroMsg.DeleteSearchQueryAfterSelectStrictDupUIC", "query: " + obj3);
                    int length = obj3 != null ? obj3.length() : 0;
                    if (length > 0) {
                        fVar.U6().setText(obj3);
                        fVar.U6().setSelection(length);
                    } else {
                        fVar.U6().getText().clear();
                        fVar.U6().clearFocus();
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
