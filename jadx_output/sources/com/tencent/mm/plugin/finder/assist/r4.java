package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes2.dex */
public final class r4 extends uo2.m0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f102505c;

    public r4(java.lang.String str) {
        this.f102505c = str;
    }

    @Override // uo2.m0
    public boolean b(long j17, int i17) {
        com.tencent.mm.plugin.lite.s sVar = this.f429634a;
        java.lang.String url = this.f102505c;
        kotlin.jvm.internal.o.g(url, "url");
        int i18 = url.length() == 0 ? -1 : 0;
        if (sVar != null) {
            sVar.c(j17, i17, "{\"errCode\": " + i18 + ",\"audioUrl\": \"" + url + "\"}");
        }
        return false;
    }
}
