package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class je extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f103746d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103747e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public je(int i17, in5.s0 s0Var) {
        super(0);
        this.f103746d = i17;
        this.f103747e = s0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = this.f103746d;
        in5.s0 s0Var = this.f103747e;
        if (i17 != 3) {
            android.content.Context context = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.tencent.mm.plugin.finder.viewmodel.component.vf vfVar = (com.tencent.mm.plugin.finder.viewmodel.component.vf) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.vf.class);
            vfVar.getClass();
            com.tencent.mm.plugin.finder.feed.tips.TrackTipsFrameLayout trackTipsFrameLayout = new com.tencent.mm.plugin.finder.feed.tips.TrackTipsFrameLayout(vfVar.getActivity(), null, 0, 6, null);
            trackTipsFrameLayout.a(com.tencent.mm.plugin.finder.viewmodel.component.rf.f135795d);
            if (vfVar.O6() && trackTipsFrameLayout.visibilityManager.O6(trackTipsFrameLayout.f109065e)) {
                com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
                com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_FULL_FINGER_LIKE_FEED_GUIDE_INT;
                int r17 = c17.r(u3Var, 0);
                com.tencent.mars.xlog.Log.i("Finder.FinderFingerLikeGuideUIC", "[checkGuide] count=" + r17);
                android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(vfVar.getActivity());
                trackTipsFrameLayout.addView(linearLayout);
                linearLayout.setOrientation(1);
                linearLayout.setGravity(17);
                linearLayout.setBackgroundColor(vfVar.getContext().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_3));
                com.tencent.mm.view.MMPAGView mMPAGView = new com.tencent.mm.view.MMPAGView(vfVar.getActivity(), null);
                int dimension = (int) vfVar.getActivity().getResources().getDimension(com.tencent.mm.R.dimen.f479660bx);
                linearLayout.addView(mMPAGView, new android.widget.LinearLayout.LayoutParams(dimension, dimension));
                android.widget.TextView textView = new android.widget.TextView(vfVar.getActivity());
                textView.setText(vfVar.getActivity().getResources().getString(com.tencent.mm.R.string.mha));
                textView.setTextColor(-1);
                textView.setTextSize(1, 17.0f);
                com.tencent.mm.ui.fk.a(textView);
                android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
                layoutParams.topMargin = (int) vfVar.getActivity().getResources().getDimension(com.tencent.mm.R.dimen.f479738dv);
                linearLayout.addView(textView, layoutParams);
                mMPAGView.setRepeatCount(-1);
                mMPAGView.o(((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.Z0().r()).booleanValue());
                if (mMPAGView.getUseRfx()) {
                    mMPAGView.setComposition(com.tencent.mm.rfx.RfxPagFile.Load(vfVar.getContext().getAssets(), "finder_full_like_guide.pag"));
                } else {
                    mMPAGView.setComposition(org.libpag.PAGFile.Load(vfVar.getContext().getAssets(), "finder_full_like_guide.pag"));
                }
                mMPAGView.g();
                android.view.View decorView = vfVar.getActivity().getWindow().getDecorView();
                kotlin.jvm.internal.o.e(decorView, "null cannot be cast to non-null type android.widget.FrameLayout");
                ((android.widget.FrameLayout) decorView).addView(trackTipsFrameLayout, new android.widget.FrameLayout.LayoutParams(-1, -1));
                linearLayout.setClickable(false);
                linearLayout.setOnTouchListener(new com.tencent.mm.plugin.finder.viewmodel.component.sf(vfVar, linearLayout));
                trackTipsFrameLayout.setVisibility(0);
                linearLayout.postDelayed(new com.tencent.mm.plugin.finder.viewmodel.component.tf(trackTipsFrameLayout, vfVar), 3000L);
                gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(r17 + 1));
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_FULL_FINGER_LIKE_FEED_GUIDE_LAST_TIME_LONG, java.lang.Long.valueOf(c01.id.a()));
            }
        } else {
            android.content.Context context2 = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            pf5.z zVar2 = pf5.z.f353948a;
            if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.tencent.mm.plugin.finder.viewmodel.component.vf vfVar2 = (com.tencent.mm.plugin.finder.viewmodel.component.vf) zVar2.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.vf.class);
            vfVar2.getClass();
            if (vfVar2.P6()) {
                com.tencent.mm.plugin.finder.view.e3 e3Var = new com.tencent.mm.plugin.finder.view.e3(vfVar2.getContext());
                e3Var.f131959f.setBackgroundResource(com.tencent.mm.R.drawable.f481539cu1);
                android.view.View inflate = android.view.LayoutInflater.from(s0Var.f293121e).inflate(com.tencent.mm.R.layout.dqi, (android.view.ViewGroup) null);
                android.widget.Button button = (android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.b0z);
                kotlin.jvm.internal.o.d(button);
                com.tencent.mm.ui.fk.a(button);
                button.setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.uf(e3Var));
                android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.odf);
                kotlin.jvm.internal.o.d(textView2);
                com.tencent.mm.ui.fk.a(textView2);
                android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.rqs);
                if (com.tencent.mm.ui.bk.C()) {
                    if (imageView != null) {
                        imageView.setImageResource(com.tencent.mm.R.drawable.cxd);
                    }
                } else if (imageView != null) {
                    imageView.setImageResource(com.tencent.mm.R.drawable.cxe);
                }
                e3Var.f131975y.addView(inflate, 0);
                e3Var.a();
                e3Var.i();
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_FULL_FINGER_LIKE_FEED_DIALOG_GUIDE_INT, 1);
            }
        }
        return jz5.f0.f302826a;
    }
}
