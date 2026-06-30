package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class c1 implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f285053d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.i1 f285054e;

    public c1(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.i1 i1Var, java.util.LinkedList linkedList) {
        this.f285054e = i1Var;
        this.f285053d = linkedList;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.i1 i1Var = this.f285054e;
        i1Var.getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.b1(i1Var));
        if (i17 != 0 || i18 != 0) {
            db5.t7.m123882x26a183b(i1Var.f285683t.g(), com.p314xaae8f345.mm.R.C30867xcad56011.hd9, 0).show();
            return 0;
        }
        if (((r45.i36) oVar.f152244b.f152233a) != null) {
            int i19 = 0;
            while (true) {
                java.util.LinkedList linkedList = this.f285053d;
                if (i19 >= linkedList.size()) {
                    break;
                }
                r45.le7 le7Var = (r45.le7) linkedList.get(i19);
                if (le7Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingItemAppBrandNotifyMsg", "scene end, item is null");
                } else {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6187xa3de110b c6187xa3de110b = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6187xa3de110b();
                    java.lang.String str2 = le7Var.f460931d;
                    am.rz rzVar = c6187xa3de110b.f136445g;
                    rzVar.f89386a = str2;
                    rzVar.f89387b = le7Var.f460932e == 0;
                    c6187xa3de110b.e();
                }
                i19++;
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemAppBrandNotifyMsg", "setReceiveOff failed, response is null!");
        }
        return 0;
    }
}
