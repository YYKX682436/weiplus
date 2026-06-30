package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class ra extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f185990d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ra(in5.s0 s0Var) {
        super(4);
        this.f185990d = s0Var;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        android.view.MotionEvent motionEvent = (android.view.MotionEvent) obj;
        android.view.MotionEvent motionEvent2 = (android.view.MotionEvent) obj2;
        float floatValue = ((java.lang.Number) obj3).floatValue();
        float floatValue2 = ((java.lang.Number) obj4).floatValue();
        android.content.Context context = this.f185990d.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15460x89aca30d c15460x89aca30d = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15460x89aca30d) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15460x89aca30d.class);
        return java.lang.Boolean.valueOf(c15460x89aca30d != null ? c15460x89aca30d.T6(motionEvent, motionEvent2, floatValue, floatValue2) : false);
    }
}
