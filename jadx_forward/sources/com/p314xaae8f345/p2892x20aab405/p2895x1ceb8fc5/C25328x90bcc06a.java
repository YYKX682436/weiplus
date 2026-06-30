package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5;

/* renamed from: com.tencent.qqmusic.mediaplayer.FloatBufferInfo */
/* loaded from: classes13.dex */
public class C25328x90bcc06a {

    /* renamed from: bufferSize */
    public int f45599x719ec861;

    /* renamed from: floatBuffer */
    public float[] f45600x77ac6dbc;

    /* renamed from: tempFloatBuffer */
    public float[] f45601x9a84e548;

    /* renamed from: appendFloat */
    public void m93787x8e2fc362(float[] fArr, int i17, int i18) {
        if (fArr == null || i17 < 0 || i18 <= 0 || i17 + i18 > fArr.length) {
            return;
        }
        m93790xb77506d4(this.f45599x719ec861 + i18);
        java.lang.System.arraycopy(fArr, i17, this.f45600x77ac6dbc, this.f45599x719ec861, i18);
    }

    /* renamed from: copy */
    public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25328x90bcc06a m93788x2eaf75(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25328x90bcc06a c25328x90bcc06a) {
        c25328x90bcc06a.f45599x719ec861 = this.f45599x719ec861;
        c25328x90bcc06a.f45600x77ac6dbc = this.f45600x77ac6dbc;
        c25328x90bcc06a.f45601x9a84e548 = this.f45601x9a84e548;
        return c25328x90bcc06a;
    }

    /* renamed from: fillFloat */
    public void m93789xbc193699(float[] fArr, int i17) {
        if (fArr == null || i17 <= 0 || i17 > fArr.length) {
            return;
        }
        this.f45600x77ac6dbc = fArr;
        this.f45599x719ec861 = i17;
    }

    /* renamed from: setFloatBufferCapacity */
    public void m93790xb77506d4(int i17) {
        float[] fArr = this.f45600x77ac6dbc;
        if (fArr == null || fArr.length < i17) {
            this.f45600x77ac6dbc = new float[i17];
        }
    }

    /* renamed from: setTempFloatBufferCapacity */
    public void m93791xa70ee360(int i17) {
        float[] fArr = this.f45601x9a84e548;
        if (fArr == null || fArr.length < i17) {
            this.f45601x9a84e548 = new float[i17];
        }
    }
}
