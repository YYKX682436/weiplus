package p3325xe03a0797.p3326xc267989b;

/* loaded from: classes14.dex */
public abstract class w1 extends p3325xe03a0797.p3326xc267989b.p0 {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f392219h = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f392220e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f392221f;

    /* renamed from: g, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.a f392222g;

    @Override // p3325xe03a0797.p3326xc267989b.p0
    public final p3325xe03a0797.p3326xc267989b.p0 J(int i17) {
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.l.a(i17);
        return this;
    }

    public final void K(boolean z17) {
        long j17 = this.f392220e - (z17 ? 4294967296L : 1L);
        this.f392220e = j17;
        if (j17 <= 0 && this.f392221f) {
            mo143971xf5e80656();
        }
    }

    public final void M(p3325xe03a0797.p3326xc267989b.n1 n1Var) {
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.a aVar = this.f392222g;
        if (aVar == null) {
            aVar = new p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.a();
            this.f392222g = aVar;
        }
        java.lang.Object[] objArr = aVar.f392013a;
        int i17 = aVar.f392015c;
        objArr[i17] = n1Var;
        int length = (objArr.length - 1) & (i17 + 1);
        aVar.f392015c = length;
        int i18 = aVar.f392014b;
        if (length == i18) {
            int length2 = objArr.length;
            java.lang.Object[] objArr2 = new java.lang.Object[length2 << 1];
            kz5.v.p(objArr, objArr2, 0, i18, 0, 10, null);
            java.lang.Object[] objArr3 = aVar.f392013a;
            int length3 = objArr3.length;
            int i19 = aVar.f392014b;
            kz5.v.p(objArr3, objArr2, length3 - i19, 0, i19, 4, null);
            aVar.f392013a = objArr2;
            aVar.f392014b = 0;
            aVar.f392015c = length2;
        }
    }

    public final void N(boolean z17) {
        this.f392220e += z17 ? 4294967296L : 1L;
        if (z17) {
            return;
        }
        this.f392221f = true;
    }

    public final boolean O() {
        return this.f392220e >= 4294967296L;
    }

    public abstract long P();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v0 */
    public final boolean Q() {
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.a aVar = this.f392222g;
        if (aVar == null) {
            return false;
        }
        int i17 = aVar.f392014b;
        p3325xe03a0797.p3326xc267989b.n1 n1Var = null;
        if (i17 != aVar.f392015c) {
            ?? r37 = aVar.f392013a;
            ?? r66 = r37[i17];
            r37[i17] = 0;
            aVar.f392014b = (i17 + 1) & (r37.length - 1);
            if (r66 == 0) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
            }
            n1Var = r66;
        }
        p3325xe03a0797.p3326xc267989b.n1 n1Var2 = n1Var;
        if (n1Var2 == null) {
            return false;
        }
        n1Var2.run();
        return true;
    }

    /* renamed from: shutdown */
    public abstract void mo143971xf5e80656();
}
