package e33;

/* loaded from: classes10.dex */
public final class l6 implements t23.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f328870a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f328871b;

    public l6(android.widget.ImageView imageView, java.lang.String str) {
        this.f328870a = new java.lang.ref.WeakReference(imageView);
        this.f328871b = str;
    }

    @Override // t23.n0
    public java.lang.String a() {
        return this.f328871b;
    }

    @Override // t23.n0
    public void b(java.lang.String str) {
        android.widget.ImageView imageView;
        android.graphics.drawable.Drawable c17 = c();
        boolean z17 = c17 instanceof e33.m6;
        java.lang.ref.WeakReference weakReference = this.f328870a;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ThumbDrawable", "drawable [%s] in ownerRef [%s] is not a ThumbDrawable, ignore.", c17, weakReference);
            return;
        }
        e33.m6 m6Var = (e33.m6) c17;
        if (!j33.d0.d(m6Var.f328900d, m6Var.f328905i, m6Var.f328904h).equals(str) || (imageView = (android.widget.ImageView) weakReference.get()) == null) {
            return;
        }
        imageView.post(new e33.k6(imageView));
    }

    public final android.graphics.drawable.Drawable c() {
        android.widget.ImageView imageView = (android.widget.ImageView) this.f328870a.get();
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    /* renamed from: equals */
    public boolean m126855xb2c87fbf(java.lang.Object obj) {
        android.graphics.drawable.Drawable drawable;
        if (obj == null) {
            return false;
        }
        android.graphics.drawable.Drawable c17 = c();
        if (!(obj instanceof e33.l6)) {
            if (obj instanceof e33.m6) {
                drawable = (android.graphics.drawable.Drawable) obj;
            }
            return false;
        }
        drawable = ((e33.l6) obj).c();
        if (c17 != null && drawable != null) {
            return c17.equals(drawable);
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m126856x8cdac1b() {
        android.graphics.drawable.Drawable c17 = c();
        return c17 != null ? c17.hashCode() : super.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m126857x9616526c() {
        return "decodeTaskKey:" + this.f328871b + " ownerRef:" + this.f328870a;
    }
}
