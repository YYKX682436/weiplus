package p012xc85e97e9.p023xae79c325.p034x2eaf9f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aV\u0010\n\u001a\u00020\t*\u00020\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004H\u0086@¢\u0006\u0004\b\n\u0010\u000b\u001a^\u0010\n\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004H\u0086@¢\u0006\u0004\b\n\u0010\u000f\u001a\u000e\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u0000H\u0001¨\u0006\u0012"}, d2 = {"Landroidx/camera/core/ImageCapture;", "Lkotlin/Function0;", "Ljz5/f0;", "onCaptureStarted", "Lkotlin/Function1;", "", "onCaptureProcessProgressed", "Landroid/graphics/Bitmap;", "onPostviewBitmapAvailable", "Landroidx/camera/core/ImageProxy;", "takePicture", "(Landroidx/camera/core/ImageCapture;Lyz5/a;Lyz5/l;Lyz5/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/camera/core/ImageCapture$OutputFileOptions;", "outputFileOptions", "Landroidx/camera/core/ImageCapture$OutputFileResults;", "(Landroidx/camera/core/ImageCapture;Landroidx/camera/core/ImageCapture$OutputFileOptions;Lyz5/a;Lyz5/l;Lyz5/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/camera/core/imagecapture/TakePictureRequest;", "getTakePictureRequest", "camera-core_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: androidx.camera.core.ImageCaptureExtKt */
/* loaded from: classes14.dex */
public final class C0525x47b4809f {
    /* renamed from: getTakePictureRequest */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.AbstractC0637xf28cf838 m4597x98259e0e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b c0517x4e63dd8b) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c0517x4e63dd8b, "<this>");
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0628xb42fbf3a m5069xfd7b7e02 = c0517x4e63dd8b.m4538x889fbb2c().m5069xfd7b7e02();
        if (m5069xfd7b7e02 != null) {
            return m5069xfd7b7e02.m5049x98259e0e();
        }
        return null;
    }

    /* renamed from: takePicture */
    public static final java.lang.Object m4599x3caeea77(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b c0517x4e63dd8b, final yz5.a aVar, final yz5.l lVar, final yz5.l lVar2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57<? super p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3> interfaceC29045xdcb5ca57) {
        java.util.concurrent.Executor m5978x5ebfffdc;
        oz5.l mo48699x76847179 = interfaceC29045xdcb5ca57.mo48699x76847179();
        int i17 = oz5.f.Y0;
        oz5.i iVar = mo48699x76847179.get(oz5.e.f431860d);
        p3325xe03a0797.p3326xc267989b.p0 p0Var = iVar instanceof p3325xe03a0797.p3326xc267989b.p0 ? (p3325xe03a0797.p3326xc267989b.p0) iVar : null;
        if (p0Var != null) {
            m5978x5ebfffdc = p3325xe03a0797.p3326xc267989b.h2.a(p0Var);
        } else {
            m5978x5ebfffdc = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5978x5ebfffdc();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m5978x5ebfffdc, "directExecutor()");
        }
        final p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        final p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var.f391656d = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0488x6892efbc(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageCapturedCallback() { // from class: androidx.camera.core.ImageCaptureExtKt$takePicture$2$1
            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageCapturedCallback
            /* renamed from: onCaptureProcessProgressed */
            public void mo4368x1c9165b4(int i18) {
                yz5.l lVar3 = lVar;
                if (lVar3 != null) {
                    lVar3.mo146xb9724478(java.lang.Integer.valueOf(i18));
                }
            }

            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageCapturedCallback
            /* renamed from: onCaptureStarted */
            public void mo4369x56961e1a() {
                yz5.a aVar2 = yz5.a.this;
                if (aVar2 != null) {
                    aVar2.mo152xb9724478();
                }
            }

            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageCapturedCallback
            /* renamed from: onCaptureSuccess */
            public void mo4370x58601d9c(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 imageProxy) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageProxy, "imageProxy");
                java.lang.Object obj = h0Var.f391656d;
                if (obj == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("delegatingCallback");
                    throw null;
                }
                ((p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0488x6892efbc) obj).m4367x63a5261f();
                rVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(imageProxy));
            }

            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageCapturedCallback
            /* renamed from: onError */
            public void mo4371xaf8aa769(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0524xb471f04 exception) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exception, "exception");
                java.lang.Object obj = h0Var.f391656d;
                if (obj == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("delegatingCallback");
                    throw null;
                }
                ((p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0488x6892efbc) obj).m4367x63a5261f();
                p3325xe03a0797.p3326xc267989b.q qVar = rVar;
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(exception)));
            }

            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageCapturedCallback
            /* renamed from: onPostviewBitmapAvailable */
            public void mo4372x945ddf76(android.graphics.Bitmap bitmap) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
                yz5.l lVar3 = lVar2;
                if (lVar3 != null) {
                    lVar3.mo146xb9724478(bitmap);
                }
            }
        });
        rVar.m(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0527x3e808a8e(h0Var));
        java.lang.Object obj = h0Var.f391656d;
        if (obj != null) {
            c0517x4e63dd8b.m4518xf1e63327(m5978x5ebfffdc, (p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0488x6892efbc) obj);
            java.lang.Object j17 = rVar.j();
            pz5.a aVar2 = pz5.a.f440719d;
            return j17;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("delegatingCallback");
        throw null;
    }

    /* renamed from: takePicture$default */
    public static /* synthetic */ java.lang.Object m4601x1fb2a914(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b c0517x4e63dd8b, yz5.a aVar, yz5.l lVar, yz5.l lVar2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            aVar = null;
        }
        if ((i17 & 2) != 0) {
            lVar = null;
        }
        if ((i17 & 4) != 0) {
            lVar2 = null;
        }
        return m4599x3caeea77(c0517x4e63dd8b, aVar, lVar, lVar2, interfaceC29045xdcb5ca57);
    }

    /* renamed from: takePicture */
    public static final java.lang.Object m4598x3caeea77(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b c0517x4e63dd8b, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OutputFileOptions outputFileOptions, final yz5.a aVar, final yz5.l lVar, final yz5.l lVar2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57<? super p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OutputFileResults> interfaceC29045xdcb5ca57) {
        java.util.concurrent.Executor m5978x5ebfffdc;
        oz5.l mo48699x76847179 = interfaceC29045xdcb5ca57.mo48699x76847179();
        int i17 = oz5.f.Y0;
        oz5.i iVar = mo48699x76847179.get(oz5.e.f431860d);
        p3325xe03a0797.p3326xc267989b.p0 p0Var = iVar instanceof p3325xe03a0797.p3326xc267989b.p0 ? (p3325xe03a0797.p3326xc267989b.p0) iVar : null;
        if (p0Var != null) {
            m5978x5ebfffdc = p3325xe03a0797.p3326xc267989b.h2.a(p0Var);
        } else {
            m5978x5ebfffdc = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5978x5ebfffdc();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m5978x5ebfffdc, "directExecutor()");
        }
        final p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        final p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var.f391656d = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0489xb2924f13(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageSavedCallback() { // from class: androidx.camera.core.ImageCaptureExtKt$takePicture$4$1
            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageSavedCallback
            /* renamed from: onCaptureProcessProgressed */
            public void mo4375x1c9165b4(int i18) {
                yz5.l lVar3 = lVar;
                if (lVar3 != null) {
                    lVar3.mo146xb9724478(java.lang.Integer.valueOf(i18));
                }
            }

            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageSavedCallback
            /* renamed from: onCaptureStarted */
            public void mo4376x56961e1a() {
                yz5.a aVar2 = yz5.a.this;
                if (aVar2 != null) {
                    aVar2.mo152xb9724478();
                }
            }

            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageSavedCallback
            /* renamed from: onError */
            public void mo4377xaf8aa769(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0524xb471f04 exception) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exception, "exception");
                java.lang.Object obj = h0Var.f391656d;
                if (obj == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("delegatingCallback");
                    throw null;
                }
                ((p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0489xb2924f13) obj).m4374x63a5261f();
                p3325xe03a0797.p3326xc267989b.q qVar = rVar;
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(exception)));
            }

            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageSavedCallback
            /* renamed from: onImageSaved */
            public void mo4378x706cd52b(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OutputFileResults outputFileResults) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outputFileResults, "outputFileResults");
                java.lang.Object obj = h0Var.f391656d;
                if (obj == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("delegatingCallback");
                    throw null;
                }
                ((p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0489xb2924f13) obj).m4374x63a5261f();
                rVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(outputFileResults));
            }

            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageSavedCallback
            /* renamed from: onPostviewBitmapAvailable */
            public void mo4379x945ddf76(android.graphics.Bitmap bitmap) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
                yz5.l lVar3 = lVar2;
                if (lVar3 != null) {
                    lVar3.mo146xb9724478(bitmap);
                }
            }
        });
        rVar.m(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0529x3e809210(h0Var));
        java.lang.Object obj = h0Var.f391656d;
        if (obj != null) {
            c0517x4e63dd8b.m4519xf1e63328(outputFileOptions, m5978x5ebfffdc, (p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0489xb2924f13) obj);
            java.lang.Object j17 = rVar.j();
            pz5.a aVar2 = pz5.a.f440719d;
            return j17;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("delegatingCallback");
        throw null;
    }
}
