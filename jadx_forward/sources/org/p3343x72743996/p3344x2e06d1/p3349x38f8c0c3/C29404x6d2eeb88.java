package org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.chromium.base.metrics.CachingUmaRecorder */
/* loaded from: classes16.dex */
public final class C29404x6d2eeb88 implements org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.InterfaceC29416x7559a087 {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f73510x7118e671 = false;

    /* renamed from: MAX_HISTOGRAM_COUNT */
    private static final int f73511xddc44139 = 256;

    /* renamed from: MAX_USER_ACTION_COUNT */
    static final int f73512x6b743f5f = 256;
    private static final java.lang.String TAG = "CachingUmaRecorder";

    /* renamed from: mDelegate */
    private org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.InterfaceC29416x7559a087 f73513x55d38512;

    /* renamed from: mDroppedUserActionCount */
    private int f73515xdbd6189b;

    /* renamed from: mUserActionCallbacksForTesting */
    private java.util.List<org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465<java.lang.String>> f73518xa4fa9767;

    /* renamed from: mRwLock */
    private final java.util.concurrent.locks.ReentrantReadWriteLock f73517x18a5c3dd = new java.util.concurrent.locks.ReentrantReadWriteLock(false);

    /* renamed from: mHistogramByName */
    private java.util.Map<java.lang.String, org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29404x6d2eeb88.Histogram> f73516xcf1a79d9 = new java.util.HashMap();

    /* renamed from: mDroppedHistogramSampleCount */
    private java.util.concurrent.atomic.AtomicInteger f73514x919fccb4 = new java.util.concurrent.atomic.AtomicInteger();

    /* renamed from: mUserActions */
    private java.util.List<org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29404x6d2eeb88.UserAction> f73519x52cf3c05 = new java.util.ArrayList();

    /* renamed from: org.chromium.base.metrics.CachingUmaRecorder$Histogram */
    /* loaded from: classes16.dex */
    public static class Histogram {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f73520x7118e671 = false;

        /* renamed from: MAX_SAMPLE_COUNT */
        static final int f73521xab6f2d35 = 256;

        /* renamed from: mMax */
        private final int f73522x32b9b7;

        /* renamed from: mMin */
        private final int f73523x32baa5;

        /* renamed from: mName */
        private final java.lang.String f73524x624f098;

        /* renamed from: mNumBuckets */
        private final int f73525x428ef5b0;

        /* renamed from: mSamples */
        private final java.util.List<java.lang.Integer> f73526xd3ff2dc = new java.util.ArrayList(1);

        /* renamed from: mType */
        private final int f73527x6280547;

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        /* renamed from: org.chromium.base.metrics.CachingUmaRecorder$Histogram$Type */
        /* loaded from: classes6.dex */
        public @interface Type {

            /* renamed from: BOOLEAN */
            public static final int f73528x2ea6f808 = 1;

            /* renamed from: EXPONENTIAL */
            public static final int f73529x17197d25 = 2;

            /* renamed from: LINEAR */
            public static final int f73530x85d98325 = 3;

            /* renamed from: SPARSE */
            public static final int f73531x92285e20 = 4;
        }

        public Histogram(int i17, java.lang.String str, int i18, int i19, int i27) {
            this.f73527x6280547 = i17;
            this.f73524x624f098 = str;
            this.f73523x32baa5 = i18;
            this.f73522x32b9b7 = i19;
            this.f73525x428ef5b0 = i27;
        }

        /* renamed from: addSample */
        public synchronized boolean m152900xfeff1dab(int i17, java.lang.String str, int i18, int i19, int i27, int i28) {
            if (this.f73526xd3ff2dc.size() >= 256) {
                return false;
            }
            this.f73526xd3ff2dc.add(java.lang.Integer.valueOf(i18));
            return true;
        }

