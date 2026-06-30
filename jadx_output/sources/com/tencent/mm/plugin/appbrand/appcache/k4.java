package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public class k4 implements com.tencent.mm.plugin.appbrand.appcache.va {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.l4 f75626a;

    public k4(com.tencent.mm.plugin.appbrand.appcache.l4 l4Var) {
        this.f75626a = l4Var;
    }

    @Override // m81.d
    public /* bridge */ /* synthetic */ void a(java.lang.Object obj) {
    }

    @Override // m81.d
    public void c(java.lang.String str, m81.c cVar, java.lang.Object obj) {
        m81.c cVar2 = m81.c.OK;
        com.tencent.mm.plugin.appbrand.appcache.l4 l4Var = this.f75626a;
        if (cVar == cVar2) {
            com.tencent.mm.plugin.appbrand.appcache.r4.q(l4Var.f75642d.f75672d, "公共库增量(maybe)更新成功，重启微信确认是否生效");
        } else {
            com.tencent.mm.plugin.appbrand.appcache.r4.q(l4Var.f75642d.f75672d, "公共库增量失败");
        }
    }
}
