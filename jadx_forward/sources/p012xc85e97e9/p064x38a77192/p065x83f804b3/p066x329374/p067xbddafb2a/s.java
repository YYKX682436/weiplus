package p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a;

/* loaded from: classes14.dex */
public final class s implements p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.r, s1.x0 {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.k f91959d;

    /* renamed from: e, reason: collision with root package name */
    public final s1.l2 f91960e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f91961f;

    public s(p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.k itemContentFactory, s1.l2 subcomposeMeasureScope) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemContentFactory, "itemContentFactory");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subcomposeMeasureScope, "subcomposeMeasureScope");
        this.f91959d = itemContentFactory;
        this.f91960e = subcomposeMeasureScope;
        this.f91961f = new java.util.HashMap();
    }

    @Override // p2.f
    public int G(float f17) {
        s1.l0 l0Var = (s1.l0) this.f91960e;
        l0Var.getClass();
        return p2.e.a(l0Var, f17);
    }

    @Override // p2.f
    public float H(long j17) {
        s1.l0 l0Var = (s1.l0) this.f91960e;
        l0Var.getClass();
        return p2.e.d(l0Var, j17);
    }

    @Override // p2.f
    public float R(float f17) {
        return f17 * ((s1.l0) this.f91960e).mo7005x9a59d0b2();
    }

    @Override // s1.x0
    public s1.u0 W(int i17, int i18, java.util.Map alignmentLines, yz5.l placementBlock) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(alignmentLines, "alignmentLines");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(placementBlock, "placementBlock");
        return ((s1.l0) this.f91960e).W(i17, i18, alignmentLines, placementBlock);
    }

    public s1.o1[] b(int i17, long j17) {
        java.util.HashMap hashMap = this.f91961f;
        s1.o1[] o1VarArr = (s1.o1[]) hashMap.get(java.lang.Integer.valueOf(i17));
        if (o1VarArr != null) {
            return o1VarArr;
        }
        p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.k kVar = this.f91959d;
        java.lang.Object c17 = ((p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.l) kVar.f91944b.mo152xb9724478()).c(i17);
        java.util.List b17 = ((s1.l0) this.f91960e).b(c17, kVar.a(i17, c17));
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
        s1.l0 l0Var = (s1.l0) this.f91960e;
        l0Var.getClass();
        return p2.e.c(l0Var, j17);
    }

    @Override // p2.f
    /* renamed from: getDensity */
    public float mo7005x9a59d0b2() {
        return ((s1.l0) this.f91960e).f483565e;
    }

    @Override // p2.f
    /* renamed from: getFontScale */
    public float mo7006xa2f3d785() {
        return ((s1.l0) this.f91960e).f483566f;
    }

    @Override // s1.u
    /* renamed from: getLayoutDirection */
    public p2.s mo7007x6fcfed3f() {
        return ((s1.l0) this.f91960e).f483564d;
    }

    @Override // p2.f
    public float n(int i17) {
        s1.l0 l0Var = (s1.l0) this.f91960e;
        l0Var.getClass();
        return p2.e.b(l0Var, i17);
    }

    @Override // p2.f
    public float o(float f17) {
        return f17 / ((s1.l0) this.f91960e).mo7005x9a59d0b2();
    }

    @Override // p2.f
    public long t(long j17) {
        s1.l0 l0Var = (s1.l0) this.f91960e;
        l0Var.getClass();
        return p2.e.e(l0Var, j17);
    }

    @Override // p2.f
    public long z(float f17) {
        s1.l0 l0Var = (s1.l0) this.f91960e;
        l0Var.getClass();
        return p2.e.f(l0Var, f17);
    }
}