        /* renamed from: flushTo */
        public synchronized int m152901xd2ad949f(org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.InterfaceC29416x7559a087 interfaceC29416x7559a087) {
            int size;
            int i17 = this.f73527x6280547;
            int i18 = 0;
            if (i17 == 1) {
                for (int i19 = 0; i19 < this.f73526xd3ff2dc.size(); i19++) {
                    interfaceC29416x7559a087.mo152893xa16fd08d(this.f73524x624f098, this.f73526xd3ff2dc.get(i19).intValue() != 0);
                }
            } else if (i17 == 2) {
                while (i18 < this.f73526xd3ff2dc.size()) {
                    interfaceC29416x7559a087.mo152894x3de52390(this.f73524x624f098, this.f73526xd3ff2dc.get(i18).intValue(), this.f73523x32baa5, this.f73522x32b9b7, this.f73525x428ef5b0);
                    i18++;
                }
            } else if (i17 == 3) {
                while (i18 < this.f73526xd3ff2dc.size()) {
                    interfaceC29416x7559a087.mo152895xb3dbcb2e(this.f73524x624f098, this.f73526xd3ff2dc.get(i18).intValue(), this.f73523x32baa5, this.f73522x32b9b7, this.f73525x428ef5b0);
                    i18++;
                }
            } else if (i17 == 4) {
                while (i18 < this.f73526xd3ff2dc.size()) {
                    interfaceC29416x7559a087.mo152896xada41a93(this.f73524x624f098, this.f73526xd3ff2dc.get(i18).intValue());
                    i18++;
                }
            }
            size = this.f73526xd3ff2dc.size();
            this.f73526xd3ff2dc.clear();
            return size;
        }
    }

    /* renamed from: org.chromium.base.metrics.CachingUmaRecorder$UserAction */
    /* loaded from: classes16.dex */
    public static class UserAction {

        /* renamed from: mElapsedRealtimeMillis */
        private final long f73532xf858d1c0;

        /* renamed from: mName */
        private final java.lang.String f73533x624f098;

        public UserAction(java.lang.String str, long j17) {
            this.f73533x624f098 = str;
            this.f73532xf858d1c0 = j17;
        }

        /* renamed from: flushTo */
        public void m152902xd2ad949f(org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.InterfaceC29416x7559a087 interfaceC29416x7559a087) {
            interfaceC29416x7559a087.mo152897xf69de912(this.f73533x624f098, this.f73532xf858d1c0);
        }
    }

    /* renamed from: cacheHistogramSampleAlreadyWriteLocked */
    private void m152882x900201bd(int i17, java.lang.String str, int i18, int i19, int i27, int i28) {
        org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29404x6d2eeb88.Histogram histogram = this.f73516xcf1a79d9.get(str);
        if (histogram == null) {
            if (this.f73516xcf1a79d9.size() >= 256) {
                this.f73514x919fccb4.incrementAndGet();
                return;
            } else {
                org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29404x6d2eeb88.Histogram histogram2 = new org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29404x6d2eeb88.Histogram(i17, str, i19, i27, i28);
                this.f73516xcf1a79d9.put(str, histogram2);
                histogram = histogram2;
            }
        }
        if (histogram.m152900xfeff1dab(i17, str, i18, i19, i27, i28)) {
            return;
        }
        this.f73514x919fccb4.incrementAndGet();
    }

    /* renamed from: cacheOrRecordHistogramSample */
    private void m152883x950a7b98(int i17, java.lang.String str, int i18, int i19, int i27, int i28) {
        if (m152888x7e8f22f3(i17, str, i18, i19, i27, i28)) {
            return;
        }
        this.f73517x18a5c3dd.writeLock().lock();
        try {
            if (this.f73513x55d38512 == null) {
                m152882x900201bd(i17, str, i18, i19, i27, i28);
                return;
            }
            this.f73517x18a5c3dd.readLock().lock();
            try {
                m152886x6bff9ce5(i17, str, i18, i19, i27, i28);
            } finally {
                this.f73517x18a5c3dd.readLock().unlock();
            }
        } finally {
            this.f73517x18a5c3dd.writeLock().unlock();
        }
    }

    /* renamed from: flushHistogramsAlreadyLocked */
    private void m152884x8d3e2a8f(java.util.Map<java.lang.String, org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29404x6d2eeb88.Histogram> map, int i17) {
        int size = map.size();
        java.util.Iterator<org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29404x6d2eeb88.Histogram> it = map.values().iterator();
        int i18 = 0;
        while (it.hasNext()) {
            i18 += it.next().m152901xd2ad949f(this.f73513x55d38512);
        }
        org.p3343x72743996.p3344x2e06d1.Log.i(TAG, "Flushed %d samples from %d histograms, %d samples were dropped.", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(i17));
    }

