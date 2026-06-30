package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class c5 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f267538d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.k f267539e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267540f;

    public c5(java.util.ArrayList arrayList, nw4.k kVar, nw4.y2 y2Var) {
        this.f267538d = arrayList;
        this.f267539e = kVar;
        this.f267540f = y2Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.util.ArrayList arrayList = this.f267538d;
        int size = arrayList.size();
        nw4.k kVar = this.f267539e;
        nw4.y2 y2Var = this.f267540f;
        if (i17 >= size) {
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail", null);
            return;
        }
        java.lang.String str = (java.lang.String) ((android.util.Pair) arrayList.get(i17)).first;
        java.util.HashMap hashMap = new java.util.HashMap();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        hashMap.put(dm.i4.f66865x76d1ec5a, str);
        kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":ok", hashMap);
    }
}
