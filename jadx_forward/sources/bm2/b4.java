package bm2;

/* loaded from: classes3.dex */
public final class b4 extends p012xc85e97e9.p114xa324943e.p115xd1075a44.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f103323d = "FinderLiveGiftViewPagerAdapter";

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f103324e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f103325f = new java.util.ArrayList();

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        if (pm0.v.z(r2.f67799x225ba391, 256) == true) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.view.View r6, com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 r7) {
        /*
            r5 = this;
            r0 = 2131316357(0x7f094e85, float:1.8251193E38)
            android.view.View r6 = r6.findViewById(r0)
            android.widget.TextView r6 = (android.widget.TextView) r6
            androidx.recyclerview.widget.f2 r0 = r7.mo7946xf939df19()
            boolean r1 = r0 instanceof bm2.a4
            r2 = 0
            if (r1 == 0) goto L15
            bm2.a4 r0 = (bm2.a4) r0
            goto L16
        L15:
            r0 = r2
        L16:
            r1 = 0
            if (r0 == 0) goto L22
            java.util.ArrayList r3 = r0.f103300g
            java.lang.Object r3 = kz5.n0.a0(r3, r1)
            ce2.i r3 = (ce2.i) r3
            goto L23
        L22:
            r3 = r2
        L23:
            boolean r4 = r3 instanceof ce2.i
            if (r4 == 0) goto L28
            r2 = r3
        L28:
            if (r2 == 0) goto L36
            int r2 = r2.f67799x225ba391
            r3 = 256(0x100, float:3.59E-43)
            boolean r2 = pm0.v.z(r2, r3)
            r3 = 1
            if (r2 != r3) goto L36
            goto L37
        L36:
            r3 = r1
        L37:
            if (r3 == 0) goto L52
            int r0 = r0.mo1894x7e414b06()
            r2 = 4
            if (r0 > r2) goto L52
            r6.setVisibility(r1)
            android.content.Context r7 = r7.getContext()
            r0 = 2131765459(0x7f1028d3, float:1.916208E38)
            java.lang.String r7 = r7.getString(r0)
            r6.setText(r7)
            goto L57
        L52:
            r7 = 8
            r6.setVisibility(r7)
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bm2.b4.a(android.view.View, com.tencent.mm.view.recyclerview.WxRecyclerView):void");
    }

    public final void b() {
        java.util.Iterator it = this.f103324e.iterator();
        while (it.hasNext()) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = ((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) it.next()).mo7946xf939df19();
            bm2.a4 a4Var = mo7946xf939df19 instanceof bm2.a4 ? (bm2.a4) mo7946xf939df19 : null;
            if (a4Var != null) {
                a4Var.z("", 0);
            }
        }
    }

    public final void c(java.lang.String curGiftId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(curGiftId, "curGiftId");
        java.util.Iterator it = this.f103324e.iterator();
        while (it.hasNext()) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = ((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) it.next()).mo7946xf939df19();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo7946xf939df19, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.adapter.FinderLiveGiftGridAdapter");
            ((bm2.a4) mo7946xf939df19).z(curGiftId, i17);
        }
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: destroyItem */
    public void mo7741x89d2022d(android.view.ViewGroup container, int i17, java.lang.Object object) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(object, "object");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f103323d, "destroyItem pos:" + i17);
        container.removeView((android.view.View) object);
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getCount */
    public int mo8338x7444f759() {
        return this.f103324e.size();
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getItemPosition */
    public int mo8339xb2fa47d2(java.lang.Object object) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(object, "object");
        return -2;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: instantiateItem */
    public java.lang.Object mo7744x8d1aed1d(android.view.ViewGroup container, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f103323d, "instantiateItem pos:" + i17);
        java.lang.Object obj = this.f103325f.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) obj;
        container.addView(viewGroup, new p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.LayoutParams());
        return viewGroup;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: isViewFromObject */
    public boolean mo7745xc5a713d8(android.view.View p07, java.lang.Object p17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p17, "p1");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(p07, p17);
    }
}
