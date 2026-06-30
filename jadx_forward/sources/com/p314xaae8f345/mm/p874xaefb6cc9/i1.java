package com.p314xaae8f345.mm.p874xaefb6cc9;

/* loaded from: classes7.dex */
public final class i1 implements com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25504xc81900ad {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p874xaefb6cc9.i1 f150613a = new com.p314xaae8f345.mm.p874xaefb6cc9.i1();

    /* renamed from: b, reason: collision with root package name */
    public static volatile com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f150614b;

    public final android.content.Context a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = f150614b;
        android.app.Activity r07 = o6Var != null ? o6Var.r0() : null;
        if (r07 != null) {
            return r07;
        }
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        return context;
    }

    @Override // com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25504xc81900ad
    /* renamed from: checkPermission */
    public int mo46927x28e6dcf7(java.lang.String str, int i17, int i18) {
        if (str == null || str.length() == 0) {
            return -1;
        }
        return a().checkPermission(str, i17, i18);
    }

    @Override // com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25504xc81900ad
    /* renamed from: checkSelfPermission */
    public int mo46928x3fed0563(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return -1;
        }
        return a().checkSelfPermission(str);
    }

    @Override // com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25504xc81900ad
    /* renamed from: requestPermissions */
    public void mo46929x637dca75(java.lang.String[] strArr, int i17, com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25505xe77fe7dc interfaceC25505xe77fe7dc) {
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.content.Context a17 = a();
        com.p314xaae8f345.mm.p874xaefb6cc9.h1 h1Var = new com.p314xaae8f345.mm.p874xaefb6cc9.h1(interfaceC25505xe77fe7dc);
        if (strArr == null) {
            strArr = new java.lang.String[0];
        }
        ((sb0.f) jVar).getClass();
        j35.u.j(a17, i17, h1Var, strArr, null, null);
    }
}
