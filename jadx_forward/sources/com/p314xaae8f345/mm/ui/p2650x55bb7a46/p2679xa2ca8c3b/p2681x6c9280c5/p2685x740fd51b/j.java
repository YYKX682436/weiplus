package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b;

/* loaded from: classes12.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final kz5.q f286344a = new kz5.q();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22100x47612006 f286345b;

    public j(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22100x47612006 c22100x47612006) {
        this.f286345b = c22100x47612006;
    }

    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.AbstractC22098xdb6634aa a(java.lang.String str) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.AbstractC22098xdb6634aa c22101xd1256332;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22100x47612006 c22100x47612006 = this.f286345b;
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(c22100x47612006.f286241f, "itemViewPool, requestView, uniqueId is null");
            return null;
        }
        android.widget.FrameLayout frameLayout = c22100x47612006.f286245m;
        if (frameLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewContainer");
            throw null;
        }
        int childCount = frameLayout.getChildCount();
        boolean z17 = false;
        for (int i17 = 0; i17 < childCount; i17++) {
            android.widget.FrameLayout frameLayout2 = c22100x47612006.f286245m;
            if (frameLayout2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewContainer");
                throw null;
            }
            android.view.View childAt = frameLayout2.getChildAt(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(childAt);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c22100x47612006.s(childAt), str) && (childAt instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.AbstractC22098xdb6634aa)) {
                return (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.AbstractC22098xdb6634aa) childAt;
            }
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.m mVar = c22100x47612006.G;
        mVar.getClass();
        b11.e eVar = (b11.e) mVar.f286359b.get(str);
        if (eVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(c22100x47612006.f286241f, "itemViewPool, requestView, idCache not found");
            return null;
        }
        b11.a aVar = (b11.a) eVar.f98567a.mo141623x754a37bb();
        kz5.q qVar = this.f286344a;
        java.util.Iterator it = qVar.iterator();
        int i18 = 0;
        while (true) {
            if (!it.hasNext()) {
                i18 = -1;
                break;
            }
            if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.AbstractC22098xdb6634aa) it.next()).i(aVar)) {
                break;
            }
            i18++;
        }
        if (!qVar.isEmpty()) {
            if (i18 >= 0 && i18 < qVar.f395533f) {
                z17 = true;
            }
            if (z17) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.AbstractC22098xdb6634aa abstractC22098xdb6634aa = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.AbstractC22098xdb6634aa) qVar.get(i18);
                qVar.e(i18);
                abstractC22098xdb6634aa.setId(com.p314xaae8f345.mm.R.id.sr9);
                abstractC22098xdb6634aa.setTag(com.p314xaae8f345.mm.R.id.sr9, str);
                android.widget.FrameLayout frameLayout3 = c22100x47612006.f286245m;
                if (frameLayout3 != null) {
                    frameLayout3.addView(abstractC22098xdb6634aa, new android.widget.FrameLayout.LayoutParams(-2, -2, 17));
                    return abstractC22098xdb6634aa;
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewContainer");
                throw null;
            }
        }
        android.content.Context context = c22100x47612006.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        if (aVar instanceof b11.b) {
            c22101xd1256332 = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22099x71fcae3a(context, null, 0, 6, null);
        } else {
            if (!(aVar instanceof b11.d)) {
                throw new jz5.j();
            }
            c22101xd1256332 = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22101xd1256332(context, null, 0, 6, null);
        }
        c22101xd1256332.setId(com.p314xaae8f345.mm.R.id.sr9);
        c22101xd1256332.setTag(com.p314xaae8f345.mm.R.id.sr9, str);
        android.widget.FrameLayout frameLayout4 = c22100x47612006.f286245m;
        if (frameLayout4 != null) {
            frameLayout4.addView(c22101xd1256332, new android.widget.FrameLayout.LayoutParams(-2, -2, 17));
            return c22101xd1256332;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewContainer");
        throw null;
    }
}