    /* renamed from: flushUserActionsAlreadyLocked */
    private void m152885xa19f3714(java.util.List<org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29404x6d2eeb88.UserAction> list, int i17) {
        java.util.Iterator<org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29404x6d2eeb88.UserAction> it = list.iterator();
        while (it.hasNext()) {
            it.next().m152902xd2ad949f(this.f73513x55d38512);
        }
        org.p3343x72743996.p3344x2e06d1.Log.i(TAG, "Flushed %d user action samples, %d samples were dropped.", java.lang.Integer.valueOf(list.size()), java.lang.Integer.valueOf(i17));
    }

    /* renamed from: recordHistogramSampleAlreadyLocked */
    private void m152886x6bff9ce5(int i17, java.lang.String str, int i18, int i19, int i27, int i28) {
        if (i17 == 1) {
            this.f73513x55d38512.mo152893xa16fd08d(str, i18 != 0);
            return;
        }
        if (i17 == 2) {
            this.f73513x55d38512.mo152894x3de52390(str, i18, i19, i27, i28);
            return;
        }
        if (i17 == 3) {
            this.f73513x55d38512.mo152895xb3dbcb2e(str, i18, i19, i27, i28);
        } else if (i17 == 4) {
            this.f73513x55d38512.mo152896xada41a93(str, i18);
        } else {
            throw new java.lang.UnsupportedOperationException("Unknown histogram type " + i17);
        }
    }

    /* renamed from: swapUserActionCallbacksForTesting */
    private void m152887x698ba001(org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.InterfaceC29416x7559a087 interfaceC29416x7559a087, org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.InterfaceC29416x7559a087 interfaceC29416x7559a0872) {
        if (this.f73518xa4fa9767 == null) {
            return;
        }
        for (int i17 = 0; i17 < this.f73518xa4fa9767.size(); i17++) {
            if (interfaceC29416x7559a087 != null) {
                interfaceC29416x7559a087.mo152898xf7287991(this.f73518xa4fa9767.get(i17));
            }
            if (interfaceC29416x7559a0872 != null) {
                interfaceC29416x7559a0872.mo152889xc22bdc2e(this.f73518xa4fa9767.get(i17));
            }
        }
    }

