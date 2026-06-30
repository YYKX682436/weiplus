package ab5;

/* loaded from: classes9.dex */
public class i extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2 implements android.content.DialogInterface {

    /* renamed from: d, reason: collision with root package name */
    public final int f84468d;

    /* renamed from: e, reason: collision with root package name */
    public int f84469e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f84470f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f84471g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f84472h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f84473i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.Button f84474m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.ViewGroup f84475n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f84476o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f84477p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f84478q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f84479r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f84480s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.List f84481t;

    /* renamed from: u, reason: collision with root package name */
    public ab5.g f84482u;

    /* renamed from: v, reason: collision with root package name */
    public final android.widget.CompoundButton.OnCheckedChangeListener f84483v;

    public i(android.content.Context context, int i17, java.lang.String str) {
        super(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576151rs);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f84481t = arrayList;
        ab5.d dVar = new ab5.d(this);
        this.f84483v = new ab5.e(this);
        this.f84468d = i17;
        this.f84469e = 0;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            this.f84470f = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5.class)).m2(str, 0) || ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5.class)).m2(str, 1) || ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5.class)).m2(str, 2);
        }
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569959sz, (android.view.ViewGroup) null);
        this.f84471g = linearLayout;
        android.widget.ImageView imageView = (android.widget.ImageView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.bhw);
        this.f84472h = imageView;
        imageView.setColorFilter(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        android.widget.ImageView imageView2 = (android.widget.ImageView) this.f84471g.findViewById(com.p314xaae8f345.mm.R.id.bhv);
        this.f84473i = imageView2;
        imageView2.setColorFilter(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        setCanceledOnTouchOutside(true);
        if (i17 != 0) {
            ((android.view.ViewStub) this.f84471g.findViewById(com.p314xaae8f345.mm.R.id.f565167bi5)).inflate();
            this.f84478q = (android.widget.TextView) this.f84471g.findViewById(com.p314xaae8f345.mm.R.id.f565166bi4);
            this.f84479r = (android.widget.TextView) this.f84471g.findViewById(com.p314xaae8f345.mm.R.id.f565164bi2);
            this.f84480s = (android.widget.TextView) this.f84471g.findViewById(com.p314xaae8f345.mm.R.id.f565165bi3);
            if (this.f84470f) {
                this.f84478q.setOnClickListener(dVar);
            } else {
                this.f84478q.setVisibility(8);
            }
            this.f84479r.setOnClickListener(dVar);
            this.f84480s.setOnClickListener(dVar);
            return;
        }
        ((android.view.ViewStub) this.f84471g.findViewById(com.p314xaae8f345.mm.R.id.f565163bi1)).inflate();
        this.f84474m = (android.widget.Button) this.f84471g.findViewById(com.p314xaae8f345.mm.R.id.bi7);
        this.f84475n = (android.view.ViewGroup) this.f84471g.findViewById(com.p314xaae8f345.mm.R.id.f565162bi0);
        this.f84476o = (android.widget.TextView) this.f84471g.findViewById(com.p314xaae8f345.mm.R.id.bhx);
        this.f84477p = (android.widget.TextView) this.f84471g.findViewById(com.p314xaae8f345.mm.R.id.bhy);
        this.f84474m.setOnClickListener(dVar);
        this.f84476o.setOnClickListener(dVar);
        this.f84477p.setOnClickListener(dVar);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        android.content.Context context2 = this.f84471g.getContext();
        arrayList2.add(new ab5.h(this, 1, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b0s), false));
        arrayList2.add(new ab5.h(this, 2, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b0r), false));
        arrayList2.add(new ab5.h(this, 3, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b0t), false));
        if (arrayList2.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandNoticeMoreDialog", "has no reason data");
            return;
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        android.content.Context context3 = this.f84471g.getContext();
        android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(context3);
        int i18 = 0;
        while (i18 < arrayList2.size() / 3) {
            linearLayout2.setOrientation(0);
            for (int i19 = 0; i19 < 3; i19++) {
                android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, context3.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561428i8));
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.C18933x72217163 c17 = c(context3, (ab5.h) arrayList2.get((i18 * 3) + i19));
                if (i19 != 0) {
                    layoutParams.leftMargin = context3.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
                }
                linearLayout2.addView(c17, layoutParams);
            }
            i18++;
        }
        this.f84475n.addView(linearLayout2);
        android.widget.LinearLayout linearLayout3 = new android.widget.LinearLayout(context3);
        int i27 = 0;
        while (true) {
            int i28 = i18 * 3;
            if (i27 >= arrayList2.size() - i28) {
                this.f84475n.addView(linearLayout3);
                return;
            }
            ab5.h hVar = (ab5.h) arrayList2.get(i28 + i27);
            linearLayout3.setOrientation(0);
            android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-2, context3.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561428i8));
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.C18933x72217163 c18 = c(context3, hVar);
            if (i27 != 0) {
                layoutParams2.leftMargin = context3.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
            }
            linearLayout3.addView(c18, layoutParams2);
            i27++;
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.C18933x72217163 c(android.content.Context context, ab5.h hVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.C18933x72217163 c18933x72217163 = new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.C18933x72217163(new android.view.ContextThemeWrapper(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f575461t), null, com.p314xaae8f345.mm.R.C30868x68b1db1.f575461t);
        c18933x72217163.setText(hVar.f84466b);
        c18933x72217163.setTag(hVar);
        c18933x72217163.setTextSize(0, i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561458j4));
        c18933x72217163.setOnCheckedChangeListener(this.f84483v);
        return c18933x72217163;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new ab5.f(this));
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandNoticeMoreDialog", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
        } else {
            try {
                super.dismiss();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandNoticeMoreDialog", "dismiss exception, e = " + e17.getMessage());
            }
        }
    }

    public void e(android.view.View view) {
        int f17;
        android.content.Context context = view.getContext();
        android.graphics.Point h17 = com.p314xaae8f345.mm.ui.bk.h(context);
        if (this.f84468d == 0) {
            f17 = i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561745rj) + i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561741rf) + i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561740re);
        } else {
            f17 = i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561748rm) + i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561741rf) + i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561740re);
            if (!this.f84470f) {
                f17 -= i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561750ro);
            }
        }
        android.view.Window window = getWindow();
        if (window != null) {
            android.view.WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 8388661;
            attributes.verticalMargin = 0.0f;
            attributes.horizontalMargin = 0.0f;
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            attributes.x = (((h17.x - iArr[0]) - (view.getMeasuredWidth() / 2)) - i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561739rd)) - (i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561741rf) / 2);
            int q17 = com.p314xaae8f345.mm.ui.bk.q(context);
            int f18 = i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561747rl);
            int f19 = i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561742rg);
            if ((((iArr[1] + view.getMeasuredHeight()) + f17) + f18) - f19 > h17.y - com.p314xaae8f345.mm.ui.bk.j(context)) {
                attributes.y = (((iArr[1] - q17) - f17) - f18) + f19;
                this.f84472h.setVisibility(8);
                this.f84473i.setVisibility(0);
            } else {
                attributes.y = (((iArr[1] - q17) + view.getMeasuredHeight()) + f18) - f19;
                this.f84472h.setVisibility(0);
                this.f84473i.setVisibility(8);
            }
            window.setAttributes(attributes);
        }
        try {
            super.show();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandNoticeMoreDialog", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f84471g);
    }
}
