package com.tencent.mm.open_voice_control;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/open_voice_control/OVCInfoProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "d41/f", "open-voice-control-impl_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class OVCInfoProvider extends android.content.ContentProvider {

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f72223d;

    static {
        new d41.f(null);
        f72223d = jz5.h.b(d41.e.f226382d);
    }

    public final android.database.MatrixCursor a(int i17) {
        android.database.MatrixCursor matrixCursor = new android.database.MatrixCursor(new java.lang.String[]{com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_CODE});
        matrixCursor.addRow(new java.lang.Integer[]{java.lang.Integer.valueOf(i17)});
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        kotlin.jvm.internal.o.g(uri, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri uri) {
        d41.i iVar;
        kotlin.jvm.internal.o.g(uri, "uri");
        int match = ((android.content.UriMatcher) ((jz5.n) f72223d).getValue()).match(uri);
        d41.i.f226384d.getClass();
        d41.i[] values = d41.i.values();
        int length = values.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                iVar = null;
                break;
            }
            iVar = values[i17];
            iVar.getClass();
            if (1 == match) {
                break;
            }
            i17++;
        }
        if (iVar != null) {
            return "vnd.android.cursor.item/vnd.com.tencent.mm.open_voice_control.info.check_version";
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        kotlin.jvm.internal.o.g(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        boolean z17;
        d41.i iVar;
        kotlin.jvm.internal.o.g(uri, "uri");
        int match = ((android.content.UriMatcher) ((jz5.n) f72223d).getValue()).match(uri);
        d41.i.f226384d.getClass();
        d41.i[] values = d41.i.values();
        int length = values.length;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            z17 = true;
            if (i18 >= length) {
                iVar = null;
                break;
            }
            iVar = values[i18];
            iVar.getClass();
            if (1 == match) {
                break;
            }
            i18++;
        }
        int i19 = iVar == null ? -1 : d41.g.f226383a[iVar.ordinal()];
        if (i19 == -1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OVCInfoProvider", "Unknown URI: " + uri + " (matchCode=" + match + ')');
            return null;
        }
        if (i19 != 1) {
            throw new jz5.j();
        }
        java.lang.String queryParameter = uri.getQueryParameter("sdk_version");
        if (queryParameter != null && queryParameter.length() != 0) {
            z17 = false;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OVCInfoProvider", "Missing sdk_version parameter");
            return a(11);
        }
        java.lang.Integer h17 = r26.h0.h(queryParameter);
        if (h17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OVCInfoProvider", "Invalid sdk_version format: ".concat(queryParameter));
            return a(11);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkVersion: sdkVersion=0x");
        int intValue = h17.intValue();
        r26.a.a(16);
        java.lang.String num = java.lang.Integer.toString(intValue, 16);
        kotlin.jvm.internal.o.f(num, "toString(...)");
        sb6.append(num);
        sb6.append(", minSupported=0x");
        r26.a.a(16);
        java.lang.String num2 = java.lang.Integer.toString(131072, 16);
        kotlin.jvm.internal.o.f(num2, "toString(...)");
        sb6.append(num2);
        sb6.append(", maxSupported=0x");
        r26.a.a(16);
        java.lang.String num3 = java.lang.Integer.toString(196607, 16);
        kotlin.jvm.internal.o.f(num3, "toString(...)");
        sb6.append(num3);
        com.tencent.mars.xlog.Log.i("MicroMsg.OVCInfoProvider", sb6.toString());
        if (h17.intValue() < 131072) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("SDK version too low: 0x");
            int intValue2 = h17.intValue();
            r26.a.a(16);
            java.lang.String num4 = java.lang.Integer.toString(intValue2, 16);
            kotlin.jvm.internal.o.f(num4, "toString(...)");
            sb7.append(num4);
            sb7.append(" < 0x");
            r26.a.a(16);
            java.lang.String num5 = java.lang.Integer.toString(131072, 16);
            kotlin.jvm.internal.o.f(num5, "toString(...)");
            sb7.append(num5);
            com.tencent.mars.xlog.Log.e("MicroMsg.OVCInfoProvider", sb7.toString());
            i17 = 7;
        } else if (h17.intValue() > 196607) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("WeChat version too low: SDK 0x");
            int intValue3 = h17.intValue();
            r26.a.a(16);
            java.lang.String num6 = java.lang.Integer.toString(intValue3, 16);
            kotlin.jvm.internal.o.f(num6, "toString(...)");
            sb8.append(num6);
            sb8.append(" > 0x");
            r26.a.a(16);
            java.lang.String num7 = java.lang.Integer.toString(196607, 16);
            kotlin.jvm.internal.o.f(num7, "toString(...)");
            sb8.append(num7);
            com.tencent.mars.xlog.Log.e("MicroMsg.OVCInfoProvider", sb8.toString());
            i17 = 6;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.OVCInfoProvider", "Version check passed");
        }
        return a(i17);
    }

    @Override // android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        kotlin.jvm.internal.o.g(uri, "uri");
        return 0;
    }
}
