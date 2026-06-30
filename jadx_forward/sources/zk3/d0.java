package zk3;

/* loaded from: classes8.dex */
public final class d0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f554971d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zk3.g0 f554972e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(java.util.List list, zk3.g0 g0Var) {
        super(0);
        this.f554971d = list;
        this.f554972e = g0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0083, code lost:
    
        if (r1 == false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[LOOP:1: B:24:0x003a->B:37:?, LOOP_END, SYNTHETIC] */
    @Override // yz5.a
    /* renamed from: invoke */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo152xb9724478() {
        /*
            r11 = this;
            java.util.List r0 = r11.f554971d
            int r1 = r0.size()
            zk3.g0 r2 = r11.f554972e
            java.util.ArrayList r3 = r2.f554985g
            int r3 = r3.size()
            r4 = 1
            r5 = 0
            if (r1 != r3) goto L86
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L19
            goto L6f
        L19:
            java.util.Iterator r1 = r0.iterator()
        L1d:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L6f
            java.lang.Object r3 = r1.next()
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo r3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c) r3
            java.util.ArrayList r6 = r2.f554985g
            boolean r7 = r6 instanceof java.util.Collection
            if (r7 == 0) goto L36
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L36
            goto L69
        L36:
            java.util.Iterator r6 = r6.iterator()
        L3a:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L69
            java.lang.Object r7 = r6.next()
            uk3.a r7 = (uk3.a) r7
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo r8 = r7.f510057d
            java.lang.String r8 = r8.f66791xc8a07680
            java.lang.String r9 = r3.f66791xc8a07680
            boolean r8 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r8, r9)
            if (r8 == 0) goto L64
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo r7 = r7.f510057d
            int r8 = r7.f66793x2262335f
            int r9 = r3.f66793x2262335f
            if (r8 != r9) goto L64
            long r7 = r7.f66794xa783a79b
            long r9 = r3.f66794xa783a79b
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 != 0) goto L64
            r7 = r4
            goto L65
        L64:
            r7 = r5
        L65:
            if (r7 == 0) goto L3a
            r3 = r4
            goto L6a
        L69:
            r3 = r5
        L6a:
            r3 = r3 ^ r4
            if (r3 == 0) goto L1d
            r1 = r4
            goto L70
        L6f:
            r1 = r5
        L70:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r6 = "refreshData needRefreshData: "
            r3.<init>(r6)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.lang.String r6 = "MicroMsg.MultiTask.MultiTaskMinusScreenUIC"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r6, r3)
            if (r1 != 0) goto L86
            goto L9e
        L86:
            zk3.g0.V6(r2, r0, r5, r5, r5)
            com.tencent.mm.autogen.events.NotifyMulitTaskIconShowEvent r1 = new com.tencent.mm.autogen.events.NotifyMulitTaskIconShowEvent
            r1.<init>()
            int r0 = r0.size()
            if (r0 != 0) goto L95
            r5 = r4
        L95:
            r0 = r5 ^ 1
            am.tl r2 = r1.f136081g
            r2.f89551a = r0
            r1.e()
        L9e:
            jz5.f0 r0 = jz5.f0.f384359a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zk3.d0.mo152xb9724478():java.lang.Object");
    }
}
