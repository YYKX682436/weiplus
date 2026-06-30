package nv3;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final nv3.k f422219a = new nv3.k();

    public final void a(android.view.View view, rv3.h feed) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.C17062x96def0f0 c17062x96def0f0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.AbstractC17059x115d0b14 abstractC17059x115d0b14;
        jz5.l lVar;
        yz5.l lVar2;
        yz5.l m68326x6baa3111;
        yz5.l lVar3;
        yz5.p m68325xdab4d5a1;
        android.view.View itemView = view;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        android.content.Context context = view.getContext();
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a = feed.f481928d;
        long j17 = c16997xb0aa383a.f237253q;
        int i17 = c16997xb0aa383a.f237244e;
        while (true) {
            c17062x96def0f0 = null;
            if (itemView == null) {
                abstractC17059x115d0b14 = null;
                break;
            } else if (itemView instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.AbstractC17059x115d0b14) {
                abstractC17059x115d0b14 = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.AbstractC17059x115d0b14) itemView;
                break;
            } else {
                java.lang.Object parent = itemView.getParent();
                itemView = parent instanceof android.view.View ? (android.view.View) parent : null;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("show: musicId=");
        sb6.append(i17);
        sb6.append(" totalDurationMs=");
        sb6.append(j17);
        sb6.append(" hasBusinessChannel=");
        sb6.append((abstractC17059x115d0b14 != null ? abstractC17059x115d0b14.m68324x32e9307() : null) != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderMusicClipHelper", sb6.toString());
        if (abstractC17059x115d0b14 == null || (m68325xdab4d5a1 = abstractC17059x115d0b14.m68325xdab4d5a1()) == null || (lVar = (jz5.l) m68325xdab4d5a1.mo149xb9724478(c16997xb0aa383a, java.lang.Long.valueOf(j17))) == null) {
            lVar = new jz5.l(0L, java.lang.Long.valueOf(j17));
        }
        long longValue = ((java.lang.Number) lVar.f384366d).longValue();
        long longValue2 = ((java.lang.Number) lVar.f384367e).longValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.j jVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.j(context);
        if (j17 < 0) {
            j17 = 0;
        }
        jVar.f237796c = j17;
        long h17 = e06.p.h(longValue, 0L, j17);
        jVar.f237797d = h17;
        jVar.f237798e = e06.p.h(longValue2, h17, jVar.f237796c);
        jVar.f237804k = new nv3.j(i17, abstractC17059x115d0b14, c16997xb0aa383a);
        yz5.l lVar4 = jVar.f237803j;
        if (abstractC17059x115d0b14 != null && (m68326x6baa3111 = abstractC17059x115d0b14.m68326x6baa3111()) != null) {
            if (jVar.f237805l) {
                yz5.l lVar5 = jVar.f237802i;
                if (lVar5 != null) {
                    lVar5.mo146xb9724478(null);
                }
                jVar.f237805l = false;
            }
            jVar.f237802i = m68326x6baa3111;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = jVar.f237795b;
            if ((y1Var != null && y1Var.f()) && (lVar3 = jVar.f237802i) != null && !jVar.f237805l) {
                lVar3.mo146xb9724478(lVar4);
                jVar.f237805l = true;
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var2 = jVar.f237795b;
        if (y1Var2 != null && y1Var2.f()) {
            return;
        }
        android.content.Context context2 = jVar.f237794a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var3 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(context2);
        y1Var3.d(true);
        android.view.View inflate = android.view.LayoutInflater.from(context2).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.eky, (android.view.ViewGroup) null, false);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.uih);
        if (textView != null) {
            com.p314xaae8f345.mm.ui.fk.a(textView);
        }
        jVar.f237800g = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.uig);
        jVar.f237801h = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.uic);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.C17062x96def0f0 c17062x96def0f02 = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.C17062x96def0f0) inflate.findViewById(com.p314xaae8f345.mm.R.id.uid);
        if (c17062x96def0f02 != null) {
            long j18 = jVar.f237796c;
            long j19 = jVar.f237797d;
            long j27 = jVar.f237798e;
            long max = java.lang.Math.max(0L, j18);
            c17062x96def0f02.G = max;
            long h18 = e06.p.h(j19, 0L, max);
            long h19 = e06.p.h(j27, h18, c17062x96def0f02.G);
            c17062x96def0f02.H = h18;
            long j28 = h19 - h18;
            long j29 = c17062x96def0f02.f237677J;
            if (j28 < j29) {
                h19 = java.lang.Math.min(c17062x96def0f02.G, h18 + j29);
            }
            c17062x96def0f02.I = h19;
            c17062x96def0f02.K = -1L;
            c17062x96def0f02.invalidate();
            c17062x96def0f02.m68346x8afc6469(new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.h(jVar));
            c17062x96def0f02.m68345x2dc61338(new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.i(jVar));
            c17062x96def0f0 = c17062x96def0f02;
        }
        jVar.f237799f = c17062x96def0f0;
        jVar.a();
        y1Var3.f293570s = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.q1(jVar, y1Var3);
        y1Var3.k(inflate);
        jVar.f237795b = y1Var3;
        y1Var3.s();
        if (jVar.f237795b != y1Var3 || (lVar2 = jVar.f237802i) == null || jVar.f237805l) {
            return;
        }
        lVar2.mo146xb9724478(lVar4);
        jVar.f237805l = true;
    }
}
