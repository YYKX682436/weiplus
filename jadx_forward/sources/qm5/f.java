package qm5;

/* loaded from: classes14.dex */
public class f extends qm5.c {
    public boolean A;
    public java.nio.FloatBuffer C;
    public java.nio.FloatBuffer D;

    /* renamed from: k, reason: collision with root package name */
    public final qm5.d f446343k;

    /* renamed from: l, reason: collision with root package name */
    public final qm5.e f446344l;

    /* renamed from: m, reason: collision with root package name */
    public final qm5.c f446345m;

    /* renamed from: n, reason: collision with root package name */
    public qm5.c f446346n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f446347o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.List f446348p;

    /* renamed from: q, reason: collision with root package name */
    public int[] f446349q;

    /* renamed from: r, reason: collision with root package name */
    public int[] f446350r;

    /* renamed from: s, reason: collision with root package name */
    public int[] f446351s;

    /* renamed from: t, reason: collision with root package name */
    public int f446352t;

    /* renamed from: u, reason: collision with root package name */
    public final java.nio.FloatBuffer f446353u;

    /* renamed from: v, reason: collision with root package name */
    public java.nio.ByteBuffer f446354v;

    /* renamed from: y, reason: collision with root package name */
    public int f446357y;

    /* renamed from: z, reason: collision with root package name */
    public int f446358z;

    /* renamed from: w, reason: collision with root package name */
    public int f446355w = 0;

    /* renamed from: x, reason: collision with root package name */
    public int f446356x = 0;
    public boolean B = false;

    public f(boolean z17) {
        this.A = false;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f446347o = arrayList;
        java.nio.FloatBuffer asFloatBuffer = java.nio.ByteBuffer.allocateDirect(32).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        this.C = asFloatBuffer;
        asFloatBuffer.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        this.C.position(0);
        java.nio.FloatBuffer asFloatBuffer2 = java.nio.ByteBuffer.allocateDirect(32).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        this.D = asFloatBuffer2;
        asFloatBuffer2.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
        this.D.position(0);
        float[] b17 = qm5.o.b(qm5.l.NORMAL, false, true);
        java.nio.FloatBuffer asFloatBuffer3 = java.nio.ByteBuffer.allocateDirect(b17.length * 4).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        this.f446353u = asFloatBuffer3;
        asFloatBuffer3.put(b17).position(0);
        qm5.d dVar = new qm5.d();
        this.f446343k = dVar;
        qm5.e eVar = new qm5.e();
        this.f446344l = eVar;
        qm5.c cVar = new qm5.c();
        this.f446345m = cVar;
        if (z17) {
            this.f446346n = new qm5.c();
        }
        this.A = z17;
        arrayList.add(dVar);
        arrayList.add(eVar);
        arrayList.add(cVar);
        if (z17) {
            arrayList.add(this.f446346n);
        }
        n();
    }

    @Override // qm5.c
    public void a() {
        j();
        java.util.Iterator it = ((java.util.ArrayList) this.f446347o).iterator();
        while (it.hasNext()) {
            qm5.c cVar = (qm5.c) it.next();
            cVar.f446334j = false;
            android.opengl.GLES20.glDeleteProgram(cVar.f446328d);
            cVar.a();
        }
        this.f446356x = 0;
        this.f446355w = 0;
    }

    @Override // qm5.c
    public void b(int i17, int i18, int i19, java.nio.FloatBuffer floatBuffer, java.nio.FloatBuffer floatBuffer2) {
        int[] iArr;
        h();
        if (!this.f446334j || (iArr = this.f446349q) == null || this.f446351s == null || this.f446348p == null) {
            return;
        }
        try {
            android.opengl.GLES20.glBindFramebuffer(36160, iArr[0]);
            android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            this.f446343k.b(i17, this.f446351s[1], i17, this.C, this.D);
            android.opengl.GLES20.glBindFramebuffer(36160, 0);
            if (this.A) {
                android.opengl.GLES20.glBindFramebuffer(36160, this.f446349q[1]);
                android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                qm5.e eVar = this.f446344l;
                int[] iArr2 = this.f446351s;
                eVar.b(i17, iArr2[1], iArr2[0], this.C, this.f446353u);
                k();
                android.opengl.GLES20.glBindFramebuffer(36160, 0);
                this.f446346n.b(this.f446351s[1], i17, i17, floatBuffer, floatBuffer2);
            } else {
                android.opengl.GLES20.glBindFramebuffer(36160, this.f446350r[0]);
                android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                qm5.e eVar2 = this.f446344l;
                int[] iArr3 = this.f446351s;
                eVar2.b(i17, iArr3[1], iArr3[0], this.C, this.D);
                android.opengl.GLES20.glBindFramebuffer(36160, 0);
            }
            android.opengl.GLES20.glBindFramebuffer(36160, this.f446349q[1]);
            android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            qm5.c cVar = this.f446345m;
            int i27 = this.f446352t;
            cVar.b(i27, i27, i27, this.C, this.D);
            android.opengl.GLES20.glBindFramebuffer(36160, 0);
        } catch (java.lang.IndexOutOfBoundsException | java.lang.Exception unused) {
        }
    }

