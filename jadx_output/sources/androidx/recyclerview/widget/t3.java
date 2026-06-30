package androidx.recyclerview.widget;

/* loaded from: classes15.dex */
public class t3 {

    /* renamed from: a, reason: collision with root package name */
    public int f12231a;

    /* renamed from: b, reason: collision with root package name */
    public int f12232b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12233c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f12234d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f12235e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f12236f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.StaggeredGridLayoutManager f12237g;

    public t3(androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f12237g = staggeredGridLayoutManager;
        a();
    }

    public void a() {
        this.f12231a = -1;
        this.f12232b = Integer.MIN_VALUE;
        this.f12233c = false;
        this.f12234d = false;
        this.f12235e = false;
        int[] iArr = this.f12236f;
        if (iArr != null) {
            java.util.Arrays.fill(iArr, -1);
        }
    }
}
