package pf4;

/* loaded from: classes4.dex */
public final class a0 extends p012xc85e97e9.p114xa324943e.p115xd1075a44.a {

    /* renamed from: d, reason: collision with root package name */
    public boolean f435369d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f435370e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f435371f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f435372g;

    /* renamed from: h, reason: collision with root package name */
    public nf4.j f435373h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.l f435374i;

    /* renamed from: m, reason: collision with root package name */
    public yz5.a f435375m;

    /* renamed from: n, reason: collision with root package name */
    public yz5.l f435376n;

    /* renamed from: o, reason: collision with root package name */
    public yz5.a f435377o;

    public a0(boolean z17, java.util.ArrayList visitors, java.util.ArrayList comments, java.util.ArrayList pages, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        visitors = (i17 & 2) != 0 ? new java.util.ArrayList() : visitors;
        comments = (i17 & 4) != 0 ? new java.util.ArrayList() : comments;
        pages = (i17 & 8) != 0 ? new java.util.ArrayList() : pages;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(visitors, "visitors");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(comments, "comments");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pages, "pages");
        this.f435369d = z17;
        this.f435370e = visitors;
        this.f435371f = comments;
        this.f435372g = pages;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: destroyItem */
    public void mo7741x89d2022d(android.view.ViewGroup container, int i17, java.lang.Object view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        container.removeView((android.view.View) view);
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getCount */
    public int mo8338x7444f759() {
        return this.f435372g.size();
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getItemPosition */
    public int mo8339xb2fa47d2(java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        return -2;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: instantiateItem */
    public java.lang.Object mo7744x8d1aed1d(android.view.ViewGroup container, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        boolean z17 = this.f435369d;
        java.util.ArrayList arrayList = this.f435370e;
        java.util.ArrayList arrayList2 = this.f435371f;
        java.util.ArrayList arrayList3 = this.f435372g;
        if (z17) {
            if (i17 == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18485x239212ef c18485x239212ef = (com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18485x239212ef) arrayList3.get(i17);
                int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18485x239212ef.f253533o;
                c18485x239212ef.b(0, arrayList2, arrayList, this.f435373h);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18485x239212ef) arrayList3.get(i17)).m71447x410de555(this.f435375m);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18485x239212ef) arrayList3.get(i17)).m71449xb1ee4f7e(this.f435376n);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18485x239212ef) arrayList3.get(i17)).m71450x6b45dca0(this.f435377o);
            } else {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18485x239212ef) arrayList3.get(i17)).m71448xf235d297(this.f435374i);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18485x239212ef) arrayList3.get(i17)).m71447x410de555(this.f435375m);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18485x239212ef) arrayList3.get(i17)).m71449xb1ee4f7e(this.f435376n);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18485x239212ef) arrayList3.get(i17)).m71450x6b45dca0(this.f435377o);
                com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18485x239212ef c18485x239212ef2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18485x239212ef) arrayList3.get(i17);
                int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18485x239212ef.f253533o;
                c18485x239212ef2.b(1, arrayList2, arrayList, this.f435373h);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18485x239212ef c18485x239212ef3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18485x239212ef) arrayList3.get(i17);
            int c17 = com.p314xaae8f345.mm.ui.bl.c(container.getContext()) + com.p314xaae8f345.mm.ui.zk.a(container.getContext(), 48) + com.p314xaae8f345.mm.ui.zk.a(container.getContext(), 24);
            android.view.ViewGroup.LayoutParams layoutParams = c18485x239212ef3.f253534d.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = c17;
            c18485x239212ef3.requestLayout();
        } else {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18485x239212ef) arrayList3.get(i17)).m71448xf235d297(this.f435374i);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18485x239212ef) arrayList3.get(i17)).m71447x410de555(this.f435375m);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18485x239212ef) arrayList3.get(i17)).m71449xb1ee4f7e(this.f435376n);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18485x239212ef) arrayList3.get(i17)).m71450x6b45dca0(this.f435377o);
            com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18485x239212ef c18485x239212ef4 = (com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18485x239212ef) arrayList3.get(i17);
            int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18485x239212ef.f253533o;
            c18485x239212ef4.b(1, arrayList2, arrayList, this.f435373h);
            com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18485x239212ef c18485x239212ef5 = (com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18485x239212ef) arrayList3.get(i17);
            int c18 = com.p314xaae8f345.mm.ui.bl.c(container.getContext()) + com.p314xaae8f345.mm.ui.zk.a(container.getContext(), 24);
            android.view.ViewGroup.LayoutParams layoutParams2 = c18485x239212ef5.f253534d.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = c18;
            c18485x239212ef5.requestLayout();
        }
        container.addView((android.view.View) arrayList3.get(i17));
        java.lang.Object obj = arrayList3.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        return obj;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: isViewFromObject */
    public boolean mo7745xc5a713d8(android.view.View view, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(view, obj);
    }
}
