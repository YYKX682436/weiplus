package j0;

/* loaded from: classes14.dex */
public final class g3 implements s1.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j0.j3 f377833a;

    public g3(j0.j3 j3Var) {
        this.f377833a = j3Var;
    }

    @Override // s1.t0
    public int a(s1.u uVar, java.util.List measurables, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measurables, "measurables");
        j0.j3 j3Var = this.f377833a;
        j3Var.f377915d.f377821a.b(uVar.mo7007x6fcfed3f());
        if (j3Var.f377915d.f377821a.f377944i != null) {
            return (int) java.lang.Math.ceil(r1.b());
        }
        throw new java.lang.IllegalStateException("layoutIntrinsics must be called first");
    }

    @Override // s1.t0
    public int b(s1.u uVar, java.util.List measurables, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measurables, "measurables");
        return p2.q.b(this.f377833a.f377915d.f377821a.a(p2.d.a(0, i17, 0, Integer.MAX_VALUE), uVar.mo7007x6fcfed3f(), null).f82300c);
    }

    @Override // s1.t0
    public int c(s1.u uVar, java.util.List measurables, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measurables, "measurables");
        return p2.q.b(this.f377833a.f377915d.f377821a.a(p2.d.a(0, i17, 0, Integer.MAX_VALUE), uVar.mo7007x6fcfed3f(), null).f82300c);
    }

    @Override // s1.t0
    public s1.u0 d(s1.x0 measure, java.util.List measurables, long j17) {
        jz5.l lVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measure, "$this$measure");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measurables, "measurables");
        j0.j3 j3Var = this.f377833a;
        a2.k1 a17 = j3Var.f377915d.f377821a.a(j17, measure.mo7007x6fcfed3f(), j3Var.f377915d.f377825e);
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(j3Var.f377915d.f377825e, a17)) {
            j3Var.f377915d.f377823c.mo146xb9724478(a17);
            a2.k1 k1Var = j3Var.f377915d.f377825e;
            if (k1Var != null && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(k1Var.f82298a.f82287a, a17.f82298a.f82287a)) {
                j3Var.getClass();
            }
        }
        j3Var.f377915d.f377825e = a17;
        int size = measurables.size();
        java.util.List list = a17.f82303f;
        if (!(size >= list.size())) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size2 = list.size();
        for (int i17 = 0; i17 < size2; i17++) {
            d1.g gVar = (d1.g) list.get(i17);
            if (gVar != null) {
                s1.r0 r0Var = (s1.r0) measurables.get(i17);
                float f17 = gVar.f307164c;
                float f18 = gVar.f307162a;
                float f19 = gVar.f307165d;
                lVar = new jz5.l(r0Var.m(p2.d.b(0, (int) java.lang.Math.floor(f17 - f18), 0, (int) java.lang.Math.floor(f19 - r8), 5, null)), new p2.m(p2.n.a(a06.d.b(f18), a06.d.b(gVar.f307163b))));
            } else {
                lVar = null;
            }
            if (lVar != null) {
                arrayList.add(lVar);
            }
        }
        long j18 = a17.f82300c;
        return measure.W((int) (j18 >> 32), p2.q.b(j18), kz5.c1.k(new jz5.l(s1.d.f483532a, java.lang.Integer.valueOf(a06.d.b(a17.f82301d))), new jz5.l(s1.d.f483533b, java.lang.Integer.valueOf(a06.d.b(a17.f82302e)))), new j0.f3(arrayList));
    }

    @Override // s1.t0
    public int e(s1.u uVar, java.util.List measurables, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measurables, "measurables");
        j0.j3 j3Var = this.f377833a;
        j3Var.f377915d.f377821a.b(uVar.mo7007x6fcfed3f());
        if (j3Var.f377915d.f377821a.f377944i != null) {
            return (int) java.lang.Math.ceil(r1.c());
        }
        throw new java.lang.IllegalStateException("layoutIntrinsics must be called first");
    }
}
