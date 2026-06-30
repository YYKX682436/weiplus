package a30;

/* loaded from: classes.dex */
public final class e extends ea5.l {
    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public java.lang.String getProjectId() {
        return "ilinkres_bc3c9fe6";
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public void postProcessAsync(long j17, com.tencent.wechat.aff.udr.x resource) {
        kotlin.jvm.internal.o.g(resource, "resource");
        super.postProcessAsync(j17, resource);
        com.tencent.mars.xlog.Log.i("UDREcsGiftFeatureService", "postProcessAsync, resource: " + resource);
    }
}
