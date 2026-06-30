package n0;

/* loaded from: classes14.dex */
public final class z3 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f415336d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f415337e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f415338f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f415339g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f415340h;

    /* renamed from: i, reason: collision with root package name */
    public int f415341i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f415342m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ n0.b4 f415343n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(n0.b4 b4Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(3, interfaceC29045xdcb5ca57);
        this.f415343n = b4Var;
    }

    public static final void a(java.util.List list, n0.b4 b4Var) {
        list.clear();
        synchronized (b4Var.f414980d) {
            java.util.ArrayList arrayList = (java.util.ArrayList) b4Var.f414987k;
            int size = arrayList.size();
            for (int i17 = 0; i17 < size; i17++) {
                list.add((n0.u2) arrayList.get(i17));
            }
            ((java.util.ArrayList) b4Var.f414987k).clear();
        }
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        n0.z3 z3Var = new n0.z3(this.f415343n, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj3);
        z3Var.f415342m = (n0.r2) obj2;
        return z3Var.mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fe A[Catch: all -> 0x011c, TryCatch #1 {, blocks: (B:29:0x00e4, B:31:0x00f0, B:36:0x00fe, B:38:0x010c), top: B:28:0x00e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x008a A[DONT_GENERATE] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v22, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0121 -> B:7:0x0085). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0153 -> B:6:0x0157). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.z3.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
