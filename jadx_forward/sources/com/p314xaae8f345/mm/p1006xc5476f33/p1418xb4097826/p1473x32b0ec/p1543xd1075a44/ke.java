package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class ke extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.se f200368d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ke(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.se seVar) {
        super(0);
        this.f200368d = seVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0093, code lost:
    
        if (r4.f374097q == true) goto L13;
     */
    @Override // yz5.a
    /* renamed from: invoke */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo152xb9724478() {
        /*
            r11 = this;
            com.tencent.mm.plugin.finder.live.widget.se r0 = r11.f200368d
            android.view.View r9 = r0.f201286a
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.lang.ThreadLocal r1 = zj0.c.f554818a
            r1 = 8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r10.add(r1)
            java.util.Collections.reverse(r10)
            java.lang.Object[] r2 = r10.toArray()
            java.lang.String r3 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveExceptionWidget$hide$1"
            java.lang.String r4 = "invoke"
            java.lang.String r5 = "()V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r1 = r9
            yj0.a.d(r1, r2, r3, r4, r5, r6, r7, r8)
            r8 = 0
            java.lang.Object r1 = r10.get(r8)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r9.setVisibility(r1)
            java.lang.String r2 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveExceptionWidget$hide$1"
            java.lang.String r3 = "invoke"
            java.lang.String r4 = "()V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            r1 = r9
            yj0.a.f(r1, r2, r3, r4, r5, r6, r7)
            int r1 = r0.f201304s
            r2 = 5
            if (r1 != r2) goto Lef
            java.lang.Class<ml2.r0> r1 = ml2.r0.class
            i95.m r1 = i95.n0.c(r1)
            ml2.r0 r1 = (ml2.r0) r1
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r0.f201307v
            long r2 = r2 - r4
            r1.getClass()
            com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastPageOutStruct r0 = new com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastPageOutStruct
            r0.<init>()
            java.lang.Class<n30.r> r1 = n30.r.class
            i95.m r1 = i95.n0.c(r1)
            n30.r r1 = (n30.r) r1
            m30.m r1 = (m30.m) r1
            r1.getClass()
            java.lang.String r1 = b52.b.b()
            if (r1 != 0) goto L7a
            java.lang.String r1 = ""
        L7a:
            r0.q(r1)
            java.lang.String r1 = "174"
            r0.r(r1)
            r0.p(r1)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            im2.t6 r4 = ml2.s0.a()
            if (r4 == 0) goto L96
            boolean r4 = r4.f374097q
            r5 = 1
            if (r4 != r5) goto L96
            goto L97
        L96:
            r5 = r8
        L97:
            java.lang.String r4 = "is_scan"
            r1.put(r4, r5)
            java.lang.String r4 = "stayTime"
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.put(r4, r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "toString(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r2)
            java.lang.String r2 = ","
            java.lang.String r3 = ";"
            java.lang.String r1 = r26.i0.t(r1, r2, r3, r8)
            r0.s(r1)
            r0.k()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "report22947, contextid = "
            r1.<init>(r2)
            java.lang.String r2 = r0.f138103i
            r1.append(r2)
            java.lang.String r2 = ", page_id = "
            r1.append(r2)
            java.lang.String r2 = r0.f138099e
            r1.append(r2)
            java.lang.String r2 = ", commentScene = "
            r1.append(r2)
            java.lang.String r2 = r0.f138107m
            r1.append(r2)
            java.lang.String r2 = ", pg_udf_kv = "
            r1.append(r2)
            java.lang.String r0 = r0.f138106l
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "HABBYGE-MALI.HellLiveVisitorReoprter"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
        Lef:
            jz5.f0 r0 = jz5.f0.f384359a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ke.mo152xb9724478():java.lang.Object");
    }
}
