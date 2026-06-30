package cl;

/* loaded from: classes7.dex */
public class w implements com.eclipsesource.mmv8.ILoadLibraryDelegate {
    @Override // com.eclipsesource.mmv8.ILoadLibraryDelegate
    public void loadLibrary(java.lang.String str) {
        try {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            java.lang.System.currentTimeMillis();
            cl.x.a();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JSRuntimeCreator", e17, "", new java.lang.Object[0]);
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JSRuntimeCreator", "load so done");
    }
}
