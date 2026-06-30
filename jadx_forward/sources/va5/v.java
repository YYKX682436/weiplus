package va5;

/* loaded from: classes11.dex */
public final class v extends android.widget.LinearLayout implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public va5.p f515988d;

    /* renamed from: e, reason: collision with root package name */
    public final va5.a f515989e;

    /* renamed from: f, reason: collision with root package name */
    public int f515990f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f515991g;

    /* renamed from: h, reason: collision with root package name */
    public int f515992h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(va5.a menu) {
        super(menu.f515935a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        this.f515989e = menu;
        this.f515991g = new java.util.ArrayList();
        int i17 = 0;
        setOrientation(0);
        java.util.ArrayList arrayList = (java.util.ArrayList) menu.f515936b;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            va5.c cVar = (va5.c) it.next();
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(cVar.f515943g, -1);
            android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
            linearLayout.setId(cVar.f515937a);
            linearLayout.setGravity(16);
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(layoutParams);
            linearLayout.setBackground(cVar.f515940d);
            linearLayout.setOnClickListener(this);
            addView(linearLayout);
            this.f515991g.add(linearLayout);
            if (cVar.f515939c != null) {
                int e17 = com.p314xaae8f345.mm.ui.zk.e(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
                android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(e17, e17);
                android.widget.ImageView imageView = new android.widget.ImageView(getContext());
                imageView.setId(com.p314xaae8f345.mm.R.id.vb_);
                imageView.setImageDrawable(cVar.f515939c);
                imageView.setLayoutParams(layoutParams2);
                linearLayout.addView(imageView);
            }
            if (!android.text.TextUtils.isEmpty(cVar.f515938b)) {
                android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(-2, -2);
                android.widget.TextView textView = new android.widget.TextView(getContext());
                textView.setPadding(i65.a.b(getContext(), 16), 0, i65.a.b(getContext(), 16), 0);
                textView.setId(com.p314xaae8f345.mm.R.id.vba);
                textView.setText(cVar.f515938b);
                textView.setGravity(17);
                textView.setTextSize(0, i65.a.q(getContext()) * cVar.f515942f);
                textView.setTextColor(cVar.f515941e);
                textView.setLayoutParams(layoutParams3);
                linearLayout.addView(textView);
            }
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            i17 += ((va5.c) it6.next()).f515943g;
        }
        this.f515992h = i17;
        getViewTreeObserver().addOnPreDrawListener(new va5.u(this, this));
    }

    public final void a(java.lang.String title, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(i17);
        android.widget.TextView textView = linearLayout != null ? (android.widget.TextView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.vba) : null;
        if (textView == null) {
            return;
        }
        textView.setText(title);
    }

    public final void b(boolean z17, int i17, int i18) {
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(i17);
        android.view.View findViewById = linearLayout != null ? linearLayout.findViewById(i18) : null;
        if (findViewById == null) {
            return;
        }
        int i19 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/anim/swipe/SwipeMenuView", "updateMenuVisible", "(ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/ui/anim/swipe/SwipeMenuView", "updateMenuVisible", "(ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: getExpandIndex */
    public final int m171392xbe8ab122() {
        java.util.Iterator it = ((java.util.ArrayList) this.f515989e.f515936b).iterator();
        int i17 = 0;
        while (it.hasNext()) {
            if (((va5.c) it.next()).f515944h) {
                return i17;
            }
            i17++;
        }
        return -1;
    }

    /* renamed from: getMTotalMenuWidth */
    public final int m171393xc082385a() {
        return this.f515992h;
    }

    /* renamed from: getPosition */
    public final int m171394xa86cd69f() {
        return this.f515990f;
    }

    /* renamed from: getSwipeMenuLayout */
    public final va5.p m171395x800ce60d() {
        return this.f515988d;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View v17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/anim/swipe/SwipeMenuView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        yj0.a.h(this, "com/tencent/mm/ui/anim/swipe/SwipeMenuView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    /* renamed from: setLayout */
    public final void m171396x1627522c(va5.p pVar) {
        this.f515988d = pVar;
    }

    /* renamed from: setMTotalMenuWidth */
    public final void m171397xf758d1ce(int i17) {
        this.f515992h = i17;
    }

    /* renamed from: setOnSwipeItemClickListener */
    public final void m171398x5f706130(va5.q qVar) {
    }

    /* renamed from: setPosition */
    public final void m171399xa32537ab(int i17) {
        this.f515990f = i17;
    }
}
