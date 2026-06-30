package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class h7 implements com.tencent.mm.plugin.appbrand.page.la {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.e7 f86671a;

    public h7(com.tencent.mm.plugin.appbrand.page.e7 e7Var) {
        this.f86671a = e7Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.la
    public void a(int i17, int i18, boolean z17, boolean z18) {
        java.util.Iterator it = new java.util.HashSet(this.f86671a.K).iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.appbrand.page.la laVar = (com.tencent.mm.plugin.appbrand.page.la) it.next();
            if (laVar != null) {
                laVar.a(i17, i18, z17, z18);
            }
        }
    }
}
