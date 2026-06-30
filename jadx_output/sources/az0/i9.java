package az0;

/* loaded from: classes8.dex */
public final class i9 implements com.tencent.maas.camstudio.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f15587a;

    public i9(yz5.l lVar) {
        this.f15587a = lVar;
    }

    @Override // com.tencent.maas.camstudio.e0
    public final void a(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "first frame did present after switch template: " + str);
        kotlin.jvm.internal.o.d(str);
        this.f15587a.invoke(str);
    }
}
