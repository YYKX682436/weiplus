package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53;

/* renamed from: com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.NonHierarchicalDistanceBasedAlgorithm */
/* loaded from: classes13.dex */
public class C26114xe1bbf3c7<T extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26110x1f5a1c0d> implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.InterfaceC26112x84e2d44f<T> {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.i f296982a = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.i(1.0d);

    /* renamed from: b, reason: collision with root package name */
    public android.content.Context f296983b;

    /* renamed from: d, reason: collision with root package name */
    public int f296985d;

    /* renamed from: c, reason: collision with root package name */
    public int f296984c = 35;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Collection<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.C26114xe1bbf3c7.QuadItem<T>> f296986e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.j<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.C26114xe1bbf3c7.QuadItem<T>> f296987f = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.j<>(0.0d, 1.0d, 0.0d, 1.0d);

    /* renamed from: com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.NonHierarchicalDistanceBasedAlgorithm$QuadItem */
    /* loaded from: classes13.dex */
    public static class QuadItem<T extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26110x1f5a1c0d> implements com.tencent.tencentmap.mapsdk.vector.compat.utils.a.j.a, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26109x9733a9da<T> {

        /* renamed from: a, reason: collision with root package name */
        public final T f296988a;

        /* renamed from: b, reason: collision with root package name */
        public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.h f296989b;

        /* renamed from: c, reason: collision with root package name */
        public final com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 f296990c;

        /* renamed from: d, reason: collision with root package name */
        public java.util.Set<T> f296991d;

        /* renamed from: equals */
        public boolean m100162xb2c87fbf(java.lang.Object obj) {
            if (obj instanceof com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.C26114xe1bbf3c7.QuadItem) {
                return ((com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.C26114xe1bbf3c7.QuadItem) obj).f296988a.equals(this.f296988a);
            }
            return false;
        }

        @Override // com.tencent.tencentmap.mapsdk.vector.compat.utils.a.j.a
        /* renamed from: getPoint */
        public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.h mo100096x74fbfbda() {
            return this.f296989b;
        }

        @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26109x9733a9da
        /* renamed from: getPosition */
        public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 mo100119xa86cd69f() {
            return this.f296990c;
        }

        @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26109x9733a9da
        /* renamed from: getSize */
        public int mo100120xfb854877() {
            return 1;
        }

        /* renamed from: hashCode */
        public int m100163x8cdac1b() {
            return this.f296988a.hashCode();
        }

        public QuadItem(T t17) {
            this.f296988a = t17;
            com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 mo100121xa86cd69f = t17.mo100121xa86cd69f();
            this.f296990c = mo100121xa86cd69f;
            this.f296989b = com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.C26114xe1bbf3c7.f296982a.a(mo100121xa86cd69f);
            this.f296991d = java.util.Collections.singleton(t17);
        }

        @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26109x9733a9da
        /* renamed from: getItems */
        public java.util.Set<T> mo100118x749b8e0a() {
            return this.f296991d;
        }
    }

