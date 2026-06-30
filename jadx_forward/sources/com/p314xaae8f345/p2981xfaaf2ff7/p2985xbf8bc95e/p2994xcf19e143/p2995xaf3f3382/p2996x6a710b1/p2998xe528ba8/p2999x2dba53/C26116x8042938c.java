package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53;

/* renamed from: com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.StaticCluster */
/* loaded from: classes13.dex */
public class C26116x8042938c<T extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26110x1f5a1c0d> implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26109x9733a9da<T> {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 f296997a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List<T> f296998b = new java.util.ArrayList();

    public C26116x8042938c(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d26) {
        this.f296997a = c4406x873d1d26;
    }

    public boolean add(T t17) {
        return this.f296998b.add(t17);
    }

    /* renamed from: equals */
    public boolean m100165xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.C26116x8042938c)) {
            return false;
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.C26116x8042938c c26116x8042938c = (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.C26116x8042938c) obj;
        return c26116x8042938c.f296997a.m37194xb2c87fbf(this.f296997a) && c26116x8042938c.f296998b.equals(this.f296998b);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26109x9733a9da
    /* renamed from: getItems */
    public java.util.Collection<T> mo100118x749b8e0a() {
        return this.f296998b;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26109x9733a9da
    /* renamed from: getPosition */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 mo100119xa86cd69f() {
        return this.f296997a;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26109x9733a9da
    /* renamed from: getSize */
    public int mo100120xfb854877() {
        return this.f296998b.size();
    }

    /* renamed from: remove */
    public boolean m100166xc84af884(T t17) {
        return this.f296998b.remove(t17);
    }

    /* renamed from: toString */
    public java.lang.String m100167x9616526c() {
        return "StaticCluster{mCenter=" + this.f296997a + ", mItems.size=" + this.f296998b.size() + '}';
    }
}
