package mx0;

/* loaded from: classes4.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f413937a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f413938b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f413939c;

    public w(java.lang.String musicId, java.lang.String musicName, java.lang.String singerNames) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicId, "musicId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicName, "musicName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(singerNames, "singerNames");
        this.f413937a = musicId;
        this.f413938b = musicName;
        this.f413939c = singerNames;
    }

    /* renamed from: equals */
    public boolean m148538xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mx0.w)) {
            return false;
        }
        mx0.w wVar = (mx0.w) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f413937a, wVar.f413937a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f413938b, wVar.f413938b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f413939c, wVar.f413939c);
    }

    /* renamed from: hashCode */
    public int m148539x8cdac1b() {
        return (((this.f413937a.hashCode() * 31) + this.f413938b.hashCode()) * 31) + this.f413939c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m148540x9616526c() {
        return "MusicShowInfo(musicId=" + this.f413937a + ", musicName=" + this.f413938b + ", singerNames=" + this.f413939c + ')';
    }
}
