package v12;

/* loaded from: classes5.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v12.i f514039d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(v12.i iVar) {
        super(0);
        this.f514039d = iVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicSnsTimeline", "biz disconnect");
        v12.i iVar = this.f514039d;
        v12.f fVar = iVar.f514040d;
        if (fVar != null) {
            fVar.f514036e = null;
        }
        iVar.f514040d = null;
        return jz5.f0.f384359a;
    }
}
