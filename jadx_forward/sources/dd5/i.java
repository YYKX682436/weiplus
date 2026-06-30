package dd5;

/* loaded from: classes8.dex */
public final class i implements uc5.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.CharSequence f310699a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.CharSequence f310700b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f310701c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f310702d;

    public i(java.lang.CharSequence title, java.lang.CharSequence desc, java.lang.String imgPath, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imgPath, "imgPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        this.f310699a = title;
        this.f310700b = desc;
        this.f310701c = imgPath;
        this.f310702d = msgInfo;
    }

    @Override // uc5.r0
    public java.util.List a() {
        return kz5.c0.i(this.f310699a, this.f310700b);
    }

    /* renamed from: equals */
    public boolean m124033xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd5.i)) {
            return false;
        }
        dd5.i iVar = (dd5.i) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310699a, iVar.f310699a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310700b, iVar.f310700b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310701c, iVar.f310701c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310702d, iVar.f310702d);
    }

    /* renamed from: hashCode */
    public int m124034x8cdac1b() {
        return (((((this.f310699a.hashCode() * 31) + this.f310700b.hashCode()) * 31) + this.f310701c.hashCode()) * 31) + this.f310702d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m124035x9616526c() {
        return "ViewModel(title=" + ((java.lang.Object) this.f310699a) + ", desc=" + ((java.lang.Object) this.f310700b) + ", imgPath=" + this.f310701c + ", msgInfo=" + this.f310702d + ')';
    }
}
