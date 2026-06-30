package com.p314xaae8f345.mm.ui;

/* loaded from: classes9.dex */
public class yh implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 f294123d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.zh f294124e;

    public yh(com.p314xaae8f345.mm.ui.zh zhVar, com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 c11158xe7d16ed5) {
        this.f294124e = zhVar;
        this.f294123d = c11158xe7d16ed5;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6210x3f282433 c6210x3f282433 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6210x3f282433();
        java.lang.String str = this.f294124e.f294168e;
        am.g00 g00Var = c6210x3f282433.f136460g;
        g00Var.f88257a = str;
        g00Var.f88258b = !this.f294123d.f153322o ? 1 : 2;
        g00Var.f88259c = 1;
        c6210x3f282433.e();
    }
}
