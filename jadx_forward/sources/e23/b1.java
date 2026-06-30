package e23;

/* loaded from: classes12.dex */
public final class b1 extends u13.g {

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f328316q;

    /* renamed from: r, reason: collision with root package name */
    public int f328317r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f328318s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f328319t;

    /* renamed from: u, reason: collision with root package name */
    public final yz5.a f328320u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f328321v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f328322w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f328323x;

    public b1(int i17, int i18) {
        super(i17, i18);
        this.f328316q = new java.util.LinkedList();
        this.f328317r = 3;
        this.f328318s = "";
        this.f328319t = "";
        this.f328320u = e23.x0.f328520d;
        this.f328322w = jz5.h.b(new e23.z0(this));
        this.f328323x = jz5.h.b(new e23.a1(this));
    }

    @Override // u13.g
    public void a(android.content.Context context, u13.e eVar, java.lang.Object... extraData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extraData, "extraData");
        java.util.Arrays.copyOf(extraData, extraData.length);
        java.util.LinkedList linkedList = this.f328316q;
        if (linkedList.isEmpty()) {
            r45.jo0 jo0Var = new r45.jo0();
            jo0Var.f459521f = o13.p.f423784d;
            jo0Var.f459520e = 0;
            r45.di6 di6Var = new r45.di6();
            di6Var.f454045d = i();
            di6Var.f454046e = "LocalRelevantQuery";
            di6Var.f454049h = 1;
            jo0Var.f459519d = di6Var;
            linkedList.add(jo0Var);
        }
        e23.t0 o17 = o();
        e23.t0 t0Var = eVar instanceof e23.t0 ? (e23.t0) eVar : null;
        o17.f328499a = t0Var != null ? t0Var.f328499a : null;
    }

    @Override // u13.g
    public u13.f k() {
        return (e23.w0) ((jz5.n) this.f328323x).mo141623x754a37bb();
    }

    public final e23.t0 o() {
        return (e23.t0) ((jz5.n) this.f328322w).mo141623x754a37bb();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(int r19, android.view.View r20, android.widget.TextView r21) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e23.b1.p(int, android.view.View, android.widget.TextView):void");
    }
}
