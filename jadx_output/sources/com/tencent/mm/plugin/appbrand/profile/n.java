package com.tencent.mm.plugin.appbrand.profile;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "kotlin.jvm.PlatformType", "appId", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class n<InputType, ResultType> implements com.tencent.mm.ipcinvoker.k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.profile.n f87694a = new com.tencent.mm.plugin.appbrand.profile.n();

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.luggage.trace.ProfileInfo profileInfo;
        java.lang.String jsonString;
        sj1.b c17 = sj1.l.c(((com.tencent.mm.ipcinvoker.type.IPCString) obj).f68406d);
        java.lang.String str = "";
        if (c17 != null) {
            c17.e("");
            profileInfo = c17.h();
        } else {
            profileInfo = null;
        }
        if (profileInfo != null && (jsonString = profileInfo.toJsonString()) != null) {
            str = jsonString;
        }
        return new com.tencent.mm.ipcinvoker.type.IPCString(str);
    }
}
