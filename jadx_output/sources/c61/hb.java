package c61;

/* loaded from: classes8.dex */
public final class hb extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c61.ob f39025d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb(c61.ob obVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f39025d = obVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new c61.hb(this.f39025d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        c61.hb hbVar = (c61.hb) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        hbVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        c61.ob obVar = this.f39025d;
        if (!c61.ob.a(obVar)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FlutterMediaPickerPlugin", "requestPermissions ACCESS_MEDIA_LOCATION");
            tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
            android.app.Activity activity = obVar.f39213e;
            ((sb0.f) jVar).getClass();
            j35.u.i(activity, "android.permission.ACCESS_MEDIA_LOCATION", 1001);
        }
        return jz5.f0.f302826a;
    }
}
