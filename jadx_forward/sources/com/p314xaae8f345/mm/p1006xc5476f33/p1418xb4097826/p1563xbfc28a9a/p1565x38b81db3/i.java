package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1565x38b81db3;

/* loaded from: classes2.dex */
public final class i extends mo2.q {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.c cVar, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, java.lang.String authorFinderUsername, boolean z17, int i17) {
        super(cVar, activityC0065xcd7aa112, authorFinderUsername, z17, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(authorFinderUsername, "authorFinderUsername");
    }

    @Override // mo2.q
    public void s(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 item, in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15327x51a31969 c15327x51a31969 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15327x51a31969) holder.p(com.p314xaae8f345.mm.R.id.f567415r83);
        int i17 = 0;
        c15327x51a31969.setVisibility(0);
        c15327x51a31969.b(item.getFeedObject().m59264x7efe73ec().size());
        java.util.List<android.view.View> m62271xf9bd9d24 = c15327x51a31969.m62271xf9bd9d24();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1565x38b81db3.h hVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1565x38b81db3.h(this, holder, item);
        for (java.lang.Object obj : item.getFeedObject().m59264x7efe73ec()) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            r45.mb4 mb4Var = (r45.mb4) obj;
            android.view.View view = m62271xf9bd9d24.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type com.tencent.mm.ui.MMImageView");
            com.p314xaae8f345.mm.ui.C21405x85fc1ce0 c21405x85fc1ce0 = (com.p314xaae8f345.mm.ui.C21405x85fc1ce0) view;
            java.util.List<android.view.View> list = m62271xf9bd9d24;
            ((wo0.b) new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb()).a(new mn2.c1(mb4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f, null, null, 12, null))).c(c21405x85fc1ce0);
            boolean z17 = this.f411924h;
            if (!z17) {
                c21405x85fc1ce0.setOnLongClickListener(hVar);
            }
            c21405x85fc1ce0.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1565x38b81db3.g(mb4Var, item, holder));
            if (!z17) {
                holder.p(com.p314xaae8f345.mm.R.id.pzw).setOnLongClickListener(hVar);
            }
            i17 = i18;
            m62271xf9bd9d24 = list;
        }
    }
}
