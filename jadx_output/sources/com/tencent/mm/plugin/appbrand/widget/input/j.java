package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public class j implements com.tencent.mm.plugin.appbrand.widget.input.x3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.k f91501a;

    public j(com.tencent.mm.plugin.appbrand.widget.input.k kVar) {
        this.f91501a = kVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.x3
    public void onDone() {
        com.tencent.mm.plugin.appbrand.widget.input.k kVar = this.f91501a;
        kVar.v();
        kVar.p(false);
    }
}
