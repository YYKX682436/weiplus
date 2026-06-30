package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.platform.AndroidComposeView f10703d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(androidx.compose.ui.platform.AndroidComposeView androidComposeView) {
        super(1);
        this.f10703d = androidComposeView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        c1.d dVar;
        android.view.KeyEvent it = ((n1.b) obj).f334029a;
        kotlin.jvm.internal.o.g(it, "it");
        androidx.compose.ui.platform.AndroidComposeView androidComposeView = this.f10703d;
        androidComposeView.getClass();
        long a17 = n1.c.a(it);
        if (n1.a.a(a17, n1.a.f334024g)) {
            dVar = new c1.d(it.isShiftPressed() ? 2 : 1);
        } else if (n1.a.a(a17, n1.a.f334022e)) {
            dVar = new c1.d(4);
        } else if (n1.a.a(a17, n1.a.f334021d)) {
            dVar = new c1.d(3);
        } else if (n1.a.a(a17, n1.a.f334019b)) {
            dVar = new c1.d(5);
        } else if (n1.a.a(a17, n1.a.f334020c)) {
            dVar = new c1.d(6);
        } else {
            if (n1.a.a(a17, n1.a.f334023f) ? true : n1.a.a(a17, n1.a.f334025h) ? true : n1.a.a(a17, n1.a.f334027j)) {
                dVar = new c1.d(7);
            } else {
                dVar = n1.a.a(a17, n1.a.f334018a) ? true : n1.a.a(a17, n1.a.f334026i) ? new c1.d(8) : null;
            }
        }
        if (dVar != null) {
            if (n1.c.b(it) == 2) {
                return java.lang.Boolean.valueOf(((c1.m) androidComposeView.getFocusManager()).b(dVar.f37732a));
            }
        }
        return java.lang.Boolean.FALSE;
    }
}
