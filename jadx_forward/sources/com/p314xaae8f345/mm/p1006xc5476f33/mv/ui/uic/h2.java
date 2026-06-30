package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class h2 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68 f232690a;

    public h2(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68 c16668xffb9dd68) {
        this.f232690a = c16668xffb9dd68;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.h2
    public void b() {
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68 c16668xffb9dd68 = this.f232690a;
        java.lang.String str = c16668xffb9dd68.f232507d;
        int i17 = c16668xffb9dd68.f232515o;
        c16668xffb9dd68.f232510g.size();
        if (c16668xffb9dd68.f232510g.size() <= 0 || c16668xffb9dd68.f232515o < 0 || (c22849x81a93d25 = c16668xffb9dd68.f232509f) == null) {
            return;
        }
        c22849x81a93d25.post(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.f2(c16668xffb9dd68));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.h2
    public void c(int i17, int i18) {
        int i19;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68 c16668xffb9dd68 = this.f232690a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c16668xffb9dd68.f232507d, "onItemRangeChanged, lastPos:" + c16668xffb9dd68.f232515o + ", positionStart:" + i17 + ", itemCount:" + i18 + ", dataList.size:" + c16668xffb9dd68.f232510g.size());
        if (c16668xffb9dd68.f232510g.size() <= 0 || (i19 = c16668xffb9dd68.f232515o) < 0) {
            return;
        }
        int i27 = i18 + i17;
        boolean z17 = false;
        if (i17 <= i19 && i19 < i27) {
            z17 = true;
        }
        if (!z17 || c16668xffb9dd68.f232514n.f233394j || (c22849x81a93d25 = c16668xffb9dd68.f232509f) == null) {
            return;
        }
        c22849x81a93d25.post(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.g2(c16668xffb9dd68));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.h2
    public void d(int i17, int i18, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68 c16668xffb9dd68 = this.f232690a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c16668xffb9dd68.f232507d, "onItemRangeChanged, lastPos:" + c16668xffb9dd68.f232515o + ", positionStart:" + i17 + ", itemCount:" + i18 + ", dataList.size:" + c16668xffb9dd68.f232510g.size() + ", payLoad:" + obj);
        java.lang.Object obj2 = com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68.f232506J;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68.f232506J)) {
            return;
        }
        c(i17, i18);
    }
}
