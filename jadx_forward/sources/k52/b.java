package k52;

/* loaded from: classes15.dex */
public final class b implements yj0.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k52.c f385816a;

    public b(k52.c cVar) {
        this.f385816a = cVar;
    }

    @Override // yj0.d
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, java.lang.Object obj2) {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // yj0.d
    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, java.lang.Object[] objArr) {
        java.lang.String r17;
        k52.f fVar;
        if (objArr != null) {
            if (!(objArr.length == 0) && (obj instanceof android.view.View)) {
                k52.p pVar = k52.q.f385859a;
                android.view.View view = (android.view.View) obj;
                java.lang.String b17 = pVar.b(view);
                if (b17 == null) {
                    k52.c.f385817e = false;
                    return;
                }
                if (view.getId() == -1) {
                    b17 = pVar.c(view);
                }
                if (view.getId() == -1) {
                    r17 = b17;
                } else {
                    r17 = b52.b.r(view.getId());
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "toHexString(...)");
                }
                java.lang.String name = obj.getClass().getName();
                k52.c cVar = this.f385816a;
                cVar.getClass();
                r45.a07 a07Var = new r45.a07();
                a07Var.f451135e = b17;
                a07Var.f451134d = r17;
                a07Var.f451142o = java.lang.System.currentTimeMillis();
                java.lang.String g17 = b52.b.g(name);
                a07Var.f451136f = g17;
                a07Var.f451138h = g17;
                if (str2 != null) {
                    switch (str2.hashCode()) {
                        case -1263341865:
                            if (str2.equals("onSingleTapUp")) {
                                k52.g gVar = k52.g.f385827e;
                                a07Var.f451139i = 1;
                                break;
                            }
                            break;
                        case -1236836200:
                            if (str2.equals("onContextClick")) {
                                k52.g gVar2 = k52.g.f385827e;
                                a07Var.f451139i = 1;
                                break;
                            }
                            break;
                        case -836949261:
                            if (str2.equals("onDoubleTap")) {
                                k52.g gVar3 = k52.g.f385827e;
                                a07Var.f451139i = 3;
                                break;
                            }
                            break;
                        case 83417096:
                            if (str2.equals(if1.m.f69928x24728b)) {
                                k52.g gVar4 = k52.g.f385827e;
                                a07Var.f451139i = 2;
                                break;
                            }
                            break;
                    }
                    if (a07Var.f451139i != -1 || (fVar = cVar.f385818a) == null) {
                        return;
                    }
                    ((k52.j) fVar).a(null, a07Var);
                    return;
                }
                k52.g gVar5 = k52.g.f385827e;
                a07Var.f451139i = -1;
                if (a07Var.f451139i != -1) {
                    return;
                } else {
                    return;
                }
            }
        }
        k52.c.f385817e = false;
    }
}
