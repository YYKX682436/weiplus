package jf2;

/* loaded from: classes3.dex */
public final class u extends if2.b implements if2.e {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f380931m;

    /* renamed from: n, reason: collision with root package name */
    public final int f380932n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f380933o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f380934p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f380935q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f380936r;

    /* renamed from: s, reason: collision with root package name */
    public final jf2.w f380937s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f380931m = "LiveAnchorBottomEntranceController";
        this.f380932n = 4;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f380933o = linkedList;
        this.f380934p = new java.util.LinkedList();
        this.f380935q = new java.util.LinkedList();
        this.f380936r = new java.util.LinkedList();
        this.f380937s = new jf2.w(store, linkedList);
    }

    public static void a7(jf2.u uVar, java.lang.String scene, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        uVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(uVar.f380931m, "[calculateFoldedState-" + scene + "], forceRefresh = " + z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(uVar, null, null, new jf2.r(uVar, scene, z17, null), 3, null);
    }

    public final java.lang.String Z6(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(((jf2.h) it.next()).mo58036x368f3a()));
        }
        if (!(!arrayList.isEmpty())) {
            arrayList = null;
        }
        if (arrayList != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                sb6.append(((java.lang.Number) it6.next()).intValue());
                sb6.append("-");
            }
            java.lang.String sb7 = sb6.toString();
            if (sb7 != null) {
                return r26.n0.Z(sb7, "-");
            }
        }
        return "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r4.f() == true) goto L10;
     */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveMsg */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo14867x5aa1c816(r45.r71 r4) {
        /*
            r3 = this;
            super.mo14867x5aa1c816(r4)
            tn0.w0 r4 = r3.Q6()
            r0 = 0
            if (r4 == 0) goto L16
            kn0.p r4 = r4.D
            if (r4 == 0) goto L16
            boolean r4 = r4.f()
            r1 = 1
            if (r4 != r1) goto L16
            goto L17
        L16:
            r1 = r0
        L17:
            if (r1 == 0) goto L1a
            return
        L1a:
            r4 = 2
            r1 = 0
            java.lang.String r2 = "onLiveMsg"
            a7(r3, r2, r0, r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jf2.u.mo14867x5aa1c816(r45.r71):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveStart */
    public void mo14863x39a513b7(r45.hc1 hc1Var) {
        super.mo14863x39a513b7(hc1Var);
        a7(this, "onLiveStart", false, 2, null);
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        this.f380933o.clear();
        this.f380934p.clear();
        this.f380935q.clear();
        this.f380936r.clear();
    }
}
