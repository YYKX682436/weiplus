package com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui;

/* loaded from: classes15.dex */
public class b0 extends p012xc85e97e9.p114xa324943e.p115xd1075a44.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f234803d;

    /* renamed from: f, reason: collision with root package name */
    public java.util.ArrayList f234805f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.x f234806g = null;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f234804e = null;

    public b0(android.content.Context context) {
        this.f234803d = context;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: destroyItem */
    public void mo7741x89d2022d(android.view.ViewGroup viewGroup, int i17, java.lang.Object obj) {
        java.util.ArrayList arrayList = this.f234805f;
        if (arrayList != null) {
            viewGroup.removeView(((com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.a0) arrayList.get(i17)).f234799d);
        }
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getCount */
    public int mo8338x7444f759() {
        java.util.List list = this.f234804e;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getItemPosition */
    public int mo8339xb2fa47d2(java.lang.Object obj) {
        return -2;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: instantiateItem */
    public java.lang.Object mo7744x8d1aed1d(android.view.ViewGroup viewGroup, int i17) {
        java.util.ArrayList arrayList = this.f234805f;
        if (arrayList == null) {
            return m8342x8d1aed1d((android.view.View) viewGroup, i17);
        }
        viewGroup.addView(((com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.a0) arrayList.get(i17)).f234799d, 0);
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.a0) this.f234805f.get(i17)).f234799d;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: isViewFromObject */
    public boolean mo7745xc5a713d8(android.view.View view, java.lang.Object obj) {
        return view == obj;
    }
}
