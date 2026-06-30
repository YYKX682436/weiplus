package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes.dex */
public final class g9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.v9 f198651d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g9(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.v9 v9Var) {
        super(0);
        this.f198651d = v9Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.v9 v9Var = this.f198651d;
        android.widget.ProgressBar progressBar = v9Var.f199022h;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        v9Var.Q6(v9Var.f199030s);
        int i17 = v9Var.f199027p;
        if (i17 != 1 && i17 != 2) {
            zl2.r4.f555483a.W2(v9Var.f199029r, v9Var.f199030s, v9Var.f199031t);
        } else if (v9Var.f199035x) {
            pm0.v.V(i17 == 2 ? 2000L : 0L, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.f9(v9Var));
        }
        android.app.Activity context = v9Var.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.s8 s8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.s8) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.s8.class);
        if (s8Var != null) {
            s8Var.P6();
            s8Var.O6();
        }
        return jz5.f0.f384359a;
    }
}
