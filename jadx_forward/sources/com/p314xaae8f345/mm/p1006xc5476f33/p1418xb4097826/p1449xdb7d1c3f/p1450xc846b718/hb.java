package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes8.dex */
public final class hb extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb f187104d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zy2.ba f187105e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb f187106f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f187107g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar, zy2.ba baVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar2, long j17) {
        super(0);
        this.f187104d = jbVar;
        this.f187105e = baVar;
        this.f187106f = jbVar2;
        this.f187107g = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = this.f187104d;
        boolean h17 = jbVar.h1();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar2 = this.f187106f;
        zy2.ba baVar = this.f187105e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotCtrInfo", "[store] ret=" + (h17 ? baVar.c(jbVar2) : baVar.b(jbVar2, true)) + ' ' + jbVar + " cost=" + (java.lang.System.currentTimeMillis() - this.f187107g));
        return jz5.f0.f384359a;
    }
}
