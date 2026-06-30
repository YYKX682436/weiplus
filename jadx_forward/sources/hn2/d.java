package hn2;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: o, reason: collision with root package name */
    public static final hn2.c f364037o = new hn2.c(null);

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f364038a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f364039b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f364040c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f364041d;

    /* renamed from: e, reason: collision with root package name */
    public int f364042e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f364043f;

    /* renamed from: g, reason: collision with root package name */
    public int f364044g;

    /* renamed from: h, reason: collision with root package name */
    public int f364045h;

    /* renamed from: i, reason: collision with root package name */
    public int f364046i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f364047j;

    /* renamed from: k, reason: collision with root package name */
    public int f364048k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f364049l;

    /* renamed from: m, reason: collision with root package name */
    public hn2.e f364050m;

    /* renamed from: n, reason: collision with root package name */
    public r45.cy1 f364051n;

    public d(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, java.lang.String str5, int i18, int i19, int i27, boolean z17, int i28, boolean z18, hn2.e eVar, r45.cy1 cy1Var, int i29, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        java.lang.String str6 = (i29 & 1) != 0 ? null : str;
        java.lang.String str7 = (i29 & 2) != 0 ? null : str2;
        java.lang.String str8 = (i29 & 4) != 0 ? null : str3;
        java.lang.String str9 = (i29 & 8) != 0 ? null : str4;
        int i37 = (i29 & 16) != 0 ? 0 : i17;
        java.lang.String str10 = (i29 & 32) != 0 ? null : str5;
        int i38 = (i29 & 64) != 0 ? 0 : i18;
        int i39 = (i29 & 128) != 0 ? 0 : i19;
        int i47 = (i29 & 256) != 0 ? 0 : i27;
        boolean z19 = (i29 & 512) != 0 ? false : z17;
        int i48 = (i29 & 1024) != 0 ? 0 : i28;
        boolean z27 = (i29 & 2048) == 0 ? z18 : false;
        hn2.e eVar2 = (i29 & 4096) != 0 ? null : eVar;
        r45.cy1 cy1Var2 = (i29 & 8192) == 0 ? cy1Var : null;
        this.f364038a = str6;
        this.f364039b = str7;
        this.f364040c = str8;
        this.f364041d = str9;
        this.f364042e = i37;
        this.f364043f = str10;
        this.f364044g = i38;
        this.f364045h = i39;
        this.f364046i = i47;
        this.f364047j = z19;
        this.f364048k = i48;
        this.f364049l = z27;
        this.f364050m = eVar2;
        this.f364051n = cy1Var2;
    }

    public final int a() {
        hn2.e eVar;
        int i17;
        if (this.f364049l && (eVar = this.f364050m) != null) {
            int i18 = eVar.f364054c;
            return (i18 <= 0 || (i17 = eVar.f364053b) < 0 || i18 <= i17) ? this.f364042e : (int) ((i18 - i17) / 1000.0d);
        }
        return this.f364042e;
    }

    public final r45.zr5 b() {
        boolean z17;
        r45.cy1 cy1Var = this.f364051n;
        if (cy1Var == null) {
            return null;
        }
        java.util.LinkedList linkedList = cy1Var.f453453d;
        boolean z18 = true;
        boolean z19 = false;
        if (linkedList != null && !linkedList.isEmpty()) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                if (((r45.ec6) it.next()).f454805d == 3) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        if (linkedList != null) {
            if (!linkedList.isEmpty()) {
                java.util.Iterator it6 = linkedList.iterator();
                while (it6.hasNext()) {
                    if (((r45.ec6) it6.next()).f454805d == 4) {
                        break;
                    }
                }
            }
            z18 = false;
            z19 = z18;
        }
        if (z17) {
            return r45.zr5.ResourceInfoType_SongPlayURL;
        }
        if (z19) {
            return r45.zr5.ResourceInfoType_AccPlayURL;
        }
        return null;
    }

    public final boolean c() {
        return this.f364046i == 1;
    }

    /* renamed from: equals */
    public boolean m133815xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hn2.d)) {
            return false;
        }
        hn2.d dVar = (hn2.d) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f364038a, dVar.f364038a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f364039b, dVar.f364039b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f364040c, dVar.f364040c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f364041d, dVar.f364041d) && this.f364042e == dVar.f364042e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f364043f, dVar.f364043f) && this.f364044g == dVar.f364044g && this.f364045h == dVar.f364045h && this.f364046i == dVar.f364046i && this.f364047j == dVar.f364047j && this.f364048k == dVar.f364048k && this.f364049l == dVar.f364049l && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f364050m, dVar.f364050m) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f364051n, dVar.f364051n);
    }

    /* renamed from: hashCode */
    public int m133816x8cdac1b() {
        java.lang.String str = this.f364038a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f364039b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f364040c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f364041d;
        int hashCode4 = (((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + java.lang.Integer.hashCode(this.f364042e)) * 31;
        java.lang.String str5 = this.f364043f;
        int hashCode5 = (((((((((((((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + java.lang.Integer.hashCode(this.f364044g)) * 31) + java.lang.Integer.hashCode(this.f364045h)) * 31) + java.lang.Integer.hashCode(this.f364046i)) * 31) + java.lang.Boolean.hashCode(this.f364047j)) * 31) + java.lang.Integer.hashCode(this.f364048k)) * 31) + java.lang.Boolean.hashCode(this.f364049l)) * 31;
        hn2.e eVar = this.f364050m;
        int m133819x8cdac1b = (hashCode5 + (eVar == null ? 0 : eVar.m133819x8cdac1b())) * 31;
        r45.cy1 cy1Var = this.f364051n;
        return m133819x8cdac1b + (cy1Var != null ? cy1Var.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m133817x9616526c() {
        return "FinderLiveKtvSongBasicInfo(song_mid=" + this.f364038a + ", song_name=" + this.f364039b + ", singer_mid=" + this.f364040c + ", singer_name=" + this.f364041d + ", duration=" + this.f364042e + ", cover=" + this.f364043f + ", has_note=" + this.f364044g + ", has_song_fileid=" + this.f364045h + ", has_added=" + this.f364046i + ", isDownloading=" + this.f364047j + ", downloadProgress=" + this.f364048k + ", onlySingSegment=" + this.f364049l + ", segmentInfo=" + this.f364050m + ", resourceInfo=" + this.f364051n + ')';
    }
}
