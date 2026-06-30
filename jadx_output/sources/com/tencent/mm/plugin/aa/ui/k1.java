package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes11.dex */
public class k1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f72705d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.m1 f72706e;

    public k1(com.tencent.mm.plugin.aa.ui.m1 m1Var, java.util.List list) {
        this.f72706e = m1Var;
        this.f72705d = list;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.aa.ui.AASelectContactUI.x7(this.f72706e.f72731d, this.f72705d);
    }
}
