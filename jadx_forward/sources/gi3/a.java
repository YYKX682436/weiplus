package gi3;

/* loaded from: classes10.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f353807a;

    /* renamed from: b, reason: collision with root package name */
    public final int f353808b;

    public a(int i17) {
        this.f353808b = 2;
        if (i17 == 1) {
            this.f353807a = 1;
            return;
        }
        if (i17 == 2) {
            this.f353807a = 2;
            return;
        }
        if (i17 == 512) {
            this.f353808b = 1;
            this.f353807a = 2;
        } else if (i17 == 4) {
            this.f353807a = 4;
        }
    }

    /* renamed from: toString */
    public java.lang.String m131648x9616526c() {
        return "VideoEditCountData{scene=" + this.f353807a + ", source=" + this.f353808b + '}';
    }
}
