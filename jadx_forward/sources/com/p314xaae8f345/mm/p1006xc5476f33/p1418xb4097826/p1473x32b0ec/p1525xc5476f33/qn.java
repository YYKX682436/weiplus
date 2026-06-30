package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class qn extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn f195561d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qn(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn tnVar) {
        super(0);
        this.f195561d = tnVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn tnVar = this.f195561d;
        tnVar.f195990x.cancel();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.un unVar = tnVar.f195980n;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14323xd3329234 c14323xd3329234 = unVar.f196130g;
        if (c14323xd3329234 != null) {
            c14323xd3329234.setTag(0);
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = unVar.f196129f;
        if (c22789xd23e9a9b != null) {
            c22789xd23e9a9b.n();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1499x306930.p1500xd1075a44.C14224x1cce21ec c14224x1cce21ec = unVar.f196131h;
        if (c14224x1cce21ec != null) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c14224x1cce21ec.getLayoutManager();
            if (layoutManager != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(layoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/gift/widget/FinderRandomAnimTextView", "reset", "()V", "Undefined", "scrollToPosition", "(I)V");
                layoutManager.mo2420xc593c771(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(layoutManager, "com/tencent/mm/plugin/finder/live/gift/widget/FinderRandomAnimTextView", "reset", "()V", "Undefined", "scrollToPosition", "(I)V");
            }
            c14224x1cce21ec.f193186b2.clear();
            c14224x1cce21ec.f193187c2.m8146xced61ae5();
        }
        return jz5.f0.f384359a;
    }
}
