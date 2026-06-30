package androidx.camera.core;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aV\u0010\n\u001a\u00020\t*\u00020\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004H\u0086@¢\u0006\u0004\b\n\u0010\u000b\u001a^\u0010\n\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004H\u0086@¢\u0006\u0004\b\n\u0010\u000f\u001a\u000e\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u0000H\u0001¨\u0006\u0012"}, d2 = {"Landroidx/camera/core/ImageCapture;", "Lkotlin/Function0;", "Ljz5/f0;", "onCaptureStarted", "Lkotlin/Function1;", "", "onCaptureProcessProgressed", "Landroid/graphics/Bitmap;", "onPostviewBitmapAvailable", "Landroidx/camera/core/ImageProxy;", "takePicture", "(Landroidx/camera/core/ImageCapture;Lyz5/a;Lyz5/l;Lyz5/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/camera/core/ImageCapture$OutputFileOptions;", "outputFileOptions", "Landroidx/camera/core/ImageCapture$OutputFileResults;", "(Landroidx/camera/core/ImageCapture;Landroidx/camera/core/ImageCapture$OutputFileOptions;Lyz5/a;Lyz5/l;Lyz5/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/camera/core/imagecapture/TakePictureRequest;", "getTakePictureRequest", "camera-core_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes14.dex */
public final class ImageCaptureExtKt {
    public static final androidx.camera.core.imagecapture.TakePictureRequest getTakePictureRequest(androidx.camera.core.ImageCapture imageCapture) {
        kotlin.jvm.internal.o.g(imageCapture, "<this>");
        androidx.camera.core.imagecapture.RequestWithCallback capturingRequest = imageCapture.getTakePictureManager().getCapturingRequest();
        if (capturingRequest != null) {
            return capturingRequest.getTakePictureRequest();
        }
        return null;
    }

    public static final java.lang.Object takePicture(androidx.camera.core.ImageCapture imageCapture, final yz5.a aVar, final yz5.l lVar, final yz5.l lVar2, kotlin.coroutines.Continuation<? super androidx.camera.core.ImageProxy> continuation) {
        java.util.concurrent.Executor directExecutor;
        oz5.l context = continuation.getContext();
        int i17 = oz5.f.Y0;
        oz5.i iVar = context.get(oz5.e.f350327d);
        kotlinx.coroutines.p0 p0Var = iVar instanceof kotlinx.coroutines.p0 ? (kotlinx.coroutines.p0) iVar : null;
        if (p0Var != null) {
            directExecutor = kotlinx.coroutines.h2.a(p0Var);
        } else {
            directExecutor = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor();
            kotlin.jvm.internal.o.f(directExecutor, "directExecutor()");
        }
        final kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        final kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = new androidx.camera.core.DelegatingImageCapturedCallback(new androidx.camera.core.ImageCapture.OnImageCapturedCallback() { // from class: androidx.camera.core.ImageCaptureExtKt$takePicture$2$1
            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onCaptureProcessProgressed(int i18) {
                yz5.l lVar3 = lVar;
                if (lVar3 != null) {
                    lVar3.invoke(java.lang.Integer.valueOf(i18));
                }
            }

            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onCaptureStarted() {
                yz5.a aVar2 = yz5.a.this;
                if (aVar2 != null) {
                    aVar2.invoke();
                }
            }

            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onCaptureSuccess(androidx.camera.core.ImageProxy imageProxy) {
                kotlin.jvm.internal.o.g(imageProxy, "imageProxy");
                java.lang.Object obj = h0Var.f310123d;
                if (obj == null) {
                    kotlin.jvm.internal.o.o("delegatingCallback");
                    throw null;
                }
                ((androidx.camera.core.DelegatingImageCapturedCallback) obj).dispose();
                rVar.resumeWith(kotlin.Result.m521constructorimpl(imageProxy));
            }

            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onError(androidx.camera.core.ImageCaptureException exception) {
                kotlin.jvm.internal.o.g(exception, "exception");
                java.lang.Object obj = h0Var.f310123d;
                if (obj == null) {
                    kotlin.jvm.internal.o.o("delegatingCallback");
                    throw null;
                }
                ((androidx.camera.core.DelegatingImageCapturedCallback) obj).dispose();
                kotlinx.coroutines.q qVar = rVar;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                qVar.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(exception)));
            }

            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onPostviewBitmapAvailable(android.graphics.Bitmap bitmap) {
                kotlin.jvm.internal.o.g(bitmap, "bitmap");
                yz5.l lVar3 = lVar2;
                if (lVar3 != null) {
                    lVar3.invoke(bitmap);
                }
            }
        });
        rVar.m(new androidx.camera.core.ImageCaptureExtKt$takePicture$2$2(h0Var));
        java.lang.Object obj = h0Var.f310123d;
        if (obj != null) {
            imageCapture.lambda$takePicture$1(directExecutor, (androidx.camera.core.DelegatingImageCapturedCallback) obj);
            java.lang.Object j17 = rVar.j();
            pz5.a aVar2 = pz5.a.f359186d;
            return j17;
        }
        kotlin.jvm.internal.o.o("delegatingCallback");
        throw null;
    }

    public static /* synthetic */ java.lang.Object takePicture$default(androidx.camera.core.ImageCapture imageCapture, yz5.a aVar, yz5.l lVar, yz5.l lVar2, kotlin.coroutines.Continuation continuation, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            aVar = null;
        }
        if ((i17 & 2) != 0) {
            lVar = null;
        }
        if ((i17 & 4) != 0) {
            lVar2 = null;
        }
        return takePicture(imageCapture, aVar, lVar, lVar2, continuation);
    }

    public static final java.lang.Object takePicture(androidx.camera.core.ImageCapture imageCapture, androidx.camera.core.ImageCapture.OutputFileOptions outputFileOptions, final yz5.a aVar, final yz5.l lVar, final yz5.l lVar2, kotlin.coroutines.Continuation<? super androidx.camera.core.ImageCapture.OutputFileResults> continuation) {
        java.util.concurrent.Executor directExecutor;
        oz5.l context = continuation.getContext();
        int i17 = oz5.f.Y0;
        oz5.i iVar = context.get(oz5.e.f350327d);
        kotlinx.coroutines.p0 p0Var = iVar instanceof kotlinx.coroutines.p0 ? (kotlinx.coroutines.p0) iVar : null;
        if (p0Var != null) {
            directExecutor = kotlinx.coroutines.h2.a(p0Var);
        } else {
            directExecutor = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor();
            kotlin.jvm.internal.o.f(directExecutor, "directExecutor()");
        }
        final kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        final kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = new androidx.camera.core.DelegatingImageSavedCallback(new androidx.camera.core.ImageCapture.OnImageSavedCallback() { // from class: androidx.camera.core.ImageCaptureExtKt$takePicture$4$1
            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public void onCaptureProcessProgressed(int i18) {
                yz5.l lVar3 = lVar;
                if (lVar3 != null) {
                    lVar3.invoke(java.lang.Integer.valueOf(i18));
                }
            }

            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public void onCaptureStarted() {
                yz5.a aVar2 = yz5.a.this;
                if (aVar2 != null) {
                    aVar2.invoke();
                }
            }

            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public void onError(androidx.camera.core.ImageCaptureException exception) {
                kotlin.jvm.internal.o.g(exception, "exception");
                java.lang.Object obj = h0Var.f310123d;
                if (obj == null) {
                    kotlin.jvm.internal.o.o("delegatingCallback");
                    throw null;
                }
                ((androidx.camera.core.DelegatingImageSavedCallback) obj).dispose();
                kotlinx.coroutines.q qVar = rVar;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                qVar.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(exception)));
            }

            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public void onImageSaved(androidx.camera.core.ImageCapture.OutputFileResults outputFileResults) {
                kotlin.jvm.internal.o.g(outputFileResults, "outputFileResults");
                java.lang.Object obj = h0Var.f310123d;
                if (obj == null) {
                    kotlin.jvm.internal.o.o("delegatingCallback");
                    throw null;
                }
                ((androidx.camera.core.DelegatingImageSavedCallback) obj).dispose();
                rVar.resumeWith(kotlin.Result.m521constructorimpl(outputFileResults));
            }

            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public void onPostviewBitmapAvailable(android.graphics.Bitmap bitmap) {
                kotlin.jvm.internal.o.g(bitmap, "bitmap");
                yz5.l lVar3 = lVar2;
                if (lVar3 != null) {
                    lVar3.invoke(bitmap);
                }
            }
        });
        rVar.m(new androidx.camera.core.ImageCaptureExtKt$takePicture$4$2(h0Var));
        java.lang.Object obj = h0Var.f310123d;
        if (obj != null) {
            imageCapture.lambda$takePicture$2(outputFileOptions, directExecutor, (androidx.camera.core.DelegatingImageSavedCallback) obj);
            java.lang.Object j17 = rVar.j();
            pz5.a aVar2 = pz5.a.f359186d;
            return j17;
        }
        kotlin.jvm.internal.o.o("delegatingCallback");
        throw null;
    }
}
