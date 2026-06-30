package ua1;

/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final short f507456a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f507457b = false;

    /* renamed from: c, reason: collision with root package name */
    public int f507458c = 0;

    /* renamed from: d, reason: collision with root package name */
    public short f507459d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f507460e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f507461f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public java.nio.ByteBuffer f507462g = null;

    /* renamed from: h, reason: collision with root package name */
    public final java.io.OutputStream f507463h;

    /* renamed from: i, reason: collision with root package name */
    public final java.io.OutputStream f507464i;

    /* renamed from: j, reason: collision with root package name */
    public final java.io.OutputStream f507465j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f507466k;

    public b(short s17, boolean z17) {
        this.f507456a = (short) 0;
        this.f507463h = null;
        this.f507464i = null;
        this.f507465j = null;
        java.lang.System.currentTimeMillis();
        this.f507466k = false;
        this.f507456a = s17;
        this.f507466k = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameAudioStream", "[hilive] create GameAudioStream sessionId: " + ((int) s17) + ", enableDebug: " + z17);
        if (z17) {
            try {
                java.lang.String str = android.os.Environment.getExternalStorageDirectory() + "/pcm-in-" + ((int) s17) + ".pcm";
                try {
                    com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
                    if (r6Var.m()) {
                        r6Var.l();
                    }
                    r6Var.k();
                } catch (java.lang.Exception unused) {
                }
                this.f507463h = com.p314xaae8f345.mm.vfs.w6.K(str, false);
                java.lang.String str2 = android.os.Environment.getExternalStorageDirectory() + "/pcm-sl-" + ((int) s17) + ".pcm";
                try {
                    com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str2));
                    if (r6Var2.m()) {
                        r6Var2.l();
                    }
                    r6Var2.k();
                } catch (java.lang.Exception unused2) {
                }
                this.f507464i = com.p314xaae8f345.mm.vfs.w6.K(str2, false);
                this.f507465j = com.p314xaae8f345.mm.vfs.w6.K(android.os.Environment.getExternalStorageDirectory() + "/pcm-ou-" + ((int) s17) + ".pcm", false);
            } catch (java.lang.Exception unused3) {
            }
        }
    }

    public byte[] a() {
        byte[] array;
        byte[] bArr;
        java.util.List list = this.f507461f;
        boolean isEmpty = ((java.util.ArrayList) list).isEmpty();
        boolean z17 = this.f507466k;
        if (isEmpty) {
            if (this.f507462g.position() == 0) {
                array = new byte[this.f507460e];
            } else {
                this.f507462g.rewind();
                array = this.f507462g.array();
                this.f507462g.clear();
                java.io.OutputStream outputStream = this.f507464i;
                if (outputStream != null) {
                    try {
                        outputStream.write(array);
                    } catch (java.io.IOException unused) {
                    }
                }
            }
            bArr = array;
            if (z17) {
                this.f507462g.position();
            }
        } else {
            bArr = ((java.nio.ByteBuffer) ((java.util.ArrayList) list).get(0)).array();
            ((java.util.ArrayList) list).remove(0);
            if (z17) {
                byte b17 = bArr[0];
                byte b18 = bArr[10];
                byte b19 = bArr[100];
            }
        }
        java.lang.System.currentTimeMillis();
        java.io.OutputStream outputStream2 = this.f507465j;
        if (outputStream2 != null) {
            try {
                outputStream2.write(bArr);
            } catch (java.io.IOException unused2) {
            }
        }
        return bArr;
    }

    public final void b(short s17, int i17) {
        if (this.f507457b && this.f507459d == s17 && this.f507458c == i17) {
            return;
        }
        this.f507457b = true;
        this.f507458c = i17;
        this.f507459d = s17;
        int i18 = 2 * (((s17 * i17) * 40) / 1000);
        this.f507460e = i18;
        this.f507462g = java.nio.ByteBuffer.allocate(i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameAudioStream", "[hilive] onReady, sessionId: " + ((int) this.f507456a) + " channel: " + ((int) s17) + " samplerate: " + i17 + " samplesize: " + this.f507460e);
    }

    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameAudioStream", "[hilive] onStop, sessionId: " + ((int) this.f507456a) + " samplesize: " + this.f507460e + " remainBuffer: " + this.f507461f.size());
        try {
            java.io.OutputStream outputStream = this.f507463h;
            if (outputStream != null) {
                outputStream.close();
            }
            java.io.OutputStream outputStream2 = this.f507464i;
            if (outputStream2 != null) {
                outputStream2.close();
            }
            java.io.OutputStream outputStream3 = this.f507465j;
            if (outputStream3 != null) {
                outputStream3.close();
            }
        } catch (java.io.IOException unused) {
        }
    }

    public void d(short s17, int i17, byte[] bArr, long j17) {
        b(s17, i17);
        java.io.OutputStream outputStream = this.f507463h;
        if (outputStream != null) {
            try {
                outputStream.write(bArr);
            } catch (java.io.IOException unused) {
            }
        }
        boolean z17 = this.f507466k;
        java.util.List list = this.f507461f;
        if (z17) {
            int length = bArr.length;
            this.f507462g.capacity();
            ((java.util.ArrayList) list).size();
        }
        int i18 = 0;
        while (i18 < bArr.length) {
            int min = java.lang.Math.min(bArr.length - i18, this.f507462g.capacity() - this.f507462g.position());
            this.f507462g.put(bArr, i18, min);
            i18 += min;
            if (this.f507462g.position() >= this.f507462g.capacity()) {
                if (((java.util.ArrayList) list).size() >= 100) {
                    ((java.util.ArrayList) list).remove(0);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameAudioStream", "[hilive] buffer full, discard sessionId: " + ((int) this.f507456a));
                }
                java.nio.ByteBuffer byteBuffer = this.f507462g;
                java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(byteBuffer.capacity());
                byteBuffer.rewind();
                allocate.put(byteBuffer);
                byteBuffer.rewind();
                java.io.OutputStream outputStream2 = this.f507464i;
                if (outputStream2 != null) {
                    try {
                        outputStream2.write(allocate.array());
                    } catch (java.io.IOException unused2) {
                    }
                }
                ((java.util.ArrayList) list).add(allocate);
                this.f507462g.clear();
            }
        }
    }

    public void e(short s17, int i17, float[] fArr) {
        b(s17, i17);
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(fArr.length * 4);
        allocate.asFloatBuffer().put(fArr);
        d(s17, i17, allocate.array(), java.lang.System.currentTimeMillis());
    }
}
