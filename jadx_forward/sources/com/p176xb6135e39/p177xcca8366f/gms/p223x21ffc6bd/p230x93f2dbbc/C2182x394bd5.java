package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.zzdy */
/* loaded from: classes16.dex */
public final class C2182x394bd5 {

    /* renamed from: zzacw */
    private final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2247x394c25 f6426x6f02155;

    /* renamed from: zzadl */
    private java.lang.String f6427x6f02169;

    /* renamed from: zzadm */
    private java.lang.String f6428x6f0216a;

    /* renamed from: zzadn */
    private java.lang.String f6429x6f0216b;

    /* renamed from: zzado */
    private java.lang.String f6430x6f0216c;

    /* renamed from: zzadp */
    private long f6431x6f0216d;

    /* renamed from: zzadq */
    private long f6432x6f0216e;

    /* renamed from: zzadr */
    private long f6433x6f0216f;

    /* renamed from: zzads */
    private long f6434x6f02170;

    /* renamed from: zzadt */
    private java.lang.String f6435x6f02171;

    /* renamed from: zzadu */
    private long f6436x6f02172;

    /* renamed from: zzadv */
    private long f6437x6f02173;

    /* renamed from: zzadw */
    private boolean f6438x6f02174;

    /* renamed from: zzadx */
    private long f6439x6f02175;

    /* renamed from: zzady */
    private boolean f6440x6f02176;

    /* renamed from: zzadz */
    private boolean f6441x6f02177;

    /* renamed from: zzaea */
    private long f6442x6f0217d;

    /* renamed from: zzaeb */
    private long f6443x6f0217e;

    /* renamed from: zzaec */
    private long f6444x6f0217f;

    /* renamed from: zzaed */
    private long f6445x6f02180;

    /* renamed from: zzaee */
    private long f6446x6f02181;

    /* renamed from: zzaef */
    private long f6447x6f02182;

    /* renamed from: zzaeg */
    private java.lang.String f6448x6f02183;

    /* renamed from: zzaeh */
    private boolean f6449x6f02184;

    /* renamed from: zzaei */
    private long f6450x6f02185;

    /* renamed from: zzaej */
    private long f6451x6f02186;

    /* renamed from: zzth */
    private java.lang.String f6452x394db4;

    /* renamed from: zzti */
    private final java.lang.String f6453x394db5;

