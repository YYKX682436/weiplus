package kj;

/* loaded from: classes.dex */
public class y implements java.util.Map.Entry {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f389808d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f389809e;

    public y(java.lang.Object obj, java.lang.Object obj2) {
        this.f389808d = obj;
        this.f389809e = obj2;
    }

    @Override // java.util.Map.Entry
    public java.lang.Object getKey() {
        return this.f389808d;
    }

    @Override // java.util.Map.Entry
    public java.lang.Object getValue() {
        return this.f389809e;
    }

    @Override // java.util.Map.Entry
    public java.lang.Object setValue(java.lang.Object obj) {
        this.f389809e = obj;
        return obj;
    }

    /* renamed from: toString */
    public java.lang.String m143535x9616526c() {
        return "Pair{f=" + this.f389808d + ", s=" + this.f389809e + '}';
    }
}
