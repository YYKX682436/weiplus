package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class wb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f87216d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f87217e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.dc f87218f;

    public wb(com.tencent.mm.plugin.appbrand.page.dc dcVar, java.lang.String str, java.util.Map map) {
        this.f87218f = dcVar;
        this.f87216d = str;
        this.f87217e = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f87218f.l(this.f87216d, this.f87217e);
    }
}
