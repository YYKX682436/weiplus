package pi;

/* loaded from: classes12.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.StringBuilder f436029a = new java.lang.StringBuilder();

    public pi.c a(java.lang.String str) {
        java.lang.StringBuilder sb6 = this.f436029a;
        sb6.append(str);
        sb6.append("\n");
        return this;
    }

    public pi.c b() {
        java.lang.StringBuilder sb6 = this.f436029a;
        sb6.append("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        sb6.append("\n");
        return this;
    }

    public pi.c c(java.lang.String str, int i17) {
        java.lang.StringBuilder sb6 = this.f436029a;
        if (i17 > 0) {
            for (int i18 = 0; i18 < i17; i18++) {
                sb6.append("\t");
            }
        }
        sb6.append(str);
        sb6.append("\n");
        return this;
    }

    /* renamed from: toString */
    public java.lang.String m158556x9616526c() {
        return this.f436029a.toString();
    }
}
