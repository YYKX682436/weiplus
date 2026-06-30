package androidx.recyclerview.widget;

/* loaded from: classes10.dex */
public final class d implements androidx.recyclerview.widget.r1 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.recyclerview.widget.f2 f11985a;

    public d(androidx.recyclerview.widget.f2 f2Var) {
        this.f11985a = f2Var;
    }

    @Override // androidx.recyclerview.widget.r1
    public void a(int i17, int i18, java.lang.Object obj) {
        this.f11985a.notifyItemRangeChanged(i17, i18, obj);
    }

    @Override // androidx.recyclerview.widget.r1
    public void b(int i17, int i18) {
        this.f11985a.notifyItemRangeInserted(i17, i18);
    }

    @Override // androidx.recyclerview.widget.r1
    public void c(int i17, int i18) {
        this.f11985a.notifyItemRangeRemoved(i17, i18);
    }

    @Override // androidx.recyclerview.widget.r1
    public void d(int i17, int i18) {
        this.f11985a.notifyItemMoved(i17, i18);
    }
}
