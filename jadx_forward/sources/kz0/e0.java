package kz0;

/* loaded from: classes5.dex */
public final class e0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.c1 f395216d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m7 f395217e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.c1 c1Var, com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m7 m7Var) {
        super(1);
        this.f395216d = c1Var;
        this.f395217e = m7Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.c1 c1Var = this.f395216d;
        if (booleanValue != c1Var.f151427y && booleanValue) {
            java.lang.String a17 = this.f395217e.a();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTemplate.MoreTemplateBottomSheetState", "setInitialSelectId ".concat(a17));
            c1Var.f151413k = a17;
            if (a17.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsTemplate.MoreTemplateBottomSheetState", "updateInitialItemSelectedState: " + c1Var.f151413k + ", templateDataSize: " + ((java.util.List) ((n0.q4) c1Var.f151412j).mo128745x754a37bb()).size());
            } else {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("update item to select ");
                sb6.append(c1Var.f151413k);
                sb6.append(' ');
                com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m5 m5Var = c1Var.f151417o;
                sb6.append(m5Var != null ? m5Var.f151610a : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTemplate.MoreTemplateBottomSheetState", sb6.toString());
                com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.k5 a18 = com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.k5.f151558m.a(c1Var.f151413k);
                com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.e5 e5Var = a18 instanceof com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.e5 ? (com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.e5) a18 : null;
                if (e5Var != null) {
                    c1Var.f151414l = c1Var.f151413k;
                }
                com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m5 m5Var2 = c1Var.f151417o;
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m5Var2 != null ? m5Var2.f151610a : null, c1Var.f151413k)) {
                    com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m5 m5Var3 = c1Var.f151417o;
                    com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.r rVar = m5Var3 != null ? m5Var3.f151611b : null;
                    if (rVar != null) {
                        rVar.b(false);
                    }
                    c1Var.f151417o = e5Var;
                    n0.v2 v2Var = c1Var.f151415m;
                    if (e5Var != null) {
                        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.r rVar2 = e5Var.f151611b;
                        if (rVar2 != null) {
                            rVar2.b(true);
                        }
                        ((n0.q4) v2Var).mo148714x53d8522f(java.lang.Boolean.TRUE);
                    } else {
                        ((n0.q4) v2Var).mo148714x53d8522f(java.lang.Boolean.FALSE);
                    }
                }
            }
        }
        if (!c1Var.f151426x && c1Var.f151427y != booleanValue) {
            c1Var.f151426x = true;
        }
        c1Var.f151427y = booleanValue;
        return jz5.f0.f384359a;
    }
}
