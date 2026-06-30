package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes4.dex */
public final class o4 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.v4 f232875d;

    public o4(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.v4 v4Var) {
        this.f232875d = v4Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        if (((ym3.o) obj).f544710a == ym3.p.f544714f) {
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.v4 v4Var = this.f232875d;
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22847x422a813d c22847x422a813d = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22847x422a813d) ((jz5.n) v4Var.f233027n).mo141623x754a37bb();
            int size = v4Var.f233024h.f233598o.size() - 1;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            arrayList.add(java.lang.Integer.valueOf(size));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c22847x422a813d, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvMakerFlexEditUIC$initEditUI$1", "onChanged", "(Lcom/tencent/mm/plugin/mvvmlist/datasource/MvvmListLoadData;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            c22847x422a813d.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(c22847x422a813d, "com/tencent/mm/plugin/mv/ui/uic/MusicMvMakerFlexEditUIC$initEditUI$1", "onChanged", "(Lcom/tencent/mm/plugin/mvvmlist/datasource/MvvmListLoadData;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
    }
}
