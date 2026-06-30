package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.p3045x5e0f67f;

/* renamed from: com.tencent.thumbplayer.core.postprocessor.group.SharpenFilterGroup */
/* loaded from: classes14.dex */
public class C26433x626305f4 implements com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.p3045x5e0f67f.InterfaceC26432x5eb375de {

    /* renamed from: ifsharpen */
    public boolean f53673xae3a7256 = true;

    /* renamed from: mBlurFilter */
    private com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.p3044xb408cb78.C26426xdab9adf f53674x730bb70c;

    /* renamed from: mOES2TextureFilter */
    private com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.p3044xb408cb78.C26428x1a905fde f53675xccada711;

    /* renamed from: mTexture2OESFilter */
    private com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.p3044xb408cb78.C26429x34521e3e f53676xe8325591;

    /* renamed from: mUSM3FusionFilter */
    private com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.p3044xb408cb78.C26430x7287f360 f53677xcadb79cd;

    public C26433x626305f4(java.lang.String str) {
        this.f53675xccada711 = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.p3044xb408cb78.C26428x1a905fde(str);
        this.f53677xcadb79cd = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.p3044xb408cb78.C26430x7287f360(str);
        this.f53674x730bb70c = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.p3044xb408cb78.C26426xdab9adf(str);
        this.f53676xe8325591 = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.p3044xb408cb78.C26429x34521e3e(str);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.p3045x5e0f67f.InterfaceC26432x5eb375de
    /* renamed from: destroyBuffers */
    public void mo102809xdd60ded9() {
        this.f53675xccada711.m102790xdd60ded9();
        this.f53677xcadb79cd.m102806xdd60ded9();
        this.f53674x730bb70c.m102773xdd60ded9();
        this.f53676xe8325591.m102799xdd60ded9();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.p3045x5e0f67f.InterfaceC26432x5eb375de
    /* renamed from: genOESTexture */
    public void mo102810xfe6786e() {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.p3044xb408cb78.C26428x1a905fde c26428x1a905fde = this.f53675xccada711;
        if (c26428x1a905fde == null) {
            throw new java.lang.RuntimeException("sifeng: OES2TextureFilter(null) generate texture failed");
        }
        c26428x1a905fde.m102791xfe6786e();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.p3045x5e0f67f.InterfaceC26432x5eb375de
    /* renamed from: getOESTextureid */
    public int mo102811x473c490f() {
        return this.f53675xccada711.m102792x473c490f();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.p3045x5e0f67f.InterfaceC26432x5eb375de
    /* renamed from: process */
    public void mo102812xed8d1e6f(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18, int i19, int i27, boolean z17, int i28) {
        if (z17) {
            int m102793xed8d1e6f = this.f53675xccada711.m102793xed8d1e6f(surfaceTexture, i17, i18, true, false);
            this.f53674x730bb70c.m102775xed8d1e6f(m102793xed8d1e6f, i17, i18);
            this.f53676xe8325591.m102800xed8d1e6f(this.f53677xcadb79cd.m102807xed8d1e6f(m102793xed8d1e6f, this.f53674x730bb70c.m102774x753005cc(0), this.f53674x730bb70c.m102774x753005cc(1), this.f53674x730bb70c.m102774x753005cc(2), i17, i18, z17, i28), i19, i27, true);
        } else {
            this.f53676xe8325591.m102800xed8d1e6f(this.f53675xccada711.m102793xed8d1e6f(surfaceTexture, i17, i18, false, false), i19, i27, false);
        }
        android.opengl.GLES20.glFlush();
    }
}
