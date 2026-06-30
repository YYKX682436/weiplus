package yu0;

/* loaded from: classes5.dex */
public final class a implements yu0.r {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f547306a;

    /* renamed from: b, reason: collision with root package name */
    public final long f547307b;

    /* renamed from: c, reason: collision with root package name */
    public final float f547308c;

    /* renamed from: d, reason: collision with root package name */
    public final yu0.n f547309d;

    /* renamed from: e, reason: collision with root package name */
    public final yu0.o f547310e;

    public a(java.lang.String voiceID, long j17, float f17, yu0.n audioParams, yu0.o postRequestParams) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(voiceID, "voiceID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audioParams, "audioParams");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(postRequestParams, "postRequestParams");
        this.f547306a = voiceID;
        this.f547307b = j17;
        this.f547308c = f17;
        this.f547309d = audioParams;
        this.f547310e = postRequestParams;
    }

    /* renamed from: equals */
    public boolean m177655xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yu0.a)) {
            return false;
        }
        yu0.a aVar = (yu0.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f547306a, aVar.f547306a) && this.f547307b == aVar.f547307b && java.lang.Float.compare(this.f547308c, aVar.f547308c) == 0 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f547309d, aVar.f547309d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f547310e, aVar.f547310e);
    }

    /* renamed from: hashCode */
    public int m177656x8cdac1b() {
        return (((((((this.f547306a.hashCode() * 31) + java.lang.Long.hashCode(this.f547307b)) * 31) + java.lang.Float.hashCode(this.f547308c)) * 31) + this.f547309d.m177671x8cdac1b()) * 31) + this.f547310e.m177674x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m177657x9616526c() {
        return "ASRPartTaskRequest(voiceID=" + this.f547306a + ", timeOffsetMs=" + this.f547307b + ", speed=" + this.f547308c + ", audioParams=" + this.f547309d + ", postRequestParams=" + this.f547310e + ')';
    }
}
