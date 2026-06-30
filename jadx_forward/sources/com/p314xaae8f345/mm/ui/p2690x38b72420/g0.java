package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes3.dex */
public class g0 extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f288246d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f288247e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f288248f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f288249g;

    public g0(android.content.Context context, com.p314xaae8f345.mm.ui.p2690x38b72420.f0 itemType) {
        super(context);
        this.f288247e = null;
        this.f288248f = null;
        this.f288249g = null;
        this.f288246d = context;
        android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f569520dd, this);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.cg7);
        this.f288247e = findViewById;
        android.view.View findViewById2 = findViewById.findViewById(com.p314xaae8f345.mm.R.id.f564290n7);
        this.f288248f = findViewById2;
        android.view.ViewGroup.LayoutParams layoutParams = findViewById2.getLayoutParams();
        layoutParams.height = (int) (i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561146ao) * i65.a.A(context));
        this.f288248f.setLayoutParams(layoutParams);
        this.f288249g = (android.widget.TextView) this.f288248f.findViewById(com.p314xaae8f345.mm.R.id.f564292n9);
        android.view.View view = this.f288247e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemType, "itemType");
        int ordinal = itemType.ordinal();
        int i17 = ordinal != 0 ? ordinal != 1 ? ordinal != 3 ? 0 : 2 : 4 : 3;
        if (view != null) {
            android.content.Context context2 = view.getContext();
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.pk(view, "addressbook_cell");
            aVar.fk(view, "addressbook_cell_type", java.lang.Integer.valueOf(i17));
            aVar.Ai(view, new tf5.k(context2));
            aVar.ik(view, 8, 33926);
        }
        this.f288247e.setOnClickListener(new com.p314xaae8f345.mm.ui.p2690x38b72420.d0(this, itemType));
        this.f288248f.setOnTouchListener(new com.p314xaae8f345.mm.ui.p2690x38b72420.e0(this));
        android.widget.ImageView imageView = (android.widget.ImageView) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.C21522xf5a6e956) this.f288248f.findViewById(com.p314xaae8f345.mm.R.id.f564291n8)).m79176xc2a54588();
        int ordinal2 = itemType.ordinal();
        if (ordinal2 == 0) {
            this.f288249g.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f571398dw);
            com.p314xaae8f345.mm.p943x351df9c2.z.e(getContext(), imageView, com.p314xaae8f345.mm.R.raw.f78927x4fa27c71);
            return;
        }
        if (ordinal2 == 1) {
            this.f288249g.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f571406e4);
            com.p314xaae8f345.mm.p943x351df9c2.z.e(getContext(), imageView, com.p314xaae8f345.mm.R.raw.f78929xaa217412);
        } else if (ordinal2 == 2) {
            this.f288248f.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562839q2);
            this.f288249g.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f571405e3);
            com.p314xaae8f345.mm.p943x351df9c2.z.e(getContext(), imageView, com.p314xaae8f345.mm.R.raw.f78934x6f3167c3);
        } else {
            if (ordinal2 != 3) {
                return;
            }
            this.f288249g.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f571407e5);
            com.p314xaae8f345.mm.p943x351df9c2.z.e(getContext(), imageView, com.p314xaae8f345.mm.R.C30861xcebc809e.c09);
        }
    }

    /* renamed from: setVisible */
    public void m80420xcd1079b0(boolean z17) {
        android.view.View view = this.f288247e;
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/contact/AddressUIEntranceHeaderView", "setVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/contact/AddressUIEntranceHeaderView", "setVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
