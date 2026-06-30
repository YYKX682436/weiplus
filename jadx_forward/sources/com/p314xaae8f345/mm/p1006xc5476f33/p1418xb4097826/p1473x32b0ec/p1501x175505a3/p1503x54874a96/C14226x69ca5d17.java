package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\tB+\b\u0016\u0012 \b\u0002\u0010\u0006\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/infrastructure/livedata/DiffMutableLiveData;", "", p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2960xe17f46c3, "Lcom/tencent/mm/plugin/finder/live/infrastructure/livedata/LiveMutableData;", "Lkotlin/Function2;", "", "isSame", "<init>", "(Lyz5/p;)V", "zg2/e", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.infrastructure.livedata.DiffMutableLiveData */
/* loaded from: classes3.dex */
public final class C14226x69ca5d17<T> extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44<T> {

    /* renamed from: e, reason: collision with root package name */
    public yz5.p f193192e;

    public C14226x69ca5d17(yz5.p pVar) {
        this.f193192e = pVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44, p012xc85e97e9.p093xedfae76a.g0
    /* renamed from: observe */
    public void mo7806x9d92d11c(p012xc85e97e9.p093xedfae76a.y owner, p012xc85e97e9.p093xedfae76a.k0 observer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        super.mo7806x9d92d11c(owner, new zg2.e(this, observer));
    }

    @Override // p012xc85e97e9.p093xedfae76a.g0
    /* renamed from: observeForever */
    public void mo7807xc74540ab(p012xc85e97e9.p093xedfae76a.k0 observer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        super.mo7807xc74540ab(new zg2.e(this, observer));
    }

    public /* synthetic */ C14226x69ca5d17(yz5.p pVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i17 & 1) != 0 ? null : pVar);
    }
}
