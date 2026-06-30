package com.tencent.mm.plugin.address.ui;

/* loaded from: classes15.dex */
public final class s1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.f4 f74622d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.WalletAddAddressUI f74623e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(com.tencent.mm.ui.widget.dialog.f4 f4Var, com.tencent.mm.plugin.address.ui.WalletAddAddressUI walletAddAddressUI) {
        super(1);
        this.f74622d = f4Var;
        this.f74623e = walletAddAddressUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17;
        r45.zi5 zi5Var = (r45.zi5) obj;
        this.f74622d.dismiss();
        boolean z18 = zi5Var == null;
        com.tencent.mm.plugin.address.ui.WalletAddAddressUI walletAddAddressUI = this.f74623e;
        if (!z18) {
            java.util.Map map = com.tencent.mm.plugin.address.ui.WalletAddAddressUI.H;
            walletAddAddressUI.getClass();
            java.util.List i17 = kz5.c0.i(zi5Var.f392116n, zi5Var.f392117o, zi5Var.f392111f, zi5Var.f392112g, zi5Var.f392113h, zi5Var.f392119q, zi5Var.f392115m, zi5Var.f392114i);
            if (!i17.isEmpty()) {
                java.util.Iterator it = i17.iterator();
                while (it.hasNext()) {
                    if (((r45.du5) it.next()).f372757e) {
                        z17 = false;
                        break;
                    }
                }
            }
            z17 = true;
            if (!z17) {
                com.tencent.mm.plugin.address.ui.AddrItemView addrItemView = walletAddAddressUI.f74480y;
                if (addrItemView == null) {
                    kotlin.jvm.internal.o.o("addrRegion");
                    throw null;
                }
                java.util.List I = kz5.z.I(new r45.du5[]{zi5Var.f392111f, zi5Var.f392112g, zi5Var.f392113h, zi5Var.f392119q});
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it6 = ((java.util.ArrayList) I).iterator();
                while (it6.hasNext()) {
                    java.lang.Object next = it6.next();
                    java.lang.String str = ((r45.du5) next).f372756d;
                    kotlin.jvm.internal.o.f(str, "toString(...)");
                    if (str.length() > 0) {
                        arrayList.add(next);
                    }
                }
                addrItemView.setText(kz5.n0.g0(arrayList, " ", null, null, 0, null, null, 62, null));
                com.tencent.mm.plugin.address.ui.AddrItemView addrItemView2 = walletAddAddressUI.f74481z;
                if (addrItemView2 == null) {
                    kotlin.jvm.internal.o.o("addrDetailed");
                    throw null;
                }
                java.lang.String str2 = zi5Var.f392115m.f372756d;
                kotlin.jvm.internal.o.f(str2, "toString(...)");
                addrItemView2.setText(str2);
                com.tencent.mm.plugin.address.ui.AddrItemView addrItemView3 = walletAddAddressUI.A;
                if (addrItemView3 == null) {
                    kotlin.jvm.internal.o.o("addrName");
                    throw null;
                }
                java.lang.String str3 = zi5Var.f392116n.f372756d;
                kotlin.jvm.internal.o.f(str3, "toString(...)");
                addrItemView3.setText(str3);
                com.tencent.mm.plugin.address.ui.AddrItemView addrItemView4 = walletAddAddressUI.B;
                if (addrItemView4 == null) {
                    kotlin.jvm.internal.o.o("addrPhone");
                    throw null;
                }
                addrItemView4.setCode(zi5Var.f392120r.f372756d);
                com.tencent.mm.plugin.address.ui.AddrItemView addrItemView5 = walletAddAddressUI.B;
                if (addrItemView5 == null) {
                    kotlin.jvm.internal.o.o("addrPhone");
                    throw null;
                }
                java.lang.String str4 = zi5Var.f392117o.f372756d;
                kotlin.jvm.internal.o.f(str4, "toString(...)");
                addrItemView5.setText(str4);
                com.tencent.mm.ui.widget.button.WeButton weButton = walletAddAddressUI.D;
                if (weButton == null) {
                    kotlin.jvm.internal.o.o("addrFinish");
                    throw null;
                }
                weButton.setEnabled(walletAddAddressUI.X6());
                r45.du5 du5Var = zi5Var.f392118p;
                if (du5Var != null) {
                    java.lang.String str5 = du5Var.f372756d;
                    kotlin.jvm.internal.o.f(str5, "toString(...)");
                    walletAddAddressUI.C = str5;
                }
                return jz5.f0.f302826a;
            }
        }
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(walletAddAddressUI.getContext());
        e4Var.f211776c = walletAddAddressUI.getString(com.tencent.mm.R.string.mcv);
        e4Var.c();
        return jz5.f0.f302826a;
    }
}
