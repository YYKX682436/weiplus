package az0;

/* loaded from: classes8.dex */
public final class v1 implements com.tencent.maas.camstudio.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f15961a;

    public v1(yz5.l lVar) {
        this.f15961a = lVar;
    }

    @Override // com.tencent.maas.camstudio.e0
    public final void a(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "first frame did present after switch template: " + str);
        kotlin.jvm.internal.o.d(str);
        this.f15961a.invoke(str);
    }
}
