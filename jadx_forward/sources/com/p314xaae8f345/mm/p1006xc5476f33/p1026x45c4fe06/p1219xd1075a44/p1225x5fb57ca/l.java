package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes7.dex */
public final class l extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.f4 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f173057d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p4 f173058e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p4 inputComponent) {
        super(java.lang.Integer.valueOf(inputComponent.e()));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inputComponent, "inputComponent");
        this.f173057d = str;
        this.f173058e = inputComponent;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.v4
    public java.lang.String a() {
        android.text.Editable mo53471x57066778 = this.f173058e.mo53471x57066778();
        if (mo53471x57066778 != null) {
            return mo53471x57066778.toString();
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.v4
    /* renamed from: getInputType */
    public java.lang.String mo53490x652bd76e() {
        return this.f173057d;
    }
}
