package nq2;

/* loaded from: classes2.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f420511d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(yz5.l lVar) {
        super(1);
        this.f420511d = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        jz5.f0 f0Var;
        az2.w wVar = (az2.w) obj;
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        if (wVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyPreloadManager", "startPreloadSquareTabs hit requestCacheAsync");
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            this.f420511d.mo146xb9724478("requestCacheAsync");
        }
        return f0Var2;
    }
}
