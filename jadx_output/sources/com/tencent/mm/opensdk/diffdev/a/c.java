package com.tencent.mm.opensdk.diffdev.a;

/* loaded from: classes15.dex */
final class c implements java.lang.Runnable {

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ com.tencent.mm.opensdk.diffdev.a.b f72333g;

    public c(com.tencent.mm.opensdk.diffdev.a.b bVar) {
        this.f72333g = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.List list;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        list = this.f72333g.f72332f.f72329c;
        arrayList.addAll(list);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.opensdk.diffdev.OAuthListener) it.next()).onQrcodeScanned();
        }
    }
}
