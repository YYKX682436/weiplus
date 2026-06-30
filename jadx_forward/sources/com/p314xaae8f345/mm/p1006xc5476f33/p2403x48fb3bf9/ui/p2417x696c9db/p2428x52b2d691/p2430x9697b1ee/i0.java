package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee;

/* loaded from: classes8.dex */
public final class i0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f267719d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267720e;

    public i0(nw4.k kVar, nw4.y2 y2Var) {
        this.f267719d = kVar;
        this.f267720e = y2Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.C19468x1cd21606 c19468x1cd21606 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.C19468x1cd21606) obj;
        boolean z17 = c19468x1cd21606.f267681f;
        nw4.y2 y2Var = this.f267720e;
        nw4.k kVar = this.f267719d;
        java.lang.String str = c19468x1cd21606.f267680e;
        if (!z17) {
            kVar.f422396d.e(y2Var.f422546c, "gamelifeManager fail" + str, null);
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = c19468x1cd21606.f267679d;
        if (linkedList2 != null) {
            java.util.Iterator it = linkedList2.iterator();
            while (it.hasNext()) {
                linkedList.add(nw4.x2.b((java.util.Map) it.next()));
            }
        }
        java.util.Map e17 = kz5.b1.e(new jz5.l("contacts", linkedList));
        kVar.f422396d.e(y2Var.f422546c, "gamelifeManager success" + str, e17);
    }
}
