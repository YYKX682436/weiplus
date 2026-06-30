package a85;

/* loaded from: classes15.dex */
public final class c extends androidx.recyclerview.widget.t0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a85.g f2393c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.GridLayoutManager f2394d;

    public c(a85.g gVar, androidx.recyclerview.widget.GridLayoutManager gridLayoutManager) {
        this.f2393c = gVar;
        this.f2394d = gridLayoutManager;
    }

    @Override // androidx.recyclerview.widget.t0
    public int c(int i17) {
        switch (this.f2393c.f2402f.getItemViewType(i17)) {
            case 100:
            case 101:
            case 104:
            case 105:
            case 106:
            case 108:
                return this.f2394d.f11861w;
            case 102:
            case 103:
            case 107:
            default:
                return 1;
        }
    }
}
