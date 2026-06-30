package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5;

/* loaded from: classes10.dex */
public final class p2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zy2.dc f207703d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f207704e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f207705f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c01.o8 f207706g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(zy2.dc dcVar, java.lang.String str, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, c01.o8 o8Var) {
        super(0);
        this.f207703d = dcVar;
        this.f207704e = str;
        this.f207705f = h0Var;
        this.f207706g = o8Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        zy2.dc dcVar = this.f207703d;
        boolean z17 = dcVar != null ? ((ya2.b2) dcVar).G2 : false;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getFinderStrangerContact] callback! succ=");
        sb6.append(z17);
        sb6.append(", username=");
        java.lang.String str = this.f207704e;
        sb6.append(str);
        sb6.append(" talker=");
        sb6.append((java.lang.String) this.f207705f.f391656d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.GetContactInterceptor", sb6.toString());
        c01.o8 o8Var = this.f207706g;
        if (o8Var != null) {
            o8Var.a(str, z17);
        }
        return jz5.f0.f384359a;
    }
}
