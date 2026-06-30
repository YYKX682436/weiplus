package com.tencent.mm.plugin.finder.activity.uic;

/* loaded from: classes3.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.uic.c1 f101908d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(com.tencent.mm.plugin.finder.activity.uic.c1 c1Var) {
        super(1);
        this.f101908d = c1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.plugin.finder.activity.uic.c1 c1Var = this.f101908d;
        com.tencent.mm.plugin.finder.activity.uic.c1.P6(c1Var);
        android.widget.CheckBox checkBox = c1Var.f101853r;
        if (checkBox == null) {
            kotlin.jvm.internal.o.o("announceCheckBox");
            throw null;
        }
        checkBox.setEnabled(true);
        c1Var.U6(true, fVar != null ? fVar.f70616b : 0);
        return jz5.f0.f302826a;
    }
}
