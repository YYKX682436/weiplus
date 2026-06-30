package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class v4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14889x51ce1ce f205816d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f205817e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f205818f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f205819g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f205820h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f205821i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14889x51ce1ce c14889x51ce1ce, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, int i17, long j17, android.widget.ImageView imageView, android.graphics.Rect rect) {
        super(2);
        this.f205816d = c14889x51ce1ce;
        this.f205817e = abstractC14490x69736cb5;
        this.f205818f = i17;
        this.f205819g = j17;
        this.f205820h = imageView;
        this.f205821i = rect;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        android.content.Intent intent = (android.content.Intent) obj2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14889x51ce1ce c14889x51ce1ce = this.f205816d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f205817e;
        int i17 = this.f205818f;
        long j17 = this.f205819g;
        android.content.Intent intent2 = intent == null ? new android.content.Intent() : intent;
        android.widget.ImageView thumbView = this.f205820h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(thumbView, "$thumbView");
        c14889x51ce1ce.m58660xec591b78(abstractC14490x69736cb5, i17, booleanValue, j17, intent2, thumbView, this.f205821i);
        return jz5.f0.f384359a;
    }
}
