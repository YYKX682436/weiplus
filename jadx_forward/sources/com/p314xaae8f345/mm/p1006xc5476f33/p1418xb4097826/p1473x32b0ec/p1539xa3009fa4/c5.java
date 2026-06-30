package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class c5 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r5 f198505d;

    public c5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r5 r5Var) {
        this.f198505d = r5Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f198505d.f198893o.size();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x00b3. Please report as an issue. */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.d5 holder = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.d5) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r5 r5Var = this.f198505d;
        java.lang.Object obj = r5Var.f198893o.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.c6 c6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.c6) obj;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = holder.f198561e;
        c22699x3dcdb352.setRotationY(0.0f);
        holder.f198566m = c6Var;
        android.content.Context O6 = r5Var.O6();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = O6 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 ? (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) O6 : null;
        android.view.View view = holder.f198563g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostCameraOptPanelUIC$BeforeOptAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostCameraOptPanelUIC$BeforeOptViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostCameraOptPanelUIC$BeforeOptAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostCameraOptPanelUIC$BeforeOptViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c22699x3dcdb352.m82040x7541828(r5Var.O6().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aby));
        int color = r5Var.O6().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aby);
        android.widget.TextView textView3 = holder.f198562f;
        textView3.setTextColor(color);
        int i18 = c6Var.f198506a;
        if (i18 == 1) {
            textView = textView3;
            c22699x3dcdb352.setImageDrawable(c22699x3dcdb352.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f81290xbdabd6ed));
            c22699x3dcdb352.m82040x7541828(r5Var.O6().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77684x8113c231));
            textView.setText(c22699x3dcdb352.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572959d21));
            r45.n73 n73Var = (r45.n73) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) r5Var.m56788xbba4bfc0(mm2.g1.class)).f410604i).mo144003x754a37bb();
            r45.z53 z53Var = n73Var != null ? (r45.z53) n73Var.m75936x14adae67(1) : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.b3.f183555a.o(r5Var.getStore().getLiveRoomData(), 1, 2 - (z53Var != null ? z53Var.m75939xb282bd08(13) : 0), z53Var != null ? z53Var.m75945x2fec8307(0) : null);
        } else if (i18 == 2) {
            textView = textView3;
            c22699x3dcdb352.setImageDrawable(c22699x3dcdb352.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f79453x6a6257e2));
            c22699x3dcdb352.m82040x7541828(r5Var.O6().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77684x8113c231));
            textView.setText(c22699x3dcdb352.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573288e50));
        } else if (i18 == 4) {
            textView = textView3;
            ll2.e eVar = ll2.e.f400666a;
            ll2.e.l(eVar, activityC0065xcd7aa112, "startlive.bottom.lottery", holder.f198563g, null, null, 24, null);
            eVar.j("startlive.bottom.lottery", false);
            c22699x3dcdb352.setImageDrawable(c22699x3dcdb352.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f79871x420023fa, null));
            textView.setText(textView.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nsb));
        } else if (i18 == 5) {
            textView = textView3;
            c22699x3dcdb352.setImageDrawable(c22699x3dcdb352.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f79783x816b2373, null));
            textView.setText(textView.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e8o));
            android.view.View view2 = holder.f198563g;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostCameraOptPanelUIC$BeforeOptAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostCameraOptPanelUIC$BeforeOptViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostCameraOptPanelUIC$BeforeOptAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostCameraOptPanelUIC$BeforeOptViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (i18 != 6) {
            switch (i18) {
                case 11:
                    textView = textView3;
                    c22699x3dcdb352.setImageDrawable(c22699x3dcdb352.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f80955x1eaff89d));
                    textView.setText(c22699x3dcdb352.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m0j));
                    android.content.Context O62 = r5Var.O6();
                    pf5.z zVar = pf5.z.f435481a;
                    if (!(O62 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.s5 s5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.s5) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) O62).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.s5.class);
                    android.view.View view3 = holder.f198563g;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(view3, "<get-redDot>(...)");
                    s5Var.getClass();
                    pk2.o9 o9Var = s5Var.f198927d;
                    if (o9Var != null) {
                        pk2.v9 v9Var = new pk2.v9(o9Var, view3);
                        pk2.j9 j9Var = o9Var.f437617g;
                        if (j9Var != null) {
                            pk2.o9 o9Var2 = j9Var.f437426i;
                            o9Var2.f437619h = v9Var;
                            if (((yf2.m1) o9Var2.e(yf2.m1.class)) != null) {
                                pk2.t9 t9Var = pk2.t9.f437802a;
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z60 z60Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z60) ((jz5.n) j9Var.f437425h).mo141623x754a37bb();
                                java.util.List menuConfigs = j9Var.f437424g;
                                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = o9Var2.f437611d;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuConfigs, "menuConfigs");
                                ((java.util.ArrayList) menuConfigs).clear();
                                kz5.p0 p0Var = kz5.p0.f395529d;
                                java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ozc);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                                t9Var.a(menuConfigs, v9Var, 0, p0Var, z60Var, string);
                                java.util.List i19 = kz5.c0.i(new pk2.o4(o9Var2, 1), new pk2.u1(o9Var2, 1), new pk2.d1(o9Var2, 1), new pk2.p4(o9Var2, 1));
                                java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575295oz0);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                                t9Var.a(menuConfigs, v9Var, 1, i19, null, string2);
                                java.util.List i27 = kz5.c0.i(new pk2.y1(o9Var2, 1), new pk2.l2(o9Var2, 1), new pk2.s1(o9Var2, 1), new pk2.t1(o9Var2, 1));
                                java.lang.String string3 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575297oz2);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
                                t9Var.a(menuConfigs, v9Var, 2, i27, null, string3);
                                java.util.List i28 = kz5.c0.i(new pk2.g0(o9Var2, 1), new pk2.w2(o9Var2, 1), new pk2.i4(o9Var2, 1), new pk2.d3(o9Var2, 1), new pk2.m2(o9Var2, 1), new pk2.p2(o9Var2, 1), new pk2.z0(o9Var2, 1), new pk2.u4(o9Var2, 1), new pk2.e3(o9Var2, 1), new pk2.r2(o9Var2, 1));
                                java.lang.String string4 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575300oz5);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string4, "getString(...)");
                                t9Var.a(menuConfigs, v9Var, 3, i28, null, string4);
                                java.util.List i29 = kz5.c0.i(new pk2.x1(o9Var2, 1), new pk2.c3(o9Var2, 1), new pk2.e0(o9Var2, 1), new pk2.c1(o9Var2, 1));
                                java.lang.String string5 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ozg);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string5, "getString(...)");
                                t9Var.a(menuConfigs, v9Var, 4, i29, null, string5);
                                v9Var.m();
                                v9Var.m();
                            }
                            pk2.p7 p7Var = j9Var.f437421d;
                            if (p7Var != null && p7Var.c().e()) {
                                j9Var.c(null);
                                break;
                            }
                        }
                    }
                    break;
                case 12:
                    textView2 = textView3;
                    ll2.e eVar2 = ll2.e.f400666a;
                    ll2.e.l(eVar2, activityC0065xcd7aa112, "startlive.bottom.videosetting.switchcam", holder.f198563g, null, null, 24, null);
                    eVar2.j("startlive.bottom.videosetting.switchcam", false);
                    c22699x3dcdb352.setImageDrawable(c22699x3dcdb352.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f78740xa72a731c));
                    textView2.setText(textView2.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.osl));
                    textView = textView2;
                    break;
                case 13:
                    ll2.e eVar3 = ll2.e.f400666a;
                    textView2 = textView3;
                    ll2.e.l(eVar3, activityC0065xcd7aa112, "startlive.bottom.videosetting.beauty", holder.f198563g, null, null, 24, null);
                    eVar3.j("startlive.bottom.videosetting.beauty", false);
                    c22699x3dcdb352.setImageDrawable(c22699x3dcdb352.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f78615x5605685));
                    textView2.setText(textView2.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.otq));
                    textView = textView2;
                    break;
                case 14:
                    c22699x3dcdb352.setImageDrawable(c22699x3dcdb352.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f80955x1eaff89d));
                    textView3.setText(c22699x3dcdb352.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m0j));
                    android.view.View view4 = holder.f198563g;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(4);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostCameraOptPanelUIC$BeforeOptAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostCameraOptPanelUIC$BeforeOptViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostCameraOptPanelUIC$BeforeOptAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostCameraOptPanelUIC$BeforeOptViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                default:
                    textView = textView3;
                    break;
            }
        } else {
            textView = textView3;
            if (zl2.r4.f555483a.n2((r45.q12) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) r5Var.getStore().m56796xbba4bfc0(mm2.g1.class)).f410601f).mo144003x754a37bb())) {
                ll2.e eVar4 = ll2.e.f400666a;
                ll2.e.l(eVar4, activityC0065xcd7aa112, r5Var.h7(), holder.f198563g, null, null, 24, null);
                if (!r5Var.a()) {
                    eVar4.j(r5Var.h7(), false);
                }
            }
            android.content.Context context2 = textView.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            jz5.l g76 = r5Var.g7(context2, true);
            java.lang.String str = (java.lang.String) g76.f384366d;
            c22699x3dcdb352.setImageDrawable(c22699x3dcdb352.getContext().getResources().getDrawable(((java.lang.Number) g76.f384367e).intValue()));
            c22699x3dcdb352.m82040x7541828(r5Var.O6().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77684x8113c231));
            textView.setText(str);
        }
        holder.f3639x46306858.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.w4(r5Var, i17, holder));
        int dimensionPixelSize = r5Var.O6().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj);
        android.widget.RelativeLayout relativeLayout = holder.f198560d;
        android.view.ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        layoutParams.width = dimensionPixelSize;
        relativeLayout.setLayoutParams(layoutParams);
        holder.f3639x46306858.setTag(com.p314xaae8f345.mm.R.id.f565944e64, textView.getText());
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.View.inflate(parent.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.eee, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.d5(this.f198505d, inflate);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onViewAttachedToWindow */
    public void mo8160xd8bfd53(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.d5 holder = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.d5) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.mo8160xd8bfd53(holder);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.c6 c6Var = holder.f198566m;
        if (c6Var == null || 11 != c6Var.f198506a) {
            return;
        }
        holder.f198560d.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.x4(this, holder, c6Var), 500L);
    }
}
