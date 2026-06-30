package ap1;

/* loaded from: classes5.dex */
public final class n1 implements rd0.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ap1.p1 f94240a;

    public n1(ap1.p1 p1Var) {
        this.f94240a = p1Var;
    }

    @Override // rd0.b1
    public final void a(java.util.List list) {
        ap1.c2 c2Var;
        java.util.List list2;
        ap1.p1 p1Var = this.f94240a;
        j75.f fVar = p1Var.f94258g;
        if (fVar == null) {
            fVar = p1Var.Q6();
            p1Var.f94258g = fVar;
        }
        if (fVar == null || (c2Var = (ap1.c2) fVar.mo140437x75286adb()) == null || (list2 = c2Var.f94162m) == null) {
            list.clear();
            return;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            hashSet.add(((ap1.a0) it.next()).f94133a);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list);
        fo1.f.b(list, new ap1.m1(hashSet));
    }
}
