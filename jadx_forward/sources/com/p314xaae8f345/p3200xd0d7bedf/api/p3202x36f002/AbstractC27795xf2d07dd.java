package com.p314xaae8f345.p3200xd0d7bedf.api.p3202x36f002;

/* renamed from: com.tencent.wework.api.util.OpenDataUtils */
/* loaded from: classes12.dex */
public abstract class AbstractC27795xf2d07dd {
    public static long a(android.content.Context context, java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        try {
            android.net.Uri build = new android.net.Uri.Builder().scheme("content").authority(str2 + ".wwapi").appendPath("bundle").appendQueryParameter("pakage", str).build();
            build.toString();
            android.content.ContentValues contentValues = new android.content.ContentValues();
            android.os.Parcel obtain = android.os.Parcel.obtain();
            bundle.writeToParcel(obtain, 0);
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            contentValues.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, marshall);
            return android.content.ContentUris.parseId(context.getContentResolver().insert(build, contentValues));
        } catch (java.lang.Throwable th6) {
            th6.toString();
            return -1L;
        }
    }
}
