package gi3;

/* loaded from: classes10.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f353809a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f353810b;

    /* renamed from: c, reason: collision with root package name */
    public int f353811c;

    /* renamed from: d, reason: collision with root package name */
    public int f353812d;

    /* renamed from: e, reason: collision with root package name */
    public int f353813e;

    /* renamed from: f, reason: collision with root package name */
    public int f353814f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f353815g;

    /* renamed from: h, reason: collision with root package name */
    public int f353816h;

    /* renamed from: i, reason: collision with root package name */
    public int f353817i;

    /* renamed from: j, reason: collision with root package name */
    public int f353818j;

    /* renamed from: k, reason: collision with root package name */
    public int f353819k;

    public b(int i17) {
        if (i17 == 1) {
            this.f353809a = 2;
            return;
        }
        if (i17 == 2) {
            this.f353809a = 4;
        } else if (i17 == 512) {
            this.f353809a = 3;
        } else if (i17 == 4) {
            this.f353809a = 8;
        }
    }

    /* renamed from: toString */
    public java.lang.String m131649x9616526c() {
        return "VideoEditDetailData{scene=" + this.f353809a + ", isCancel=" + this.f353810b + ", rawDuration=" + this.f353811c + ", cropDuration=" + this.f353812d + ", emojiItemCount=" + this.f353813e + ", textItemCount=" + this.f353814f + ", isCrop=" + this.f353815g + ", undoCount=" + this.f353816h + ", doodleCount=" + this.f353817i + ", penColors=" + this.f353818j + ", textColor=" + this.f353819k + '}';
    }
}
