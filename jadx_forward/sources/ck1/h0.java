package ck1;

/* loaded from: classes4.dex */
public final class h0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ck1.k0 f123863d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ck1.o f123864e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(ck1.k0 k0Var, ck1.o oVar) {
        super(0);
        this.f123863d = k0Var;
        this.f123864e = oVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ck1.t0 t0Var = ((ck1.n) this.f123864e).f123886a;
        ck1.k0 k0Var = this.f123863d;
        k0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1204xed412388.p1206xc84f0e86.C12720x8e4fa2d4 c12720x8e4fa2d4 = k0Var.f123871d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(ak1.f.d(c12720x8e4fa2d4), 1, false);
        android.widget.TextView textView = new android.widget.TextView(ak1.f.d(c12720x8e4fa2d4));
        textView.setMinHeight(i65.a.f(ak1.f.d(c12720x8e4fa2d4), com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj));
        int f17 = i65.a.f(ak1.f.d(c12720x8e4fa2d4), com.p314xaae8f345.mm.R.C30860x5b28f31.f561675ph);
        textView.setPadding(f17, 0, f17, 0);
        textView.setGravity(17);
        textView.setTextColor(b3.l.m9702x7444d5ad(ak1.f.d(c12720x8e4fa2d4), com.p314xaae8f345.mm.R.C30859x5a72f63.f560263fl));
        textView.setTextSize(0, i65.a.h(ak1.f.d(c12720x8e4fa2d4), com.p314xaae8f345.mm.R.C30860x5b28f31.f561463ja));
        java.lang.Object[] objArr = new java.lang.Object[1];
        java.lang.String str = t0Var.f123916c.f460513e;
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        textView.setText(c12720x8e4fa2d4.m7468x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.a5e, objArr));
        k0Var2.s(textView, false);
        k0Var2.f293405n = new ck1.x(k0Var);
        k0Var2.f293414s = new ck1.z(k0Var, t0Var);
        k0Var2.v();
        return jz5.f0.f384359a;
    }
}
