package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class j4 implements com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f188616d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15276x168ec665 f188617e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f188618f;

    public j4(java.util.LinkedList linkedList, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15276x168ec665 c15276x168ec665, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f188616d = linkedList;
        this.f188617e = c15276x168ec665;
        this.f188618f = h0Var;
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a
    public void a(float f17) {
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a
    public void b() {
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a
    public void c(boolean z17, boolean z18, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DrawerPresenter", "open comment emoji half screen isOpen %b isBegin %b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        if (z18) {
            return;
        }
        java.util.LinkedList linkedList = this.f188616d;
        if (z17) {
            java.lang.Integer num = (java.lang.Integer) linkedList.peek();
            if (num != null && num.intValue() == 17) {
                return;
            }
            linkedList.push(17);
            return;
        }
        android.content.Context context = this.f188617e.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.u6) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.u6.class)).f217631f = false;
        java.lang.Integer num2 = (java.lang.Integer) linkedList.peek();
        if (num2 != null && num2.intValue() == 17) {
            linkedList.pop();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1796x503cc4b4.C16185x90e25f78 c16185x90e25f78 = (com.p314xaae8f345.mm.p1006xc5476f33.p1796x503cc4b4.C16185x90e25f78) this.f188618f.f391656d;
        if (c16185x90e25f78 == null) {
            return;
        }
        c16185x90e25f78.f224936f = null;
    }
}
