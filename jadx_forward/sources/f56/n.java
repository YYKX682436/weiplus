package f56;

/* loaded from: classes7.dex */
public class n implements java.io.Closeable {

    /* renamed from: i, reason: collision with root package name */
    public static final org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h f341353i = org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h.m155046x37d04a(new byte[0]);

    /* renamed from: d, reason: collision with root package name */
    public final org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.i f341354d;

    /* renamed from: f, reason: collision with root package name */
    public int f341356f;

    /* renamed from: h, reason: collision with root package name */
    public int f341358h;

    /* renamed from: e, reason: collision with root package name */
    public org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h f341355e = f341353i;

    /* renamed from: g, reason: collision with root package name */
    public final org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h f341357g = org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h.m155043x6c090f3d(8);

    public n(org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.i iVar, f56.h hVar) {
        if (iVar == null) {
            throw new java.lang.NullPointerException("MessageBufferInput is null");
        }
        this.f341354d = iVar;
        hVar.getClass();
    }

    public final void a() {
        org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h hVar;
        org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.a aVar = (org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.a) this.f341354d;
        if (aVar.f429368e) {
            hVar = null;
        } else {
            aVar.f429368e = true;
            hVar = aVar.f429367d;
        }
        if (hVar == null) {
            throw new f56.d();
        }
        this.f341355e.m155049x35e001();
        this.f341355e = hVar;
        this.f341356f = 0;
    }

    public final org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h b(int i17) {
        int i18;
        int m155049x35e001 = this.f341355e.m155049x35e001();
        int i19 = this.f341356f;
        int i27 = m155049x35e001 - i19;
        if (i27 >= i17) {
            this.f341358h = i19;
            this.f341356f = i19 + i17;
            return this.f341355e;
        }
        org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h hVar = this.f341357g;
        if (i27 > 0) {
            hVar.mo155032xcf6e4c58(0, this.f341355e, i19, i27);
            i17 -= i27;
            i18 = i27 + 0;
        } else {
            i18 = 0;
        }
        while (true) {
            a();
            int m155049x35e0012 = this.f341355e.m155049x35e001();
            if (m155049x35e0012 >= i17) {
                hVar.mo155032xcf6e4c58(i18, this.f341355e, 0, i17);
                this.f341356f = i17;
                this.f341358h = 0;
                return hVar;
            }
            hVar.mo155032xcf6e4c58(i18, this.f341355e, 0, m155049x35e0012);
            i17 -= m155049x35e0012;
            i18 += m155049x35e0012;
        }
    }

    public int c() {
        byte m129089xcc4273be = m129089xcc4273be();
        int i17 = m129089xcc4273be & 255;
        if (i17 <= 127 || i17 >= 224) {
            return m129089xcc4273be;
        }
        switch (m129089xcc4273be) {
            case -52:
                return m129089xcc4273be() & 255;
            case -51:
                return b(2).mo155022x75232ac6(this.f341358h) & 65535;
            case -50:
                int mo155020xb58848b9 = b(4).mo155020xb58848b9(this.f341358h);
                if (mo155020xb58848b9 >= 0) {
                    return mo155020xb58848b9;
                }
                throw new f56.e(java.math.BigInteger.valueOf((mo155020xb58848b9 & Integer.MAX_VALUE) + 2147483648L));
            case -49:
                long mo155021xfb822ef2 = b(8).mo155021xfb822ef2(this.f341358h);
                if (mo155021xfb822ef2 < 0 || mo155021xfb822ef2 > 2147483647L) {
                    throw new f56.e(java.math.BigInteger.valueOf(mo155021xfb822ef2 + com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697 + 1).setBit(63));
                }
                return (int) mo155021xfb822ef2;
            case -48:
                return m129089xcc4273be();
            case -47:
                return b(2).mo155022x75232ac6(this.f341358h);
            case -46:
                return b(4).mo155020xb58848b9(this.f341358h);
            case -45:
                long mo155021xfb822ef22 = b(8).mo155021xfb822ef2(this.f341358h);
                if (mo155021xfb822ef22 < -2147483648L || mo155021xfb822ef22 > 2147483647L) {
                    throw new f56.e(java.math.BigInteger.valueOf(mo155021xfb822ef22));
                }
                return (int) mo155021xfb822ef22;
            default:
                f56.b bVar = f56.b.S[i17];
                f56.b bVar2 = f56.b.f341315m;
                if (bVar == bVar2) {
                    throw new f56.f(java.lang.String.format("Expected %s, but encountered 0xC1 \"NEVER_USED\" byte", com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26669x527e6c88.f56126xc3426119));
                }
                if (bVar == bVar2) {
                    bVar.getClass();
                    throw new f56.c("Cannot convert NEVER_USED to ValueType");
                }
                java.lang.String name = bVar.f341329d.name();
                throw new f56.m(java.lang.String.format("Expected %s, but got %s (%02x)", com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26669x527e6c88.f56126xc3426119, name.substring(0, 1) + name.substring(1).toLowerCase(), java.lang.Byte.valueOf(m129089xcc4273be)));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f341355e = f341353i;
        this.f341356f = 0;
        ((org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.a) this.f341354d).close();
    }

    /* renamed from: readByte */
    public final byte m129089xcc4273be() {
        int m155049x35e001 = this.f341355e.m155049x35e001();
        int i17 = this.f341356f;
        if (m155049x35e001 > i17) {
            byte mo155015xfb7dc97e = this.f341355e.mo155015xfb7dc97e(i17);
            this.f341356f++;
            return mo155015xfb7dc97e;
        }
        a();
        if (this.f341355e.m155049x35e001() <= 0) {
            return m129089xcc4273be();
        }
        byte mo155015xfb7dc97e2 = this.f341355e.mo155015xfb7dc97e(0);
        this.f341356f = 1;
        return mo155015xfb7dc97e2;
    }
}
