package f00;

/* loaded from: classes2.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.g9 f339860d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(bw5.g9 g9Var) {
        super(2);
        this.f339860d = g9Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        android.widget.ImageView imageView = (android.widget.ImageView) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageView, "imageView");
        java.util.LinkedList linkedList = this.f339860d.f109288t;
        java.lang.String str = linkedList != null ? (java.lang.String) kz5.n0.a0(linkedList, intValue) : null;
        if (!(str == null || str.length() == 0)) {
            wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb()).a(((c61.i8) ((vd2.i5) i95.n0.c(vd2.i5.class))).Ai(str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f));
            a17.f529406d = new f00.r(imageView);
            a17.f();
        }
        return jz5.f0.f384359a;
    }
}
