package i33;

/* loaded from: classes5.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f369809a;

    /* renamed from: b, reason: collision with root package name */
    public final long f369810b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f369811c;

    /* renamed from: d, reason: collision with root package name */
    public long f369812d;

    /* renamed from: e, reason: collision with root package name */
    public int f369813e;

    public v(java.lang.String ticket, long j17, java.lang.String str, long j18, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        str = (i18 & 4) != 0 ? "" : str;
        j18 = (i18 & 8) != 0 ? 0L : j18;
        i17 = (i18 & 16) != 0 ? 0 : i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ticket, "ticket");
        this.f369809a = ticket;
        this.f369810b = j17;
        this.f369811c = str;
        this.f369812d = j18;
        this.f369813e = i17;
    }

    /* renamed from: equals */
    public boolean m134689xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i33.v)) {
            return false;
        }
        i33.v vVar = (i33.v) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f369809a, vVar.f369809a) && this.f369810b == vVar.f369810b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f369811c, vVar.f369811c) && this.f369812d == vVar.f369812d && this.f369813e == vVar.f369813e;
    }

    /* renamed from: hashCode */
    public int m134690x8cdac1b() {
        int hashCode = ((this.f369809a.hashCode() * 31) + java.lang.Long.hashCode(this.f369810b)) * 31;
        java.lang.String str = this.f369811c;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Long.hashCode(this.f369812d)) * 31) + java.lang.Integer.hashCode(this.f369813e);
    }

    /* renamed from: toString */
    public java.lang.String m134691x9616526c() {
        return "AlbumQueryMediaItemSessionReportData(ticket=" + this.f369809a + ", queryStartTime=" + this.f369810b + ", queryFolderName=" + this.f369811c + ", queryFinishTime=" + this.f369812d + ", queryItemCount=" + this.f369813e + ')';
    }
}
