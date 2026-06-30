package com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui;

/* loaded from: classes12.dex */
public class c implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.d f177149a;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.d dVar) {
        this.f177149a = dVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public void a(boolean z17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChooseMsgFileListUI", "bOk:%b", java.lang.Boolean.valueOf(z17));
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.ActivityC13096xe0b615b8 activityC13096xe0b615b8 = this.f177149a.f177151d;
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.ActivityC13096xe0b615b8.f177099q;
            activityC13096xe0b615b8.getClass();
            android.content.Intent intent = new android.content.Intent();
            intent.putParcelableArrayListExtra("FILEPATHS", activityC13096xe0b615b8.f177105i.a());
            activityC13096xe0b615b8.setResult(-1, intent);
            activityC13096xe0b615b8.finish();
        }
    }
}
