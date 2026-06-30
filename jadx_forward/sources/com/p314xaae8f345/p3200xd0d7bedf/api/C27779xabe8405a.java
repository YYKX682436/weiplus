package com.p314xaae8f345.p3200xd0d7bedf.api;

/* renamed from: com.tencent.wework.api.WWAPIImpl */
/* loaded from: classes13.dex */
public class C27779xabe8405a extends com.p314xaae8f345.p3200xd0d7bedf.api.AbstractC27776x58b31828 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f301668d = 0;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f301669b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.SharedPreferences f301670c;

    static {
        new java.util.ArrayList<java.lang.String>() { // from class: com.tencent.wework.api.WWAPIImpl.1
            {
                add("com.tencent.weworklocal");
                add("com.tencent.wework");
                add("com.tencent.wwgovernment");
            }
        };
        new java.util.ArrayList<java.lang.String>() { // from class: com.tencent.wework.api.WWAPIImpl.2
            {
                add("com.tencent.wework");
            }
        };
    }

    public C27779xabe8405a(android.content.Context context) {
        super(context);
        new java.util.HashMap();
        new android.content.BroadcastReceiver() { // from class: com.tencent.wework.api.WWAPIImpl.3
            @Override // android.content.BroadcastReceiver
            public void onReceive(android.content.Context context2, android.content.Intent intent) {
                try {
                    com.p314xaae8f345.p3200xd0d7bedf.api.C27779xabe8405a c27779xabe8405a = com.p314xaae8f345.p3200xd0d7bedf.api.C27779xabe8405a.this;
                    int i17 = com.p314xaae8f345.p3200xd0d7bedf.api.C27779xabe8405a.f301668d;
                    c27779xabe8405a.getClass();
                    intent.getScheme();
                    throw null;
                } catch (java.lang.Throwable unused) {
                }
            }
        };
        this.f301670c = null;
        this.f301669b = context;
        this.f301670c = context.getSharedPreferences("wxwork_wwapi_store", 0);
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

    @Override // com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71
    public boolean a(com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27782x25821bd6 abstractC27782x25821bd6, com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType wWAppType) {
        return false;
    }

    @Override // com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71
    public boolean b(com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType wWAppType) {
        if (wWAppType == com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType.WwAppTypeDefault) {
            return h("com.tencent.wework") >= 20104;
        }
        if (wWAppType == com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType.WwAppTypeWxwork) {
            return (h("com.tencent.wework") >= 20104) || i("wxwork");
        }
        if (wWAppType == com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType.WwAppTypeLocal) {
            return i("wxworkgovuniform");
        }
        if (wWAppType == com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType.WwAppTypeWxworkWithoutSaas) {
            return i("wxwork");
        }
        return false;
    }

    @Override // com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71
    public boolean c(com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType wWAppType) {
        return false;
    }

    @Override // com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71
    public java.lang.String d(com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType wWAppType) {
        return null;
    }

    @Override // com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71
    public boolean e() {
        return h("com.tencent.wework") > 20104;
    }

    public final int h(java.lang.String str) {
        try {
            android.content.pm.PackageInfo packageInfo = this.f301669b.getPackageManager().getPackageInfo(str, 128);
            if (packageInfo == null) {
                return 0;
            }
            return packageInfo.versionCode;
        } catch (java.lang.Throwable unused) {
            return 0;
        }
    }

    public final boolean i(java.lang.String str) {
        java.util.List<android.content.pm.ResolveInfo> queryIntentActivities = this.f301669b.getPackageManager().queryIntentActivities(new android.content.Intent("com.tencent.wework.api.sharemsg", android.net.Uri.parse(str + "://jump")), 65536);
        return queryIntentActivities != null && queryIntentActivities.size() > 0 && h(queryIntentActivities.get(0).activityInfo.applicationInfo.packageName) >= 1030040000;
    }

    public boolean j(java.lang.String str) {
        java.lang.String str2;
        try {
            str2 = g(this.f301669b.getPackageManager().getPackageInfo(str, 64).signatures[0].toByteArray());
        } catch (java.lang.Throwable unused) {
            str2 = "";
        }
        return "011A40266C8C75D181DDD8E4DDC50075".equals(str2);
    }
}
