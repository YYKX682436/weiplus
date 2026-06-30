package bd2;

/* loaded from: classes2.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bd2.g f19246d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(bd2.g gVar) {
        super(0);
        this.f19246d = gVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.pigeon.finder.FinderDislikeReasonFetchResult finderDislikeReasonFetchResult = new com.tencent.pigeon.finder.FinderDislikeReasonFetchResult(false, true, null, 4, null);
        bd2.g gVar = this.f19246d;
        gVar.f19256n = finderDislikeReasonFetchResult;
        com.tencent.pigeon.finder.FinderDislikeFlutterAPI finderDislikeFlutterAPI = gVar.f19254i;
        if (finderDislikeFlutterAPI != null) {
            finderDislikeFlutterAPI.updateDislikeReasonFetchResult(finderDislikeReasonFetchResult, bd2.f.f19248d);
        }
        return jz5.f0.f302826a;
    }
}
