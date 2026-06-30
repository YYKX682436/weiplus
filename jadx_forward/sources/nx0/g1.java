package nx0;

/* loaded from: classes5.dex */
public final class g1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nx0.x f422648d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nx0.u f422649e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f422650f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(nx0.x xVar, nx0.u uVar, int i17) {
        super(0);
        this.f422648d = xVar;
        this.f422649e = uVar;
        this.f422650f = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        nx0.w wVar = (nx0.w) this.f422648d;
        if (wVar.f422785e) {
            wVar.f422786f = true;
            nx0.u uVar = this.f422649e;
            java.util.List list = uVar.f422765d;
            int i17 = this.f422650f;
            java.lang.Object obj = list.get(i17);
            nx0.w wVar2 = obj instanceof nx0.w ? (nx0.w) obj : null;
            if (wVar2 != null) {
                wVar2.f422785e = false;
            }
            uVar.m8147xed6e4d18(i17);
        }
        return jz5.f0.f384359a;
    }
}
