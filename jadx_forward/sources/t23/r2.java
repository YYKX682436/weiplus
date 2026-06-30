package t23;

/* loaded from: classes10.dex */
public class r2 implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f496788d;

    /* renamed from: e, reason: collision with root package name */
    public final int f496789e;

    /* renamed from: f, reason: collision with root package name */
    public android.media.MediaFormat f496790f;

    /* renamed from: g, reason: collision with root package name */
    public android.media.MediaFormat f496791g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b f496792h;

    /* renamed from: i, reason: collision with root package name */
    public final t23.q2 f496793i;

    public r2(java.lang.String str, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b c15635xf0ea441b, t23.q2 q2Var) {
        this.f496788d = str;
        this.f496789e = i17;
        this.f496792h = c15635xf0ea441b;
        this.f496793i = q2Var;
    }

    /* renamed from: equals */
    public boolean m165765xb2c87fbf(java.lang.Object obj) {
        java.lang.String str;
        if (obj instanceof t23.r2) {
            if (this != obj) {
                t23.r2 r2Var = (t23.r2) obj;
                if (this.f496789e == r2Var.f496789e || ((str = this.f496788d) != null && str.equals(r2Var.f496788d))) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "video_analysis";
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String string;
        gp.c cVar = new gp.c();
        try {
            try {
                cVar.k(this.f496788d);
                int d17 = cVar.d();
                int i17 = 0;
                for (int i18 = 0; i18 < d17; i18++) {
                    android.media.MediaFormat e17 = cVar.e(i18);
                    if (e17.containsKey("mime") && (string = e17.getString("mime")) != null) {
                        if (string.startsWith("video/")) {
                            if (this.f496790f == null) {
                                this.f496790f = e17;
                            }
                        } else if (string.startsWith("audio/") && this.f496791g == null) {
                            this.f496791g = e17;
                        }
                        if (this.f496791g != null && this.f496790f != null) {
                            break;
                        }
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b c15635xf0ea441b = this.f496792h;
                if (c15635xf0ea441b != null) {
                    android.media.MediaFormat mediaFormat = this.f496790f;
                    java.lang.String str = "";
                    if (mediaFormat != null) {
                        c15635xf0ea441b.f219979x = !mediaFormat.containsKey("durationUs") ? 0 : (int) (this.f496790f.getLong("durationUs") / 1000);
                        c15635xf0ea441b.f219980y = !this.f496790f.containsKey("height") ? 0 : this.f496790f.getInteger("height");
                        c15635xf0ea441b.f219981z = !this.f496790f.containsKey("width") ? 0 : this.f496790f.getInteger("width");
                        c15635xf0ea441b.f219977v = !this.f496790f.containsKey("mime") ? "" : this.f496790f.getString("mime");
                        c15635xf0ea441b.A = !this.f496790f.containsKey(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63) ? 0 : this.f496790f.getInteger(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63);
                        c15635xf0ea441b.B = !this.f496790f.containsKey("i-frame-interval") ? 0 : this.f496790f.getInteger("i-frame-interval");
                        if (this.f496790f.containsKey("frame-rate")) {
                            i17 = this.f496790f.getInteger("frame-rate");
                        }
                        c15635xf0ea441b.C = i17;
                    }
                    android.media.MediaFormat mediaFormat2 = this.f496791g;
                    if (mediaFormat2 != null) {
                        if (mediaFormat2.containsKey("mime")) {
                            str = this.f496791g.getString("mime");
                        }
                        c15635xf0ea441b.f219978w = str;
                    }
                }
            } catch (java.lang.Exception e18) {
                e18.getMessage();
            }
            if (this.f496793i == null) {
                return;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new t23.p2(this));
        } finally {
            cVar.g();
        }
    }
}
