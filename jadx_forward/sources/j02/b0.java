package j02;

/* loaded from: classes8.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.ui.ActivityC13235x6e95dd9a f378511d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f378512e;

    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.ui.ActivityC13235x6e95dd9a activityC13235x6e95dd9a, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f378511d = activityC13235x6e95dd9a;
        this.f378512e = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jz5.l lVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13216xc6166eab c13216xc6166eab = (com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13216xc6166eab) this.f378512e.f391656d;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.ui.ActivityC13235x6e95dd9a.f178753m;
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.ui.ActivityC13235x6e95dd9a activityC13235x6e95dd9a = this.f378511d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(activityC13235x6e95dd9a.mo55332x76847179(), 0, 0, false, false);
        z2Var.l(new j02.d0(activityC13235x6e95dd9a, c13216xc6166eab));
        b02.a W6 = activityC13235x6e95dd9a.W6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(W6, "<get-binding>(...)");
        W6.f98347m.setText(c13216xc6166eab.f178467h.f178448d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13215x104b3cc8 c13215x104b3cc8 = c13216xc6166eab.f178467h;
        java.lang.String str = c13215x104b3cc8.f178449e;
        if (str == null) {
            str = "";
        }
        vo0.a aVar = vo0.e.f520001b;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d ivCloudAppIcon = W6.f98344j;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ivCloudAppIcon, "ivCloudAppIcon");
        yo0.f fVar = new yo0.f();
        fVar.f545611b = true;
        fVar.f545610a = true;
        aVar.c(str, ivCloudAppIcon, fVar.a());
        int i18 = c13216xc6166eab.f178466g;
        android.widget.TextView textView = W6.f98350p;
        if (i18 == 2) {
            textView.setText(activityC13235x6e95dd9a.getText(com.p314xaae8f345.mm.R.C30867xcad56011.m_1));
        } else {
            textView.setText(activityC13235x6e95dd9a.getText(com.p314xaae8f345.mm.R.C30867xcad56011.m_2));
        }
        java.lang.CharSequence text = activityC13235x6e95dd9a.getText(com.p314xaae8f345.mm.R.C30867xcad56011.m9x);
        android.widget.Button button = W6.f98337c;
        button.setText(text);
        android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = com.p314xaae8f345.mm.ui.zk.a(activityC13235x6e95dd9a.mo55332x76847179(), 40);
        textView.setLayoutParams(marginLayoutParams);
        button.setOnClickListener(new j02.g(activityC13235x6e95dd9a, c13216xc6166eab, z2Var));
        j02.h hVar = new j02.h(activityC13235x6e95dd9a, c13216xc6166eab, z2Var);
        android.widget.ImageView imageView = W6.f98343i;
        imageView.setOnClickListener(hVar);
        android.graphics.drawable.Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            com.p314xaae8f345.mm.ui.uk.f(drawable, com.p314xaae8f345.mm.ui.bk.C() ? b3.l.m9702x7444d5ad(activityC13235x6e95dd9a, com.p314xaae8f345.mm.R.C30859x5a72f63.aaz) : b3.l.m9702x7444d5ad(activityC13235x6e95dd9a, com.p314xaae8f345.mm.R.C30859x5a72f63.f560249f7));
            imageView.setImageDrawable(drawable);
        }
        j02.i iVar = new j02.i(W6);
        android.widget.Button button2 = W6.f98336b;
        button2.post(iVar);
        java.lang.String str2 = c13216xc6166eab.f178463d;
        boolean z17 = !(str2 == null || str2.length() == 0);
        android.widget.TextView textView2 = W6.f98348n;
        android.widget.LinearLayout linearLayout = W6.f98339e;
        android.widget.TextView textView3 = W6.f98349o;
        if (z17) {
            imageView.setVisibility(8);
            textView3.setText(activityC13235x6e95dd9a.getText(com.p314xaae8f345.mm.R.C30867xcad56011.m9z));
            textView3.setTextSize(15.0f);
            textView3.setTextColor(activityC13235x6e95dd9a.mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
            textView2.setVisibility(8);
            W6.f98341g.setVisibility(8);
            button2.setVisibility(8);
            button.setVisibility(8);
            linearLayout.setVisibility(0);
            W6.f98340f.setOnClickListener(new j02.j(activityC13235x6e95dd9a, c13216xc6166eab, z2Var));
            W6.f98338d.setOnClickListener(new j02.k(activityC13235x6e95dd9a, c13216xc6166eab, z2Var));
        } else {
            linearLayout.setVisibility(8);
            textView3.setText(java.lang.String.valueOf(c13215x104b3cc8.f178452h));
            textView2.setText(java.lang.String.valueOf(c13215x104b3cc8.f178454m));
            W6.f98352r.setOnClickListener(new j02.l(activityC13235x6e95dd9a, c13216xc6166eab));
            W6.f98351q.setOnClickListener(new j02.m(activityC13235x6e95dd9a, c13216xc6166eab));
            W6.f98346l.setOnClickListener(new j02.n(activityC13235x6e95dd9a, c13216xc6166eab));
            java.lang.String str3 = c13215x104b3cc8.f178450f;
            if (str3 == null || str3.length() == 0) {
                lVar = new jz5.l(java.lang.Boolean.FALSE, null);
            } else {
                h02.a d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.d(str3);
                if (d17 == null) {
                    lVar = new jz5.l(java.lang.Boolean.FALSE, null);
                } else {
                    lVar = com.p314xaae8f345.mm.vfs.w6.j(d17.f68419xf1e9b966) ? new jz5.l(java.lang.Boolean.TRUE, d17) : new jz5.l(java.lang.Boolean.FALSE, d17);
                }
            }
            boolean booleanValue = ((java.lang.Boolean) lVar.f384366d).booleanValue();
            h02.a aVar2 = (h02.a) lVar.f384367e;
            W6.f98342h.setOnClickListener(new j02.o(W6));
            if (booleanValue) {
                button2.setText(activityC13235x6e95dd9a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.flg));
            } else {
                if (aVar2 != null) {
                    int i19 = aVar2.f68441x10a0fed7;
                    if (1 <= i19 && i19 < 4) {
                        long j17 = aVar2.f68408x32b20428;
                        activityC13235x6e95dd9a.f178756f = j17;
                        ((j02.a0) activityC13235x6e95dd9a.f178759i).Z(i19, j17);
                    }
                }
                float f17 = ((float) c13215x104b3cc8.f178458q) / 1048576;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(activityC13235x6e95dd9a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.flz));
                java.lang.String format = java.lang.String.format("(%.1fMB)", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(f17)}, 1));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                sb6.append(format);
                button2.setText(sb6.toString());
            }
            button2.setOnClickListener(new j02.f(booleanValue, aVar2, c13216xc6166eab, activityC13235x6e95dd9a));
        }
        z2Var.k(activityC13235x6e95dd9a.W6().f98335a, 0, 0);
        z2Var.C();
        k02.s.f384635a.c(1L, c13216xc6166eab.f178464e, c13215x104b3cc8.f178450f, c13216xc6166eab.f178465f);
    }
}
