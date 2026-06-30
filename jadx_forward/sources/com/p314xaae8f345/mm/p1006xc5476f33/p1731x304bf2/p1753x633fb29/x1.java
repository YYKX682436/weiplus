package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29;

/* loaded from: classes8.dex */
public class x1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.t1 {

    /* renamed from: a, reason: collision with root package name */
    public final m53.a2 f222048a;

    /* renamed from: b, reason: collision with root package name */
    public m53.j3 f222049b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.w1 f222050c;

    /* renamed from: d, reason: collision with root package name */
    public m53.c1 f222051d;

    /* renamed from: e, reason: collision with root package name */
    public m53.w5 f222052e;

    /* renamed from: f, reason: collision with root package name */
    public m53.h1 f222053f;

    public x1(m53.a2 a2Var, boolean z17) {
        if (a2Var == null) {
            this.f222048a = new m53.a2();
        } else {
            this.f222048a = a2Var;
            b(z17);
        }
    }

    public final void b(boolean z17) {
        m53.h hVar;
        m53.h hVar2;
        m53.a2 a2Var = this.f222048a;
        if (a2Var != null) {
            this.f222049b = a2Var.f405087g;
            m53.z0 z0Var = a2Var.f405084d;
            if (z0Var != null && (hVar2 = z0Var.f405748d) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.w1 w1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.w1();
                this.f222050c = w1Var;
                w1Var.f222035a = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.t1.a(hVar2);
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.w1 w1Var2 = this.f222050c;
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b bVar = w1Var2.f222035a;
                if (bVar != null) {
                    bVar.f221740j2 = a2Var.f405084d.f405751g;
                    bVar.f221745o2 = 10;
                    bVar.f221746p2 = 1002;
                    bVar.f221747q2 = 1;
                }
                m53.z0 z0Var2 = a2Var.f405084d;
                w1Var2.f222036b = z0Var2.f405750f;
                w1Var2.f222037c = z0Var2.f405749e;
                w1Var2.f222038d = a2Var.f405086f;
            }
            this.f222051d = a2Var.f405085e;
            this.f222052e = a2Var.f405088h;
            this.f222053f = a2Var.f405089i;
        }
        if (a2Var == null || !z17) {
            return;
        }
        m53.z0 z0Var3 = a2Var.f405084d;
        if (z0Var3 != null && (hVar = z0Var3.f405748d) != null) {
            r53.n.b(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.t1.a(hVar));
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.n1) ((m33.r1) i95.n0.c(m33.r1.class))).wi().a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
    }

    public x1(byte[] bArr, boolean z17) {
        m53.a2 a2Var = new m53.a2();
        this.f222048a = a2Var;
        if (bArr == null || bArr.length == 0) {
            return;
        }
        try {
            a2Var.mo11468x92b714fd(bArr);
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GamePBDataIndex4", "Parsing Failed: %s", e17.getMessage());
        }
        b(z17);
    }
}
