package dr4;

/* loaded from: classes14.dex */
public class s0 extends dr4.r1 {
    public int Q;
    public final cr4.b R;
    public final cr4.d S;
    public cr4.a T;

    public s0(int i17, int i18, int i19, int i27, int i28, int i29, int i37, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(i17, i18, (i37 & 4) != 0 ? i17 : i19, (i37 & 8) != 0 ? i18 : i27, (i37 & 16) != 0 ? 1 : i28, (i37 & 32) != 0 ? 2 : i29);
        this.S = new cr4.d();
        this.R = new cr4.b(true);
    }

    @Override // dr4.r1
    public void C(int i17) {
        if (i17 > 0) {
            this.f429529e = 2;
            if (this.T == null) {
                this.T = new cr4.a();
            }
            cr4.a aVar = this.T;
            if (aVar != null) {
                aVar.f303507d = i17;
            }
        }
    }

    @Override // dr4.r1
    public void D(int i17) {
        cr4.a aVar;
        if (i17 <= 0 || (aVar = this.T) == null) {
            return;
        }
        aVar.f303508e = i17 > 0;
    }

    @Override // dr4.r1
    public void E(int i17) {
        this.Q = i17;
    }

    @Override // os0.a
    public void j(boolean z17) {
        if (this.f429529e == 2) {
            this.f429540p = !z17;
        } else {
            this.f429540p = z17;
        }
    }

    @Override // dr4.r1, os0.a
    public void n() {
        cr4.a aVar = this.T;
        if (aVar != null) {
            android.opengl.GLES20.glDeleteProgram(aVar.f303509f);
            q05.c cVar = aVar.f303504a;
            if (cVar != null) {
                cVar.a();
            }
        }
        cr4.d dVar = this.S;
        if (dVar != null) {
            is0.c cVar2 = dVar.f303528d;
            if (cVar2 != null) {
                cVar2.close();
            }
            is0.c cVar3 = dVar.f303529e;
            if (cVar3 != null) {
                cVar3.close();
            }
            is0.c cVar4 = dVar.f303530f;
            if (cVar4 != null) {
                cVar4.close();
            }
            android.opengl.GLES20.glDeleteProgram(dVar.f303525a);
        }
        android.opengl.GLES20.glDeleteProgram(this.R.f303518b);
        super.n();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x012b, code lost:
    
        if ((r10.capacity() == r8.length) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x015d, code lost:
    
        if ((r8.capacity() == r9.length) == false) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00c6  */
    @Override // dr4.r1, os0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p() {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dr4.s0.p():void");
    }

    @Override // os0.a
    public void s(int i17) {
        if (this.f429529e == 2) {
            this.f429538n = (i17 + 180) % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3;
        } else {
            this.f429538n = i17;
        }
    }

    @Override // dr4.r1
    public void y(java.nio.ByteBuffer pBuff, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pBuff, "pBuff");
        cr4.d dVar = this.S;
        if (dVar != null) {
            pBuff.position(0);
            is0.c cVar = dVar.f303528d;
            if (cVar != null) {
                cVar.a(i17, i18, 6409, pBuff, 9729, 33071);
            }
            int i19 = i17 * i18;
            pBuff.position(i19);
            is0.c cVar2 = dVar.f303529e;
            if (cVar2 != null) {
                cVar2.a(i17 / 2, i18 / 2, 6409, pBuff, 9729, 33071);
            }
            pBuff.position((i19 * 5) / 4);
            is0.c cVar3 = dVar.f303530f;
            if (cVar3 != null) {
                cVar3.a(i17 / 2, i18 / 2, 6409, pBuff, 9729, 33071);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if ((r3.capacity() == r1) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0068, code lost:
    
        if (r9 < r1) goto L35;
     */
    @Override // dr4.r1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void z(byte[] r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dr4.s0.z(byte[], int, int):void");
    }
}
