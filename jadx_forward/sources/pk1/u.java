package pk1;

/* loaded from: classes12.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f437055a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f437056b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f437057c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f437058d;

    public u(java.lang.String srcUrl, java.lang.String downloadId, java.lang.String cachePath, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(srcUrl, "srcUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(downloadId, "downloadId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cachePath, "cachePath");
        this.f437055a = srcUrl;
        this.f437056b = downloadId;
        this.f437057c = cachePath;
        this.f437058d = z17;
    }

    public static pk1.u a(pk1.u uVar, java.lang.String srcUrl, java.lang.String downloadId, java.lang.String cachePath, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            srcUrl = uVar.f437055a;
        }
        if ((i17 & 2) != 0) {
            downloadId = uVar.f437056b;
        }
        if ((i17 & 4) != 0) {
            cachePath = uVar.f437057c;
        }
        if ((i17 & 8) != 0) {
            z17 = uVar.f437058d;
        }
        uVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(srcUrl, "srcUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(downloadId, "downloadId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cachePath, "cachePath");
        return new pk1.u(srcUrl, downloadId, cachePath, z17);
    }

    /* renamed from: equals */
    public boolean m158627xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pk1.u)) {
            return false;
        }
        pk1.u uVar = (pk1.u) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f437055a, uVar.f437055a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f437056b, uVar.f437056b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f437057c, uVar.f437057c) && this.f437058d == uVar.f437058d;
    }

    /* renamed from: hashCode */
    public int m158628x8cdac1b() {
        return (((((this.f437055a.hashCode() * 31) + this.f437056b.hashCode()) * 31) + this.f437057c.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f437058d);
    }

    /* renamed from: toString */
    public java.lang.String m158629x9616526c() {
        return "CacheInfo(srcUrl=" + this.f437055a + ", downloadId=" + this.f437056b + ", cachePath=" + this.f437057c + ", isCacheFinished=" + this.f437058d + ')';
    }
}
