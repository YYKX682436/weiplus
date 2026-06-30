package com.tencent.mm.plugin.appbrand.jsapi.scanner;

/* loaded from: classes7.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f82952d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f82953e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f82954f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f82955g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.scanner.i f82956h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82957i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.util.List list, java.util.List list2, com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17, com.tencent.mm.plugin.appbrand.jsapi.scanner.i iVar, java.lang.String str) {
        super(1);
        this.f82952d = list;
        this.f82953e = list2;
        this.f82954f = c0Var;
        this.f82955g = i17;
        this.f82956h = iVar;
        this.f82957i = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        java.util.List list2 = this.f82953e;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list2, 10));
        java.util.Iterator it = list2.iterator();
        int i17 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            com.tencent.mm.plugin.appbrand.jsapi.scanner.i iVar = this.f82956h;
            if (!hasNext) {
                java.util.List list3 = this.f82952d;
                list3.addAll(arrayList);
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("results", list3);
                iVar.getClass();
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                hashMap.put("errno", 0);
                this.f82954f.a(this.f82955g, iVar.t("ok", hashMap));
                return jz5.f0.f302826a;
            }
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            com.tencent.mm.plugin.appbrand.jsapi.scanner.JsApiDetectImageCode$A8KeyRespData jsApiDetectImageCode$A8KeyRespData = null;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            zs5.c0 c0Var = (zs5.c0) next;
            int a17 = com.tencent.mm.plugin.scanner.j1.a(c0Var.f475331e);
            java.lang.String str2 = this.f82957i;
            kotlin.jvm.internal.o.d(str2);
            if (list != null) {
                jsApiDetectImageCode$A8KeyRespData = (com.tencent.mm.plugin.appbrand.jsapi.scanner.JsApiDetectImageCode$A8KeyRespData) list.get(i17);
            }
            arrayList.add(iVar.C(str2, a17, c0Var, jsApiDetectImageCode$A8KeyRespData));
            i17 = i18;
        }
    }
}
