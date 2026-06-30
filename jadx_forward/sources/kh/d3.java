package kh;

/* loaded from: classes2.dex */
public final class d3 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Comparator f389315d;

    public d3(java.util.Comparator comparator) {
        this.f389315d = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        int compare = this.f389315d.compare(obj, obj2);
        return compare != 0 ? compare : mz5.a.b(java.lang.Integer.valueOf(((java.util.List) ((java.util.Map.Entry) obj2).getValue()).size()), java.lang.Integer.valueOf(((java.util.List) ((java.util.Map.Entry) obj).getValue()).size()));
    }
}
