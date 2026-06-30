package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12320xd8d30665 f166166d;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12320xd8d30665 c12320xd8d30665) {
        this.f166166d = c12320xd8d30665;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nf.y yVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u07;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.c.f166063a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12320xd8d30665 args = this.f166166d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(args, "args");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.b(args.f165861e);
        java.lang.String str = (b17 == null || (u07 = b17.u0()) == null) ? null : u07.f128810w;
        java.lang.String str2 = args.f165860d;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, str2) || b17.m0() == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.c.f166063a.computeIfAbsent(str2, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.b(args, (args.f165863g || (yVar = nf.x.f418149b) == null) ? false : yVar.mo53144x387a9983()));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandAppConfigParserHelper.AheadParsedConfigsCache", "computeIfAbsent(" + str2 + ") appConfig provided, skip");
    }
}
