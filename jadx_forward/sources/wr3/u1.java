package wr3;

/* loaded from: classes4.dex */
public final class u1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f530430d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(android.view.View view) {
        super(0);
        this.f530430d = view;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View view = this.f530430d;
        int B = i65.a.B(view.getContext());
        int k17 = i65.a.k(view.getContext());
        if (B >= k17) {
            B = k17;
        }
        return java.lang.Integer.valueOf((int) ((B - ((int) (i65.a.g(view.getContext()) * 24))) / 1.7777778f));
    }
}
