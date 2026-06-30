package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes2.dex */
public final class b2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(in5.s0 holder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 currentItem) {
        super(holder, currentItem);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(currentItem, "currentItem");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.d, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.r0
    public void a() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.d, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.s0
    public void b() {
        android.text.SpannableString flowCardDescSpan;
        com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc c23001x9d3a0bdc = (com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) this.f184636d.p(com.p314xaae8f345.mm.R.id.ufp);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f184637e;
        if (abstractC14490x69736cb5.getFeedObject().m59310xb9a58d36()) {
            flowCardDescSpan = abstractC14490x69736cb5.getFeedObject().getFlowCardDescSpan();
            if (flowCardDescSpan == null) {
                flowCardDescSpan = new android.text.SpannableString(abstractC14490x69736cb5.getFeedObject().m59226x730bcac6());
            }
        } else {
            flowCardDescSpan = abstractC14490x69736cb5.getFeedObject().getFlowCardDescSpan();
            if (flowCardDescSpan == null) {
                flowCardDescSpan = new android.text.SpannableString("");
            }
        }
        if (!(flowCardDescSpan.length() == 0)) {
            if (c23001x9d3a0bdc != null) {
                c23001x9d3a0bdc.setVisibility(0);
            }
            if (c23001x9d3a0bdc != null) {
                c23001x9d3a0bdc.b(flowCardDescSpan);
                return;
            }
            return;
        }
        if (!((java.lang.Boolean) ((jz5.n) this.f184638f).mo141623x754a37bb()).booleanValue() || abstractC14490x69736cb5.getFeedObject().m59310xb9a58d36()) {
            if (c23001x9d3a0bdc == null) {
                return;
            }
            c23001x9d3a0bdc.setVisibility(4);
        } else {
            if (c23001x9d3a0bdc == null) {
                return;
            }
            c23001x9d3a0bdc.setVisibility(8);
        }
    }
}
