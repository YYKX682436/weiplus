package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p1544xb227c704;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveKTVReplayFactory;", "Lin5/s;", "", "type", "Lin5/r;", "getItemConvert", "Lvm2/f;", "callback", "Lvm2/f;", "getCallback", "()Lvm2/f;", "<init>", "(Lvm2/f;)V", "Companion", "vm2/h", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.widget.adapters.FinderLiveKTVReplayFactory */
/* loaded from: classes10.dex */
public final class C14418xb72cfa68 implements in5.s {

    /* renamed from: Companion */
    public static final vm2.h f35908x233c02ec = new vm2.h(null);

    /* renamed from: FINDER_LIVE_KTV_REPLAY_HEADER */
    public static final int f35909x962fe8d9 = 1;

    /* renamed from: FINDER_LIVE_KTV_REPLAY_ITEM */
    public static final int f35910x3ec2a85f = 2;
    private final vm2.f callback;

    public C14418xb72cfa68(vm2.f callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.callback = callback;
    }

    public final vm2.f getCallback() {
        return this.callback;
    }

    @Override // in5.s
    /* renamed from: getItemConvert */
    public in5.r mo43555xf2bb75ea(int type) {
        return type != 1 ? type != 2 ? new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.z2() : new vm2.m(this.callback) : new vm2.j(this.callback);
    }
}
