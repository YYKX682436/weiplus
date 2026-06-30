package dc2;

/* loaded from: classes3.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1446x2f6e0a.C13725xb7848c6d f310235d;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1446x2f6e0a.C13725xb7848c6d c13725xb7848c6d) {
        this.f310235d = c13725xb7848c6d;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/edit/FinderLiveFixRatioPhoneEditPluginLayout$setLiveEditLayout$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1446x2f6e0a.C13725xb7848c6d.f186837x;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1446x2f6e0a.C13725xb7848c6d c13725xb7848c6d = this.f310235d;
        l45.q qVar = c13725xb7848c6d.getEditPhotoWrapper().f547120o;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(qVar, "null cannot be cast to non-null type com.tencent.mm.presenter.DrawingPresenter");
        android.graphics.Bitmap h17 = ((l45.n) qVar).h();
        android.content.Context context = c13725xb7848c6d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        y9.i iVar = new y9.i(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f81563do);
        android.view.View inflate = android.view.View.inflate(c13725xb7848c6d.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.bqs, null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.hrq);
        android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.bottomMargin = i65.a.b(c13725xb7848c6d.getContext(), 64) + com.p314xaae8f345.mm.ui.bl.c(c13725xb7848c6d.getContext());
        }
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.nby);
        android.widget.ImageView imageView2 = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.nfs);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.nc9);
        android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.nft);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView2);
        com.p314xaae8f345.mm.ui.fk.a(textView2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView3);
        com.p314xaae8f345.mm.ui.fk.a(textView3);
        com.p314xaae8f345.mm.ui.fk.a(textView);
        imageView.setImageBitmap(h17);
        imageView2.setImageBitmap(h17);
        android.widget.ImageView imageView3 = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.s6s);
        if (imageView3 != null) {
            imageView3.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(imageView3.getContext(), com.p314xaae8f345.mm.R.raw.f79664x14f92eb, i65.a.d(imageView3.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560059a7)));
        }
        java.lang.String Fj = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Fj();
        boolean Bi = ((r40.i) ((tc.e) i95.n0.c(tc.e.class))).Bi();
        boolean z17 = ((r40.i) ((tc.e) i95.n0.c(tc.e.class))).wi() || ((r40.i) ((tc.e) i95.n0.c(tc.e.class))).Ai();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditPhotoPluginLayout", "previewBtnOnClick: desc=" + Fj + ", enableShowDescInSquare=" + Bi + ", enableShowDescInForward=" + z17);
        if (Fj.length() > 0) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            ((ke0.e) xVar).getClass();
            android.text.SpannableString i18 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context2, Fj);
            android.widget.TextView textView4 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.n8d);
            if (textView4 != null) {
                if (z17) {
                    textView4.setVisibility(0);
                    textView4.setText(i18);
                } else {
                    textView4.setVisibility(8);
                }
            }
            android.widget.TextView textView5 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.ebv);
            if (textView5 != null) {
                if (Bi) {
                    textView5.setVisibility(0);
                    textView5.setText(i18);
                } else {
                    textView5.setVisibility(8);
                }
            }
        } else {
            android.widget.TextView textView6 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.n8d);
            if (textView6 != null) {
                textView6.setVisibility(8);
            }
            android.widget.TextView textView7 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.ebv);
            if (textView7 != null) {
                textView7.setVisibility(8);
            }
        }
        android.widget.TextView textView8 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.s6t);
        android.widget.ImageView imageView4 = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.s6r);
        s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView4);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) w0Var).ek(null, textView8, imageView4);
        android.widget.ImageView imageView5 = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.e_e);
        android.widget.TextView textView9 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.fuv);
        android.widget.ImageView imageView6 = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f564832a85);
        s40.w0 w0Var2 = (s40.w0) i95.n0.c(s40.w0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView6);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) w0Var2).ek(imageView5, textView9, imageView6);
        textView.setOnClickListener(new dc2.h(iVar));
        iVar.setContentView(inflate);
        iVar.show();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/edit/FinderLiveFixRatioPhoneEditPluginLayout$setLiveEditLayout$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
