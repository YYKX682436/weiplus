package zw1;

/* loaded from: classes9.dex */
public final class s2 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zw1.t2 f558320d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ww1.a3 f558321e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ww1.b3 f558322f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(zw1.t2 t2Var, ww1.a3 a3Var, ww1.b3 b3Var) {
        super(false);
        this.f558320d = t2Var;
        this.f558321e = a3Var;
        this.f558322f = b3Var;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View v17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        ot5.g.c("MicroMsg.WalletCollectQrCodeMultiShopUIC", "multiShopChangeBtn onclick");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(25983, 18, 2);
        ww1.a3 a3Var = this.f558321e;
        java.util.LinkedList shop_list = a3Var.V;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(shop_list, "shop_list");
        zw1.t2 t2Var = this.f558320d;
        t2Var.getClass();
        int size = shop_list.size();
        java.lang.String[] strArr = new java.lang.String[size];
        int i17 = 0;
        for (int i18 = 0; i18 < size; i18++) {
            strArr[i18] = "";
        }
        int size2 = shop_list.size();
        for (int i19 = 0; i19 < size2; i19++) {
            java.lang.String shop_name = ((r45.bj4) shop_list.get(i19)).f452338e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(shop_name, "shop_name");
            strArr[i19] = shop_name;
        }
        if (size == 0) {
            ot5.g.c("MicroMsg.WalletCollectQrCodeMultiShopUIC", "get optionalPickerDataArr fail!");
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0(t2Var.m158354x19263085(), strArr);
        android.view.View inflate = android.view.LayoutInflater.from(t2Var.m158354x19263085()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.aob, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.q0l)).setText(a3Var.W);
        c0Var.g(inflate);
        java.util.LinkedList shop_list2 = a3Var.V;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(shop_list2, "shop_list");
        long j17 = a3Var.U;
        t2Var.getClass();
        int size3 = shop_list2.size();
        int i27 = 0;
        while (true) {
            if (i27 >= size3) {
                break;
            }
            if (j17 == ((r45.bj4) shop_list2.get(i27)).f452337d) {
                i17 = i27;
                break;
            }
            i27++;
        }
        c0Var.i(i17);
        c0Var.f293792t = new zw1.r2(c0Var, a3Var, this.f558322f, t2Var);
        c0Var.l();
    }
}
