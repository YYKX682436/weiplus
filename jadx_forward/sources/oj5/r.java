package oj5;

/* loaded from: classes14.dex */
public final class r extends p012xc85e97e9.p103xe821e364.p104xd1075a44.i3 {

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.HashMap f427410h = new java.util.HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f427411a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f427412b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f427413c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f427414d;

    /* renamed from: e, reason: collision with root package name */
    public final oj5.q f427415e;

    /* renamed from: f, reason: collision with root package name */
    public final oj5.b0 f427416f;

    /* renamed from: g, reason: collision with root package name */
    public final oj5.p f427417g;

    public r(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17, int i18, boolean z17, oj5.b0 viewPool, com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 asyncHandler) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewPool, "viewPool");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(asyncHandler, "asyncHandler");
        this.f427411a = recyclerView;
        this.f427412b = "DynamicViewCacheEx@" + hashCode();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        this.f427413c = false;
        int[] iArr = new int[3];
        for (int i19 = 0; i19 < 3; i19++) {
            iArr[i19] = 0;
        }
        this.f427414d = iArr;
        oj5.q qVar = new oj5.q(this);
        this.f427415e = qVar;
        this.f427416f = viewPool;
        oj5.o oVar = new oj5.o(this.f427412b, i17, i18, qVar, z17, asyncHandler, iArr);
        this.f427417g = new oj5.p(this);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView2 = this.f427411a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView2, "recyclerView");
        oVar.f427402h = recyclerView2;
        recyclerView2.i(oVar.f427405k);
        oj5.x.c(recyclerView2, new oj5.i(oVar));
        recyclerView2.post(new oj5.k(oVar, recyclerView2));
        this.f427411a.m7972xccc65695(new oj5.c(this));
        this.f427411a.post(new oj5.f(this));
    }

    public static final void a(oj5.r rVar, android.view.View view) {
        rVar.getClass();
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(view.getTag(com.p314xaae8f345.mm.R.id.f563883c5), 1);
        int[] iArr = rVar.f427414d;
        if (b17) {
            iArr[0] = iArr[0] + 1;
        } else {
            iArr[1] = iArr[1] + 1;
        }
    }

    public final int[] b() {
        return (int[]) this.f427414d.clone();
    }

    public final void c(android.view.View view, boolean z17) {
        android.view.View findViewById;
        if (z17) {
            view.setTag(com.p314xaae8f345.mm.R.id.f563883c5, null);
            if (!this.f427413c || (findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.f563885c7)) == null) {
                return;
            }
            ((android.view.ViewGroup) view).removeView(findViewById);
            return;
        }
        view.setTag(com.p314xaae8f345.mm.R.id.f563883c5, 1);
        if (this.f427413c) {
            android.widget.TextView textView = new android.widget.TextView(view.getContext());
            textView.setText("😄");
            textView.setId(com.p314xaae8f345.mm.R.id.f563885c7);
            textView.setTextSize(1, 40.0f);
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            ((android.view.ViewGroup) view).addView(textView, layoutParams);
        }
    }

    public final void d(android.view.View itemView, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        if (!z17) {
            itemView.setTag(com.p314xaae8f345.mm.R.id.f563884c6, 1);
            return;
        }
        java.lang.reflect.Field declaredField = android.view.View.class.getDeclaredField("mRunQueue");
        declaredField.setAccessible(true);
        declaredField.set(itemView, null);
        itemView.setTag(com.p314xaae8f345.mm.R.id.f563884c6, null);
    }
}
