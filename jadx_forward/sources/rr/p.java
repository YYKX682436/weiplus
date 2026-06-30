package rr;

/* loaded from: classes9.dex */
public final class p implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rr.r f480676a;

    public p(rr.r rVar) {
        this.f480676a = rVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        int i18 = fVar.f152149b;
        rr.r rVar = this.f480676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar.f480681d, "checkExchange: cgi result: " + i17 + ", " + i18);
        boolean z17 = true;
        if (i17 == 0 && i18 == 0) {
            java.lang.String field_groupId = rVar.f480679b.f68663x861009b5;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_groupId, "field_groupId");
            rr.u.a(field_groupId);
            rVar.f480680c.a(true);
        } else {
            java.lang.String str = fVar.f152150c;
            rr.e eVar = (rr.e) rVar;
            rr.d dVar = new rr.d(eVar);
            eVar.f480680c.a(false);
            android.content.Context context = eVar.f480678a;
            if (i18 == 4) {
                java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bxz);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                eVar.a(string, dVar);
            } else if (i18 == 8) {
                java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bum);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                eVar.a(string2, dVar);
            } else if (i18 != 9) {
                if (str != null && str.length() != 0) {
                    z17 = false;
                }
                if (z17) {
                    java.lang.String string3 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.buj);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
                    eVar.a(string3, dVar);
                } else {
                    eVar.a(str, dVar);
                }
            } else {
                java.lang.String string4 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bul);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string4, "getString(...)");
                eVar.a(string4, dVar);
            }
        }
        return jz5.f0.f384359a;
    }
}
