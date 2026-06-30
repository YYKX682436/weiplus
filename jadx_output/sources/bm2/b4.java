package bm2;

/* loaded from: classes3.dex */
public final class b4 extends androidx.viewpager.widget.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f21790d = "FinderLiveGiftViewPagerAdapter";

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f21791e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f21792f = new java.util.ArrayList();

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        if (pm0.v.z(r2.field_flag, 256) == true) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.view.View r6, com.tencent.mm.view.recyclerview.WxRecyclerView r7) {
        /*
            r5 = this;
            r0 = 2131316357(0x7f094e85, float:1.8251193E38)
            android.view.View r6 = r6.findViewById(r0)
            android.widget.TextView r6 = (android.widget.TextView) r6
            androidx.recyclerview.widget.f2 r0 = r7.getAdapter()
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
            java.util.ArrayList r3 = r0.f21767g
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
            int r2 = r2.field_flag
            r3 = 256(0x100, float:3.59E-43)
            boolean r2 = pm0.v.z(r2, r3)
            r3 = 1
            if (r2 != r3) goto L36
            goto L37
        L36:
            r3 = r1
        L37:
            if (r3 == 0) goto L52
            int r0 = r0.getItemCount()
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
        java.util.Iterator it = this.f21791e.iterator();
        while (it.hasNext()) {
            androidx.recyclerview.widget.f2 adapter = ((com.tencent.mm.view.recyclerview.WxRecyclerView) it.next()).getAdapter();
            bm2.a4 a4Var = adapter instanceof bm2.a4 ? (bm2.a4) adapter : null;
            if (a4Var != null) {
                a4Var.z("", 0);
            }
        }
    }

    public final void c(java.lang.String curGiftId, int i17) {
        kotlin.jvm.internal.o.g(curGiftId, "curGiftId");
        java.util.Iterator it = this.f21791e.iterator();
        while (it.hasNext()) {
            androidx.recyclerview.widget.f2 adapter = ((com.tencent.mm.view.recyclerview.WxRecyclerView) it.next()).getAdapter();
            kotlin.jvm.internal.o.e(adapter, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.adapter.FinderLiveGiftGridAdapter");
            ((bm2.a4) adapter).z(curGiftId, i17);
        }
    }

    @Override // androidx.viewpager.widget.a
    public void destroyItem(android.view.ViewGroup container, int i17, java.lang.Object object) {
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(object, "object");
        com.tencent.mars.xlog.Log.i(this.f21790d, "destroyItem pos:" + i17);
        container.removeView((android.view.View) object);
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return this.f21791e.size();
    }

    @Override // androidx.viewpager.widget.a
    public int getItemPosition(java.lang.Object object) {
        kotlin.jvm.internal.o.g(object, "object");
        return -2;
    }

    @Override // androidx.viewpager.widget.a
    public java.lang.Object instantiateItem(android.view.ViewGroup container, int i17) {
        kotlin.jvm.internal.o.g(container, "container");
        com.tencent.mars.xlog.Log.i(this.f21790d, "instantiateItem pos:" + i17);
        java.lang.Object obj = this.f21792f.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) obj;
        container.addView(viewGroup, new androidx.viewpager.widget.ViewPager.LayoutParams());
        return viewGroup;
    }

    @Override // androidx.viewpager.widget.a
    public boolean isViewFromObject(android.view.View p07, java.lang.Object p17) {
        kotlin.jvm.internal.o.g(p07, "p0");
        kotlin.jvm.internal.o.g(p17, "p1");
        return kotlin.jvm.internal.o.b(p07, p17);
    }
}
