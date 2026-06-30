package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes15.dex */
public class w3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.y3 f224591d;

    public w3(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.y3 y3Var) {
        this.f224591d = y3Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallRechargeUI$RechargeAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.y3 y3Var = this.f224591d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16143x7673980 activityC16143x7673980 = y3Var.f224617e;
        boolean z18 = false;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.c()) {
            z17 = false;
        } else {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 i0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0(activityC16143x7673980);
            i0Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.g5y);
            i0Var.f(com.p314xaae8f345.mm.R.C30867xcad56011.f571988vj);
            i0Var.f293354b.E = new t83.e();
            i0Var.h();
            z17 = true;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallRechargeUI", "onClick recharged, non gp version!");
            yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallRechargeUI$RechargeAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16143x7673980 activityC16143x76739802 = y3Var.f224617e;
        int intValue = ((java.lang.Integer) view.getTag()).intValue();
        int i17 = activityC16143x76739802.f224189i;
        if (i17 != -1) {
            switch (i17) {
                case 10233:
                    java.lang.String string = activityC16143x76739802.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g5j);
                    if (!activityC16143x76739802.V6(string)) {
                        dp.a.m125854x26a183b(activityC16143x76739802, string, 0).show();
                        break;
                    }
                    break;
                case 10234:
                    java.lang.String string2 = activityC16143x76739802.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g5d);
                    if (!activityC16143x76739802.V6(string2)) {
                        db5.e1.G(activityC16143x76739802, string2, activityC16143x76739802.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g5l), true, null);
                        break;
                    }
                    break;
                case 10235:
                    java.lang.String string3 = activityC16143x76739802.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6j);
                    if (!activityC16143x76739802.V6(string3)) {
                        dp.a.m125854x26a183b(activityC16143x76739802, string3, 0).show();
                        break;
                    }
                    break;
                default:
                    java.lang.String string4 = activityC16143x76739802.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g3y);
                    if (!activityC16143x76739802.V6(string4)) {
                        dp.a.m125854x26a183b(activityC16143x76739802, string4, 0).show();
                        break;
                    }
                    break;
            }
            z18 = true;
        }
        if (!z18) {
            activityC16143x76739802.f224190m = intValue;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallRechargeUI", "ProductId:%s, PackPrice:%s,Currency:%s, index:%d", activityC16143x76739802.f224184d[intValue], activityC16143x76739802.f224185e[intValue], activityC16143x76739802.f224186f[intValue], java.lang.Integer.valueOf(intValue));
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(257L, 5L, 1L, true);
            q83.f fVar = activityC16143x76739802.f224194q;
            fVar.d();
            if (activityC16143x76739802.f224197t.getItem(intValue) instanceof r45.l57) {
                fVar.f442300e = ((r45.l57) activityC16143x76739802.f224197t.getItem(intValue)).f460696g;
            }
            fVar.f442301f = activityC16143x76739802.f224186f[intValue];
            fVar.f442299d = intValue;
            fVar.f442305j = activityC16143x76739802.f224184d[intValue];
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_product_id", activityC16143x76739802.f224184d[intValue]);
            intent.putExtra("key_currency_type", activityC16143x76739802.f224186f[intValue]);
            intent.putExtra("key_price", activityC16143x76739802.f224186f[intValue] + activityC16143x76739802.f224185e[intValue]);
            intent.putExtra("key_force_google", true);
            if (activityC16143x76739802.f224197t.getItem(intValue) instanceof r45.l57) {
                java.lang.String str = ((r45.l57) activityC16143x76739802.f224197t.getItem(intValue)).f460700n;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("md5:%s", str);
                    r45.q57 q57Var = new r45.q57();
                    q57Var.f465231d = str;
                    try {
                        intent.putExtra("key_ext_info", android.util.Base64.encodeToString(q57Var.mo14344x5f01b1f6(), 2));
                    } catch (java.io.IOException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallRechargeUI", e17.getMessage());
                    }
                }
            }
            j45.l.n(activityC16143x76739802, "wallet_index", ".ui.WalletIapUI", intent, 2001);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallRechargeUI$RechargeAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
