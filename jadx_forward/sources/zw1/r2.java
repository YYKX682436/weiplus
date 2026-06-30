package zw1;

/* loaded from: classes9.dex */
public final class r2 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 f558305a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ww1.a3 f558306b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ww1.b3 f558307c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zw1.t2 f558308d;

    public r2(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var, ww1.a3 a3Var, ww1.b3 b3Var, zw1.t2 t2Var) {
        this.f558305a = c0Var;
        this.f558306b = a3Var;
        this.f558307c = b3Var;
        this.f558308d = t2Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.a0
    /* renamed from: onResult */
    public final void mo26363x57429edc(boolean z17, java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var = this.f558305a;
        c0Var.d();
        if (z17) {
            ww1.a3 a3Var = this.f558306b;
            if (a3Var.U != ((r45.bj4) a3Var.V.get(c0Var.b())).f452337d) {
                android.widget.TextView textView = this.f558307c.f531676o;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.String");
                textView.setText((java.lang.String) obj);
                a3Var.U = ((r45.bj4) a3Var.V.get(c0Var.b())).f452337d;
                zw1.t2 t2Var = this.f558308d;
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = t2Var.m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3) m158354x19263085).D7(a3Var);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = t2Var.m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630852, "null cannot be cast to non-null type com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3) m158354x192630852).i7();
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630853 = t2Var.m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630853, "null cannot be cast to non-null type com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3) m158354x192630853).h7(2, true);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(25983, 19, 2, java.lang.Long.valueOf(a3Var.U));
            }
        }
    }
}
