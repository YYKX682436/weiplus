package xj3;

/* loaded from: classes8.dex */
public final class b extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 implements android.view.View.OnClickListener {

    /* renamed from: q, reason: collision with root package name */
    public static final float f536390q = sj3.i1.f490103o;

    /* renamed from: r, reason: collision with root package name */
    public static final float f536391r = sj3.i1.f490101m;

    /* renamed from: s, reason: collision with root package name */
    public static final float f536392s = sj3.i1.f490095g;

    /* renamed from: t, reason: collision with root package name */
    public static final float f536393t = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 2);

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f536394d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f536395e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.concurrent.CopyOnWriteArrayList f536396f;

    /* renamed from: g, reason: collision with root package name */
    public int f536397g;

    /* renamed from: h, reason: collision with root package name */
    public int f536398h;

    /* renamed from: i, reason: collision with root package name */
    public int f536399i;

    /* renamed from: m, reason: collision with root package name */
    public float f536400m;

    /* renamed from: n, reason: collision with root package name */
    public float f536401n;

    /* renamed from: o, reason: collision with root package name */
    public yz5.p f536402o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f536403p;

    public b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f536394d = c1163xf1deaba4;
        this.f536395e = context;
        this.f536396f = new java.util.concurrent.CopyOnWriteArrayList();
        this.f536397g = -1;
        this.f536398h = -1;
        this.f536399i = -1;
        this.f536400m = f536390q;
        this.f536401n = f536391r;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f536396f.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onAttachedToRecyclerView */
    public void mo8156x4147ed22(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        super.mo8156x4147ed22(recyclerView);
        this.f536403p = true;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        xj3.d holder = (xj3.d) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams((int) this.f536400m, (int) this.f536401n);
        android.widget.ImageView imageView = holder.f536406e;
        if (imageView != null) {
            imageView.setLayoutParams(layoutParams);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = holder.f536405d;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setLayoutParams(layoutParams);
        }
        if (this.f536399i != i17) {
            if (imageView != null) {
                imageView.setVisibility(0);
            }
        } else if (imageView != null) {
            imageView.setVisibility(8);
        }
        if (this.f536403p) {
            this.f536403p = false;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f536394d;
            if (c1163xf1deaba4 != null) {
                int i18 = this.f536399i;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(i18));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(c1163xf1deaba4, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/projector/recyclerview/ScreenProjectThumbLayoutAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/multitalk/ui/widget/projector/recyclerview/ScreenProjectThumbnailLayoutHolder;I)V", "Undefined", "smoothScrollToPosition", "(I)V");
                c1163xf1deaba4.c1(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/multitalk/ui/widget/projector/recyclerview/ScreenProjectThumbLayoutAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/multitalk/ui/widget/projector/recyclerview/ScreenProjectThumbnailLayoutHolder;I)V", "Undefined", "smoothScrollToPosition", "(I)V");
            }
        }
        boolean z17 = !this.f536396f.isEmpty();
        float f17 = f536393t;
        if (z17 && i17 < this.f536396f.size()) {
            f3.i iVar = new f3.i(this.f536395e.getResources(), (android.graphics.Bitmap) this.f536396f.get(i17));
            iVar.f340782d.setAntiAlias(true);
            iVar.c(f17);
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setBackground(iVar);
            }
        }
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setClipToOutline(true);
        }
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setOutlineProvider(new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f1(f17));
        }
        if (imageView != null) {
            imageView.setClipToOutline(true);
        }
        if (imageView != null) {
            imageView.setOutlineProvider(new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f1(f17));
        }
        holder.f3639x46306858.setTag(java.lang.Integer.valueOf(i17));
        holder.f3639x46306858.setClipToOutline(true);
        holder.f3639x46306858.setOutlineProvider(new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f1(f17));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View v17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/multitalk/ui/widget/projector/recyclerview/ScreenProjectThumbLayoutAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        yz5.p pVar = this.f536402o;
        if (pVar != null) {
            java.lang.Object tag = v17.getTag();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type kotlin.Int");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/projector/recyclerview/ScreenProjectThumbLayoutAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f536395e).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c3v, parent, false);
        inflate.setOnClickListener(this);
        return new xj3.d(inflate);
    }
}
