package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* loaded from: classes15.dex */
public class t extends m22.s {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b f179724b;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b activityC13279x3d93ec0b) {
        this.f179724b = activityC13279x3d93ec0b;
    }

    @Override // m22.s
    public void a(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiCustomUI", "onMove(%d, %d)", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b activityC13279x3d93ec0b = this.f179724b;
        java.util.ArrayList arrayList = new java.util.ArrayList(activityC13279x3d93ec0b.f179233f.f402152f);
        if (i18 >= 0) {
            activityC13279x3d93ec0b.f179232e.performHapticFeedback(1);
        }
        if (i17 < 0 && i18 >= 0) {
            arrayList.add(i18, activityC13279x3d93ec0b.T);
            activityC13279x3d93ec0b.f179233f.E(arrayList);
            activityC13279x3d93ec0b.f179233f.m8149x8b456734(i18);
        } else if (i18 < 0) {
            int indexOf = arrayList.indexOf(activityC13279x3d93ec0b.T);
            if (arrayList.remove(activityC13279x3d93ec0b.T)) {
                activityC13279x3d93ec0b.f179233f.E(arrayList);
                activityC13279x3d93ec0b.f179233f.m8155x27702c4(indexOf);
            }
        } else {
            arrayList.add(i18, (ir.u0) arrayList.remove(i17));
            activityC13279x3d93ec0b.f179233f.E(arrayList);
            activityC13279x3d93ec0b.f179233f.m8150x87567217(i17, i18);
        }
        m22.e eVar = activityC13279x3d93ec0b.f179249x;
        boolean z17 = i18 == arrayList.size() - 1;
        eVar.f404575m = z17;
        eVar.f404569d.D0();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiFreeSortingItemDec", "set showLastDots: " + z17);
    }
}
