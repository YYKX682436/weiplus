package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78;

/* loaded from: classes2.dex */
public final class m implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f204909d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.C14879x7c6ab7a6 f204910e;

    public m(com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.C14879x7c6ab7a6 c14879x7c6ab7a6) {
        this.f204909d = c22848x6ddd90cf;
        this.f204910e = c14879x7c6ab7a6;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        jz5.l lVar;
        yz5.p pVar;
        java.util.ArrayList arrayList;
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTopicFilterView", "click item pos:" + (i17 - this.f204909d.a0()));
        so2.e5 e5Var = (so2.e5) holder.f374658i;
        if (e5Var != null) {
            r45.r03 r03Var = e5Var.f491863d;
            long m75942xfb822ef2 = r03Var.m75942xfb822ef2(1);
            if (e5Var.f491865f) {
                e5Var.f491865f = false;
                lVar = new jz5.l(r03Var, java.lang.Boolean.FALSE);
            } else {
                e5Var.f491865f = true;
                lVar = new jz5.l(r03Var, java.lang.Boolean.TRUE);
            }
            r45.r03 r03Var2 = (r45.r03) lVar.f384366d;
            boolean booleanValue = ((java.lang.Boolean) lVar.f384367e).booleanValue();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTopicFilterView", "select item hash:" + e5Var.hashCode() + ", topic:" + r03Var.m75945x2fec8307(0) + ", selected:" + e5Var.f491865f);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.C14879x7c6ab7a6 c14879x7c6ab7a6 = this.f204910e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.h presenter = c14879x7c6ab7a6.getPresenter();
            if (presenter != null && (arrayList = presenter.f204901e) != null) {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    so2.e5 e5Var2 = (so2.e5) it.next();
                    if (e5Var2.f491863d.m75942xfb822ef2(1) != m75942xfb822ef2) {
                        e5Var2.f491865f = false;
                    }
                }
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = c14879x7c6ab7a6.adapter;
            if (c22848x6ddd90cf != null) {
                c22848x6ddd90cf.m8146xced61ae5();
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2 = c14879x7c6ab7a6.foldAdapter;
            if (c22848x6ddd90cf2 != null) {
                c22848x6ddd90cf2.m8146xced61ae5();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.h presenter2 = c14879x7c6ab7a6.getPresenter();
            if (presenter2 == null || (pVar = presenter2.f204902f) == null) {
                return;
            }
            pVar.mo149xb9724478(r03Var2, java.lang.Boolean.valueOf(booleanValue));
        }
    }
}
