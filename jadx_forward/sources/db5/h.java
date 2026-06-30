package db5;

/* loaded from: classes3.dex */
public abstract class h extends p012xc85e97e9.p114xa324943e.p115xd1075a44.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f309888d;

    /* renamed from: f, reason: collision with root package name */
    public int f309890f = 0;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Queue f309889e = new java.util.LinkedList();

    public h(android.content.Context context) {
        this.f309888d = context;
    }

    public abstract int a();

    public abstract android.view.View b(android.view.View view, android.view.ViewGroup viewGroup, int i17);

    public abstract void c(android.view.View view, int i17);

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: destroyItem */
    public void mo7741x89d2022d(android.view.ViewGroup viewGroup, int i17, java.lang.Object obj) {
        android.view.View view = (android.view.View) obj;
        viewGroup.removeView(view);
        java.util.Queue queue = this.f309889e;
        ((java.util.LinkedList) queue).add(view);
        c(view, i17);
        ((java.util.LinkedList) queue).size();
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getItemPosition */
    public int mo8339xb2fa47d2(java.lang.Object obj) {
        int i17 = this.f309890f;
        if (i17 <= 0) {
            return super.mo8339xb2fa47d2(obj);
        }
        this.f309890f = i17 - 1;
        return -2;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: instantiateItem */
    public java.lang.Object mo7744x8d1aed1d(android.view.ViewGroup viewGroup, int i17) {
        java.lang.System.currentTimeMillis();
        android.view.View b17 = b((android.view.View) ((java.util.LinkedList) this.f309889e).poll(), viewGroup, i17);
        if (b17.getLayoutParams() == null) {
            b17.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        }
        viewGroup.addView(b17);
        java.lang.System.currentTimeMillis();
        return b17;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: isViewFromObject */
    public boolean mo7745xc5a713d8(android.view.View view, java.lang.Object obj) {
        return view.equals(obj);
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: notifyDataSetChanged */
    public void mo8343xced61ae5() {
        this.f309890f = a();
        super.mo8343xced61ae5();
    }
}
