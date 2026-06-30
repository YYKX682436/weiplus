package xk3;

/* loaded from: classes8.dex */
public final class v extends xk3.i {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f536596i;

    public v(vk3.a aVar) {
        super(com.p314xaae8f345.mm.R.C30864xbddafb2a.bxn, aVar);
        this.f536596i = "MicroMsg.VideoMinusScreenRoundCornerConvert";
    }

    @Override // xk3.i, in5.r
    public void g(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf adapter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        super.g(recyclerView, adapter);
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String m75945x2fec8307;
        uk3.a item = (uk3.a) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.p(holder, item, i17, i18, z17, list);
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = item.f510057d;
        r45.lr4 v07 = c16601x7ed0e40c.v0();
        android.widget.TextView textView = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.jvj);
        android.widget.ImageView imageView = (android.widget.ImageView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.jvb);
        android.widget.ImageView imageView2 = (android.widget.ImageView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.jvc);
        boolean n17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n();
        yo0.i imageLoaderOption = this.f536574g;
        if (n17) {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            ya2.l lVar = ya2.l.f542035a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
            zy2.v8.c(lVar, imageView, (v07 == null || (m75945x2fec8307 = v07.m75945x2fec8307(5)) == null) ? "" : m75945x2fec8307, null, 4, null);
        } else {
            vo0.a aVar = vo0.e.f520001b;
            if (v07 == null || (str = v07.m75945x2fec8307(5)) == null) {
                str = "";
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
            aVar.c(str, imageView, imageLoaderOption);
        }
        wk3.a aVar2 = wk3.a.f528490a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
        if (v07 == null || (str2 = v07.m75945x2fec8307(0)) == null) {
            str2 = "";
        }
        textView.setText(aVar2.c(textView, str2, this.f536575h));
        mn2.g1 g1Var = mn2.g1.f411508a;
        boolean z18 = true;
        if (v07 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView2);
            int m75939xb282bd08 = v07.m75939xb282bd08(6);
            java.lang.String m75945x2fec83072 = v07.m75945x2fec8307(2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageLoaderOption, "imageLoaderOption");
            imageView2.setVisibility(8);
            android.graphics.drawable.Drawable drawable = imageView2.getDrawable();
            if (drawable != null) {
                drawable.setColorFilter(null);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MinusScreen.ViewUtils", "authType = " + m75939xb282bd08 + ", authIconUrl = " + m75945x2fec83072);
            imageView2.setVisibility(0);
            if (m75939xb282bd08 <= 0) {
                imageView2.setVisibility(8);
            } else if (m75939xb282bd08 == 1) {
                if (m75945x2fec83072 == null || m75945x2fec83072.length() == 0) {
                    imageView2.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(imageView2.getContext(), com.p314xaae8f345.mm.R.raw.f79909x77ca9e41, i65.a.d(imageView2.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77845x35e12880)));
                } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                    vo0.d e17 = g1Var.e();
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                    e17.c(ya2.l.f542035a.e(m75945x2fec83072, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e), imageView2, g1Var.h(mn2.f1.f411486d));
                } else {
                    vo0.e.f520001b.c(m75945x2fec83072, imageView2, imageLoaderOption);
                }
            } else if (m75939xb282bd08 == 2) {
                imageView2.setImageResource(com.p314xaae8f345.mm.R.raw.f79910x4f27281f);
            } else if (m75939xb282bd08 != 100) {
                imageView2.setVisibility(8);
            } else {
                imageView2.setVisibility(8);
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) holder.p(com.p314xaae8f345.mm.R.id.jve);
        c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f80268xcb3c4250);
        c22699x3dcdb352.m82040x7541828(holder.f374654e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
        if (v07.m75933x41a8a7f2(7)) {
            c22699x3dcdb352.setVisibility(8);
        } else {
            c22699x3dcdb352.setVisibility(0);
        }
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.jvi);
        int m75939xb282bd082 = c16601x7ed0e40c.v0().m75939xb282bd08(3);
        textView2.setText(o(m75939xb282bd082 / 60) + ':' + o(m75939xb282bd082 % 60));
        textView2.setVisibility(8);
        com.p314xaae8f345.mm.ui.C21405x85fc1ce0 c21405x85fc1ce0 = (com.p314xaae8f345.mm.ui.C21405x85fc1ce0) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.jvo);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.jvg);
        if (c16601x7ed0e40c.f66793x2262335f == 25) {
            c21405x85fc1ce0.setBackground(new android.graphics.drawable.ColorDrawable(-16777216));
            c21405x85fc1ce0.setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
            return;
        }
        if (c21405x85fc1ce0.getVisibility() == 8) {
            r45.yj4 yj4Var = new r45.yj4();
            try {
                yj4Var.mo11468x92b714fd(c16601x7ed0e40c.f66790x225a93cf);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f536596i, "MegaVideoFloatBallInfo parse fail", th6);
            }
            java.lang.String m75945x2fec83073 = yj4Var.m75945x2fec8307(10);
            if (m75945x2fec83073 == null) {
                m75945x2fec83073 = "";
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m75945x2fec83073)) {
                z18 = false;
            } else {
                c21405x85fc1ce0.setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
                c21405x85fc1ce0.setBackgroundColor(-16777216);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                    vo0.d e18 = g1Var.e();
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                    wo0.c b17 = e18.b(ya2.l.f542035a.e(m75945x2fec83073, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f), g1Var.h(mn2.f1.f411486d));
                    xk3.s sVar = new xk3.s(c21405x85fc1ce0);
                    b17.getClass();
                    b17.f529406d = sVar;
                    b17.c(c21405x85fc1ce0);
                } else {
                    vo0.e.f520001b.h(m75945x2fec83073, c21405x85fc1ce0, imageLoaderOption, new xk3.u(c21405x85fc1ce0));
                }
            }
            if (z18) {
                c21405x85fc1ce0.setVisibility(0);
                c22699x3dcdb3522.setVisibility(8);
                c22699x3dcdb352.setVisibility(0);
                return;
            }
        }
        c21405x85fc1ce0.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        c21405x85fc1ce0.setBackground(null);
    }

    @Override // xk3.i, in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
    }

    @Override // xk3.i
    public java.lang.String n(android.content.Context context, uk3.a item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = item.f510057d;
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16601x7ed0e40c.v0().m75945x2fec8307(0)) ? context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gvh) : c16601x7ed0e40c.v0().m75945x2fec8307(0);
    }

    @Override // xk3.i
    public void q(android.graphics.Bitmap bitmap, android.widget.ImageView imgView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imgView, "imgView");
        super.q(bitmap, imgView);
        pm0.v.X(new xk3.q(bitmap, imgView));
    }
}
