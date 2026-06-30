package so2;

/* loaded from: classes2.dex */
public final class a2 extends in5.w implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final so2.t f491780d;

    /* renamed from: e, reason: collision with root package name */
    public final so2.w4 f491781e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f491782f;

    /* renamed from: g, reason: collision with root package name */
    public final so2.f5 f491783g;

    /* renamed from: h, reason: collision with root package name */
    public final so2.s4 f491784h;

    /* renamed from: i, reason: collision with root package name */
    public final so2.u4 f491785i;

    public a2(so2.t msgNotifyData, so2.w4 privateMsgNotifyData, java.util.concurrent.ConcurrentLinkedQueue commentFailedNotifyDataList, so2.f5 f5Var, so2.s4 s4Var, so2.u4 u4Var, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        so2.f5 friendTabLikeTipsState = (i17 & 8) != 0 ? new so2.f5(0, -1, null, 4, null) : f5Var;
        so2.s4 finderPopupTips = (i17 & 16) != 0 ? new so2.s4(null, null, null, null, 15, null) : s4Var;
        so2.u4 postRemindData = (i17 & 32) != 0 ? new so2.u4(null, 0L, null, 0, 0L, null, 63, null) : u4Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgNotifyData, "msgNotifyData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(privateMsgNotifyData, "privateMsgNotifyData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentFailedNotifyDataList, "commentFailedNotifyDataList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(friendTabLikeTipsState, "friendTabLikeTipsState");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderPopupTips, "finderPopupTips");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(postRemindData, "postRemindData");
        this.f491780d = msgNotifyData;
        this.f491781e = privateMsgNotifyData;
        this.f491782f = commentFailedNotifyDataList;
        this.f491783g = friendTabLikeTipsState;
        this.f491784h = finderPopupTips;
        this.f491785i = postRemindData;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        return Integer.MAX_VALUE;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return 2019;
    }
}
