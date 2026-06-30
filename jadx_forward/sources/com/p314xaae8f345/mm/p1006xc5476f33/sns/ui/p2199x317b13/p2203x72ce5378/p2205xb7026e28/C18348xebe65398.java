package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p2203x72ce5378.p2205xb7026e28;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J0\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016R$\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00010\rj\b\u0012\u0004\u0012\u00020\u0001`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/item/improve/handle/ImproveTimelineItemExposeHandle;", "Lcom/tencent/mm/plugin/sns/ui/item/improve/handle/ImproveTimelineItemBizHandle;", "Lcom/tencent/mm/plugin/sns/storage/SnsInfo;", "info", "Landroid/view/View;", "view", "", "oldExposedId", "newExposedId", "", "isExposed", "Ljz5/f0;", "onViewExposed", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "handleList", "Ljava/util/ArrayList;", "<init>", "()V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveTimelineItemExposeHandle */
/* loaded from: classes4.dex */
public final class C18348xebe65398 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p2203x72ce5378.p2205xb7026e28.AbstractC18345x9e6e600f {

    /* renamed from: INSTANCE */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p2203x72ce5378.p2205xb7026e28.C18348xebe65398 f38446x4fbc8495 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p2203x72ce5378.p2205xb7026e28.C18348xebe65398();
    private static final java.util.ArrayList<com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p2203x72ce5378.p2205xb7026e28.AbstractC18345x9e6e600f> handleList;

    static {
        java.util.ArrayList<com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p2203x72ce5378.p2205xb7026e28.AbstractC18345x9e6e600f> arrayList = new java.util.ArrayList<>();
        handleList = arrayList;
        arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p2203x72ce5378.p2205xb7026e28.C18344xf4564695());
        arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p2203x72ce5378.p2205xb7026e28.p2206xb32913c4.C18353xd5fc5bd8());
        arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p2203x72ce5378.p2205xb7026e28.C18349xcd1db389());
        arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p2203x72ce5378.p2205xb7026e28.C18347x821e873c());
    }

    private C18348xebe65398() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p2203x72ce5378.p2205xb7026e28.AbstractC18345x9e6e600f
    /* renamed from: onViewExposed */
    public void mo71120xcdf5f75c(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 info, android.view.View view, long j17, long j18, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onViewExposed", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveTimelineItemExposeHandle");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        java.util.Iterator<T> it = handleList.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p2203x72ce5378.p2205xb7026e28.AbstractC18345x9e6e600f) it.next()).mo71120xcdf5f75c(info, view, j17, j18, z17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onViewExposed", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveTimelineItemExposeHandle");
    }
}
