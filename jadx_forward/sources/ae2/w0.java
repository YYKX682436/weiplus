package ae2;

/* loaded from: classes5.dex */
public final class w0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.w0 f85786d = new ae2.w0();

    public w0() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        lb2.j jVar = new lb2.j("", "视频号直播目录清理配置(重启)");
        jVar.a("FINDER_LIVE_VFS_STORAGE_CONFIG", kz5.c0.i("", "{\"targetSize\":52428800,\"expireTimes\":300000,\"thresholds\":52428800,\"isCache\":true,\"interval\":0}"), kz5.c0.i("VFSStorageConfig代码配置", "清理到50M，5分钟过期"));
        lb2.j.d(jVar, e42.d0.clicfg_finder_live_vfs_storage_config, false, 2, null);
        return jVar;
    }
}
