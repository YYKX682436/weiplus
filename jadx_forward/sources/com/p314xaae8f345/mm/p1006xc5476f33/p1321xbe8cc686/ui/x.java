package com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui;

/* loaded from: classes12.dex */
public class x implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.y f177171a;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.y yVar) {
        this.f177171a = yVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public void a(boolean z17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChooseMsgFileUI", "bOk:%b", java.lang.Boolean.valueOf(z17));
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.ActivityC13098x53df0b7a activityC13098x53df0b7a = this.f177171a.f177172d;
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.ActivityC13098x53df0b7a.f177125y;
            activityC13098x53df0b7a.getClass();
            android.content.Intent intent = new android.content.Intent();
            intent.putParcelableArrayListExtra("FILEPATHS", activityC13098x53df0b7a.f177132m.a());
            activityC13098x53df0b7a.setResult(-1, intent);
            activityC13098x53df0b7a.finish();
        }
    }
}
