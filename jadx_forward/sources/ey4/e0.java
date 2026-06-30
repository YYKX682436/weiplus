package ey4;

/* loaded from: classes8.dex */
public class e0 extends p012xc85e97e9.p114xa324943e.p115xd1075a44.a {

    /* renamed from: e, reason: collision with root package name */
    public ey4.c0 f339151e;

    /* renamed from: d, reason: collision with root package name */
    public final android.util.SparseArray f339150d = new android.util.SparseArray();

    /* renamed from: f, reason: collision with root package name */
    public boolean f339152f = false;

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: destroyItem */
    public void mo7741x89d2022d(android.view.ViewGroup viewGroup, int i17, java.lang.Object obj) {
        viewGroup.removeView((android.view.View) obj);
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getCount */
    public int mo8338x7444f759() {
        ey4.w wVar = (ey4.w) this.f339151e.b(0);
        if (wVar.a() * wVar.b() < 1) {
            return 0;
        }
        return (int) java.lang.Math.ceil((((com.p314xaae8f345.mm.p2614xca6eae71.e1) wVar.f339164b.a()).f274776c != null ? r2.size() : 0) / (wVar.a() * wVar.b()));
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getItemPosition */
    public int mo8339xb2fa47d2(java.lang.Object obj) {
        if (this.f339152f) {
            return -2;
        }
        return super.mo8339xb2fa47d2(obj);
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: instantiateItem */
    public java.lang.Object mo7744x8d1aed1d(android.view.ViewGroup viewGroup, int i17) {
        android.util.SparseArray sparseArray = this.f339150d;
        android.view.View view = null;
        android.view.View view2 = sparseArray.get(i17) != null ? (android.view.View) ((java.lang.ref.SoftReference) sparseArray.get(i17)).get() : null;
        if (view2 != null) {
            if (view2.getParent() != null) {
                ((android.view.ViewGroup) view2.getParent()).removeView(view2);
            }
            viewGroup.addView(view2, 0);
            return view2;
        }
        ey4.w wVar = (ey4.w) this.f339151e.b(i17);
        android.content.Context context = wVar.f339163a;
        ey4.c0 c0Var = wVar.f339164b;
        if (context != null) {
            view = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.d_3, null);
            if (view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2436x5fb57ca.C19495xb67e4e30) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2436x5fb57ca.C19495xb67e4e30 c19495xb67e4e30 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2436x5fb57ca.C19495xb67e4e30) view;
                c19495xb67e4e30.m74844x3e2a9e8b(c0Var);
                java.util.List list = ((com.p314xaae8f345.mm.p2614xca6eae71.e1) wVar.f339164b.a()).f274776c;
                c19495xb67e4e30.b(i17, list == null ? 0 : list.size(), wVar.a() * wVar.b(), wVar.a(), wVar.b(), (wVar.f339164b.f339145d - (ey4.w.f339166d * wVar.b())) / (wVar.b() + 1));
            }
        }
        if (view != null) {
            viewGroup.addView(view, 0);
            sparseArray.put(i17, new java.lang.ref.SoftReference(view));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewSmileyViewPagerAdapter", "contentView == null!");
        }
        return view;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: isViewFromObject */
    public boolean mo7745xc5a713d8(android.view.View view, java.lang.Object obj) {
        return view == obj;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: notifyDataSetChanged */
    public void mo8343xced61ae5() {
        this.f339152f = true;
        super.mo8343xced61ae5();
        this.f339152f = false;
    }
}
