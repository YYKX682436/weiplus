package bf3;

/* loaded from: classes7.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bf3.z f101198d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f101199e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(bf3.z zVar, java.lang.String str) {
        super(0);
        this.f101198d = zVar;
        this.f101199e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        bf3.z zVar = this.f101198d;
        boolean z17 = zVar.f101219k;
        java.lang.String str = this.f101199e;
        if (z17 && zVar.f101218j) {
            bf3.z.d(zVar, str);
        } else {
            zVar.f101216h.add(str);
        }
        return jz5.f0.f384359a;
    }
}
