package ox2;

/* loaded from: classes10.dex */
public final class h0 {

    /* renamed from: g, reason: collision with root package name */
    public static final ox2.g0 f431194g = new ox2.g0(null);

    /* renamed from: a, reason: collision with root package name */
    public final yz5.l f431195a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f431196b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f431197c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f431198d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1669x49fc1889.C15409xe873dc34 f431199e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f431200f;

    public h0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity, com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb, java.lang.CharSequence title, java.lang.CharSequence charSequence, yz5.l lVar, yz5.l lVar2, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        android.view.ViewGroup viewGroup;
        android.view.View view;
        android.view.View view2;
        android.view.ViewGroup.LayoutParams layoutParams = null;
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb2 = (i17 & 2) != 0 ? null : interfaceC4987x84e327cb;
        java.lang.CharSequence charSequence2 = (i17 & 8) != 0 ? null : charSequence;
        yz5.l lVar3 = (i17 & 16) != 0 ? null : lVar;
        yz5.l lVar4 = (i17 & 32) != 0 ? null : lVar2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        this.f431195a = lVar3;
        this.f431196b = lVar4;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(activity);
        this.f431197c = y1Var;
        android.view.View inflate = android.view.LayoutInflater.from(activity).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e5s, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f431198d = inflate;
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.oqh);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.om7);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1669x49fc1889.C15409xe873dc34 c15409xe873dc34 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1669x49fc1889.C15409xe873dc34) inflate.findViewById(com.p314xaae8f345.mm.R.id.t2o);
        this.f431199e = c15409xe873dc34;
        android.widget.Button button = (android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.smf);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.f564979sl2);
        this.f431200f = findViewById;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15273x7affa9e8 c15273x7affa9e8 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15273x7affa9e8) inflate.findViewById(com.p314xaae8f345.mm.R.id.tcu);
        if (textView != null) {
            com.p314xaae8f345.mm.ui.fk.b(textView);
        }
        if (textView != null) {
            textView.setText(title);
        }
        if (!(charSequence2 == null || charSequence2.length() == 0)) {
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
            if (textView2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(textView2, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Integer.valueOf(intValue));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(textView2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/interactioneasteregg/CenterInteractionEasterEggPreviewHalfScreen", "<init>", "(Landroidx/appcompat/app/AppCompatActivity;Lcom/tencent/mm/api/IEmojiInfo;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                textView2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(textView2, "com/tencent/mm/plugin/finder/view/interactioneasteregg/CenterInteractionEasterEggPreviewHalfScreen", "<init>", "(Landroidx/appcompat/app/AppCompatActivity;Lcom/tencent/mm/api/IEmojiInfo;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                yj0.a.f(textView2, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else if (textView2 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(textView2, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue2 = ((java.lang.Integer) arrayList3.get(0)).intValue();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(java.lang.Integer.valueOf(intValue2));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(textView2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/view/interactioneasteregg/CenterInteractionEasterEggPreviewHalfScreen", "<init>", "(Landroidx/appcompat/app/AppCompatActivity;Lcom/tencent/mm/api/IEmojiInfo;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(textView2, "com/tencent/mm/plugin/finder/view/interactioneasteregg/CenterInteractionEasterEggPreviewHalfScreen", "<init>", "(Landroidx/appcompat/app/AppCompatActivity;Lcom/tencent/mm/api/IEmojiInfo;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(textView2, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (c15409xe873dc34 != null) {
            c15409xe873dc34.m62772x52ee4104(interfaceC4987x84e327cb2);
        }
        if (lVar3 != null) {
            if (findViewById != null) {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList5.add(8);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(findViewById, arrayList5.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                int intValue3 = ((java.lang.Integer) arrayList5.get(0)).intValue();
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                arrayList6.add(java.lang.Integer.valueOf(intValue3));
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(findViewById, arrayList6.toArray(), "com/tencent/mm/plugin/finder/view/interactioneasteregg/CenterInteractionEasterEggPreviewHalfScreen", "<init>", "(Landroidx/appcompat/app/AppCompatActivity;Lcom/tencent/mm/api/IEmojiInfo;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/view/interactioneasteregg/CenterInteractionEasterEggPreviewHalfScreen", "<init>", "(Landroidx/appcompat/app/AppCompatActivity;Lcom/tencent/mm/api/IEmojiInfo;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                yj0.a.f(findViewById, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (button != null) {
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                arrayList7.add(0);
                java.util.Collections.reverse(arrayList7);
                yj0.a.d(button, arrayList7.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                int intValue4 = ((java.lang.Integer) arrayList7.get(0)).intValue();
                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                arrayList8.add(java.lang.Integer.valueOf(intValue4));
                java.util.Collections.reverse(arrayList8);
                yj0.a.d(button, arrayList8.toArray(), "com/tencent/mm/plugin/finder/view/interactioneasteregg/CenterInteractionEasterEggPreviewHalfScreen", "<init>", "(Landroidx/appcompat/app/AppCompatActivity;Lcom/tencent/mm/api/IEmojiInfo;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                button.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                yj0.a.f(button, "com/tencent/mm/plugin/finder/view/interactioneasteregg/CenterInteractionEasterEggPreviewHalfScreen", "<init>", "(Landroidx/appcompat/app/AppCompatActivity;Lcom/tencent/mm/api/IEmojiInfo;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                yj0.a.f(button, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (button != null) {
                button.setOnClickListener(new ox2.d0(this));
            }
        } else {
            if (findViewById != null) {
                java.util.ArrayList arrayList9 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
                arrayList9.add(0);
                java.util.Collections.reverse(arrayList9);
                yj0.a.d(findViewById, arrayList9.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                int intValue5 = ((java.lang.Integer) arrayList9.get(0)).intValue();
                java.util.ArrayList arrayList10 = new java.util.ArrayList();
                arrayList10.add(java.lang.Integer.valueOf(intValue5));
                java.util.Collections.reverse(arrayList10);
                yj0.a.d(findViewById, arrayList10.toArray(), "com/tencent/mm/plugin/finder/view/interactioneasteregg/CenterInteractionEasterEggPreviewHalfScreen", "<init>", "(Landroidx/appcompat/app/AppCompatActivity;Lcom/tencent/mm/api/IEmojiInfo;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/view/interactioneasteregg/CenterInteractionEasterEggPreviewHalfScreen", "<init>", "(Landroidx/appcompat/app/AppCompatActivity;Lcom/tencent/mm/api/IEmojiInfo;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                yj0.a.f(findViewById, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (button != null) {
                java.util.ArrayList arrayList11 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal6 = zj0.c.f554818a;
                arrayList11.add(8);
                java.util.Collections.reverse(arrayList11);
                yj0.a.d(button, arrayList11.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                int intValue6 = ((java.lang.Integer) arrayList11.get(0)).intValue();
                java.util.ArrayList arrayList12 = new java.util.ArrayList();
                arrayList12.add(java.lang.Integer.valueOf(intValue6));
                java.util.Collections.reverse(arrayList12);
                yj0.a.d(button, arrayList12.toArray(), "com/tencent/mm/plugin/finder/view/interactioneasteregg/CenterInteractionEasterEggPreviewHalfScreen", "<init>", "(Landroidx/appcompat/app/AppCompatActivity;Lcom/tencent/mm/api/IEmojiInfo;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                button.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
                yj0.a.f(button, "com/tencent/mm/plugin/finder/view/interactioneasteregg/CenterInteractionEasterEggPreviewHalfScreen", "<init>", "(Landroidx/appcompat/app/AppCompatActivity;Lcom/tencent/mm/api/IEmojiInfo;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                yj0.a.f(button, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        y1Var.f293570s = new ox2.e0(this);
        if (c15273x7affa9e8 != null) {
            c15273x7affa9e8.m61982xbc9c95b7(new ox2.f0(this));
        }
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 c2690x46972046 = y1Var.f293569r;
        if (c2690x46972046 != null && c15273x7affa9e8 != null && (viewGroup = c15273x7affa9e8.f212513d) != null && (view = c15273x7affa9e8.f212514e) != null && (view2 = c15273x7affa9e8.f212515f) != null) {
            c15273x7affa9e8.f212517h = c2690x46972046;
            android.content.res.Resources resources = view.getContext().getResources();
            float dimension = resources.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj);
            float dimension2 = resources.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
            float dimension3 = resources.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
            android.view.ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = (int) (((dimension2 - dimension3) * 1.0f) + dimension3 + com.p314xaae8f345.mm.ui.kk.b(view));
                layoutParams = layoutParams2;
            }
            viewGroup.setLayoutParams(layoutParams);
            c2690x46972046.f125986z = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.y7(c15273x7affa9e8, dimension, view, view2, dimension3, dimension2);
        }
        y1Var.f293577z = true;
        y1Var.l(inflate, new android.widget.FrameLayout.LayoutParams(-1, -2));
    }

    public final void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1669x49fc1889.C15409xe873dc34 c15409xe873dc34 = this.f431199e;
        if (c15409xe873dc34 != null && !c15409xe873dc34.f213928o) {
            c15409xe873dc34.f213928o = true;
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = c15409xe873dc34.f213923g;
            if (c22789xd23e9a9b != null) {
                c22789xd23e9a9b.setVisibility(0);
            }
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b2 = c15409xe873dc34.f213923g;
            if (c22789xd23e9a9b2 != null) {
                c22789xd23e9a9b2.post(new ox2.a0(c15409xe873dc34));
            }
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b3 = c15409xe873dc34.f213923g;
            if (c22789xd23e9a9b3 != null) {
                try {
                    java.lang.String str = c15409xe873dc34.isThumbLike ? "finder_finger_like_animator_new.pag" : "finder_heart_like.pag";
                    cq.k1.a();
                    c22789xd23e9a9b3.o(((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.Z0().r()).booleanValue());
                    if (c22789xd23e9a9b3.getUseRfx()) {
                        c22789xd23e9a9b3.mo82566x3e3ac3e8(com.p314xaae8f345.mm.rfx.C20942x379cf5ee.m77390x243906(c22789xd23e9a9b3.getContext().getAssets(), str));
                    } else {
                        c22789xd23e9a9b3.mo82568x3e3ac3e8(org.p3363xbe4143f1.C29690xfae77312.m154715x243906(c22789xd23e9a9b3.getContext().getAssets(), str));
                    }
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("CenterInteractionEasterEggDarkPreview", "initThumbPag e:" + th6);
                }
            }
            c15409xe873dc34.d();
        }
        this.f431197c.s();
    }
}
