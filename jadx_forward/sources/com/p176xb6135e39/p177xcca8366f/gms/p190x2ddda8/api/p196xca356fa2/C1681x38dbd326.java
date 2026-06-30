package com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2;

/* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInClient */
/* loaded from: classes13.dex */
public class C1681x38dbd326 extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1746xcf54ed01<com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3> {

    /* renamed from: zzef */
    private static final com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1681x38dbd326.zzd f5660x394be1 = new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1681x38dbd326.zzd(null);

    /* renamed from: zzeg */
    private static int f5661x394be2 = com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1681x38dbd326.zze.f5662x394be4;

    /* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInClient$zzd */
    /* loaded from: classes13.dex */
    public static class zzd implements com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1922x695faa96.ResultConverter<com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1684x5216a778, com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1679x69269632> {
        private zzd() {
        }

        public /* synthetic */ zzd(com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.zzd zzdVar) {
            this();
        }

        @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1922x695faa96.ResultConverter
        /* renamed from: convert */
        public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1679x69269632 mo17330x38b81db3(com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1684x5216a778 c1684x5216a778) {
            return c1684x5216a778.m17537xf0fc1455();
        }
    }

    /* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInClient$zze */
    /* loaded from: classes13.dex */
    public enum zze {

        /* renamed from: zzei */
        public static final int f5662x394be4 = 1;

        /* renamed from: zzej */
        public static final int f5663x394be5 = 2;

        /* renamed from: zzek */
        public static final int f5664x394be6 = 3;

        /* renamed from: zzel */
        public static final int f5665x394be7 = 4;

        /* renamed from: zzem */
        private static final /* synthetic */ int[] f5666x394be8 = {1, 2, 3, 4};

        /* renamed from: values$50KLMJ33DTMIUPRFDTJMOP9FC5N68SJFD5I2UPRDECNM2TBKD0NM2S395TPMIPRED5N2UHRFDTJMOPAJD5JMSIBE8DM6IPBEEGI4IRBGDHIMQPBEEHGN8QBFDOTG____0 */
        public static int[] m17509xd6228de2() {
            return (int[]) f5666x394be8.clone();
        }
    }

    public C1681x38dbd326(android.app.Activity activity, com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3 c1682x64d992a3) {
        super(activity, com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.C1645x1f51c8.f5373xf9fae79c, c1682x64d992a3, (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1792x8e82d8fe) new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1767x9f30616());
    }

    private final synchronized int zzl() {
        if (f5661x394be2 == com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1681x38dbd326.zze.f5662x394be4) {
            android.content.Context m17757x6e669035 = m17757x6e669035();
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1705x2db7dcfc m17618x9cf0d20b = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1705x2db7dcfc.m17618x9cf0d20b();
            int mo17631x402556f4 = m17618x9cf0d20b.mo17631x402556f4(m17757x6e669035, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1713x90a1c9c9.f5840x7aedca50);
            f5661x394be2 = mo17631x402556f4 == 0 ? com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1681x38dbd326.zze.f5665x394be7 : (m17618x9cf0d20b.mo17626x91cd42da(m17757x6e669035, mo17631x402556f4, null) != null || com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501.m18689x208f4963(m17757x6e669035, "com.google.android.gms.auth.api.fallback") == 0) ? com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1681x38dbd326.zze.f5663x394be5 : com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1681x38dbd326.zze.f5664x394be6;
        }
        return f5661x394be2;
    }

    /* renamed from: getSignInIntent */
    public android.content.Intent m17504xc37ac774() {
        android.content.Context m17757x6e669035 = m17757x6e669035();
        int i17 = com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.zzd.f5708x394be3[zzl() - 1];
        return i17 != 1 ? i17 != 2 ? com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.zzi.zzf(m17757x6e669035, m17756x101fab1a()) : com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.zzi.zzd(m17757x6e669035, m17756x101fab1a()) : com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.zzi.zze(m17757x6e669035, m17756x101fab1a());
    }

    /* renamed from: revokeAccess */
    public com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Void> m17505xcd5c338a() {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1922x695faa96.m18196x8941d8d4(com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.zzi.zze(m17741xb77111ba(), m17757x6e669035(), zzl() == com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1681x38dbd326.zze.f5664x394be6));
    }

    /* renamed from: signOut */
    public com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Void> m17506x7c782451() {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1922x695faa96.m18196x8941d8d4(com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.zzi.zzd(m17741xb77111ba(), m17757x6e669035(), zzl() == com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1681x38dbd326.zze.f5664x394be6));
    }

    /* renamed from: silentSignIn */
    public com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1679x69269632> m17507x43449877() {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1922x695faa96.m18195xcc3602a0(com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.zzi.zzd(m17741xb77111ba(), m17757x6e669035(), m17756x101fab1a(), zzl() == com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1681x38dbd326.zze.f5664x394be6), f5660x394be1);
    }

    public C1681x38dbd326(android.content.Context context, com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3 c1682x64d992a3) {
        super(context, com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.C1645x1f51c8.f5373xf9fae79c, c1682x64d992a3, new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1767x9f30616());
    }
}
