package com.p314xaae8f345.mm.p980x69aca1b;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/open_voice_control/OVCInfoProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "d41/f", "open-voice-control-impl_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.open_voice_control.OVCInfoProvider */
/* loaded from: classes12.dex */
public final class C11197x9b5cce1b extends android.content.ContentProvider {

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f153756d;

    static {
        new d41.f(null);
        f153756d = jz5.h.b(d41.e.f307915d);
    }

    public final android.database.MatrixCursor a(int i17) {
        android.database.MatrixCursor matrixCursor = new android.database.MatrixCursor(new java.lang.String[]{com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61547x802b75e4});
        matrixCursor.addRow(new java.lang.Integer[]{java.lang.Integer.valueOf(i17)});
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uri, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri uri) {
        d41.i iVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uri, "uri");
        int match = ((android.content.UriMatcher) ((jz5.n) f153756d).mo141623x754a37bb()).match(uri);
        d41.i.f307917d.getClass();
        d41.i[] m123486xcee59d22 = d41.i.m123486xcee59d22();
        int length = m123486xcee59d22.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                iVar = null;
                break;
            }
            iVar = m123486xcee59d22[i17];
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uri, "uri");
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uri, "uri");
        int match = ((android.content.UriMatcher) ((jz5.n) f153756d).mo141623x754a37bb()).match(uri);
        d41.i.f307917d.getClass();
        d41.i[] m123486xcee59d22 = d41.i.m123486xcee59d22();
        int length = m123486xcee59d22.length;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            z17 = true;
            if (i18 >= length) {
                iVar = null;
                break;
            }
            iVar = m123486xcee59d22[i18];
            iVar.getClass();
            if (1 == match) {
                break;
            }
            i18++;
        }
        int i19 = iVar == null ? -1 : d41.g.f307916a[iVar.ordinal()];
        if (i19 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OVCInfoProvider", "Unknown URI: " + uri + " (matchCode=" + match + ')');
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OVCInfoProvider", "Missing sdk_version parameter");
            return a(11);
        }
        java.lang.Integer h17 = r26.h0.h(queryParameter);
        if (h17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OVCInfoProvider", "Invalid sdk_version format: ".concat(queryParameter));
            return a(11);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkVersion: sdkVersion=0x");
        int intValue = h17.intValue();
        r26.a.a(16);
        java.lang.String num = java.lang.Integer.toString(intValue, 16);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(num, "toString(...)");
        sb6.append(num);
        sb6.append(", minSupported=0x");
        r26.a.a(16);
        java.lang.String num2 = java.lang.Integer.toString(131072, 16);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(num2, "toString(...)");
        sb6.append(num2);
        sb6.append(", maxSupported=0x");
        r26.a.a(16);
        java.lang.String num3 = java.lang.Integer.toString(196607, 16);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(num3, "toString(...)");
        sb6.append(num3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OVCInfoProvider", sb6.toString());
        if (h17.intValue() < 131072) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("SDK version too low: 0x");
            int intValue2 = h17.intValue();
            r26.a.a(16);
            java.lang.String num4 = java.lang.Integer.toString(intValue2, 16);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(num4, "toString(...)");
            sb7.append(num4);
            sb7.append(" < 0x");
            r26.a.a(16);
            java.lang.String num5 = java.lang.Integer.toString(131072, 16);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(num5, "toString(...)");
            sb7.append(num5);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OVCInfoProvider", sb7.toString());
            i17 = 7;
        } else if (h17.intValue() > 196607) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("WeChat version too low: SDK 0x");
            int intValue3 = h17.intValue();
            r26.a.a(16);
            java.lang.String num6 = java.lang.Integer.toString(intValue3, 16);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(num6, "toString(...)");
            sb8.append(num6);
            sb8.append(" > 0x");
            r26.a.a(16);
            java.lang.String num7 = java.lang.Integer.toString(196607, 16);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(num7, "toString(...)");
            sb8.append(num7);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OVCInfoProvider", sb8.toString());
            i17 = 6;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OVCInfoProvider", "Version check passed");
        }
        return a(i17);
    }

    @Override // android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uri, "uri");
        return 0;
    }
}
