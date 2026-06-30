package hk0;

/* loaded from: classes3.dex */
public final class d extends hk0.a {

    /* renamed from: b, reason: collision with root package name */
    public final hk0.l f363246b;

    /* renamed from: c, reason: collision with root package name */
    public final xk0.c f363247c;

    /* renamed from: d, reason: collision with root package name */
    public final int f363248d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f363249e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(hk0.l type, xk0.c cropItem, int i17, boolean z17) {
        super(type);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cropItem, "cropItem");
        this.f363246b = type;
        this.f363247c = cropItem;
        this.f363248d = i17;
        this.f363249e = z17;
    }

    /* renamed from: equals */
    public boolean m133623xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hk0.d)) {
            return false;
        }
        hk0.d dVar = (hk0.d) obj;
        return this.f363246b == dVar.f363246b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f363247c, dVar.f363247c) && this.f363248d == dVar.f363248d && this.f363249e == dVar.f363249e;
    }

    /* renamed from: hashCode */
    public int m133624x8cdac1b() {
        return (((((this.f363246b.hashCode() * 31) + this.f363247c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f363248d)) * 31) + java.lang.Boolean.hashCode(this.f363249e);
    }

    /* renamed from: toString */
    public java.lang.String m133625x9616526c() {
        return "CropEditData(type=" + this.f363246b + ", cropItem=" + this.f363247c + ", rotate=" + this.f363248d + ", currentHasCrop=" + this.f363249e + ')';
    }
}
