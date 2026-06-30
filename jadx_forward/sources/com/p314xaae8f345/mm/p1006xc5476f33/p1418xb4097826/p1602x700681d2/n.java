package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2;

/* loaded from: classes2.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.l0 f203906d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.l0 l0Var) {
        super(0);
        this.f203906d = l0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f203906d.u().m82555x4905e9fa().getLayoutManager();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 c15415x74224fd8 = layoutManager instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8) layoutManager : null;
        if (c15415x74224fd8 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.l0 l0Var = this.f203906d;
            java.util.ArrayList arrayList = l0Var.f203871d.f203955b.f203829a;
            synchronized (arrayList) {
                java.util.Iterator it = arrayList.iterator();
                i17 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i17 = -1;
                        break;
                    }
                    so2.j5 j5Var = (so2.j5) it.next();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1 z1Var = j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1) j5Var : null;
                    if (z1Var != null && z1Var.f204041d) {
                        break;
                    }
                    i17++;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPlayListDrawerBuilder", "checkPlayingHolder index: " + i17 + ", size:" + l0Var.f203871d.f203955b.f203829a.size());
            if (i17 >= 3) {
                r45.vx0 vx0Var = l0Var.f203871d.h().f203818e;
                if ((vx0Var != null ? vx0Var.m75939xb282bd08(4) : 0) - i17 > 2) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList2.add(0);
                    arrayList2.add(java.lang.Integer.valueOf(i17 - 1));
                    java.util.Collections.reverse(arrayList2);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 c15415x74224fd82 = c15415x74224fd8;
                    yj0.a.d(c15415x74224fd82, arrayList2.toArray(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder$checkPlayingHolder$1", "invoke", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                    c15415x74224fd8.P(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue());
                    yj0.a.f(c15415x74224fd82, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder$checkPlayingHolder$1", "invoke", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                } else {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList3.add(java.lang.Integer.valueOf(i17));
                    java.util.Collections.reverse(arrayList3);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 c15415x74224fd83 = c15415x74224fd8;
                    yj0.a.d(c15415x74224fd83, arrayList3.toArray(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder$checkPlayingHolder$1", "invoke", "()V", "Undefined", "scrollToPosition", "(I)V");
                    c15415x74224fd8.mo2420xc593c771(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(c15415x74224fd83, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder$checkPlayingHolder$1", "invoke", "()V", "Undefined", "scrollToPosition", "(I)V");
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
