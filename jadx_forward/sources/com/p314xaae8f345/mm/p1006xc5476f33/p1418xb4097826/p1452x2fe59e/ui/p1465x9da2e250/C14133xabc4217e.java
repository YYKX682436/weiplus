package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/fragment/FinderCommentShareDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.fragment.FinderCommentShareDialogFragment */
/* loaded from: classes10.dex */
public final class C14133xabc4217e extends p012xc85e97e9.p087x9da2e250.app.DialogInterfaceOnCancelListenerC1100xc25047d8 {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f191567n = 0;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f191568d;

    /* renamed from: e, reason: collision with root package name */
    public final long f191569e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 f191570f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 f191571g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f191572h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.ViewGroup f191573i;

    /* renamed from: m, reason: collision with root package name */
    public o25.y1 f191574m;

    public C14133xabc4217e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, long j17, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b87, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b872, byte[] qrBytes) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(qrBytes, "qrBytes");
        this.f191568d = feed;
        this.f191569e = j17;
        this.f191570f = c19781xd1c47b87;
        this.f191571g = c19781xd1c47b872;
        this.f191572h = qrBytes;
    }

    public static final void l0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14133xabc4217e c14133xabc4217e, android.view.View view, int i17, int i18) {
        int b17 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e8.f183664a.b(c14133xabc4217e.mo7438x76847179()) - i17) - com.p314xaae8f345.mm.ui.bl.h(c14133xabc4217e.mo7438x76847179());
        android.content.res.Resources resources = view.getContext().getResources();
        int dimensionPixelOffset = b17 - (resources != null ? resources.getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561186br) : 0);
        float f17 = 1.0f;
        if (i17 != 0) {
            float f18 = i18 != 0 ? dimensionPixelOffset / i18 : 1.0f;
            if (f18 <= 1.0f) {
                f17 = f18;
            }
        } else {
            f17 = 1.0f - ((view.getContext().getResources() != null ? r6.getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561196c1) : 0) / r0.c(null));
        }
        view.setScaleX(f17);
        view.setScaleY(f17);
        view.setTranslationY(((-view.getMeasuredHeight()) * (1 - f17)) / 2);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.DialogInterfaceOnCancelListenerC1100xc25047d8
    /* renamed from: getTheme */
    public int mo7395x75311c13() {
        return com.p314xaae8f345.mm.R.C30868x68b1db1.f575833jb;
    }

    public final java.lang.String m0(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String concat;
        java.lang.String str3;
        java.lang.String m76621x69c6028b;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String m76585x66e287ae = c19788xd7cfd73e != null ? c19788xd7cfd73e.m76585x66e287ae() : null;
        java.lang.String str6 = "";
        if (m76585x66e287ae == null || m76585x66e287ae.length() == 0) {
            if (c19788xd7cfd73e == null || (str4 = c19788xd7cfd73e.m76623xd93f812f()) == null) {
                str4 = "";
            }
            if (c19788xd7cfd73e == null || (str5 = c19788xd7cfd73e.m76624x4c9b7dca()) == null) {
                str5 = "";
            }
            concat = str4.concat(str5);
        } else {
            if (c19788xd7cfd73e == null || (str = c19788xd7cfd73e.m76585x66e287ae()) == null) {
                str = "";
            }
            if (c19788xd7cfd73e == null || (str2 = c19788xd7cfd73e.m76587x815afa6b()) == null) {
                str2 = "";
            }
            concat = str.concat(str2);
        }
        java.lang.String m76620xac4ea651 = c19788xd7cfd73e != null ? c19788xd7cfd73e.m76620xac4ea651() : null;
        if (m76620xac4ea651 == null || m76620xac4ea651.length() == 0) {
            return concat;
        }
        if (c19788xd7cfd73e == null || (str3 = c19788xd7cfd73e.m76620xac4ea651()) == null) {
            str3 = "";
        }
        if (c19788xd7cfd73e != null && (m76621x69c6028b = c19788xd7cfd73e.m76621x69c6028b()) != null) {
            str6 = m76621x69c6028b;
        }
        return str3.concat(str6);
    }

    public final com.p314xaae8f345.mm.p954x7e3e6bb0.C11126xa77ef256 n0() {
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        android.net.Uri.Builder buildUpon = android.net.Uri.parse("https://weixin.qq.com/findercomment").buildUpon();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(buildUpon, "buildUpon(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f191568d;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = abstractC14490x69736cb5.getFeedObject().getFeedObject().m76802x2dd01666();
        java.lang.String m07 = m0((m76802x2dd01666 == null || (m76962x74cd162e = m76802x2dd01666.m76962x74cd162e()) == null) ? null : (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) kz5.n0.Z(m76962x74cd162e));
        java.lang.String format = java.lang.String.format("0x%08X", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(o45.wf.f424562g)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        android.net.Uri.Builder appendQueryParameter = buildUpon.appendQueryParameter("version", format).appendQueryParameter("feedid", pm0.v.u(abstractC14490x69736cb5.getFeedObject().m59251x5db1b11())).appendQueryParameter("nonceid", abstractC14490x69736cb5.getFeedObject().m59276x6c285d75()).appendQueryParameter("commentid", pm0.v.u(this.f191569e)).appendQueryParameter("forbidShowSource", "0");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016662 = abstractC14490x69736cb5.getFeedObject().getFeedObject().m76802x2dd01666();
        android.net.Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, m76802x2dd016662 != null ? m76802x2dd016662.m76944x730bcac6() : null).appendQueryParameter("cover", m07);
        ya2.b2 contact = abstractC14490x69736cb5.getContact();
        appendQueryParameter2.appendQueryParameter("nickname", contact != null ? contact.w0() : null);
        java.lang.String builder = buildUpon.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(builder, "toString(...)");
        return new com.p314xaae8f345.mm.p954x7e3e6bb0.C11126xa77ef256(builder, 10);
    }

    public final java.util.Map o0(int i17, java.lang.String str, int i18) {
        jz5.l lVar = new jz5.l("result", java.lang.Integer.valueOf(i17));
        jz5.l lVar2 = new jz5.l("share_to_username", str);
        jz5.l lVar3 = new jz5.l("share_dst_scene", java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f191568d;
        return kz5.c1.k(lVar, lVar2, lVar3, new jz5.l("feed_id", pm0.v.u(abstractC14490x69736cb5.mo2128x1ed62e84())), new jz5.l("comment_id", pm0.v.u(this.f191569e)), new jz5.l("session_buffer", abstractC14490x69736cb5.g0()));
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreateView */
    public android.view.View mo7503x18bad100(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inflater, "inflater");
        android.view.View inflate = inflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e6c, (android.view.ViewGroup) null);
        android.view.ViewGroup viewGroup2 = inflate instanceof android.view.ViewGroup ? (android.view.ViewGroup) inflate : null;
        android.app.Dialog m7393x15b1203e = m7393x15b1203e();
        if (m7393x15b1203e != null) {
            m7393x15b1203e.requestWindowFeature(1);
        }
        this.f191573i = viewGroup2;
        return viewGroup2;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.DialogInterfaceOnCancelListenerC1100xc25047d8, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onStart */
    public void mo7405xb05099c3() {
        android.view.Window window;
        super.mo7405xb05099c3();
        android.app.Dialog m7393x15b1203e = m7393x15b1203e();
        if (m7393x15b1203e == null || (window = m7393x15b1203e.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onViewCreated */
    public void mo7518x594b1124(android.view.View view, android.os.Bundle bundle) {
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        android.view.Window window;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        super.mo7518x594b1124(view, bundle);
        android.view.ViewGroup viewGroup = this.f191573i;
        if (viewGroup == null) {
            return;
        }
        android.view.View findViewById = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.swx);
        android.app.Dialog m7393x15b1203e = m7393x15b1203e();
        boolean z17 = true;
        if (m7393x15b1203e != null) {
            m7393x15b1203e.setCanceledOnTouchOutside(true);
        }
        android.app.Dialog m7393x15b1203e2 = m7393x15b1203e();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e = null;
        android.view.WindowManager.LayoutParams attributes = (m7393x15b1203e2 == null || (window = m7393x15b1203e2.getWindow()) == null) ? null : window.getAttributes();
        if (attributes != null) {
            attributes.windowAnimations = com.p314xaae8f345.mm.R.C30868x68b1db1.f575632e6;
        }
        ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
        this.f191574m = new com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m();
        android.content.Context mo7438x76847179 = mo7438x76847179();
        if (mo7438x76847179 == null) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(mo7438x76847179, 0, true);
        android.view.Window d17 = k0Var.d();
        if (d17 != null) {
            d17.setDimAmount(0.0f);
        }
        k0Var.f293405n = new hd2.e(k0Var, mo7438x76847179);
        k0Var.f293407o = new hd2.f(mo7438x76847179);
        k0Var.f293414s = new hd2.g(this, findViewById);
        k0Var.f293417v = new hd2.h(this, findViewById);
        k0Var.f293387d = new hd2.i(this);
        k0Var.f293409p = new hd2.j(this, mo7438x76847179, k0Var);
        k0Var.f293418w = new hd2.l(this, findViewById);
        view.post(new hd2.m(k0Var));
        android.view.View findViewById2 = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.swv);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        p0(this.f191570f, (android.view.ViewGroup) findViewById2);
        android.view.View findViewById3 = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.sww);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        p0(this.f191571g, (android.view.ViewGroup) findViewById3);
        android.view.View findViewById4 = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.swt);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) findViewById4;
        android.widget.ImageView imageView = (android.widget.ImageView) viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.swr);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.sws);
        android.widget.TextView textView = (android.widget.TextView) viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.swy);
        android.widget.ImageView imageView2 = (android.widget.ImageView) viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.ehq);
        dq4.c cVar = dq4.c.f323902a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView2);
        cVar.f(imageView2);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context mo7438x768471792 = mo7438x76847179();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f191568d;
        java.lang.String m59273x80025a04 = abstractC14490x69736cb5.getFeedObject().m59273x80025a04();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(mo7438x768471792, m59273x80025a04));
        viewGroup2.getContext();
        float f17 = 400;
        textView.setTextSize(1, (j65.f.g() * 15.0f) / f17);
        le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context mo7438x768471793 = mo7438x76847179();
        android.text.SpannableString descriptionSpan = abstractC14490x69736cb5.getFeedObject().getDescriptionSpan();
        ((ke0.e) xVar2).getClass();
        c22624x85d69039.b(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(mo7438x768471793, descriptionSpan));
        viewGroup2.getContext();
        c22624x85d69039.l(1, (15.0f * j65.f.g()) / f17);
        java.lang.CharSequence a17 = c22624x85d69039.a();
        if (a17 != null && a17.length() != 0) {
            z17 = false;
        }
        if (z17) {
            c22624x85d69039.setVisibility(8);
        } else {
            c22624x85d69039.setVisibility(0);
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = abstractC14490x69736cb5.getFeedObject().getFeedObject().m76802x2dd01666();
        if (m76802x2dd01666 != null && (m76962x74cd162e = m76802x2dd01666.m76962x74cd162e()) != null) {
            c19788xd7cfd73e = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) kz5.n0.Z(m76962x74cd162e);
        }
        wo0.c a18 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb()).a(new mn2.q3(m0(c19788xd7cfd73e), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
        ((wo0.b) a18).b(imageView, false);
        ((android.widget.ImageView) viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.swz)).setImageBitmap(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.G(this.f191572h));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderCommentShareDialogFragment", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderCommentShareDialogFragment", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        k0Var.f293389e = new hd2.o(findViewById, this, k0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x06dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p0(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 r41, android.view.ViewGroup r42) {
        /*
            Method dump skipped, instructions count: 1818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14133xabc4217e.p0(com.tencent.mm.protocal.protobuf.FinderCommentInfo, android.view.ViewGroup):void");
    }
}
