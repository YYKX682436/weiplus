package com.tencent.maas.moviecomposing;

/* loaded from: classes5.dex */
public class TimelineMutation {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.moviecomposing.SegmentMutation[] f48417a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.maas.moviecomposing.SegmentMutation[] f48418b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.maas.moviecomposing.SegmentMutation[] f48419c;

    private TimelineMutation(java.lang.Object[] objArr, java.lang.Object[] objArr2, java.lang.Object[] objArr3) {
        this.f48417a = a(objArr);
        this.f48418b = a(objArr2);
        this.f48419c = a(objArr3);
    }

    public final com.tencent.maas.moviecomposing.SegmentMutation[] a(java.lang.Object[] objArr) {
        if (objArr == null) {
            return new com.tencent.maas.moviecomposing.SegmentMutation[0];
        }
        com.tencent.maas.moviecomposing.SegmentMutation[] segmentMutationArr = new com.tencent.maas.moviecomposing.SegmentMutation[objArr.length];
        for (int i17 = 0; i17 < objArr.length; i17++) {
            segmentMutationArr[i17] = (com.tencent.maas.moviecomposing.SegmentMutation) objArr[i17];
        }
        return segmentMutationArr;
    }
}
