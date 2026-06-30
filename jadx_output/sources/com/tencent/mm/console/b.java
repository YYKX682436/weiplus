package com.tencent.mm.console;

/* loaded from: classes7.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo f64794d;

    public b(com.tencent.mm.console.d dVar, com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo wxaMagicPkgInfo) {
        this.f64794d = wxaMagicPkgInfo;
    }

    @Override // java.lang.Runnable
    public void run() {
        db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, this.f64794d.f147865n, 1).show();
    }
}
