package com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437;

/* renamed from: com.tencent.thumbplayer.adapter.player.thumbplayer.TPDrmCapability */
/* loaded from: classes13.dex */
public class C26149x86b35afb {

    /* renamed from: DRM_CAPABILITY_LIST_KEY */
    private static final java.lang.String f50201xa31837a5 = "DRM_CAPABILITY_LIST";

    /* renamed from: DRM_SP_NAME */
    private static final java.lang.String f50202xa5f2d46d = "TP_DRM_CAPABILITY";
    private static final java.lang.String TAG = "TPDrmCapability";

    /* renamed from: mDrmCapabilities */
    private static java.util.Set<java.lang.String> f50204xbd11a2c8 = new java.util.HashSet();

    /* renamed from: mDrmBlacklist */
    private static java.util.Set<java.lang.String> f50203xb0fcbf4b = new java.util.HashSet();

    /* renamed from: addDRMBlacklist */
    public static synchronized void m100715x6f630d7f(@com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TP_DRM_TYPE int i17) {
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26149x86b35afb.class) {
            if (i17 == -1) {
                return;
            }
            f50203xb0fcbf4b.add(java.lang.String.valueOf(i17));
            f50204xbd11a2c8.removeAll(f50203xb0fcbf4b);
        }
    }

    /* renamed from: getDRMCapabilities */
    public static synchronized int[] m100716xc5ab40bf() {
        int[] iArr;
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26149x86b35afb.class) {
            iArr = new int[f50204xbd11a2c8.size()];
            java.util.Iterator<java.lang.String> it = f50204xbd11a2c8.iterator();
            int i17 = 0;
            while (it.hasNext()) {
                int i18 = i17 + 1;
                iArr[i17] = com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26565x9aa4e96a.m104281xc3ca103c(it.next(), -1);
                i17 = i18;
            }
        }
        return iArr;
    }

    /* renamed from: getDRMCapabilitiesAsync */
    private static void m100717x8d1470fd(final android.content.SharedPreferences sharedPreferences) {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26581x3df100e2.m104405x9cf0d20b().m104413x137f2902().execute(new java.lang.Runnable() { // from class: com.tencent.thumbplayer.adapter.player.thumbplayer.TPDrmCapability.1
            @Override // java.lang.Runnable
            public void run() {
                int[] iArr = new int[0];
                try {
                    iArr = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26331xd6902921.m101978xc5ab40bf();
                } catch (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26317x5f5ce5a7 e17) {
                    com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26149x86b35afb.TAG, e17);
                }
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26149x86b35afb.TAG, "TPThumbPlayerCapabilityHelper, DRM capability:" + java.util.Arrays.toString(iArr));
                if (iArr.length == 0) {
                    return;
                }
                java.util.HashSet hashSet = new java.util.HashSet();
                for (int i17 : iArr) {
                    hashSet.add(java.lang.String.valueOf(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26161xb0ecee32.m100888xae234a19(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.MapDrmType.class, i17)));
                }
                android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putStringSet(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26149x86b35afb.f50201xa31837a5, hashSet);
                edit.apply();
                synchronized (com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26149x86b35afb.class) {
                    java.util.Set unused = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26149x86b35afb.f50204xbd11a2c8 = hashSet;
                    com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26149x86b35afb.f50204xbd11a2c8.removeAll(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26149x86b35afb.f50203xb0fcbf4b);
                }
            }
        });
    }

    /* renamed from: init */
    public static synchronized void m100718x316510(android.content.Context context) {
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26149x86b35afb.class) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "TPDrmCapability, init");
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "TPDrmCapability, get shared preferences.");
            android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(f50202xa5f2d46d, 0);
            try {
                f50204xbd11a2c8 = sharedPreferences.getStringSet(f50201xa31837a5, f50204xbd11a2c8);
            } catch (java.lang.ClassCastException e17) {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e17);
            }
            f50204xbd11a2c8.removeAll(f50203xb0fcbf4b);
            m100717x8d1470fd(sharedPreferences);
        }
    }

    /* renamed from: isDRMSupport */
    public static synchronized boolean m100719x9f6c51fa(@com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TP_DRM_TYPE int i17) {
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26149x86b35afb.class) {
            if (i17 == -1) {
                return false;
            }
            java.util.Iterator<java.lang.String> it = f50204xbd11a2c8.iterator();
            while (it.hasNext()) {
                if (com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26565x9aa4e96a.m104281xc3ca103c(it.next(), -1) == i17) {
                    return true;
                }
            }
            return false;
        }
    }
}
