package c13;

/* loaded from: classes11.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.flutter_voip.VoIPFlutterApi f37883d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z03.f f37884e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f37885f;

    public j(com.tencent.pigeon.flutter_voip.VoIPFlutterApi voIPFlutterApi, z03.f fVar, java.lang.String str) {
        this.f37883d = voIPFlutterApi;
        this.f37884e = fVar;
        this.f37885f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f37883d.onError(this.f37884e.ordinal(), this.f37885f, c13.i.f37882d);
    }
}
