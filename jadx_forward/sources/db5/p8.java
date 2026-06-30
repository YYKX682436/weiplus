package db5;

/* loaded from: classes4.dex */
public abstract class p8 extends p012xc85e97e9.p114xa324943e.p115xd1075a44.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Queue f310002d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f310003e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final android.util.SparseArray f310004f = new android.util.SparseArray();

    public boolean a() {
        return true;
    }

    public int b() {
        return -1;
    }

    public abstract com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c(int i17, boolean z17);

    public abstract java.lang.Object d(int i17, android.view.View view, android.view.ViewGroup viewGroup);

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: destroyItem */
    public void mo7741x89d2022d(android.view.ViewGroup viewGroup, int i17, java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMViewPagerAdapter", "destroyItem object %s", java.lang.Integer.valueOf(obj.hashCode()));
        ((java.util.LinkedList) this.f310002d).add((android.view.View) obj);
        this.f310003e.remove(obj);
        this.f310004f.remove(i17);
    }

    public android.view.View e(int i17) {
        java.lang.Object obj = this.f310004f.get(i17);
        if (obj != null) {
            return (android.view.View) obj;
        }
        return null;
    }

    public abstract com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f f(int i17, boolean z17);

    public int g() {
        return -1;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getItemPosition */
    public int mo8339xb2fa47d2(java.lang.Object obj) {
        java.util.HashMap hashMap = this.f310003e;
        if (hashMap.containsKey(obj)) {
            return ((java.lang.Integer) hashMap.get(obj)).intValue();
        }
        return -2;
    }

    public void h() {
        ((java.util.LinkedList) this.f310002d).clear();
        this.f310003e.clear();
        this.f310004f.clear();
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: instantiateItem */
    public java.lang.Object mo7744x8d1aed1d(android.view.ViewGroup viewGroup, int i17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Queue queue = this.f310002d;
        java.lang.Object d17 = d(i17, ((java.util.LinkedList) queue).size() > 0 ? (android.view.View) ((java.util.LinkedList) queue).poll() : null, viewGroup);
        android.view.View view = (android.view.View) d17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMViewPagerAdapter", "instantiateItem object %s, parent %s, position: %s.", java.lang.Integer.valueOf(d17.hashCode()), view.getParent(), java.lang.Integer.valueOf(i17));
        this.f310003e.put(d17, java.lang.Integer.valueOf(i17));
        this.f310004f.put(i17, d17);
        if (view.getParent() == null) {
            viewGroup.addView(view);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMViewPagerAdapter", "instantiateItem spent : %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        return d17;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: isViewFromObject */
    public boolean mo7745xc5a713d8(android.view.View view, java.lang.Object obj) {
        return view == obj;
    }
}
