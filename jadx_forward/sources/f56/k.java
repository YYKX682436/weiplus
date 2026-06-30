package f56;

/* loaded from: classes7.dex */
public abstract class k implements java.io.Closeable, java.io.Flushable {

    /* renamed from: n, reason: collision with root package name */
    public static final boolean f341345n;

    /* renamed from: d, reason: collision with root package name */
    public final int f341346d;

    /* renamed from: e, reason: collision with root package name */
    public final int f341347e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f341348f;

    /* renamed from: g, reason: collision with root package name */
    public final org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.j f341349g;

    /* renamed from: h, reason: collision with root package name */
    public org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h f341350h;

    /* renamed from: i, reason: collision with root package name */
    public int f341351i;

    /* renamed from: m, reason: collision with root package name */
    public java.nio.charset.CharsetEncoder f341352m;

    static {
        boolean z17 = false;
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.os.Build$VERSION");
            int i17 = cls.getField("SDK_INT").getInt(cls.getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]));
            if (i17 >= 14 && i17 < 21) {
                z17 = true;
            }
        } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.NoSuchFieldException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
        }
        f341345n = z17;
    }

    public k(org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.j jVar, f56.g gVar) {
        if (jVar == null) {
            throw new java.lang.NullPointerException("MessageBufferOutput is null");
        }
        this.f341349g = jVar;
        this.f341346d = gVar.f341331d;
        this.f341347e = gVar.f341332e;
        this.f341348f = gVar.f341334g;
        this.f341351i = 0;
    }

    public final void A(byte b17, short s17) {
        b(3);
        org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h hVar = this.f341350h;
        int i17 = this.f341351i;
        this.f341351i = i17 + 1;
        hVar.mo155025xf2e368b7(i17, b17);
        this.f341350h.mo155033x6a7172ad(this.f341351i, s17);
        this.f341351i += 2;
    }

    public f56.k C(byte[] bArr) {
        int length = bArr.length;
        org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h hVar = this.f341350h;
        if (hVar != null) {
            int m155049x35e001 = hVar.m155049x35e001();
            int i17 = this.f341351i;
            if (m155049x35e001 - i17 >= length && length <= this.f341347e) {
                this.f341350h.mo155027x6989ae9c(i17, bArr, 0, length);
                this.f341351i += length;
                return this;
            }
        }
        flush();
        org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.b bVar = (org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.b) this.f341349g;
        bVar.getClass();
        org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h m155043x6c090f3d = org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h.m155043x6c090f3d(length);
        m155043x6c090f3d.mo155027x6989ae9c(0, bArr, 0, length);
        ((java.util.ArrayList) bVar.f429369d).add(m155043x6c090f3d);
        return this;
    }

    public final int a(int i17, java.lang.String str) {
        if (this.f341352m == null) {
            this.f341352m = f56.i.f341342a.newEncoder().onMalformedInput(java.nio.charset.CodingErrorAction.REPLACE).onUnmappableCharacter(java.nio.charset.CodingErrorAction.REPLACE);
        }
        this.f341352m.reset();
        org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h hVar = this.f341350h;
        java.nio.ByteBuffer mo155036x18a93ec = hVar.mo155036x18a93ec(i17, hVar.m155049x35e001() - i17);
        int position = mo155036x18a93ec.position();
        java.nio.charset.CoderResult encode = this.f341352m.encode(java.nio.CharBuffer.wrap(str), mo155036x18a93ec, true);
        if (encode.isError()) {
            try {
                encode.throwException();
            } catch (java.nio.charset.CharacterCodingException e17) {
                throw new f56.l(e17);
            }
        }
        if (encode.isUnderflow() && !encode.isOverflow() && this.f341352m.flush(mo155036x18a93ec).isUnderflow()) {
            return mo155036x18a93ec.position() - position;
        }
        return -1;
    }

    public final void b(int i17) {
        org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h m155043x6c090f3d;
        org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h m155043x6c090f3d2;
        org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h hVar = this.f341350h;
        org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.j jVar = this.f341349g;
        if (hVar == null) {
            org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.b bVar = (org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.b) jVar;
            org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h hVar2 = bVar.f429371f;
            if (hVar2 == null || hVar2.m155049x35e001() <= i17) {
                m155043x6c090f3d2 = org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h.m155043x6c090f3d(java.lang.Math.max(bVar.f429370e, i17));
                bVar.f429371f = m155043x6c090f3d2;
            } else {
                m155043x6c090f3d2 = bVar.f429371f;
            }
            this.f341350h = m155043x6c090f3d2;
            return;
        }
        if (this.f341351i + i17 >= hVar.m155049x35e001()) {
            c();
            org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.b bVar2 = (org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.b) jVar;
            org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h hVar3 = bVar2.f429371f;
            if (hVar3 == null || hVar3.m155049x35e001() <= i17) {
                m155043x6c090f3d = org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h.m155043x6c090f3d(java.lang.Math.max(bVar2.f429370e, i17));
                bVar2.f429371f = m155043x6c090f3d;
            } else {
                m155043x6c090f3d = bVar2.f429371f;
            }
            this.f341350h = m155043x6c090f3d;
        }
    }

    public final void c() {
        int i17 = this.f341351i;
        org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.b bVar = (org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.b) this.f341349g;
        ((java.util.ArrayList) bVar.f429369d).add(bVar.f429371f.mo155034x6873d92(0, i17));
        if (bVar.f429371f.m155049x35e001() - i17 > bVar.f429370e / 4) {
            org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h hVar = bVar.f429371f;
            bVar.f429371f = hVar.mo155034x6873d92(i17, hVar.m155049x35e001() - i17);
        } else {
            bVar.f429371f = null;
        }
        this.f341350h = null;
        this.f341351i = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.j jVar = this.f341349g;
        try {
            flush();
        } finally {
            jVar.getClass();
        }
    }

    public f56.k f(int i17) {
        if (i17 < 0) {
            throw new java.lang.IllegalArgumentException("array size must be >= 0");
        }
        if (i17 < 16) {
            v((byte) (i17 | (-112)));
        } else if (i17 < 65536) {
            A((byte) -36, (short) i17);
        } else {
            x((byte) -35, i17);
        }
        return this;
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.f341351i > 0) {
            c();
        }
        this.f341349g.getClass();
    }

    public f56.k i(int i17) {
        if (i17 < 256) {
            w((byte) -60, (byte) i17);
        } else if (i17 < 65536) {
            A((byte) -59, (short) i17);
        } else {
            x((byte) -58, i17);
        }
        return this;
    }

    public f56.k j(int i17) {
        if (i17 < -32) {
            if (i17 < -32768) {
                x((byte) -46, i17);
            } else if (i17 < -128) {
                A((byte) -47, (short) i17);
            } else {
                w((byte) -48, (byte) i17);
            }
        } else if (i17 < 128) {
            v((byte) i17);
        } else if (i17 < 256) {
            w((byte) -52, (byte) i17);
        } else if (i17 < 65536) {
            A((byte) -51, (short) i17);
        } else {
            x((byte) -50, i17);
        }
        return this;
    }

    public f56.k k(long j17) {
        if (j17 < -32) {
            if (j17 < -32768) {
                if (j17 < -2147483648L) {
                    z((byte) -45, j17);
                } else {
                    x((byte) -46, (int) j17);
                }
            } else if (j17 < -128) {
                A((byte) -47, (short) j17);
            } else {
                w((byte) -48, (byte) j17);
            }
        } else if (j17 < 128) {
            v((byte) j17);
        } else if (j17 < 65536) {
            if (j17 < 256) {
                w((byte) -52, (byte) j17);
            } else {
                A((byte) -51, (short) j17);
            }
        } else if (j17 < 4294967296L) {
            x((byte) -50, (int) j17);
        } else {
            z((byte) -49, j17);
        }
        return this;
    }

    public f56.k l(int i17) {
        if (i17 < 32) {
            v((byte) (i17 | (-96)));
        } else if (this.f341348f && i17 < 256) {
            w((byte) -39, (byte) i17);
        } else if (i17 < 65536) {
            A((byte) -38, (short) i17);
        } else {
            x((byte) -37, i17);
        }
        return this;
    }

    public f56.k p(java.lang.String str) {
        if (str.length() <= 0) {
            l(0);
            return this;
        }
        if (f341345n || str.length() < this.f341346d) {
            q(str);
            return this;
        }
        if (str.length() < 256) {
            b((str.length() * 6) + 2 + 1);
            int a17 = a(this.f341351i + 2, str);
            if (a17 >= 0) {
                if (this.f341348f && a17 < 256) {
                    org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h hVar = this.f341350h;
                    int i17 = this.f341351i;
                    this.f341351i = i17 + 1;
                    hVar.mo155025xf2e368b7(i17, (byte) -39);
                    org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h hVar2 = this.f341350h;
                    int i18 = this.f341351i;
                    this.f341351i = i18 + 1;
                    hVar2.mo155025xf2e368b7(i18, (byte) a17);
                    this.f341351i += a17;
                } else {
                    if (a17 >= 65536) {
                        throw new java.lang.IllegalArgumentException("Unexpected UTF-8 encoder state");
                    }
                    org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h hVar3 = this.f341350h;
                    int i19 = this.f341351i;
                    hVar3.mo155032xcf6e4c58(i19 + 3, hVar3, i19 + 2, a17);
                    org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h hVar4 = this.f341350h;
                    int i27 = this.f341351i;
                    this.f341351i = i27 + 1;
                    hVar4.mo155025xf2e368b7(i27, (byte) -38);
                    this.f341350h.mo155033x6a7172ad(this.f341351i, (short) a17);
                    this.f341351i = this.f341351i + 2 + a17;
                }
                return this;
            }
        } else if (str.length() < 65536) {
            b((str.length() * 6) + 3 + 2);
            int a18 = a(this.f341351i + 3, str);
            if (a18 >= 0) {
                if (a18 < 65536) {
                    org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h hVar5 = this.f341350h;
                    int i28 = this.f341351i;
                    this.f341351i = i28 + 1;
                    hVar5.mo155025xf2e368b7(i28, (byte) -38);
                    this.f341350h.mo155033x6a7172ad(this.f341351i, (short) a18);
                    this.f341351i = this.f341351i + 2 + a18;
                } else {
                    org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h hVar6 = this.f341350h;
                    int i29 = this.f341351i;
                    hVar6.mo155032xcf6e4c58(i29 + 5, hVar6, i29 + 3, a18);
                    org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h hVar7 = this.f341350h;
                    int i37 = this.f341351i;
                    this.f341351i = i37 + 1;
                    hVar7.mo155025xf2e368b7(i37, (byte) -37);
                    this.f341350h.mo155030xc5c55e60(this.f341351i, a18);
                    this.f341351i = this.f341351i + 4 + a18;
                }
                return this;
            }
        }
        q(str);
        return this;
    }

    public final void q(java.lang.String str) {
        byte[] bytes = str.getBytes(f56.i.f341342a);
        l(bytes.length);
        int length = bytes.length;
        org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h hVar = this.f341350h;
        if (hVar != null) {
            int m155049x35e001 = hVar.m155049x35e001();
            int i17 = this.f341351i;
            if (m155049x35e001 - i17 >= length && length <= this.f341347e) {
                this.f341350h.mo155027x6989ae9c(i17, bytes, 0, length);
                this.f341351i += length;
                return;
            }
        }
        flush();
        org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.b bVar = (org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.b) this.f341349g;
        bVar.getClass();
        ((java.util.ArrayList) bVar.f429369d).add(org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h.m155047x37d04a(bytes, 0, length));
    }

    public final void v(byte b17) {
        b(1);
        org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h hVar = this.f341350h;
        int i17 = this.f341351i;
        this.f341351i = i17 + 1;
        hVar.mo155025xf2e368b7(i17, b17);
    }

    public final void w(byte b17, byte b18) {
        b(2);
        org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h hVar = this.f341350h;
        int i17 = this.f341351i;
        this.f341351i = i17 + 1;
        hVar.mo155025xf2e368b7(i17, b17);
        org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h hVar2 = this.f341350h;
        int i18 = this.f341351i;
        this.f341351i = i18 + 1;
        hVar2.mo155025xf2e368b7(i18, b18);
    }

    public final void x(byte b17, int i17) {
        b(5);
        org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h hVar = this.f341350h;
        int i18 = this.f341351i;
        this.f341351i = i18 + 1;
        hVar.mo155025xf2e368b7(i18, b17);
        this.f341350h.mo155030xc5c55e60(this.f341351i, i17);
        this.f341351i += 4;
    }

    public final void z(byte b17, long j17) {
        b(9);
        org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h hVar = this.f341350h;
        int i17 = this.f341351i;
        this.f341351i = i17 + 1;
        hVar.mo155025xf2e368b7(i17, b17);
        this.f341350h.mo155031xf2e7ce2b(this.f341351i, j17);
        this.f341351i += 8;
    }
}
