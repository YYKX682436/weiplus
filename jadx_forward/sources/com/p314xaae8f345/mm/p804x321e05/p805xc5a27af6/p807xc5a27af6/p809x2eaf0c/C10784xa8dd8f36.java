package com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.p809x2eaf0c;

/* renamed from: com.tencent.mm.kara.feature.feature.comm.GroupWithSomeoneFeatureGroup */
/* loaded from: classes11.dex */
public class C10784xa8dd8f36 extends pl0.e {

    /* renamed from: count */
    @fl0.a
    public int f29335x5a7510f;

    /* renamed from: numberOfMuteNotifications */
    @fl0.a
    public int f29336xa20a4c2f;

    /* renamed from: numberOfSavedToContacts */
    @fl0.a
    public int f29337x506d6b5;

    /* renamed from: numberOfSessionsStickyOnTop */
    @fl0.a
    public int f29338xffd89690;

    /* renamed from: proportionOfMuteNotifications */
    @fl0.a
    public float f29339xbfef573e;

    /* renamed from: proportionOfMyContacts */
    @fl0.a
    public float f29340xa7327110;

    /* renamed from: proportionOfMyMessages */
    @fl0.a
    public float f29341xad7a1209;

    /* renamed from: proportionOfSavedToContacts */
    @fl0.a
    public float f29342xd7815984;

    /* renamed from: proportionOfSessionsStickyOnTop */
    @fl0.a
    public float f29343x38a719df;

    /* renamed from: sumOfMembers */
    @fl0.a
    public int f29344x4535a937;

    /* renamed from: sumOfMessages */
    @fl0.a
    public int f29345x6caa24ee;

    /* renamed from: sumOfMyContacts */
    @fl0.a
    public int f29346x49202941;

    /* renamed from: sumOfMyMessages */
    @fl0.a
    public int f29347x4f67ca3a;

    /* renamed from: userName */
    private java.lang.String f29348xf01afcf6;

    public C10784xa8dd8f36(java.lang.String str) {
        this.f29348xf01afcf6 = str;
    }

    @Override // pl0.e, fl0.b
    /* renamed from: build */
    public void mo46315x59bc66e() {
        super.mo46315x59bc66e();
        if (android.text.TextUtils.isEmpty(this.f29348xf01afcf6)) {
            return;
        }
        sl0.a0 a0Var = sl0.a0.f490582e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f29335x5a7510f = arrayList.size();
        this.f29336xa20a4c2f = 0;
        this.f29337x506d6b5 = 0;
        this.f29338xffd89690 = 0;
        this.f29344x4535a937 = 0;
        this.f29346x49202941 = 0;
        this.f29345x6caa24ee = 0;
        this.f29347x4f67ca3a = 0;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (((java.lang.Boolean) a0Var.a("chatroomIsOpenMuteNotifications" + str, new sl0.p(a0Var, str))).booleanValue()) {
                this.f29336xa20a4c2f++;
            }
            if (((java.lang.Boolean) a0Var.a("chatroomIsSavedToContact" + str, new sl0.q(a0Var, str))).booleanValue()) {
                this.f29337x506d6b5++;
            }
            if (((java.lang.Boolean) a0Var.a("chatroomIsTop" + str, new sl0.r(a0Var, str))).booleanValue()) {
                this.f29338xffd89690++;
            }
            java.util.List<java.lang.String> list = (java.util.List) a0Var.a("commonGroupAllMembersCnt" + str, new sl0.s(a0Var, str));
            this.f29344x4535a937 = this.f29344x4535a937 + list.size();
            for (java.lang.String str2 : list) {
                int i17 = this.f29346x49202941;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isContact");
                sb6.append(str2);
                this.f29346x49202941 = i17 + (((java.lang.Boolean) a0Var.a(sb6.toString(), new sl0.x(a0Var, str2))).booleanValue() ? 1 : 0);
            }
            this.f29345x6caa24ee = this.f29345x6caa24ee + ((java.lang.Integer) a0Var.a("commonGroupAllMessagesCnt" + str, new sl0.t(a0Var, str))).intValue();
            this.f29347x4f67ca3a = this.f29347x4f67ca3a + ((java.lang.Integer) a0Var.a("commonGroupMyMessagesCnt" + str, new sl0.u(a0Var, str))).intValue();
        }
        int i18 = this.f29335x5a7510f;
        if (i18 > 0) {
            this.f29339xbfef573e = this.f29336xa20a4c2f / i18;
            this.f29342xd7815984 = this.f29337x506d6b5 / i18;
            this.f29343x38a719df = this.f29338xffd89690 / i18;
        }
        int i19 = this.f29344x4535a937;
        if (i19 > 0) {
            this.f29340xa7327110 = this.f29346x49202941 / i19;
        }
        int i27 = this.f29345x6caa24ee;
        if (i27 > 0) {
            this.f29341xad7a1209 = this.f29347x4f67ca3a / i27;
        }
    }

    @Override // fl0.b
    /* renamed from: getName */
    public java.lang.String mo46314xfb82e301() {
        return "commonGroupChats";
    }
}
