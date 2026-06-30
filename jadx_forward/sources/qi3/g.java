package qi3;

/* loaded from: classes8.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f445235d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f445236e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f445237f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i17, java.lang.String str, java.lang.String str2) {
        super(1);
        this.f445235d = i17;
        this.f445236e = str;
        this.f445237f = str2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.fr pack = (r45.fr) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pack, "pack");
        r45.hr hrVar = new r45.hr();
        hrVar.f457928e = this.f445235d;
        java.lang.String str = this.f445236e;
        java.lang.String str2 = this.f445237f;
        if (str != null || str2 != null) {
            r45.sr srVar = new r45.sr();
            if (str == null) {
                str = "";
            }
            srVar.f467464d = str;
            if (str2 == null) {
                str2 = "";
            }
            srVar.f467465e = str2;
            hrVar.f457929f = srVar;
        }
        pack.f456102u = hrVar;
        return jz5.f0.f384359a;
    }
}
