package com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1;

/* renamed from: com.tencent.thumbplayer.utils.TPOptionalParamObjectChecker */
/* loaded from: classes15.dex */
public class C26575x6ea0c705 {

    /* renamed from: mMapKeyToClass */
    private static final java.util.HashMap<java.lang.Integer, java.lang.Class> f55339x3dffe76d;

    static {
        java.util.HashMap<java.lang.Integer, java.lang.Class> hashMap = new java.util.HashMap<>();
        f55339x3dffe76d = hashMap;
        hashMap.put(414, com.p314xaae8f345.p3006xb8ff1437.api.C26168x7199b3b1.class);
        hashMap.put(507, com.p314xaae8f345.p3006xb8ff1437.api.C26195xfe0f07df.class);
        hashMap.put(140, com.p314xaae8f345.p3006xb8ff1437.api.C26179xe269964a.class);
    }

    /* renamed from: checkObjectType */
    public static boolean m104357x87580641(@com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TPOptionalId int i17, java.lang.Object obj) {
        java.lang.Class cls;
        return (obj == null || (cls = f55339x3dffe76d.get(java.lang.Integer.valueOf(i17))) == null || obj.getClass() != cls) ? false : true;
    }
}
