package oh;

/* loaded from: classes7.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final oh.d f426709d = new oh.d();

    public d() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a("/sys/class/kgsl/kgsl-3d0/gpubusy"));
        if (r6Var.m()) {
            try {
                java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(r6Var.o(), "r");
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GpuBusySnapshot", "read gpu-busy: " + randomAccessFile.readLine());
                    vz5.b.a(randomAccessFile, null);
                } finally {
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GpuBusySnapshot", th6, "read gpu-busy err", new java.lang.Object[0]);
                java.lang.String message = th6.getMessage();
                if (message == null) {
                    message = "";
                }
                if (r26.n0.B(message, "EACCES", false)) {
                    return java.lang.Boolean.TRUE;
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GpuBusySnapshot", "file not exists: " + r6Var.o());
        }
        return java.lang.Boolean.FALSE;
    }
}
