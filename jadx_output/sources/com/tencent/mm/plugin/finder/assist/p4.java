package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes.dex */
public final class p4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az2.f f102453d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f102454e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(az2.f fVar, com.tencent.mm.ui.MMActivity mMActivity) {
        super(1);
        this.f102453d = fVar;
        this.f102454e = mMActivity;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.d61 it = (r45.d61) obj;
        kotlin.jvm.internal.o.g(it, "it");
        this.f102453d.b();
        com.tencent.mm.sdk.platformtools.b0.e(it.getString(1));
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(this.f102454e);
        e4Var.b(com.tencent.mm.R.raw.icons_filled_check_mark);
        e4Var.d(com.tencent.mm.R.string.f490361st);
        e4Var.c();
        return jz5.f0.f302826a;
    }
}
