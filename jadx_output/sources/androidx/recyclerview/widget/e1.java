package androidx.recyclerview.widget;

/* loaded from: classes5.dex */
public abstract class e1 extends androidx.recyclerview.widget.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f12008a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12009b;

    public e1(int i17, int i18) {
        this.f12008a = i18;
        this.f12009b = i17;
    }

    public int a(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.k3 k3Var) {
        return this.f12009b;
    }

    @Override // androidx.recyclerview.widget.a1
    public int getMovementFlags(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.k3 k3Var) {
        return androidx.recyclerview.widget.a1.makeMovementFlags(a(recyclerView, k3Var), this.f12008a);
    }
}
