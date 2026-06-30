package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes9.dex */
public class p implements n13.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.share.q f83192a;

    public p(com.tencent.mm.plugin.appbrand.jsapi.share.q qVar) {
        this.f83192a = qVar;
    }

    @Override // n13.x
    public void a(boolean z17, java.lang.String str, android.os.Bundle bundle) {
        com.tencent.mm.plugin.appbrand.jsapi.share.q qVar = this.f83192a;
        qVar.f83203i.putExtra("KSendGroupToDo", bundle.getBoolean("is_group_to_do"));
        qVar.f83203i.putExtra("custom_send_text", str);
        nf.g.a(qVar.f83198d.f83255a).g(qVar.f83204m.f83173g, z17 ? -1 : 0, qVar.f83203i);
    }
}
