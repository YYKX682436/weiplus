package uj3;

/* loaded from: classes14.dex */
public final class n implements com.p314xaae8f345.p3210x3857dc.o1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uj3.p f509864a;

    public n(uj3.p pVar) {
        this.f509864a = pVar;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o1
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenFileProjector", "xfile on user cancel finish");
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().h();
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o1
    public void b(java.lang.String str, java.util.HashMap hashMap) {
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o1
    public void c() {
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o1
    public void d(int i17, android.graphics.Bitmap thumbnail) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbnail, "thumbnail");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenFileProjector", "xfile onThumbnailLoad " + i17);
        uj3.b1 m168131x7a59531e = this.f509864a.m168131x7a59531e();
        if (m168131x7a59531e != null) {
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = m168131x7a59531e.f509758c;
            if (copyOnWriteArrayList.size() <= i17) {
                copyOnWriteArrayList.add(thumbnail);
            } else {
                copyOnWriteArrayList.set(i17, thumbnail);
            }
            xj3.b bVar = m168131x7a59531e.f509762g;
            if (bVar != null) {
                bVar.f536397g = thumbnail.getWidth();
                bVar.f536398h = thumbnail.getHeight();
            }
            xj3.e eVar = m168131x7a59531e.f509761f;
            if (eVar != null) {
                xj3.b bVar2 = m168131x7a59531e.f509762g;
                int i18 = bVar2 != null ? (int) bVar2.f536400m : 0;
                android.widget.FrameLayout frameLayout = m168131x7a59531e.f509764i;
                if (frameLayout != null) {
                    frameLayout.getMeasuredWidth();
                }
                eVar.f536407d = i18;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.p1891xcaa9f6bc.p1893xe821e364.C16593x8cfa3099 c16593x8cfa3099 = m168131x7a59531e.f509760e;
            if (c16593x8cfa3099 != null) {
                xj3.b bVar3 = m168131x7a59531e.f509762g;
                int i19 = bVar3 != null ? (int) bVar3.f536400m : 0;
                android.widget.FrameLayout frameLayout2 = m168131x7a59531e.f509764i;
                c16593x8cfa3099.f231927w = frameLayout2 != null ? frameLayout2.getMeasuredWidth() : 0;
                c16593x8cfa3099.f231926v = i19;
            }
            if (i17 == (m168131x7a59531e.f509773r + 1) * 10 || i17 == m168131x7a59531e.f509769n - 1) {
                m168131x7a59531e.f509771p = false;
                xj3.b bVar4 = m168131x7a59531e.f509762g;
                if (bVar4 != null) {
                    java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = new java.util.concurrent.CopyOnWriteArrayList();
                    java.util.Iterator it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) it.next();
                        if (bitmap != null) {
                            copyOnWriteArrayList2.add(bitmap);
                        }
                    }
                    bVar4.f536396f = copyOnWriteArrayList2;
                    bVar4.m8146xced61ae5();
                }
                if (m168131x7a59531e.f509773r == m168131x7a59531e.f509774s - 1) {
                    m168131x7a59531e.f509772q = true;
                    return;
                }
                xj3.b bVar5 = m168131x7a59531e.f509762g;
                if (bVar5 != null) {
                    android.graphics.Bitmap m17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.m((int) bVar5.f536400m, (int) bVar5.f536401n, android.graphics.Bitmap.Config.ARGB_8888, false);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m17, "createBitmap(...)");
                    bVar5.f536396f.add(m17);
                    bVar5.m8149x8b456734(bVar5.f536396f.size() - 1);
                }
            }
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o1
    public void e(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenFileProjector", "xfile onPageCountUpdate " + i17);
        uj3.p pVar = this.f509864a;
        pVar.m168127x97855356(i17);
        uj3.k1 m168149x29665661 = pVar.m168149x29665661();
        if (m168149x29665661 != null) {
            m168149x29665661.f509838a = pVar.K;
        }
        uj3.b1 m168131x7a59531e = pVar.m168131x7a59531e();
        if (m168131x7a59531e != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(pVar.Q + 1);
            sb6.append('/');
            sb6.append(i17);
            java.lang.String str = sb6.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "str");
            android.widget.FrameLayout frameLayout = m168131x7a59531e.f509766k;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
            m168131x7a59531e.f509770o = str;
            uj3.y0 y0Var = m168131x7a59531e.f509765j;
            if (y0Var != null) {
                y0Var.e(str);
            }
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o1
    public void f(int i17, int i18, int i19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenFileProjector", "xfile onPageChange " + i17 + " and pageWidth " + i18 + " and pageHeight " + i19);
        uj3.p pVar = this.f509864a;
        int i27 = pVar.Q;
        if (i17 > i27 && i27 != -1) {
            pVar.j();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenProjectReportHelper", "markScrollFlipPage");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1538L, 12L, 1L);
            uj3.b.a(pVar, uj3.a.f509735p, null, 2, null);
        } else if (i17 < i27 && i27 != -1) {
            pVar.j();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenProjectReportHelper", "markScrollFlipPage");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1538L, 12L, 1L);
            uj3.b.a(pVar, uj3.a.f509736q, null, 2, null);
        }
        if (!pVar.L) {
            pVar.L = true;
            uj3.b1 m168131x7a59531e = pVar.m168131x7a59531e();
            if (m168131x7a59531e != null) {
                m168131x7a59531e.b();
            }
        }
        pVar.m168125x3e203aa4(i17);
        pVar.m168168x3ea81b1c(1.0f);
        pVar.m168167xccfcf549(i18);
        pVar.m168166xb8d2ba04(i19);
        uj3.b1 m168131x7a59531e2 = pVar.m168131x7a59531e();
        if (m168131x7a59531e2 != null) {
            int m168145xf166e8d5 = pVar.m168145xf166e8d5();
            int m168144x21a737f8 = pVar.m168144x21a737f8();
            xj3.b bVar = m168131x7a59531e2.f509762g;
            if (bVar != null) {
                bVar.f536399i = i17;
                float f17 = m168145xf166e8d5;
                float f18 = m168144x21a737f8;
                float f19 = f17 / f18;
                float f27 = xj3.b.f536390q;
                float f28 = f18 / (f17 / f27);
                float f29 = xj3.b.f536391r;
                if (f28 > f29) {
                    float f37 = f17 / (f18 / f29);
                    float f38 = xj3.b.f536392s;
                    if (f37 > f27) {
                        float f39 = f38 / f19;
                        if (f39 <= f29) {
                            f29 = f39;
                        }
                        bVar.f536401n = f29;
                        bVar.f536400m = f38;
                    } else if (f37 < f38) {
                        bVar.f536401n = f28;
                        bVar.f536400m = f38;
                    } else {
                        bVar.f536401n = f29;
                        bVar.f536400m = f37;
                    }
                } else {
                    bVar.f536401n = f28;
                    bVar.f536400m = f27;
                }
                if (bVar.f536397g != -1 && bVar.f536398h != -1) {
                    bVar.m8147xed6e4d18(i17);
                }
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = m168131x7a59531e2.f509763h;
            if (c1163xf1deaba4 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(i17));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(c1163xf1deaba4, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectThumbUI", "applyCurrentThumbnail", "(III)V", "Undefined", "smoothScrollToPosition", "(I)V");
                c1163xf1deaba4.c1(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectThumbUI", "applyCurrentThumbnail", "(III)V", "Undefined", "smoothScrollToPosition", "(I)V");
            }
        }
        pVar.m168133x10b1e865(com.p314xaae8f345.p3210x3857dc.r1.b(pVar.M, pVar.N));
        if (i18 <= 0 || i19 <= 0 || pVar.m168129x79866659() == null) {
            return;
        }
        uj3.c m168151xd74835c8 = pVar.m168151xd74835c8();
        if (m168151xd74835c8 != null) {
            m168151xd74835c8.f509777c = pVar.m168144x21a737f8();
        }
        uj3.c m168151xd74835c82 = pVar.m168151xd74835c8();
        if (m168151xd74835c82 != null) {
            m168151xd74835c82.f509776b = pVar.m168145xf166e8d5();
        }
        uj3.c m168151xd74835c83 = pVar.m168151xd74835c8();
        if (m168151xd74835c83 != null) {
            com.p314xaae8f345.p3210x3857dc.p1 m168129x79866659 = pVar.m168129x79866659();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m168129x79866659);
            int i28 = m168129x79866659.f301904a;
            com.p314xaae8f345.p3210x3857dc.p1 m168129x798666592 = pVar.m168129x79866659();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m168129x798666592);
            m168151xd74835c83.c(1.0f, i28, m168129x798666592.f301905b, false, false);
        }
        ct0.b bVar2 = new ct0.b(null, null, false, 0, 0, null, null, 0, 0, null, null, null, false, null, null, 0, 65535, null);
        com.p314xaae8f345.p3210x3857dc.p1 m168129x798666593 = pVar.m168129x79866659();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m168129x798666593);
        com.p314xaae8f345.p3210x3857dc.p1 m168129x798666594 = pVar.m168129x79866659();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m168129x798666594);
        int m168145xf166e8d52 = pVar.m168145xf166e8d5();
        com.p314xaae8f345.p3210x3857dc.p1 m168129x798666595 = pVar.m168129x79866659();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m168129x798666595);
        int i29 = m168145xf166e8d52 + m168129x798666595.f301904a;
        int m168144x21a737f82 = pVar.m168144x21a737f8();
        com.p314xaae8f345.p3210x3857dc.p1 m168129x798666596 = pVar.m168129x79866659();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m168129x798666596);
        bVar2.f303751o = new android.graphics.Rect(m168129x798666593.f301904a, m168129x798666594.f301905b, i29, m168144x21a737f82 + m168129x798666596.f301905b);
        uj3.c m168151xd74835c84 = pVar.m168151xd74835c8();
        if (m168151xd74835c84 != null) {
            m168151xd74835c84.b(bVar2, new uj3.m(pVar));
        }
        pVar.s(true);
        uj3.b1 m168131x7a59531e3 = pVar.m168131x7a59531e();
        if (m168131x7a59531e3 != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(pVar.Q + 1);
            sb6.append('/');
            sb6.append(pVar.K);
            java.lang.String str = sb6.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "str");
            android.widget.FrameLayout frameLayout = m168131x7a59531e3.f509766k;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
            m168131x7a59531e3.f509770o = str;
            uj3.y0 y0Var = m168131x7a59531e3.f509765j;
            if (y0Var != null) {
                y0Var.e(str);
            }
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o1
    public void g(int i17, float f17, int i18, int i19, int i27, int i28) {
        qj3.h hVar;
        qj3.g gVar;
        ym5.w2 w2Var;
        bn5.g gVar2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenFileProjector", "xfile onViewStatusChange " + i17 + " and pageWidth " + i18 + " and pageHeight " + i19 + " and scale " + f17 + " and transX " + i27 + " and " + i28);
        uj3.c m168151xd74835c8 = this.f509864a.m168151xd74835c8();
        if (m168151xd74835c8 == null || (hVar = m168151xd74835c8.f509783i) == null || (gVar = hVar.f445428o) == null || (w2Var = gVar.f445415m) == null || (gVar2 = (bn5.g) w2Var.m177310x5143ab24()) == null) {
            return;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        float f18 = f17 * gVar2.I;
        matrix.postScale(f18, f18, 0.0f, 0.0f);
        matrix.postTranslate(i27, i28);
        gVar2.f104476g = matrix;
        gVar2.invalidate();
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o1
    public void h(android.view.MotionEvent e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        uj3.b.a(this.f509864a, uj3.a.f509734o, null, 2, null);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o1
    public void i() {
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o1
    /* renamed from: onDoubleTap */
    public void mo56908xce1d2af3(android.view.MotionEvent e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
    }
}
