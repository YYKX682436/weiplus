package pk2;

/* loaded from: classes3.dex */
public final class q4 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f437723h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f437724i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437723h = helper.J0;
        this.f437724i = "";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        df2.cy cyVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o9Var.f437605a, "onItemClicked: 触发中度违规mock (BottomSheet)");
        dk2.ef efVar = dk2.ef.f314905a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e = dk2.ef.f314904J;
        if (c14197x319b1b9e == null || (cyVar = (df2.cy) c14197x319b1b9e.m56798x25fe639c(df2.cy.class)) == null) {
            return;
        }
        cyVar.b7();
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437724i;
    }

    @Override // qk2.f
    public boolean o() {
        return true;
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        s(menu, this.f437723h, "中度违规-半屏弹窗(内部)", com.p314xaae8f345.mm.R.raw.f80338xfee9d9da);
    }

    @Override // qk2.h
    public int y() {
        return this.f437723h;
    }
}
