package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class jw extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz f188677d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jw(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz pzVar) {
        super(1);
        this.f188677d = pzVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ct ctVar;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56655x4905e9fa;
        int intValue = ((java.lang.Number) obj).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz pzVar = this.f188677d;
        if (pzVar.C.m56387xe6796cde().size() > 1 && (ctVar = pzVar.f190292m) != null && (m56655x4905e9fa = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v00) ctVar).m56655x4905e9fa()) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(intValue + 1));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(m56655x4905e9fa, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter$buildItemCoverts$1$getItemConvert$4", "invoke", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
            m56655x4905e9fa.c1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(m56655x4905e9fa, "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter$buildItemCoverts$1$getItemConvert$4", "invoke", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
        }
        return jz5.f0.f384359a;
    }
}
