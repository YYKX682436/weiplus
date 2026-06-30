package os0;

/* loaded from: classes14.dex */
public final class g extends os0.a {
    public final java.lang.Float[][] C;
    public final java.lang.Float[][] D;
    public java.lang.Float[][] E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;

    /* renamed from: J, reason: collision with root package name */
    public final int f429554J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    public final int Q;
    public final int R;
    public final int S;
    public final int T;
    public int U;
    public boolean V;
    public boolean W;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(int r9, int r10, int r11, int r12, int r13, int r14, p3321xbce91901.jvm.p3324x21ffc6bd.i r15) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: os0.g.<init>(int, int, int, int, int, int, kotlin.jvm.internal.i):void");
    }

    @Override // os0.a
    public void p() {
        if (this.U == -1) {
            return;
        }
        android.opengl.GLES20.glActiveTexture(33984);
        android.opengl.GLES20.glBindTexture(3553, this.U);
        android.opengl.GLES20.glTexParameteri(3553, 10241, 9728);
        android.opengl.GLES20.glTexParameteri(3553, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, 9728);
        android.opengl.GLES20.glTexParameteri(3553, 10242, 33071);
        android.opengl.GLES20.glTexParameteri(3553, 10243, 33071);
        y(true);
        y(false);
        int i17 = this.f429528d / 3;
        android.opengl.GLES20.glViewport(0, i17 + 0, this.f429527c, i17 * 2);
        android.opengl.GLES20.glUseProgram(this.M);
        android.opengl.GLES20.glUniform1i(this.N, 0);
        android.opengl.GLES20.glUniform1f(this.R, this.f429525a);
        android.opengl.GLES20.glUniform1f(this.S, this.f429526b);
        android.opengl.GLES20.glUniform1i(this.P, (this.f429528d / 3) + 0);
        android.opengl.GLES20.glUniform4f(this.Q, this.E[0][0].floatValue(), this.E[0][1].floatValue(), this.E[0][2].floatValue(), this.E[0][3].floatValue());
        android.opengl.GLES20.glUniformMatrix4fv(this.O, 1, false, this.f429536l, 0);
        this.f429532h.position(0);
        android.opengl.GLES20.glVertexAttribPointer(0, 2, 5126, false, 0, (java.nio.Buffer) this.f429532h);
        android.opengl.GLES20.glEnableVertexAttribArray(0);
        this.f429531g.position(0);
        android.opengl.GLES20.glVertexAttribPointer(this.T, 2, 5126, false, 0, (java.nio.Buffer) this.f429531g);
        int i18 = this.T;
        android.opengl.GLES20.glEnableVertexAttribArray(i18);
        android.opengl.GLES20.glDrawArrays(5, 0, 4);
        android.opengl.GLES20.glDisableVertexAttribArray(0);
        android.opengl.GLES20.glDisableVertexAttribArray(i18);
        android.opengl.GLES20.glBindTexture(3553, 0);
        android.opengl.GLES20.glBindTexture(36197, 0);
    }

    @Override // os0.a
    public void r(int i17) {
        this.U = i17;
    }

    public final void x() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RGB2YUVI420RenderProc", "refreshCalculateParams: fullRange " + this.V + ", 709 " + this.W);
        java.lang.Float[][] fArr = this.W ? this.D : this.C;
        if (!this.V) {
            java.lang.Object[] objArr = (java.lang.Object[]) fArr.clone();
            int length = fArr.length;
            for (int i17 = 0; i17 < length; i17++) {
                java.lang.Float[] fArr2 = fArr[i17];
                java.lang.Object[] objArr2 = (java.lang.Object[]) fArr2.clone();
                int length2 = fArr2.length;
                for (int i18 = 0; i18 < length2; i18++) {
                    objArr2[i18] = java.lang.Float.valueOf(fArr2[i18].floatValue() * 0.875f);
                }
                objArr[i17] = (java.lang.Float[]) objArr2;
            }
            fArr = (java.lang.Float[][]) objArr;
            fArr[0][3] = java.lang.Float.valueOf(0.0625f);
        }
        this.E = fArr;
    }

    public final void y(boolean z17) {
        android.opengl.GLES20.glViewport(0, (z17 ? this.f429528d / 6 : 0) + 0, this.f429527c, this.f429528d / 6);
        android.opengl.GLES20.glUseProgram(this.F);
        android.opengl.GLES20.glUniform1i(this.H, 0);
        android.opengl.GLES20.glUniform1i(this.G, (z17 ? this.f429528d / 6 : 0) + 0);
        android.opengl.GLES20.glUniform1f(this.K, this.f429525a);
        android.opengl.GLES20.glUniform1f(this.L, this.f429526b);
        int i17 = this.I;
        if (z17) {
            android.opengl.GLES20.glUniform4f(i17, this.E[1][0].floatValue(), this.E[1][1].floatValue(), this.E[1][2].floatValue(), this.E[1][3].floatValue());
        } else {
            android.opengl.GLES20.glUniform4f(i17, this.E[2][0].floatValue(), this.E[2][1].floatValue(), this.E[2][2].floatValue(), this.E[2][3].floatValue());
        }
        android.opengl.GLES20.glUniformMatrix4fv(this.f429554J, 1, false, this.f429536l, 0);
        this.f429532h.position(0);
        android.opengl.GLES20.glVertexAttribPointer(0, 2, 5126, false, 0, (java.nio.Buffer) this.f429532h);
        android.opengl.GLES20.glEnableVertexAttribArray(0);
        this.f429531g.position(0);
        android.opengl.GLES20.glVertexAttribPointer(this.T, 2, 5126, false, 0, (java.nio.Buffer) this.f429531g);
        android.opengl.GLES20.glEnableVertexAttribArray(this.T);
        android.opengl.GLES20.glDrawArrays(5, 0, 4);
    }
}
