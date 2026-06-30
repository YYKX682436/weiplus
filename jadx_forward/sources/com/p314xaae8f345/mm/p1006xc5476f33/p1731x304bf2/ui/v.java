package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes5.dex */
public final class v extends p012xc85e97e9.p114xa324943e.p115xd1075a44.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ViewOnClickListenerC15938x425ae5a3 f223325d;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ViewOnClickListenerC15938x425ae5a3 viewOnClickListenerC15938x425ae5a3, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.t tVar) {
        this.f223325d = viewOnClickListenerC15938x425ae5a3;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: destroyItem */
    public void mo7741x89d2022d(android.view.ViewGroup viewGroup, int i17, java.lang.Object obj) {
        int size = i17 % this.f223325d.f222193i.size();
        viewGroup.removeView((android.view.View) obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameBannerView", "destroyItem : new positon = %d, now position = %d", java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(i17));
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getCount */
    public int mo8338x7444f759() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ViewOnClickListenerC15938x425ae5a3 viewOnClickListenerC15938x425ae5a3 = this.f223325d;
        return viewOnClickListenerC15938x425ae5a3.f222193i.size() <= 1 ? viewOnClickListenerC15938x425ae5a3.f222193i.size() : viewOnClickListenerC15938x425ae5a3.f222193i.size() * 1000 * 2;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: instantiateItem */
    public java.lang.Object mo7744x8d1aed1d(android.view.ViewGroup viewGroup, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ViewOnClickListenerC15938x425ae5a3 viewOnClickListenerC15938x425ae5a3 = this.f223325d;
        int size = i17 % viewOnClickListenerC15938x425ae5a3.f222193i.size();
        android.view.View inflate = android.view.View.inflate(viewOnClickListenerC15938x425ae5a3.f222188d, com.p314xaae8f345.mm.R.C30864xbddafb2a.bdz, null);
        inflate.setTag(viewOnClickListenerC15938x425ae5a3.f222193i.get(size));
        inflate.setOnClickListener(viewOnClickListenerC15938x425ae5a3);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.gim);
        java.lang.String str = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.u) viewOnClickListenerC15938x425ae5a3.f222193i.get(size)).f223309b;
        android.graphics.drawable.Drawable drawable = imageView.getDrawable();
        if (drawable == null || !(drawable instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.h3)) {
            imageView.setImageDrawable(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.h3(str, null));
        } else {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.h3) drawable).a(str);
        }
        try {
            viewGroup.addView(inflate, 0);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameBannerView", "add view failed, " + e17.getMessage());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameBannerView", "instantiateItem : new positon = %d, now position = %d", java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(i17));
        return inflate;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: isViewFromObject */
    public boolean mo7745xc5a713d8(android.view.View view, java.lang.Object obj) {
        return view == obj;
    }
}
