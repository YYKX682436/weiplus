package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public enum wd {
    APP_LAUNCH("appLaunch"),
    NAVIGATE_TO(nd1.r.NAME),
    NAVIGATE_BACK(nd1.p.NAME),
    REDIRECT_TO(nd1.m0.NAME),
    REWRITE_ROUTE(nd1.p0.NAME),
    RE_LAUNCH("reLaunch"),
    AUTO_RE_LAUNCH("autoReLaunch"),
    SWITCH_TAB(nd1.h2.NAME),
    DISMISS_PIP("dismissPip"),
    /* JADX INFO: Fake field, exist only in values array */
    RELOAD("reload");


    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f87232d;

    wd(java.lang.String str) {
        this.f87232d = str;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return this.f87232d;
    }
}
