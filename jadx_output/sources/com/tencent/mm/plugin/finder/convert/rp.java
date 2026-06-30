package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public abstract class rp extends com.tencent.mm.plugin.finder.convert.yw {

    /* renamed from: f, reason: collision with root package name */
    public final int f104497f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.convert.kp f104498g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rp(int i17, com.tencent.mm.plugin.finder.convert.kp data) {
        super(i17, data);
        kotlin.jvm.internal.o.g(data, "data");
        this.f104497f = i17;
        this.f104498g = data;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043 A[Catch: Exception -> 0x0075, TryCatch #0 {Exception -> 0x0075, blocks: (B:5:0x002c, B:7:0x0032, B:11:0x003c, B:15:0x0043, B:16:0x0051, B:19:0x005c, B:44:0x0049), top: B:4:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0049 A[Catch: Exception -> 0x0075, TryCatch #0 {Exception -> 0x0075, blocks: (B:5:0x002c, B:7:0x0032, B:11:0x003c, B:15:0x0043, B:16:0x0051, B:19:0x005c, B:44:0x0049), top: B:4:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void p(com.tencent.mm.plugin.finder.convert.rp r34, android.view.View r35, in5.s0 r36, dm.pd r37) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.rp.p(com.tencent.mm.plugin.finder.convert.rp, android.view.View, in5.s0, dm.pd):void");
    }

    public static final void q(com.tencent.mm.plugin.finder.convert.rp rpVar, android.content.Context context, long j17, dm.pd pdVar) {
        rpVar.getClass();
        if (context == null) {
            com.tencent.mars.xlog.Log.e("FinderMsgConvert", "reportExpandSilentMsg: context is null");
            return;
        }
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c17;
        int integer = V6.getInteger(5);
        com.tencent.mm.plugin.finder.report.o3.Mj(o3Var, context, integer != 7 ? integer != 117 ? 0L : 15L : 14L, j17, false, 0, 10, com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.l(com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.f122820a, context, rpVar.f104498g.f103851a, false, null, pdVar, false, false, false, false, uc1.o.CTRL_INDEX, null), 8, null);
    }

    public final void A(dm.pd finderMention, android.widget.ImageView thumbView, android.widget.TextView contextView) {
        kotlin.jvm.internal.o.g(finderMention, "finderMention");
        kotlin.jvm.internal.o.g(thumbView, "thumbView");
        kotlin.jvm.internal.o.g(contextView, "contextView");
        contextView.setVisibility(8);
        java.lang.String l17 = finderMention.l();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(l17)) {
            mn2.g1 g1Var = mn2.g1.f329975a;
            g1Var.e().c(new mn2.q3(l17, com.tencent.mm.plugin.finder.storage.y90.f128356f), thumbView, g1Var.h(mn2.f1.f329963q));
            thumbView.setVisibility(0);
            return;
        }
        thumbView.setVisibility(8);
        if (finderMention.field_mediaType == 1) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = contextView.getContext();
            java.lang.String str = finderMention.field_description;
            ((ke0.e) xVar).getClass();
            contextView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, str));
            contextView.setVisibility(0);
        }
    }

    public final void B(in5.s0 holder, so2.i item, java.lang.String timeText) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(timeText, "timeText");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.o7z);
        if (textView != null) {
            textView.setText(timeText);
            textView.setVisibility(0);
        }
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.f487301o80);
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.qdq);
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        t(holder, item);
    }

    @Override // in5.r
    public int e() {
        return this.f104497f;
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // in5.r
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void h(in5.s0 holder, so2.i item, int i17, int i18, boolean z17, java.util.List list) {
        final android.content.Context context;
        java.lang.String str;
        dm.pd pdVar;
        com.tencent.mm.plugin.finder.convert.kp kpVar;
        android.view.ViewGroup viewGroup;
        dm.pd pdVar2;
        int i19;
        int i27;
        android.content.Context context2;
        int i28;
        android.widget.ImageView imageView;
        int i29;
        android.widget.ImageView imageView2;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        boolean z18 = list == null || list.isEmpty();
        dm.pd pdVar3 = item.f410411d;
        if (!z18) {
            for (java.lang.Object obj : list) {
                if (kotlin.jvm.internal.o.b(obj, 1)) {
                    y(holder, pdVar3, 3);
                } else if (kotlin.jvm.internal.o.b(obj, 2)) {
                    if (!v(holder, item)) {
                        u(holder, pdVar3, true);
                    }
                } else if (kotlin.jvm.internal.o.b(obj, 3)) {
                    if (!v(holder, item)) {
                        u(holder, pdVar3, false);
                    }
                } else if (kotlin.jvm.internal.o.b(obj, 4)) {
                    x(holder, pdVar3);
                }
            }
            return;
        }
        boolean u07 = pdVar3.u0();
        ya2.m1 m1Var = ya2.m1.f460511a;
        if (!u07 && (imageView2 = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.e_c)) != null) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = pdVar3.field_contact;
            zy2.tb.a(m1Var, imageView2, finderContact != null ? finderContact.getAuthInfo() : null, 0, 4, null);
        }
        r(holder, item, i17, list);
        com.tencent.mars.xlog.Log.i("FinderMsgConvert", "onBindViewHolder: " + getClass().getCanonicalName());
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.ag6);
        if (textView != null) {
            textView.setVisibility(item.f410412e ? 0 : 8);
        }
        android.view.View p17 = holder.p(com.tencent.mm.R.id.rpy);
        if (p17 != null) {
            ym5.a1.h(p17, new com.tencent.mm.plugin.finder.convert.lp(this, holder, item));
            if (item.f410413f) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderMsg;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderMsgConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderMsg;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setOnClickListener(new com.tencent.mm.plugin.finder.convert.mp(this, holder, item));
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderMsg;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderMsgConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderMsg;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        boolean z19 = item.f410414g;
        android.content.Context context3 = holder.f293121e;
        if (z19) {
            item.f410414g = false;
            com.tencent.mm.plugin.finder.view.notice.HighLightGreenBgView highLightGreenBgView = (com.tencent.mm.plugin.finder.view.notice.HighLightGreenBgView) holder.p(com.tencent.mm.R.id.p1j);
            if (highLightGreenBgView != null) {
                highLightGreenBgView.a();
                highLightGreenBgView.f132727d = kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new tx2.e(highLightGreenBgView, null), 3, null);
            } else {
                android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) holder.p(com.tencent.mm.R.id.rya);
                if (viewGroup2 != null) {
                    kotlin.jvm.internal.o.f(context3, "getContext(...)");
                    com.tencent.mm.plugin.finder.view.notice.HighLightGreenBgView highLightGreenBgView2 = new com.tencent.mm.plugin.finder.view.notice.HighLightGreenBgView(context3, null);
                    highLightGreenBgView2.setId(com.tencent.mm.R.id.p1j);
                    androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(0, 0);
                    layoutParams.f10885d = 0;
                    layoutParams.f10891g = 0;
                    layoutParams.f10893h = 0;
                    layoutParams.f10899k = 0;
                    highLightGreenBgView2.setLayoutParams(layoutParams);
                    viewGroup2.addView(highLightGreenBgView2);
                    highLightGreenBgView2.a();
                    highLightGreenBgView2.f132727d = kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new tx2.e(highLightGreenBgView2, null), 3, null);
                }
            }
        }
        if (pdVar3.u0()) {
            int dimensionPixelSize = context3.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479723df);
            int dimensionPixelSize2 = context3.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479716d9);
            android.view.View p18 = holder.p(com.tencent.mm.R.id.knh);
            if (p18 != null) {
                p18.getLayoutParams().width = dimensionPixelSize;
                p18.getLayoutParams().height = dimensionPixelSize;
            }
            android.view.View p19 = holder.p(com.tencent.mm.R.id.knf);
            if (p19 != null) {
                p19.getLayoutParams().width = dimensionPixelSize2;
                p19.getLayoutParams().height = dimensionPixelSize2;
            }
        } else {
            int dimensionPixelSize3 = context3.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479723df);
            android.view.View p27 = holder.p(com.tencent.mm.R.id.a_4);
            if (p27 != null) {
                p27.getLayoutParams().width = dimensionPixelSize3;
                p27.getLayoutParams().height = dimensionPixelSize3;
            }
        }
        android.widget.ImageView imageView3 = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.f485546i22);
        if (imageView3 != null && (imageView3.getLayoutParams() instanceof android.widget.LinearLayout.LayoutParams)) {
            android.view.ViewGroup.LayoutParams layoutParams2 = imageView3.getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams3 = layoutParams2 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams2 : null;
            if (layoutParams3 != null) {
                layoutParams3.setMargins(context3.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479734dr), 0, 0, 0);
            }
        }
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.ag6);
        if (textView2 != null) {
            textView2.setTextSize(1, 14.0f);
        }
        android.view.View p28 = pdVar3.u0() ? holder.p(com.tencent.mm.R.id.knh) : holder.p(com.tencent.mm.R.id.a_4);
        com.tencent.mm.plugin.finder.convert.kp kpVar2 = this.f104498g;
        if (p28 != null) {
            context = context3;
            str = "FinderMsgConvert";
            viewGroup = null;
            pdVar = pdVar3;
            kpVar = kpVar2;
            com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.f122820a.v(p28, item, kpVar2.f103851a, true, true, pdVar3.field_businessType == 1);
        } else {
            context = context3;
            str = "FinderMsgConvert";
            pdVar = pdVar3;
            kpVar = kpVar2;
            viewGroup = null;
        }
        if (p28 != null) {
            com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract finderMsgContract = com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.f122820a;
            android.view.View view = holder.itemView;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            finderMsgContract.getClass();
            if (view != null) {
                ym5.a1.h(view, new ym5.n0() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$exposedReport$1
                    @Override // ym5.n0
                    public void onViewExposed(android.view.View view2, long j17, long j18, boolean z27) {
                        kotlin.jvm.internal.o.g(view2, "view");
                        if (z27) {
                            com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract finderMsgContract2 = com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.f122820a;
                            finderMsgContract2.getClass();
                            android.content.Context context4 = context;
                            kotlin.jvm.internal.o.g(context4, "context");
                            com.tencent.mm.plugin.finder.report.b6.d(com.tencent.mm.plugin.finder.report.b6.f124969a, finderMsgContract2.k(context4, 117), "protrait", 0, null, false, null, 56, null);
                        }
                    }
                });
            }
        }
        if (v(holder, item)) {
            context2 = context;
            pdVar2 = pdVar;
            i19 = 0;
            i28 = 1;
            i27 = 2;
        } else {
            android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.kbq);
            if (textView3 != null) {
                com.tencent.mm.ui.fk.a(textView3);
            }
            pdVar2 = pdVar;
            i19 = 0;
            u(holder, pdVar2, false);
            com.tencent.mm.plugin.finder.view.UserRelationshipTagTextView userRelationshipTagTextView = (com.tencent.mm.plugin.finder.view.UserRelationshipTagTextView) holder.p(com.tencent.mm.R.id.qct);
            if (userRelationshipTagTextView != null) {
                com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.f122820a.w(userRelationshipTagTextView, pdVar2, kpVar.f103851a);
            }
            com.tencent.mars.xlog.Log.i(str, "bind holder: " + holder.hashCode() + ", refreshTime");
            android.view.View p29 = holder.p(com.tencent.mm.R.id.kbq);
            android.view.ViewParent parent = p29 != null ? p29.getParent() : viewGroup;
            android.view.ViewGroup viewGroup3 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : viewGroup;
            java.lang.String n17 = com.tencent.mm.plugin.finder.assist.w2.n(context, pdVar2.field_createTime * 1000);
            if (viewGroup3 == null) {
                kotlin.jvm.internal.o.d(n17);
                B(holder, item, n17);
                context2 = context;
                i28 = 1;
                i27 = 2;
            } else {
                kotlin.jvm.internal.o.d(n17);
                w(holder, item, n17, viewGroup3);
                i27 = 2;
                context2 = context;
                i28 = 1;
                ((android.app.Activity) context2).findViewById(android.R.id.content).getViewTreeObserver().addOnPreDrawListener(new com.tencent.mm.plugin.finder.convert.qp(holder, this, item, n17, viewGroup3));
            }
            if (!pdVar2.u0() && (imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.e_c)) != null) {
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = pdVar2.field_contact;
                zy2.tb.a(m1Var, imageView, finderContact2 != null ? finderContact2.getAuthInfo() : viewGroup, 0, 4, null);
            }
        }
        kv2.i g17 = kv2.h.f312662a.g(pdVar2);
        android.widget.TextView textView4 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.nxa);
        if (textView4 != null) {
            i95.m c17 = i95.n0.c(cq.k.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.N().r()).booleanValue()) {
                i29 = 3;
                if (pdVar2.field_jumpType == 3) {
                    textView4.setText(context2.getResources().getString(com.tencent.mm.R.string.jyh));
                    textView4.setVisibility(i19);
                }
            } else {
                i29 = 3;
            }
            if (pdVar2.field_mediaType == 9) {
                textView4.setText(context2.getResources().getString(com.tencent.mm.R.string.f493755ox5));
                textView4.setVisibility(i19);
            } else {
                int ordinal = g17.ordinal();
                if (ordinal == i28) {
                    textView4.setText(context2.getResources().getString(com.tencent.mm.R.string.jyz));
                    textView4.setVisibility(i19);
                } else if (ordinal == i27) {
                    textView4.setText(context2.getResources().getString(com.tencent.mm.R.string.jyh));
                    textView4.setVisibility(i19);
                } else if (ordinal == i29) {
                    textView4.setText(context2.getResources().getString(com.tencent.mm.R.string.jyf));
                    textView4.setVisibility(i19);
                } else if (ordinal != 4) {
                    textView4.setVisibility(8);
                } else {
                    textView4.setText(context2.getResources().getString(com.tencent.mm.R.string.jz7));
                    textView4.setVisibility(i19);
                }
            }
        }
        x(holder, pdVar2);
        super.h(holder, item, i17, i18, z17, list);
    }

    public abstract void r(in5.s0 s0Var, so2.i iVar, int i17, java.util.List list);

    public void s(in5.s0 holder, so2.i item) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
    }

    public void t(in5.s0 holder, so2.i item) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
    }

    public final void u(in5.s0 s0Var, dm.pd pdVar, boolean z17) {
        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.gaf);
        int i17 = this.f104498g.f103851a;
        if ((i17 != 2 && i17 != 1) || ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.U1().r()).intValue() == 0) {
            if (p17 == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgConvert", "refreshFollowBtnLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/autogen/table/LocalFinderMention;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderMsgConvert", "refreshFollowBtnLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/autogen/table/LocalFinderMention;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (p17 == null) {
            return;
        }
        if (pdVar.u0() || !pdVar.t0()) {
            com.tencent.mars.xlog.Log.i("FinderMsgConvert", "convert: " + getClass() + ", nickname: " + pdVar.field_nickname + ", extFlag: " + pdVar.field_extFlag);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgConvert", "refreshFollowBtnLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/autogen/table/LocalFinderMention;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderMsgConvert", "refreshFollowBtnLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/autogen/table/LocalFinderMention;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        boolean h17 = ya2.g.h(ya2.h.f460484a, pdVar.field_username, null, false, false, 14, null);
        com.tencent.mars.xlog.Log.i("FinderMsgConvert", "convert: " + getClass() + ", nickname: " + pdVar.field_nickname + ", follow: " + h17 + ", force: " + z17);
        if (h17 || z17) {
            int i18 = z17 ? 4 : 8;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(p17, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgConvert", "refreshFollowBtnLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/autogen/table/LocalFinderMention;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderMsgConvert", "refreshFollowBtnLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/autogen/table/LocalFinderMention;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(p17, arrayList4.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgConvert", "refreshFollowBtnLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/autogen/table/LocalFinderMention;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderMsgConvert", "refreshFollowBtnLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/autogen/table/LocalFinderMention;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setOnClickListener(new com.tencent.mm.plugin.finder.convert.np(this, p17, s0Var, pdVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0092, code lost:
    
        if ((r11 != null && r11.getInteger(0) == 1) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00a8, code lost:
    
        if ((r11 != null && r11.getInteger(0) == 1) != false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean v(in5.s0 r24, so2.i r25) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.rp.v(in5.s0, so2.i):boolean");
    }

    public final void w(in5.s0 s0Var, so2.i item, java.lang.String timeText, android.view.ViewGroup viewGroup) {
        android.widget.TextView textView;
        int i17;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams;
        int i18;
        android.widget.TextView textView2 = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.kbq);
        int childCount = viewGroup.getChildCount();
        int paddingLeft = viewGroup.getPaddingLeft() + viewGroup.getPaddingRight();
        boolean z17 = false;
        for (int i19 = 0; i19 < childCount; i19++) {
            android.view.View childAt = viewGroup.getChildAt(i19);
            boolean z18 = childAt instanceof android.widget.TextView;
            if (z18) {
                android.widget.TextView textView3 = (android.widget.TextView) childAt;
                if (textView3.getId() == com.tencent.mm.R.id.o7z) {
                    int measureText = (int) textView3.getPaint().measureText(timeText);
                    android.view.ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
                    i17 = measureText + (marginLayoutParams2 != null ? marginLayoutParams2.leftMargin : 0);
                    android.view.ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                    marginLayoutParams = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
                    if (marginLayoutParams != null) {
                        i18 = marginLayoutParams.rightMargin;
                        paddingLeft += i17 + i18;
                    }
                    i18 = 0;
                    paddingLeft += i17 + i18;
                }
            }
            if (z18) {
                android.widget.TextView textView4 = (android.widget.TextView) childAt;
                if (textView4.getVisibility() == 0) {
                    int measureText2 = (int) textView4.getPaint().measureText(textView4.getText().toString());
                    android.view.ViewGroup.LayoutParams layoutParams3 = childAt.getLayoutParams();
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams3 : null;
                    i17 = measureText2 + (marginLayoutParams3 != null ? marginLayoutParams3.leftMargin : 0);
                    android.view.ViewGroup.LayoutParams layoutParams4 = childAt.getLayoutParams();
                    marginLayoutParams = layoutParams4 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams4 : null;
                    if (marginLayoutParams != null) {
                        i18 = marginLayoutParams.rightMargin;
                    }
                    i18 = 0;
                }
            } else if (childAt.getVisibility() == 0) {
                int measuredWidth = childAt.getMeasuredWidth();
                android.view.ViewGroup.LayoutParams layoutParams5 = childAt.getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams5 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams5 : null;
                i17 = measuredWidth + (marginLayoutParams4 != null ? marginLayoutParams4.leftMargin : 0);
                android.view.ViewGroup.LayoutParams layoutParams6 = childAt.getLayoutParams();
                marginLayoutParams = layoutParams6 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams6 : null;
                if (marginLayoutParams != null) {
                    i18 = marginLayoutParams.rightMargin;
                }
                i18 = 0;
            }
            paddingLeft += i17 + i18;
        }
        int width = paddingLeft - viewGroup.getWidth();
        if (textView2 == null || width <= 0) {
            B(s0Var, item, timeText);
            return;
        }
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(timeText, "timeText");
        android.widget.TextView textView5 = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.kbq);
        if (textView5 != null && (textView = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.qdq)) != null) {
            textView.setText(timeText);
            textView.setVisibility(0);
            android.widget.TextView textView6 = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.o7z);
            if (textView6 != null) {
                textView6.setVisibility(8);
            }
            textView5.requestLayout();
            s(s0Var, item);
            z17 = true;
        }
        if (z17) {
            return;
        }
        B(s0Var, item, timeText);
    }

    public final void x(in5.s0 s0Var, dm.pd pdVar) {
        android.view.View findViewById = s0Var.itemView.findViewById(com.tencent.mm.R.id.f485896rx4);
        if (findViewById == null) {
            return;
        }
        if (pm0.v.z(pdVar.field_extFlag, 8192)) {
            java.lang.String str = pdVar.field_silentMentionEntityId;
            if (!(str == null || str.length() == 0) && pdVar.field_isSilentMention == 1) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgConvert", "refreshSilentStatus", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/autogen/table/LocalFinderMention;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/convert/FinderMsgConvert", "refreshSilentStatus", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/autogen/table/LocalFinderMention;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgConvert", "refreshSilentStatus", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/autogen/table/LocalFinderMention;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/convert/FinderMsgConvert", "refreshSilentStatus", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/autogen/table/LocalFinderMention;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007b, code lost:
    
        if (r1 != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009b, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0099, code lost:
    
        if (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.j2().r()).intValue() != 0) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(in5.s0 r23, dm.pd r24, int r25) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.rp.y(in5.s0, dm.pd, int):void");
    }

    public final void z(in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.View p17 = holder.p(com.tencent.mm.R.id.f485991jt2);
        if (p17 != null) {
            android.view.ViewGroup.LayoutParams layoutParams = p17.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams == null) {
                return;
            }
            marginLayoutParams.leftMargin = i17;
        }
    }
}
