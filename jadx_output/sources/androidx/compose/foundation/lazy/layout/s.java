package androidx.compose.foundation.lazy.layout;

/* loaded from: classes14.dex */
public final class s implements androidx.compose.foundation.lazy.layout.r, s1.x0 {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.k f10426d;

    /* renamed from: e, reason: collision with root package name */
    public final s1.l2 f10427e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f10428f;

    public s(androidx.compose.foundation.lazy.layout.k itemContentFactory, s1.l2 subcomposeMeasureScope) {
        kotlin.jvm.internal.o.g(itemContentFactory, "itemContentFactory");
        kotlin.jvm.internal.o.g(subcomposeMeasureScope, "subcomposeMeasureScope");
        this.f10426d = itemContentFactory;
        this.f10427e = subcomposeMeasureScope;
        this.f10428f = new java.util.HashMap();
    }

    @Override // p2.f
    public int G(float f17) {
        s1.l0 l0Var = (s1.l0) this.f10427e;
        l0Var.getClass();
        return p2.e.a(l0Var, f17);
    }

    @Override // p2.f
    public float H(long j17) {
        s1.l0 l0Var = (s1.l0) this.f10427e;
        l0Var.getClass();
        return p2.e.d(l0Var, j17);
    }

    @Override // p2.f
    public float R(float f17) {
        return f17 * ((s1.l0) this.f10427e).getDensity();
    }

    @Override // s1.x0
    public s1.u0 W(int i17, int i18, java.util.Map alignmentLines, yz5.l placementBlock) {
        kotlin.jvm.internal.o.g(alignmentLines, "alignmentLines");
        kotlin.jvm.internal.o.g(placementBlock, "placementBlock");
        return ((s1.l0) this.f10427e).W(i17, i18, alignmentLines, placementBlock);
    }

    public s1.o1[] b(int i17, long j17) {
        java.util.HashMap hashMap = this.f10428f;
        s1.o1[] o1VarArr = (s1.o1[]) hashMap.get(java.lang.Integer.valueOf(i17));
        if (o1VarArr != null) {
            return o1VarArr;
        }
        androidx.compose.foundation.lazy.layout.k kVar = this.f10426d;
        java.lang.Object c17 = ((androidx.compose.foundation.lazy.layout.l) kVar.f10411b.invoke()).c(i17);
        java.util.List b17 = ((s1.l0) this.f10427e).b(c17, kVar.a(i17, c17));
        int size = b17.size();
        s1.o1[] o1VarArr2 = new s1.o1[size];
        for (int i18 = 0; i18 < size; i18++) {
            o1VarArr2[i18] = ((s1.r0) b17.get(i18)).m(j17);
        }
        hashMap.put(java.lang.Integer.valueOf(i17), o1VarArr2);
        return o1VarArr2;
    }

    @Override // p2.f
    public long e(long j17) {
        s1.l0 l0Var = (s1.l0) this.f10427e;
        l0Var.getClass();
        return p2.e.c(l0Var, j17);
    }

    @Override // p2.f
    public float getDensity() {
        return ((s1.l0) this.f10427e).f402032e;
    }

    @Override // p2.f
    public float getFontScale() {
        return ((s1.l0) this.f10427e).f402033f;
    }

    @Override // s1.u
    public p2.s getLayoutDirection() {
        return ((s1.l0) this.f10427e).f402031d;
    }

    @Override // p2.f
    public float n(int i17) {
        s1.l0 l0Var = (s1.l0) this.f10427e;
        l0Var.getClass();
        return p2.e.b(l0Var, i17);
    }

    @Override // p2.f
    public float o(float f17) {
        return f17 / ((s1.l0) this.f10427e).getDensity();
    }

    @Override // p2.f
    public long t(long j17) {
        s1.l0 l0Var = (s1.l0) this.f10427e;
        l0Var.getClass();
        return p2.e.e(l0Var, j17);
    }

    @Override // p2.f
    public long z(float f17) {
        s1.l0 l0Var = (s1.l0) this.f10427e;
        l0Var.getClass();
        return p2.e.f(l0Var, f17);
    }
}
