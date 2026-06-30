package j0;

/* loaded from: classes16.dex */
public final class d2 implements j0.a2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j0.a2 f377792a;

    public d2(j0.a2 a2Var) {
        this.f377792a = a2Var;
    }

    @Override // j0.a2
    public j0.z1 a(android.view.KeyEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        j0.z1 z1Var = null;
        if (event.isShiftPressed() && event.isCtrlPressed()) {
            long a17 = n1.c.a(event);
            int i17 = j0.y2.f378202w;
            if (n1.a.a(a17, j0.y2.f378187h)) {
                z1Var = j0.z1.SELECT_LEFT_WORD;
            } else if (n1.a.a(a17, j0.y2.f378188i)) {
                z1Var = j0.z1.SELECT_RIGHT_WORD;
            } else if (n1.a.a(a17, j0.y2.f378189j)) {
                z1Var = j0.z1.SELECT_PREV_PARAGRAPH;
            } else if (n1.a.a(a17, j0.y2.f378190k)) {
                z1Var = j0.z1.SELECT_NEXT_PARAGRAPH;
            }
        } else if (event.isCtrlPressed()) {
            long a18 = n1.c.a(event);
            int i18 = j0.y2.f378202w;
            if (n1.a.a(a18, j0.y2.f378187h)) {
                z1Var = j0.z1.LEFT_WORD;
            } else if (n1.a.a(a18, j0.y2.f378188i)) {
                z1Var = j0.z1.RIGHT_WORD;
            } else if (n1.a.a(a18, j0.y2.f378189j)) {
                z1Var = j0.z1.PREV_PARAGRAPH;
            } else if (n1.a.a(a18, j0.y2.f378190k)) {
                z1Var = j0.z1.NEXT_PARAGRAPH;
            } else if (n1.a.a(a18, j0.y2.f378182c)) {
                z1Var = j0.z1.DELETE_PREV_CHAR;
            } else if (n1.a.a(a18, j0.y2.f378198s)) {
                z1Var = j0.z1.DELETE_NEXT_WORD;
            } else if (n1.a.a(a18, j0.y2.f378197r)) {
                z1Var = j0.z1.DELETE_PREV_WORD;
            } else if (n1.a.a(a18, j0.y2.f378186g)) {
                z1Var = j0.z1.DESELECT;
            }
        } else if (event.isShiftPressed()) {
            long a19 = n1.c.a(event);
            int i19 = j0.y2.f378202w;
            if (n1.a.a(a19, j0.y2.f378193n)) {
                z1Var = j0.z1.SELECT_HOME;
            } else if (n1.a.a(a19, j0.y2.f378194o)) {
                z1Var = j0.z1.SELECT_END;
            }
        }
        return z1Var == null ? this.f377792a.a(event) : z1Var;
    }
}
