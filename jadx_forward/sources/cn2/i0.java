package cn2;

/* loaded from: classes3.dex */
public final class i0 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cn2.p0 f125072d;

    public i0(cn2.p0 p0Var) {
        this.f125072d = p0Var;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        cn2.p0 p0Var = this.f125072d;
        return mz5.a.b(java.lang.Integer.valueOf(cn2.p0.a(p0Var, (dk2.zf) obj)), java.lang.Integer.valueOf(cn2.p0.a(p0Var, (dk2.zf) obj2)));
    }
}
