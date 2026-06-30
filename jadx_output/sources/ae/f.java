package ae;

/* loaded from: classes7.dex */
public class f extends ud.b {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ae.a f3352g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ae.a aVar, android.content.Context context, com.tencent.mm.plugin.appbrand.jsruntime.t tVar, boolean z17) {
        super(context, tVar, z17);
        this.f3352g = aVar;
    }

    @Override // ud.b, ud.g
    public void d(com.tencent.magicbrush.a aVar) {
        super.d(aVar);
        aVar.e(gh.b.EglSurfaceSwapLocker);
        aVar.f(this.f3352g.O().f47398a.getNativeHandle());
    }
}
