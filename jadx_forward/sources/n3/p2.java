package n3;

/* loaded from: classes14.dex */
public class p2 extends android.view.WindowInsetsAnimation.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final n3.j2 f415918a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.List f415919b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.ArrayList f415920c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f415921d;

    public p2(n3.j2 j2Var) {
        super(j2Var.f415881b);
        this.f415921d = new java.util.HashMap();
        this.f415918a = j2Var;
    }

    public final n3.s2 a(android.view.WindowInsetsAnimation windowInsetsAnimation) {
        n3.s2 s2Var = (n3.s2) this.f415921d.get(windowInsetsAnimation);
        if (s2Var != null) {
            return s2Var;
        }
        n3.s2 s2Var2 = new n3.s2(windowInsetsAnimation);
        this.f415921d.put(windowInsetsAnimation, s2Var2);
        return s2Var2;
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public void onEnd(android.view.WindowInsetsAnimation windowInsetsAnimation) {
        this.f415918a.b(a(windowInsetsAnimation));
        this.f415921d.remove(windowInsetsAnimation);
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public void onPrepare(android.view.WindowInsetsAnimation windowInsetsAnimation) {
        this.f415918a.c(a(windowInsetsAnimation));
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public android.view.WindowInsets onProgress(android.view.WindowInsets windowInsets, java.util.List list) {
        java.util.ArrayList arrayList = this.f415920c;
        if (arrayList == null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(list.size());
            this.f415920c = arrayList2;
            this.f415919b = java.util.Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return this.f415918a.d(n3.g3.i(windowInsets, null), this.f415919b).h();
            }
            android.view.WindowInsetsAnimation windowInsetsAnimation = (android.view.WindowInsetsAnimation) list.get(size);
            n3.s2 a17 = a(windowInsetsAnimation);
            a17.f415939a.d(windowInsetsAnimation.getFraction());
            this.f415920c.add(a17);
        }
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public android.view.WindowInsetsAnimation.Bounds onStart(android.view.WindowInsetsAnimation windowInsetsAnimation, android.view.WindowInsetsAnimation.Bounds bounds) {
        n3.i2 e17 = this.f415918a.e(a(windowInsetsAnimation), new n3.i2(bounds));
        e17.getClass();
        return new android.view.WindowInsetsAnimation.Bounds(e17.f415876a.e(), e17.f415877b.e());
    }
}
