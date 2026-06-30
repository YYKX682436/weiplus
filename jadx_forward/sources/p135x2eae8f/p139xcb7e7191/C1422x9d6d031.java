package p135x2eae8f.p139xcb7e7191;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcoil/target/ImageViewTarget;", "Le6/a;", "Landroid/widget/ImageView;", "Lg6/f;", "Landroidx/lifecycle/f;", "view", "<init>", "(Landroid/widget/ImageView;)V", "coil-base_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: coil.target.ImageViewTarget */
/* loaded from: classes10.dex */
public class C1422x9d6d031 implements e6.a, g6.f, p012xc85e97e9.p093xedfae76a.f {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f125447d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f125448e;

    public C1422x9d6d031(android.widget.ImageView view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        this.f125447d = view;
    }

    @Override // e6.b
    public void a(android.graphics.drawable.Drawable result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        d(result);
    }

    @Override // e6.b
    public void b(android.graphics.drawable.Drawable drawable) {
        d(drawable);
    }

    @Override // e6.b
    public void c(android.graphics.drawable.Drawable drawable) {
        d(drawable);
    }

    public void d(android.graphics.drawable.Drawable drawable) {
        android.widget.ImageView imageView = this.f125447d;
        java.lang.Object drawable2 = imageView.getDrawable();
        android.graphics.drawable.Animatable animatable = drawable2 instanceof android.graphics.drawable.Animatable ? (android.graphics.drawable.Animatable) drawable2 : null;
        if (animatable != null) {
            animatable.stop();
        }
        imageView.setImageDrawable(drawable);
        e();
    }

    public void e() {
        java.lang.Object drawable = this.f125447d.getDrawable();
        android.graphics.drawable.Animatable animatable = drawable instanceof android.graphics.drawable.Animatable ? (android.graphics.drawable.Animatable) drawable : null;
        if (animatable == null) {
            return;
        }
        if (this.f125448e) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }

    /* renamed from: equals */
    public boolean m15444xb2c87fbf(java.lang.Object obj) {
        if (this != obj) {
            if (obj instanceof p135x2eae8f.p139xcb7e7191.C1422x9d6d031) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f125447d, ((p135x2eae8f.p139xcb7e7191.C1422x9d6d031) obj).f125447d)) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: hashCode */
    public int m15445x8cdac1b() {
        return this.f125447d.hashCode();
    }

    @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
    /* renamed from: onStart */
    public void mo7797xb05099c3(p012xc85e97e9.p093xedfae76a.y owner) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
        this.f125448e = true;
        e();
    }

    @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
    /* renamed from: onStop */
    public void mo7798xc39f8281(p012xc85e97e9.p093xedfae76a.y owner) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
        this.f125448e = false;
        e();
    }

    /* renamed from: toString */
    public java.lang.String m15446x9616526c() {
        return "ImageViewTarget(view=" + this.f125447d + ')';
    }
}
