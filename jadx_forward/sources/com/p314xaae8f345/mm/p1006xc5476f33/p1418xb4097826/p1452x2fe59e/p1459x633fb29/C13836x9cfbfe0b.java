package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader$feedChangeListener$1$callback$1 */
/* loaded from: classes2.dex */
public final class C13836x9cfbfe0b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: $contextObj */
    final /* synthetic */ r45.qt2 f35574x7a8fec;

    /* renamed from: $event */
    final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 f35575x4334e8f6;

    /* renamed from: this$0 */
    final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 f35576xcbdd23aa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13836x9cfbfe0b(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 abstractC13834x56f46d28, r45.qt2 qt2Var) {
        super(0);
        this.f35575x4334e8f6 = c5445x963cab3;
        this.f35576xcbdd23aa = abstractC13834x56f46d28;
        this.f35574x7a8fec = qt2Var;
    }

    /* renamed from: invoke$notifyFavChange */
    private static final void m56138x8e74bd36(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 abstractC13834x56f46d28, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, int i17) {
        if (i17 != -1) {
            java.lang.Object obj = abstractC13834x56f46d28.m56387xe6796cde().get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj;
            am.ia iaVar = c5445x963cab3.f135785g;
            int i18 = iaVar.f88454d;
            am.ia iaVar2 = c5445x963cab3.f135785g;
            if (i18 == 1) {
                int i19 = iaVar.f88455e;
                int m59255xbd8ebd19 = abstractC14490x69736cb5.getFeedObject().m59255xbd8ebd19();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(abstractC13834x56f46d28.getF204960d(), "TYPE_FEED_LIKE_CHANGED oldFlag:" + m59255xbd8ebd19 + ", newFlag:" + i19);
                if (m59255xbd8ebd19 != i19) {
                    abstractC14490x69736cb5.getFeedObject().m59386xb8471e25(i19);
                    if (m59255xbd8ebd19 == 0) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject = abstractC14490x69736cb5.getFeedObject();
                        feedObject.m59385x50740976(feedObject.m59254xf4204902() + 1);
                    } else if (i19 == 0) {
                        abstractC14490x69736cb5.getFeedObject().m59385x50740976(r8.m59254xf4204902() - 1);
                    }
                    if (i19 == 1) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject2 = abstractC14490x69736cb5.getFeedObject();
                        feedObject2.m59382x2d5669f8(feedObject2.m59247xf67fd084() + 1);
                        nv2.h1 h1Var = nv2.n1.f422083g;
                        nv2.n1.f422084h.a(abstractC14490x69736cb5.getFeedObject().m59256xbd916e4b());
                    } else if (m59255xbd8ebd19 == 1) {
                        abstractC14490x69736cb5.getFeedObject().m59382x2d5669f8(r2.m59247xf67fd084() - 1);
                        nv2.h1 h1Var2 = nv2.n1.f422083g;
                        nv2.n1.f422084h.o(abstractC14490x69736cb5.getFeedObject().m59256xbd916e4b());
                    }
                    abstractC13834x56f46d28.getDispatcher().c(i17, 1, new jz5.l(java.lang.Integer.valueOf(iaVar2.f88465o ? 45 : 3), 1));
                }
            } else {
                abstractC13834x56f46d28.getDispatcher().c(i17, 1, new jz5.l(java.lang.Integer.valueOf(iaVar2.f88465o ? 45 : 3), 1));
            }
            if (iaVar2.f88461k > 0) {
                abstractC13834x56f46d28.getDispatcher().c(i17, 1, new jz5.l(35, c5445x963cab3));
            }
            c0Var.f391645d = true;
        }
    }

    /* renamed from: invoke$notifyFavChange$5 */
    private static final void m56139xc43a4c47(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 abstractC13834x56f46d28, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, int i18) {
        if (i18 != -1) {
            java.lang.Object obj = abstractC13834x56f46d28.m56387xe6796cde().get(i18);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj;
            int i19 = c5445x963cab3.f135785g.f88454d;
            am.ia iaVar = c5445x963cab3.f135785g;
            if (i19 == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(abstractC13834x56f46d28.getF204960d(), "TYPE_FAV_CHANGED oldFlag = " + abstractC14490x69736cb5.getFeedObject().m59236xfdaf34f1() + ", eventFlag = " + i17);
                if (abstractC14490x69736cb5.getFeedObject().m59236xfdaf34f1() != i17) {
                    abstractC14490x69736cb5.getFeedObject().m59374x71208265(i17);
                }
                if (iaVar.f88467q != -1) {
                    abstractC14490x69736cb5.getFeedObject().m59373xb2c72d36(iaVar.f88467q);
                }
                abstractC13834x56f46d28.getDispatcher().c(i18, 1, new jz5.l(4, 1));
                abstractC13834x56f46d28.getDispatcher().c(i18, 1, new jz5.l(9, 1));
            } else {
                abstractC13834x56f46d28.getDispatcher().c(i18, 1, new jz5.l(4, 1));
                abstractC13834x56f46d28.getDispatcher().c(i18, 1, new jz5.l(9, 1));
            }
            if (iaVar.f88461k > 0) {
                abstractC13834x56f46d28.getDispatcher().c(i18, 1, new jz5.l(35, c5445x963cab3));
            }
            c0Var.f391645d = true;
        }
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ java.lang.Object mo152xb9724478() {
        m56140xb9724478();
        return jz5.f0.f384359a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:707:0x1154, code lost:
    
        if (r0 != false) goto L664;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x036c A[LOOP:4: B:94:0x0334->B:104:0x036c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x036a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0705 A[LOOP:10: B:238:0x06d0->B:250:0x0705, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0703 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0918  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x0efb A[LOOP:24: B:557:0x0ec6->B:569:0x0efb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:570:0x0f00 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:736:0x11bc  */
    /* JADX WARN: Removed duplicated region for block: B:738:0x11d2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02d0 A[LOOP:3: B:72:0x029a->B:82:0x02d0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02ce A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02cb  */
    /* renamed from: invoke */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m56140xb9724478() {
        /*
            Method dump skipped, instructions count: 5134
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13836x9cfbfe0b.m56140xb9724478():void");
    }
}
