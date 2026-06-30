package com.tencent.maas.utils;

/* loaded from: classes12.dex */
public class MaasSDKResolverUtils {
    private static final java.util.concurrent.ConcurrentHashMap<com.tencent.maas.model.MJLocation, java.lang.String> locationHashMap = new java.util.concurrent.ConcurrentHashMap<>();

    public static java.lang.String formatTimestamp(long j17, java.lang.String str, java.lang.String str2) {
        return com.tencent.maas.utils.MaasSDKTimestampUtils.INSTANCE.formatTimestamp(j17, str, str2);
    }

    public static java.lang.String[] getCities(final android.content.Context context, final java.lang.Object[] objArr, long j17) {
        if (context == null || objArr == null || objArr.length == 0) {
            return null;
        }
        java.util.concurrent.ExecutorService newSingleThreadExecutor = java.util.concurrent.Executors.newSingleThreadExecutor();
        try {
            newSingleThreadExecutor.submit(new java.util.concurrent.Callable() { // from class: wg.a$$a
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    java.lang.Boolean lambda$getCities$0;
                    lambda$getCities$0 = com.tencent.maas.utils.MaasSDKResolverUtils.lambda$getCities$0(objArr, context);
                    return lambda$getCities$0;
                }
            }).get(j17, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.Exception unused) {
        }
        newSingleThreadExecutor.shutdown();
        java.lang.String[] strArr = new java.lang.String[objArr.length];
        for (int i17 = 0; i17 < objArr.length; i17++) {
            java.util.concurrent.ConcurrentHashMap<com.tencent.maas.model.MJLocation, java.lang.String> concurrentHashMap = locationHashMap;
            if (concurrentHashMap.containsKey((com.tencent.maas.model.MJLocation) objArr[i17])) {
                strArr[i17] = concurrentHashMap.get((com.tencent.maas.model.MJLocation) objArr[i17]);
            } else {
                strArr[i17] = null;
            }
        }
        return strArr;
    }

    private static java.lang.String getCity(android.content.Context context, double d17, double d18) {
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
    public static /* synthetic */ java.lang.Boolean lambda$getCities$0(java.lang.Object[] objArr, android.content.Context context) {
        for (java.lang.Object obj : objArr) {
            com.tencent.maas.model.MJLocation mJLocation = (com.tencent.maas.model.MJLocation) obj;
            java.util.concurrent.ConcurrentHashMap<com.tencent.maas.model.MJLocation, java.lang.String> concurrentHashMap = locationHashMap;
            if (!concurrentHashMap.containsKey(mJLocation)) {
                concurrentHashMap.put(mJLocation, getCity(context, mJLocation.getLongitude(), mJLocation.getLatitude()));
            }
        }
        return java.lang.Boolean.TRUE;
    }
}
