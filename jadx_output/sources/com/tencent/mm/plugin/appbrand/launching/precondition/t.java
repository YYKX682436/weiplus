package com.tencent.mm.plugin.appbrand.launching.precondition;

/* loaded from: classes7.dex */
public class t implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f85026d;

    public t(java.lang.String str) {
        this.f85026d = str;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.appbrand.launching.precondition.s l17 = com.tencent.mm.plugin.appbrand.launching.precondition.s.l(this.f85026d);
        if (l17 == null) {
            return false;
        }
        l17.d();
        return false;
    }
}
