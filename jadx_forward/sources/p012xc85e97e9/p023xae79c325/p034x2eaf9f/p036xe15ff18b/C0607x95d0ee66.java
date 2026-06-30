package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b;

/* renamed from: androidx.camera.core.imagecapture.Image2Bitmap */
/* loaded from: classes14.dex */
public class C0607x95d0ee66 implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0902xda8cf547<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3>, android.graphics.Bitmap> {
    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0902xda8cf547
    /* renamed from: apply, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public android.graphics.Bitmap mo4926x58b836e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3> abstractC0903x8e0938a8) {
        android.graphics.Bitmap m6225x42f60a6a;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0561xf076f77b c0561xf076f77b = null;
        try {
            try {
                if (abstractC0903x8e0938a8.mo6258x19771aed() == 35) {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 mo6256xfb7e5820 = abstractC0903x8e0938a8.mo6256xfb7e5820();
                    boolean z17 = abstractC0903x8e0938a8.mo6259x2a7ffb93() % 180 != 0;
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0561xf076f77b c0561xf076f77b2 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0561xf076f77b(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0540xdaa8f743.m4657x9aed0758(z17 ? mo6256xfb7e5820.mo4171x1c4fb41d() : mo6256xfb7e5820.mo4175x755bd410(), z17 ? mo6256xfb7e5820.mo4175x755bd410() : mo6256xfb7e5820.mo4171x1c4fb41d(), 1, 2));
                    try {
                        p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 m4618xb2732e6b = p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0532xed4713d0.m4618xb2732e6b(mo6256xfb7e5820, c0561xf076f77b2, java.nio.ByteBuffer.allocateDirect(mo6256xfb7e5820.mo4175x755bd410() * mo6256xfb7e5820.mo4171x1c4fb41d() * 4), abstractC0903x8e0938a8.mo6259x2a7ffb93(), false);
                        mo6256xfb7e5820.close();
                        if (m4618xb2732e6b != null) {
                            m6225x42f60a6a = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0869x431b07dd.m6211x2497b748(m4618xb2732e6b);
                            m4618xb2732e6b.close();
                            c0561xf076f77b = c0561xf076f77b2;
                        } else {
                            throw new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0524xb471f04(0, "Can't covert YUV to RGB", null);
                        }
                    } catch (java.lang.UnsupportedOperationException e17) {
                        e = e17;
                        throw new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0524xb471f04(0, "Can't convert " + (abstractC0903x8e0938a8.mo6258x19771aed() == 35 ? "YUV" : "JPEG") + " to bitmap", e);
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        c0561xf076f77b = c0561xf076f77b2;
                        if (c0561xf076f77b != null) {
                            c0561xf076f77b.mo4186x5a5ddf8();
                        }
                        throw th;
                    }
                } else if (abstractC0903x8e0938a8.mo6258x19771aed() == 256) {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 mo6256xfb7e58202 = abstractC0903x8e0938a8.mo6256xfb7e5820();
                    android.graphics.Bitmap m6211x2497b748 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0869x431b07dd.m6211x2497b748(mo6256xfb7e58202);
                    mo6256xfb7e58202.close();
                    m6225x42f60a6a = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0869x431b07dd.m6225x42f60a6a(m6211x2497b748, abstractC0903x8e0938a8.mo6259x2a7ffb93());
                } else {
                    throw new java.lang.IllegalArgumentException("Invalid postview image format : " + abstractC0903x8e0938a8.mo6258x19771aed());
                }
                if (c0561xf076f77b != null) {
                    c0561xf076f77b.mo4186x5a5ddf8();
                }
                return m6225x42f60a6a;
            } catch (java.lang.UnsupportedOperationException e18) {
                e = e18;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }
}
