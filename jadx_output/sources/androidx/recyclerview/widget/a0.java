package androidx.recyclerview.widget;

/* loaded from: classes16.dex */
public final class a0 implements java.util.Comparator {
    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        androidx.recyclerview.widget.g0 g0Var = (androidx.recyclerview.widget.g0) obj;
        androidx.recyclerview.widget.g0 g0Var2 = (androidx.recyclerview.widget.g0) obj2;
        int i17 = g0Var.f12024a - g0Var2.f12024a;
        return i17 == 0 ? g0Var.f12025b - g0Var2.f12025b : i17;
    }
}
