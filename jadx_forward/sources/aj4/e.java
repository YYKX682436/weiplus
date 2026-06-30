package aj4;

/* loaded from: classes10.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aj4.i f86846d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zi4.r1 f86847e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(aj4.i iVar, zi4.r1 r1Var) {
        super(0);
        this.f86846d = iVar;
        this.f86847e = r1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f86846d.f86861h, "camera permission denied");
        this.f86847e.a(new bw5.hb(), -1L, "camera permission denied");
        return jz5.f0.f384359a;
    }
}
