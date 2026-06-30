package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public class na implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f75689d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f75690e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.qa f75691f;

    public na(com.tencent.mm.plugin.appbrand.appcache.qa qaVar, java.util.List list, java.util.List list2) {
        this.f75691f = qaVar;
        this.f75689d = list;
        this.f75690e = list2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = 0;
        while (true) {
            java.util.List list = this.f75689d;
            if (i17 >= list.size()) {
                return java.lang.Boolean.TRUE;
            }
            this.f75691f.e((java.lang.String) list.get(i17), ((java.lang.Integer) this.f75690e.get(i17)).intValue());
            i17++;
        }
    }
}
