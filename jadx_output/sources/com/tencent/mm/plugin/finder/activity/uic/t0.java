package com.tencent.mm.plugin.finder.activity.uic;

/* loaded from: classes3.dex */
public final class t0 implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.uic.c1 f101949a;

    public t0(com.tencent.mm.plugin.finder.activity.uic.c1 c1Var) {
        this.f101949a = c1Var;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton view, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mm.plugin.finder.activity.uic.c1 c1Var = this.f101949a;
        com.tencent.mm.ui.widget.MMEditText mMEditText = c1Var.f101843e;
        if (mMEditText == null) {
            kotlin.jvm.internal.o.o("nameEdit");
            throw null;
        }
        android.text.Editable text = mMEditText.getText();
        int length = text != null ? text.length() : 0;
        com.tencent.mm.ui.widget.MMEditText mMEditText2 = c1Var.f101844f;
        if (mMEditText2 == null) {
            kotlin.jvm.internal.o.o("descEdit");
            throw null;
        }
        android.text.Editable text2 = mMEditText2.getText();
        com.tencent.mm.plugin.finder.activity.uic.c1.Q6(c1Var, length, text2 != null ? text2.length() : 0);
    }
}