    public C26114xe1bbf3c7(android.content.Context context) {
        android.content.Context applicationContext = context.getApplicationContext();
        this.f296983b = applicationContext;
        this.f296985d = (int) ((applicationContext.getResources().getDisplayMetrics().density * this.f296984c) + 0.5f);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.InterfaceC26112x84e2d44f
    /* renamed from: addItem */
    public void mo100153xbb852f54(T t17) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.C26114xe1bbf3c7.QuadItem<T> quadItem = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.C26114xe1bbf3c7.QuadItem<>(t17);
        synchronized (this.f296987f) {
            this.f296986e.add(quadItem);
            this.f296987f.a((com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.j<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.C26114xe1bbf3c7.QuadItem<T>>) quadItem);
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.InterfaceC26112x84e2d44f
    /* renamed from: addItems */
    public void mo100154xb520bb9f(java.util.Collection<T> collection) {
        java.util.Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            mo100153xbb852f54(it.next());
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.InterfaceC26112x84e2d44f
    /* renamed from: clearItems */
    public void mo100155xd31c2973() {
        synchronized (this.f296987f) {
            this.f296986e.clear();
            this.f296987f.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.InterfaceC26112x84e2d44f
    /* renamed from: getClusters */
    public java.util.Set<? extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26109x9733a9da<T>> mo100156xc7416b2f(double d17) {
        int i17 = 1;
        double pow = (this.f296985d / java.lang.Math.pow(2.0d, ((int) d17) + 1)) / 256.0d;
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashSet hashSet2 = new java.util.HashSet();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        synchronized (this.f296987f) {
            for (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.C26114xe1bbf3c7.QuadItem<T> quadItem : this.f296986e) {
                if (!hashSet.contains(quadItem)) {
                    java.util.Collection<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.C26114xe1bbf3c7.QuadItem<T>> a17 = this.f296987f.a(a(quadItem.mo100096x74fbfbda(), pow));
                    if (a17.size() == i17) {
                        hashSet2.add(quadItem);
                        hashSet.add(quadItem);
                        hashMap.put(quadItem, java.lang.Double.valueOf(0.0d));
                    } else {
                        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.C26116x8042938c c26116x8042938c = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.C26116x8042938c(quadItem.f296988a.mo100121xa86cd69f());
                        hashSet2.add(c26116x8042938c);
                        for (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.C26114xe1bbf3c7.QuadItem<T> quadItem2 : a17) {
                            java.lang.Double d18 = (java.lang.Double) hashMap.get(quadItem2);
                            double d19 = pow;
                            double a18 = a(quadItem2.mo100096x74fbfbda(), quadItem.mo100096x74fbfbda());
                            if (d18 != null) {
                                if (d18.doubleValue() < a18) {
                                    pow = d19;
                                } else {
                                    ((com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.C26116x8042938c) hashMap2.get(quadItem2)).m100166xc84af884(quadItem2.f296988a);
                                }
                            }
                            hashMap.put(quadItem2, java.lang.Double.valueOf(a18));
                            c26116x8042938c.add(quadItem2.f296988a);
                            hashMap2.put(quadItem2, c26116x8042938c);
                            pow = d19;
                        }
                        hashSet.addAll(a17);
                        pow = pow;
                        i17 = 1;
                    }
                }
            }
        }
        return hashSet2;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.InterfaceC26112x84e2d44f
    /* renamed from: getItems */
    public java.util.Collection<T> mo100157x749b8e0a() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        synchronized (this.f296987f) {
            java.util.Iterator<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.C26114xe1bbf3c7.QuadItem<T>> it = this.f296986e.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().f296988a);
            }
        }
        return arrayList;
    }

    /* renamed from: getMaxDistanceAtZoom */
    public int m100160xc759f8c9() {
        return this.f296984c;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.InterfaceC26112x84e2d44f
    /* renamed from: removeItem */
    public void mo100158x417605b7(T t17) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.C26114xe1bbf3c7.QuadItem<T> quadItem = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.C26114xe1bbf3c7.QuadItem<>(t17);
        synchronized (this.f296987f) {
            this.f296986e.remove(quadItem);
            this.f296987f.b(quadItem);
        }
    }

    /* renamed from: setMaxDistanceAtZoom */
    public void m100161xa2f0053d(int i17) {
        this.f296984c = i17;
        this.f296985d = (int) ((this.f296983b.getResources().getDisplayMetrics().density * this.f296984c) + 0.5f);
    }

    public final double a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.h hVar, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.h hVar2) {
        double d17 = hVar.f296930a - hVar2.f296930a;
        double d18 = hVar.f296931b - hVar2.f296931b;
        return (d17 * d17) + (d18 * d18);
    }

    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.g a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.h hVar, double d17) {
        double d18 = d17 / 2.0d;
        double d19 = hVar.f296930a;
        double d27 = d19 - d18;
        double d28 = d19 + d18;
        double d29 = hVar.f296931b;
        return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.g(d27, d28, d29 - d18, d29 + d18);
    }
}
