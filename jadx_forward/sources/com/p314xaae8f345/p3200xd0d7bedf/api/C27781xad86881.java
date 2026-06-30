package com.p314xaae8f345.p3200xd0d7bedf.api;

/* renamed from: com.tencent.wework.api.WWAPIImplMeeting */
/* loaded from: classes13.dex */
public final class C27781xad86881 extends com.p314xaae8f345.p3200xd0d7bedf.api.C27779xabe8405a {

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashMap f301677e = new java.util.HashMap();

    @Override // com.p314xaae8f345.p3200xd0d7bedf.api.C27779xabe8405a, com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71
    public boolean c(com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType wWAppType) {
        if (wWAppType == com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType.WwAppTypeDefault) {
            return j("com.tencent.wework");
        }
        if (wWAppType == com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType.WwAppTypeWxwork) {
            return j("com.tencent.wework") || j("com.tencent.wwgovernment") || f(new android.content.Intent("com.tencent.wework.api.sharemsg", android.net.Uri.parse("wxwork://jump")));
        }
        if (wWAppType == com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType.WwAppTypeLocal) {
            return j("com.tencent.wwgovernment") || f(new android.content.Intent("com.tencent.wework.api.sharemsg", android.net.Uri.parse("wxworkgovuniform://jump")));
        }
        if (wWAppType == com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType.WwAppTypeWxworkWithoutSaas) {
            return j("com.tencent.wwgovernment") || f(new android.content.Intent("com.tencent.wework.api.sharemsg", android.net.Uri.parse("wxwork://jump")));
        }
        return false;
    }

    @Override // com.p314xaae8f345.p3200xd0d7bedf.api.AbstractC27776x58b31828
    public boolean f(android.content.Intent intent) {
        java.util.List<android.content.pm.ResolveInfo> queryIntentActivities = this.f301669b.getPackageManager().queryIntentActivities(intent, 65536);
        f301677e.put(intent.getDataString(), queryIntentActivities.size() > 0 ? queryIntentActivities.get(0).activityInfo.applicationInfo.packageName : "");
        return !android.text.TextUtils.isEmpty(r0);
    }
}
