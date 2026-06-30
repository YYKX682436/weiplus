package zx2;

/* loaded from: classes2.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Object f558614a;

    /* renamed from: b, reason: collision with root package name */
    public android.graphics.drawable.Drawable f558615b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.CharSequence f558616c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.CharSequence f558617d;

    /* renamed from: e, reason: collision with root package name */
    public int f558618e = -1;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f558619f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15436x4c00d79 f558620g;

    /* renamed from: h, reason: collision with root package name */
    public zx2.w f558621h;

    public boolean a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15436x4c00d79 c15436x4c00d79 = this.f558620g;
        if (c15436x4c00d79 != null) {
            return c15436x4c00d79.m62977xe06bcb0d() == this.f558618e;
        }
        throw new java.lang.IllegalArgumentException("Tab not attached to a CustomTabLayout");
    }

    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15436x4c00d79 c15436x4c00d79 = this.f558620g;
        if (c15436x4c00d79 == null) {
            throw new java.lang.IllegalArgumentException("Tab not attached to a CustomTabLayout");
        }
        c15436x4c00d79.m(this, true);
    }

    public zx2.u c(int i17) {
        this.f558619f = android.view.LayoutInflater.from(this.f558621h.getContext()).inflate(i17, (android.view.ViewGroup) this.f558621h, false);
        zx2.w wVar = this.f558621h;
        if (wVar != null) {
            wVar.b();
        }
        return this;
    }
}
