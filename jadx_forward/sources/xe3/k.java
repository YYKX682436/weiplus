package xe3;

/* loaded from: classes15.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f535486d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ve3.o f535487e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(long j17, ve3.o oVar) {
        super(1);
        this.f535486d = j17;
        this.f535487e = oVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        xe3.f it = (xe3.f) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        ve3.o callback = this.f535487e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MB_External_surface_video_item", "seek " + it);
        it.f535477d.mo162429xc9fc1b13(this.f535486d);
        return jz5.f0.f384359a;
    }
}
