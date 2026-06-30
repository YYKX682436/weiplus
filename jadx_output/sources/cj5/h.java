package cj5;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.j f42130d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(cj5.j jVar) {
        super(1);
        this.f42130d = jVar;
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
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                cj5.j jVar2 = this.f42130d;
                android.text.Editable text = jVar2.U6().getText();
                kotlin.jvm.internal.o.f(text, "getText(...)");
                java.lang.String obj2 = r26.n0.u0(text).toString();
                java.lang.String obj3 = obj2 != null ? r26.n0.u0(r26.i0.t(obj2, str, "", false)).toString() : null;
                int length = obj3 != null ? obj3.length() : 0;
                if (length > 0) {
                    jVar2.U6().setText(obj3);
                    jVar2.U6().setSelection(length);
                } else {
                    jVar2.U6().getText().clear();
                    jVar2.U6().clearFocus();
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
