package in4;

/* loaded from: classes9.dex */
public class h extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f374497d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Set f374498e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f374499f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f374500g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f374501h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f374502i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18 f374503m;

    /* renamed from: n, reason: collision with root package name */
    public final r45.ir0 f374504n;

    public h(android.content.Context context, r45.xn6 xn6Var, in4.g gVar) {
        super(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576151rs);
        this.f374498e = new java.util.HashSet();
        r45.ir0 ir0Var = new r45.ir0();
        this.f374504n = ir0Var;
        ir0Var.f458810d = "101";
        ir0Var.f458811e = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574921k02);
        r45.vn6 vn6Var = xn6Var.T;
        if (vn6Var != null) {
            java.util.Iterator it = vn6Var.f469934f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                r45.ir0 ir0Var2 = (r45.ir0) it.next();
                if (ir0Var2.f458812f) {
                    r45.ir0 ir0Var3 = this.f374504n;
                    ir0Var3.f458810d = ir0Var2.f458810d;
                    ir0Var3.f458811e = ir0Var2.f458811e;
                    xn6Var.T.f469934f.remove(ir0Var2);
                    break;
                }
            }
        }
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d1j, (android.view.ViewGroup) null, false);
        this.f374497d = inflate;
        this.f374499f = inflate.findViewById(com.p314xaae8f345.mm.R.id.e0o);
        this.f374500g = inflate.findViewById(com.p314xaae8f345.mm.R.id.f565895e10);
        this.f374502i = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.e0l);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.osi);
        this.f374501h = textView;
        textView.setOnClickListener(new in4.c(this, gVar));
        this.f374503m = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18) inflate.findViewById(com.p314xaae8f345.mm.R.id.e0p);
        java.util.Iterator it6 = xn6Var.T.f469934f.iterator();
        while (it6.hasNext()) {
            r45.ir0 ir0Var4 = (r45.ir0) it6.next();
            android.view.View inflate2 = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d1k, (android.view.ViewGroup) this.f374503m, false);
            android.widget.TextView textView2 = (android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.e0u);
            textView2.setText(ir0Var4.f458811e);
            textView2.setOnClickListener(new in4.d(this, ir0Var4, textView2, context));
            this.f374503m.addView(inflate2);
        }
        this.f374502i.setText(xn6Var.T.f469932d);
        this.f374502i.setOnClickListener(new in4.e(this, xn6Var));
        setContentView(this.f374497d);
        setCanceledOnTouchOutside(true);
        setOnDismissListener(new in4.f(this, gVar));
    }

    public void c(android.view.View view, boolean z17, int i17, int i18) {
        super.show();
        int[] a17 = in4.r.a(view.getContext(), view, this.f374497d, z17);
        if (z17) {
            android.view.View view2 = this.f374500g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/widget/FeedbackPopupWindow", "show", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/widget/FeedbackPopupWindow", "show", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = this.f374499f;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/widget/FeedbackPopupWindow", "show", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/topstory/ui/widget/FeedbackPopupWindow", "show", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view4 = this.f374500g;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/topstory/ui/widget/FeedbackPopupWindow", "show", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/topstory/ui/widget/FeedbackPopupWindow", "show", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view5 = this.f374499f;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/topstory/ui/widget/FeedbackPopupWindow", "show", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/topstory/ui/widget/FeedbackPopupWindow", "show", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
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
