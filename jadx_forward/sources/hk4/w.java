package hk4;

/* loaded from: classes10.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hk4.x f363515d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f363516e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f363517f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(hk4.x xVar, long j17, yz5.a aVar) {
        super(1);
        this.f363515d = xVar;
        this.f363516e = j17;
        this.f363517f = aVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f363515d.f363518k, "seek:" + this.f363516e + " finished");
        yz5.a aVar = this.f363517f;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        return jz5.f0.f384359a;
    }
}
