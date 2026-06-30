package xj1;

/* loaded from: classes7.dex */
public class h0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 implements android.view.View.OnClickListener, android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f536327d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f536328e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f536329f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f536330g;

    /* renamed from: h, reason: collision with root package name */
    public final xj1.d0 f536331h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f536332i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 f536333m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(android.view.View itemView, xj1.d0 d0Var) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        this.f536331h = d0Var;
        this.f536332i = true;
        itemView.setOnClickListener(this);
        if (k()) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            if (z65.c.a()) {
                itemView.setOnLongClickListener(this);
            }
        }
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.l5_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f536327d = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.p314xaae8f345.mm.R.id.nx7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f536328e = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.p314xaae8f345.mm.R.id.h5n);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f536329f = (android.widget.ImageView) findViewById3;
        android.view.View findViewById4 = itemView.findViewById(com.p314xaae8f345.mm.R.id.d0v);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f536330g = findViewById4;
    }

    public final void i(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 dataItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataItem, "dataItem");
        this.f536333m = dataItem;
        java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p.a(dataItem.f157896f);
        boolean z17 = a17 == null || a17.length() == 0;
        android.widget.TextView textView = this.f536328e;
        if (z17) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(a17);
        }
        j();
        l01.b bVar = l01.d0.f396294a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e4 = this.f536333m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c11714x918fd2e4);
        bVar.b(this.f536329f, c11714x918fd2e4.f157901n, l01.a.h(), l01.q0.f396320d);
    }

    public final void j() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e4 = this.f536333m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c11714x918fd2e4);
        java.lang.String str = c11714x918fd2e4.f157898h;
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e42 = this.f536333m;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c11714x918fd2e42);
            java.lang.String username = c11714x918fd2e42.f157894d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(username, "username");
            java.lang.String quote = java.util.regex.Pattern.quote("@app");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(quote, "quote(...)");
            str = r26.i0.w(username, quote, "", false);
        }
        this.f536327d.setText(str);
    }

    public boolean k() {
        return this.f536332i;
    }

    public final void l(android.view.View view, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e4 = this.f536333m;
        if (c11714x918fd2e4 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.x xVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.x.f166565a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            android.content.Context context = view.getContext();
            java.lang.String str2 = c11714x918fd2e4.f157894d;
            java.lang.String str3 = c11714x918fd2e4.f157895e;
            int i17 = c11714x918fd2e4.f157896f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559();
            c12559xbdae8559.f169323f = 1103;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a) xVar).b(context, str2, str3, str, i17, 0, c12559xbdae8559, null, null);
            xj1.d0 d0Var = this.f536331h;
            if (d0Var != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1202x9835ae9e.C12708x81c12732) d0Var).f171176o = true;
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/ui/collection/CollectionVerticalListViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        l(view, null);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/collection/CollectionVerticalListViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/ui/collection/CollectionVerticalListViewHolder", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (z65.c.a()) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            new com.p314xaae8f345.mm.ui.p2740x696c9db.s6(view.getContext()).a(view, new xj1.e0("?wechat_appbrand_test=1"), new xj1.f0(this, view, "?wechat_appbrand_test=1"), xj1.g0.f536322d);
            z17 = true;
        } else {
            z17 = false;
        }
        yj0.a.i(z17, this, "com/tencent/mm/plugin/appbrand/ui/collection/CollectionVerticalListViewHolder", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return z17;
    }
}
