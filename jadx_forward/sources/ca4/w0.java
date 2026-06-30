package ca4;

/* loaded from: classes4.dex */
public class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f121566a;

    /* renamed from: b, reason: collision with root package name */
    public int f121567b;

    /* renamed from: c, reason: collision with root package name */
    public int f121568c;

    /* renamed from: d, reason: collision with root package name */
    public int f121569d;

    /* renamed from: e, reason: collision with root package name */
    public int f121570e;

    /* renamed from: f, reason: collision with root package name */
    public int f121571f;

    /* renamed from: g, reason: collision with root package name */
    public int f121572g;

    /* renamed from: h, reason: collision with root package name */
    public int f121573h;

    /* renamed from: i, reason: collision with root package name */
    public int f121574i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f121575j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f121576k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f121577l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f121578m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f121579n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f121580o;

    /* renamed from: p, reason: collision with root package name */
    public int f121581p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.List f121582q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p956x88360526.C11131x285e79f8 f121583r;

    /* renamed from: s, reason: collision with root package name */
    public ca4.w0 f121584s;

    /* renamed from: t, reason: collision with root package name */
    public long f121585t;

    /* renamed from: u, reason: collision with root package name */
    public r45.h96 f121586u;

    /* renamed from: v, reason: collision with root package name */
    public r45.vb1 f121587v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f121588w;

    public w0(java.lang.String str, int i17) {
        this.f121566a = "";
        this.f121567b = 0;
        this.f121572g = -1;
        this.f121573h = -1;
        this.f121574i = 0;
        this.f121575j = "";
        this.f121576k = "";
        this.f121577l = "";
        this.f121578m = "";
        this.f121579n = "";
        this.f121580o = false;
        this.f121581p = -1;
        this.f121582q = new java.util.ArrayList();
        this.f121585t = 0L;
        this.f121566a = str;
        this.f121570e = i17;
        this.f121571f = -1;
        try {
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_show_ai_follow_tail, false)) {
                java.lang.String i18 = com.p314xaae8f345.mm.vfs.w6.i(str, false);
                if (android.text.TextUtils.isEmpty(i18)) {
                    return;
                }
                p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9 c1098xe10e35e9 = new p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9(i18);
                java.lang.String m7340x351be6 = c1098xe10e35e9.m7340x351be6(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3248x2de8f93);
                java.lang.String m7340x351be62 = c1098xe10e35e9.m7340x351be6(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3252x58f9a604);
                if (!"yuanbao.tencent.com".equals(m7340x351be6) || android.text.TextUtils.isEmpty(m7340x351be62)) {
                    return;
                }
                this.f121588w = m7340x351be62;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUploadElment", "path:%s model:%s", str, m7340x351be62);
            }
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsUploadElment", e17, "parse error", new java.lang.Object[0]);
        }
    }

    public w0(int i17, int i18) {
        this.f121566a = "";
        this.f121567b = 0;
        this.f121572g = -1;
        this.f121573h = -1;
        this.f121574i = 0;
        this.f121575j = "";
        this.f121576k = "";
        this.f121577l = "";
        this.f121578m = "";
        this.f121579n = "";
        this.f121580o = false;
        this.f121581p = -1;
        this.f121582q = new java.util.ArrayList();
        this.f121585t = 0L;
        this.f121571f = i17;
        this.f121570e = i18;
        this.f121566a = "";
    }
}
