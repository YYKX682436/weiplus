package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/game/ui/chat_tab/GameRoomStaggeredListFragment;", "Lcom/tencent/mm/plugin/game/ui/chat_tab/AbsGameRoomFragment;", "Lcom/tencent/mm/modelbase/u0;", "plugin-game_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.GameRoomStaggeredListFragment */
/* loaded from: classes8.dex */
public final class C16007x9ab46e2d extends com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.AbstractC15992x49ab61cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f222680f = 0;

    /* renamed from: d, reason: collision with root package name */
    public o43.d f222681d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f222682e;

    public final void j0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15758x3e6f7ab8 c15758x3e6f7ab8, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.Lbs lbs) {
        android.graphics.drawable.GradientDrawable gradientDrawable;
        if (c15758x3e6f7ab8 == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("StaggeredChatroom", "onSceneEnd rec Chatroom size  " + c15758x3e6f7ab8.f36669xa4bf0083.size());
        java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15741x8495618b> linkedList = c15758x3e6f7ab8.f36669xa4bf0083;
        int i17 = 0;
        if (linkedList == null || linkedList.isEmpty()) {
            throw null;
        }
        if (this.f222682e) {
            throw null;
        }
        android.view.View inflate = android.view.LayoutInflater.from(m7550xf0c4608a()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569922rz, (android.view.ViewGroup) null, false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15794xe442b9d7 c15794xe442b9d7 = d43.b.f307949i;
        if (c15794xe442b9d7 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(c15794xe442b9d7.f36791x319118a4) && c15794xe442b9d7.f36790xb49896e9 != null) {
                android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.kth);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) inflate.findViewById(com.p314xaae8f345.mm.R.id.ktq);
                c22624x85d69039.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y(c22624x85d69039, new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0(c22624x85d69039.getContext())));
                android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.ktb);
                float q17 = i65.a.q(m7550xf0c4608a());
                findViewById2.getLayoutParams().height = (int) (findViewById2.getLayoutParams().height * q17);
                findViewById2.getLayoutParams().width = (int) (findViewById2.getLayoutParams().width * q17);
                findViewById2.requestLayout();
                findViewById2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.g0(findViewById));
                java.lang.Integer l17 = s33.y.l(com.p314xaae8f345.mm.ui.bk.C() ? c15794xe442b9d7.f36790xb49896e9.f36646xa0e2915a : c15794xe442b9d7.f36790xb49896e9.f36649x7db41efa);
                if (l17 != null && (gradientDrawable = (android.graphics.drawable.GradientDrawable) findViewById.getBackground()) != null) {
                    gradientDrawable.setColor(l17.intValue());
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/chat_tab/GameRoomStaggeredListFragment", "handleGamePermission", "(Lcom/tencent/mm/plugin/game/autogen/chatroom/MyChatroomNotice;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/game/ui/chat_tab/GameRoomStaggeredListFragment", "handleGamePermission", "(Lcom/tencent/mm/plugin/game/autogen/chatroom/MyChatroomNotice;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
                    java.util.Iterator<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15749x39c3d7b4> it = c15794xe442b9d7.f36791x319118a4.iterator();
                    while (it.hasNext()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15749x39c3d7b4 next = it.next();
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(next.f36651x38b73479)) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43 c15748x3e43f43 = next.f36650x5a72f63;
                            java.lang.String str = c15748x3e43f43 == null ? null : com.p314xaae8f345.mm.ui.bk.C() ? c15748x3e43f43.f36646xa0e2915a : c15748x3e43f43.f36649x7db41efa;
                            if (str == null) {
                                str = "";
                            }
                            java.lang.Integer l18 = s33.y.l(str);
                            if (l18 != null) {
                                spannableStringBuilder.append((java.lang.CharSequence) next.f36651x38b73479);
                                if (next.f36652x28d1961f == null) {
                                    spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(l18.intValue()), i17, next.f36651x38b73479.length() + i17, 33);
                                } else {
                                    spannableStringBuilder.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.h0(this, next, findViewById), i17, next.f36651x38b73479.length() + i17, 33);
                                }
                                i17 = spannableStringBuilder.length();
                            }
                        }
                    }
                    c22624x85d69039.b(spannableStringBuilder);
                }
            }
        }
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.m6w)).setText(m7467x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.fox));
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.hyk);
        android.view.ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams instanceof android.widget.LinearLayout.LayoutParams) {
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
            layoutParams2.bottomMargin = i65.a.b(m7550xf0c4608a(), 8);
            layoutParams2.topMargin = i65.a.b(m7550xf0c4608a(), 10);
            linearLayout.setLayoutParams(layoutParams);
        }
        o43.d dVar = this.f222681d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar);
        dVar.f424384b.m53684x77114253(inflate);
        this.f222682e = true;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreateView */
    public android.view.View mo7503x18bad100(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inflater, "inflater");
        android.view.View inflate = inflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bhj, viewGroup, false);
        int i17 = com.p314xaae8f345.mm.R.id.hkx;
        android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.hkx);
        if (imageView != null) {
            i17 = com.p314xaae8f345.mm.R.id.f567032hw2;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f567032hw2);
            if (linearLayout != null) {
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) inflate;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12809xaf47a071 c12809xaf47a071 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12809xaf47a071) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.m8x);
                if (c12809xaf47a071 != null) {
                    this.f222681d = new o43.d(frameLayout, imageView, linearLayout, frameLayout, c12809xaf47a071);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(frameLayout, "getRoot(...)");
                    return frameLayout;
                }
                i17 = com.p314xaae8f345.mm.R.id.m8x;
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroyView */
    public void mo7399xa6664a60() {
        super.mo7399xa6664a60();
        gm0.j1.d().q(4631, this);
        this.f222681d = null;
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onResume */
    public void mo7517x57429eec() {
        super.mo7517x57429eec();
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var != null && m1Var.mo808xfb85f7b0() == 4631 && i17 == 0 && i18 == 0) {
            com.p314xaae8f345.mm.p944x882e457a.o oVar = ((v33.i) m1Var).f514651e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15758x3e6f7ab8 c15758x3e6f7ab8 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15758x3e6f7ab8) oVar.f152244b.f152233a;
            j0(c15758x3e6f7ab8, ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15757x6d446138) oVar.f152243a.f152217a).f36667xdccb09f0);
            if (c15758x3e6f7ab8 != null) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5580x225208dc c5580x225208dc = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5580x225208dc();
                am.we weVar = c5580x225208dc.f135902g;
                weVar.f89811a = 2;
                weVar.f89812b = "cache_chatroom_recommend";
                try {
                    weVar.f89813c = c15758x3e6f7ab8.mo14344x5f01b1f6();
                } catch (java.io.IOException unused) {
                }
                c5580x225208dc.e();
            }
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onViewCreated */
    public void mo7518x594b1124(android.view.View view, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        super.mo7518x594b1124(view, bundle);
        gm0.j1.d().a(4631, this);
        o43.d dVar = this.f222681d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1 c1164x587b7ff1 = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1(2, 1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12809xaf47a071 c12809xaf47a071 = dVar.f424384b;
        c12809xaf47a071.mo7967x900dcbe1(c1164x587b7ff1);
        c12809xaf47a071.N(new s53.f(i65.a.b(m7550xf0c4608a(), 8)));
        throw null;
    }
}
