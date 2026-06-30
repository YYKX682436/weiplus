package gp;

/* loaded from: classes12.dex */
public class e extends android.media.MediaRecorder {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.vfs.r6 f355696a;

    /* renamed from: b, reason: collision with root package name */
    public java.io.FileDescriptor f355697b;

    @Override // android.media.MediaRecorder
    public void prepare() {
        java.io.FileDescriptor fileDescriptor = this.f355697b;
        if (fileDescriptor != null) {
            super.setOutputFile(fileDescriptor);
            super.prepare();
            return;
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = this.f355696a;
        if (r6Var == null) {
            throw new java.io.IOException("No valid output file");
        }
        android.os.ParcelFileDescriptor z17 = com.p314xaae8f345.mm.vfs.w6.z(r6Var.f294699d, r6Var.M(), "rw");
        try {
            super.setOutputFile(z17.getFileDescriptor());
            super.prepare();
            z17.close();
        } catch (java.lang.Throwable th6) {
            if (z17 != null) {
                try {
                    z17.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    @Override // android.media.MediaRecorder
    public void setOutputFile(java.lang.String str) {
        this.f355696a = str == null ? null : new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
        this.f355697b = null;
    }

    @Override // android.media.MediaRecorder
    public void setOutputFile(java.io.File file) {
        setOutputFile(file.getPath());
    }

    @Override // android.media.MediaRecorder
    public void setOutputFile(java.io.FileDescriptor fileDescriptor) {
        this.f355696a = null;
        this.f355697b = fileDescriptor;
    }
}
