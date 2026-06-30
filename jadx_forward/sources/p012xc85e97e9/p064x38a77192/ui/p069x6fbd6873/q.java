package p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873;

/* loaded from: classes14.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988 f92236d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988 c1059xa8272988) {
        super(1);
        this.f92236d = c1059xa8272988;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        c1.d dVar;
        android.view.KeyEvent it = ((n1.b) obj).f415562a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988 c1059xa8272988 = this.f92236d;
        c1059xa8272988.getClass();
        long a17 = n1.c.a(it);
        if (n1.a.a(a17, n1.a.f415557g)) {
            dVar = new c1.d(it.isShiftPressed() ? 2 : 1);
        } else if (n1.a.a(a17, n1.a.f415555e)) {
            dVar = new c1.d(4);
        } else if (n1.a.a(a17, n1.a.f415554d)) {
            dVar = new c1.d(3);
        } else if (n1.a.a(a17, n1.a.f415552b)) {
            dVar = new c1.d(5);
        } else if (n1.a.a(a17, n1.a.f415553c)) {
            dVar = new c1.d(6);
        } else {
            if (n1.a.a(a17, n1.a.f415556f) ? true : n1.a.a(a17, n1.a.f415558h) ? true : n1.a.a(a17, n1.a.f415560j)) {
                dVar = new c1.d(7);
            } else {
                dVar = n1.a.a(a17, n1.a.f415551a) ? true : n1.a.a(a17, n1.a.f415559i) ? new c1.d(8) : null;
            }
        }
        if (dVar != null) {
            if (n1.c.b(it) == 2) {
                return java.lang.Boolean.valueOf(((c1.m) c1059xa8272988.mo7034x7bba422b()).b(dVar.f119265a));
            }
        }
        return java.lang.Boolean.FALSE;
    }
}
