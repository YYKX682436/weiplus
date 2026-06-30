package u4;

/* loaded from: classes13.dex */
public class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f506032a;

    /* renamed from: b, reason: collision with root package name */
    public final int f506033b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.ViewGroup f506034c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f506035d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Runnable f506036e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Runnable f506037f;

    public j0(android.view.ViewGroup viewGroup, int i17, android.content.Context context) {
        this.f506033b = -1;
        this.f506032a = context;
        this.f506034c = viewGroup;
        this.f506033b = i17;
    }

    public static u4.j0 b(android.view.ViewGroup viewGroup, int i17, android.content.Context context) {
        android.util.SparseArray sparseArray = (android.util.SparseArray) viewGroup.getTag(com.p314xaae8f345.mm.R.id.oj8);
        if (sparseArray == null) {
            sparseArray = new android.util.SparseArray();
            viewGroup.setTag(com.p314xaae8f345.mm.R.id.oj8, sparseArray);
        }
        u4.j0 j0Var = (u4.j0) sparseArray.get(i17);
        if (j0Var != null) {
            return j0Var;
        }
        u4.j0 j0Var2 = new u4.j0(viewGroup, i17, context);
        sparseArray.put(i17, j0Var2);
        return j0Var2;
    }

    public void a() {
        android.view.View view = this.f506035d;
        android.view.ViewGroup viewGroup = this.f506034c;
        int i17 = this.f506033b;
        if (i17 > 0 || view != null) {
            viewGroup.removeAllViews();
            if (i17 > 0) {
                android.view.LayoutInflater.from(this.f506032a).inflate(i17, viewGroup);
            } else {
                viewGroup.addView(view);
            }
        }
        java.lang.Runnable runnable = this.f506036e;
        if (runnable != null) {
            runnable.run();
        }
        viewGroup.setTag(com.p314xaae8f345.mm.R.id.f568928oj2, this);
    }

    public j0(android.view.ViewGroup viewGroup, android.view.View view) {
        this.f506033b = -1;
        this.f506034c = viewGroup;
        this.f506035d = view;
    }
}
