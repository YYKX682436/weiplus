package kp3;

/* loaded from: classes12.dex */
public final class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kp3.p0 f392541d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f392542e;

    public l0(kp3.p0 p0Var, android.graphics.Bitmap bitmap) {
        this.f392541d = p0Var;
        this.f392542e = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kp3.p0 p0Var = this.f392541d;
        android.widget.ImageView imageView = p0Var.f392560m;
        if (imageView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finishBlurIv");
            throw null;
        }
        imageView.setImageBitmap(this.f392542e);
        android.widget.ImageView imageView2 = p0Var.f392560m;
        if (imageView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finishBlurIv");
            throw null;
        }
        imageView2.setVisibility(0);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = p0Var.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17013x966ea0d1 c17013x966ea0d1 = ((kp3.x) pf5.z.f435481a.a(activity).a(kp3.x.class)).f392584g;
        if (c17013x966ea0d1 == null) {
            return;
        }
        c17013x966ea0d1.setVisibility(4);
    }
}
