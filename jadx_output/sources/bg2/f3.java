package bg2;

/* loaded from: classes2.dex */
public final class f3 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.z3 f20076d;

    public f3(bg2.z3 z3Var) {
        this.f20076d = z3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [kotlinx.coroutines.r2] */
    /* JADX WARN: Type inference failed for: r3v33 */
    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        boolean z17;
        r45.y23 y23Var;
        android.view.View view;
        kotlin.coroutines.Continuation continuation2;
        kotlinx.coroutines.y0 y0Var;
        android.view.View view2;
        u4.j0 j0Var;
        int i17;
        kotlinx.coroutines.y0 y0Var2;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        cm2.t tVar = (cm2.t) obj;
        bg2.z3 z3Var = this.f20076d;
        if (tVar == null || !((z17 = tVar instanceof cm2.m0))) {
            android.view.View view3 = null;
            if (z3Var.f20701v) {
                android.view.ViewGroup viewGroup = z3Var.f20692m;
                if (viewGroup != null) {
                    viewGroup.setVisibility(8);
                }
            } else if (z3Var.f20702w) {
                android.view.ViewGroup viewGroup2 = z3Var.f20687e;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(8);
                }
            } else if (z3Var.f20703x) {
                android.view.ViewGroup viewGroup3 = z3Var.f20690h;
                if (viewGroup3 != null) {
                    view3 = viewGroup3.findViewById(com.tencent.mm.R.id.q4u);
                }
                if (view3 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
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
            if (m0Var != null && (y23Var = m0Var.f43368v) != null) {
                tc2.g gVar = z3Var.f417141d;
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = gVar.f417148h;
                com.tencent.mm.protocal.protobuf.FinderObject finderObject = (baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null) ? null : feedObject.getFinderObject();
                r45.kr0 d17 = finderObject != null ? com.tencent.mm.plugin.finder.storage.FinderItem.Companion.d(finderObject) : null;
                z3Var.f20698s = java.lang.String.valueOf(y23Var.getLong(0));
                if (z3Var.f20701v) {
                    kotlinx.coroutines.y0 y0Var3 = gVar.f417147g;
                    if (y0Var3 != null) {
                        kotlinx.coroutines.l.d(y0Var3, null, null, new bg2.y3(z3Var, d17, y23Var, null), 3, null);
                    }
                } else {
                    boolean z18 = z3Var.f20702w;
                    mn2.g1 g1Var = mn2.g1.f329975a;
                    if (z18) {
                        com.tencent.mars.xlog.Log.i("LiveConvertShoppingPromoteController", "renderExp2Layout");
                        in5.s0 s0Var = gVar.f417149i;
                        android.content.Context context = s0Var != null ? s0Var.f293121e : null;
                        if (context != null && s0Var != null && (view2 = s0Var.itemView) != null) {
                            android.view.ViewGroup viewGroup4 = z3Var.f20688f;
                            com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = viewGroup4 != null ? (com.tencent.mm.ui.widget.MMNeat7extView) viewGroup4.findViewById(com.tencent.mm.R.id.djp) : null;
                            if (mMNeat7extView != null) {
                                mMNeat7extView.setMaxLines(1);
                            }
                            android.view.ViewGroup viewGroup5 = z3Var.f20689g;
                            android.view.ViewGroup viewGroup6 = viewGroup5 != null ? (android.view.ViewGroup) viewGroup5.findViewById(com.tencent.mm.R.id.mad) : null;
                            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.aqt, viewGroup6, false);
                            kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
                            android.view.ViewGroup viewGroup7 = (android.view.ViewGroup) inflate;
                            if (viewGroup6 != null) {
                                viewGroup6.removeAllViews();
                            }
                            u4.j0 j0Var2 = viewGroup6 != null ? new u4.j0(viewGroup6, viewGroup7) : null;
                            android.view.View inflate2 = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.aqu, viewGroup6, false);
                            kotlin.jvm.internal.o.e(inflate2, "null cannot be cast to non-null type android.view.ViewGroup");
                            android.view.ViewGroup viewGroup8 = (android.view.ViewGroup) inflate2;
                            u4.j0 j0Var3 = viewGroup6 != null ? new u4.j0(viewGroup6, viewGroup8) : null;
                            android.widget.TextView textView = (android.widget.TextView) viewGroup8.findViewById(com.tencent.mm.R.id.l6g);
                            kotlin.jvm.internal.o.d(textView);
                            com.tencent.mm.ui.fk.a(textView);
                            if (!(viewGroup6 != null && viewGroup6.getVisibility() == 0) && viewGroup6 != null) {
                                viewGroup6.setVisibility(0);
                            }
                            ym5.a1.h(viewGroup7, new bg2.l3(z3Var, d17));
                            ym5.a1.h(viewGroup8, new bg2.m3(z3Var));
                            com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget finderLiveOnliveWidget = (com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget) viewGroup7.findViewById(com.tencent.mm.R.id.lcc);
                            z3Var.f20691i = finderLiveOnliveWidget;
                            if (finderLiveOnliveWidget != null) {
                                finderLiveOnliveWidget.c();
                            }
                            android.widget.ImageView imageView = (android.widget.ImageView) viewGroup7.findViewById(com.tencent.mm.R.id.l78);
                            if (imageView != null) {
                                vo0.d e17 = g1Var.e();
                                vd2.i5 i5Var = (vd2.i5) i95.n0.c(vd2.i5.class);
                                java.util.LinkedList list = y23Var.getList(2);
                                kotlin.jvm.internal.o.f(list, "getImg_urls(...)");
                                java.lang.String str = (java.lang.String) kz5.n0.Z(list);
                                if (str == null) {
                                    str = "";
                                }
                                j0Var = j0Var3;
                                e17.c(((c61.i8) i5Var).Ai(str, com.tencent.mm.plugin.finder.storage.y90.f128356f), imageView, g1Var.h(mn2.f1.f329965s));
                                i17 = com.tencent.mm.R.id.l78;
                            } else {
                                j0Var = j0Var3;
                                i17 = com.tencent.mm.R.id.l78;
                            }
                            android.widget.ImageView imageView2 = (android.widget.ImageView) viewGroup8.findViewById(i17);
                            if (imageView2 != null) {
                                vo0.d e18 = g1Var.e();
                                vd2.i5 i5Var2 = (vd2.i5) i95.n0.c(vd2.i5.class);
                                java.util.LinkedList list2 = y23Var.getList(2);
                                kotlin.jvm.internal.o.f(list2, "getImg_urls(...)");
                                java.lang.String str2 = (java.lang.String) kz5.n0.Z(list2);
                                if (str2 == null) {
                                    str2 = "";
                                }
                                e18.c(((c61.i8) i5Var2).Ai(str2, com.tencent.mm.plugin.finder.storage.y90.f128356f), imageView2, g1Var.h(mn2.f1.f329965s));
                            }
                            android.widget.TextView textView2 = (android.widget.TextView) viewGroup8.findViewById(com.tencent.mm.R.id.l7s);
                            if (textView2 != null) {
                                textView2.setText(y23Var.getString(1));
                            }
                            android.widget.TextView textView3 = (android.widget.TextView) viewGroup8.findViewById(com.tencent.mm.R.id.l7i);
                            if (textView3 != null) {
                                hc2.o.a(textView3, false);
                            }
                            if (textView3 != null) {
                                textView3.setText(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.eef, ((c61.i8) ((vd2.i5) i95.n0.c(vd2.i5.class))).Ui(y23Var.getInteger(4))));
                            }
                            viewGroup7.setOnClickListener(new bg2.n3(y23Var, z3Var, view2));
                            viewGroup8.setOnClickListener(new bg2.o3(y23Var, z3Var, view2));
                            textView.setOnClickListener(new bg2.p3(y23Var, z3Var, view2));
                            kotlinx.coroutines.r2 r2Var = z3Var.f20700u;
                            if (r2Var != null) {
                                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                            }
                            in5.s0 s0Var2 = gVar.f417149i;
                            z3Var.f20700u = (s0Var2 == null || (y0Var2 = s0Var2.f293120d) == null) ? null : kotlinx.coroutines.l.d(y0Var2, null, null, new bg2.q3(d17, viewGroup7, j0Var2, viewGroup8, z3Var, j0Var, null), 3, null);
                        }
                    } else if (z3Var.f20703x) {
                        com.tencent.mars.xlog.Log.i("LiveConvertShoppingPromoteController", "renderExp5Layout");
                        if (z3Var.f20705z) {
                            com.tencent.mars.xlog.Log.i("LiveConvertShoppingPromoteController", "productDismissed return");
                        } else {
                            in5.s0 s0Var3 = gVar.f417149i;
                            android.content.Context context2 = s0Var3 != null ? s0Var3.f293121e : null;
                            if (context2 != null && s0Var3 != null && (view = s0Var3.itemView) != null) {
                                android.view.ViewGroup viewGroup9 = (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.q4u);
                                android.widget.ImageView imageView3 = viewGroup9 != null ? (android.widget.ImageView) viewGroup9.findViewById(com.tencent.mm.R.id.l78) : null;
                                if (imageView3 != null) {
                                    vo0.d e19 = g1Var.e();
                                    vd2.i5 i5Var3 = (vd2.i5) i95.n0.c(vd2.i5.class);
                                    java.util.LinkedList list3 = y23Var.getList(2);
                                    kotlin.jvm.internal.o.f(list3, "getImg_urls(...)");
                                    java.lang.String str3 = (java.lang.String) kz5.n0.Z(list3);
                                    if (str3 == null) {
                                        str3 = "";
                                    }
                                    e19.c(((c61.i8) i5Var3).Ai(str3, com.tencent.mm.plugin.finder.storage.y90.f128356f), imageView3, g1Var.h(mn2.f1.f329965s));
                                }
                                android.widget.TextView textView4 = (android.widget.TextView) viewGroup9.findViewById(com.tencent.mm.R.id.l7s);
                                if (textView4 != null) {
                                    textView4.setText(y23Var.getString(1));
                                }
                                android.widget.TextView textView5 = (android.widget.TextView) viewGroup9.findViewById(com.tencent.mm.R.id.l7i);
                                if (textView5 != null) {
                                    hc2.o.a(textView5, false);
                                }
                                android.widget.TextView textView6 = (android.widget.TextView) viewGroup9.findViewById(com.tencent.mm.R.id.q_9);
                                if (textView6 != null) {
                                    textView6.setVisibility(0);
                                }
                                if (textView6 != null) {
                                    textView6.setText(context2.getString(com.tencent.mm.R.string.een));
                                }
                                if (textView5 != null) {
                                    textView5.setText(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.eef, ((c61.i8) ((vd2.i5) i95.n0.c(vd2.i5.class))).Ui(y23Var.getInteger(4))));
                                }
                                ym5.a1.h(viewGroup9, new bg2.r3(z3Var, d17));
                                viewGroup9.setOnClickListener(new bg2.s3(y23Var, z3Var, view));
                                kotlinx.coroutines.r2 r2Var2 = z3Var.f20700u;
                                if (r2Var2 != null) {
                                    continuation2 = null;
                                    kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
                                } else {
                                    continuation2 = null;
                                }
                                in5.s0 s0Var4 = gVar.f417149i;
                                z3Var.f20700u = (s0Var4 == null || (y0Var = s0Var4.f293120d) == null) ? continuation2 : kotlinx.coroutines.l.d(y0Var, null, null, new bg2.u3(z3Var, d17, viewGroup9, continuation2), 3, null);
                            }
                        }
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
