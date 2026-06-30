package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5;

/* loaded from: classes10.dex */
public final class c1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.s1 f207546d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f207547e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.s1 s1Var, java.lang.String str) {
        super(1);
        this.f207546d = s1Var;
        this.f207547e = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        zy2.dc it = (zy2.dc) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f207546d.f207734i;
        java.lang.String str = this.f207547e;
        concurrentHashMap.remove(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ContactService", "[checkContactExpired#result] talker=" + str + " nick=" + ((ya2.b2) it).w0());
        return jz5.f0.f384359a;
    }
}
