package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class td extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f186139d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f186140e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, android.widget.LinearLayout linearLayout) {
        super(1);
        this.f186139d = abstractC14490x69736cb5;
        this.f186140e = linearLayout;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.widget.LinearLayout linearLayout;
        int intValue = ((java.lang.Number) obj).intValue();
        if ((this.f186139d.getNeedShowAnchorTips() || intValue != 0) && (linearLayout = this.f186140e) != null) {
            linearLayout.setVisibility(intValue);
        }
        return jz5.f0.f384359a;
    }
}
