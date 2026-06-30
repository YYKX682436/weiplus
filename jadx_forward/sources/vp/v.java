package vp;

/* loaded from: classes16.dex */
public final class v implements java.util.Comparator, java.io.Serializable {
    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        int j17;
        wp.a aVar = (wp.a) obj;
        wp.a aVar2 = (wp.a) obj2;
        java.util.concurrent.atomic.AtomicInteger atomicInteger = wp.a.C;
        if (aVar != aVar2) {
            if (aVar != null) {
                if (aVar2 != null) {
                    if (!aVar.m174282xb2c87fbf(aVar2)) {
                        long j18 = aVar.f529868f - aVar2.f529868f;
                        if (j18 <= 0) {
                            if (j18 >= 0) {
                                int i17 = aVar.f529878p - aVar2.f529878p;
                                if (i17 <= 0) {
                                    if (i17 >= 0) {
                                        int i18 = aVar.f529888z - aVar2.f529888z;
                                        if (i18 <= 0) {
                                            if (i18 >= 0) {
                                                long j19 = aVar.f529865c - aVar2.f529865c;
                                                if (j19 <= 0) {
                                                    if (j19 >= 0 && (j17 = aVar.j() - aVar2.j()) <= 0) {
                                                        if (j17 >= 0) {
                                                            return j17;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return 1;
            }
            return -1;
        }
        return 0;
    }
}
