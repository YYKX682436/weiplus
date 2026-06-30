package dn2;

/* loaded from: classes3.dex */
public final class i0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dn2.j0 f323455d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(dn2.j0 j0Var) {
        super(0);
        this.f323455d = j0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        dn2.j0 j0Var = this.f323455d;
        android.view.View view = j0Var.f323462a;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContent");
            throw null;
        }
        android.graphics.drawable.Drawable e17 = m95.a.e(view.getContext().getResources(), com.p314xaae8f345.mm.R.raw.f79903xc853ce0e, 0.0f);
        e17.setBounds(0, 0, j0Var.e(), j0Var.e());
        android.view.View view2 = j0Var.f323462a;
        if (view2 != null) {
            e17.setColorFilter(new android.graphics.PorterDuffColorFilter(view2.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an), android.graphics.PorterDuff.Mode.SRC_ATOP));
            return new al5.w(e17, 1);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContent");
        throw null;
    }
}
