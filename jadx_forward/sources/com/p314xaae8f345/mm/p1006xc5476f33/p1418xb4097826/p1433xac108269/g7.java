package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes8.dex */
public final class g7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f183730d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f183731e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f183732f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ db5.h4 f183733g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f183734h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, boolean z17, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, java.lang.String str, db5.h4 h4Var, yz5.l lVar) {
        super(1);
        this.f183730d = c14994x9b99c079;
        this.f183731e = activityC0065xcd7aa112;
        this.f183732f = str;
        this.f183733g = h4Var;
        this.f183734h = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        zy2.i iVar = (zy2.i) obj;
        if (iVar != null) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f183731e;
            db5.h4 h4Var = this.f183733g;
            yz5.l lVar = this.f183734h;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f183730d;
            int i17 = c14994x9b99c079.m59318xcdeb3c4() ? 42 : c14994x9b99c079.m59315x31740422() ? 36 : 18;
            ot0.q qVar = new ot0.q();
            qVar.f(iVar);
            qVar.f430199i = i17;
            qVar.f430187f = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.giz);
            qVar.f430207k = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573942gj0);
            fc5.i iVar2 = new fc5.i();
            l15.c cVar = new l15.c();
            java.lang.String u17 = ot0.q.u(qVar, null, null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(u17, "makeLocalContent(...)");
            cVar.m126728xdc93280d(u17);
            iVar2.k(cVar);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.f7 f7Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.f7(activityC0065xcd7aa112, h4Var, c14994x9b99c079, iVar, lVar);
            n13.t tVar = new n13.t();
            tVar.f415666a = f7Var;
            if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2532xd7a392c5.C20191xf05e29d9()) == 1) {
                tVar.f415670e = false;
            }
            ((dk5.y) ((n13.a0) i95.n0.c(n13.a0.class))).wi(activityC0065xcd7aa112, iVar2, this.f183732f, tVar);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCommonService", "can not share!");
        }
        return jz5.f0.f384359a;
    }
}
