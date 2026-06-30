package yu0;

/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final long f547355a;

    /* renamed from: b, reason: collision with root package name */
    public final long f547356b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f547357c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f547358d;

    public o(long j17, long j18, boolean z17, java.util.List minorLangList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(minorLangList, "minorLangList");
        this.f547355a = j17;
        this.f547356b = j18;
        this.f547357c = z17;
        this.f547358d = minorLangList;
    }

    /* renamed from: equals */
    public boolean m177673xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yu0.o)) {
            return false;
        }
        yu0.o oVar = (yu0.o) obj;
        return this.f547355a == oVar.f547355a && this.f547356b == oVar.f547356b && this.f547357c == oVar.f547357c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f547358d, oVar.f547358d);
    }

    /* renamed from: hashCode */
    public int m177674x8cdac1b() {
        return (((((java.lang.Long.hashCode(this.f547355a) * 31) + java.lang.Long.hashCode(this.f547356b)) * 31) + java.lang.Boolean.hashCode(this.f547357c)) * 31) + this.f547358d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m177675x9616526c() {
        return "PartRequestPostParams(audioDataOffset=" + this.f547355a + ", totalAudioDataLength=" + this.f547356b + ", enableMinorLangTrans=" + this.f547357c + ", minorLangList=" + this.f547358d + ')';
    }
}
