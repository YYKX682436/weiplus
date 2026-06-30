package com.tencent.mm.plugin.appbrand.jsapi.auth.entity;

@j95.b
/* loaded from: classes7.dex */
public final class w extends i95.w implements com.tencent.mm.plugin.appbrand.jsapi.auth.entity.q {
    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.entity.q
    public com.tencent.mm.plugin.appbrand.jsapi.auth.entity.p N2(android.content.Context context, r45.sv6 userAvatarInfo, r45.jv5 scopeInfo, com.tencent.mm.plugin.appbrand.jsapi.auth.entity.n eventListener) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(userAvatarInfo, "userAvatarInfo");
        kotlin.jvm.internal.o.g(scopeInfo, "scopeInfo");
        kotlin.jvm.internal.o.g(eventListener, "eventListener");
        com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMUserAvatarInfo mMUserAvatarInfo = new com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMUserAvatarInfo(userAvatarInfo);
        java.lang.String Scope = scopeInfo.f378131d;
        kotlin.jvm.internal.o.f(Scope, "Scope");
        return new com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m0(context, mMUserAvatarInfo, Scope, eventListener);
    }
}
