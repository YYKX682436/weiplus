package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.all;

/* loaded from: classes2.dex */
public final class a extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mj {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.all.m f202603e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.all.m mVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f rlLayout) {
        super(rlLayout);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rlLayout, "rlLayout");
        this.f202603e = mVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mj
    public int a() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m62367x4905e9fa = this.f214199d.m62367x4905e9fa();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = m62367x4905e9fa != null ? m62367x4905e9fa.mo7946xf939df19() : null;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = mo7946xf939df19 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf ? (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) mo7946xf939df19 : null;
        if (c22848x6ddd90cf != null) {
            return c22848x6ddd90cf.a0();
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mj
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.all.m mVar = this.f202603e;
        if (mVar.f202623f.m56387xe6796cde().size() > mVar.f202623f.f189036g) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.all.q qVar = mVar.f202624g;
            if (qVar != null) {
                qVar.g(false, mVar.f202626i);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.all.q qVar2 = mVar.f202624g;
        if (qVar2 != null) {
            android.view.View view = qVar2.f202648r;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("footer");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/member/all/FinderMemberAllViewCallback", "hideFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/member/all/FinderMemberAllViewCallback", "hideFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
