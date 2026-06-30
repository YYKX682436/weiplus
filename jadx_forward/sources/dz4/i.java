package dz4;

/* loaded from: classes12.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f326823a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f326824b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f326825c;

    /* renamed from: d, reason: collision with root package name */
    public long f326826d;

    /* renamed from: e, reason: collision with root package name */
    public int f326827e;

    /* renamed from: f, reason: collision with root package name */
    public int f326828f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f326829g;

    /* renamed from: h, reason: collision with root package name */
    public int f326830h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f326831i;

    /* renamed from: j, reason: collision with root package name */
    public byte[] f326832j;

    /* renamed from: k, reason: collision with root package name */
    public hz4.i f326833k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f326834l;

    public i(int i17, boolean z17, java.lang.String str, long j17, int i18, int i19, boolean z18, int i27, java.lang.String str2, byte[] bArr, hz4.i iVar, java.lang.String str3, int i28, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar2) {
        int i29 = (i28 & 16) != 0 ? com.p314xaae8f345.mm.R.C30854x2dc211.f559419ea : i18;
        int i37 = (i28 & 32) != 0 ? com.p314xaae8f345.mm.R.C30854x2dc211.f559415e6 : i19;
        boolean z19 = (i28 & 64) != 0 ? false : z18;
        int i38 = (i28 & 128) == 0 ? i27 : 0;
        java.lang.String str4 = (i28 & 256) != 0 ? "" : str2;
        byte[] bArr2 = (i28 & 512) != 0 ? null : bArr;
        hz4.i iVar3 = (i28 & 1024) == 0 ? iVar : null;
        java.lang.String str5 = (i28 & 2048) == 0 ? str3 : "";
        this.f326823a = i17;
        this.f326824b = z17;
        this.f326825c = str;
        this.f326826d = j17;
        this.f326827e = i29;
        this.f326828f = i37;
        this.f326829g = z19;
        this.f326830h = i38;
        this.f326831i = str4;
        this.f326832j = bArr2;
        this.f326833k = iVar3;
        this.f326834l = str5;
    }
}
