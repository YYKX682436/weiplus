package yx2;

/* loaded from: classes2.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.mb4 f549395d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f549396e;

    public l(r45.mb4 mb4Var, android.widget.ImageView imageView) {
        this.f549395d = mb4Var;
        this.f549396e = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mn2.g1 g1Var = mn2.g1.f411508a;
        vo0.d e17 = g1Var.e();
        r45.mb4 item = this.f549395d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(item, "$item");
        wo0.c b17 = e17.b(new mn2.u0(item, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e, null, 4, null), g1Var.h(mn2.f1.f411486d));
        android.widget.ImageView imageView = this.f549396e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imageView, "$imageView");
        b17.c(imageView);
    }
}
