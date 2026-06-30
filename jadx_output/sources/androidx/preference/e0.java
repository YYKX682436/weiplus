package androidx.preference;

/* loaded from: classes13.dex */
public class e0 extends androidx.recyclerview.widget.m3 {

    /* renamed from: g, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f11808g;

    /* renamed from: h, reason: collision with root package name */
    public final n3.c f11809h;

    /* renamed from: i, reason: collision with root package name */
    public final n3.c f11810i;

    public e0(androidx.recyclerview.widget.RecyclerView recyclerView) {
        super(recyclerView);
        this.f11809h = this.f12144f;
        this.f11810i = new androidx.preference.d0(this);
        this.f11808g = recyclerView;
    }

    @Override // androidx.recyclerview.widget.m3
    public n3.c b() {
        return this.f11810i;
    }
}
