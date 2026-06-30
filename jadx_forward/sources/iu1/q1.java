package iu1;

/* loaded from: classes9.dex */
public final class q1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iu1.r1 f376473d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.g45 f376474e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(iu1.r1 r1Var, r45.g45 g45Var) {
        super(0);
        this.f376473d = r1Var;
        this.f376474e = g45Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        iu1.r1 r1Var = this.f376473d;
        r1Var.i().f177007e = i65.a.b(r1Var.i().getContext(), 32);
        r1Var.i().f177006d = r1Var.f376477d;
        r1Var.i().getLayoutParams().height = r1Var.f376477d;
        r1Var.i().setVisibility(0);
        android.widget.ImageView imageView = r1Var.f376484n;
        if (imageView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("shadowIv");
            throw null;
        }
        imageView.setVisibility(0);
        r45.g45 g45Var = this.f376474e;
        java.lang.String str = g45Var.f456411n;
        if (str == null || str.length() == 0) {
            java.lang.String str2 = g45Var.f456410m;
            if (!(str2 == null || str2.length() == 0)) {
                r1Var.i().setImageDrawable(ju1.e.a(android.graphics.Color.parseColor(g45Var.f456410m)));
            }
        } else {
            ju1.e.b(r1Var.i(), g45Var.f456411n, r1Var.f376478e, r1Var.f376477d);
        }
        return jz5.f0.f384359a;
    }
}
