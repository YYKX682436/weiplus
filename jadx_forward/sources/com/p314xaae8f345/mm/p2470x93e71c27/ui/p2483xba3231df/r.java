package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df;

/* loaded from: classes8.dex */
public final class r implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f272518d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.v f272519e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f272520f;

    public r(java.util.ArrayList arrayList, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.v vVar, android.content.Context context) {
        this.f272518d = arrayList;
        this.f272519e = vVar;
        this.f272520f = context;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        jz5.f0 f0Var;
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.util.ArrayList arrayList = this.f272518d;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w wVar = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w) kz5.n0.a0(arrayList, i17);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.v vVar = this.f272519e;
        if (wVar != null) {
            kb0.g gVar = vVar.f272543k;
            if (gVar != null) {
                gVar.e(wVar);
            }
            vVar.c(this.f272520f, wVar);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(vVar.h(), "onItemClick, position: " + i17 + ", dataList size: " + arrayList.size());
        }
    }
}
