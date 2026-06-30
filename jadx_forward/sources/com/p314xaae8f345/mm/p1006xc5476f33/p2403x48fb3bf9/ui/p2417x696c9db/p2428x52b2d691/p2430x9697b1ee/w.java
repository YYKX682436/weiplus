package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee;

/* loaded from: classes8.dex */
public final class w implements u53.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f267734a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f267735b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f267736c;

    public w(java.util.LinkedList linkedList, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar, java.util.LinkedList linkedList2) {
        this.f267734a = linkedList;
        this.f267735b = rVar;
        this.f267736c = linkedList2;
    }

    @Override // u53.x
    public final void a(java.util.Map map) {
        java.util.LinkedList linkedList;
        java.util.Iterator it = this.f267734a.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            linkedList = this.f267736c;
            if (!hasNext) {
                break;
            }
            u53.u uVar = (u53.u) map.get((java.lang.String) it.next());
            if (uVar != null) {
                y53.m mVar = (y53.m) uVar;
                linkedList.add(kz5.c1.k(new jz5.l(dm.i4.f66875xa013b0d5, mVar.t0()), new jz5.l("nickname", mVar.f67429x21f9b213), new jz5.l("avatarUrl", mVar.f67427x81118851)));
            }
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = this.f267735b;
        if (rVar != null) {
            rVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.C19468x1cd21606(linkedList, "get contact ok", true));
        }
    }
}
