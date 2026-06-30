package we2;

/* loaded from: classes3.dex */
public abstract class z extends we2.x {

    /* renamed from: a, reason: collision with root package name */
    public final gk2.e f526800a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f526801b;

    public z(gk2.e liveContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f526800a = liveContext;
        this.f526801b = jz5.h.b(new we2.y(this));
    }

    @Override // we2.x
    public boolean b(we2.b respWrapper) {
        java.util.ArrayList arrayList;
        java.util.LinkedList m75941xfb821914;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(respWrapper, "respWrapper");
        r45.r71 r71Var = respWrapper.f526747a;
        if (r71Var == null || (m75941xfb821914 = r71Var.m75941xfb821914(14)) == null) {
            arrayList = null;
        } else {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : m75941xfb821914) {
                r45.ch1 ch1Var = (r45.ch1) obj;
                if (kz5.z.F((int[]) ((jz5.n) this.f526801b).mo141623x754a37bb(), ch1Var.m75939xb282bd08(1)) && f(ch1Var)) {
                    arrayList.add(obj);
                }
            }
        }
        if (arrayList == null) {
            return false;
        }
        java.util.ArrayList arrayList2 = (arrayList.isEmpty() ^ true) || e() ? arrayList : null;
        if (arrayList2 == null) {
            return false;
        }
        d(new java.util.LinkedList(arrayList2));
        return true;
    }

    public abstract void d(java.util.LinkedList linkedList);

    public boolean e() {
        return this instanceof xe2.c;
    }

    public boolean f(r45.ch1 appMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appMsg, "appMsg");
        return true;
    }

    public abstract int[] g();
}
