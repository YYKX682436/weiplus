package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class rd extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14895xe517e819 f205718d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14895xe517e819 c14895xe517e819) {
        super(1);
        this.f205718d = c14895xe517e819;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        android.content.Intent it = (android.content.Intent) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14895xe517e819 c14895xe517e819 = this.f205718d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1506xbe953013.C14232xa386119c O6 = c14895xe517e819.O6();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView = c14895xe517e819.P6();
        O6.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = recyclerView.mo7946xf939df19();
        O6.m56360xaa9b1fab(it);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r9 m56352x4d6f2425 = O6.m56352x4d6f2425();
        if (m56352x4d6f2425 != null) {
            java.util.ArrayList arrayList = m56352x4d6f2425.f189833a;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(arrayList) && (gVar = m56352x4d6f2425.f189834b) != null && O6.m56387xe6796cde().size() != arrayList.size()) {
                O6.m56387xe6796cde().clear();
                O6.m56387xe6796cde().addAll(arrayList);
                O6.m56377x73095078(gVar);
                if (mo7946xf939df19 != null) {
                    mo7946xf939df19.m8146xced61ae5();
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
