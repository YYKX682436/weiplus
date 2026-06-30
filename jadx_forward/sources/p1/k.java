package p1;

/* loaded from: classes14.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public final o0.i f432373a = new o0.i(new p1.j[16], 0);

    public boolean a(java.util.Map changes, s1.z parentCoordinates, p1.g internalPointerEvent, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(changes, "changes");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentCoordinates, "parentCoordinates");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(internalPointerEvent, "internalPointerEvent");
        o0.i iVar = this.f432373a;
        int i17 = iVar.f423385f;
        if (i17 <= 0) {
            return false;
        }
        java.lang.Object[] objArr = iVar.f423383d;
        int i18 = 0;
        boolean z18 = false;
        do {
            z18 = ((p1.j) objArr[i18]).a(changes, parentCoordinates, internalPointerEvent, z17) || z18;
            i18++;
        } while (i18 < i17);
        return z18;
    }

    public void b(p1.g internalPointerEvent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(internalPointerEvent, "internalPointerEvent");
        o0.i iVar = this.f432373a;
        int i17 = iVar.f423385f;
        while (true) {
            i17--;
            if (-1 >= i17) {
                return;
            }
            if (((p1.j) iVar.f423383d[i17]).f432366c.i()) {
                iVar.m(i17);
            }
        }
    }

    public final void c() {
        int i17 = 0;
        while (true) {
            o0.i iVar = this.f432373a;
            if (i17 >= iVar.f423385f) {
                return;
            }
            p1.j jVar = (p1.j) iVar.f423383d[i17];
            if (jVar.f432365b.f432459e) {
                i17++;
                jVar.c();
            } else {
                iVar.m(i17);
                jVar.d();
            }
        }
    }
}
