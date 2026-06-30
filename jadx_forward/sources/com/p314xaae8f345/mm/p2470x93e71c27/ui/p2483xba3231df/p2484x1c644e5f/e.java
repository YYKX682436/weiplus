package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.p2484x1c644e5f;

/* loaded from: classes8.dex */
public final class e implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f272484d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kb0.g f272485e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.v f272486f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.p2484x1c644e5f.i f272487g;

    public e(java.util.ArrayList arrayList, kb0.g gVar, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.v vVar, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.p2484x1c644e5f.i iVar) {
        this.f272484d = arrayList;
        this.f272485e = gVar;
        this.f272486f = vVar;
        this.f272487g = iVar;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        jz5.f0 f0Var;
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.util.ArrayList arrayList = this.f272484d;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w wVar = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w) kz5.n0.a0(arrayList, i17);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.p2484x1c644e5f.i iVar = this.f272487g;
        if (wVar != null) {
            this.f272485e.e(wVar);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.v vVar = this.f272486f;
            vVar.c(vVar.f272533a, wVar);
            iVar.m158354x19263085().finish();
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(iVar.f272492d, "onItemClick, position: " + i17 + ", dataList size: " + arrayList.size());
        }
    }
}
