package ap1;

/* loaded from: classes5.dex */
public final class n1 implements rd0.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ap1.p1 f12707a;

    public n1(ap1.p1 p1Var) {
        this.f12707a = p1Var;
    }

    @Override // rd0.b1
    public final void a(java.util.List list) {
        ap1.c2 c2Var;
        java.util.List list2;
        ap1.p1 p1Var = this.f12707a;
        j75.f fVar = p1Var.f12725g;
        if (fVar == null) {
            fVar = p1Var.Q6();
            p1Var.f12725g = fVar;
        }
        if (fVar == null || (c2Var = (ap1.c2) fVar.getState()) == null || (list2 = c2Var.f12629m) == null) {
            list.clear();
            return;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            hashSet.add(((ap1.a0) it.next()).f12600a);
        }
        kotlin.jvm.internal.o.d(list);
        fo1.f.b(list, new ap1.m1(hashSet));
    }
}
