package com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui;

/* loaded from: classes9.dex */
public class l0 extends com.p314xaae8f345.mm.ui.ac {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.ActivityC13137x38066d82 f177848e;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.ActivityC13137x38066d82 activityC13137x38066d82) {
        this.f177848e = activityC13137x38066d82;
    }

    @Override // com.p314xaae8f345.mm.ui.ac
    public void a(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.ActivityC13137x38066d82 activityC13137x38066d82 = this.f177848e;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.ActivityC13137x38066d82.U6(activityC13137x38066d82)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QrRewardSetMoneyUI", "amt error!");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QrRewardSetMoneyUI", "do set code");
            java.lang.String replace = activityC13137x38066d82.f177805g.getText().toString().replace("\n", "");
            java.util.LinkedList linkedList = new java.util.LinkedList(activityC13137x38066d82.f177812q);
            boolean z17 = activityC13137x38066d82.f177815t;
            boolean z18 = false;
            int i17 = 0;
            while (true) {
                if (i17 >= activityC13137x38066d82.f177811p.size()) {
                    break;
                }
                if (!((java.lang.Integer) activityC13137x38066d82.f177811p.get(i17)).equals(((java.util.ArrayList) activityC13137x38066d82.f177812q).get(i17))) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QrRewardSetMoneyUI", "modify money: %s, %s", activityC13137x38066d82.f177811p.get(i17), ((java.util.ArrayList) activityC13137x38066d82.f177812q).get(i17));
                    z18 = true;
                    break;
                }
                i17++;
            }
            xw1.i iVar = new xw1.i(linkedList, replace, z17, z18);
            iVar.f539193g = new java.lang.ref.WeakReference(activityC13137x38066d82);
            activityC13137x38066d82.m83099x5406100e(iVar, true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14721, 1, 2);
    }
}
