package qe5;

/* loaded from: classes12.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe5.z f443717d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f443718e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f443719f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f443720g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f443721h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(qe5.z zVar, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3) {
        super(0);
        this.f443717d = zVar;
        this.f443718e = str;
        this.f443719f = str2;
        this.f443720g = i17;
        this.f443721h = str3;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        j75.f Q6 = this.f443717d.Q6();
        if (Q6 != null) {
            java.lang.String str = this.f443718e;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = this.f443719f;
            Q6.B3(new kd5.l(str, str2 != null ? str2 : "", this.f443720g, this.f443721h));
        }
        return jz5.f0.f384359a;
    }
}
