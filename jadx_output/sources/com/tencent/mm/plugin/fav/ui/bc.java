package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes11.dex */
public class bc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f100529d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f100530e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f100531f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.dc f100532g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f100533h;

    public bc(java.util.List list, int i17, java.util.Map map, com.tencent.mm.plugin.fav.ui.dc dcVar, android.app.Dialog dialog) {
        this.f100529d = list;
        this.f100530e = i17;
        this.f100531f = map;
        this.f100532g = dcVar;
        this.f100533h = dialog;
    }

    @Override // java.lang.Runnable
    public void run() {
        o72.x1.n(this.f100529d, this.f100530e, this.f100531f);
        com.tencent.mm.plugin.fav.ui.dc dcVar = this.f100532g;
        if (dcVar != null) {
            dcVar.a();
        }
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.fav.ui.ac(this));
    }
}
