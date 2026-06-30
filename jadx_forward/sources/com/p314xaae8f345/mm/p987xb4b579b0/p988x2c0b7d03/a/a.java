package com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.a;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: com.tencent.mm.opensdk.channel.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public static class C30917a {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.String f153860a;

        /* renamed from: action */
        public java.lang.String f32708xab2f7e36;

        /* renamed from: b, reason: collision with root package name */
        public long f153861b;

        /* renamed from: bundle */
        public android.os.Bundle f32709xaddf3082;

        /* renamed from: content */
        public java.lang.String f32710x38b73479;
    }

    public static boolean a(android.content.Context context, com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.a.a.C30917a c30917a) {
        java.lang.String str;
        java.lang.String str2;
        if (context == null) {
            str2 = "send fail, invalid argument";
        } else {
            if (!com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.b(c30917a.f32708xab2f7e36)) {
                if (com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.b(c30917a.f153860a)) {
                    str = null;
                } else {
                    str = c30917a.f153860a + ".permission.MM_MESSAGE";
                }
                android.content.Intent intent = new android.content.Intent(c30917a.f32708xab2f7e36);
                android.os.Bundle bundle = c30917a.f32709xaddf3082;
                if (bundle != null) {
                    intent.putExtras(bundle);
                }
                java.lang.String packageName = context.getPackageName();
                intent.putExtra(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32808x6604d593, com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.C11223x3d8d64e.f32730x9efbee2a);
                intent.putExtra(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32760x1a7d3e8, packageName);
                intent.putExtra(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32807x6382c059, c30917a.f32710x38b73479);
                intent.putExtra(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32761xae2888fe, c30917a.f153861b);
                intent.putExtra(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32762xbdedaa54, com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.a.b.a(c30917a.f32710x38b73479, com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.C11223x3d8d64e.f32730x9efbee2a, packageName));
                context.sendBroadcast(intent, str);
                com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.d("MicroMsg.SDK.MMessage", "send mm message, intent=" + intent + ", perm=" + str);
                return true;
            }
            str2 = "send fail, action is null";
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e("MicroMsg.SDK.MMessage", str2);
        return false;
    }
}
