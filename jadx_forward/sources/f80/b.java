package f80;

/* loaded from: classes12.dex */
public class b extends f80.j implements w65.c {

    /* renamed from: o, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicLong f341609o = new java.util.concurrent.atomic.AtomicLong(0);

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f341610h;

    /* renamed from: i, reason: collision with root package name */
    public final f80.f f341611i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.ref.WeakReference f341612m;

    /* renamed from: n, reason: collision with root package name */
    public final long f341613n;

    public b(java.lang.String str, f80.f fVar, java.lang.ref.WeakReference weakReference, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(str, fVar);
        this.f341610h = str;
        this.f341611i = fVar;
        this.f341612m = weakReference;
        this.f341613n = f341609o.incrementAndGet();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        w65.m other = (w65.m) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        if (!(other instanceof f80.b)) {
            return 0;
        }
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.j(this.f341613n, ((f80.b) other).f341613n);
    }

    @Override // w65.m
    public java.lang.String id() {
        return "default_img_attach_" + this.f341610h + '_' + this.f341613n;
    }

    @Override // w65.m
    public java.lang.Class z1() {
        return com.p314xaae8f345.mm.p689xc5a27af6.img.p752x363585.C10617xf959a3de.class;
    }
}
