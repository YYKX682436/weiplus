package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public class xe implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f281761a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ye f281762b;

    public xe(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ye yeVar, java.lang.String str) {
        this.f281762b = yeVar;
        this.f281761a = str;
    }

    @Override // c01.o8
    public void a(java.lang.String str, boolean z17) {
        java.lang.String str2;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ye yeVar = this.f281762b;
        r35.a aVar = new r35.a(yeVar.f281846e.f280113d.g(), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.we(this));
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(3);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(yeVar.f281846e.f281220h, true);
        java.lang.String str3 = "";
        if (n17 != null && (str2 = n17.F1) != null) {
            str3 = str2;
        }
        aVar.m(str3);
        aVar.f450558z = true;
        aVar.a(yeVar.f281846e.f281220h, this.f281761a, linkedList);
    }
}
