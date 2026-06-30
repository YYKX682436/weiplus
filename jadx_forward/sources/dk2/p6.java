package dk2;

/* loaded from: classes3.dex */
public final class p6 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.nw1 f315436a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f315437b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f315438c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f315439d;

    public p6(r45.nw1 nw1Var, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, android.content.Context context, r45.qt2 qt2Var) {
        this.f315436a = nw1Var;
        this.f315437b = c19792x256d2725;
        this.f315438c = context;
        this.f315439d = qt2Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        int i18 = fVar.f152149b;
        r45.nw1 nw1Var = this.f315436a;
        if (i17 == 0 && i18 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveFeedFlowReporter", "[reportJoinLiveOnFeedFlow] success, liveid = " + nw1Var.m75942xfb822ef2(0));
            long j17 = dk2.u6.f315713j;
            r45.nw1 nw1Var2 = (r45.nw1) ((r45.hc1) fVar.f152151d).m75936x14adae67(3);
            if (j17 != (nw1Var2 != null ? nw1Var2.m75942xfb822ef2(0) : -1L)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[jonLiveInternal]， return 。enterLiveId = ");
                sb6.append(dk2.u6.f315713j);
                sb6.append(", joinLiveId = ");
                r45.nw1 nw1Var3 = (r45.nw1) ((r45.hc1) fVar.f152151d).m75936x14adae67(3);
                sb6.append(nw1Var3 != null ? nw1Var3.m75942xfb822ef2(0) : -1L);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveFeedFlowReporter", sb6.toString());
                dk2.u6 u6Var = dk2.u6.f315704a;
                dk2.u6.f315710g = null;
                dk2.u6.f315711h = null;
                dk2.u6.f315709f = 0L;
                dk2.u6.f315713j = 0L;
                dk2.u6.f315712i = null;
            } else {
                r45.nw1 nw1Var4 = (r45.nw1) ((r45.hc1) fVar.f152151d).m75936x14adae67(3);
                dk2.u6.f315709f = nw1Var4 != null ? nw1Var4.m75942xfb822ef2(0) : -1L;
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = this.f315437b;
                dk2.u6.f315710g = c19792x256d2725;
                dk2.u6 u6Var2 = dk2.u6.f315704a;
                android.content.Context context = this.f315438c;
                com.p314xaae8f345.mm.p2495xc50a8b8b.f resp = fVar.f152151d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resp, "resp");
                u6Var2.b(context, c19792x256d2725, (r45.hc1) resp, this.f315439d, 0L, false, null);
                u6Var2.d((r45.hc1) fVar.f152151d, this.f315437b);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveFeedFlowReporter", "[reportJoinLiveOnFeedFlow] failed, liveid = " + nw1Var.m75942xfb822ef2(0) + ", errCode = " + i18);
        }
        return jz5.f0.f384359a;
    }
}
