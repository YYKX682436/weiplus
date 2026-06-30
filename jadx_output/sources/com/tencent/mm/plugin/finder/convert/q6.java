package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public class q6 extends in5.r {
    public static final android.graphics.drawable.Drawable A;

    /* renamed from: i, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.convert.c5 f104325i = new com.tencent.mm.plugin.finder.convert.c5(null);

    /* renamed from: m, reason: collision with root package name */
    public static final int f104326m = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 24);

    /* renamed from: n, reason: collision with root package name */
    public static final float f104327n = i65.a.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 2.0f);

    /* renamed from: o, reason: collision with root package name */
    public static final int f104328o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f104329p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f104330q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f104331r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f104332s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f104333t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f104334u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f104335v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f104336w;

    /* renamed from: x, reason: collision with root package name */
    public static android.graphics.Bitmap f104337x;

    /* renamed from: y, reason: collision with root package name */
    public static android.graphics.Bitmap f104338y;

    /* renamed from: z, reason: collision with root package name */
    public static final android.graphics.drawable.Drawable f104339z;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.a7 f104340e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f104341f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f104342g;

    /* renamed from: h, reason: collision with root package name */
    public long f104343h;

    static {
        com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479738dv);
        int dimension = (int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479688cn);
        f104328o = dimension;
        f104329p = (int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479693cs);
        f104330q = dimension;
        f104331r = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f479242tu);
        i65.a.d(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.color.f478987mq);
        f104332s = android.graphics.Color.parseColor("#DEE9FF");
        int color = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f479254u6);
        f104333t = color;
        f104334u = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f478526a7);
        int color2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f478502m);
        f104335v = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f478997n1);
        f104336w = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f478502m);
        f104339z = com.tencent.mm.ui.uk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.raw.icons_filled_location, color2);
        A = com.tencent.mm.ui.uk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.raw.icons_filled_location, color);
    }

    public q6(com.tencent.mm.plugin.finder.feed.a7 presenter, boolean z17) {
        kotlin.jvm.internal.o.g(presenter, "presenter");
        this.f104340e = presenter;
        this.f104341f = z17;
        cq.k1.a();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        this.f104342g = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Ve).getValue()).r()).booleanValue();
    }

    public static final void n(com.tencent.mm.plugin.finder.convert.q6 q6Var, r45.qt2 qt2Var, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, long j17) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String string;
        q6Var.getClass();
        if (c01.id.c() - q6Var.f104343h > 500) {
            q6Var.f104343h = c01.id.c();
            com.tencent.mm.autogen.mmdata.rpt.FinderExtClinkExposeStruct finderExtClinkExposeStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderExtClinkExposeStruct();
            finderExtClinkExposeStruct.f56743d = finderExtClinkExposeStruct.b("Feedid", pm0.v.u(finderItem.getId()), true);
            java.lang.String str3 = "";
            if (qt2Var == null || (str = qt2Var.getString(0)) == null) {
                str = "";
            }
            finderExtClinkExposeStruct.f56744e = finderExtClinkExposeStruct.b("SessionId", str, true);
            if (qt2Var == null || (str2 = qt2Var.getString(1)) == null) {
                str2 = "";
            }
            finderExtClinkExposeStruct.f56745f = finderExtClinkExposeStruct.b("Contextid", str2, true);
            java.lang.String string2 = finderItem.getExtReading().getString(0);
            if (string2 == null) {
                string2 = "";
            }
            finderExtClinkExposeStruct.f56746g = finderExtClinkExposeStruct.b("Url", string2, true);
            finderExtClinkExposeStruct.f56747h = 1L;
            finderExtClinkExposeStruct.f56748i = j17;
            if (qt2Var != null && (string = qt2Var.getString(2)) != null) {
                str3 = string;
            }
            finderExtClinkExposeStruct.f56750k = finderExtClinkExposeStruct.b("clicktabcontextid", str3, true);
            finderExtClinkExposeStruct.f56751l = qt2Var != null ? qt2Var.getInteger(5) : 0L;
            finderExtClinkExposeStruct.f56752m = finderExtClinkExposeStruct.b("sessionBuffer", ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(finderItem.getId(), finderItem.getDupFlag(), qt2Var != null ? qt2Var.getInteger(5) : 0), true);
            finderExtClinkExposeStruct.k();
        }
    }

    public final void A(android.view.View view, long j17) {
        com.tencent.mm.plugin.finder.report.d2.f124994a.n(view, "desc_expand_collapse", (r20 & 4) != 0 ? 40 : 0, (r20 & 8) != 0 ? 25496 : 0, (r20 & 16) != 0 ? false : false, (r20 & 32) != 0 ? false : false, (r20 & 64) != 0 ? null : kz5.c1.k(new jz5.l("feed_id", pm0.v.u(j17)), new jz5.l("is_expand", 0)), (r20 & 128) != 0 ? null : null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        if ((r6 == null || r6.length() == 0) != false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(in5.s0 r22, so2.y0 r23) {
        /*
            Method dump skipped, instructions count: 760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.q6.B(in5.s0, so2.y0):void");
    }

    public final void C(in5.s0 s0Var, so2.z0 z0Var) {
        com.tencent.mm.plugin.finder.view.CommentHeaderCollapsibleExpandButton commentHeaderCollapsibleExpandButton = (com.tencent.mm.plugin.finder.view.CommentHeaderCollapsibleExpandButton) s0Var.p(com.tencent.mm.R.id.f487280ve2);
        if (commentHeaderCollapsibleExpandButton != null) {
            commentHeaderCollapsibleExpandButton.setVisibility(8);
        }
        com.tencent.mm.plugin.finder.view.CommentHeaderCollapsibleExpandButton commentHeaderCollapsibleExpandButton2 = (com.tencent.mm.plugin.finder.view.CommentHeaderCollapsibleExpandButton) s0Var.p(com.tencent.mm.R.id.f483788sv0);
        if (commentHeaderCollapsibleExpandButton2 != null) {
            commentHeaderCollapsibleExpandButton2.setVisibility(8);
        }
        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.suz);
        if (p17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "tryExpandCollapsibleContainer", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "tryExpandCollapsibleContainer", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (p17 != null) {
            android.view.ViewGroup.LayoutParams layoutParams = p17.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = -2;
            } else {
                layoutParams = null;
            }
            p17.setLayoutParams(layoutParams);
        }
        com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView = (com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView) s0Var.p(com.tencent.mm.R.id.f487278o45);
        if (finderCollapsibleTextView != null) {
            finderCollapsibleTextView.i();
        }
        z0Var.F = false;
    }

    @Override // in5.r
    public android.view.View c(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        yw2.a0 a0Var = this.f104340e.f106216o;
        return null;
    }

    @Override // in5.r
    public int e() {
        return this.f104342g ? com.tencent.mm.R.layout.dre : com.tencent.mm.R.layout.f487833a;
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        android.view.ViewGroup viewGroup;
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView = (com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView) holder.p(com.tencent.mm.R.id.f487278o45);
        com.tencent.mm.plugin.finder.view.FadeNeatTextView contentTextView = finderCollapsibleTextView.getContentTextView();
        com.tencent.mm.plugin.finder.view.FadeNeatTextView contentTextView2 = finderCollapsibleTextView.getContentTextView();
        android.content.Context context = holder.f293121e;
        contentTextView.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y(contentTextView2, new com.tencent.mm.pluginsdk.ui.span.y0(context)));
        finderCollapsibleTextView.getContentTextView().setTextColor(context.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_9));
        boolean z17 = this.f104342g;
        if (z17) {
            finderCollapsibleTextView.setCollapseTextViewAlwaysAlignRight(true);
        } else {
            finderCollapsibleTextView.setLimitLine(10);
        }
        finderCollapsibleTextView.f(false, false);
        com.tencent.mm.plugin.finder.view.FinderInterceptLinearLayout finderInterceptLinearLayout = (com.tencent.mm.plugin.finder.view.FinderInterceptLinearLayout) holder.p(com.tencent.mm.R.id.rrw);
        if (finderInterceptLinearLayout != null) {
            finderInterceptLinearLayout.setInterceptListener(new com.tencent.mm.plugin.finder.convert.f5(this, finderCollapsibleTextView));
        }
        android.view.View p17 = holder.p(com.tencent.mm.R.id.c77);
        if (p17 != null) {
            p17.setOnClickListener(new com.tencent.mm.plugin.finder.convert.g5(holder, this, p17, finderCollapsibleTextView));
        }
        if (p17 != null) {
            p17.setOnLongClickListener(new com.tencent.mm.plugin.finder.convert.h5(holder));
        }
        if (!z17 || (viewGroup = (android.view.ViewGroup) holder.p(com.tencent.mm.R.id.f484494ef3)) == null) {
            return;
        }
        viewGroup.setOnHierarchyChangeListener(new com.tencent.mm.plugin.finder.convert.i5(this, holder));
    }

    @Override // in5.r
    public void l(in5.s0 holder) {
        android.view.ViewGroup viewGroup;
        kotlin.jvm.internal.o.g(holder, "holder");
        if (this.f104342g && (viewGroup = (android.view.ViewGroup) holder.p(com.tencent.mm.R.id.f484494ef3)) != null) {
            viewGroup.setOnHierarchyChangeListener(null);
        }
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        sc2.a8 a8Var = (sc2.a8) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(sc2.a8.class);
        a8Var.getClass();
        a8Var.f7(holder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o(android.content.Context context, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, boolean z17) {
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar;
        boolean z18;
        jz5.f0 f0Var;
        r45.xk bizInfo;
        java.lang.String sessionBuffer;
        android.content.Context context2 = context;
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((com.tencent.mm.plugin.finder.report.o3) c17).Gk(context, finderItem.getId(), (r18 & 4) != 0 ? false : true, (r18 & 8) != 0 ? false : false, 1, (r18 & 32) != 0 ? false : z17);
        if (finderItem.isQAFeed()) {
            if ((finderItem.getUserName().length() == 0) != false) {
                return;
            }
        }
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar2 = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        com.tencent.mm.plugin.finder.viewmodel.component.ny e17 = iyVar2.e(context2);
        int i17 = e17 != null ? e17.f135380n : 0;
        if (i17 == 1 || i17 == 8 || i17 == 120) {
            com.tencent.mars.xlog.Log.i("Finder.FeedCommentHeaderConvert", "checkJumpProfile: hit SOURCE_PROFILE_TIMELINE, avatar can't click.");
            ((android.app.Activity) context2).finish();
            return;
        }
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem2 = ((finderItem.getFeedObject().getFunc_flag() & 1) > 0) != false ? finderItem : null;
        if (finderItem2 == null || (bizInfo = finderItem2.getBizInfo()) == null) {
            iyVar = iyVar2;
            z18 = true;
            f0Var = null;
        } else {
            java.lang.String string = bizInfo.getString(0);
            if (string == null) {
                string = "";
            }
            android.content.Intent intent = new android.content.Intent();
            com.tencent.mm.plugin.finder.viewmodel.component.iy.d(iyVar2, context, intent, finderItem.getId(), null, 0, 1, false, 0, finderItem.getDupFlag(), 192, null);
            intent.putExtra("Contact_User", string);
            intent.putExtra("Contact_Scene", 214);
            intent.putExtra("biz_profile_enter_from_finder", true);
            intent.putExtra("force_get_contact", true);
            intent.putExtra("key_use_new_contact_profile", true);
            intent.putExtra("finder_feed_id", finderItem.getId());
            java.lang.String sessionBuffer2 = finderItem.getFeedObject().getSessionBuffer();
            if (sessionBuffer2 == null || sessionBuffer2.length() == 0) {
                com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                long id6 = finderItem.getId();
                java.lang.String dupFlag = finderItem.getDupFlag();
                z18 = true;
                iyVar = iyVar2;
                context2 = context;
                com.tencent.mm.plugin.finder.viewmodel.component.ny e18 = iyVar.e(context2);
                sessionBuffer = o3Var.ek(id6, dupFlag, e18 != null ? e18.f135380n : 0);
            } else {
                z18 = true;
                iyVar = iyVar2;
                context2 = context;
                sessionBuffer = finderItem.getFeedObject().getSessionBuffer();
            }
            intent.putExtra("Contact_Scene_Note", sessionBuffer);
            intent.putExtra("biz_profile_tab_type", z18 ? 1 : 0);
            j45.l.j(context2, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("finder_username", finderItem.getUserName());
            intent2.putExtra("finder_read_feed_id", finderItem.getId());
            intent2.putExtra("finder_read_feed_dup_flag", finderItem.getDupFlag());
            intent2.putExtra("finder_from_feed_id", finderItem.getId());
            intent2.putExtra("finder_from_feed_dup_flag", finderItem.getDupFlag());
            if (!(context2 instanceof com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI) && !(context2 instanceof com.tencent.mm.plugin.finder.ui.FinderShareFeedDetailUI) && !(context2 instanceof com.tencent.mm.plugin.finder.ui.FinderMsgFeedDetailUI)) {
                intent2.putExtra("KEY_FROM_TIMELINE", z18);
            }
            com.tencent.mm.plugin.finder.viewmodel.component.iy.d(iyVar, context, intent2, finderItem.getId(), null, 0, 1, false, 0, finderItem.getDupFlag(), 192, null);
            pf5.z zVar = pf5.z.f353948a;
            if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.tencent.mm.plugin.finder.live.viewmodel.aa) ((zy2.v9) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).c(zy2.v9.class))).S6(finderItem.getId(), intent2);
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).mk(context2, intent2);
        }
    }

    public final float p(android.view.ViewGroup viewGroup) {
        n3.t1 t1Var = new n3.t1(viewGroup);
        float f17 = 0.0f;
        while (t1Var.hasNext()) {
            android.view.View view = (android.view.View) t1Var.next();
            if (view.getVisibility() != 8) {
                if (view instanceof android.widget.TextView) {
                    android.widget.TextView textView = (android.widget.TextView) view;
                    f17 += textView.getPaint().measureText(textView.getText().toString()) + textView.getPaddingStart() + textView.getPaddingEnd();
                } else {
                    f17 += view.getMeasuredWidth();
                }
                android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if ((layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null) != null) {
                    f17 += r2.leftMargin + r2.rightMargin;
                }
            }
        }
        return f17 + viewGroup.getPaddingStart();
    }

    public android.text.SpannableString q(so2.z0 item) {
        kotlin.jvm.internal.o.g(item, "item");
        return item.E.createDescriptionFullSpan2();
    }

    public final java.lang.String r(so2.z0 z0Var) {
        java.lang.String nickName;
        int func_flag = z0Var.E.getFeedObject().getFunc_flag() & 1;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = z0Var.E;
        if (func_flag <= 0) {
            return finderItem.getNickName();
        }
        r45.xk bizInfo = finderItem.getBizInfo();
        if (bizInfo == null || (nickName = bizInfo.getString(1)) == null) {
            nickName = finderItem.getNickName();
        }
        kotlin.jvm.internal.o.d(nickName);
        return nickName;
    }

    public final boolean s() {
        if (((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode()) {
            return true;
        }
        r45.ls2 ls2Var = (r45.ls2) g92.b.f269769e.k2().d().getCustom(26);
        return ls2Var != null && ls2Var.getInteger(0) == 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:346:0x0190, code lost:
    
        if (r8 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0199, code lost:
    
        r8 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0197, code lost:
    
        if (r8 == null) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x06e7  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0769 A[LOOP:3: B:112:0x0735->B:120:0x0769, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x077c A[EDGE_INSN: B:121:0x077c->B:122:0x077c BREAK  A[LOOP:3: B:112:0x0735->B:120:0x0769], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x07db  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x08a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x08aa  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x095a  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x09a5  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0a75  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0b19  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0bf1  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0c7b  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0ccf  */
    /* JADX WARN: Removed duplicated region for block: B:210:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0901  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x07fa  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x07df  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x07bc  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0131  */
    @Override // in5.r
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r45, so2.z0 r46, int r47, int r48, boolean r49, java.util.List r50) {
        /*
            Method dump skipped, instructions count: 3295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.q6.h(in5.s0, so2.z0, int, int, boolean, java.util.List):void");
    }

    public void u(in5.s0 holder, so2.z0 item) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.plugin.finder.convert.c5 c5Var = f104325i;
        if (c5Var.j()) {
            android.view.View p17 = holder.p(com.tencent.mm.R.id.f482563hv);
            if (p17 == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "refreshActivity", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "refreshActivity", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = item.E;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderItem.getFeedObject().getObjectDesc();
        r45.xl2 event = objectDesc != null ? objectDesc.getEvent() : null;
        if (event == null) {
            android.view.View p18 = holder.p(com.tencent.mm.R.id.f482563hv);
            if (p18 == null) {
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "refreshActivity", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "refreshActivity", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(event.getString(1))) {
            android.view.View p19 = holder.p(com.tencent.mm.R.id.f482563hv);
            if (p19 == null) {
                return;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(p19, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "refreshActivity", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p19.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(p19, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "refreshActivity", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View p27 = holder.p(com.tencent.mm.R.id.f482563hv);
        if (p27 != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(p27, arrayList4.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "refreshActivity", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p27.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(p27, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "refreshActivity", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View p28 = holder.p(com.tencent.mm.R.id.f482563hv);
        if (p28 != null) {
            if (!finderItem.isPostFinish() || s()) {
                p28.setOnClickListener(null);
            } else {
                p28.setOnClickListener(new com.tencent.mm.plugin.finder.convert.j5(event, item, p28, holder));
            }
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.f482562hu);
        if (weImageView != null) {
            weImageView.setIconColor(s() ? com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.FG_1) : com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f478526a7));
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.f482621jk);
        if (textView != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            android.content.Context context = textView.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            sb6.append(c5Var.d(event, context));
            sb6.append(event.getString(1));
            java.lang.String sb7 = sb6.toString();
            int color = s() ? com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.FG_1) : com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f479121qk);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            ((ke0.e) xVar).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context2, sb7));
            textView.setTextColor(color);
        }
    }

    public final void v(in5.s0 s0Var, so2.z0 z0Var) {
        com.tencent.mm.plugin.finder.view.CommentHeaderCollapsibleExpandButton commentHeaderCollapsibleExpandButton;
        com.tencent.mm.plugin.finder.view.CommentHeaderCollapsibleExpandButton commentHeaderCollapsibleExpandButton2;
        com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView = (com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView) s0Var.p(com.tencent.mm.R.id.f487278o45);
        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.suz);
        android.view.View p18 = s0Var.p(com.tencent.mm.R.id.m3o);
        com.tencent.mm.plugin.finder.view.CommentHeaderCollapsibleExpandButton commentHeaderCollapsibleExpandButton3 = (com.tencent.mm.plugin.finder.view.CommentHeaderCollapsibleExpandButton) s0Var.p(com.tencent.mm.R.id.f487280ve2);
        if (commentHeaderCollapsibleExpandButton3 != null) {
            A(commentHeaderCollapsibleExpandButton3, z0Var.E.field_id);
            commentHeaderCollapsibleExpandButton = commentHeaderCollapsibleExpandButton3;
        } else {
            commentHeaderCollapsibleExpandButton = null;
        }
        com.tencent.mm.plugin.finder.view.CommentHeaderCollapsibleExpandButton commentHeaderCollapsibleExpandButton4 = (com.tencent.mm.plugin.finder.view.CommentHeaderCollapsibleExpandButton) s0Var.p(com.tencent.mm.R.id.f483788sv0);
        if (commentHeaderCollapsibleExpandButton4 != null) {
            A(commentHeaderCollapsibleExpandButton4, z0Var.E.field_id);
            commentHeaderCollapsibleExpandButton2 = commentHeaderCollapsibleExpandButton4;
        } else {
            commentHeaderCollapsibleExpandButton2 = null;
        }
        if (finderCollapsibleTextView != null) {
            finderCollapsibleTextView.post(new com.tencent.mm.plugin.finder.convert.q5(finderCollapsibleTextView, p18, z0Var, this, s0Var, p17, commentHeaderCollapsibleExpandButton, commentHeaderCollapsibleExpandButton2));
        }
    }

    public final void w(in5.s0 s0Var, so2.z0 z0Var) {
        r45.th2 mod_feed_info;
        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.tdg);
        if (p17 == null) {
            return;
        }
        com.tencent.mm.plugin.finder.report.d2.m(com.tencent.mm.plugin.finder.report.d2.f124994a, p17, "feed_modify_record", 0, 0, kz5.b1.e(new jz5.l("feed_id", pm0.v.u(z0Var.E.getId()))), null, 44, null);
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = z0Var.E.getFeedObject().getObjectDesc();
        if (objectDesc == null || (mod_feed_info = objectDesc.getMod_feed_info()) == null) {
            com.tencent.mars.xlog.Log.i("Finder.FeedCommentHeaderConvert", "[showFeedRecordTips] modFeedInfo isNull");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "showFeedRecordTips", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "showFeedRecordTips", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.lang.String string = mod_feed_info.getString(2);
        if (string == null || string.length() == 0) {
            com.tencent.mars.xlog.Log.i("Finder.FeedCommentHeaderConvert", "[showFeedRecordTips] comment_tips_wording isNullOrEmpty");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "showFeedRecordTips", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "showFeedRecordTips", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (((r45.cr0) mod_feed_info.getCustom(0)) == null) {
            com.tencent.mars.xlog.Log.i("Finder.FeedCommentHeaderConvert", "[showFeedRecordTips] initial_info isNull");
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(p17, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "showFeedRecordTips", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "showFeedRecordTips", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (mod_feed_info.getList(1).isEmpty()) {
            com.tencent.mars.xlog.Log.i("Finder.FeedCommentHeaderConvert", "[showFeedRecordTips] history isEmpty ");
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(p17, arrayList4.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "showFeedRecordTips", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "showFeedRecordTips", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        ((android.widget.TextView) p17.findViewById(com.tencent.mm.R.id.tdh)).setText(mod_feed_info.getString(2));
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
        arrayList5.add(0);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(p17, arrayList5.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "showFeedRecordTips", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "showFeedRecordTips", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setOnClickListener(new com.tencent.mm.plugin.finder.convert.p6(this, p17, mod_feed_info));
    }

    public final void x(in5.s0 s0Var, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, boolean z17) {
        pf5.u uVar = pf5.u.f353936a;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        androidx.lifecycle.c1 a17 = uVar.b(context).a(sc2.a8.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        sc2.a8 a8Var = (sc2.a8) a17;
        if (sc2.r7.d7(a8Var, cu2.u.f222441a.p(finderItem), s0Var, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_COMMENT, z17, null, 16, null) == 0) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) s0Var.p(com.tencent.mm.R.id.f484492ef1);
            if (viewGroup != null) {
                viewGroup.setPadding(0, 0, 0, 0);
            }
            android.view.View p17 = s0Var.p(com.tencent.mm.R.id.eak);
            if (p17 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "refreshFeedJumper", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/storage/FinderItem;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "refreshFeedJumper", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/storage/FinderItem;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        a8Var.e7(s0Var, "FinderFeedCommentBind");
        android.view.View p18 = s0Var.p(com.tencent.mm.R.id.f484496rl3);
        if (p18 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "refreshPromotionInfo", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/storage/FinderItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "refreshPromotionInfo", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/storage/FinderItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        androidx.lifecycle.j0 a76 = ((xc2.k0) uVar.e(zy2.b6.class).a(xc2.k0.class)).a7(finderItem.getId());
        android.content.Context context2 = s0Var.f293121e;
        kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) context2;
        a76.removeObservers(mMActivity);
        pm0.v.y(((xc2.k0) uVar.e(zy2.b6.class).a(xc2.k0.class)).a7(finderItem.getId()), mMActivity, new com.tencent.mm.plugin.finder.convert.k6(s0Var, this, finderItem));
    }

    public void y(in5.s0 holder, so2.z0 item) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.view.View p17 = holder.p(com.tencent.mm.R.id.i2x);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "refreshLink", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "refreshLink", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r45.o21 extReading = item.E.getExtReading();
        if (com.tencent.mm.sdk.platformtools.t8.K0(extReading.getString(0)) || com.tencent.mm.sdk.platformtools.t8.K0(extReading.getString(1))) {
            return;
        }
        java.lang.String string = extReading.getString(0);
        java.lang.String string2 = extReading.getString(1);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.f485555i36);
        holder.s(com.tencent.mm.R.id.f485555i36, string2);
        com.tencent.mars.xlog.Log.i("Finder.FeedCommentHeaderConvert", "link " + string + ", title " + extReading.getString(1));
        p17.post(new com.tencent.mm.plugin.finder.convert.s5(p17, holder, textView, string2));
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.i2w);
        int integer = extReading.getInteger(3);
        android.content.Context context = holder.f293121e;
        if (integer == 0) {
            weImageView.setImageResource(com.tencent.mm.R.raw.icons_filled_link);
            weImageView.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.f478502m));
        } else if (integer == 1) {
            weImageView.setImageResource(com.tencent.mm.R.raw.icons_filled_finder_red_envelope);
            weImageView.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.f478997n1));
        }
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        ym5.a1.h(p17, new com.tencent.mm.plugin.finder.convert.t5(this, V6, item));
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        r45.qt2 qt2Var = V6;
        yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "refreshLink", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "refreshLink", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (weImageView != null && s()) {
            weImageView.setIconColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.FG_1));
        }
        if (textView != null && s()) {
            textView.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.FG_1));
        }
        if (s()) {
            return;
        }
        textView.setOnClickListener(new com.tencent.mm.plugin.finder.convert.u5(this, holder, item, string, qt2Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void z(in5.s0 r17, so2.z0 r18) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.q6.z(in5.s0, so2.z0):void");
    }
}
