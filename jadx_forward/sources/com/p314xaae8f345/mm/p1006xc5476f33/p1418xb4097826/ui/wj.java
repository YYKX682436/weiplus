package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes2.dex */
public final class wj extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6 f211526d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wj(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6 activityC15076x7a6c76b6) {
        super(0);
        this.f211526d = activityC15076x7a6c76b6;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ya2.b2 contact;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6 activityC15076x7a6c76b6 = this.f211526d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w8 w8Var = activityC15076x7a6c76b6.E;
        if (w8Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
        java.lang.String str = activityC15076x7a6c76b6.R1;
        if (str == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = activityC15076x7a6c76b6.Y;
            str = (abstractC14490x69736cb5 == null || (contact = abstractC14490x69736cb5.getContact()) == null) ? null : contact.D0();
            if (str == null) {
                str = "";
            }
        }
        w8Var.y(true, false, str, null);
        return jz5.f0.f384359a;
    }
}
