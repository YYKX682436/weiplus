package pk2;

/* loaded from: classes3.dex */
public final class r4 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f437746h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f437747i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437746h = helper.I0;
        this.f437747i = "";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o9Var.f437605a, "onItemClicked: 触发重度违规mock");
        dk2.ef efVar = dk2.ef.f314905a;
        dk2.g0 g0Var = dk2.ef.f314927l;
        if (g0Var != null) {
            g0Var.g();
        }
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437747i;
    }

    @Override // qk2.f
    public boolean o() {
        return true;
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        s(menu, this.f437746h, "重度违规-整改遮罩(内部)", com.p314xaae8f345.mm.R.raw.f80338xfee9d9da);
    }

    @Override // qk2.h
    public int y() {
        return this.f437746h;
    }
}
