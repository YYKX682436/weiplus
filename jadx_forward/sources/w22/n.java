package w22;

/* loaded from: classes10.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w22.v f524097d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f524098e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f524099f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(w22.v vVar, boolean z17, java.lang.String str) {
        super(0);
        this.f524097d = vVar;
        this.f524098e = z17;
        this.f524099f = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        w22.v vVar = this.f524097d;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(vVar.f524128p);
        y22.h hVar = vVar.f524115c;
        ((y22.m) hVar).b();
        if (this.f524098e) {
            ((y22.m) hVar).c(true, this.f524099f);
        } else {
            db5.t7.m123882x26a183b(vVar.f524113a, com.p314xaae8f345.mm.R.C30867xcad56011.bwb, 0).show();
            vVar.h();
        }
        return jz5.f0.f384359a;
    }
}
