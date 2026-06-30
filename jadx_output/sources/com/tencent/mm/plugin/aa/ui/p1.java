package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes11.dex */
public class p1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.r1 f72765d;

    public p1(com.tencent.mm.plugin.aa.ui.r1 r1Var) {
        this.f72765d = r1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.aa.ui.r1 r1Var = this.f72765d;
        long size = r1Var.f72783d.I.size();
        com.tencent.mm.plugin.aa.ui.AASelectContactUI aASelectContactUI = r1Var.f72783d;
        if (size > aASelectContactUI.f72471J) {
            androidx.appcompat.app.AppCompatActivity context = aASelectContactUI.getContext();
            com.tencent.mm.plugin.aa.ui.AASelectContactUI aASelectContactUI2 = r1Var.f72783d;
            db5.e1.s(context, aASelectContactUI2.getString(com.tencent.mm.R.string.g_s, java.lang.Long.valueOf(aASelectContactUI2.f72471J)), "");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13722, 3);
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (r1Var.f72783d.A7()) {
            linkedList.addAll(com.tencent.mm.plugin.aa.ui.AASelectContactUI.w7(r1Var.f72783d));
        } else {
            linkedList.addAll(r1Var.f72783d.I);
        }
        java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(linkedList, ",");
        com.tencent.mm.plugin.aa.ui.AASelectContactUI aASelectContactUI3 = r1Var.f72783d;
        aASelectContactUI3.setResult(-1, aASelectContactUI3.getIntent().putExtra("Select_Contact", c17));
        r1Var.f72783d.finish();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13721, 2, 11);
    }
}
