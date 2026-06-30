package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes8.dex */
public final class r1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.w1 f187327d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f187328e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb f187329f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.w1 w1Var, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar) {
        super(0);
        this.f187327d = w1Var;
        this.f187328e = str;
        this.f187329f = jbVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object m143895xf1229813;
        r45.vs2 vs2Var = new r45.vs2();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = this.f187329f;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(vs2Var.mo11468x92b714fd(jbVar.f65874xb5f7102a.mo14344x5f01b1f6()));
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.NewDiscoveryRedDotHandler", m143898xd4a2fc34, "[isNeedRequest] rebuild DISCOVERY red dot failed! ctrlInfo toByteArray crash!", new java.lang.Object[0]);
        } else {
            java.util.LinkedList linkedList = vs2Var.f470022g;
            r45.f03 f03Var = new r45.f03();
            f03Var.f455420d = 1;
            f03Var.f455424h = 1;
            f03Var.f455425i = "Discovery";
            f03Var.f455439z = jbVar.f65883xdec927b;
            linkedList.add(f03Var);
            this.f187327d.aj().w(vs2Var, "Finder.NewDiscoveryRedDotHandler");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NewDiscoveryRedDotHandler", "[isNeedRequest] rebuild DISCOVERY red dot! path=" + this.f187328e);
        }
        return jz5.f0.f384359a;
    }
}
