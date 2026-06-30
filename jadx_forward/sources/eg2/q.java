package eg2;

/* loaded from: classes3.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eg2.x f334147d;

    public q(eg2.x xVar) {
        this.f334147d = xVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/cover/FinderCoverPreviewBtnPlugin$onAttach$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderCoverPreviewBtnPlugin", "preview button clicked");
        eg2.x xVar = this.f334147d;
        android.content.Context context = xVar.f334078e.getContext();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            yz5.a aVar = xVar.f334079f.f442887i;
            android.graphics.Bitmap bitmap = aVar != null ? (android.graphics.Bitmap) aVar.mo152xb9724478() : null;
            if (bitmap == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FinderCoverPreviewBtnPlugin", "onPreviewClicked: bitmap is null");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderCoverPreviewBtnPlugin", "showPreviewHalfScreen: bitmap=" + bitmap.getWidth() + 'x' + bitmap.getHeight());
                y9.i iVar = new y9.i(activity, com.p314xaae8f345.mm.R.C30868x68b1db1.f81563do);
                android.view.View inflate = android.view.View.inflate(activity, com.p314xaae8f345.mm.R.C30864xbddafb2a.bqs, null);
                android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.hrq);
                android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    marginLayoutParams.bottomMargin = i65.a.b(activity, 64) + com.p314xaae8f345.mm.ui.bl.c(activity);
                }
                com.p314xaae8f345.mm.ui.fk.a(textView);
                textView.setOnClickListener(new eg2.v(iVar));
                ((android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.nby)).setImageBitmap(bitmap);
                ((android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.nfs)).setImageBitmap(bitmap);
                android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.nc9);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
                com.p314xaae8f345.mm.ui.fk.a((android.widget.TextView) findViewById);
                android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.nft);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
                com.p314xaae8f345.mm.ui.fk.a((android.widget.TextView) findViewById2);
                android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.s6s);
                if (imageView != null) {
                    imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(imageView.getContext(), com.p314xaae8f345.mm.R.raw.f79664x14f92eb, i65.a.d(imageView.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560059a7)));
                }
                s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
                android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.s6t);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
                android.view.View findViewById4 = inflate.findViewById(com.p314xaae8f345.mm.R.id.s6r);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
                com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4 v4Var = (com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) w0Var;
                v4Var.ek(null, (android.widget.TextView) findViewById3, (android.widget.ImageView) findViewById4);
                android.widget.ImageView imageView2 = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.e_e);
                android.view.View findViewById5 = inflate.findViewById(com.p314xaae8f345.mm.R.id.fuv);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
                android.view.View findViewById6 = inflate.findViewById(com.p314xaae8f345.mm.R.id.f564832a85);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
                v4Var.ek(imageView2, (android.widget.TextView) findViewById5, (android.widget.ImageView) findViewById6);
                s40.w0 w0Var2 = (s40.w0) i95.n0.c(s40.w0.class);
                tc.e eVar = (tc.e) i95.n0.c(tc.e.class);
                java.lang.String Fj = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) w0Var2).Fj();
                r40.i iVar2 = (r40.i) eVar;
                boolean Bi = iVar2.Bi();
                boolean z17 = iVar2.wi() || iVar2.Ai();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderCoverPreviewBtnPlugin", "bindDescription: desc=" + Fj + ", showInSquare=" + Bi + ", showInForward=" + z17);
                android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.n8d);
                android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.ebv);
                if (Fj.length() > 0) {
                    le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                    android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    ((ke0.e) xVar2).getClass();
                    android.text.SpannableString i17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context2, Fj);
                    if (textView2 != null) {
                        textView2.setVisibility(z17 ? 0 : 8);
                        textView2.setText(i17);
                    }
                    if (textView3 != null) {
                        textView3.setVisibility(Bi ? 0 : 8);
                        textView3.setText(i17);
                    }
                } else {
                    if (textView2 != null) {
                        textView2.setVisibility(8);
                    }
                    if (textView3 != null) {
                        textView3.setVisibility(8);
                    }
                }
                iVar.setContentView(inflate);
                iVar.show();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/cover/FinderCoverPreviewBtnPlugin$onAttach$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
