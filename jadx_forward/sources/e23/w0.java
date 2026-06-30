package e23;

/* loaded from: classes12.dex */
public final class w0 extends u13.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.b1 f328508b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(e23.b1 b1Var) {
        super(b1Var);
        this.f328508b = b1Var;
    }

    @Override // u13.f
    public void b(android.content.Context context, u13.e eVar, u13.g gVar, java.lang.Object... extraData) {
        int i17;
        android.widget.LinearLayout linearLayout;
        boolean z17;
        java.util.LinkedList linkedList;
        r45.di6 di6Var;
        r45.ak6 ak6Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extraData, "extraData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(eVar, "null cannot be cast to non-null type com.tencent.mm.plugin.fts.ui.item.FTSRelevantSearchDataItem.FTSRelevantSearchViewHolder");
        em.m0 m0Var = ((e23.t0) eVar).f328499a;
        if (m0Var != null) {
            e23.b1 b1Var = this.f328508b;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b1Var.f328318s)) {
                if (m0Var.f336125d == null) {
                    m0Var.f336125d = (android.widget.TextView) m0Var.f336122a.findViewById(com.p314xaae8f345.mm.R.id.ltq);
                }
                m0Var.f336125d.setText(b1Var.f328318s);
            }
            b1Var.f328320u.getClass();
            m0Var.a().removeAllViews();
            java.lang.String str = "";
            b1Var.f328319t = "";
            if (context != null) {
                pf5.z zVar = pf5.z.f435481a;
                boolean z18 = context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112;
                if (!z18) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context;
                p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a(activityC0065xcd7aa112).a(z13.f.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
                boolean f76 = ((z13.f) a17).f7();
                if (!z18) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                boolean z19 = false;
                boolean z27 = ((c23.c0) zVar.a(activityC0065xcd7aa112).a(c23.c0.class)).f119550s > 0;
                java.util.LinkedList linkedList2 = b1Var.f328316q;
                if (z27) {
                    android.widget.LinearLayout a18 = m0Var.a();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "getSugContainer(...)");
                    int i18 = b1Var.f328317r;
                    int i19 = 0;
                    while (i19 < i18) {
                        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.efo, a18, z19);
                        em.j0 j0Var = new em.j0(inflate);
                        r45.jo0 jo0Var = (r45.jo0) kz5.n0.a0(linkedList2, i19);
                        java.lang.String str2 = str;
                        if (j0Var.f335983b == null) {
                            j0Var.f335983b = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) inflate.findViewById(com.p314xaae8f345.mm.R.id.uxx);
                        }
                        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = j0Var.f335983b;
                        int i27 = i18;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c1073x7e08a787, "getRelevantDataItemLayout(...)");
                        if (f76) {
                            z17 = f76;
                            linkedList = linkedList2;
                            linearLayout = a18;
                            c1073x7e08a787.setPadding(i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9), c1073x7e08a787.getPaddingTop(), c1073x7e08a787.getPaddingRight(), c1073x7e08a787.getPaddingBottom());
                        } else {
                            linearLayout = a18;
                            z17 = f76;
                            linkedList = linkedList2;
                        }
                        if (j0Var.f335984c == null) {
                            j0Var.f335984c = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate.findViewById(com.p314xaae8f345.mm.R.id.f564804d15);
                        }
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = j0Var.f335984c;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c22699x3dcdb352, "getArrowRight(...)");
                        if (j0Var.f335985d == null) {
                            j0Var.f335985d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate.findViewById(com.p314xaae8f345.mm.R.id.sf7);
                        }
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = j0Var.f335985d;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c22699x3dcdb3522, "getArrowUpLeft(...)");
                        e(context, c22699x3dcdb352, c22699x3dcdb3522, jo0Var);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "getInflateRootView(...)");
                        if (j0Var.f335988g == null) {
                            j0Var.f335988g = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.ltk);
                        }
                        android.widget.TextView textView = j0Var.f335988g;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(textView, "getRelevantQuery(...)");
                        b1Var.p(i19, inflate, textView);
                        if (i19 == b1Var.f328317r - 1) {
                            if (j0Var.f335987f == null) {
                                j0Var.f335987f = inflate.findViewById(com.p314xaae8f345.mm.R.id.q_a);
                            }
                            android.view.View view = j0Var.f335987f;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                            arrayList.add(8);
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/item/FTSRelevantSearchDataItem$FTSRelevantSearchViewItem", "addNewSugItemView", "(Landroid/content/Context;Landroid/widget/LinearLayout;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                            yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/item/FTSRelevantSearchDataItem$FTSRelevantSearchViewItem", "addNewSugItemView", "(Landroid/content/Context;Landroid/widget/LinearLayout;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        if (jo0Var != null && (di6Var = jo0Var.f459519d) != null && (ak6Var = di6Var.f454054p) != null) {
                            int i28 = ak6Var.f451605d;
                            if (i28 != 3) {
                                if (i28 == 6) {
                                    j0Var.a().setVisibility(0);
                                    j0Var.b().setVisibility(0);
                                    android.widget.TextView b17 = j0Var.b();
                                    com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = ak6Var.f451606e;
                                    b17.setText(gVar2 != null ? gVar2.i() : str2);
                                    j0Var.b().setTextColor(i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77843xb0e5e715));
                                } else if (i28 != 32) {
                                    if (i28 == 33) {
                                        j0Var.a().setVisibility(0);
                                        android.view.ViewGroup.LayoutParams layoutParams = j0Var.a().getLayoutParams();
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                                        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
                                        layoutParams2.width = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561206ca);
                                        layoutParams2.height = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561206ca);
                                        j0Var.a().setLayoutParams(layoutParams2);
                                        j0Var.a().setImageResource(com.p314xaae8f345.mm.R.raw.f79414xef8aca88);
                                        j0Var.a().m82040x7541828(i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77636xad7ef29));
                                    }
                                }
                            }
                            j0Var.b().setVisibility(0);
                            android.widget.TextView b18 = j0Var.b();
                            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = ak6Var.f451606e;
                            b18.setText(gVar3 != null ? gVar3.i() : str2);
                            j0Var.b().setBackground(i65.a.i(context, com.p314xaae8f345.mm.R.C30861xcebc809e.f563387d55));
                            if (ak6Var.f451605d == 32) {
                                j0Var.b().setTextColor(i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560053a84));
                            } else {
                                j0Var.b().setTextColor(i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.adg));
                            }
                            android.view.ViewGroup.LayoutParams layoutParams3 = j0Var.b().getLayoutParams();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                            android.widget.LinearLayout.LayoutParams layoutParams4 = (android.widget.LinearLayout.LayoutParams) layoutParams3;
                            layoutParams4.setMarginStart(com.p314xaae8f345.mm.ui.zk.a(context, 4));
                            j0Var.b().setLayoutParams(layoutParams4);
                        }
                        a18 = linearLayout;
                        a18.addView(inflate);
                        i19++;
                        str = str2;
                        i18 = i27;
                        f76 = z17;
                        linkedList2 = linkedList;
                        z19 = false;
                    }
                } else {
                    java.util.LinkedList linkedList3 = linkedList2;
                    android.widget.LinearLayout a19 = m0Var.a();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a19, "getSugContainer(...)");
                    int i29 = b1Var.f328317r;
                    int i37 = 0;
                    while (i37 < i29) {
                        android.view.View inflate2 = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.df9, (android.view.ViewGroup) a19, false);
                        java.util.LinkedList linkedList4 = linkedList3;
                        r45.jo0 jo0Var2 = (r45.jo0) kz5.n0.a0(linkedList4, i37);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate2, "getInflateRootView(...)");
                        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) inflate2.findViewById(com.p314xaae8f345.mm.R.id.uxx);
                        if (linearLayout2 == null || !f76) {
                            i17 = i29;
                            linkedList3 = linkedList4;
                        } else {
                            i17 = i29;
                            linkedList3 = linkedList4;
                            linearLayout2.setPadding(i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9), linearLayout2.getPaddingTop(), linearLayout2.getPaddingRight(), linearLayout2.getPaddingBottom());
                        }
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate2.findViewById(com.p314xaae8f345.mm.R.id.f564804d15);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c22699x3dcdb3523, "getArrowRight(...)");
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3524 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate2.findViewById(com.p314xaae8f345.mm.R.id.sf7);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c22699x3dcdb3524, "getArrowUpLeft(...)");
                        e(context, c22699x3dcdb3523, c22699x3dcdb3524, jo0Var2);
                        android.widget.TextView textView2 = (android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.ltk);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(textView2, "getRelevantQuery(...)");
                        b1Var.p(i37, inflate2, textView2);
                        if (i37 == b1Var.f328317r - 1) {
                            android.view.View findViewById = inflate2.findViewById(com.p314xaae8f345.mm.R.id.q_a);
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                            arrayList2.add(8);
                            java.util.Collections.reverse(arrayList2);
                            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/fts/ui/item/FTSRelevantSearchDataItem$FTSRelevantSearchViewItem", "addSugItemView", "(Landroid/content/Context;Landroid/widget/LinearLayout;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                            yj0.a.f(findViewById, "com/tencent/mm/plugin/fts/ui/item/FTSRelevantSearchDataItem$FTSRelevantSearchViewItem", "addSugItemView", "(Landroid/content/Context;Landroid/widget/LinearLayout;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        a19.addView(inflate2);
                        i37++;
                        i29 = i17;
                    }
                }
                java.lang.String str3 = b1Var.f328319t;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str3, "<set-?>");
                com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.c3.f219564b = str3;
            }
        }
    }

    @Override // u13.f
    public android.view.View c(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bcy, viewGroup, false);
        e23.b1 b1Var = this.f328508b;
        e23.t0 o17 = b1Var.o();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(o17, "null cannot be cast to non-null type com.tencent.mm.plugin.fts.ui.item.FTSRelevantSearchDataItem.FTSRelevantSearchViewHolder");
        em.m0 m0Var = new em.m0(inflate);
        o17.f328499a = m0Var;
        if (m0Var.f336123b == null) {
            m0Var.f336123b = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568135uy1);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = m0Var.f336123b;
        if (j62.e.g().l("clicfg_android_use_search_global_sug_feedback", false, true, true)) {
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setVisibility(0);
            }
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setOnClickListener(new e23.u0(b1Var));
            }
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            b1Var.f328321v = activity != null ? activity.findViewById(com.p314xaae8f345.mm.R.id.typ) : null;
        } else if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setVisibility(8);
        }
        inflate.setTag(o17);
        return inflate;
    }

    @Override // u13.f
    public boolean d(android.content.Context context, android.view.View view, u13.g gVar, java.lang.Object... extraData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extraData, "extraData");
        return false;
    }

    public final void e(android.content.Context context, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522, r45.jo0 jo0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(z13.f.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        z13.f fVar = (z13.f) a17;
        boolean z17 = this.f328508b.f505292b == 0;
        if (!fVar.f7() || !z17) {
            c22699x3dcdb3522.setVisibility(8);
            c22699x3dcdb352.setVisibility(0);
        } else {
            c22699x3dcdb3522.setVisibility(0);
            c22699x3dcdb352.setVisibility(8);
            c22699x3dcdb3522.setOnClickListener(new e23.v0(fVar, jo0Var));
        }
    }
}
