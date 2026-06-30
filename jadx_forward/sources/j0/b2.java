package j0;

/* loaded from: classes16.dex */
public final class b2 implements j0.a2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f377751a;

    public b2(yz5.l lVar) {
        this.f377751a = lVar;
    }

    @Override // j0.a2
    public j0.z1 a(android.view.KeyEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        n1.b bVar = new n1.b(event);
        yz5.l lVar = this.f377751a;
        if (((java.lang.Boolean) lVar.mo146xb9724478(bVar)).booleanValue() && event.isShiftPressed()) {
            long a17 = n1.c.a(event);
            int i17 = j0.y2.f378202w;
            if (n1.a.a(a17, j0.y2.f378185f)) {
                return j0.z1.REDO;
            }
            return null;
        }
        boolean booleanValue = ((java.lang.Boolean) lVar.mo146xb9724478(new n1.b(event))).booleanValue();
        j0.z1 z1Var = j0.z1.CUT;
        j0.z1 z1Var2 = j0.z1.PASTE;
        if (booleanValue) {
            long a18 = n1.c.a(event);
            int i18 = j0.y2.f378202w;
            if (n1.a.a(a18, j0.y2.f378181b) ? true : n1.a.a(a18, j0.y2.f378195p)) {
                return j0.z1.COPY;
            }
            if (!n1.a.a(a18, j0.y2.f378183d)) {
                if (!n1.a.a(a18, j0.y2.f378184e)) {
                    if (n1.a.a(a18, j0.y2.f378180a)) {
                        return j0.z1.SELECT_ALL;
                    }
                    if (n1.a.a(a18, j0.y2.f378185f)) {
                        return j0.z1.UNDO;
                    }
                    return null;
                }
                return z1Var;
            }
            return z1Var2;
        }
        if (event.isCtrlPressed()) {
            return null;
        }
        if (event.isShiftPressed()) {
            long a19 = n1.c.a(event);
            int i19 = j0.y2.f378202w;
            if (n1.a.a(a19, j0.y2.f378187h)) {
                return j0.z1.SELECT_LEFT_CHAR;
            }
            if (n1.a.a(a19, j0.y2.f378188i)) {
                return j0.z1.SELECT_RIGHT_CHAR;
            }
            if (n1.a.a(a19, j0.y2.f378189j)) {
                return j0.z1.SELECT_UP;
            }
            if (n1.a.a(a19, j0.y2.f378190k)) {
                return j0.z1.SELECT_DOWN;
            }
            if (n1.a.a(a19, j0.y2.f378191l)) {
                return j0.z1.SELECT_PAGE_UP;
            }
            if (n1.a.a(a19, j0.y2.f378192m)) {
                return j0.z1.SELECT_PAGE_DOWN;
            }
            if (n1.a.a(a19, j0.y2.f378193n)) {
                return j0.z1.SELECT_LINE_START;
            }
            if (n1.a.a(a19, j0.y2.f378194o)) {
                return j0.z1.SELECT_LINE_END;
            }
            if (!n1.a.a(a19, j0.y2.f378195p)) {
                return null;
            }
        } else {
            long a27 = n1.c.a(event);
            int i27 = j0.y2.f378202w;
            if (n1.a.a(a27, j0.y2.f378187h)) {
                return j0.z1.LEFT_CHAR;
            }
            if (n1.a.a(a27, j0.y2.f378188i)) {
                return j0.z1.RIGHT_CHAR;
            }
            if (n1.a.a(a27, j0.y2.f378189j)) {
                return j0.z1.UP;
            }
            if (n1.a.a(a27, j0.y2.f378190k)) {
                return j0.z1.DOWN;
            }
            if (n1.a.a(a27, j0.y2.f378191l)) {
                return j0.z1.PAGE_UP;
            }
            if (n1.a.a(a27, j0.y2.f378192m)) {
                return j0.z1.PAGE_DOWN;
            }
            if (n1.a.a(a27, j0.y2.f378193n)) {
                return j0.z1.LINE_START;
            }
            if (n1.a.a(a27, j0.y2.f378194o)) {
                return j0.z1.LINE_END;
            }
            if (n1.a.a(a27, j0.y2.f378196q)) {
                return j0.z1.NEW_LINE;
            }
            if (n1.a.a(a27, j0.y2.f378197r)) {
                return j0.z1.DELETE_PREV_CHAR;
            }
            if (n1.a.a(a27, j0.y2.f378198s)) {
                return j0.z1.DELETE_NEXT_CHAR;
            }
            if (!n1.a.a(a27, j0.y2.f378199t)) {
                if (!n1.a.a(a27, j0.y2.f378200u)) {
                    if (n1.a.a(a27, j0.y2.f378201v)) {
                        return j0.z1.TAB;
                    }
                    return null;
                }
                return z1Var;
            }
        }
        return z1Var2;
    }
}
