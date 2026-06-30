package vw;

/* loaded from: classes4.dex */
public final class f implements com.p314xaae8f345.mm.sdk.p2603x2137b148.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f522167a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f522168b;

    public f(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2) {
        this.f522167a = h0Var;
        this.f522168b = h0Var2;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.w
    public final void a(java.io.OutputStream outputStream) {
        try {
            try {
                byte[] bArr = new byte[8192];
                java.io.Closeable closeable = (java.io.Closeable) this.f522168b.f391656d;
                try {
                    java.io.ByteArrayInputStream byteArrayInputStream = (java.io.ByteArrayInputStream) closeable;
                    while (true) {
                        int read = byteArrayInputStream.read(bArr);
                        if (read == -1) {
                            vz5.b.a(closeable, null);
                            outputStream.flush();
                            vz5.b.a(outputStream, null);
                            return;
                        }
                        outputStream.write(bArr, 0, read);
                    }
                } finally {
                }
            } finally {
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizPicWaterMarkService", "Error while writing to output stream: " + e17.getMessage());
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f522167a;
            if (com.p314xaae8f345.mm.vfs.w6.j((java.lang.String) h0Var.f391656d)) {
                com.p314xaae8f345.mm.vfs.w6.h((java.lang.String) h0Var.f391656d);
            }
        }
    }
}
