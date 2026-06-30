package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public final class l extends com.tencent.mm.plugin.appbrand.widget.input.f4 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f91524d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.widget.input.p4 f91525e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(java.lang.String str, com.tencent.mm.plugin.appbrand.widget.input.p4 inputComponent) {
        super(java.lang.Integer.valueOf(inputComponent.e()));
        kotlin.jvm.internal.o.g(inputComponent, "inputComponent");
        this.f91524d = str;
        this.f91525e = inputComponent;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.v4
    public java.lang.String a() {
        android.text.Editable currentValue = this.f91525e.currentValue();
        if (currentValue != null) {
            return currentValue.toString();
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.v4
    public java.lang.String getInputType() {
        return this.f91524d;
    }
}
