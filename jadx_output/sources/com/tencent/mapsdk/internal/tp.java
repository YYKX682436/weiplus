package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class tp implements com.tencent.mapsdk.internal.fb {

    /* renamed from: a, reason: collision with root package name */
    private com.tencent.mapsdk.internal.tr f52156a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f52157b = false;

    public tp(com.tencent.mapsdk.internal.tr trVar) {
        this.f52156a = trVar;
    }

    @Override // com.tencent.mapsdk.internal.fb
    public final void a() {
    }

    @Override // com.tencent.mapsdk.internal.fb
    public final boolean b() {
        return false;
    }

    @Override // com.tencent.mapsdk.internal.fb
    public final boolean c() {
        return false;
    }

    @Override // com.tencent.mapsdk.internal.fb
    public final boolean d() {
        return false;
    }

    @Override // com.tencent.mapsdk.internal.fb
    public final boolean e(float f17, float f18) {
        return false;
    }

    @Override // com.tencent.mapsdk.internal.fb
    public final boolean f(float f17, float f18) {
        return false;
    }

    @Override // com.tencent.mapsdk.internal.fb
    public final boolean g(float f17, float f18) {
        return false;
    }

    @Override // com.tencent.mapsdk.internal.fb
    public final boolean h(float f17, float f18) {
        com.tencent.mapsdk.internal.tr trVar = this.f52156a;
        if (trVar == null || !trVar.f52266al) {
            return false;
        }
        trVar.f52272ar++;
        com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListenerList tencentMapGestureListenerList = trVar.f52265ak;
        if (tencentMapGestureListenerList != null) {
            return tencentMapGestureListenerList.onDown(f17, f18);
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.fb
    public final boolean i(float f17, float f18) {
        int i17;
        com.tencent.mapsdk.internal.tr trVar = this.f52156a;
        if (trVar == null || !trVar.f52266al) {
            return false;
        }
        int i18 = trVar.f52272ar;
        if (i18 > 0) {
            i17 = i18 - 1;
            trVar.f52272ar = i17;
        } else {
            i17 = 0;
        }
        trVar.f52272ar = i17;
        e();
        if (this.f52156a.f52271aq && this.f52156a.f52270ap) {
            com.tencent.mapsdk.internal.tr trVar2 = this.f52156a;
            if (trVar2.f52272ar == 0) {
                com.tencent.tencentmap.mapsdk.maps.model.CameraPosition a17 = trVar2.a();
                if (a17 == null) {
                    return false;
                }
                this.f52156a.f52271aq = false;
                this.f52156a.onCameraChangeFinished(a17);
            }
        }
        com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListenerList tencentMapGestureListenerList = this.f52156a.f52265ak;
        if (tencentMapGestureListenerList != null) {
            return tencentMapGestureListenerList.onUp(f17, f18);
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.fb
    public final boolean j(float f17, float f18) {
        return false;
    }

    private void e() {
        com.tencent.mapsdk.internal.tr trVar = this.f52156a;
        if (trVar.f52265ak == null || !this.f52157b) {
            return;
        }
        this.f52156a.f52265ak.onTwoFingerMoveAgainst(com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener.TwoFingerMoveAgainstStatus.END, trVar.a());
        this.f52157b = false;
    }

    @Override // com.tencent.mapsdk.internal.fb
    public final boolean a(float f17, float f18) {
        boolean z17;
        com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListenerList tencentMapGestureListenerList;
        com.tencent.mapsdk.internal.tr trVar = this.f52156a;
        if (trVar != null && (z17 = trVar.f52266al) && (tencentMapGestureListenerList = trVar.f52265ak) != null && z17) {
            return tencentMapGestureListenerList.onDoubleTap(f17, f18);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0133, code lost:
    
        if (r0 == false) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0139  */
    @Override // com.tencent.mapsdk.internal.fb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(float r14, float r15) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.tp.b(float, float):boolean");
    }

    @Override // com.tencent.mapsdk.internal.fb
    public final boolean c(float f17, float f18) {
        com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListenerList tencentMapGestureListenerList;
        com.tencent.mapsdk.internal.tr trVar = this.f52156a;
        if (trVar == null || !trVar.f52266al || (tencentMapGestureListenerList = trVar.f52265ak) == null) {
            return false;
        }
        return tencentMapGestureListenerList.onFling(f17, f18);
    }

    @Override // com.tencent.mapsdk.internal.fb
    public final boolean d(float f17, float f18) {
        com.tencent.mapsdk.internal.av d17;
        com.tencent.mapsdk.internal.tr trVar = this.f52156a;
        if (trVar == null || !trVar.f52266al) {
            return false;
        }
        if (trVar.f52203r != null && (d17 = trVar.d(f17, f18)) != null) {
            trVar.f52203r.a(d17.getId());
            trVar.a(d17, true);
        } else if (trVar.f52205t != null && trVar.f52266al) {
            trVar.f52205t.onMapLongClick(com.tencent.mapsdk.internal.kr.a(((com.tencent.mapsdk.vector.VectorMap) trVar.e_).getProjection().a(new com.tencent.mapsdk.internal.fu(f17, f18))));
        }
        com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListenerList tencentMapGestureListenerList = this.f52156a.f52265ak;
        if (tencentMapGestureListenerList != null) {
            return tencentMapGestureListenerList.onLongPress(f17, f18);
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.fb
    public final boolean a(android.view.MotionEvent motionEvent, float f17, float f18) {
        com.tencent.mapsdk.internal.tr trVar = this.f52156a;
        if (trVar == null || !trVar.f52266al) {
            return false;
        }
        if (motionEvent != null && motionEvent.getPointerCount() > 1) {
            e();
        }
        com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListenerList tencentMapGestureListenerList = this.f52156a.f52265ak;
        if (tencentMapGestureListenerList != null) {
            return tencentMapGestureListenerList.onScroll(f17, f18);
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.fb
    public final boolean a(float f17) {
        com.tencent.mapsdk.internal.tr trVar = this.f52156a;
        if (trVar == null || !trVar.f52266al) {
            return false;
        }
        e();
        return false;
    }

    @Override // com.tencent.mapsdk.internal.fb
    public final boolean a(android.graphics.PointF pointF, android.graphics.PointF pointF2, float f17) {
        com.tencent.mapsdk.internal.tr trVar = this.f52156a;
        if (trVar == null || !trVar.f52266al) {
            return false;
        }
        e();
        return false;
    }

    @Override // com.tencent.mapsdk.internal.fb
    public final boolean a(android.graphics.PointF pointF, android.graphics.PointF pointF2, double d17, double d18) {
        com.tencent.mapsdk.internal.tr trVar = this.f52156a;
        if (trVar == null || !trVar.f52266al || trVar.f52265ak == null) {
            return false;
        }
        com.tencent.tencentmap.mapsdk.maps.model.CameraPosition a17 = trVar.a();
        if (!this.f52157b) {
            this.f52156a.f52265ak.onTwoFingerMoveAgainst(com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener.TwoFingerMoveAgainstStatus.START, a17);
            this.f52157b = true;
        } else {
            this.f52156a.f52265ak.onTwoFingerMoveAgainst(com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener.TwoFingerMoveAgainstStatus.RUNNING, a17);
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.fb
    public final boolean b(float f17) {
        com.tencent.mapsdk.internal.tr trVar = this.f52156a;
        if (trVar == null || !trVar.f52266al) {
            return false;
        }
        e();
        return false;
    }
}
