package com.tencent.mm.plugin.appbrand.jsapi.contact;

/* loaded from: classes15.dex */
public class i implements com.tencent.mm.ui.widget.dialog.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f80560a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f80561b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.contact.j f80562c;

    public i(com.tencent.mm.plugin.appbrand.jsapi.contact.j jVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f80562c = jVar;
        this.f80560a = lVar;
        this.f80561b = i17;
    }

    @Override // com.tencent.mm.ui.widget.dialog.b1
    public void a() {
        this.f80560a.a(this.f80561b, this.f80562c.o("cancel"));
    }
}
