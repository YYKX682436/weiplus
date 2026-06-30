package ae;

/* loaded from: classes7.dex */
public class f extends ud.b {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ae.a f84885g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ae.a aVar, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t tVar, boolean z17) {
        super(context, tVar, z17);
        this.f84885g = aVar;
    }

    @Override // ud.b, ud.g
    public void d(com.p314xaae8f345.p485x5dc4f1ad.a aVar) {
        super.d(aVar);
        aVar.e(gh.b.EglSurfaceSwapLocker);
        aVar.f(this.f84885g.O().f128931a.m43142xdc4f8f95());
    }
}
