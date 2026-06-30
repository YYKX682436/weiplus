package iv5;

/* loaded from: classes16.dex */
public class i extends iv5.j {

    /* renamed from: d, reason: collision with root package name */
    public final av5.n0 f376690d;

    /* renamed from: e, reason: collision with root package name */
    public final av5.u f376691e;

    public i(jv5.a aVar, av5.y yVar, av5.y yVar2, kv5.i iVar) {
        super(aVar, yVar, iVar);
        this.f376690d = null;
        this.f376691e = null;
        if (yVar2 != null) {
            av5.n0 n0Var = yVar2.f95995a.f95973q;
            this.f376690d = n0Var;
            this.f376691e = yVar2.d(n0Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009f, code lost:
    
        return new av5.m(r9.f95950d, r9.f95947e, r2, r4.toByteArray());
     */
    @Override // iv5.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Comparable a(kv5.f r8, java.lang.Comparable r9) {
        /*
            r7 = this;
            av5.m r9 = (av5.m) r9
            r8.getClass()
            int[] r0 = r9.f95948f
            int r1 = r0.length
            int[] r2 = new int[r1]
            r3 = 0
        Lb:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            int r4 = r8.f(r4)
            r2[r3] = r4
            int r3 = r3 + 1
            goto Lb
        L18:
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            byte[] r1 = r9.f95949g
            r0.<init>(r1)
            kv5.a r3 = new kv5.a
            r3.<init>(r8, r0)
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream
            int r1 = r1.length
            int r1 = r1 + 512
            r4.<init>(r1)
            kv5.b r1 = new kv5.b
            r1.<init>(r8, r4)
        L31:
            int r5 = r0.read()
            r5 = r5 & 255(0xff, float:3.57E-43)
            r4.write(r5)
            r6 = 9
            if (r5 == r6) goto La0
            switch(r5) {
                case 0: goto L92;
                case 1: goto L8a;
                case 2: goto L82;
                case 3: goto L4a;
                case 4: goto L4a;
                case 5: goto L42;
                case 6: goto L42;
                default: goto L41;
            }
        L41:
            goto L31
        L42:
            int r5 = av5.f0.b(r3)
            av5.f0.d(r1, r5)
            goto L31
        L4a:
            int r6 = av5.f0.b(r3)
            av5.f0.d(r1, r6)
            int r6 = av5.f0.b(r3)
            int r6 = r6 + (-1)
            int r6 = r8.f(r6)
            int r6 = r6 + 1
            av5.f0.d(r1, r6)
            int r6 = av5.f0.b(r3)
            int r6 = r6 + (-1)
            int r6 = r8.g(r6)
            int r6 = r6 + 1
            av5.f0.d(r1, r6)
            r6 = 4
            if (r5 != r6) goto L31
            int r5 = av5.f0.b(r3)
            int r5 = r5 + (-1)
            int r5 = r8.f(r5)
            int r5 = r5 + 1
            av5.f0.d(r1, r5)
            goto L31
        L82:
            int r5 = av5.f0.a(r3)
            av5.f0.c(r1, r5)
            goto L31
        L8a:
            int r5 = av5.f0.b(r3)
            av5.f0.d(r1, r5)
            goto L31
        L92:
            byte[] r8 = r4.toByteArray()
            av5.m r0 = new av5.m
            int r1 = r9.f95950d
            int r9 = r9.f95947e
            r0.<init>(r1, r9, r2, r8)
            return r0
        La0:
            int r5 = av5.f0.b(r3)
            int r5 = r5 + (-1)
            int r5 = r8.f(r5)
            int r5 = r5 + 1
            av5.f0.d(r1, r5)
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: iv5.i.a(kv5.f, java.lang.Comparable):java.lang.Comparable");
    }

    @Override // iv5.j
    public av5.n0 c(av5.y yVar) {
        return yVar.f95995a.f95973q;
    }

    @Override // iv5.j
    public void d(kv5.i iVar, int i17, int i18) {
        if (i18 < 0) {
            iVar.getClass();
        } else {
            iVar.E.b(i18, true);
        }
    }

    @Override // iv5.j
    public java.lang.Comparable e(bv5.b bVar) {
        return bVar.j();
    }

    @Override // iv5.j
    public void h(kv5.i iVar, int i17, int i18, int i19, int i27) {
        if (i18 != i27) {
            iVar.f394307o.f(i18, i27);
        }
    }

    @Override // iv5.j
    public int i(java.lang.Comparable comparable) {
        av5.m mVar = (av5.m) comparable;
        this.f376690d.f95953f++;
        av5.u uVar = this.f376691e;
        uVar.A(uVar.f95990f.f95995a.f95973q, true);
        int position = uVar.f106295a.position();
        av5.f0.d(uVar, mVar.f95947e);
        int[] iArr = mVar.f95948f;
        av5.f0.d(uVar, iArr.length);
        for (int i17 : iArr) {
            av5.f0.d(uVar, i17 + 1);
        }
        uVar.v(mVar.f95949g);
        return position;
    }
}
