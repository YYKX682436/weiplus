package fu0;

/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f348331a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g f348332b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g f348333c;

    /* renamed from: d, reason: collision with root package name */
    public final int f348334d;

    public m(java.util.List imagePaths, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imagePaths, "imagePaths");
        this.f348331a = imagePaths;
        this.f348332b = gVar;
        this.f348333c = gVar2;
        this.f348334d = i17;
    }

    /* renamed from: equals */
    public boolean m130462xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fu0.m)) {
            return false;
        }
        fu0.m mVar = (fu0.m) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f348331a, mVar.f348331a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f348332b, mVar.f348332b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f348333c, mVar.f348333c) && this.f348334d == mVar.f348334d;
    }

    /* renamed from: hashCode */
    public int m130463x8cdac1b() {
        int hashCode = this.f348331a.hashCode() * 31;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f348332b;
        int hashCode2 = (hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f348333c;
        return ((hashCode2 + (gVar2 != null ? gVar2.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f348334d);
    }

    /* renamed from: toString */
    public java.lang.String m130464x9616526c() {
        return "ComposingCreationMusicRecommendContext(imagePaths=" + this.f348331a + ", classifyResultData=" + this.f348332b + ", promptRawText=" + this.f348333c + ", picNum=" + this.f348334d + ')';
    }
}
