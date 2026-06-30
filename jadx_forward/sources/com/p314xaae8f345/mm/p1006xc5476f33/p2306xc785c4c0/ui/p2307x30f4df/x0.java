package com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df;

/* loaded from: classes8.dex */
public class x0 extends p012xc85e97e9.p114xa324943e.p115xd1075a44.a {

    /* renamed from: d, reason: collision with root package name */
    public boolean f256634d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j f256635e;

    public x0(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j jVar) {
        this.f256635e = jVar;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: destroyItem */
    public void mo7741x89d2022d(android.view.ViewGroup viewGroup, int i17, java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "destroyItem pos:%s, v:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(obj.hashCode()));
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j jVar = this.f256635e;
        wm4.y yVar = (wm4.y) jVar.f256532q.get(i17);
        if (pm4.w.k(yVar.f528851b)) {
            return;
        }
        if (pm4.w.n(yVar.f528851b) && jVar.E) {
            return;
        }
        viewGroup.removeView((android.view.View) obj);
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getCount */
    public int mo8338x7444f759() {
        return this.f256635e.f256532q.size();
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: instantiateItem */
    public java.lang.Object mo7744x8d1aed1d(android.view.ViewGroup viewGroup, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j jVar = this.f256635e;
        boolean k17 = pm4.w.k(((wm4.y) ((java.util.ArrayList) jVar.f256532q).get(i17)).f528851b);
        boolean z17 = (k17 && this.f256634d) ? false : true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "instantiateItem pos:%s, v:%s, needAddView:%s, isLongVideoTab:%s,isAddLongVideo:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.c1) ((java.util.ArrayList) jVar.H).get(i17)).f256475a.hashCode()), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(k17), java.lang.Boolean.valueOf(this.f256634d));
        if (z17) {
            android.view.View view = ((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.c1) ((java.util.ArrayList) jVar.H).get(i17)).f256475a;
            if (view.getParent() instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) view.getParent()).removeView(view);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "instantiateItem remove from parent!");
            }
            viewGroup.addView(view, new android.view.ViewGroup.LayoutParams(-1, -1));
        }
        if (k17) {
            this.f256634d = true;
        }
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.c1) ((java.util.ArrayList) jVar.H).get(i17)).f256475a;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: isViewFromObject */
    public boolean mo7745xc5a713d8(android.view.View view, java.lang.Object obj) {
        return view == obj;
    }
}
