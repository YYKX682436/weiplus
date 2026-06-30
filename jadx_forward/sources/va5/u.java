package va5;

/* loaded from: classes11.dex */
public final class u implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f515986d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ va5.v f515987e;

    public u(android.view.View view, va5.v vVar) {
        this.f515986d = view;
        this.f515987e = vVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        this.f515986d.getViewTreeObserver().removeOnPreDrawListener(this);
        va5.v vVar = this.f515987e;
        n3.t1 t1Var = new n3.t1(vVar);
        int i17 = 0;
        int i18 = 0;
        while (true) {
            if (t1Var.hasNext()) {
                java.lang.Object next = t1Var.next();
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                android.view.View view = (android.view.View) next;
                if (i18 < 0 || i18 > vVar.getChildCount() - 1 || i18 > ((java.util.ArrayList) vVar.f515989e.f515936b).size() - 1) {
                    break;
                }
                ((va5.c) ((java.util.ArrayList) vVar.f515989e.f515936b).get(i18)).f515943g = view.getWidth();
                i18 = i19;
            } else {
                java.util.Iterator it = vVar.f515989e.f515936b.iterator();
                while (it.hasNext()) {
                    i17 += ((va5.c) it.next()).f515943g;
                }
                vVar.m171397xf758d1ce(i17);
            }
        }
    }
}
