package androidx.recyclerview.widget;

/* loaded from: classes15.dex */
public class m1 {

    /* renamed from: b, reason: collision with root package name */
    public int f12129b;

    /* renamed from: c, reason: collision with root package name */
    public int f12130c;

    /* renamed from: d, reason: collision with root package name */
    public int f12131d;

    /* renamed from: e, reason: collision with root package name */
    public int f12132e;

    /* renamed from: f, reason: collision with root package name */
    public int f12133f;

    /* renamed from: g, reason: collision with root package name */
    public int f12134g;

    /* renamed from: i, reason: collision with root package name */
    public int f12136i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f12138k;

    /* renamed from: a, reason: collision with root package name */
    public boolean f12128a = true;

    /* renamed from: h, reason: collision with root package name */
    public int f12135h = 0;

    /* renamed from: j, reason: collision with root package name */
    public java.util.List f12137j = null;

    public void a(android.view.View view) {
        int b17;
        int size = this.f12137j.size();
        android.view.View view2 = null;
        int i17 = Integer.MAX_VALUE;
        for (int i18 = 0; i18 < size; i18++) {
            android.view.View view3 = ((androidx.recyclerview.widget.k3) this.f12137j.get(i18)).itemView;
            androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (androidx.recyclerview.widget.RecyclerView.LayoutParams) view3.getLayoutParams();
            if (view3 != view && !layoutParams.d() && (b17 = (layoutParams.b() - this.f12131d) * this.f12132e) >= 0 && b17 < i17) {
                view2 = view3;
                if (b17 == 0) {
                    break;
                } else {
                    i17 = b17;
                }
            }
        }
        if (view2 == null) {
            this.f12131d = -1;
        } else {
            this.f12131d = ((androidx.recyclerview.widget.RecyclerView.LayoutParams) view2.getLayoutParams()).b();
        }
    }

    public android.view.View b(androidx.recyclerview.widget.z2 z2Var) {
        java.util.List list = this.f12137j;
        if (list == null) {
            android.view.View f17 = z2Var.f(this.f12131d);
            this.f12131d += this.f12132e;
            return f17;
        }
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            android.view.View view = ((androidx.recyclerview.widget.k3) this.f12137j.get(i17)).itemView;
            androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams();
            if (!layoutParams.d() && this.f12131d == layoutParams.b()) {
                a(view);
                return view;
            }
        }
        return null;
    }
}
