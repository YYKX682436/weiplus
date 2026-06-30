package aw1;

/* loaded from: classes12.dex */
public final class i1 implements com.p314xaae8f345.mm.vfs.n1 {
    @Override // com.p314xaae8f345.mm.vfs.n1
    public void a(java.lang.String fsName, int i17, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fsName, "fsName");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VFSExpireCallbackManager", "C2C_ORIGIN_VIDEO_VFS_NAME, expire, count = " + i17 + ", size = " + j17);
        aw1.j1.f96097e = j17;
        aw1.j1.f96095c = true;
        if (aw1.j1.f96094b) {
            aw1.j1.f96093a.a();
        }
    }
}
