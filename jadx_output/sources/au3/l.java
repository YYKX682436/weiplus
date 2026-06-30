package au3;

/* loaded from: classes10.dex */
public final class l implements android.view.View.OnClickListener, com.tencent.mm.plugin.mmsight.segment.h, yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f14111d;

    /* renamed from: e, reason: collision with root package name */
    public final ju3.d0 f14112e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f14113f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.recordvideo.plugin.cropvideo.EditVideoSeekBarView f14114g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.ViewGroup f14115h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ImageView f14116i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.ImageView f14117m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f14118n;

    /* renamed from: o, reason: collision with root package name */
    public ct0.b f14119o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider f14120p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f14121q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f14122r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f14123s;

    /* renamed from: t, reason: collision with root package name */
    public float f14124t;

    /* renamed from: u, reason: collision with root package name */
    public float f14125u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f14126v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f14127w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f14128x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f14129y;

    /* renamed from: z, reason: collision with root package name */
    public int f14130z;

    public l(android.view.ViewGroup parent, ju3.d0 status) {
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(status, "status");
        this.f14111d = parent;
        this.f14112e = status;
        android.view.View findViewById = parent.findViewById(com.tencent.mm.R.id.f484169d81);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById;
        this.f14113f = imageView;
        android.view.View findViewById2 = parent.findViewById(com.tencent.mm.R.id.f484168d80);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        com.tencent.mm.plugin.recordvideo.plugin.cropvideo.EditVideoSeekBarView editVideoSeekBarView = (com.tencent.mm.plugin.recordvideo.plugin.cropvideo.EditVideoSeekBarView) findViewById2;
        this.f14114g = editVideoSeekBarView;
        this.f14115h = (android.view.ViewGroup) parent.findViewById(com.tencent.mm.R.id.pqx);
        this.f14116i = (android.widget.ImageView) parent.findViewById(com.tencent.mm.R.id.f485414hl5);
        this.f14117m = (android.widget.ImageView) parent.findViewById(com.tencent.mm.R.id.hoi);
        this.f14118n = (android.widget.TextView) parent.findViewById(com.tencent.mm.R.id.omg);
        this.f14125u = 1.0f;
        this.f14126v = "";
        imageView.setImageDrawable(com.tencent.mm.ui.uk.e(parent.getContext(), com.tencent.mm.R.raw.icons_filled_crop, -1));
        imageView.setOnClickListener(this);
        com.tencent.mm.ui.a4.e(editVideoSeekBarView, false, false, 3, null);
        editVideoSeekBarView.setCancelButtonClickListener(this);
        editVideoSeekBarView.setFinishButtonClickListener(this);
        android.view.ViewGroup.LayoutParams layoutParams = editVideoSeekBarView.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.bottomMargin += com.tencent.mm.ui.bl.c(parent.getContext());
        editVideoSeekBarView.setLayoutParams(layoutParams2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        r7 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(boolean r17) {
        /*
            Method dump skipped, instructions count: 832
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: au3.l.a(boolean):void");
    }

    public final java.lang.String b(int i17) {
        android.view.ViewGroup viewGroup = this.f14111d;
        if (viewGroup.getContext() == null) {
            return "";
        }
        java.lang.String string = viewGroup.getContext().getString(i17);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    public final void c(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EditCropVideoPlugin", "[onClickFinder] fromBottomSheet:" + z17);
        nu3.m mVar = nu3.m.f340229a;
        mVar.l(3);
        mVar.i(3, 1L);
        android.content.Intent intent = new android.content.Intent();
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(4, 5, 44, intent);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        android.content.Context context = this.f14111d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        intent.putExtra("key_finder_sns_post_type", 3);
        intent.putExtra("key_finder_post_router", 6);
        intent.putExtra("key_finder_post_from", 6);
        intent.putExtra("key_finder_post_video_source", 1);
        intent.putExtra("key_form_sns", true);
        intent.putExtra("KEY_POST_DIRECTLY_FROM_SNS", true);
        ct0.b bVar = this.f14119o;
        java.lang.String str = null;
        if ((bVar != null ? bVar.f222204a : null) != null) {
            if (bVar != null) {
                str = bVar.f222204a;
            }
        } else if (bVar != null) {
            str = bVar.f222209f;
        }
        intent.putExtra("key_finder_post_sns_video_path", str);
        ct0.b bVar2 = this.f14119o;
        intent.putExtra("key_finder_post_sns_video_duration_ms", bVar2 != null ? bVar2.f222208e : 0);
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).gk(context, intent);
    }

    @Override // com.tencent.mm.plugin.mmsight.segment.h
    public void d(boolean z17, float f17, float f18) {
    }

    public final void e() {
        dw3.c cVar = dw3.c.f244181a;
        android.view.ViewGroup viewGroup = this.f14111d;
        android.content.Context context = viewGroup.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        boolean b17 = cVar.b(context, "com.tencent.phoenix", "A24DC0755072F64C480DC06DCD3412BF");
        this.f14122r = db5.e1.A(viewGroup.getContext(), b(b17 ? com.tencent.mm.R.string.f490414ub : com.tencent.mm.R.string.f490413ua), "", b(com.tencent.mm.R.string.f490507x1), b(com.tencent.mm.R.string.f490347sg), new au3.d(this, b17), new au3.e(this));
    }

    public final void f() {
        dw3.z0 z0Var = dw3.z0.f244296a;
        android.view.ViewGroup viewGroup = this.f14111d;
        android.content.Context context = viewGroup.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        boolean b17 = z0Var.b(context);
        nu3.i.f340218a.n("KEY_IS_CLICK_WESEE_BTN", 1);
        this.f14121q = db5.e1.A(viewGroup.getContext(), b(b17 ? com.tencent.mm.R.string.f490429us : com.tencent.mm.R.string.f490428uq), "", b(com.tencent.mm.R.string.f490507x1), b(com.tencent.mm.R.string.f490347sg), new au3.f(this, b17), new au3.g(b17, this));
    }

    public final void g() {
        android.view.ViewGroup viewGroup = this.f14115h;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        if (viewGroup != null) {
            viewGroup.setOnClickListener(this);
        }
        android.view.ViewGroup viewGroup2 = this.f14111d;
        android.widget.ImageView imageView = this.f14116i;
        if (imageView != null) {
            imageView.setImageDrawable(com.tencent.mm.ui.uk.e(viewGroup2.getContext(), com.tencent.mm.R.raw.icons_filled_wesee, -1));
        }
        android.widget.ImageView imageView2 = this.f14117m;
        if (imageView2 != null) {
            imageView2.setImageDrawable(com.tencent.mm.ui.uk.e(viewGroup2.getContext(), com.tencent.mm.R.raw.icons_filled_arrow, -1));
        }
        if (com.tencent.mm.ui.bk.u(viewGroup != null ? viewGroup.getContext() : null, false)) {
            android.view.ViewGroup.LayoutParams layoutParams = viewGroup != null ? viewGroup.getLayoutParams() : null;
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin += com.tencent.mm.ui.bk.p(viewGroup != null ? viewGroup.getContext() : null);
            if (viewGroup == null) {
                return;
            }
            viewGroup.setLayoutParams(marginLayoutParams);
        }
    }

    public final void h(float f17, float f18) {
        ct0.b bVar = this.f14119o;
        if (bVar != null) {
            float f19 = bVar.f222208e - bVar.f222207d;
            float f27 = (f18 - f17) * f19;
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = this.f14120p;
            kotlin.jvm.internal.o.d(recordConfigProvider);
            int i17 = recordConfigProvider.f155685w + 250;
            ct0.b bVar2 = this.f14119o;
            kotlin.jvm.internal.o.d(bVar2);
            int i18 = bVar2.f222208e;
            if (i17 > i18) {
                i17 = i18;
            }
            float f28 = f27 - i17;
            if (f28 < 0.0f) {
                f28 = 0.0f;
            }
            int i19 = ((int) f28) / 2;
            int round = java.lang.Math.round(f17 * f19) + i19;
            int round2 = java.lang.Math.round(f19 * f18) - i19;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("EDIT_CROP_VIDEO_LENGTH_START_TIME_INT", round);
            bundle.putInt("EDIT_CROP_VIDEO_LENGTH_END_TIME_INT", round2);
            this.f14112e.w(ju3.c0.f301916y0, bundle);
        }
    }

    @Override // com.tencent.mm.plugin.mmsight.segment.h
    public void j(boolean z17, float f17, float f18) {
        this.f14114g.announceForAccessibility(i65.a.r(this.f14111d.getContext(), z17 ? com.tencent.mm.R.string.f489967gw : com.tencent.mm.R.string.f489968gx));
        ju3.d0.k(this.f14112e, ju3.c0.f301895p1, null, 2, null);
    }

    @Override // yt3.r2
    public boolean onBackPress() {
        android.view.ViewGroup viewGroup = this.f14115h;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        com.tencent.mm.plugin.recordvideo.plugin.cropvideo.EditVideoSeekBarView editVideoSeekBarView = this.f14114g;
        if (editVideoSeekBarView.getVisibility() != 0) {
            return false;
        }
        ju3.d0.k(this.f14112e, ju3.c0.f301917y1, null, 2, null);
        editVideoSeekBarView.animate().alpha(0.0f).setDuration(100L).setListener(new au3.a(this));
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/cropvideo/EditCropVideoPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        android.view.ViewGroup viewGroup = this.f14115h;
        ju3.d0 d0Var = this.f14112e;
        com.tencent.mm.plugin.recordvideo.plugin.cropvideo.EditVideoSeekBarView editVideoSeekBarView = this.f14114g;
        if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.d6s) {
            com.tencent.mm.plugin.mmsight.segment.SliderSeekBar sliderSeekBar = editVideoSeekBarView.recyclerThumbSeekBar.f148881p;
            if (sliderSeekBar != null) {
                sliderSeekBar.d();
            }
            ju3.d0.k(d0Var, ju3.c0.f301917y1, null, 2, null);
            editVideoSeekBarView.animate().alpha(0.0f).setDuration(100L).setListener(new au3.b(this));
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.d6w) {
            h(this.f14124t, this.f14125u);
            ju3.d0.k(d0Var, ju3.c0.f301920z1, null, 2, null);
            if (!this.f14123s) {
                editVideoSeekBarView.animate().alpha(0.0f).setDuration(100L).setListener(new au3.c(this));
            }
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            ct0.b bVar = this.f14119o;
            if (bVar != null) {
                float f17 = bVar.f222208e - bVar.f222207d;
                nu3.i.f340218a.n("KEY_VIDEO_CROP_DURATION_MS_INT", java.lang.Integer.valueOf((int) ((this.f14125u - this.f14124t) * f17)));
                nu3.m mVar = nu3.m.f340229a;
                long j17 = this.f14124t * f17;
                com.tencent.mars.xlog.Log.i("MicroMsg.VideoWidgetReporter", "setCropVideoStartTime >> " + j17);
                nu3.m.f340230b.N = j17;
                long j18 = (long) (f17 * this.f14125u);
                com.tencent.mars.xlog.Log.i("MicroMsg.VideoWidgetReporter", "setCropVideoEndTime >> " + j18);
                nu3.m.f340230b.O = j18;
            }
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.f484169d81) {
            a(false);
            nu3.i.c(nu3.i.f340218a, "KEY_CLICK_VIDEO_CROP_COUNT_INT", 0, 2, null);
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.pqx) {
            if (!com.tencent.mm.sdk.platformtools.f9.MomentChannels.k(view.getContext(), null)) {
                yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/cropvideo/EditCropVideoPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            if (this.f14130z >= 2) {
                nu3.i iVar = nu3.i.f340218a;
                com.tencent.mm.autogen.mmdata.rpt.SnsChoosePostBussinessReportStruct snsChoosePostBussinessReportStruct = new com.tencent.mm.autogen.mmdata.rpt.SnsChoosePostBussinessReportStruct();
                snsChoosePostBussinessReportStruct.f60471e = 1L;
                snsChoosePostBussinessReportStruct.f60470d = snsChoosePostBussinessReportStruct.b("sessionid", nu3.i.f340227j, true);
                snsChoosePostBussinessReportStruct.k();
                kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
                c0Var.f310112d = true;
                com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(this.f14111d.getContext(), 1, true);
                k0Var.f211872n = new au3.h(k0Var, this);
                k0Var.f211881s = new au3.i(c0Var, this, k0Var);
                k0Var.f211854d = new au3.j(c0Var);
                k0Var.v();
            } else if (this.f14127w) {
                c(false);
                nu3.i.f340218a.j(1L);
            } else if (this.f14128x) {
                f();
            } else if (this.f14129y) {
                e();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/cropvideo/EditCropVideoPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.plugin.mmsight.segment.h
    public void p(boolean z17, float f17, float f18) {
        this.f14124t = f17;
        this.f14125u = f18;
        h(f17, f18);
        ct0.b bVar = this.f14119o;
        if (bVar != null) {
            int i17 = bVar.f222208e - bVar.f222207d;
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Float.valueOf(z17 ? (f17 * i17) / 1000 : (f18 * i17) / 1000);
            java.lang.String format = java.lang.String.format("%.2f", java.util.Arrays.copyOf(objArr, 1));
            kotlin.jvm.internal.o.f(format, "format(...)");
            java.lang.String r17 = i65.a.r(this.f14111d.getContext(), com.tencent.mm.R.string.f489975h4);
            kotlin.jvm.internal.o.f(r17, "getString(...)");
            java.lang.String format2 = java.lang.String.format(r17, java.util.Arrays.copyOf(new java.lang.Object[]{format}, 1));
            kotlin.jvm.internal.o.f(format2, "format(...)");
            this.f14114g.announceForAccessibility(format2);
        }
    }

    @Override // yt3.r2
    public void release() {
        this.f14114g.b();
        com.tencent.mm.ui.widget.dialog.j0 j0Var = this.f14121q;
        if (j0Var != null) {
            kotlin.jvm.internal.o.e(j0Var, "null cannot be cast to non-null type android.app.Dialog");
            if (j0Var.isShowing()) {
                com.tencent.mm.ui.widget.dialog.j0 j0Var2 = this.f14121q;
                if (j0Var2 != null) {
                    j0Var2.dismiss();
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.EditCropVideoPlugin", "release dismiss dialog");
            }
        }
    }

    @Override // yt3.r2
    public void reset() {
        this.f14126v = "";
        this.f14114g.b();
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        this.f14113f.setVisibility(i17);
    }

    @Override // com.tencent.mm.plugin.mmsight.segment.h
    public void u(float f17, float f18) {
        this.f14124t = f17;
        this.f14125u = f18;
        h(f17, f18);
    }
}
