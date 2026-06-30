package androidx.recyclerview.widget;

/* loaded from: classes10.dex */
public class p3 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f12191d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.r3 f12192e;

    public p3(androidx.recyclerview.widget.r3 r3Var) {
        this.f12192e = r3Var;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        if (i17 == 0 && this.f12191d) {
            this.f12191d = false;
            this.f12192e.h();
        }
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        if (i17 == 0 && i18 == 0) {
            return;
        }
        this.f12191d = true;
    }
}
