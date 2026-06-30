package cj5;

/* loaded from: classes.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.f f123622d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(cj5.f fVar) {
        super(1);
        this.f123622d = fVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ri5.j jVar;
        si5.c cVar;
        boolean z17;
        p13.r rVar;
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        wi5.a0 a0Var = (wi5.a0) state.a(wi5.a0.class);
        if (a0Var != null && (jVar = a0Var.f527811b) != null && ((z17 = (cVar = jVar.f477646h) instanceof ti5.d))) {
            ti5.d dVar = z17 ? (ti5.d) cVar : null;
            java.lang.String str = (dVar == null || (rVar = dVar.f501198b) == null) ? null : rVar.f432662a;
            if (str == null) {
                str = "";
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeleteSearchQueryAfterSelectStrictDupUIC", "originQuery: ".concat(str));
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                boolean D = r26.n0.D(r26.n0.u0(str).toString(), " ", false, 2, null);
                cj5.f fVar = this.f123622d;
                if (D) {
                    fVar.m174141x36654fab();
                } else {
                    android.text.Editable text = fVar.U6().getText();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(text, "getText(...)");
                    java.lang.String obj2 = r26.n0.u0(text).toString();
                    java.lang.String obj3 = obj2 != null ? r26.n0.u0(r26.i0.t(obj2, str, "", false)).toString() : null;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeleteSearchQueryAfterSelectStrictDupUIC", "query: " + obj3);
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
        return jz5.f0.f384359a;
    }
}
