package com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f;

/* renamed from: com.tencent.mapsdk.core.MapDelegateFactoryImpl */
/* loaded from: classes13.dex */
public class C4364x8ccc0a9 implements com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.s {
    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.s
    /* renamed from: createDelegate */
    public com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.InterfaceC4363x6b3e72e1 mo36071x67d326a1(android.content.Context context, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7 c25966x7e4576a7, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.InterfaceC4363x6b3e72e1 interfaceC4363x6b3e72e1;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7.IMapKernel m99203x275cda03 = c25966x7e4576a7.m99203x275cda03();
        java.lang.Class<?> a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hp.a("com.tencent.mapsdk.navi.MapKernelNavi", m99203x275cda03.getClass().getClassLoader());
        java.lang.Class<?> a18 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hp.a("com.tencent.mapsdk.compat.MapKernelCompat", m99203x275cda03.getClass().getClassLoader());
        if (a18 != null && a18 == m99203x275cda03.getClass()) {
            interfaceC4363x6b3e72e1 = (com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.InterfaceC4363x6b3e72e1) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hp.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hp.a("com.tencent.mapsdk.compat.VectorMapCompatDelegateProxy", com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.InterfaceC4363x6b3e72e1.class, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.u.a().b()), context, c25966x7e4576a7, viewGroup);
        } else if (a17 != null && a17 == m99203x275cda03.getClass()) {
            interfaceC4363x6b3e72e1 = (com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.InterfaceC4363x6b3e72e1) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hp.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hp.a("com.tencent.mapsdk.navi.VectorMapNaviDelegateProxy", com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.InterfaceC4363x6b3e72e1.class, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.u.a().b()), context, c25966x7e4576a7, viewGroup);
        } else {
            interfaceC4363x6b3e72e1 = (com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.InterfaceC4363x6b3e72e1) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hp.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hp.a("com.tencent.mapsdk.vector.VectorMapDelegateProxy", com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.InterfaceC4363x6b3e72e1.class, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.u.a().b()), context, c25966x7e4576a7, viewGroup);
        }
        if (interfaceC4363x6b3e72e1 != null) {
            interfaceC4363x6b3e72e1.mo36642x8cf48009();
        }
        return interfaceC4363x6b3e72e1;
    }
}
