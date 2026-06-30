package sj3;

/* loaded from: classes14.dex */
public class z4 implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p960xd6a841b0.C11143x170c3f54 f490351d;

    /* renamed from: e, reason: collision with root package name */
    public final int f490352e;

    public z4(sj3.a5 a5Var, com.p314xaae8f345.mm.p960xd6a841b0.C11143x170c3f54 c11143x170c3f54, int i17) {
        this.f490351d = c11143x170c3f54;
        this.f490352e = i17;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        return java.lang.Integer.compare(this.f490352e, ((sj3.z4) obj).f490352e);
    }

    /* renamed from: toString */
    public java.lang.String m164687x9616526c() {
        return this.f490351d + ":" + this.f490352e;
    }
}
