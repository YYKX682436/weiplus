package com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd;

/* loaded from: classes13.dex */
public final class zzi {

    /* renamed from: zzer */
    private static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p209x1466cb5f.C1959x87fce1b0 f5697x394bed = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p209x1466cb5f.C1959x87fce1b0("GoogleSignInCommon", new java.lang.String[0]);

    /* renamed from: getSignInResultFromIntent */
    public static com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1684x5216a778 m17566x13f699bb(android.content.Intent intent) {
        if (intent == null) {
            return null;
        }
        if (!intent.hasExtra("googleSignInStatus") && !intent.hasExtra("googleSignInAccount")) {
            return null;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1679x69269632 c1679x69269632 = (com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1679x69269632) intent.getParcelableExtra("googleSignInAccount");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 c1763x9432bc12 = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12) intent.getParcelableExtra("googleSignInStatus");
        if (c1679x69269632 != null) {
            c1763x9432bc12 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12.f5903x535c1c1;
        }
        return new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1684x5216a778(c1679x69269632, c1763x9432bc12);
    }

    public static android.content.Intent zzd(android.content.Context context, com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3 c1682x64d992a3) {
        f5697x394bed.d("getSignInIntent()", new java.lang.Object[0]);
        com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.C1690xfec9ac34 c1690xfec9ac34 = new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.C1690xfec9ac34(context.getPackageName(), c1682x64d992a3);
        android.content.Intent intent = new android.content.Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.ActivityC1691x1b6915e2.class);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("config", c1690xfec9ac34);
        intent.putExtra("config", bundle);
        return intent;
    }

    public static android.content.Intent zze(android.content.Context context, com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3 c1682x64d992a3) {
        f5697x394bed.d("getFallbackSignInIntent()", new java.lang.Object[0]);
        android.content.Intent zzd = zzd(context, c1682x64d992a3);
        zzd.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
        return zzd;
    }

    public static android.content.Intent zzf(android.content.Context context, com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3 c1682x64d992a3) {
        f5697x394bed.d("getNoImplementationSignInIntent()", new java.lang.Object[0]);
        android.content.Intent zzd = zzd(context, c1682x64d992a3);
        zzd.setAction("com.google.android.gms.auth.NO_IMPL");
        return zzd;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1751x8d3920f4<com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1684x5216a778> zzd(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c r5, android.content.Context r6, com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3 r7, boolean r8) {
        /*
            com.google.android.gms.common.logging.Logger r0 = com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.zzi.f5697x394bed
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "silentSignIn()"
            r0.d(r3, r2)
            com.google.android.gms.common.logging.Logger r0 = com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.zzi.f5697x394bed
            java.lang.String r2 = "getEligibleSavedSignInResult()"
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r0.d(r2, r3)
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(r7)
            com.google.android.gms.auth.api.signin.internal.zzq r0 = com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.zzq.zze(r6)
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r0 = r0.zzp()
            r2 = 0
            if (r0 == 0) goto L87
            android.accounts.Account r3 = r0.m17512xf7a0c5f7()
            android.accounts.Account r4 = r7.m17512xf7a0c5f7()
            if (r3 != 0) goto L31
            if (r4 != 0) goto L2f
            r3 = 1
            goto L35
        L2f:
            r3 = r1
            goto L35
        L31:
            boolean r3 = r3.equals(r4)
        L35:
            if (r3 == 0) goto L87
            boolean r3 = r7.m17521x9500e1ac()
            if (r3 != 0) goto L87
            boolean r3 = r7.m17520x5de030ba()
            if (r3 == 0) goto L57
            boolean r3 = r0.m17520x5de030ba()
            if (r3 == 0) goto L87
            java.lang.String r3 = r7.m17517x2ee3a39f()
            java.lang.String r4 = r0.m17517x2ee3a39f()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L87
        L57:
            java.util.HashSet r3 = new java.util.HashSet
            java.util.ArrayList r0 = r0.m17516x2efbaf95()
            r3.<init>(r0)
            java.util.HashSet r0 = new java.util.HashSet
            java.util.ArrayList r4 = r7.m17516x2efbaf95()
            r0.<init>(r4)
            boolean r0 = r3.containsAll(r0)
            if (r0 == 0) goto L87
            com.google.android.gms.auth.api.signin.internal.zzq r0 = com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.zzq.zze(r6)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r0 = r0.zzo()
            if (r0 == 0) goto L87
            boolean r3 = r0.m17496x8f67ee9b()
            if (r3 != 0) goto L87
            com.google.android.gms.auth.api.signin.GoogleSignInResult r3 = new com.google.android.gms.auth.api.signin.GoogleSignInResult
            com.google.android.gms.common.api.Status r4 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12.f5903x535c1c1
            r3.<init>(r0, r4)
            goto L88
        L87:
            r3 = r2
        L88:
            if (r3 == 0) goto L98
            com.google.android.gms.common.logging.Logger r6 = com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.zzi.f5697x394bed
            java.lang.String r7 = "Eligible saved sign in result found"
            java.lang.Object[] r8 = new java.lang.Object[r1]
            r6.d(r7, r8)
            com.google.android.gms.common.api.OptionalPendingResult r5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1753x7e6f6e7f.m17826xbf19b063(r3, r5)
            return r5
        L98:
            if (r8 == 0) goto Laa
            com.google.android.gms.auth.api.signin.GoogleSignInResult r6 = new com.google.android.gms.auth.api.signin.GoogleSignInResult
            com.google.android.gms.common.api.Status r7 = new com.google.android.gms.common.api.Status
            r8 = 4
            r7.<init>(r8)
            r6.<init>(r2, r7)
            com.google.android.gms.common.api.OptionalPendingResult r5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1753x7e6f6e7f.m17826xbf19b063(r6, r5)
            return r5
        Laa:
            com.google.android.gms.common.logging.Logger r8 = com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.zzi.f5697x394bed
            java.lang.String r0 = "trySilentSignIn()"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r8.d(r0, r1)
            com.google.android.gms.auth.api.signin.internal.zzj r8 = new com.google.android.gms.auth.api.signin.internal.zzj
            r8.<init>(r5, r6, r7)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r5 = r5.mo17776xa0f98e08(r8)
            com.google.android.gms.common.api.internal.OptionalPendingResultImpl r6 = new com.google.android.gms.common.api.internal.OptionalPendingResultImpl
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.zzi.zzd(com.google.android.gms.common.api.GoogleApiClient, android.content.Context, com.google.android.gms.auth.api.signin.GoogleSignInOptions, boolean):com.google.android.gms.common.api.OptionalPendingResult");
    }

    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12> zze(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, android.content.Context context, boolean z17) {
        f5697x394bed.d("Revoking access", new java.lang.Object[0]);
        java.lang.String m17555xc1077f4f = com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.C1692xf2e8da5b.m17551x9cf0d20b(context).m17555xc1077f4f();
        zzd(context);
        return z17 ? com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.zze.zzg(m17555xc1077f4f) : abstractC1748xd28d482c.mo17777xb158f775(new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.zzn(abstractC1748xd28d482c));
    }

    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12> zzd(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, android.content.Context context, boolean z17) {
        f5697x394bed.d("Signing out", new java.lang.Object[0]);
        zzd(context);
        return z17 ? com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1753x7e6f6e7f.m17828xbf19b063(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12.f5903x535c1c1, abstractC1748xd28d482c) : abstractC1748xd28d482c.mo17777xb158f775(new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.zzl(abstractC1748xd28d482c));
    }

    private static void zzd(android.content.Context context) {
        com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.zzq.zze(context).m17569x5a5b64d();
        java.util.Iterator<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c> it = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.m17768x7476751d().iterator();
        while (it.hasNext()) {
            it.next().mo17789xc5bb8ac9();
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1775x7d99476c.m17890x4787e47d();
    }
}
