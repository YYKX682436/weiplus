package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1565x38b81db3;

/* loaded from: classes2.dex */
public final class n extends mo2.q {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.c cVar, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, java.lang.String authorFinderUsername, boolean z17, int i17) {
        super(cVar, activityC0065xcd7aa112, authorFinderUsername, z17, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(authorFinderUsername, "authorFinderUsername");
    }

    @Override // mo2.q
    public void s(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 item, in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        ((android.widget.FrameLayout) holder.p(com.p314xaae8f345.mm.R.id.f567414r82)).setVisibility(8);
        if (this.f411924h) {
            return;
        }
        holder.p(com.p314xaae8f345.mm.R.id.pzw).setOnLongClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1565x38b81db3.m(this, holder, item));
    }
}
