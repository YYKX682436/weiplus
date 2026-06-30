package my2;

/* loaded from: classes3.dex */
public final class e extends ie2.b {

    /* renamed from: q, reason: collision with root package name */
    public final qo0.c f414257q;

    /* renamed from: r, reason: collision with root package name */
    public my2.a f414258r;

    /* renamed from: s, reason: collision with root package name */
    public final my2.y f414259s;

    /* renamed from: t, reason: collision with root package name */
    public my2.y f414260t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f414257q = statusMonitor;
        android.content.Context context = root.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        this.f414258r = new my2.u(context, S0(), statusMonitor);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a c14179xd6e3454a = this.f372515p;
        android.content.Context context2 = root.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        my2.y yVar = new my2.y(false, root, c14179xd6e3454a, (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context2, this.f414258r);
        this.f414259s = yVar;
        this.f414260t = yVar;
        my2.a aVar = this.f414258r;
        if (aVar != null) {
            ((my2.u) aVar).mo56536x3b13c504(yVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r3 != null ? r3.u() : null, r0) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x014c, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r0 != null ? r0.u() : null, r22.f446856d) == false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b3  */
    @Override // qo0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void C0(java.util.LinkedHashMap r23) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: my2.e.C0(java.util.LinkedHashMap):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void K0(int i17) {
        if (k()) {
            if (v1()) {
                my2.y yVar = this.f414260t;
                android.view.View u17 = yVar != null ? yVar.u() : null;
                if (u17 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Integer.valueOf(i17));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(u17, arrayList.toArray(), "com/tencent/mm/plugin/finder/vote/plugin/FinderLiveVoteBubblePlugin", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    u17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(u17, "com/tencent/mm/plugin/finder/vote/plugin/FinderLiveVoteBubblePlugin", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                this.f194860i = i17;
                return;
            }
            if (((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7()) {
                this.f446856d.setVisibility(8);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveVoteBubblePlugin", "setVisible return for isTeenMode");
                return;
            }
            android.view.View t17 = t1();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(t17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/vote/plugin/FinderLiveVoteBubblePlugin", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            t17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(t17, "com/tencent/mm/plugin/finder/vote/plugin/FinderLiveVoteBubblePlugin", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (i17 == 0) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("type", 1);
                r45.me2 me2Var = ((mm2.c1) P0(mm2.c1.class)).f410317b6;
                jSONObject.put("vote_id", me2Var != null ? me2Var.m75945x2fec8307(5) : null);
                java.lang.String jSONObject2 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                java.lang.String t18 = r26.i0.t(jSONObject2, ",", ";", false);
                i95.m c17 = i95.n0.c(ml2.r0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                ml2.r0.hj((ml2.r0) c17, ml2.b4.E1, t18, 0L, null, null, null, null, null, 252, null);
            }
        }
        super.K0(i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a c14179xd6e3454a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal != 102) {
            if (ordinal != 103) {
                return;
            }
            K0(8);
            my2.y yVar = this.f414260t;
            if (yVar != null) {
                yVar.y();
                return;
            }
            return;
        }
        if (w0() != 0) {
            K0(0);
            my2.y yVar2 = this.f414260t;
            if (yVar2 != null && (c14179xd6e3454a = yVar2.f372514f) != null) {
                c14179xd6e3454a.e();
            }
            my2.y yVar3 = this.f414260t;
            if (yVar3 != null) {
                yVar3.z();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("unMount ");
        sb6.append(hashCode());
        sb6.append(" presenter is empty:");
        sb6.append(this.f414258r == null);
        sb6.append(",viewCallback is empty:");
        sb6.append(this.f414260t == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVoteBubblePlugin", sb6.toString());
        super.O0();
        my2.a aVar = this.f414258r;
        if (aVar != null) {
            ((my2.u) aVar).mo979x3f5eee52();
        }
        my2.y yVar = this.f414260t;
        if (yVar != null) {
            yVar.y();
        }
        K0(8);
        this.f414260t = null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f410334f2 != 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return true;
    }

    public final boolean u1() {
        if (!pm0.v.z(((mm2.c1) P0(mm2.c1.class)).Q1, 131072)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVoteBubblePlugin", "MMFinderGetLiveMsg_LiveExtFlag_DisableVote");
        K0(8);
        return true;
    }

    public final boolean v1() {
        boolean z17;
        xh2.i iVar;
        java.util.LinkedList linkedList;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isCustomMode: isMicMultiOverSize: ");
        sb6.append(((mm2.o4) P0(mm2.o4.class)).A7());
        sb6.append(" audienceSize:  ");
        sb6.append(((mm2.o4) P0(mm2.o4.class)).f410860v.size());
        sb6.append(" micSize: ");
        xh2.c cVar = (xh2.c) ((mm2.o4) P0(mm2.o4.class)).A.mo3195x754a37bb();
        java.lang.Object obj = null;
        sb6.append((cVar == null || (linkedList = cVar.f536064a) == null) ? null : java.lang.Integer.valueOf(linkedList.size()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVoteBubblePlugin", sb6.toString());
        xh2.c cVar2 = (xh2.c) ((mm2.o4) P0(mm2.o4.class)).A.mo3195x754a37bb();
        if (cVar2 != null && cVar2.f536066c == 1) {
            java.util.Iterator it = cVar2.f536064a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((xh2.a) next).b(), ((mm2.e1) P0(mm2.e1.class)).f410520q.f461834n)) {
                    obj = next;
                    break;
                }
            }
            xh2.a aVar = (xh2.a) obj;
            if (aVar != null && (iVar = aVar.f536054b) != null && iVar.f536088g == 2) {
                z17 = true;
                return !z17 ? true : true;
            }
        }
        z17 = false;
        return !z17 ? true : true;
    }

    @Override // qo0.a
    public int w0() {
        android.view.View t17;
        if (!v1()) {
            return t1().getVisibility();
        }
        my2.y yVar = this.f414260t;
        if (yVar == null || (t17 = yVar.u()) == null) {
            t17 = t1();
        }
        return t17.getVisibility();
    }

    public final void w1() {
        if (u1()) {
            return;
        }
        pm0.v.X(new my2.d(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void z0() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mount ");
        sb6.append(hashCode());
        sb6.append(" presenter is empty:");
        sb6.append(this.f414258r == null);
        sb6.append(",viewCallback is empty:");
        sb6.append(this.f414260t == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVoteBubblePlugin", sb6.toString());
        super.z0();
        if (this.f414258r == null || this.f414260t == null) {
            android.content.Context context = this.f446856d.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            this.f414258r = new my2.u(context, S0(), this.f414257q);
            android.view.ViewGroup viewGroup = this.f446856d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a c14179xd6e3454a = this.f372515p;
            android.content.Context context2 = viewGroup.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            this.f414260t = new my2.y(false, viewGroup, c14179xd6e3454a, (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context2, this.f414258r);
        }
        my2.a aVar = this.f414258r;
        if (aVar != null) {
            my2.y yVar = this.f414260t;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(yVar);
            ((my2.u) aVar).mo56536x3b13c504(yVar);
        }
    }
}
