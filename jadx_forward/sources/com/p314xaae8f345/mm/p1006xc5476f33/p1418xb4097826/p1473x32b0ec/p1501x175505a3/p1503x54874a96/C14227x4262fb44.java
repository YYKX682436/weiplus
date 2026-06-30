package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/infrastructure/livedata/LiveMutableData;", p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2960xe17f46c3, "Landroidx/lifecycle/j0;", "Landroidx/lifecycle/v;", "<init>", "()V", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData */
/* loaded from: classes3.dex */
public class C14227x4262fb44<T> extends p012xc85e97e9.p093xedfae76a.j0 implements p012xc85e97e9.p093xedfae76a.v {

    /* renamed from: d, reason: collision with root package name */
    public boolean f193193d = true;

    @Override // p012xc85e97e9.p093xedfae76a.g0
    /* renamed from: observe */
    public void mo7806x9d92d11c(p012xc85e97e9.p093xedfae76a.y owner, p012xc85e97e9.p093xedfae76a.k0 observer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        owner.mo273xed6858b4().a(this);
        super.mo7806x9d92d11c(owner, new zg2.g(this, observer));
    }

    @Override // p012xc85e97e9.p093xedfae76a.v
    /* renamed from: onStateChanged */
    public void mo2520xaba1ac62(p012xc85e97e9.p093xedfae76a.y source, p012xc85e97e9.p093xedfae76a.m event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (zg2.f.f554359a[event.ordinal()] == 1) {
            this.f193193d = true;
            source.mo273xed6858b4().c(this);
        }
    }

    @Override // p012xc85e97e9.p093xedfae76a.j0, p012xc85e97e9.p093xedfae76a.g0
    /* renamed from: setValue */
    public void mo523x53d8522f(java.lang.Object obj) {
        this.f193193d = false;
        super.mo523x53d8522f(obj);
    }
}
