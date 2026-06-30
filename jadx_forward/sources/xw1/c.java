package xw1;

/* loaded from: classes9.dex */
public abstract class c extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f539192f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.ref.WeakReference f539193g;

    /* renamed from: d, reason: collision with root package name */
    public int f539190d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f539191e = 0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f539194h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f539195i = false;

    public boolean H() {
        return !(this instanceof xw1.d);
    }

    public abstract void I(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr);

    public xw1.c J(xw1.b bVar) {
        if (this.f539195i) {
            bVar.a(this.f539190d, this.f539191e, this.f539192f, this);
        }
        return this;
    }

    public xw1.c K(xw1.b bVar) {
        if (!this.f539194h && !this.f539195i) {
            bVar.a(this.f539190d, this.f539191e, this.f539192f, this);
        }
        return this;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        java.lang.ref.WeakReference weakReference;
        android.app.Activity activity;
        if (i18 != 0 || i19 != 0) {
            this.f539194h = true;
            if (H() && (weakReference = this.f539193g) != null && (activity = (android.app.Activity) weakReference.get()) != null) {
                db5.e1.G(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l0g), null, false, new xw1.a(this));
            }
        }
        this.f539190d = i19;
        this.f539191e = i18;
        this.f539192f = str;
        I(i17, i18, i19, str, v0Var, bArr);
    }
}
