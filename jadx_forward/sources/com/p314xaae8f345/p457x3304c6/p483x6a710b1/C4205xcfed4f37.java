package com.p314xaae8f345.p457x3304c6.p483x6a710b1;

/* renamed from: com.tencent.maas.utils.MaasSDKResolverUtils */
/* loaded from: classes12.dex */
public class C4205xcfed4f37 {

    /* renamed from: locationHashMap */
    private static final java.util.concurrent.ConcurrentHashMap<com.p314xaae8f345.p457x3304c6.p477x633fb29.C4113xcb092072, java.lang.String> f16174x21affbf9 = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: formatTimestamp */
    public static java.lang.String m34710xd03d56df(long j17, java.lang.String str, java.lang.String str2) {
        return com.p314xaae8f345.p457x3304c6.p483x6a710b1.C4206xb643bbcf.f16175x4fbc8495.m34720xd03d56df(j17, str, str2);
    }

    /* renamed from: getCities */
    public static java.lang.String[] m34711x1404de3f(final android.content.Context context, final java.lang.Object[] objArr, long j17) {
        if (context == null || objArr == null || objArr.length == 0) {
            return null;
        }
        java.util.concurrent.ExecutorService newSingleThreadExecutor = java.util.concurrent.Executors.newSingleThreadExecutor();
        try {
            newSingleThreadExecutor.submit(new java.util.concurrent.Callable() { // from class: wg.a$$a
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    java.lang.Boolean m34713xc48c71ae;
                    m34713xc48c71ae = com.p314xaae8f345.p457x3304c6.p483x6a710b1.C4205xcfed4f37.m34713xc48c71ae(objArr, context);
                    return m34713xc48c71ae;
                }
            }).get(j17, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.Exception unused) {
        }
        newSingleThreadExecutor.shutdown();
        java.lang.String[] strArr = new java.lang.String[objArr.length];
        for (int i17 = 0; i17 < objArr.length; i17++) {
            java.util.concurrent.ConcurrentHashMap<com.p314xaae8f345.p457x3304c6.p477x633fb29.C4113xcb092072, java.lang.String> concurrentHashMap = f16174x21affbf9;
            if (concurrentHashMap.containsKey((com.p314xaae8f345.p457x3304c6.p477x633fb29.C4113xcb092072) objArr[i17])) {
                strArr[i17] = concurrentHashMap.get((com.p314xaae8f345.p457x3304c6.p477x633fb29.C4113xcb092072) objArr[i17]);
            } else {
                strArr[i17] = null;
            }
        }
        return strArr;
    }

    /* renamed from: getCity */
    private static java.lang.String m34712xfb7e01e1(android.content.Context context, double d17, double d18) {
        try {
            java.util.List<android.location.Address> fromLocation = new android.location.Geocoder(context, java.util.Locale.getDefault()).getFromLocation(d18, d17, 1);
            if (fromLocation.size() > 0) {
                return fromLocation.get(0).getLocality();
            }
            return null;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getCities$0 */
    public static /* synthetic */ java.lang.Boolean m34713xc48c71ae(java.lang.Object[] objArr, android.content.Context context) {
        for (java.lang.Object obj : objArr) {
            com.p314xaae8f345.p457x3304c6.p477x633fb29.C4113xcb092072 c4113xcb092072 = (com.p314xaae8f345.p457x3304c6.p477x633fb29.C4113xcb092072) obj;
            java.util.concurrent.ConcurrentHashMap<com.p314xaae8f345.p457x3304c6.p477x633fb29.C4113xcb092072, java.lang.String> concurrentHashMap = f16174x21affbf9;
            if (!concurrentHashMap.containsKey(c4113xcb092072)) {
                concurrentHashMap.put(c4113xcb092072, m34712xfb7e01e1(context, c4113xcb092072.m33842x79d7af9(), c4113xcb092072.m33841x2605e9e2()));
            }
        }
        return java.lang.Boolean.TRUE;
    }
}
