package dr4;

/* loaded from: classes14.dex */
public class q0 extends dr4.r1 {
    public boolean Q;
    public cr4.b R;
    public cr4.b S;

    public q0(int i17, int i18, int i19, int i27, int i28, int i29, boolean z17, int i37, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(i17, i18, (i37 & 4) != 0 ? i17 : i19, (i37 & 8) != 0 ? i18 : i27, (i37 & 16) != 0 ? 1 : i28, (i37 & 32) != 0 ? 2 : i29);
        this.Q = z17;
        G();
    }

    @Override // dr4.r1
    public boolean B() {
        return false;
    }

    @Override // dr4.r1
    public void F(boolean z17) {
        if (this.Q != z17) {
            this.Q = z17;
            G();
        }
    }

    public final void G() {
        if (this.Q) {
            if (this.S == null) {
                this.S = new cr4.b(true);
            }
        } else if (this.R == null) {
            this.R = new cr4.b(false);
        }
    }

    @Override // dr4.r1, os0.a
    public void n() {
        cr4.b bVar = this.S;
        if (bVar != null) {
            android.opengl.GLES20.glDeleteProgram(bVar.f303518b);
        }
        cr4.b bVar2 = this.R;
        if (bVar2 != null) {
            android.opengl.GLES20.glDeleteProgram(bVar2.f303518b);
        }
        super.n();
    }

    @Override // dr4.r1, os0.a
    public void p() {
        super.p();
        boolean z17 = this.Q;
        float[] fArr = this.f429536l;
        java.nio.FloatBuffer floatBuffer = this.f429531g;
        java.nio.FloatBuffer floatBuffer2 = this.f429532h;
        if (z17) {
            cr4.b bVar = this.S;
            if (bVar != null) {
                bVar.a(floatBuffer2, floatBuffer, this.C, fArr);
                return;
            }
            return;
        }
        cr4.b bVar2 = this.R;
        if (bVar2 != null) {
            bVar2.a(floatBuffer2, floatBuffer, this.C, fArr);
        }
    }
}
