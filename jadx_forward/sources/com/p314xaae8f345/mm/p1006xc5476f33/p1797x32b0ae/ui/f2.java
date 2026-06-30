package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui;

/* loaded from: classes14.dex */
public final class f2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16262x8382bfc0 f225937d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16262x8382bfc0 activityC16262x8382bfc0) {
        super(2);
        this.f225937d = activityC16262x8382bfc0;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        float floatValue2 = ((java.lang.Number) obj2).floatValue();
        float abs = java.lang.Math.abs(floatValue);
        float abs2 = java.lang.Math.abs(floatValue2);
        boolean z17 = true;
        boolean z18 = abs > abs2;
        com.p314xaae8f345.p362xadfe2b3.ui.C3719xb0aa2063 c3719xb0aa2063 = this.f225937d.f225888f;
        if (c3719xb0aa2063.f127605y || ((z18 && c3719xb0aa2063.f127606z) || (!z18 && !c3719xb0aa2063.A))) {
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
