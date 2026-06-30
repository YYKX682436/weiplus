package az0;

/* loaded from: classes8.dex */
public final class lb implements com.tencent.maas.camstudio.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f15677a;

    public lb(yz5.l lVar) {
        this.f15677a = lVar;
    }

    @Override // com.tencent.maas.camstudio.e0
    public final void a(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "first frame did present after switch template: " + str);
        kotlin.jvm.internal.o.d(str);
        this.f15677a.invoke(str);
    }
}
