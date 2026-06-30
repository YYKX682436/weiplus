package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes11.dex */
public final class y8 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f183158d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f183159e;

    /* renamed from: f, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f183160f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.f8 f183161g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.e8 f183162h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.d8 f183163i;

    public y8(java.util.ArrayList types, java.util.List tags) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(types, "types");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tags, "tags");
        this.f183158d = types;
        this.f183159e = tags;
        this.f183160f = p3325xe03a0797.p3326xc267989b.z0.i(p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c), p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f183158d.size() + this.f183159e.size() + 2;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        if (i17 == 0) {
            return 18;
        }
        java.util.ArrayList arrayList = this.f183158d;
        if (i17 <= 0 || i17 > arrayList.size()) {
            return i17 == arrayList.size() + 1 ? 19 : 21;
        }
        return 20;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.c8 holder = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.c8) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.String str = "[onBindViewHolder] position = " + i17 + ", item type = " + mo863xcdaf1228(i17);
        int i18 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTopMenu", str, null);
        int mo863xcdaf1228 = mo863xcdaf1228(i17);
        java.util.ArrayList arrayList = this.f183158d;
        switch (mo863xcdaf1228) {
            case 18:
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.b8 b8Var = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.b8) holder;
                b8Var.f182052d.setImageResource(com.p314xaae8f345.mm.R.raw.f79103x37d8c7d2);
                b8Var.f182053e.setText(i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.c9q));
                android.view.View view = b8Var.f182054f;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/FavTopMenuAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/fav/ui/FavTopMenuAdapter$FavTopViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/FavTopMenuAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/fav/ui/FavTopMenuAdapter$FavTopViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.m8 m8Var = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.m8(this);
                android.view.View view2 = b8Var.f182054f;
                view2.setOnClickListener(m8Var);
                view2.post(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.n8(this, b8Var));
                return;
            case 19:
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.b8 b8Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.b8) holder;
                b8Var2.f182052d.setImageResource(com.p314xaae8f345.mm.R.raw.f79107x6ae9151d);
                b8Var2.f182053e.setText(i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.c9p));
                android.view.View view3 = b8Var2.f182054f;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/fav/ui/FavTopMenuAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/fav/ui/FavTopMenuAdapter$FavTopViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/fav/ui/FavTopMenuAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/fav/ui/FavTopMenuAdapter$FavTopViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            case 20:
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.a8 a8Var = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.a8) holder;
                java.lang.Object obj = arrayList.get(i17 - 1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                java.lang.String str2 = (java.lang.String) obj;
                a8Var.f181999d.setText(str2);
                a8Var.f3639x46306858.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.o8(this, str2));
                return;
            case 21:
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.a8 a8Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.a8) holder;
                int size = (i17 - arrayList.size()) - 2;
                t72.a aVar = (t72.a) this.f183159e.get(size);
                a8Var2.f181999d.setText(aVar.f68044x225f1eb0);
                a8Var2.f3639x46306858.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p8(this, aVar));
                a8Var2.f3639x46306858.setOnLongClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.q8(this, aVar, i17, size));
                return;
            default:
                return;
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        switch (i17) {
            case 18:
            case 19:
                android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570299ac3, (android.view.ViewGroup) null);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
                return new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.b8(inflate);
            case 20:
            case 21:
                android.view.View inflate2 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.abq, (android.view.ViewGroup) null);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate2, "inflate(...)");
                return new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.a8(inflate2);
            default:
                p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 m8142xeac316cd = super.m8142xeac316cd(parent, i17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m8142xeac316cd, "createViewHolder(...)");
                return (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.c8) m8142xeac316cd;
        }
    }

    public final boolean x(java.lang.String tagName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tagName, "tagName");
        java.util.Iterator it = this.f183159e.iterator();
        while (it.hasNext()) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tagName, ((t72.a) it.next()).f68044x225f1eb0)) {
                return true;
            }
        }
        return false;
    }
}
