package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes2.dex */
public final class n0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14298xca26f590 f198027d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14298xca26f590 c14298xca26f590) {
        super(1);
        this.f198027d = c14298xca26f590;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View view = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        this.f198027d.getClass();
        android.graphics.Rect rect = new android.graphics.Rect();
        view.getGlobalVisibleRect(rect);
        return java.lang.Boolean.valueOf(!((((float) rect.height()) * 1.0f) / ((float) view.getHeight()) < 0.5f || (((float) rect.width()) * 1.0f) / ((float) view.getWidth()) < 0.5f));
    }
}
