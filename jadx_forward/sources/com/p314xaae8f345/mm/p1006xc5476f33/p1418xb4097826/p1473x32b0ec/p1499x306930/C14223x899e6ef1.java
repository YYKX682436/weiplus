package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1499x306930;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/gift/FinderLiveChooseGiftFactory;", "Lin5/s;", "", "type", "Lin5/r;", "getItemConvert", "Lcom/tencent/mm/plugin/finder/live/plugin/hm;", "plugin", "Lcom/tencent/mm/plugin/finder/live/plugin/hm;", "getPlugin", "()Lcom/tencent/mm/plugin/finder/live/plugin/hm;", "Lkotlin/Function1;", "Lcom/tencent/mm/plugin/finder/live/plugin/lj;", "Ljz5/f0;", "bottomSheetClickListener", "Lyz5/l;", "getBottomSheetClickListener", "()Lyz5/l;", "<init>", "(Lcom/tencent/mm/plugin/finder/live/plugin/hm;Lyz5/l;)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.gift.FinderLiveChooseGiftFactory */
/* loaded from: classes3.dex */
public final class C14223x899e6ef1 implements in5.s {
    private final yz5.l bottomSheetClickListener;
    private final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm plugin;

    public C14223x899e6ef1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm plugin, yz5.l bottomSheetClickListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(plugin, "plugin");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bottomSheetClickListener, "bottomSheetClickListener");
        this.plugin = plugin;
        this.bottomSheetClickListener = bottomSheetClickListener;
    }

    public final yz5.l getBottomSheetClickListener() {
        return this.bottomSheetClickListener;
    }

    @Override // in5.s
    /* renamed from: getItemConvert */
    public in5.r mo43555xf2bb75ea(int type) {
        return new tg2.b(this.plugin, this.bottomSheetClickListener);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm getPlugin() {
        return this.plugin;
    }
}
