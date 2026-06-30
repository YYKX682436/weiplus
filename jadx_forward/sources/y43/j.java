package y43;

/* loaded from: classes2.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o33.d f540884d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f540885e;

    public j(o33.d dVar, java.lang.String str) {
        this.f540884d = dVar;
        this.f540885e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.LinkedList<o33.g> url_lite_conf_list = this.f540884d.f424264d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(url_lite_conf_list, "url_lite_conf_list");
        for (o33.g gVar : url_lite_conf_list) {
            y43.e eVar = new y43.e();
            eVar.f68184x4b6e88aa = this.f540885e;
            o33.e eVar2 = gVar.f424276f;
            eVar.f68178x28d46377 = eVar2 != null ? eVar2.f424265d : null;
            eVar.f68181x2260084a = eVar2 != null ? eVar2.f424266e : null;
            eVar.f68179x61c4976f = eVar2 != null ? eVar2.f424267f : 0;
            eVar.f68182x7654871d = eVar2 != null ? eVar2.f424268g : 0;
            eVar.f68185xb772261 = eVar2 != null ? eVar2.f424269h : null;
            eVar.f68183xa783a79b = java.lang.System.currentTimeMillis();
            eVar.f68180x6822e1e7 = gVar.f424275e;
            o33.e eVar3 = gVar.f424276f;
            java.lang.String str = eVar3 != null ? eVar3.f424269h : null;
            if (!(str == null || str.length() == 0)) {
                java.lang.String[] strArr = new java.lang.String[1];
                o33.e eVar4 = gVar.f424276f;
                strArr[0] = eVar4 != null ? eVar4.f424269h : null;
                com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2461x14f51cd8.f.a(kz5.c0.d(strArr), 4);
            }
            ((y43.f) i95.n0.c(y43.f.class)).i5(eVar);
        }
    }
}
