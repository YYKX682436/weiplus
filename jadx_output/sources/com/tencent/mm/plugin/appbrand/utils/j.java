package com.tencent.mm.plugin.appbrand.utils;

@j95.b
/* loaded from: classes7.dex */
public final class j extends i95.w implements com.tencent.mm.plugin.appbrand.utils.l2 {

    /* renamed from: d, reason: collision with root package name */
    public final e75.g f90482d = com.tencent.mm.accessibility.uitl.AccUtil.INSTANCE.getListenersOwner();

    @Override // com.tencent.mm.plugin.appbrand.utils.l2
    public boolean isEnable() {
        return com.tencent.mm.accessibility.uitl.AccUtil.INSTANCE.isAccessibilityEnabled();
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.l2
    public e75.g o9() {
        return this.f90482d;
    }
}
