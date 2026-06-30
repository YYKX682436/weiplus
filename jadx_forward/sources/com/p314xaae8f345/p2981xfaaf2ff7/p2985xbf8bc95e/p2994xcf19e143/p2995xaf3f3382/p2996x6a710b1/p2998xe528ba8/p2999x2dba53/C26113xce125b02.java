package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53;

/* renamed from: com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.GridBasedAlgorithm */
/* loaded from: classes13.dex */
public class C26113xce125b02<T extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26110x1f5a1c0d> implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.InterfaceC26112x84e2d44f<T> {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Set<T> f296981a = java.util.Collections.synchronizedSet(new java.util.HashSet());

    public static long a(long j17, double d17, double d18) {
        return (long) ((j17 * java.lang.Math.floor(d17)) + java.lang.Math.floor(d18));
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.InterfaceC26112x84e2d44f
    /* renamed from: addItem */
    public void mo100153xbb852f54(T t17) {
        this.f296981a.add(t17);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.InterfaceC26112x84e2d44f
    /* renamed from: addItems */
    public void mo100154xb520bb9f(java.util.Collection<T> collection) {
        this.f296981a.addAll(collection);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.InterfaceC26112x84e2d44f
    /* renamed from: clearItems */
    public void mo100155xd31c2973() {
        this.f296981a.clear();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.InterfaceC26112x84e2d44f
    /* renamed from: getClusters */
    public java.util.Set<? extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26109x9733a9da<T>> mo100156xc7416b2f(double d17) {
        long j17;
        long ceil = (long) java.lang.Math.ceil((java.lang.Math.pow(2.0d, d17) * 256.0d) / 100.0d);
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.i iVar = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.i(ceil);
        java.util.HashSet hashSet = new java.util.HashSet();
        android.util.LongSparseArray longSparseArray = new android.util.LongSparseArray();
        synchronized (this.f296981a) {
            for (T t17 : this.f296981a) {
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.h a17 = iVar.a(t17.mo100121xa86cd69f());
                long a18 = a(ceil, a17.f296930a, a17.f296931b);
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.C26116x8042938c c26116x8042938c = (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.C26116x8042938c) longSparseArray.get(a18);
                if (c26116x8042938c == null) {
                    j17 = ceil;
                    c26116x8042938c = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.C26116x8042938c(iVar.a(new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.h(java.lang.Math.floor(a17.f296930a) + 0.5d, java.lang.Math.floor(a17.f296931b) + 0.5d)));
                    longSparseArray.put(a18, c26116x8042938c);
                    hashSet.add(c26116x8042938c);
                } else {
                    j17 = ceil;
                }
                c26116x8042938c.add(t17);
                ceil = j17;
            }
        }
        return hashSet;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.InterfaceC26112x84e2d44f
    /* renamed from: getItems */
    public java.util.Collection<T> mo100157x749b8e0a() {
        return this.f296981a;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.InterfaceC26112x84e2d44f
    /* renamed from: removeItem */
    public void mo100158x417605b7(T t17) {
        this.f296981a.remove(t17);
    }
}
