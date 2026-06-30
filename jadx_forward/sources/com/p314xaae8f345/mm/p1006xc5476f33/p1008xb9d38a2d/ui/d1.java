package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes8.dex */
public final class d1 implements v61.h {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f155322a;

    /* renamed from: b, reason: collision with root package name */
    public final x51.p0 f155323b = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.a1(this);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11399x9e1038c2 f155324c;

    public d1(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11399x9e1038c2 activityC11399x9e1038c2, boolean z17) {
        this.f155324c = activityC11399x9e1038c2;
        this.f155322a = z17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r6) == false) goto L16;
     */
    @Override // v61.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int a(android.content.Context r10) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.d1.a(android.content.Context):int");
    }

    public final int b(android.content.Context context, java.lang.String str) {
        char c17;
        android.accounts.AccountManager accountManager;
        android.accounts.Account account;
        if (context == null) {
            return 1;
        }
        x51.p0 p0Var = this.f155323b;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMAccountManager", "account username is null or nil");
            c17 = 0;
        } else {
            java.lang.String c18 = x51.q0.c(context);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c18)) {
                c18 = str;
            }
            try {
                accountManager = android.accounts.AccountManager.get(context);
                account = new android.accounts.Account(c18, "com.tencent.mm.account");
                ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMAccountManager", e17, "", new java.lang.Object[0]);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMAccountManager", "exception in addAccount() " + e17.getMessage());
            }
            if (!j35.u.d(context, "android.permission.READ_CONTACTS", true)) {
                c17 = 2;
            } else if (x51.q0.a(context, c18)) {
                android.content.ContentResolver.setSyncAutomatically(account, "com.android.contacts", true);
                c17 = 3;
            } else {
                x51.q0.d(context);
                if (accountManager.addAccountExplicitly(account, "", null)) {
                    android.content.ContentResolver.setSyncAutomatically(account, "com.android.contacts", true);
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putString("authAccount", c18);
                    bundle.putString("accountType", "com.tencent.mm.account");
                    if (p0Var != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11399x9e1038c2 activityC11399x9e1038c2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.a1) p0Var).f155237a.f155324c;
                        activityC11399x9e1038c2.f154804e = bundle;
                        activityC11399x9e1038c2.finish();
                    }
                    android.content.ContentValues contentValues = new android.content.ContentValues();
                    contentValues.put("account_name", c18);
                    contentValues.put("account_type", "com.tencent.mm.account");
                    contentValues.put("should_sync", (java.lang.Integer) 1);
                    contentValues.put("ungrouped_visible", (java.lang.Integer) 1);
                    context.getContentResolver().insert(android.provider.ContactsContract.Settings.CONTENT_URI, contentValues);
                    c17 = 1;
                }
                if (p0Var != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11399x9e1038c2 activityC11399x9e1038c22 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.a1) p0Var).f155237a.f155324c;
                    activityC11399x9e1038c22.f154804e = null;
                    activityC11399x9e1038c22.finish();
                }
                c17 = 2;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11399x9e1038c2 activityC11399x9e1038c23 = this.f155324c;
        if (c17 == 2) {
            dp.a.m125854x26a183b(context, activityC11399x9e1038c23.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bkm), 1).show();
            return 1;
        }
        if (c17 != 3) {
            return 0;
        }
        dp.a.m125854x26a183b(context, activityC11399x9e1038c23.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bkl), 1).show();
        return 1;
    }
}
