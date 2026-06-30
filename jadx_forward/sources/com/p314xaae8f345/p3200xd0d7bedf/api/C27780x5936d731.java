package com.p314xaae8f345.p3200xd0d7bedf.api;

/* renamed from: com.tencent.wework.api.WWAPIImplLocal */
/* loaded from: classes13.dex */
public final class C27780x5936d731 extends com.p314xaae8f345.p3200xd0d7bedf.api.AbstractC27776x58b31828 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.ArrayList f301672e;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f301673b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.BroadcastReceiver f301674c;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.SharedPreferences f301675d;

    static {
        new java.util.ArrayList<java.lang.String>() { // from class: com.tencent.wework.api.WWAPIImplLocal.1
            {
                add("com.tencent.wework");
                add("com.tencent.wwgovernment");
            }
        };
        new java.util.ArrayList<java.lang.String>() { // from class: com.tencent.wework.api.WWAPIImplLocal.2
            {
                add("com.tencent.wework");
            }
        };
        f301672e = new java.util.ArrayList<java.lang.String>() { // from class: com.tencent.wework.api.WWAPIImplLocal.3
            {
                add("011A40266C8C75D181DDD8E4DDC50075");
                add("F5BF8B3B1B616EFEF88681716C061BA4");
                add("99A7B5BDA8615128675831C01F208344");
                add("B374B823AD2BF3F216AC8F67B86CE189");
            }
        };
    }

    public C27780x5936d731(android.content.Context context) {
        super(context);
        new java.util.HashMap();
        this.f301674c = new android.content.BroadcastReceiver() { // from class: com.tencent.wework.api.WWAPIImplLocal.4
            @Override // android.content.BroadcastReceiver
            public void onReceive(android.content.Context context2, android.content.Intent intent) {
                try {
                    com.p314xaae8f345.p3200xd0d7bedf.api.C27780x5936d731 c27780x5936d731 = com.p314xaae8f345.p3200xd0d7bedf.api.C27780x5936d731.this;
                    java.util.ArrayList arrayList = com.p314xaae8f345.p3200xd0d7bedf.api.C27780x5936d731.f301672e;
                    c27780x5936d731.getClass();
                    intent.getScheme();
                    throw null;
                } catch (java.lang.Throwable unused) {
                }
            }
        };
        this.f301675d = null;
        this.f301673b = context;
        this.f301675d = context.getSharedPreferences("wxwork_wwapi_store", 0);
    }

    public static java.lang.String g(byte[] bArr) {
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(bArr);
            byte[] digest = messageDigest.digest();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(digest.length * 2);
            for (byte b17 : digest) {
                sb6.append(java.lang.Integer.toHexString((b17 & 240) >>> 4));
                sb6.append(java.lang.Integer.toHexString(b17 & 15));
            }
            return sb6.toString().toUpperCase();
        } catch (java.security.NoSuchAlgorithmException unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x014a  */
    @Override // com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27782x25821bd6 r29, com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType r30) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3200xd0d7bedf.api.C27780x5936d731.a(com.tencent.wework.api.model.BaseMessage, com.tencent.wework.api.IWWAPI$WWAppType):boolean");
    }

    @Override // com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71
    public boolean b(com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType wWAppType) {
        if (wWAppType == com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType.WwAppTypeDefault) {
            return i("com.tencent.wework") >= 20104;
        }
        if (wWAppType == com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType.WwAppTypeWxwork) {
            return (i("com.tencent.wework") >= 20104) || j("wxwork");
        }
        if (wWAppType == com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType.WwAppTypeLocal) {
            return j("wxworkgovuniform");
        }
        if (wWAppType == com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType.WwAppTypeWxworkWithoutSaas) {
            return j("wxwork");
        }
        return false;
    }

    @Override // com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71
    public boolean c(com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType wWAppType) {
        if (wWAppType == com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType.WwAppTypeDefault) {
            return k("com.tencent.wework");
        }
        if (wWAppType == com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType.WwAppTypeWxwork) {
            return k("com.tencent.wework") || k("com.tencent.wwgovernment") || f(new android.content.Intent("com.tencent.wework.api.sharemsg", android.net.Uri.parse("wxwork://jump")));
        }
        if (wWAppType == com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType.WwAppTypeLocal) {
            return k("com.tencent.wwgovernment") || f(new android.content.Intent("com.tencent.wework.api.sharemsg", android.net.Uri.parse("wxworkgovuniform://jump")));
        }
        return false;
    }

    @Override // com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71
    public java.lang.String d(com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType wWAppType) {
        return wWAppType == com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType.WwAppTypeLocal ? "政务微信" : "企业微信";
    }

    @Override // com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71
    public boolean e() {
        return i("com.tencent.wework") > 20104;
    }

    public final java.lang.String h(android.content.Intent intent) {
        java.util.List<android.content.pm.ResolveInfo> queryIntentActivities = this.f301673b.getPackageManager().queryIntentActivities(intent, 65536);
        return queryIntentActivities.size() > 0 ? queryIntentActivities.get(0).activityInfo.applicationInfo.packageName : "";
    }

    public final int i(java.lang.String str) {
        try {
            android.content.pm.PackageInfo packageInfo = this.f301673b.getPackageManager().getPackageInfo(str, 128);
            if (packageInfo == null) {
                return 0;
            }
            return packageInfo.versionCode;
        } catch (java.lang.Throwable unused) {
            return 0;
        }
    }

    public final boolean j(java.lang.String str) {
        java.util.List<android.content.pm.ResolveInfo> queryIntentActivities = this.f301673b.getPackageManager().queryIntentActivities(new android.content.Intent("com.tencent.wework.api.sharemsg", android.net.Uri.parse(str + "://jump")), 65536);
        return queryIntentActivities != null && queryIntentActivities.size() > 0 && i(queryIntentActivities.get(0).activityInfo.applicationInfo.packageName) >= 1030040000;
    }

    public boolean k(java.lang.String str) {
        java.lang.String str2;
        try {
            str2 = g(this.f301673b.getPackageManager().getPackageInfo(str, 64).signatures[0].toByteArray());
        } catch (java.lang.Throwable unused) {
            str2 = "";
        }
        return f301672e.contains(str2);
    }
}
