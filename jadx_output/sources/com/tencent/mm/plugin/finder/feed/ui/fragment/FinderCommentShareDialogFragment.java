package com.tencent.mm.plugin.finder.feed.ui.fragment;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/fragment/FinderCommentShareDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderCommentShareDialogFragment extends androidx.fragment.app.DialogFragment {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f110034n = 0;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.model.BaseFinderFeed f110035d;

    /* renamed from: e, reason: collision with root package name */
    public final long f110036e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.protocal.protobuf.FinderCommentInfo f110037f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.protocal.protobuf.FinderCommentInfo f110038g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f110039h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.ViewGroup f110040i;

    /* renamed from: m, reason: collision with root package name */
    public o25.y1 f110041m;

    public FinderCommentShareDialogFragment(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, long j17, com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo, com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo2, byte[] qrBytes) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(qrBytes, "qrBytes");
        this.f110035d = feed;
        this.f110036e = j17;
        this.f110037f = finderCommentInfo;
        this.f110038g = finderCommentInfo2;
        this.f110039h = qrBytes;
    }

    public static final void l0(com.tencent.mm.plugin.finder.feed.ui.fragment.FinderCommentShareDialogFragment finderCommentShareDialogFragment, android.view.View view, int i17, int i18) {
        int b17 = (com.tencent.mm.plugin.finder.assist.e8.f102131a.b(finderCommentShareDialogFragment.getContext()) - i17) - com.tencent.mm.ui.bl.h(finderCommentShareDialogFragment.getContext());
        android.content.res.Resources resources = view.getContext().getResources();
        int dimensionPixelOffset = b17 - (resources != null ? resources.getDimensionPixelOffset(com.tencent.mm.R.dimen.f479653br) : 0);
        float f17 = 1.0f;
        if (i17 != 0) {
            float f18 = i18 != 0 ? dimensionPixelOffset / i18 : 1.0f;
            if (f18 <= 1.0f) {
                f17 = f18;
            }
        } else {
            f17 = 1.0f - ((view.getContext().getResources() != null ? r6.getDimensionPixelOffset(com.tencent.mm.R.dimen.f479663c1) : 0) / r0.c(null));
        }
        view.setScaleX(f17);
        view.setScaleY(f17);
        view.setTranslationY(((-view.getMeasuredHeight()) * (1 - f17)) / 2);
    }

    @Override // androidx.fragment.app.DialogFragment
    public int getTheme() {
        return com.tencent.mm.R.style.f494300jb;
    }

    public final java.lang.String m0(com.tencent.mm.protocal.protobuf.FinderMedia finderMedia) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String concat;
        java.lang.String str3;
        java.lang.String share_cover_url_token;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String coverUrl = finderMedia != null ? finderMedia.getCoverUrl() : null;
        java.lang.String str6 = "";
        if (coverUrl == null || coverUrl.length() == 0) {
            if (finderMedia == null || (str4 = finderMedia.getThumbUrl()) == null) {
                str4 = "";
            }
            if (finderMedia == null || (str5 = finderMedia.getThumb_url_token()) == null) {
                str5 = "";
            }
            concat = str4.concat(str5);
        } else {
            if (finderMedia == null || (str = finderMedia.getCoverUrl()) == null) {
                str = "";
            }
            if (finderMedia == null || (str2 = finderMedia.getCover_url_token()) == null) {
                str2 = "";
            }
            concat = str.concat(str2);
        }
        java.lang.String share_cover_url = finderMedia != null ? finderMedia.getShare_cover_url() : null;
        if (share_cover_url == null || share_cover_url.length() == 0) {
            return concat;
        }
        if (finderMedia == null || (str3 = finderMedia.getShare_cover_url()) == null) {
            str3 = "";
        }
        if (finderMedia != null && (share_cover_url_token = finderMedia.getShare_cover_url_token()) != null) {
            str6 = share_cover_url_token;
        }
        return str3.concat(str6);
    }

    public final com.tencent.mm.modelmulti.SourceImgInfo n0() {
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        android.net.Uri.Builder buildUpon = android.net.Uri.parse("https://weixin.qq.com/findercomment").buildUpon();
        kotlin.jvm.internal.o.f(buildUpon, "buildUpon(...)");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f110035d;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = baseFinderFeed.getFeedObject().getFeedObject().getObjectDesc();
        java.lang.String m07 = m0((objectDesc == null || (media = objectDesc.getMedia()) == null) ? null : (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media));
        java.lang.String format = java.lang.String.format("0x%08X", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(o45.wf.f343029g)}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        android.net.Uri.Builder appendQueryParameter = buildUpon.appendQueryParameter("version", format).appendQueryParameter("feedid", pm0.v.u(baseFinderFeed.getFeedObject().getId())).appendQueryParameter("nonceid", baseFinderFeed.getFeedObject().getObjectNonceId()).appendQueryParameter("commentid", pm0.v.u(this.f110036e)).appendQueryParameter("forbidShowSource", "0");
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2 = baseFinderFeed.getFeedObject().getFeedObject().getObjectDesc();
        android.net.Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, objectDesc2 != null ? objectDesc2.getDescription() : null).appendQueryParameter("cover", m07);
        ya2.b2 contact = baseFinderFeed.getContact();
        appendQueryParameter2.appendQueryParameter("nickname", contact != null ? contact.w0() : null);
        java.lang.String builder = buildUpon.toString();
        kotlin.jvm.internal.o.f(builder, "toString(...)");
        return new com.tencent.mm.modelmulti.SourceImgInfo(builder, 10);
    }

    public final java.util.Map o0(int i17, java.lang.String str, int i18) {
        jz5.l lVar = new jz5.l("result", java.lang.Integer.valueOf(i17));
        jz5.l lVar2 = new jz5.l("share_to_username", str);
        jz5.l lVar3 = new jz5.l("share_dst_scene", java.lang.Integer.valueOf(i18));
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f110035d;
        return kz5.c1.k(lVar, lVar2, lVar3, new jz5.l("feed_id", pm0.v.u(baseFinderFeed.getItemId())), new jz5.l("comment_id", pm0.v.u(this.f110036e)), new jz5.l("session_buffer", baseFinderFeed.g0()));
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(inflater, "inflater");
        android.view.View inflate = inflater.inflate(com.tencent.mm.R.layout.e6c, (android.view.ViewGroup) null);
        android.view.ViewGroup viewGroup2 = inflate instanceof android.view.ViewGroup ? (android.view.ViewGroup) inflate : null;
        android.app.Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.requestWindowFeature(1);
        }
        this.f110040i = viewGroup2;
        return viewGroup2;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        android.view.Window window;
        super.onStart();
        android.app.Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        android.view.Window window;
        kotlin.jvm.internal.o.g(view, "view");
        super.onViewCreated(view, bundle);
        android.view.ViewGroup viewGroup = this.f110040i;
        if (viewGroup == null) {
            return;
        }
        android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.swx);
        android.app.Dialog dialog = getDialog();
        boolean z17 = true;
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(true);
        }
        android.app.Dialog dialog2 = getDialog();
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia = null;
        android.view.WindowManager.LayoutParams attributes = (dialog2 == null || (window = dialog2.getWindow()) == null) ? null : window.getAttributes();
        if (attributes != null) {
            attributes.windowAnimations = com.tencent.mm.R.style.f494099e6;
        }
        ((com.tencent.mm.pluginsdk.forward.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
        this.f110041m = new com.tencent.mm.pluginsdk.forward.m();
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 0, true);
        android.view.Window d17 = k0Var.d();
        if (d17 != null) {
            d17.setDimAmount(0.0f);
        }
        k0Var.f211872n = new hd2.e(k0Var, context);
        k0Var.f211874o = new hd2.f(context);
        k0Var.f211881s = new hd2.g(this, findViewById);
        k0Var.f211884v = new hd2.h(this, findViewById);
        k0Var.f211854d = new hd2.i(this);
        k0Var.f211876p = new hd2.j(this, context, k0Var);
        k0Var.f211885w = new hd2.l(this, findViewById);
        view.post(new hd2.m(k0Var));
        android.view.View findViewById2 = viewGroup.findViewById(com.tencent.mm.R.id.swv);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        p0(this.f110037f, (android.view.ViewGroup) findViewById2);
        android.view.View findViewById3 = viewGroup.findViewById(com.tencent.mm.R.id.sww);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        p0(this.f110038g, (android.view.ViewGroup) findViewById3);
        android.view.View findViewById4 = viewGroup.findViewById(com.tencent.mm.R.id.swt);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) findViewById4;
        android.widget.ImageView imageView = (android.widget.ImageView) viewGroup2.findViewById(com.tencent.mm.R.id.swr);
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = (com.tencent.mm.ui.widget.MMNeat7extView) viewGroup2.findViewById(com.tencent.mm.R.id.sws);
        android.widget.TextView textView = (android.widget.TextView) viewGroup2.findViewById(com.tencent.mm.R.id.swy);
        android.widget.ImageView imageView2 = (android.widget.ImageView) viewGroup2.findViewById(com.tencent.mm.R.id.ehq);
        dq4.c cVar = dq4.c.f242369a;
        kotlin.jvm.internal.o.d(imageView2);
        cVar.f(imageView2);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context2 = getContext();
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f110035d;
        java.lang.String nickName = baseFinderFeed.getFeedObject().getNickName();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context2, nickName));
        viewGroup2.getContext();
        float f17 = 400;
        textView.setTextSize(1, (j65.f.g() * 15.0f) / f17);
        le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context3 = getContext();
        android.text.SpannableString descriptionSpan = baseFinderFeed.getFeedObject().getDescriptionSpan();
        ((ke0.e) xVar2).getClass();
        mMNeat7extView.b(com.tencent.mm.pluginsdk.ui.span.c0.i(context3, descriptionSpan));
        viewGroup2.getContext();
        mMNeat7extView.l(1, (15.0f * j65.f.g()) / f17);
        java.lang.CharSequence a17 = mMNeat7extView.a();
        if (a17 != null && a17.length() != 0) {
            z17 = false;
        }
        if (z17) {
            mMNeat7extView.setVisibility(8);
        } else {
            mMNeat7extView.setVisibility(0);
        }
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = baseFinderFeed.getFeedObject().getFeedObject().getObjectDesc();
        if (objectDesc != null && (media = objectDesc.getMedia()) != null) {
            finderMedia = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media);
        }
        wo0.c a18 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).a(new mn2.q3(m0(finderMedia), com.tencent.mm.plugin.finder.storage.y90.f128356f));
        kotlin.jvm.internal.o.d(imageView);
        ((wo0.b) a18).b(imageView, false);
        ((android.widget.ImageView) viewGroup2.findViewById(com.tencent.mm.R.id.swz)).setImageBitmap(com.tencent.mm.sdk.platformtools.x.G(this.f110039h));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderCommentShareDialogFragment", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderCommentShareDialogFragment", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        k0Var.f211856e = new hd2.o(findViewById, this, k0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x06dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p0(com.tencent.mm.protocal.protobuf.FinderCommentInfo r41, android.view.ViewGroup r42) {
        /*
            Method dump skipped, instructions count: 1818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.ui.fragment.FinderCommentShareDialogFragment.p0(com.tencent.mm.protocal.protobuf.FinderCommentInfo, android.view.ViewGroup):void");
    }
}
