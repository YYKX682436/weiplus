package aw1;

/* loaded from: classes12.dex */
public final class h1 implements com.tencent.mm.vfs.n1 {
    @Override // com.tencent.mm.vfs.n1
    public void a(java.lang.String fsName, int i17, long j17) {
        kotlin.jvm.internal.o.g(fsName, "fsName");
        com.tencent.mars.xlog.Log.i("MicroMsg.VFSExpireCallbackManager", "C2C_ORIGIN_IMAGE_VFS_NAME, expire, count = " + i17 + ", size = " + j17);
        aw1.j1.f14563d = j17;
        aw1.j1.f14561b = true;
        if (aw1.j1.f14562c) {
            aw1.j1.f14560a.a();
        }
    }
}
