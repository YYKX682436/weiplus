package com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8;

/* renamed from: com.tencent.mm.opensdk.modelmsg.WXAppLaunchData */
/* loaded from: classes15.dex */
public final class C11273xd635f19d {

    /* renamed from: ACTION_HANDLE_WXAPPLAUNCH */
    public static final java.lang.String f33064x4cde0445 = ".ACTION_HANDLE_WXAPPLAUNCH";

    /* renamed from: ACTION_HANDLE_WXAPP_RESULT */
    public static final java.lang.String f33065x581c5eea = ".ACTION_HANDLE_WXAPP_RESULT";

    /* renamed from: ACTION_HANDLE_WXAPP_SHOW */
    public static final java.lang.String f33066x2496c50a = ".ACTION_HANDLE_WXAPP_SHOW";

    /* renamed from: launchType */
    public int f33067x2092158d;

    /* renamed from: message */
    public java.lang.String f33068x38eb0007;

    /* renamed from: com.tencent.mm.opensdk.modelmsg.WXAppLaunchData$Builder */
    /* loaded from: classes15.dex */
    public static class Builder {
        /* renamed from: fromBundle */
        public static com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11273xd635f19d m48452x63aa4ccc(android.os.Bundle bundle) {
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11273xd635f19d c11273xd635f19d = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11273xd635f19d();
            c11273xd635f19d.f33067x2092158d = bundle.getInt("_wxapplaunchdata_launchType");
            c11273xd635f19d.f33068x38eb0007 = bundle.getString("_wxapplaunchdata_message");
            return c11273xd635f19d;
        }

        /* renamed from: toBundle */
        public static android.os.Bundle m48453x792022dd(com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11273xd635f19d c11273xd635f19d) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("_wxapplaunchdata_launchType", c11273xd635f19d.f33067x2092158d);
            bundle.putString("_wxapplaunchdata_message", c11273xd635f19d.f33068x38eb0007);
            return bundle;
        }
    }
}
