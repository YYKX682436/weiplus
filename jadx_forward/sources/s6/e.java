package s6;

/* loaded from: classes13.dex */
public class e {

    /* renamed from: b, reason: collision with root package name */
    public java.nio.ByteBuffer f484823b;

    /* renamed from: c, reason: collision with root package name */
    public s6.d f484824c;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f484822a = new byte[256];

    /* renamed from: d, reason: collision with root package name */
    public int f484825d = 0;

    public final boolean a() {
        return this.f484824c.f484812b != 0;
    }

    public s6.d b() {
        byte[] bArr;
        if (this.f484823b == null) {
            throw new java.lang.IllegalStateException("You must call setData() before parseHeader()");
        }
        if (a()) {
            return this.f484824c;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i17 = 0; i17 < 6; i17++) {
            sb6.append((char) c());
        }
        if (sb6.toString().startsWith("GIF")) {
            this.f484824c.f484816f = f();
            this.f484824c.f484817g = f();
            int c17 = c();
            s6.d dVar = this.f484824c;
            dVar.f484818h = (c17 & 128) != 0;
            dVar.f484819i = (int) java.lang.Math.pow(2.0d, (c17 & 7) + 1);
            this.f484824c.f484820j = c();
            s6.d dVar2 = this.f484824c;
            c();
            dVar2.getClass();
            if (this.f484824c.f484818h && !a()) {
                s6.d dVar3 = this.f484824c;
                dVar3.f484811a = e(dVar3.f484819i);
                s6.d dVar4 = this.f484824c;
                dVar4.f484821k = dVar4.f484811a[dVar4.f484820j];
            }
        } else {
            this.f484824c.f484812b = 1;
        }
        if (!a()) {
            boolean z17 = false;
            while (!z17 && !a() && this.f484824c.f484813c <= Integer.MAX_VALUE) {
                int c18 = c();
                if (c18 == 33) {
                    int c19 = c();
                    if (c19 == 1) {
                        g();
                    } else if (c19 == 249) {
                        this.f484824c.f484814d = new s6.c();
                        c();
                        int c27 = c();
                        s6.c cVar = this.f484824c.f484814d;
                        int i18 = (c27 & 28) >> 2;
                        cVar.f484806g = i18;
                        if (i18 == 0) {
                            cVar.f484806g = 1;
                        }
                        cVar.f484805f = (c27 & 1) != 0;
                        int f17 = f();
                        if (f17 < 2) {
                            f17 = 10;
                        }
                        s6.c cVar2 = this.f484824c.f484814d;
                        cVar2.f484808i = f17 * 10;
                        cVar2.f484807h = c();
                        c();
                    } else if (c19 == 254) {
                        g();
                    } else if (c19 != 255) {
                        g();
                    } else {
                        d();
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                        int i19 = 0;
                        while (true) {
                            bArr = this.f484822a;
                            if (i19 >= 11) {
                                break;
                            }
                            sb7.append((char) bArr[i19]);
                            i19++;
                        }
                        if (sb7.toString().equals("NETSCAPE2.0")) {
                            do {
                                d();
                                if (bArr[0] == 1) {
                                    byte b17 = bArr[1];
                                    byte b18 = bArr[2];
                                    this.f484824c.getClass();
                                }
                                if (this.f484825d > 0) {
                                }
                            } while (!a());
                        } else {
                            g();
                        }
                    }
                } else if (c18 == 44) {
                    s6.d dVar5 = this.f484824c;
                    if (dVar5.f484814d == null) {
                        dVar5.f484814d = new s6.c();
                    }
                    dVar5.f484814d.f484800a = f();
                    this.f484824c.f484814d.f484801b = f();
                    this.f484824c.f484814d.f484802c = f();
                    this.f484824c.f484814d.f484803d = f();
                    int c28 = c();
                    boolean z18 = (c28 & 128) != 0;
                    int pow = (int) java.lang.Math.pow(2.0d, (c28 & 7) + 1);
                    s6.c cVar3 = this.f484824c.f484814d;
                    cVar3.f484804e = (c28 & 64) != 0;
                    if (z18) {
                        cVar3.f484810k = e(pow);
                    } else {
                        cVar3.f484810k = null;
                    }
                    this.f484824c.f484814d.f484809j = this.f484823b.position();
                    c();
                    g();
                    if (!a()) {
                        s6.d dVar6 = this.f484824c;
                        dVar6.f484813c++;
                        ((java.util.ArrayList) dVar6.f484815e).add(dVar6.f484814d);
                    }
                } else if (c18 != 59) {
                    this.f484824c.f484812b = 1;
                } else {
                    z17 = true;
                }
            }
            s6.d dVar7 = this.f484824c;
            if (dVar7.f484813c < 0) {
                dVar7.f484812b = 1;
            }
        }
        return this.f484824c;
    }

    public final int c() {
        try {
            return this.f484823b.get() & 255;
        } catch (java.lang.Exception unused) {
            this.f484824c.f484812b = 1;
            return 0;
        }
    }

    public final void d() {
        int c17 = c();
        this.f484825d = c17;
        if (c17 <= 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            try {
                int i18 = this.f484825d;
                if (i17 >= i18) {
                    return;
                }
                int i19 = i18 - i17;
                this.f484823b.get(this.f484822a, i17, i19);
                i17 += i19;
            } catch (java.lang.Exception unused) {
                android.util.Log.isLoggable("GifHeaderParser", 3);
                this.f484824c.f484812b = 1;
                return;
            }
        }
    }

    public final int[] e(int i17) {
        byte[] bArr = new byte[i17 * 3];
        int[] iArr = null;
        try {
            this.f484823b.get(bArr);
            iArr = new int[256];
            int i18 = 0;
            int i19 = 0;
            while (i18 < i17) {
                int i27 = i19 + 1;
                int i28 = i27 + 1;
                int i29 = i28 + 1;
                int i37 = i18 + 1;
                iArr[i18] = ((bArr[i19] & 255) << 16) | (-16777216) | ((bArr[i27] & 255) << 8) | (bArr[i28] & 255);
                i19 = i29;
                i18 = i37;
            }
        } catch (java.nio.BufferUnderflowException unused) {
            android.util.Log.isLoggable("GifHeaderParser", 3);
            this.f484824c.f484812b = 1;
        }
        return iArr;
    }

    public final int f() {
        return this.f484823b.getShort();
    }

    public final void g() {
        int c17;
        do {
            c17 = c();
            this.f484823b.position(java.lang.Math.min(this.f484823b.position() + c17, this.f484823b.limit()));
        } while (c17 > 0);
    }
}
