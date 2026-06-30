package ca4;

/* loaded from: classes4.dex */
public class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f40033a;

    /* renamed from: b, reason: collision with root package name */
    public int f40034b;

    /* renamed from: c, reason: collision with root package name */
    public int f40035c;

    /* renamed from: d, reason: collision with root package name */
    public int f40036d;

    /* renamed from: e, reason: collision with root package name */
    public int f40037e;

    /* renamed from: f, reason: collision with root package name */
    public int f40038f;

    /* renamed from: g, reason: collision with root package name */
    public int f40039g;

    /* renamed from: h, reason: collision with root package name */
    public int f40040h;

    /* renamed from: i, reason: collision with root package name */
    public int f40041i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f40042j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f40043k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f40044l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f40045m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f40046n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f40047o;

    /* renamed from: p, reason: collision with root package name */
    public int f40048p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.List f40049q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.modelscan.ScanCodeInfo f40050r;

    /* renamed from: s, reason: collision with root package name */
    public ca4.w0 f40051s;

    /* renamed from: t, reason: collision with root package name */
    public long f40052t;

    /* renamed from: u, reason: collision with root package name */
    public r45.h96 f40053u;

    /* renamed from: v, reason: collision with root package name */
    public r45.vb1 f40054v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f40055w;

    public w0(java.lang.String str, int i17) {
        this.f40033a = "";
        this.f40034b = 0;
        this.f40039g = -1;
        this.f40040h = -1;
        this.f40041i = 0;
        this.f40042j = "";
        this.f40043k = "";
        this.f40044l = "";
        this.f40045m = "";
        this.f40046n = "";
        this.f40047o = false;
        this.f40048p = -1;
        this.f40049q = new java.util.ArrayList();
        this.f40052t = 0L;
        this.f40033a = str;
        this.f40037e = i17;
        this.f40038f = -1;
        try {
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_show_ai_follow_tail, false)) {
                java.lang.String i18 = com.tencent.mm.vfs.w6.i(str, false);
                if (android.text.TextUtils.isEmpty(i18)) {
                    return;
                }
                androidx.exifinterface.media.ExifInterface exifInterface = new androidx.exifinterface.media.ExifInterface(i18);
                java.lang.String attribute = exifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_MAKE);
                java.lang.String attribute2 = exifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_MODEL);
                if (!"yuanbao.tencent.com".equals(attribute) || android.text.TextUtils.isEmpty(attribute2)) {
                    return;
                }
                this.f40055w = attribute2;
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsUploadElment", "path:%s model:%s", str, attribute2);
            }
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsUploadElment", e17, "parse error", new java.lang.Object[0]);
        }
    }

    public w0(int i17, int i18) {
        this.f40033a = "";
        this.f40034b = 0;
        this.f40039g = -1;
        this.f40040h = -1;
        this.f40041i = 0;
        this.f40042j = "";
        this.f40043k = "";
        this.f40044l = "";
        this.f40045m = "";
        this.f40046n = "";
        this.f40047o = false;
        this.f40048p = -1;
        this.f40049q = new java.util.ArrayList();
        this.f40052t = 0L;
        this.f40038f = i17;
        this.f40037e = i18;
        this.f40033a = "";
    }
}
