package un2;

/* loaded from: classes10.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public so2.u1 f511004a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f511005b;

    /* renamed from: c, reason: collision with root package name */
    public un2.a f511006c;

    /* renamed from: d, reason: collision with root package name */
    public long f511007d;

    /* renamed from: e, reason: collision with root package name */
    public long f511008e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f511009f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f511010g;

    /* renamed from: h, reason: collision with root package name */
    public android.content.Context f511011h;

    /* renamed from: j, reason: collision with root package name */
    public java.util.LinkedList f511013j;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f511012i = new byte[1024];

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f511014k = jz5.h.b(un2.c.f510990d);

    public static final void a(un2.k kVar, int i17, int i18) {
        if (i17 >= i18) {
            kVar.getClass();
            return;
        }
        kVar.b(i18, "dyeArray");
        byte[] bArr = kVar.f511012i;
        int length = i18 >= bArr.length ? bArr.length - 1 : i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderBulletLoader", "dyeArray: startIndex=" + i17 + ", realEndIndex=" + length + ", endIndex=" + i18 + ", arraySize=" + kVar.f511012i.length);
        if (i17 > length) {
            return;
        }
        while (true) {
            kVar.f511012i[i17] = 1;
            if (i17 == length) {
                return;
            } else {
                i17++;
            }
        }
    }

    public final void b(int i17, java.lang.String str) {
        if (i17 + 1 <= this.f511012i.length) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkExpandArray: source=");
        sb6.append(str);
        sb6.append(", totalTime=");
        sb6.append(i17);
        sb6.append(", current array size = ");
        sb6.append(this.f511012i.length);
        sb6.append(", maxVideoDuration=");
        jz5.g gVar = this.f511014k;
        sb6.append(((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderBulletLoader", sb6.toString());
        if (i17 >= ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue()) {
            i17 = ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue() - 1;
        }
        int length = this.f511012i.length;
        do {
            length += 1024;
        } while (length < i17 + 1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderBulletLoader", "checkExpandArray: source=" + str + ", totalTimeSec=" + i17 + ", newArrayLen = " + length);
        byte[] bArr = new byte[length];
        byte[] bArr2 = this.f511012i;
        java.lang.System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        this.f511012i = bArr;
    }

    public final so2.u1 c() {
        so2.u1 u1Var = this.f511004a;
        if (u1Var != null) {
            return u1Var;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feed");
        throw null;
    }

    public final void d() {
        r45.qt2 qt2Var;
        java.lang.String ak6;
        r45.gl2 gl2Var;
        if (this.f511011h != null && c().f2()) {
            this.f511010g = true;
            long m59251x5db1b11 = c().getFeedObject().m59251x5db1b11();
            r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(c().getFeedObject().m59264x7efe73ec());
            int m75939xb282bd08 = mb4Var != null ? mb4Var.m75939xb282bd08(3) : 0;
            int P6 = ((ey2.v2) pf5.u.f435469a.e(c61.l7.class).a(ey2.v2.class)).P6(m59251x5db1b11) + 1;
            i95.m c17 = i95.n0.c(cq.k.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            cq.k kVar = (cq.k) c17;
            android.content.Context context = this.f511011h;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject = c().getFeedObject();
            android.content.Context context2 = this.f511011h;
            if (context2 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context2 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
                qt2Var = nyVar != null ? nyVar.V6() : null;
            } else {
                qt2Var = null;
            }
            java.util.LinkedList linkedList = this.f511013j;
            i95.m c18 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            ak6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c18).ak(0.0f, m75939xb282bd08, P6, (r31 & 8) != 0 ? "" : null, (r31 & 16) != 0 ? "" : null, (r31 & 32) != 0 ? 0 : 0, (r31 & 64) != 0 ? "" : null, (r31 & 128) != 0 ? 0 : 0, (r31 & 256) != 0 ? 0 : 0, (r31 & 512) != 0 ? 0L : 0L, (r31 & 1024) != 0 ? 0 : 0);
            r45.dm2 m76806xdef68064 = c().getFeedObject().getFeedObject().m76806xdef68064();
            cq.j1.g(kVar, context, feedObject, 0L, null, qt2Var, 0, linkedList, ak6, (m76806xdef68064 == null || (gl2Var = (r45.gl2) m76806xdef68064.m75936x14adae67(56)) == null) ? null : gl2Var.m75934xbce7f2f(1), new un2.g(this, m59251x5db1b11, 0), new un2.h(this), 12, null);
        }
    }
}
