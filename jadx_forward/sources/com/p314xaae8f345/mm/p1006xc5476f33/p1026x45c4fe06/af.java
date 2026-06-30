package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class af implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f156488d;

    public af(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var) {
        this.f156488d = o6Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        try {
            android.graphics.Bitmap a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ye.a(this.f156488d);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f156488d;
            java.lang.ThreadLocal threadLocal = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.s5.f171734a;
            if (o6Var != null && a17 != null && !a17.isRecycled()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.s5.f171735b.put(o6Var, a17);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.RuntimeRestartHelper", "showRestartPromptForCommLibUpdated takeSnapshot appId[%s], e[%s]", this.f156488d.f156336n, e17);
        }
        this.f156488d.z1(null, "CommLibUpdated");
    }
}
