package in4;

/* loaded from: classes9.dex */
public class q extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f374519d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f374520e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f374521f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f374522g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f374523h;

    public q(android.content.Context context, r45.xn6 xn6Var, in4.p pVar) {
        super(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576151rs);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571122d26, (android.view.ViewGroup) null, false);
        this.f374519d = inflate;
        this.f374520e = inflate.findViewById(com.p314xaae8f345.mm.R.id.f567507jr0);
        this.f374521f = inflate.findViewById(com.p314xaae8f345.mm.R.id.jrx);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.osj);
        this.f374522g = findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.dxu);
        this.f374523h = findViewById2;
        findViewById.setOnClickListener(new in4.l(this, pVar, xn6Var));
        findViewById2.setOnClickListener(new in4.m(this, pVar, xn6Var));
        findViewById2.setOnLongClickListener(new in4.n(this, pVar, xn6Var));
        setContentView(inflate);
        setCanceledOnTouchOutside(true);
        setOnDismissListener(new in4.o(this, pVar));
    }

    public void c(android.view.View view, boolean z17, int i17, int i18) {
        super.show();
        int[] a17 = in4.r.a(view.getContext(), view, this.f374519d, z17);
        if (z17) {
            android.view.View view2 = this.f374521f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/widget/MorePopupWindow", "show", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/widget/MorePopupWindow", "show", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = this.f374520e;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/widget/MorePopupWindow", "show", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/topstory/ui/widget/MorePopupWindow", "show", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view4 = this.f374521f;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/topstory/ui/widget/MorePopupWindow", "show", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/topstory/ui/widget/MorePopupWindow", "show", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view5 = this.f374520e;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/topstory/ui/widget/MorePopupWindow", "show", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/topstory/ui/widget/MorePopupWindow", "show", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        a17[0] = a17[0] + i17;
        a17[1] = a17[1] + i18;
        android.view.Window window = getWindow();
        window.setLayout(-2, -2);
        android.view.WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -2;
        attributes.height = -2;
        attributes.x = a17[0];
        attributes.y = a17[1];
        attributes.gravity = 8388659;
        window.setAttributes(attributes);
    }
}
