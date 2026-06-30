package e33;

/* loaded from: classes10.dex */
public class h5 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public e33.v2 f328789d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f328790e;

    /* renamed from: f, reason: collision with root package name */
    public final int f328791f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f328792g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f328793h;

    /* renamed from: i, reason: collision with root package name */
    public e33.g5 f328794i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f328795m;

    /* renamed from: n, reason: collision with root package name */
    public final int f328796n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f328797o;

    /* renamed from: p, reason: collision with root package name */
    public int f328798p;

    /* renamed from: q, reason: collision with root package name */
    public int f328799q;

    /* renamed from: r, reason: collision with root package name */
    public int f328800r;

    /* renamed from: s, reason: collision with root package name */
    public int f328801s;

    /* renamed from: t, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f328802t;

    /* renamed from: u, reason: collision with root package name */
    public final java.text.SimpleDateFormat f328803u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f328804v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f328805w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f328806x;

    /* renamed from: y, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.g1 f328807y;

    public h5(android.content.Context context, java.util.ArrayList arrayList, int i17, boolean z17, int i18, boolean z18) {
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        this.f328793h = arrayList2;
        this.f328798p = -1;
        this.f328799q = -1;
        this.f328803u = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm", java.util.Locale.getDefault());
        boolean z19 = false;
        this.f328806x = false;
        this.f328807y = new p012xc85e97e9.p103xe821e364.p104xd1075a44.g1(new e33.d5(this));
        this.f328790e = context;
        this.f328792g = arrayList;
        arrayList2.addAll(arrayList);
        this.f328791f = i17;
        this.f328795m = z17;
        this.f328796n = i18;
        if (t23.p0.k().f496830f == 15) {
            this.f328802t = context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563391af0);
        } else {
            this.f328802t = context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562893re);
        }
        this.f328804v = z18;
        if (context instanceof android.app.Activity) {
            this.f328805w = ((android.app.Activity) context).getIntent().getStringExtra("GalleryUI_ToUser");
        }
        if (t23.p0.k().f496830f == 3 && ((d40.n) ((e40.v) i95.n0.c(e40.v.class))).wi()) {
            z19 = true;
        }
        this.f328806x = z19;
    }

    public final void B(android.widget.ImageView imageView, java.lang.String str, int i17) {
        boolean z17;
        boolean contains = this.f328792g.contains(str);
        android.graphics.drawable.Drawable drawable = this.f328802t;
        if (contains) {
            imageView.setBackground(null);
            imageView.setImageDrawable(drawable);
            z17 = false;
        } else {
            imageView.setBackgroundColor(-1090519041);
            imageView.setImageDrawable(null);
            z17 = true;
        }
        imageView.setVisibility(0);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f328789d.i(this.f328800r)) && this.f328789d.i(this.f328800r).equals(str)) {
            imageView.setVisibility(0);
            if (z17 && i17 == this.f328801s) {
                imageView.setImageDrawable(drawable);
                return;
            }
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f328789d.i(this.f328800r)) || this.f328789d.i(this.f328800r).equals(str)) {
            return;
        }
        int i18 = this.f328801s;
        if (i17 != i18 && !z17) {
            imageView.setVisibility(8);
        } else {
            if (i17 != i18 || z17) {
                return;
            }
            imageView.setImageDrawable(drawable);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f328793h.size();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/PreviewSelectedImageAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        e33.g5 g5Var = this.f328794i;
        if (g5Var != null) {
            if (this.f328795m) {
                ((e33.v3) g5Var).a(view, ((java.lang.Integer) view.getTag()).intValue());
            } else {
                ((e33.v3) g5Var).a(view, this.f328793h.indexOf(view.getTag()));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/PreviewSelectedImageAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        return new e33.f5(android.view.LayoutInflater.from(this.f328790e).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c_w, viewGroup, false));
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 x(int i17, e33.f5 f5Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078;
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee4330782;
        java.util.ArrayList arrayList = this.f328793h;
        if (i17 < 0 || i17 >= arrayList.size()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PreviewSelectedImageAdapter", "error position %d, imagePaths size %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(arrayList.size()));
            return null;
        }
        java.lang.String str = (java.lang.String) arrayList.get(i17);
        if (!this.f328795m) {
            if (t23.p0.l() == null) {
                return com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078.b(1, 0L, str, str, "");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078.b(0, 0L, str, str, "");
            int indexOf = t23.p0.l().indexOf(b17);
            if (indexOf >= 0) {
                abstractC15633xee4330782 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) t23.p0.l().get(indexOf);
                return abstractC15633xee4330782;
            }
            java.util.Iterator it = t23.p0.m().iterator();
            while (it.hasNext()) {
                abstractC15633xee433078 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) it.next();
                if (abstractC15633xee433078.m63662xb2c87fbf(b17)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PreviewSelectedImageAdapter", "[getMediaItem] %s", abstractC15633xee433078.f219963e);
                    return abstractC15633xee433078;
                }
            }
            return null;
        }
        if (this.f328789d.f329035m == null) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 b18 = com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078.b(0, 0L, str, str, "");
        int indexOf2 = this.f328789d.f329035m.indexOf(b18);
        if (indexOf2 >= 0) {
            f5Var.f328761o = indexOf2;
            abstractC15633xee4330782 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) this.f328789d.f329035m.get(indexOf2);
            return abstractC15633xee4330782;
        }
        java.util.Iterator it6 = t23.p0.m().iterator();
        while (it6.hasNext()) {
            abstractC15633xee433078 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) it6.next();
            if (abstractC15633xee433078.m63662xb2c87fbf(b18)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PreviewSelectedImageAdapter", "[getMediaItem] %s", abstractC15633xee433078.f219963e);
                return abstractC15633xee433078;
            }
        }
        return null;
    }

    public final long y() {
        return this.f328806x ? ((d40.n) ((e40.v) i95.n0.c(e40.v.class))).Ai() : j33.d0.h();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo864xe5e2e48d(e33.f5 f5Var, int i17) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078;
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 x17 = x(i17, f5Var);
        if (x17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PreviewSelectedImageAdapter", "get item failed");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PreviewSelectedImageAdapter", "onBindViewHolder position: %d item: %s", java.lang.Integer.valueOf(i17), x17);
        android.view.ViewGroup.LayoutParams layoutParams = f5Var.f328760n.getLayoutParams();
        int i19 = this.f328791f;
        layoutParams.width = i19;
        layoutParams.height = i19;
        B(f5Var.f328753d, x17.f219963e, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1719x3d0e40c6.ui.C15628x6bc05830 c15628x6bc05830 = f5Var.f328764r;
        q23.f fVar = c15628x6bc05830.f219942f;
        if (fVar != null) {
            fVar.mo159458x6761d4f();
        }
        c15628x6bc05830.setVisibility(8);
        c15628x6bc05830.f219944h = 0L;
        c15628x6bc05830.f219943g = null;
        c15628x6bc05830.f219945i = -1;
        android.view.View view = f5Var.f328760n;
        view.setOnClickListener(this);
        int mo63659xfb85f7b0 = x17.mo63659xfb85f7b0();
        android.content.Context context = this.f328790e;
        if (2 == mo63659xfb85f7b0) {
            str = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fjt) + (i17 + 1);
        } else if (1 == x17.mo63659xfb85f7b0()) {
            str = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fjo) + (i17 + 1);
        } else {
            str = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.o4z) + (i17 + 1);
        }
        view.setContentDescription(str + ", " + this.f328803u.format(new java.util.Date(x17.f219968m)));
        if (this.f328795m) {
            view.setTag(java.lang.Integer.valueOf(f5Var.f328761o));
        } else {
            view.setTag(x17.f219963e);
        }
        java.lang.String o17 = x17.o();
        java.lang.String str2 = x17.f219963e;
        int mo63659xfb85f7b02 = x17.mo63659xfb85f7b0();
        int i27 = this.f328796n;
        android.widget.ImageView imageView = f5Var.f328758i;
        android.widget.RelativeLayout relativeLayout = f5Var.f328755f;
        android.widget.ImageView imageView2 = f5Var.f328762p;
        android.widget.TextView textView = f5Var.f328756g;
        android.widget.TextView textView2 = f5Var.f328763q;
        if (mo63659xfb85f7b02 == 2) {
            relativeLayout.setVisibility(0);
            textView.setVisibility(0);
            textView.setTextSize(0, i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561463ja));
            long k17 = com.p314xaae8f345.mm.vfs.w6.k(x17.f219963e);
            if (this.f328806x && k17 > j33.d0.h() && k17 <= y()) {
                e33.a0.c(textView, ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b) x17).f219979x);
                imageView2.setVisibility(8);
                textView2.setVisibility(8);
            } else {
                qc0.d1 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p2015x36f002.C17096x4dad80a5.f237984a.b(x17.f219963e);
                e33.a0.c(textView, b17 != null ? (int) b17.f442899d : ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b) x17).f219979x);
                if (t21.d3.s() && this.f328797o && i27 == 3 && com.p314xaae8f345.mm.vfs.w6.k(str2) > y()) {
                    imageView2.setVisibility(0);
                    textView2.setVisibility(0);
                    textView2.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fhu, j33.d0.e(y())));
                } else {
                    imageView2.setVisibility(8);
                    textView2.setVisibility(8);
                }
            }
        } else if (x17.mo63659xfb85f7b0() == 1) {
            relativeLayout.setVisibility(8);
            textView.setVisibility(4);
        } else {
            relativeLayout.setVisibility(0);
            imageView.setVisibility(4);
            textView.setVisibility(4);
            imageView2.setVisibility(8);
            textView2.setVisibility(8);
            c15628x6bc05830.setVisibility(0);
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0 c15632xfc4fd0d0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0) x17;
            c15628x6bc05830.a(c15632xfc4fd0d0);
            c15628x6bc05830.b(c15632xfc4fd0d0.A);
        }
        if (x17.mo63659xfb85f7b0() == 1) {
            if (!t21.d3.s() || !this.f328797o) {
                abstractC15633xee433078 = x17;
            } else if (i27 == 3) {
                long k18 = com.p314xaae8f345.mm.vfs.w6.k(str2);
                o23.i iVar = (o23.i) ((e60.b1) i95.n0.c(e60.b1.class));
                java.lang.String str3 = this.f328805w;
                abstractC15633xee433078 = x17;
                if (k18 > iVar.Bi(str3)) {
                    i18 = 0;
                    imageView2.setVisibility(0);
                    textView2.setVisibility(0);
                    textView2.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fht, j33.d0.e(((o23.i) ((e60.b1) i95.n0.c(e60.b1.class))).Bi(str3))));
                }
            } else {
                abstractC15633xee433078 = x17;
            }
            i18 = 0;
            imageView2.setVisibility(8);
            textView2.setVisibility(8);
        } else {
            abstractC15633xee433078 = x17;
            i18 = 0;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(o17) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PreviewSelectedImageAdapter", "null or nil filepath: " + i17);
            return;
        }
        e33.m6.b(f5Var.f328754e, abstractC15633xee433078.mo63659xfb85f7b0(), o17, str2, abstractC15633xee433078.f219967i, -1, new e33.e5(this, f5Var), abstractC15633xee433078.f219968m);
        int i28 = t23.p0.k().f496830f;
        android.widget.ImageView imageView3 = f5Var.f328757h;
        if ((i28 == 3 || t23.p0.k().f496830f == 11) && abstractC15633xee433078.f219971p.equalsIgnoreCase("image/gif")) {
            imageView3.setVisibility(i18);
        } else {
            imageView3.setVisibility(8);
        }
        if (abstractC15633xee433078.f219971p.equalsIgnoreCase("edit") || abstractC15633xee433078.f219971p.equals("video_edit")) {
            java.lang.Object obj = java.lang.Boolean.FALSE;
            java.lang.Object obj2 = abstractC15633xee433078.f219976u.get("key_media_item_extra_is_remux");
            if (obj2 != null) {
                obj = obj2;
            }
            if (((java.lang.Boolean) obj).booleanValue() && !this.f328804v) {
                relativeLayout.setVisibility(i18);
                imageView.setVisibility(i18);
                f5Var.f328759m.setVisibility(8);
            }
        }
        imageView.setVisibility(4);
        f5Var.f328759m.setVisibility(8);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo8157xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, java.util.List list) {
        e33.f5 f5Var = (e33.f5) k3Var;
        if (list.isEmpty()) {
            mo864xe5e2e48d(f5Var, i17);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 x17 = x(i17, f5Var);
        if (x17 == null) {
            return;
        }
        B(f5Var.f328753d, x17.f219963e, i17);
    }
}
