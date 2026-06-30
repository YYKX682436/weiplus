package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes.dex */
public final class t9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az2.f f211401d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15043xd880dd96 f211402e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t9(az2.f fVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15043xd880dd96 activityC15043xd880dd96) {
        super(1);
        this.f211401d = fVar;
        this.f211402e = activityC15043xd880dd96;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.an4 an4Var;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        this.f211401d.b();
        boolean z17 = true;
        java.lang.String m75945x2fec8307 = (fVar == null || (an4Var = (r45.an4) fVar.f152151d) == null) ? null : an4Var.m75945x2fec8307(1);
        boolean z18 = fVar != null && fVar.f152148a == 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15043xd880dd96 activityC15043xd880dd96 = this.f211402e;
        if (z18 && fVar.f152149b == 0) {
            if (m75945x2fec8307 != null && m75945x2fec8307.length() != 0) {
                z17 = false;
            }
            if (z17) {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15043xd880dd96.f210145t;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveShareProductUI", "MmecGetProductTagLinkReq get empty link");
                db5.t7.g(activityC15043xd880dd96.mo55332x76847179(), activityC15043xd880dd96.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.leh));
            } else {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.e(m75945x2fec8307);
                db5.t7.i(activityC15043xd880dd96.mo55332x76847179(), activityC15043xd880dd96.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lei), com.p314xaae8f345.mm.R.raw.f79703xc84d169a);
            }
        } else {
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15043xd880dd96.f210145t;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MmecGetProductTagLinkReq failed, err code = ");
            sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f152149b) : null);
            sb6.append(", errType = ");
            sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f152148a) : null);
            sb6.append(", errMsg = ");
            sb6.append(fVar != null ? fVar.f152150c : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveShareProductUI", sb6.toString());
            java.lang.String str = fVar != null ? fVar.f152150c : null;
            if (str == null) {
                str = activityC15043xd880dd96.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.leh);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getString(...)");
            }
            db5.t7.g(activityC15043xd880dd96.mo55332x76847179(), str);
        }
        return jz5.f0.f384359a;
    }
}