    /* renamed from: tryAppendOrRecordSample */
    private boolean m152888x7e8f22f3(int i17, java.lang.String str, int i18, int i19, int i27, int i28) {
        this.f73517x18a5c3dd.readLock().lock();
        try {
            if (this.f73513x55d38512 != null) {
                m152886x6bff9ce5(i17, str, i18, i19, i27, i28);
            } else {
                org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29404x6d2eeb88.Histogram histogram = this.f73516xcf1a79d9.get(str);
                if (histogram == null) {
                    this.f73517x18a5c3dd.readLock().unlock();
                    return false;
                }
                if (!histogram.m152900xfeff1dab(i17, str, i18, i19, i27, i28)) {
                    this.f73514x919fccb4.incrementAndGet();
                }
            }
            return true;
        } finally {
            this.f73517x18a5c3dd.readLock().unlock();
        }
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.InterfaceC29416x7559a087
    /* renamed from: addUserActionCallbackForTesting */
    public void mo152889xc22bdc2e(org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465<java.lang.String> interfaceC29287xf9968465) {
        this.f73517x18a5c3dd.writeLock().lock();
        try {
            if (this.f73518xa4fa9767 == null) {
                this.f73518xa4fa9767 = new java.util.ArrayList();
            }
            this.f73518xa4fa9767.add(interfaceC29287xf9968465);
            org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.InterfaceC29416x7559a087 interfaceC29416x7559a087 = this.f73513x55d38512;
            if (interfaceC29416x7559a087 != null) {
                interfaceC29416x7559a087.mo152889xc22bdc2e(interfaceC29287xf9968465);
            }
        } finally {
            this.f73517x18a5c3dd.writeLock().unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.List<org.chromium.base.metrics.HistogramBucket>] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.List] */
    @Override // org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.InterfaceC29416x7559a087
    /* renamed from: getHistogramSamplesForTesting */
    public java.util.List<org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29405xc3d0544e> mo152890xfa151ce2(java.lang.String str) {
        java.lang.Integer[] numArr;
        ?? arrayList;
        this.f73517x18a5c3dd.readLock().lock();
        try {
            org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.InterfaceC29416x7559a087 interfaceC29416x7559a087 = this.f73513x55d38512;
            if (interfaceC29416x7559a087 != null) {
                arrayList = interfaceC29416x7559a087.mo152890xfa151ce2(str);
            } else {
                org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29404x6d2eeb88.Histogram histogram = this.f73516xcf1a79d9.get(str);
                if (histogram == null) {
                    arrayList = java.util.Collections.emptyList();
                } else {
                    synchronized (histogram) {
                        numArr = (java.lang.Integer[]) histogram.f73526xd3ff2dc.toArray(new java.lang.Integer[0]);
                    }
                    java.util.Arrays.sort(numArr);
                    arrayList = new java.util.ArrayList();
                    int i17 = 0;
                    while (i17 < numArr.length) {
                        int intValue = numArr[i17].intValue();
                        int i18 = 0;
                        do {
                            i18++;
                            i17++;
                            if (i17 < numArr.length) {
                            }
                            arrayList.add(new org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29405xc3d0544e(intValue, intValue + 1, i18));
                        } while (numArr[i17].intValue() == intValue);
                        arrayList.add(new org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29405xc3d0544e(intValue, intValue + 1, i18));
                    }
                }
            }
            return arrayList;
        } finally {
            this.f73517x18a5c3dd.readLock().unlock();
        }
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.InterfaceC29416x7559a087
    /* renamed from: getHistogramTotalCountForTesting */
    public int mo152891x4ed4f60(java.lang.String str) {
        int size;
        this.f73517x18a5c3dd.readLock().lock();
        try {
            org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.InterfaceC29416x7559a087 interfaceC29416x7559a087 = this.f73513x55d38512;
            if (interfaceC29416x7559a087 != null) {
                return interfaceC29416x7559a087.mo152891x4ed4f60(str);
            }
            org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29404x6d2eeb88.Histogram histogram = this.f73516xcf1a79d9.get(str);
            if (histogram == null) {
                this.f73517x18a5c3dd.readLock().unlock();
                return 0;
            }
            synchronized (histogram) {
                size = histogram.f73526xd3ff2dc.size();
            }
            return size;
        } finally {
            this.f73517x18a5c3dd.readLock().unlock();
        }
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.InterfaceC29416x7559a087
    /* renamed from: getHistogramValueCountForTesting */
    public int mo152892x9298d993(java.lang.String str, int i17) {
        int i18;
        this.f73517x18a5c3dd.readLock().lock();
        try {
            org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.InterfaceC29416x7559a087 interfaceC29416x7559a087 = this.f73513x55d38512;
            if (interfaceC29416x7559a087 != null) {
                return interfaceC29416x7559a087.mo152892x9298d993(str, i17);
            }
            org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29404x6d2eeb88.Histogram histogram = this.f73516xcf1a79d9.get(str);
            if (histogram == null) {
                return 0;
            }
            synchronized (histogram) {
                i18 = 0;
                for (int i19 = 0; i19 < histogram.f73526xd3ff2dc.size(); i19++) {
                    if (((java.lang.Integer) histogram.f73526xd3ff2dc.get(i19)).intValue() == i17) {
                        i18++;
                    }
                }
            }
            return i18;
        } finally {
            this.f73517x18a5c3dd.readLock().unlock();
        }
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.InterfaceC29416x7559a087
    /* renamed from: recordBooleanHistogram */
    public void mo152893xa16fd08d(java.lang.String str, boolean z17) {
        m152883x950a7b98(1, str, z17 ? 1 : 0, 0, 0, 0);
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.InterfaceC29416x7559a087
    /* renamed from: recordExponentialHistogram */
    public void mo152894x3de52390(java.lang.String str, int i17, int i18, int i19, int i27) {
        m152883x950a7b98(2, str, i17, i18, i19, i27);
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.InterfaceC29416x7559a087
    /* renamed from: recordLinearHistogram */
    public void mo152895xb3dbcb2e(java.lang.String str, int i17, int i18, int i19, int i27) {
        m152883x950a7b98(3, str, i17, i18, i19, i27);
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.InterfaceC29416x7559a087
    /* renamed from: recordSparseHistogram */
    public void mo152896xada41a93(java.lang.String str, int i17) {
        m152883x950a7b98(4, str, i17, 0, 0, 0);
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.InterfaceC29416x7559a087
    /* renamed from: recordUserAction */
    public void mo152897xf69de912(java.lang.String str, long j17) {
        this.f73517x18a5c3dd.readLock().lock();
        try {
            org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.InterfaceC29416x7559a087 interfaceC29416x7559a087 = this.f73513x55d38512;
            if (interfaceC29416x7559a087 != null) {
                interfaceC29416x7559a087.mo152897xf69de912(str, j17);
                return;
            }
            this.f73517x18a5c3dd.readLock().unlock();
            this.f73517x18a5c3dd.writeLock().lock();
            try {
                if (this.f73513x55d38512 != null) {
                    this.f73517x18a5c3dd.readLock().lock();
                    try {
                        this.f73513x55d38512.mo152897xf69de912(str, j17);
                        return;
                    } finally {
                    }
                }
                if (this.f73519x52cf3c05.size() < 256) {
                    this.f73519x52cf3c05.add(new org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29404x6d2eeb88.UserAction(str, j17));
                } else {
                    this.f73515xdbd6189b++;
                }
                if (this.f73518xa4fa9767 != null) {
                    for (int i17 = 0; i17 < this.f73518xa4fa9767.size(); i17++) {
                        this.f73518xa4fa9767.get(i17).m152269xd7b79106(str);
                    }
                }
            } finally {
                this.f73517x18a5c3dd.writeLock().unlock();
            }
        } finally {
        }
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.InterfaceC29416x7559a087
    /* renamed from: removeUserActionCallbackForTesting */
    public void mo152898xf7287991(org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465<java.lang.String> interfaceC29287xf9968465) {
        this.f73517x18a5c3dd.writeLock().lock();
        try {
            java.util.List<org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465<java.lang.String>> list = this.f73518xa4fa9767;
            if (list == null) {
                return;
            }
            list.remove(interfaceC29287xf9968465);
            org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.InterfaceC29416x7559a087 interfaceC29416x7559a087 = this.f73513x55d38512;
            if (interfaceC29416x7559a087 != null) {
                interfaceC29416x7559a087.mo152898xf7287991(interfaceC29287xf9968465);
            }
        } finally {
            this.f73517x18a5c3dd.writeLock().unlock();
        }
    }

    /* renamed from: setDelegate */
    public org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.InterfaceC29416x7559a087 m152899xa7687c07(org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.InterfaceC29416x7559a087 interfaceC29416x7559a087) {
        java.util.Map<java.lang.String, org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29404x6d2eeb88.Histogram> map;
        int i17;
        this.f73517x18a5c3dd.writeLock().lock();
        try {
            org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.InterfaceC29416x7559a087 interfaceC29416x7559a0872 = this.f73513x55d38512;
            this.f73513x55d38512 = interfaceC29416x7559a087;
            if (org.p3343x72743996.p3353x59bc66e.C29454xce2ad330.f73672xfa59bddd) {
                m152887x698ba001(interfaceC29416x7559a0872, interfaceC29416x7559a087);
            }
            if (interfaceC29416x7559a087 == null) {
                return interfaceC29416x7559a0872;
            }
            java.util.List<org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29404x6d2eeb88.UserAction> list = null;
            int i18 = 0;
            if (this.f73516xcf1a79d9.isEmpty()) {
                map = null;
                i17 = 0;
            } else {
                map = this.f73516xcf1a79d9;
                this.f73516xcf1a79d9 = new java.util.HashMap();
                i17 = this.f73514x919fccb4.getAndSet(0);
            }
            if (!this.f73519x52cf3c05.isEmpty()) {
                list = this.f73519x52cf3c05;
                this.f73519x52cf3c05 = new java.util.ArrayList();
                int i19 = this.f73515xdbd6189b;
                this.f73515xdbd6189b = 0;
                i18 = i19;
            }
            this.f73517x18a5c3dd.readLock().lock();
            if (map != null) {
                try {
                    m152884x8d3e2a8f(map, i17);
                } catch (java.lang.Throwable th6) {
                    this.f73517x18a5c3dd.readLock().unlock();
                    throw th6;
                }
            }
            if (list != null) {
                m152885xa19f3714(list, i18);
            }
            this.f73517x18a5c3dd.readLock().unlock();
            return interfaceC29416x7559a0872;
        } finally {
            this.f73517x18a5c3dd.writeLock().unlock();
        }
    }
}
