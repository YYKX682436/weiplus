package ud4;

/* loaded from: classes4.dex */
public class h extends ud4.b {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f508236t = 0;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f508237i;

    /* renamed from: m, reason: collision with root package name */
    public final int f508238m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f508239n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f508240o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f508241p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f508242q;

    /* renamed from: r, reason: collision with root package name */
    public final ud4.d f508243r;

    /* renamed from: s, reason: collision with root package name */
    public int f508244s;

    public h(android.content.Context context, java.util.List list, int i17, int i18, boolean z17, boolean z18, ud4.d dVar) {
        super(context, i17);
        this.f508237i = new java.util.HashMap();
        this.f508244s = 0;
        super.c(h(list));
        this.f508238m = i18;
        this.f508239n = z17;
        this.f508242q = z18;
        this.f508243r = dVar;
        if (z18) {
            d();
        }
        g();
    }

    @Override // ud4.b
    public void c(java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("set", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        super.c(h(list));
        if (this.f508242q) {
            d();
        }
        g();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("set", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
    }

    public final void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addDummyHeader", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        for (int i17 = 0; i17 < j(); i17++) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.p2225x45d52d5.p2226x2eefaa.C18436x91cb1037 c18436x91cb1037 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.p2225x45d52d5.p2226x2eefaa.C18436x91cb1037("", 0, 0, 0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("convert", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
            ud4.g gVar = new ud4.g(this, null);
            gVar.f508231a = c18436x91cb1037;
            gVar.f508232b = getCount();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("convert", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
            gVar.f508232b = getCount();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("add", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
            a(gVar);
            this.f508215g.add(i17, gVar);
            notifyDataSetChanged();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("add", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addDummyHeader", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
    }

    public boolean f(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("canReorder", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        if (i17 < j()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("canReorder", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
            return false;
        }
        if (this.f508240o) {
            boolean z17 = i17 != getCount() - 1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("canReorder", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
            return z17;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("canReorder", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("canReorder", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("canReorder", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        return true;
    }

    public void g() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkAddImg", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        boolean z17 = this.f508239n;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(getCount());
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(j());
        int i17 = this.f508238m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DynamicGridAdapter", "showAddImg %s, getCount %d, getHeaderCount %d, maxShowCount %d， showing %s", valueOf, valueOf2, valueOf3, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(this.f508240o));
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPicCount", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
            int count = (getCount() - j()) - (this.f508240o ? 1 : 0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPicCount", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
            if (count < i17) {
                if (!this.f508240o) {
                    this.f508240o = true;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.p2225x45d52d5.p2226x2eefaa.C18436x91cb1037 c18436x91cb1037 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.p2225x45d52d5.p2226x2eefaa.C18436x91cb1037("", 0, 0, 0);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("convert", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
                    ud4.g gVar = new ud4.g(this, null);
                    gVar.f508231a = c18436x91cb1037;
                    gVar.f508232b = getCount();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("convert", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("add", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
                    a(gVar);
                    this.f508215g.add(gVar);
                    notifyDataSetChanged();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("add", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkAddImg", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
            }
        }
        this.f508240o = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkAddImg", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItemViewType", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        if (android.text.TextUtils.isEmpty(((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.p2225x45d52d5.p2226x2eefaa.AbstractC18435x78de886c) ((ud4.g) getItem(i17)).f508231a).b())) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemViewType", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
            return 1;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemViewType", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        return 0;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        ud4.e eVar;
        android.view.View view2 = view;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getView", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        if (view2 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContext", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContext", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
            view2 = android.view.LayoutInflater.from(this.f508214f).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ct9, viewGroup, false);
            eVar = new ud4.e(this, view2, null);
            view2.setTag(com.p314xaae8f345.mm.R.id.has, eVar);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter$MyViewHolder");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter$MyViewHolder");
            l(eVar.f508222c);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter$MyViewHolder");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter$MyViewHolder");
            l(eVar.f508221b);
        } else {
            eVar = (ud4.e) view2.getTag(com.p314xaae8f345.mm.R.id.has);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.p2225x45d52d5.p2226x2eefaa.AbstractC18435x78de886c abstractC18435x78de886c = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.p2225x45d52d5.p2226x2eefaa.AbstractC18435x78de886c) ((ud4.g) getItem(i17)).f508231a;
        eVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("build", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter$MyViewHolder");
        boolean isEmpty = android.text.TextUtils.isEmpty(abstractC18435x78de886c.b());
        android.widget.ImageView imageView = eVar.f508222c;
        android.widget.ImageView imageView2 = eVar.f508221b;
        android.view.View view3 = eVar.f508220a;
        ud4.h hVar = eVar.f508224e;
        if (isEmpty) {
            imageView.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.a6n);
            imageView2.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(imageView2.getContext(), com.p314xaae8f345.mm.R.raw.f78399xe10c3f2e, i65.a.d(imageView2.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833)));
            imageView2.setContentDescription(imageView2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.j8w));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
            int i18 = hVar.f508244s;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
            int i19 = (i18 * 35) / 100;
            imageView2.setPadding(i19, i19, i19, i19);
            if (i17 > 0) {
                view3.setTag(-1);
            } else if (i17 < hVar.j()) {
                view3.setTag(Integer.MAX_VALUE);
            } else if (i17 == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$500", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$500", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
                if (!hVar.f508242q) {
                    view3.setTag(-1);
                }
            }
        } else {
            view3.setTag(java.lang.Integer.valueOf(hVar.k(i17)));
            imageView2.setBackgroundDrawable(null);
            imageView2.setImageBitmap(null);
            imageView2.setTag(abstractC18435x78de886c.b());
            imageView2.setContentDescription(imageView2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jar));
            imageView2.setPadding(0, 0, 0, 0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$600", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
            java.util.HashMap hashMap = hVar.f508237i;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$600", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) hashMap.get(abstractC18435x78de886c.b());
            if (ca4.z0.f(bitmap)) {
                imageView2.setImageBitmap(bitmap);
            } else {
                new ud4.f(hVar, imageView2, abstractC18435x78de886c.b()).d("");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("build", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter$MyViewHolder");
        if (i17 < j()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter$MyViewHolder");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter$MyViewHolder");
            imageView2.setVisibility(4);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter$MyViewHolder");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter$MyViewHolder");
            imageView.setVisibility(8);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            android.view.View view4 = view2;
            yj0.a.d(view4, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter$MyViewHolder");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter$MyViewHolder");
            imageView2.setVisibility(0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter$MyViewHolder");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter$MyViewHolder");
            imageView.setVisibility(0);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            android.view.View view5 = view2;
            yj0.a.d(view5, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getView", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        return view2;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getViewTypeCount", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewTypeCount", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        return 2;
    }

    public final java.util.List h(java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("convert", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int i17 = 0;
        for (java.lang.Object obj : list) {
            ud4.g gVar = new ud4.g(this, null);
            gVar.f508231a = obj;
            gVar.f508232b = i17;
            arrayList.add(gVar);
            i17++;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("convert", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        return arrayList;
    }

    public int j() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getHeaderCount", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        if (!this.f508242q) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getHeaderCount", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
            return 0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getColumnCount", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getColumnCount", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getHeaderCount", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        return this.f508216h;
    }

    public int k(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getOriginPos", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        int j17 = i17 - j();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getOriginPos", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        return j17;
    }

    public final void l(android.widget.ImageView imageView) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPicSize", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        if (this.f508244s == 0) {
            int z17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Hj().z1();
            if (z17 == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPicSize", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
                return;
            }
            android.content.Context context = this.f508214f;
            int dimensionPixelSize = ((z17 - (context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f562142ab1) * 4)) - (context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561402hi) * 2)) / 3;
            this.f508244s = dimensionPixelSize;
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.f245939y0;
            if (dimensionPixelSize > i17) {
                dimensionPixelSize = i17;
            }
            this.f508244s = dimensionPixelSize;
        }
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int i18 = this.f508244s;
        layoutParams.width = i18;
        layoutParams.height = i18;
        imageView.setLayoutParams(layoutParams);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPicSize", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
    }
}
