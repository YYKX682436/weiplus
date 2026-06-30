package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public abstract class ck extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final int f103062e;

    /* renamed from: f, reason: collision with root package name */
    public final tu2.b f103063f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.r f103064g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.a f103065h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f103066i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f103067m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f103068n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.z00 f103069o;

    /* renamed from: p, reason: collision with root package name */
    public android.animation.ValueAnimator f103070p;

    public /* synthetic */ ck(int i17, tu2.b bVar, int i18, yz5.r rVar, yz5.a aVar, int i19, kotlin.jvm.internal.i iVar) {
        this(i17, (i19 & 2) != 0 ? new tu2.b() : bVar, (i19 & 4) != 0 ? -1 : i18, (i19 & 8) != 0 ? null : rVar, (i19 & 16) != 0 ? null : aVar);
    }

    public static /* synthetic */ void w(com.tencent.mm.plugin.finder.convert.ck ckVar, in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, float f17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refreshPostTime");
        }
        if ((i17 & 4) != 0) {
            f17 = 0.0f;
        }
        ckVar.v(s0Var, baseFinderFeed, f17);
    }

    @Override // in5.r
    public int e() {
        return this.f103062e;
    }

    public final void n(in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed) {
        android.content.res.Resources resources;
        android.content.res.Resources resources2;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(feed, "feed");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) holder.p(com.tencent.mm.R.id.g4f);
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.f486449l91);
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        if (feed.getFeedObject().isMemberFeed()) {
            android.content.Context context = holder.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            ya2.b2 contact = feed.getContact();
            if (r26.i0.q(contact != null ? contact.field_username : null, xy2.c.e(context), false, 2, null) && feed.getFeedObject().isPrivate()) {
                if (imageView != null) {
                    android.content.Context context2 = imageView.getContext();
                    android.content.Context context3 = imageView.getContext();
                    imageView.setImageDrawable(com.tencent.mm.ui.uk.e(context2, com.tencent.mm.R.raw.finder_icons_filled_lock, (context3 == null || (resources2 = context3.getResources()) == null) ? 0 : resources2.getColor(com.tencent.mm.R.color.f478553an)));
                }
                if (linearLayout == null) {
                    return;
                }
                linearLayout.setVisibility(0);
                return;
            }
        }
        if (feed.getFeedObject().getStickyTime() <= 0) {
            if (linearLayout == null) {
                return;
            }
            linearLayout.setVisibility(8);
            return;
        }
        if (imageView != null) {
            android.content.Context context4 = imageView.getContext();
            android.content.Context context5 = imageView.getContext();
            imageView.setImageDrawable(com.tencent.mm.ui.uk.e(context4, com.tencent.mm.R.raw.icons_outlined_top_new, (context5 == null || (resources = context5.getResources()) == null) ? 0 : resources.getColor(com.tencent.mm.R.color.f478553an)));
        }
        if (linearLayout == null) {
            return;
        }
        linearLayout.setVisibility(0);
    }

    public final boolean o() {
        r45.r03 r03Var;
        r45.e21 e21Var;
        com.tencent.mm.plugin.finder.feed.z00 z00Var = this.f103069o;
        return !com.tencent.mm.sdk.platformtools.t8.K0((z00Var == null || (r03Var = z00Var.f111220a) == null || (e21Var = (r45.e21) r03Var.getCustom(16)) == null) ? null : e21Var.getString(5));
    }

    public final void p(in5.s0 holder, android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, java.lang.String username) {
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar;
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar;
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2;
        java.lang.String sessionBuffer;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(username, "username");
        jz5.f0 f0Var = null;
        if (hc2.g0.f(feed.getFeedObject().getFeedObject(), holder, 0)) {
            nyVar = null;
        } else {
            r45.xk bizInfo = feed.getFeedObject().getBizInfo();
            com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar2 = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
            if (bizInfo != null) {
                com.tencent.mars.xlog.Log.i("FinderFeedRoundCornerConvert", "jumpBizProfile: bizUsername = " + bizInfo.getString(0));
                java.lang.String string = bizInfo.getString(0);
                if (string == null) {
                    string = "";
                }
                android.content.Intent intent = new android.content.Intent();
                com.tencent.mm.plugin.finder.viewmodel.component.iy.d(iyVar2, context, intent, feed.getItemId(), null, 0, 5, false, 0, feed.w(), 192, null);
                intent.putExtra("Contact_User", string);
                intent.putExtra("Contact_Scene", 214);
                boolean z17 = true;
                intent.putExtra("biz_profile_enter_from_finder", true);
                intent.putExtra("force_get_contact", true);
                intent.putExtra("key_use_new_contact_profile", true);
                intent.putExtra("biz_profile_tab_type", 1);
                java.lang.String sessionBuffer2 = feed.getFeedObject().getFeedObject().getSessionBuffer();
                if (sessionBuffer2 != null && sessionBuffer2.length() != 0) {
                    z17 = false;
                }
                if (z17) {
                    com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                    long itemId = feed.getItemId();
                    java.lang.String w17 = feed.w();
                    iyVar = iyVar2;
                    com.tencent.mm.plugin.finder.viewmodel.component.ny e17 = iyVar.e(context);
                    sessionBuffer = o3Var.ek(itemId, w17, e17 != null ? e17.f135380n : 0);
                } else {
                    iyVar = iyVar2;
                    sessionBuffer = feed.getFeedObject().getFeedObject().getSessionBuffer();
                }
                intent.putExtra("Contact_Scene_Note", sessionBuffer);
                nyVar2 = null;
                j45.l.j(context, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
                f0Var = jz5.f0.f302826a;
            } else {
                iyVar = iyVar2;
                nyVar2 = null;
            }
            if (f0Var == null) {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("finder_username", username);
                nyVar = nyVar2;
                com.tencent.mm.plugin.finder.viewmodel.component.iy.d(iyVar, context, intent2, feed.getItemId(), null, 0, 1, false, 0, feed.w(), 192, null);
                ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).mk(context, intent2);
            } else {
                nyVar = nyVar2;
            }
        }
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar3 = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : nyVar;
        if (nyVar3 != null) {
            ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Zi(4, feed.getItemId(), nyVar3.V6(), 1, username);
        }
    }

    /* renamed from: q */
    public void h(in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed item, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.e_e);
        mn2.g1 g1Var = mn2.g1.f329975a;
        vo0.d a17 = g1Var.a();
        java.lang.String n17 = item.n();
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (n17 == null) {
            n17 = "";
        }
        mn2.n nVar = new mn2.n(n17, com.tencent.mm.plugin.finder.storage.y90.X);
        kotlin.jvm.internal.o.d(imageView);
        a17.c(nVar, imageView, g1Var.h(mn2.f1.f329957h));
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.fuv);
        int intValue = ((java.lang.Number) ((jz5.n) this.f103068n).getValue()).intValue();
        yz5.a aVar = this.f103065h;
        java.lang.String str2 = (aVar == null || (str = (java.lang.String) aVar.invoke()) == null) ? "" : str;
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.text.TextPaint paint = textView.getPaint();
        kotlin.jvm.internal.o.f(paint, "getPaint(...)");
        textView.setText(r(context, paint, item.getFeedObject().getNickNameSpan(), intValue, str2));
        if (item.getCurrentUsed()) {
            android.view.View p17 = holder.p(com.tencent.mm.R.id.g4l);
            if (p17 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            android.view.View p18 = holder.p(com.tencent.mm.R.id.g4l);
            if (p18 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        t(holder, item);
        s(holder, item);
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.f484951g13);
        java.lang.String inner_recommend_reason = item.getFeedObject().getFeedObject().getInner_recommend_reason();
        if (inner_recommend_reason == null || inner_recommend_reason.length() == 0) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            android.text.SpannableString Ui = ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).Ui(context, item.getFeedObject().getFeedObject().getInner_recommend_reason(), (int) textView2.getTextSize(), 1);
            int color = context.getResources().getColor(com.tencent.mm.R.color.f479249u1);
            int color2 = context.getResources().getColor(com.tencent.mm.R.color.f479263uf);
            com.tencent.mm.pluginsdk.ui.span.z0[] z0VarArr = (com.tencent.mm.pluginsdk.ui.span.z0[]) Ui.getSpans(0, Ui.length(), com.tencent.mm.pluginsdk.ui.span.z0.class);
            if (z0VarArr != null) {
                for (com.tencent.mm.pluginsdk.ui.span.z0 z0Var : z0VarArr) {
                    z0Var.setColor(color2, color);
                }
            }
            textView2.setText(Ui);
            textView2.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0());
        }
        ((android.widget.TextView) holder.p(com.tencent.mm.R.id.f484950g12)).setVisibility(8);
        pf5.z zVar = pf5.z.f353948a;
        boolean z19 = context instanceof androidx.appcompat.app.AppCompatActivity;
        if (!z19) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.appcompat.app.AppCompatActivity appCompatActivity = (androidx.appcompat.app.AppCompatActivity) context;
        androidx.lifecycle.c1 a18 = zVar.a(appCompatActivity).a(sc2.a8.class);
        kotlin.jvm.internal.o.f(a18, "get(...)");
        ((sc2.a8) a18).b7(item, holder, "TWO_FLOW", false, new com.tencent.mm.plugin.finder.convert.yj(item));
        if (i17 == 0 && item.getIsOriginFeed()) {
            android.view.View p19 = holder.p(com.tencent.mm.R.id.f485546i22);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(p19, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p19.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(p19, "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((android.widget.TextView) holder.p(com.tencent.mm.R.id.klw)).setVisibility(0);
        } else {
            android.view.View p27 = holder.p(com.tencent.mm.R.id.f485546i22);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(p27, arrayList4.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p27.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(p27, "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((android.widget.TextView) holder.p(com.tencent.mm.R.id.klw)).setVisibility(8);
        }
        android.view.View p28 = holder.p(com.tencent.mm.R.id.i2f);
        if (p28 != null) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(p28, arrayList5.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshFriendsLike", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p28.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(p28, "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshFriendsLike", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.f485065gf4);
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        imageView.setOnClickListener(new com.tencent.mm.plugin.finder.convert.wj(this, holder, item));
        textView.setOnClickListener(new com.tencent.mm.plugin.finder.convert.xj(this, holder, item));
        u(holder, item);
        android.widget.CheckBox checkBox = (android.widget.CheckBox) holder.p(com.tencent.mm.R.id.mie);
        if (!z19) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a19 = zVar.a(appCompatActivity).a(com.tencent.mm.plugin.finder.viewmodel.component.fd.class);
        kotlin.jvm.internal.o.f(a19, "get(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.fd fdVar = (com.tencent.mm.plugin.finder.viewmodel.component.fd) a19;
        if (!fdVar.f134393d || this.f103064g == null) {
            checkBox.setVisibility(8);
        } else {
            checkBox.setVisibility(0);
            boolean O6 = fdVar.O6(item.getItemId());
            if (checkBox.isChecked() != O6) {
                checkBox.setChecked(O6);
            }
        }
        if (o()) {
            android.widget.TextView textView4 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.ebv);
            int color3 = context.getResources().getColor(com.tencent.mm.R.color.f478980mj);
            int color4 = context.getResources().getColor(com.tencent.mm.R.color.f478982ml);
            int color5 = context.getResources().getColor(com.tencent.mm.R.color.f478984mn);
            textView.setTextColor(color3);
            textView4.setTextColor(color3);
            android.widget.TextView textView5 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.fwn);
            if (textView5 != null) {
                textView5.setTextColor(color3);
            }
            android.widget.TextView textView6 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.fvz);
            if (textView6 != null) {
                textView6.setTextColor(color3);
            }
            android.view.View p29 = holder.p(com.tencent.mm.R.id.f484870fs4);
            if (p29 != null) {
                p29.setBackgroundColor(color5);
            }
            android.view.View p37 = holder.p(com.tencent.mm.R.id.lb6);
            if (p37 != null) {
                p37.setBackgroundColor(color5);
            }
            android.view.View p38 = holder.p(com.tencent.mm.R.id.l96);
            if (p38 != null) {
                p38.setBackgroundColor(color5);
            }
            holder.p(com.tencent.mm.R.id.f486448l90).setBackgroundColor(color4);
            ((com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.f486449l91)).setIconColor(color4);
        }
    }

    public final java.lang.CharSequence r(android.content.Context context, android.text.TextPaint textPaint, android.text.SpannableString spannableString, int i17, java.lang.String str) {
        if (spannableString == null) {
            return null;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return spannableString;
        }
        int L = r26.n0.L(spannableString, str, 0, false, 6, null);
        int length = str.length() + L;
        if (L < 0) {
            return spannableString;
        }
        float measureText = textPaint.measureText("…");
        float measureText2 = textPaint.measureText(spannableString, 0, L);
        float measureText3 = textPaint.measureText(spannableString, L, length);
        float measureText4 = textPaint.measureText(spannableString, length, spannableString.length());
        float f17 = measureText2 + measureText3;
        float f18 = i17;
        if (f17 + measureText4 < f18) {
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(context.getResources().getColor(com.tencent.mm.R.color.f478502m)), L, length, 33);
            return spannableString;
        }
        android.text.SpannableString spannableString2 = new android.text.SpannableString(str);
        spannableString2.setSpan(new android.text.style.ForegroundColorSpan(context.getResources().getColor(com.tencent.mm.R.color.f478502m)), 0, str.length(), 33);
        if (f17 + measureText < f18) {
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(spannableString, 0, L);
            spannableStringBuilder.append((java.lang.CharSequence) spannableString2);
            java.lang.CharSequence subSequence = spannableString.subSequence(length, spannableString.length());
            kotlin.jvm.internal.o.f(subSequence, "subSequence(...)");
            spannableStringBuilder.append(android.text.TextUtils.ellipsize(subSequence, textPaint, (f18 - measureText2) - measureText3, android.text.TextUtils.TruncateAt.END));
            return spannableStringBuilder;
        }
        if (measureText3 + measureText4 + measureText < f18) {
            android.text.SpannableStringBuilder spannableStringBuilder2 = new android.text.SpannableStringBuilder();
            java.lang.CharSequence subSequence2 = spannableString.subSequence(0, L);
            kotlin.jvm.internal.o.f(subSequence2, "subSequence(...)");
            spannableStringBuilder2.append(android.text.TextUtils.ellipsize(subSequence2, textPaint, (f18 - measureText3) - measureText4, android.text.TextUtils.TruncateAt.START));
            spannableStringBuilder2.append((java.lang.CharSequence) spannableString2);
            spannableStringBuilder2.append((java.lang.CharSequence) spannableString, length, spannableString.length());
            return spannableStringBuilder2;
        }
        if (measureText + measureText3 + measureText >= f18) {
            android.text.SpannableStringBuilder spannableStringBuilder3 = new android.text.SpannableStringBuilder();
            spannableStringBuilder3.append(android.text.TextUtils.ellipsize(spannableString2, textPaint, f18, android.text.TextUtils.TruncateAt.END));
            return spannableStringBuilder3;
        }
        android.text.SpannableStringBuilder spannableStringBuilder4 = new android.text.SpannableStringBuilder();
        float f19 = (f18 - measureText3) / 2;
        java.lang.CharSequence subSequence3 = spannableString.subSequence(0, L);
        kotlin.jvm.internal.o.f(subSequence3, "subSequence(...)");
        java.lang.CharSequence subSequence4 = spannableString.subSequence(length, spannableString.length());
        kotlin.jvm.internal.o.f(subSequence4, "subSequence(...)");
        spannableStringBuilder4.append(android.text.TextUtils.ellipsize(subSequence3, textPaint, f19, android.text.TextUtils.TruncateAt.START));
        spannableStringBuilder4.append((java.lang.CharSequence) spannableString2);
        spannableStringBuilder4.append(android.text.TextUtils.ellipsize(subSequence4, textPaint, f19, android.text.TextUtils.TruncateAt.END));
        return spannableStringBuilder4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
    
        if ((r1.length() > 0) == true) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void s(in5.s0 r13, com.tencent.mm.plugin.finder.model.BaseFinderFeed r14) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.ck.s(in5.s0, com.tencent.mm.plugin.finder.model.BaseFinderFeed):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t(in5.s0 r11, com.tencent.mm.plugin.finder.model.BaseFinderFeed r12) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.ck.t(in5.s0, com.tencent.mm.plugin.finder.model.BaseFinderFeed):void");
    }

    public void u(in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed item) {
        com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo;
        com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo2;
        r45.xk b17;
        com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo3;
        com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo4;
        r45.xk b18;
        android.view.ViewGroup.LayoutParams layoutParams;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.view.RingProgressView ringProgressView = (com.tencent.mm.view.RingProgressView) holder.p(com.tencent.mm.R.id.lb7);
        android.view.View p17 = holder.p(com.tencent.mm.R.id.lb6);
        android.view.View p18 = holder.p(com.tencent.mm.R.id.l96);
        android.view.View p19 = holder.p(com.tencent.mm.R.id.e_e);
        android.view.View p27 = holder.p(com.tencent.mm.R.id.fuv);
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.f483299a85);
        android.content.Context context = holder.f293121e;
        float q17 = i65.a.q(context);
        if (!(q17 == 1.0f) && (layoutParams = imageView.getLayoutParams()) != null) {
            int dimension = (int) (context.getResources().getDimension(com.tencent.mm.R.dimen.f479672c9) * q17);
            layoutParams.width = dimension;
            layoutParams.height = dimension;
            imageView.setLayoutParams(layoutParams);
        }
        if (item.getFeedObject().isPostFailed()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p18, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(p19, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p19.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(p19, "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView.setVisibility(8);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(p27, arrayList4.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p27.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(p27, "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (!item.getFeedObject().isPostFinish() && !item.F0()) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(p18, arrayList5.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(p17, arrayList6.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(p19, arrayList7.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p19.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(p19, "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView.setVisibility(8);
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(8);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(p27, arrayList8.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p27.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(p27, "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(ringProgressView.getProgress(), item.getFeedObject().getPostInfo().getInteger(4));
            this.f103070p = ofInt;
            kotlin.jvm.internal.o.d(ofInt);
            ofInt.addUpdateListener(new com.tencent.mm.plugin.finder.convert.zj(ringProgressView));
            android.animation.ValueAnimator valueAnimator = this.f103070p;
            kotlin.jvm.internal.o.d(valueAnimator);
            android.animation.ValueAnimator duration = valueAnimator.setDuration(400L);
            if (duration != null) {
                duration.start();
                return;
            }
            return;
        }
        java.util.ArrayList arrayList9 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList9.add(8);
        java.util.Collections.reverse(arrayList9);
        yj0.a.d(p18, arrayList9.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p18.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
        yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList10 = new java.util.ArrayList();
        arrayList10.add(8);
        java.util.Collections.reverse(arrayList10);
        yj0.a.d(p17, arrayList10.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int i17 = this.f103063f.f422132b;
        if (i17 == 2) {
            java.util.ArrayList arrayList11 = new java.util.ArrayList();
            arrayList11.add(8);
            java.util.Collections.reverse(arrayList11);
            yj0.a.d(p19, arrayList11.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p19.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
            yj0.a.f(p19, "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList12 = new java.util.ArrayList();
            arrayList12.add(8);
            java.util.Collections.reverse(arrayList12);
            yj0.a.d(p27, arrayList12.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p27.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
            yj0.a.f(p27, "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView.setVisibility(8);
            return;
        }
        ya2.m1 m1Var = ya2.m1.f460511a;
        if (i17 != 3) {
            java.util.ArrayList arrayList13 = new java.util.ArrayList();
            arrayList13.add(0);
            java.util.Collections.reverse(arrayList13);
            yj0.a.d(p19, arrayList13.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p19.setVisibility(((java.lang.Integer) arrayList13.get(0)).intValue());
            yj0.a.f(p19, "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList14 = new java.util.ArrayList();
            arrayList14.add(0);
            java.util.Collections.reverse(arrayList14);
            yj0.a.d(p27, arrayList14.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p27.setVisibility(((java.lang.Integer) arrayList14.get(0)).intValue());
            yj0.a.f(p27, "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ya2.b2 contact = item.getContact();
            if (contact == null || (b17 = ya2.d.b(contact, false)) == null || (finderAuthInfo2 = ya2.d.e(b17)) == null) {
                ya2.b2 contact2 = item.getContact();
                if (contact2 == null) {
                    finderAuthInfo = null;
                    ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                    kotlin.jvm.internal.o.d(imageView);
                    zy2.tb.a(m1Var, imageView, finderAuthInfo, 0, 4, null);
                    return;
                }
                finderAuthInfo2 = contact2.field_authInfo;
            }
            finderAuthInfo = finderAuthInfo2;
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            kotlin.jvm.internal.o.d(imageView);
            zy2.tb.a(m1Var, imageView, finderAuthInfo, 0, 4, null);
            return;
        }
        ya2.g gVar = ya2.h.f460484a;
        java.lang.String str = item.getFeedObject().field_username;
        r45.xk bizInfo = item.getFeedObject().getBizInfo();
        if (!ya2.g.h(gVar, str, bizInfo != null ? bizInfo.getString(0) : null, false, false, 12, null)) {
            java.util.ArrayList arrayList15 = new java.util.ArrayList();
            arrayList15.add(8);
            java.util.Collections.reverse(arrayList15);
            yj0.a.d(p19, arrayList15.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p19.setVisibility(((java.lang.Integer) arrayList15.get(0)).intValue());
            yj0.a.f(p19, "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList16 = new java.util.ArrayList();
            arrayList16.add(8);
            java.util.Collections.reverse(arrayList16);
            yj0.a.d(p27, arrayList16.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p27.setVisibility(((java.lang.Integer) arrayList16.get(0)).intValue());
            yj0.a.f(p27, "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView.setVisibility(8);
            return;
        }
        java.util.ArrayList arrayList17 = new java.util.ArrayList();
        arrayList17.add(0);
        java.util.Collections.reverse(arrayList17);
        yj0.a.d(p19, arrayList17.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p19.setVisibility(((java.lang.Integer) arrayList17.get(0)).intValue());
        yj0.a.f(p19, "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList18 = new java.util.ArrayList();
        arrayList18.add(0);
        java.util.Collections.reverse(arrayList18);
        yj0.a.d(p27, arrayList18.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p27.setVisibility(((java.lang.Integer) arrayList18.get(0)).intValue());
        yj0.a.f(p27, "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ya2.b2 contact3 = item.getContact();
        if (contact3 == null || (b18 = ya2.d.b(contact3, false)) == null || (finderAuthInfo4 = ya2.d.e(b18)) == null) {
            ya2.b2 contact4 = item.getContact();
            if (contact4 == null) {
                finderAuthInfo3 = null;
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                kotlin.jvm.internal.o.d(imageView);
                zy2.tb.a(m1Var, imageView, finderAuthInfo3, 0, 4, null);
            }
            finderAuthInfo4 = contact4.field_authInfo;
        }
        finderAuthInfo3 = finderAuthInfo4;
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        kotlin.jvm.internal.o.d(imageView);
        zy2.tb.a(m1Var, imageView, finderAuthInfo3, 0, 4, null);
    }

    public final void v(in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed item, float f17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        long integer = item.getFeedObject().getLiveInfo() != null ? r0.getInteger(6) : 0L;
        if (integer == 0) {
            integer = item.getFeedObject().getCreateTime() * 1000;
        }
        if (integer <= 0 || !item.getFeedObject().isPostFinish()) {
            android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.l1s);
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
            return;
        }
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.l1s);
        if (textView2 != null) {
            textView2.setVisibility(0);
            android.content.Context context = holder.f293121e;
            textView2.setText(com.tencent.mm.plugin.finder.assist.w2.k(context, integer));
            if (f17 > 0.0f) {
                textView2.setTextSize(0, f17 * i65.a.q(context));
            }
        }
    }

    public final void x(in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed item) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.i1g);
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.i1n);
        textView.setVisibility(item.getFeedObject().getReadCount() > 0 ? 0 : 8);
        imageView.setVisibility(item.getFeedObject().getReadCount() <= 0 ? 8 : 0);
        android.content.Context context = holder.f293121e;
        imageView.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_filled_eyes_on, context.getResources().getColor(com.tencent.mm.R.color.f478553an)));
        textView.setText(com.tencent.mm.plugin.finder.assist.w2.i(item.getFeedObject().getReadCount()));
        textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f478553an));
    }

    public ck(int i17, tu2.b itemViewConfig, int i18, yz5.r rVar, yz5.a aVar) {
        kotlin.jvm.internal.o.g(itemViewConfig, "itemViewConfig");
        this.f103062e = i17;
        this.f103063f = itemViewConfig;
        this.f103064g = rVar;
        this.f103065h = aVar;
        this.f103066i = jz5.h.b(com.tencent.mm.plugin.finder.convert.ak.f102891d);
        this.f103067m = jz5.h.b(com.tencent.mm.plugin.finder.convert.vj.f104792d);
        this.f103068n = jz5.h.b(new com.tencent.mm.plugin.finder.convert.bk(this));
    }
}
