package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.pk.p1509xbeeb310a;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/mic/pk/factory/FinderLiveVisitorLinkConvertFactory;", "Lin5/s;", "Lcom/tencent/mm/plugin/finder/convert/z2;", "createFinderEmptyConvert", "", "type", "Lin5/r;", "getItemConvert", "Lgk2/e;", "liveData", "Lgk2/e;", "getLiveData", "()Lgk2/e;", "Lsi2/c;", "callback", "Lsi2/c;", "getCallback", "()Lsi2/c;", "<init>", "(Lgk2/e;Lsi2/c;)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.mic.pk.factory.FinderLiveVisitorLinkConvertFactory */
/* loaded from: classes10.dex */
public final class C14241x3314254d implements in5.s {
    private final si2.c callback;
    private final gk2.e liveData;

    public C14241x3314254d(gk2.e liveData, si2.c callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.liveData = liveData;
        this.callback = callback;
    }

    /* renamed from: createFinderEmptyConvert */
    private final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.z2 m56852xdc866908() {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("RecyclerViewAdapterEx", "type invalid", new java.lang.Object[0]);
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.z2();
    }

    public final si2.c getCallback() {
        return this.callback;
    }

    @Override // in5.s
    /* renamed from: getItemConvert */
    public in5.r mo43555xf2bb75ea(int type) {
        return type == 1 ? new ti2.o(this.liveData, this.callback) : type == 2 ? new ti2.p(this.liveData, this.callback) : type == 3 ? new ti2.q(this.liveData, this.callback) : type == 4 ? new ti2.l(this.liveData, this.callback) : type == -10000 ? new ti2.h() : type == 5 ? new ti2.g(this.liveData, this.callback) : m56852xdc866908();
    }

    public final gk2.e getLiveData() {
        return this.liveData;
    }
}
