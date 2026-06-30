package pi;

/* loaded from: classes12.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f436031a;

    /* renamed from: b, reason: collision with root package name */
    public int f436032b;

    public e() {
        this.f436032b = 0;
        this.f436031a = "";
    }

    public void a() {
        int i17 = this.f436032b - 1;
        this.f436032b = i17;
        if (i17 == 0) {
            ((java.util.concurrent.ConcurrentHashMap) pi.f.f436034b).remove(this.f436031a);
        }
    }

    public e(java.lang.String str) {
        this.f436032b = 0;
        this.f436031a = str;
    }
}
