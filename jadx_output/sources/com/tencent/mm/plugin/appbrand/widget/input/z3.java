package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public class z3 extends android.text.Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.e4 f91733a;

    public z3(com.tencent.mm.plugin.appbrand.widget.input.e4 e4Var) {
        this.f91733a = e4Var;
    }

    @Override // android.text.Editable.Factory
    public android.text.Editable newEditable(java.lang.CharSequence charSequence) {
        return this.f91733a.s(super.newEditable(charSequence));
    }
}
