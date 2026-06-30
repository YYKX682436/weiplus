package rx4;

/* loaded from: classes8.dex */
public final class j0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx4.k0 f482739d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(rx4.k0 k0Var) {
        super(0);
        this.f482739d = k0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.widget.LinearLayout linearLayout;
        java.lang.Class cls;
        java.lang.String str;
        rx4.l lVar;
        java.util.List list;
        rx4.k0 k0Var = this.f482739d;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) k0Var.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.rrc);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[hitest] updateHotspotUI boxView=");
        sb6.append(viewGroup != null);
        sb6.append(", hotspotBlock.items=");
        rx4.l lVar2 = k0Var.f482746h;
        sb6.append((lVar2 == null || (list = lVar2.f482755d) == null) ? -1 : ((java.util.ArrayList) list).size());
        sb6.append(", isTabMode=");
        sb6.append(k0Var.f482745g);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str2 = k0Var.f482742d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb7);
        if (viewGroup != null) {
            android.view.View findViewById = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f568869oc0);
            android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.odf);
            android.app.Activity context = k0Var.m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            boolean z17 = ((rx4.h2) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(rx4.h2.class)).E;
            android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) viewGroup.findViewById(z17 ? com.p314xaae8f345.mm.R.id.u2z : com.p314xaae8f345.mm.R.id.cgz);
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("[hitest] updateHotspotUI isNewStyleExpt=");
            sb8.append(z17);
            sb8.append(", containerId=");
            sb8.append(z17 ? "hotspot_content_container" : "content_container");
            sb8.append(", container=");
            sb8.append(linearLayout2 != null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb8.toString());
            if (textView != null) {
                rx4.l lVar3 = k0Var.f482746h;
                textView.setText(lVar3 != null ? lVar3.f482753b : null);
            }
            if (!k0Var.f482745g) {
                linearLayout = linearLayout2;
                cls = rx4.h2.class;
                str = "context";
                if (textView != null) {
                    textView.setVisibility(0);
                }
                if (findViewById != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachHotspotBoxUIC$updateHotspotUI$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachHotspotBoxUIC$updateHotspotUI$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else if (findViewById == null) {
                linearLayout = linearLayout2;
                cls = rx4.h2.class;
                str = "context";
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                linearLayout = linearLayout2;
                cls = rx4.h2.class;
                str = "context";
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachHotspotBoxUIC$updateHotspotUI$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachHotspotBoxUIC$updateHotspotUI$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (linearLayout != null) {
                linearLayout.removeAllViews();
            }
            java.util.ArrayList arrayList3 = (java.util.ArrayList) k0Var.f482747i;
            arrayList3.clear();
            ((java.util.LinkedHashMap) k0Var.f482748m).clear();
            if (linearLayout != null && (lVar = k0Var.f482746h) != null) {
                java.util.ArrayList arrayList4 = (java.util.ArrayList) lVar.f482755d;
                if (arrayList4.isEmpty()) {
                    android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) k0Var.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.rrc);
                    if (viewGroup2 != null) {
                        viewGroup2.setVisibility(8);
                    }
                } else {
                    int size = arrayList4.size();
                    int i17 = 0;
                    while (i17 < size) {
                        rx4.m mVar = (rx4.m) arrayList4.get(i17);
                        android.app.Activity m80379x76847179 = k0Var.m80379x76847179();
                        java.lang.String str3 = str;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m80379x76847179, str3);
                        pf5.z zVar2 = pf5.z.f435481a;
                        if (!(m80379x76847179 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                            throw new java.lang.IllegalStateException("Check failed.".toString());
                        }
                        pf5.v a17 = zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) m80379x76847179);
                        java.lang.Class cls2 = cls;
                        android.view.View inflate = android.view.LayoutInflater.from(k0Var.m158354x19263085()).inflate(((rx4.h2) a17.a(cls2)).E ? com.p314xaae8f345.mm.R.C30864xbddafb2a.dul : com.p314xaae8f345.mm.R.C30864xbddafb2a.egg, (android.view.ViewGroup) null);
                        linearLayout.addView(inflate);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
                        arrayList3.add(inflate);
                        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565464ci2)).setText(mVar.f482762b);
                        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.nxa);
                        java.lang.String str4 = mVar.f482766f;
                        if (str4.length() > 0) {
                            textView2.setText(str4);
                            textView2.setVisibility(0);
                        } else {
                            textView2.setVisibility(8);
                        }
                        inflate.setOnClickListener(new rx4.i0(k0Var, mVar, i17, lVar));
                        i17++;
                        str = str3;
                        cls = cls2;
                    }
                    android.widget.ImageView imageView = (android.widget.ImageView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.obv);
                    if (imageView != null) {
                        java.lang.String str5 = lVar.f482757f;
                        if ((str5.length() > 0) && com.p314xaae8f345.mm.ui.bk.C()) {
                            wo0.c a18 = vo0.e.f520001b.a(str5);
                            jz5.g gVar = n0.o5.f415197a;
                            a18.g((yo0.i) n0.o5.f415198b.mo141623x754a37bb());
                            ((wo0.b) a18).c(imageView);
                            imageView.setVisibility(0);
                        } else {
                            java.lang.String str6 = lVar.f482756e;
                            if ((str6.length() > 0) && !com.p314xaae8f345.mm.ui.bk.C()) {
                                wo0.c a19 = vo0.e.f520001b.a(str6);
                                jz5.g gVar2 = n0.o5.f415197a;
                                a19.g((yo0.i) n0.o5.f415198b.mo141623x754a37bb());
                                ((wo0.b) a19).c(imageView);
                                imageView.setVisibility(0);
                            }
                        }
                    }
                    android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) k0Var.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.rrc);
                    if (viewGroup3 != null) {
                        viewGroup3.setVisibility(0);
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
