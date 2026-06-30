package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes3.dex */
public final class gn extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.hn f188388d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gn(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.hn hnVar) {
        super(1);
        this.f188388d = hnVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (this.f188388d.f188474p) {
            java.lang.Integer valueOf = fVar != null ? java.lang.Integer.valueOf(fVar.f152149b) : null;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("errType ");
            sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f152148a) : null);
            sb6.append(", errCode ");
            sb6.append(valueOf);
            sb6.append(", errMsg ");
            sb6.append(fVar != null ? fVar.f152150c : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("requestBindPoiStream", sb6.toString());
            if (valueOf != null && valueOf.intValue() < 0) {
                android.content.res.Resources resources = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources();
                java.lang.String string = resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573514eu4);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                switch (valueOf.intValue()) {
                    case -5853:
                        string = resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573514eu4);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                        break;
                    case -5852:
                        string = resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573511eu1);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                        break;
                    case -5851:
                        string = resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573512eu2);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                        break;
                    case -5850:
                        string = resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573513eu3);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                        break;
                }
                db5.t7.m(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, string);
            }
        }
        return jz5.f0.f384359a;
    }
}
