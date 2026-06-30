package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class o3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15304x8ca13bae f205574d;

    public o3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15304x8ca13bae c15304x8ca13bae) {
        this.f205574d = c15304x8ca13bae;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        yz5.a aVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC$justWatchedLayout$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15304x8ca13bae c15304x8ca13bae = this.f205574d;
        java.lang.Object tag = c15304x8ca13bae.getTag(com.p314xaae8f345.mm.R.id.rld);
        java.lang.Integer num = tag instanceof java.lang.Integer ? (java.lang.Integer) tag : null;
        int intValue = num != null ? num.intValue() : 0;
        if (intValue == 10) {
            java.lang.Object tag2 = c15304x8ca13bae.getTag(com.p314xaae8f345.mm.R.id.rlb);
            aVar = p3321xbce91901.jvm.p3324x21ffc6bd.m0.f(tag2, 0) ? (yz5.a) tag2 : null;
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
        } else if (intValue == 11) {
            java.lang.Object tag3 = c15304x8ca13bae.getTag(com.p314xaae8f345.mm.R.id.rlc);
            aVar = p3321xbce91901.jvm.p3324x21ffc6bd.m0.f(tag3, 0) ? (yz5.a) tag3 : null;
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC$justWatchedLayout$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
