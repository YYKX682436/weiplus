package ch2;

/* loaded from: classes3.dex */
public final class r extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f41450m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
    }

    public final void Z6(com.tencent.mm.plugin.finder.live.util.l1 l1Var) {
        r45.xn1 xn1Var;
        r45.xn1 xn1Var2;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        int i17;
        com.tencent.mars.xlog.Log.i("FinderLiveKTVGiftController", "performKTVGiftAnim");
        if (l1Var != null && ((mm2.e1) business(mm2.e1.class)).b7() && kotlin.jvm.internal.o.b(l1Var.f115600r, this.f41450m) && (xn1Var = (r45.xn1) l1Var.f115589d.getCustom(13)) != null) {
            int i18 = 0;
            com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0);
            if (finderContact2 == null) {
                return;
            }
            ce2.i e17 = dk2.u7.f234181a.e(l1Var.f115600r);
            java.lang.String R0 = e17 != null ? e17.R0() : null;
            if (zl2.r4.f473950a.k2(finderContact2.getUsername())) {
                com.tencent.mars.xlog.Log.i("FinderLiveKTVGiftController", "performKTVGiftAnim: myself");
                return;
            }
            java.lang.String str = l1Var.f115601s;
            r45.yx1 Q6 = ((om2.g) business(om2.g.class)).Q6();
            if (Q6 == null || (xn1Var2 = Q6.f391463i) == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var2.getCustom(0)) == null || !kotlin.jvm.internal.o.b(finderContact.getUsername(), str)) {
                return;
            }
            if (!kotlin.jvm.internal.o.b(((mm2.o4) business(mm2.o4.class)).a7().f309172c, finderContact2.getUsername())) {
                java.util.List Z6 = ((mm2.o4) business(mm2.o4.class)).Z6();
                kotlin.jvm.internal.o.f(Z6, "<get-allLinkMicUserList>(...)");
                synchronized (Z6) {
                    java.util.Iterator it = Z6.iterator();
                    i17 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i17 = -1;
                            break;
                        } else if (kotlin.jvm.internal.o.b(((km2.q) it.next()).f309172c, finderContact2.getUsername())) {
                            break;
                        } else {
                            i17++;
                        }
                    }
                }
                if (i17 >= 0 && i17 < 4) {
                    i18 = 1;
                }
                i18 = i18 != 0 ? i17 + 1 : i17;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("to_user_contact", str);
            bundle.putInt("from_user_index", i18);
            bundle.putString("gift_thumb_url", R0);
            X6(qo0.b.T, bundle);
        }
    }
}