    @Override // qm5.c
    public void e() {
        super.e();
        java.util.Iterator it = ((java.util.ArrayList) this.f446347o).iterator();
        while (it.hasNext()) {
            qm5.c cVar = (qm5.c) it.next();
            cVar.e();
            cVar.f446334j = true;
        }
    }

    @Override // qm5.c
    public void f(int i17, int i18) {
        int i19;
        boolean z17;
        if (i17 <= 0 || i18 <= 0) {
            return;
        }
        if (this.f446355w == i17 && this.f446356x == i18 && !this.B) {
            return;
        }
        this.f446355w = i17;
        this.f446356x = i18;
        qm5.d dVar = this.f446343k;
        dVar.g(new qm5.b(dVar, dVar.f446340t, i17));
        dVar.g(new qm5.b(dVar, dVar.f446341u, i18));
        int i27 = this.f446355w;
        int i28 = this.f446356x;
        this.f446332h = i27;
        this.f446333i = i28;
        if (this.f446349q != null) {
            j();
        }
        int[] iArr = this.f446351s;
        if (iArr != null) {
            android.opengl.GLES20.glDeleteTextures(iArr.length, iArr, 0);
            this.f446351s = null;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f446347o;
        int size = arrayList.size();
        for (int i29 = 0; i29 < size; i29++) {
            if (i29 < size - 1) {
                ((qm5.c) arrayList.get(i29)).f(this.f446355w, this.f446356x);
            } else if (this.A) {
                ((qm5.c) arrayList.get(i29)).f(this.f446357y, this.f446358z);
            } else {
                ((qm5.c) arrayList.get(i29)).f(this.f446355w, this.f446356x);
            }
        }
        java.util.List list = this.f446348p;
        if (list == null || ((java.util.ArrayList) list).size() <= 0) {
            return;
        }
        int i37 = 1;
        int size2 = ((java.util.ArrayList) this.f446348p).size() - 1;
        this.f446349q = new int[size2];
        this.f446351s = new int[size2];
        int i38 = 0;
        while (i38 < size2) {
            android.opengl.GLES20.glGenFramebuffers(i37, this.f446349q, i38);
            android.opengl.GLES20.glBindFramebuffer(36160, this.f446349q[i38]);
            android.opengl.GLES20.glGenTextures(i37, this.f446351s, i38);
            android.opengl.GLES20.glBindTexture(3553, this.f446351s[i38]);
            android.opengl.GLES20.glTexImage2D(3553, 0, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, this.f446355w, this.f446356x, 0, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238, null);
            android.opengl.GLES20.glTexParameterf(3553, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, 9729.0f);
            android.opengl.GLES20.glTexParameterf(3553, 10241, 9729.0f);
            android.opengl.GLES20.glTexParameterf(3553, 10242, 33071.0f);
            android.opengl.GLES20.glTexParameterf(3553, 10243, 33071.0f);
            android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f446351s[i38], 0);
            android.opengl.GLES20.glBindTexture(3553, 0);
            android.opengl.GLES20.glBindFramebuffer(36160, 0);
            i38++;
            i37 = 1;
        }
        if (!this.A) {
            i();
        }
        int i39 = this.f446355w;
        int i47 = this.f446356x;
        int size3 = ((java.util.ArrayList) this.f446348p).size();
        int i48 = 0;
        while (i48 < size3 - 1) {
            if (this.f446351s[i48] == -1) {
                android.opengl.GLES20.glBindFramebuffer(36160, this.f446349q[i48]);
                android.opengl.GLES20.glGenTextures(1, this.f446351s, i48);
                android.opengl.GLES20.glBindTexture(3553, this.f446351s[i48]);
                i19 = i48;
                android.opengl.GLES20.glTexImage2D(3553, 0, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, i39, i47, 0, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238, null);
                android.opengl.GLES20.glTexParameterf(3553, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, 9729.0f);
                android.opengl.GLES20.glTexParameterf(3553, 10241, 9729.0f);
                android.opengl.GLES20.glTexParameterf(3553, 10242, 33071.0f);
                android.opengl.GLES20.glTexParameterf(3553, 10243, 33071.0f);
                z17 = false;
                android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f446351s[i19], 0);
                android.opengl.GLES20.glBindTexture(3553, 0);
                android.opengl.GLES20.glBindFramebuffer(36160, 0);
            } else {
                i19 = i48;
                z17 = false;
            }
            i48 = i19 + 1;
        }
        if (this.A || this.f446350r[0] != -1) {
            return;
        }
        i();
    }

    public void i() {
        if (this.A) {
            return;
        }
        int[] iArr = this.f446350r;
        if (iArr != null) {
            android.opengl.GLES20.glDeleteFramebuffers(iArr.length, iArr, 0);
            this.f446350r = null;
        }
        if (this.f446350r == null) {
            int[] iArr2 = new int[1];
            this.f446350r = iArr2;
            android.opengl.GLES20.glGenFramebuffers(1, iArr2, 0);
        }
        android.opengl.GLES20.glBindFramebuffer(36160, this.f446350r[0]);
        android.opengl.GLES20.glBindTexture(3553, this.f446352t);
        android.opengl.GLES20.glTexImage2D(3553, 0, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, this.f446355w, this.f446356x, 0, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238, null);
        android.opengl.GLES20.glTexParameterf(3553, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, 9729.0f);
        android.opengl.GLES20.glTexParameterf(3553, 10241, 9729.0f);
        android.opengl.GLES20.glTexParameterf(3553, 10242, 33071.0f);
        android.opengl.GLES20.glTexParameterf(3553, 10243, 33071.0f);
        android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f446352t, 0);
        android.opengl.GLES20.glBindTexture(3553, 0);
        android.opengl.GLES20.glBindFramebuffer(36160, 0);
    }

    public final void j() {
        int[] iArr = this.f446351s;
        if (iArr != null) {
            android.opengl.GLES20.glDeleteTextures(iArr.length, iArr, 0);
            this.f446351s = null;
        }
        int[] iArr2 = this.f446349q;
        if (iArr2 != null) {
            android.opengl.GLES20.glDeleteFramebuffers(iArr2.length, iArr2, 0);
            this.f446349q = null;
        }
        int[] iArr3 = this.f446350r;
        if (iArr3 != null) {
            android.opengl.GLES20.glDeleteFramebuffers(iArr3.length, iArr3, 0);
            this.f446350r = null;
        }
    }

    public final void k() {
        java.nio.ByteBuffer byteBuffer = this.f446354v;
        if (byteBuffer == null || byteBuffer.capacity() < this.f446356x * this.f446355w * 4) {
            this.f446354v = java.nio.ByteBuffer.allocateDirect(this.f446356x * this.f446355w * 4).order(java.nio.ByteOrder.nativeOrder());
        }
        this.f446354v.position(0);
        android.opengl.GLES20.glReadPixels(0, 0, this.f446355w, this.f446356x, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238, this.f446354v);
        this.f446354v.position(0);
        this.f446354v.array();
        android.opengl.GLES20.glBindFramebuffer(36160, 0);
    }

    public void l(int i17, float[] fArr, float[] fArr2) {
        for (int i18 = 0; i18 < 8; i18++) {
            fArr2[i18] = fArr[i18];
        }
        if (i17 == 1) {
            float f17 = fArr2[0];
            float f18 = fArr2[1];
            fArr2[0] = fArr2[4];
            fArr2[1] = fArr2[5];
            fArr2[4] = fArr2[6];
            fArr2[5] = fArr2[7];
            fArr2[6] = fArr2[2];
            fArr2[7] = fArr2[3];
            fArr2[2] = f17;
            fArr2[3] = f18;
            return;
        }
        if (i17 != 2) {
            if (i17 != 3) {
                return;
            }
            float f19 = fArr2[0];
            float f27 = fArr2[1];
            fArr2[0] = fArr2[2];
            fArr2[1] = fArr2[3];
            fArr2[2] = fArr2[6];
            fArr2[3] = fArr2[7];
            fArr2[6] = fArr2[4];
            fArr2[7] = fArr2[5];
            fArr2[4] = f19;
            fArr2[5] = f27;
            return;
        }
        float f28 = fArr2[0];
        fArr2[0] = fArr2[6];
        fArr2[6] = f28;
        float f29 = fArr2[1];
        fArr2[1] = fArr2[7];
        fArr2[7] = f29;
        float f37 = fArr2[2];
        fArr2[2] = fArr2[4];
        fArr2[4] = f37;
        float f38 = fArr2[3];
        fArr2[3] = fArr2[5];
        fArr2[5] = f38;
    }

    public void m(boolean z17) {
        this.A = z17;
        if (this.f446346n == null) {
            qm5.c cVar = new qm5.c();
            this.f446346n = cVar;
            ((java.util.ArrayList) this.f446347o).add(cVar);
            this.B = true;
            n();
            qm5.c cVar2 = this.f446346n;
            cVar2.e();
            cVar2.f446334j = true;
            f(this.f446355w, this.f446356x);
        }
        this.B = false;
    }

    public void n() {
        java.util.List list = this.f446347o;
        if (list == null) {
            return;
        }
        java.util.List list2 = this.f446348p;
        if (list2 == null) {
            this.f446348p = new java.util.ArrayList();
        } else {
            list2.clear();
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f446348p.add((qm5.c) it.next());
        }
    }
}
