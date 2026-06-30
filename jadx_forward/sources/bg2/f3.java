package bg2;

/* loaded from: classes2.dex */
public final class f3 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.z3 f101609d;

    public f3(bg2.z3 z3Var) {
        this.f101609d = z3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [kotlinx.coroutines.r2] */
    /* JADX WARN: Type inference failed for: r3v33 */
    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        boolean z17;
        r45.y23 y23Var;
        android.view.View view;
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca572;
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        android.view.View view2;
        u4.j0 j0Var;
        int i17;
        p3325xe03a0797.p3326xc267989b.y0 y0Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        cm2.t tVar = (cm2.t) obj;
        bg2.z3 z3Var = this.f101609d;
        if (tVar == null || !((z17 = tVar instanceof cm2.m0))) {
            android.view.View view3 = null;
            if (z3Var.f102234v) {
                android.view.ViewGroup viewGroup = z3Var.f102225m;
                if (viewGroup != null) {
                    viewGroup.setVisibility(8);
                }
            } else if (z3Var.f102235w) {
                android.view.ViewGroup viewGroup2 = z3Var.f102220e;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(8);
                }
            } else if (z3Var.f102236x) {
                android.view.ViewGroup viewGroup3 = z3Var.f102223h;
                if (viewGroup3 != null) {
                    view3 = viewGroup3.findViewById(com.p314xaae8f345.mm.R.id.q4u);
                }
                if (view3 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    android.view.View view4 = view3;
                    yj0.a.d(view4, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertShoppingPromoteController", "hideShoppingBubbleArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertShoppingPromoteController", "hideShoppingBubbleArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        } else {
            z3Var.getClass();
            cm2.m0 m0Var = z17 ? (cm2.m0) tVar : null;
            if (m0Var != null && (y23Var = m0Var.f124901v) != null) {
                tc2.g gVar = z3Var.f498674d;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = gVar.f498681h;
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 m59240x7c94657b = (abstractC14490x69736cb5 == null || (feedObject = abstractC14490x69736cb5.getFeedObject()) == null) ? null : feedObject.m59240x7c94657b();
                r45.kr0 d17 = m59240x7c94657b != null ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.d(m59240x7c94657b) : null;
                z3Var.f102231s = java.lang.String.valueOf(y23Var.m75942xfb822ef2(0));
                if (z3Var.f102234v) {
                    p3325xe03a0797.p3326xc267989b.y0 y0Var3 = gVar.f498680g;
                    if (y0Var3 != null) {
                        p3325xe03a0797.p3326xc267989b.l.d(y0Var3, null, null, new bg2.y3(z3Var, d17, y23Var, null), 3, null);
                    }
                } else {
                    boolean z18 = z3Var.f102235w;
                    mn2.g1 g1Var = mn2.g1.f411508a;
                    if (z18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveConvertShoppingPromoteController", "renderExp2Layout");
                        in5.s0 s0Var = gVar.f498682i;
                        android.content.Context context = s0Var != null ? s0Var.f374654e : null;
                        if (context != null && s0Var != null && (view2 = s0Var.f3639x46306858) != null) {
                            android.view.ViewGroup viewGroup4 = z3Var.f102221f;
                            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = viewGroup4 != null ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) viewGroup4.findViewById(com.p314xaae8f345.mm.R.id.djp) : null;
                            if (c22624x85d69039 != null) {
                                c22624x85d69039.m84175x8dd5167d(1);
                            }
                            android.view.ViewGroup viewGroup5 = z3Var.f102222g;
                            android.view.ViewGroup viewGroup6 = viewGroup5 != null ? (android.view.ViewGroup) viewGroup5.findViewById(com.p314xaae8f345.mm.R.id.mad) : null;
                            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.aqt, viewGroup6, false);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
                            android.view.ViewGroup viewGroup7 = (android.view.ViewGroup) inflate;
                            if (viewGroup6 != null) {
                                viewGroup6.removeAllViews();
                            }
                            u4.j0 j0Var2 = viewGroup6 != null ? new u4.j0(viewGroup6, viewGroup7) : null;
                            android.view.View inflate2 = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.aqu, viewGroup6, false);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate2, "null cannot be cast to non-null type android.view.ViewGroup");
                            android.view.ViewGroup viewGroup8 = (android.view.ViewGroup) inflate2;
                            u4.j0 j0Var3 = viewGroup6 != null ? new u4.j0(viewGroup6, viewGroup8) : null;
                            android.widget.TextView textView = (android.widget.TextView) viewGroup8.findViewById(com.p314xaae8f345.mm.R.id.l6g);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
                            com.p314xaae8f345.mm.ui.fk.a(textView);
                            if (!(viewGroup6 != null && viewGroup6.getVisibility() == 0) && viewGroup6 != null) {
                                viewGroup6.setVisibility(0);
                            }
                            ym5.a1.h(viewGroup7, new bg2.l3(z3Var, d17));
                            ym5.a1.h(viewGroup8, new bg2.m3(z3Var));
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1 c15315xe70278e1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1) viewGroup7.findViewById(com.p314xaae8f345.mm.R.id.lcc);
                            z3Var.f102224i = c15315xe70278e1;
                            if (c15315xe70278e1 != null) {
                                c15315xe70278e1.c();
                            }
                            android.widget.ImageView imageView = (android.widget.ImageView) viewGroup7.findViewById(com.p314xaae8f345.mm.R.id.l78);
                            if (imageView != null) {
                                vo0.d e17 = g1Var.e();
                                vd2.i5 i5Var = (vd2.i5) i95.n0.c(vd2.i5.class);
                                java.util.LinkedList m75941xfb821914 = y23Var.m75941xfb821914(2);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getImg_urls(...)");
                                java.lang.String str = (java.lang.String) kz5.n0.Z(m75941xfb821914);
                                if (str == null) {
                                    str = "";
                                }
                                j0Var = j0Var3;
                                e17.c(((c61.i8) i5Var).Ai(str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f), imageView, g1Var.h(mn2.f1.f411498s));
                                i17 = com.p314xaae8f345.mm.R.id.l78;
                            } else {
                                j0Var = j0Var3;
                                i17 = com.p314xaae8f345.mm.R.id.l78;
                            }
                            android.widget.ImageView imageView2 = (android.widget.ImageView) viewGroup8.findViewById(i17);
                            if (imageView2 != null) {
                                vo0.d e18 = g1Var.e();
                                vd2.i5 i5Var2 = (vd2.i5) i95.n0.c(vd2.i5.class);
                                java.util.LinkedList m75941xfb8219142 = y23Var.m75941xfb821914(2);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getImg_urls(...)");
                                java.lang.String str2 = (java.lang.String) kz5.n0.Z(m75941xfb8219142);
                                if (str2 == null) {
                                    str2 = "";
                                }
                                e18.c(((c61.i8) i5Var2).Ai(str2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f), imageView2, g1Var.h(mn2.f1.f411498s));
                            }
                            android.widget.TextView textView2 = (android.widget.TextView) viewGroup8.findViewById(com.p314xaae8f345.mm.R.id.l7s);
                            if (textView2 != null) {
                                textView2.setText(y23Var.m75945x2fec8307(1));
                            }
                            android.widget.TextView textView3 = (android.widget.TextView) viewGroup8.findViewById(com.p314xaae8f345.mm.R.id.l7i);
                            if (textView3 != null) {
                                hc2.o.a(textView3, false);
                            }
                            if (textView3 != null) {
                                textView3.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eef, ((c61.i8) ((vd2.i5) i95.n0.c(vd2.i5.class))).Ui(y23Var.m75939xb282bd08(4))));
                            }
                            viewGroup7.setOnClickListener(new bg2.n3(y23Var, z3Var, view2));
                            viewGroup8.setOnClickListener(new bg2.o3(y23Var, z3Var, view2));
                            textView.setOnClickListener(new bg2.p3(y23Var, z3Var, view2));
                            p3325xe03a0797.p3326xc267989b.r2 r2Var = z3Var.f102233u;
                            if (r2Var != null) {
                                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
                            }
                            in5.s0 s0Var2 = gVar.f498682i;
                            z3Var.f102233u = (s0Var2 == null || (y0Var2 = s0Var2.f374653d) == null) ? null : p3325xe03a0797.p3326xc267989b.l.d(y0Var2, null, null, new bg2.q3(d17, viewGroup7, j0Var2, viewGroup8, z3Var, j0Var, null), 3, null);
                        }
                    } else if (z3Var.f102236x) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveConvertShoppingPromoteController", "renderExp5Layout");
                        if (z3Var.f102238z) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveConvertShoppingPromoteController", "productDismissed return");
                        } else {
                            in5.s0 s0Var3 = gVar.f498682i;
                            android.content.Context context2 = s0Var3 != null ? s0Var3.f374654e : null;
                            if (context2 != null && s0Var3 != null && (view = s0Var3.f3639x46306858) != null) {
                                android.view.ViewGroup viewGroup9 = (android.view.ViewGroup) view.findViewById(com.p314xaae8f345.mm.R.id.q4u);
                                android.widget.ImageView imageView3 = viewGroup9 != null ? (android.widget.ImageView) viewGroup9.findViewById(com.p314xaae8f345.mm.R.id.l78) : null;
                                if (imageView3 != null) {
                                    vo0.d e19 = g1Var.e();
                                    vd2.i5 i5Var3 = (vd2.i5) i95.n0.c(vd2.i5.class);
                                    java.util.LinkedList m75941xfb8219143 = y23Var.m75941xfb821914(2);
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219143, "getImg_urls(...)");
                                    java.lang.String str3 = (java.lang.String) kz5.n0.Z(m75941xfb8219143);
                                    if (str3 == null) {
                                        str3 = "";
                                    }
                                    e19.c(((c61.i8) i5Var3).Ai(str3, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f), imageView3, g1Var.h(mn2.f1.f411498s));
                                }
                                android.widget.TextView textView4 = (android.widget.TextView) viewGroup9.findViewById(com.p314xaae8f345.mm.R.id.l7s);
                                if (textView4 != null) {
                                    textView4.setText(y23Var.m75945x2fec8307(1));
                                }
                                android.widget.TextView textView5 = (android.widget.TextView) viewGroup9.findViewById(com.p314xaae8f345.mm.R.id.l7i);
                                if (textView5 != null) {
                                    hc2.o.a(textView5, false);
                                }
                                android.widget.TextView textView6 = (android.widget.TextView) viewGroup9.findViewById(com.p314xaae8f345.mm.R.id.q_9);
                                if (textView6 != null) {
                                    textView6.setVisibility(0);
                                }
                                if (textView6 != null) {
                                    textView6.setText(context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.een));
                                }
                                if (textView5 != null) {
                                    textView5.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eef, ((c61.i8) ((vd2.i5) i95.n0.c(vd2.i5.class))).Ui(y23Var.m75939xb282bd08(4))));
                                }
                                ym5.a1.h(viewGroup9, new bg2.r3(z3Var, d17));
                                viewGroup9.setOnClickListener(new bg2.s3(y23Var, z3Var, view));
                                p3325xe03a0797.p3326xc267989b.r2 r2Var2 = z3Var.f102233u;
                                if (r2Var2 != null) {
                                    interfaceC29045xdcb5ca572 = null;
                                    p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
                                } else {
                                    interfaceC29045xdcb5ca572 = null;
                                }
                                in5.s0 s0Var4 = gVar.f498682i;
                                z3Var.f102233u = (s0Var4 == null || (y0Var = s0Var4.f374653d) == null) ? interfaceC29045xdcb5ca572 : p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new bg2.u3(z3Var, d17, viewGroup9, interfaceC29045xdcb5ca572), 3, null);
                            }
                        }
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