    public C2182x394bd5(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2247x394c25 c2247x394c25, java.lang.String str) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c2247x394c25);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str);
        this.f6426x6f02155 = c2247x394c25;
        this.f6453x394db5 = str;
        c2247x394c25.mo19164x394b61();
    }

    /* renamed from: getAppInstanceId */
    public final java.lang.String m18979x4b6169db() {
        this.f6426x6f02155.mo19164x394b61();
        return this.f6427x6f02169;
    }

    /* renamed from: getGmpAppId */
    public final java.lang.String m18980x9061da68() {
        this.f6426x6f02155.mo19164x394b61();
        return this.f6428x6f0216a;
    }

    /* renamed from: isMeasurementEnabled */
    public final boolean m18981x38846eaf() {
        this.f6426x6f02155.mo19164x394b61();
        return this.f6438x6f02174;
    }

    /* renamed from: setAppVersion */
    public final void m18982x74dac979(java.lang.String str) {
        this.f6426x6f02155.mo19164x394b61();
        this.f6449x6f02184 |= !com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2340x394c96.zzs(this.f6452x394db4, str);
        this.f6452x394db4 = str;
    }

    /* renamed from: setMeasurementEnabled */
    public final void m18983x105dbfe7(boolean z17) {
        this.f6426x6f02155.mo19164x394b61();
        this.f6449x6f02184 |= this.f6438x6f02174 != z17;
        this.f6438x6f02174 = z17;
    }

    /* renamed from: zzaa */
    public final void m18984x394b60(long j17) {
        this.f6426x6f02155.mo19164x394b61();
        this.f6449x6f02184 |= this.f6439x6f02175 != j17;
        this.f6439x6f02175 = j17;
    }

    /* renamed from: zzag */
    public final java.lang.String m18985x394b66() {
        this.f6426x6f02155.mo19164x394b61();
        return this.f6452x394db4;
    }

    /* renamed from: zzah */
    public final java.lang.String m18986x394b67() {
        this.f6426x6f02155.mo19164x394b61();
        return this.f6453x394db5;
    }

    /* renamed from: zzal */
    public final void m18987x394b6b(java.lang.String str) {
        this.f6426x6f02155.mo19164x394b61();
        this.f6449x6f02184 |= !com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2340x394c96.zzs(this.f6427x6f02169, str);
        this.f6427x6f02169 = str;
    }

    /* renamed from: zzam */
    public final void m18988x394b6c(java.lang.String str) {
        this.f6426x6f02155.mo19164x394b61();
        if (android.text.TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f6449x6f02184 |= !com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2340x394c96.zzs(this.f6428x6f0216a, str);
        this.f6428x6f0216a = str;
    }

    /* renamed from: zzan */
    public final void m18989x394b6d(java.lang.String str) {
        this.f6426x6f02155.mo19164x394b61();
        this.f6449x6f02184 |= !com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2340x394c96.zzs(this.f6429x6f0216b, str);
        this.f6429x6f0216b = str;
    }

    /* renamed from: zzao */
    public final void m18990x394b6e(java.lang.String str) {
        this.f6426x6f02155.mo19164x394b61();
        this.f6449x6f02184 |= !com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2340x394c96.zzs(this.f6430x6f0216c, str);
        this.f6430x6f0216c = str;
    }

    /* renamed from: zzap */
    public final void m18991x394b6f(java.lang.String str) {
        this.f6426x6f02155.mo19164x394b61();
        this.f6449x6f02184 |= !com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2340x394c96.zzs(this.f6435x6f02171, str);
        this.f6435x6f02171 = str;
    }

    /* renamed from: zzaq */
    public final void m18992x394b70(java.lang.String str) {
        this.f6426x6f02155.mo19164x394b61();
        this.f6449x6f02184 |= !com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2340x394c96.zzs(this.f6448x6f02183, str);
        this.f6448x6f02183 = str;
    }

    public final void zzd(boolean z17) {
        this.f6426x6f02155.mo19164x394b61();
        this.f6449x6f02184 = this.f6440x6f02176 != z17;
        this.f6440x6f02176 = z17;
    }

    public final void zze(boolean z17) {
        this.f6426x6f02155.mo19164x394b61();
        this.f6449x6f02184 = this.f6441x6f02177 != z17;
        this.f6441x6f02177 = z17;
    }

    /* renamed from: zzgh */
    public final void m18993x394c21() {
        this.f6426x6f02155.mo19164x394b61();
        this.f6449x6f02184 = false;
    }

    /* renamed from: zzgi */
    public final java.lang.String m18994x394c22() {
        this.f6426x6f02155.mo19164x394b61();
        return this.f6429x6f0216b;
    }

    /* renamed from: zzgj */
    public final java.lang.String m18995x394c23() {
        this.f6426x6f02155.mo19164x394b61();
        return this.f6430x6f0216c;
    }

    /* renamed from: zzgk */
    public final long m18996x394c24() {
        this.f6426x6f02155.mo19164x394b61();
        return this.f6432x6f0216e;
    }

    /* renamed from: zzgl */
    public final long m18997x394c25() {
        this.f6426x6f02155.mo19164x394b61();
        return this.f6433x6f0216f;
    }

    /* renamed from: zzgm */
    public final long m18998x394c26() {
        this.f6426x6f02155.mo19164x394b61();
        return this.f6434x6f02170;
    }

    /* renamed from: zzgn */
    public final java.lang.String m18999x394c27() {
        this.f6426x6f02155.mo19164x394b61();
        return this.f6435x6f02171;
    }

    /* renamed from: zzgo */
    public final long m19000x394c28() {
        this.f6426x6f02155.mo19164x394b61();
        return this.f6436x6f02172;
    }

    /* renamed from: zzgp */
    public final long m19001x394c29() {
        this.f6426x6f02155.mo19164x394b61();
        return this.f6437x6f02173;
    }

    /* renamed from: zzgq */
    public final long m19002x394c2a() {
        this.f6426x6f02155.mo19164x394b61();
        return this.f6431x6f0216d;
    }

    /* renamed from: zzgr */
    public final long m19003x394c2b() {
        this.f6426x6f02155.mo19164x394b61();
        return this.f6450x6f02185;
    }

    /* renamed from: zzgs */
    public final long m19004x394c2c() {
        this.f6426x6f02155.mo19164x394b61();
        return this.f6451x6f02186;
    }

    /* renamed from: zzgt */
    public final void m19005x394c2d() {
        this.f6426x6f02155.mo19164x394b61();
        long j17 = this.f6431x6f0216d + 1;
        if (j17 > 2147483647L) {
            this.f6426x6f02155.mo18976x394c1e().m19111x394c67().zzg("Bundle index overflow. appId", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(this.f6453x394db5));
            j17 = 0;
        }
        this.f6449x6f02184 = true;
        this.f6431x6f0216d = j17;
    }

    /* renamed from: zzgu */
    public final long m19006x394c2e() {
        this.f6426x6f02155.mo19164x394b61();
        return this.f6442x6f0217d;
    }

    /* renamed from: zzgv */
    public final long m19007x394c2f() {
        this.f6426x6f02155.mo19164x394b61();
        return this.f6443x6f0217e;
    }

    /* renamed from: zzgw */
    public final long m19008x394c30() {
        this.f6426x6f02155.mo19164x394b61();
        return this.f6444x6f0217f;
    }

    /* renamed from: zzgx */
    public final long m19009x394c31() {
        this.f6426x6f02155.mo19164x394b61();
        return this.f6445x6f02180;
    }

    /* renamed from: zzgy */
    public final long m19010x394c32() {
        this.f6426x6f02155.mo19164x394b61();
        return this.f6447x6f02182;
    }

    /* renamed from: zzgz */
    public final long m19011x394c33() {
        this.f6426x6f02155.mo19164x394b61();
        return this.f6446x6f02181;
    }

    /* renamed from: zzha */
    public final java.lang.String m19012x394c39() {
        this.f6426x6f02155.mo19164x394b61();
        return this.f6448x6f02183;
    }

    /* renamed from: zzhb */
    public final java.lang.String m19013x394c3a() {
        this.f6426x6f02155.mo19164x394b61();
        java.lang.String str = this.f6448x6f02183;
        m18992x394b70(null);
        return str;
    }

    /* renamed from: zzhc */
    public final long m19014x394c3b() {
        this.f6426x6f02155.mo19164x394b61();
        return this.f6439x6f02175;
    }

    /* renamed from: zzhd */
    public final boolean m19015x394c3c() {
        this.f6426x6f02155.mo19164x394b61();
        return this.f6440x6f02176;
    }

    /* renamed from: zzhe */
    public final boolean m19016x394c3d() {
        this.f6426x6f02155.mo19164x394b61();
        return this.f6441x6f02177;
    }

    public final void zzm(long j17) {
        this.f6426x6f02155.mo19164x394b61();
        this.f6449x6f02184 |= this.f6432x6f0216e != j17;
        this.f6432x6f0216e = j17;
    }

    public final void zzn(long j17) {
        this.f6426x6f02155.mo19164x394b61();
        this.f6449x6f02184 |= this.f6433x6f0216f != j17;
        this.f6433x6f0216f = j17;
    }

    public final void zzo(long j17) {
        this.f6426x6f02155.mo19164x394b61();
        this.f6449x6f02184 |= this.f6434x6f02170 != j17;
        this.f6434x6f02170 = j17;
    }

    public final void zzp(long j17) {
        this.f6426x6f02155.mo19164x394b61();
        this.f6449x6f02184 |= this.f6436x6f02172 != j17;
        this.f6436x6f02172 = j17;
    }

    public final void zzq(long j17) {
        this.f6426x6f02155.mo19164x394b61();
        this.f6449x6f02184 |= this.f6437x6f02173 != j17;
        this.f6437x6f02173 = j17;
    }

    public final void zzr(long j17) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18197x312c1fe5(j17 >= 0);
        this.f6426x6f02155.mo19164x394b61();
        this.f6449x6f02184 |= this.f6431x6f0216d != j17;
        this.f6431x6f0216d = j17;
    }

    public final void zzs(long j17) {
        this.f6426x6f02155.mo19164x394b61();
        this.f6449x6f02184 |= this.f6450x6f02185 != j17;
        this.f6450x6f02185 = j17;
    }

    public final void zzt(long j17) {
        this.f6426x6f02155.mo19164x394b61();
        this.f6449x6f02184 |= this.f6451x6f02186 != j17;
        this.f6451x6f02186 = j17;
    }

    public final void zzu(long j17) {
        this.f6426x6f02155.mo19164x394b61();
        this.f6449x6f02184 |= this.f6442x6f0217d != j17;
        this.f6442x6f0217d = j17;
    }

    public final void zzv(long j17) {
        this.f6426x6f02155.mo19164x394b61();
        this.f6449x6f02184 |= this.f6443x6f0217e != j17;
        this.f6443x6f0217e = j17;
    }

    public final void zzw(long j17) {
        this.f6426x6f02155.mo19164x394b61();
        this.f6449x6f02184 |= this.f6444x6f0217f != j17;
        this.f6444x6f0217f = j17;
    }

    public final void zzx(long j17) {
        this.f6426x6f02155.mo19164x394b61();
        this.f6449x6f02184 |= this.f6445x6f02180 != j17;
        this.f6445x6f02180 = j17;
    }

    public final void zzy(long j17) {
        this.f6426x6f02155.mo19164x394b61();
        this.f6449x6f02184 |= this.f6447x6f02182 != j17;
        this.f6447x6f02182 = j17;
    }

    public final void zzz(long j17) {
        this.f6426x6f02155.mo19164x394b61();
        this.f6449x6f02184 |= this.f6446x6f02181 != j17;
        this.f6446x6f02181 = j17;
    }
}
