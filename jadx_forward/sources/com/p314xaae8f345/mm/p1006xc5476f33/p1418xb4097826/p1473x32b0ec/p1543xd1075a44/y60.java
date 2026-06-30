package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class y60 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.yb f201952d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f201953e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z60 f201954f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y60(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.yb ybVar, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z60 z60Var) {
        super(0);
        this.f201952d = ybVar;
        this.f201953e = str;
        this.f201954f = z60Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = this.f201952d.H.f201650a.f199623d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStartLiveModeTabWidget", "showCoLiveSettingDialog: creating task, settlementMode=" + i17);
        re2.h1 h1Var = new re2.h1(i17, this.f201953e);
        re2.j1.f475970a.b(h1Var);
        az2.c cVar = az2.f.f97658d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z60 z60Var = this.f201954f;
        android.content.Context context = z60Var.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        az2.f a17 = az2.c.a(cVar, context, null, 0L, null, 8, null);
        a17.a();
        h1Var.k(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.v60(z60Var, a17, h1Var), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x60(z60Var, a17, h1Var));
        return jz5.f0.f384359a;
    }
}
