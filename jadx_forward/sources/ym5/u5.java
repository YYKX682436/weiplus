package ym5;

/* loaded from: classes10.dex */
public final class u5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym5.y5 f545084d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(ym5.y5 y5Var) {
        super(0);
        this.f545084d = y5Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        dl.f0 f0Var;
        ym5.y5 y5Var = this.f545084d;
        l45.q m177317xc879b3f2 = y5Var.m177317xc879b3f2();
        if (m177317xc879b3f2 != null && (f0Var = (dl.f0) ((l45.n) m177317xc879b3f2).d(y5Var.m177360x1f85dc49())) != null) {
            um.m d17 = f0Var.d();
            um.t tVar = d17 instanceof um.t ? (um.t) d17 : null;
            if (tVar != null) {
                java.util.Stack stack = tVar.f510232f;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doOnRestoreLastItem: item deleted=");
                sb6.append(!stack.empty());
                java.lang.String sb7 = sb6.toString();
                java.lang.String str = y5Var.f545114x;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
                if (stack.empty()) {
                    xk0.f g17 = tVar.g();
                    if (g17 != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f0Var.P, "doRestoreInitialAnim: ");
                        f0Var.E(true);
                        float f17 = g17.f536491p;
                        if (g17 instanceof yk0.a) {
                            yk0.a aVar = (yk0.a) g17;
                            f17 = aVar.z(aVar.f536490o);
                        }
                        int i17 = g17.f536489n;
                        float f18 = (0.0f - i17) % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3;
                        if (f18 > 180.0f) {
                            i17 += com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3;
                        } else if (f18 < -180.0f) {
                            i17 += org.p3343x72743996.net.InterfaceC29524x4f65168b.f73983x984b3535;
                        }
                        ok.i iVar = f0Var.R;
                        iVar.f427460a = true;
                        android.graphics.PointF pointF = g17.f536488m;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(pointF, "getPoint(...)");
                        if (g17.f536500y == null) {
                            android.graphics.PointF pointF2 = g17.f536488m;
                            g17.x(pointF2.x, pointF2.y);
                        }
                        android.graphics.PointF pointF3 = g17.f536500y;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(pointF3, "getInitialCommitPoint(...)");
                        float f19 = g17.f536490o;
                        java.lang.String q17 = g17.q();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(q17, "getEmojiId(...)");
                        float f27 = pointF.x;
                        float f28 = pointF.y;
                        float f29 = pointF3.x;
                        float f37 = pointF3.y;
                        iVar.f427467f = f29 - f27;
                        float f38 = f37 - f28;
                        float[] fArr = iVar.f427470i;
                        fArr[0] = i17;
                        fArr[1] = 0.0f;
                        float[] fArr2 = iVar.f427471j;
                        fArr2[0] = f19;
                        fArr2[1] = f17;
                        iVar.f427466e = q17;
                        if (iVar.f427460a) {
                            iVar.f427461b = true;
                            android.animation.ValueAnimator ofPropertyValuesHolder = android.animation.ValueAnimator.ofPropertyValuesHolder(android.animation.PropertyValuesHolder.ofFloat("deltaY", 0.0f, f38), android.animation.PropertyValuesHolder.ofFloat("deltaX", 0.0f, iVar.f427467f), android.animation.PropertyValuesHolder.ofFloat("scaleY", fArr2[0], fArr2[1]), android.animation.PropertyValuesHolder.ofFloat("scaleX", fArr2[0], fArr2[1]), android.animation.PropertyValuesHolder.ofFloat("rotation", fArr[0], fArr[1]));
                            iVar.f427465d = ofPropertyValuesHolder;
                            if (ofPropertyValuesHolder != null) {
                                ofPropertyValuesHolder.addUpdateListener(new ok.g(iVar));
                            }
                            android.animation.ValueAnimator valueAnimator = iVar.f427465d;
                            if (valueAnimator != null) {
                                valueAnimator.addListener(new ok.h(iVar));
                            }
                            android.animation.ValueAnimator valueAnimator2 = iVar.f427465d;
                            if (valueAnimator2 != null) {
                                valueAnimator2.setInterpolator(new android.view.animation.LinearInterpolator());
                            }
                            android.animation.ValueAnimator valueAnimator3 = iVar.f427465d;
                            if (valueAnimator3 != null) {
                                valueAnimator3.setDuration(100L);
                            }
                            android.animation.ValueAnimator valueAnimator4 = iVar.f427465d;
                            if (valueAnimator4 != null) {
                                valueAnimator4.start();
                            }
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "doOnRestoreLastItem: error. no item");
                    }
                } else {
                    xk0.f fVar = (xk0.f) stack.pop();
                    if (fVar != null) {
                        yk0.a aVar2 = fVar instanceof yk0.a ? (yk0.a) fVar : null;
                        if (aVar2 != null) {
                            if (aVar2.f536500y == null) {
                                android.graphics.PointF pointF4 = aVar2.f536488m;
                                aVar2.x(pointF4.x, pointF4.y);
                            }
                            android.graphics.PointF pointF5 = aVar2.f536500y;
                            float f39 = pointF5.x;
                            if (pointF5 == null) {
                                android.graphics.PointF pointF6 = aVar2.f536488m;
                                aVar2.x(pointF6.x, pointF6.y);
                            }
                            aVar2.v(f39, aVar2.f536500y.y);
                            float z17 = aVar2.z(aVar2.f536490o);
                            aVar2.f536490o = z17;
                            if (z17 < aVar2.f536496u) {
                                aVar2.f536496u = z17;
                            }
                            aVar2.f536489n = 0;
                            aVar2.f536497v = false;
                            aVar2.E = false;
                        }
                        tVar.add(fVar);
                    }
                    ((l45.n) f0Var.f316572a).f397993a.m177310x5143ab24().invalidate();
                }
            }
        }
        ym5.y5.e(y5Var, c01.s2.f118975r, false, 2, null);
        return jz5.f0.f384359a;
    }
}
