package com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2932x5c71cfd8.p2933xe7814c81;

/* renamed from: com.tencent.shadow.core.runtime.container.HostContentProviderDelegate */
/* loaded from: classes16.dex */
public interface InterfaceC25521x12851a47 {
    /* renamed from: bulkInsert */
    int m95486xb9736a6b(android.net.Uri uri, android.content.ContentValues[] contentValuesArr);

    /* renamed from: call */
    android.os.Bundle m95487x2e7a5e(java.lang.String str, java.lang.String str2, android.os.Bundle bundle);

    /* renamed from: delete */
    int m95488xb06685ab(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr);

    /* renamed from: getType */
    java.lang.String m95489xfb85f7b0(android.net.Uri uri);

    /* renamed from: insert */
    android.net.Uri m95490xb970c2b9(android.net.Uri uri, android.content.ContentValues contentValues);

    /* renamed from: onConfigurationChanged */
    void m95491x50e1c15d(android.content.res.Configuration configuration);

    /* renamed from: onCreate */
    boolean m95492x3e5a77bb();

    /* renamed from: onLowMemory */
    void m95493xb5d8ba56();

    /* renamed from: onTrimMemory */
    void m95494x29685b02(int i17);

    /* renamed from: openFile */
    android.os.ParcelFileDescriptor m95495xe1e55ae6(android.net.Uri uri, java.lang.String str);

    /* renamed from: openFile */
    android.os.ParcelFileDescriptor m95496xe1e55ae6(android.net.Uri uri, java.lang.String str, android.os.CancellationSignal cancellationSignal);

    /* renamed from: query */
    android.database.Cursor m95497x66f18c8(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2);

    /* renamed from: update */
    int m95498xce0038c9(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr);
}
