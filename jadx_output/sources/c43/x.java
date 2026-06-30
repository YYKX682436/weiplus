package c43;

/* loaded from: classes15.dex */
public class x extends androidx.recyclerview.widget.k3 {
    public final com.tencent.mm.ui.widget.MMNeat7extView A;
    public final android.view.ViewGroup B;
    public final android.widget.ProgressBar C;
    public final android.widget.ImageView D;
    public final android.view.ViewGroup E;
    public final android.view.ViewGroup F;
    public final android.widget.TextView G;
    public final android.widget.TextView H;
    public final android.widget.ImageView I;

    /* renamed from: J, reason: collision with root package name */
    public final android.widget.FrameLayout f38488J;
    public final android.widget.TextView K;
    public final android.widget.ImageView L;
    public u33.h M;
    public u33.h N;
    public com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo P;
    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomJumpInfo Q;
    public long R;
    public java.lang.String S;
    public final java.util.Map T;
    public long U;
    public java.lang.String V;
    public java.util.List W;
    public int X;
    public long Y;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f38489d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f38490e;

    /* renamed from: f, reason: collision with root package name */
    public final int f38491f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f38492g;

    /* renamed from: h, reason: collision with root package name */
    public final long f38493h;

    /* renamed from: i, reason: collision with root package name */
    public final long f38494i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack f38495m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.ViewGroup f38496n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f38497o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.ImageView f38498p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.view.MMPAGView f38499q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.ImageView f38500r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.TextView f38501s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.TextView f38502t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.View f38503u;

    /* renamed from: v, reason: collision with root package name */
    public final android.widget.ImageView f38504v;

    /* renamed from: w, reason: collision with root package name */
    public final android.widget.TextView f38505w;

    /* renamed from: x, reason: collision with root package name */
    public final android.view.ViewGroup f38506x;

    /* renamed from: y, reason: collision with root package name */
    public final android.view.ViewGroup f38507y;

    /* renamed from: z, reason: collision with root package name */
    public final android.view.ViewGroup f38508z;

    public x(android.view.View view, int i17) {
        super(view);
        this.R = -1L;
        this.T = new java.util.HashMap();
        this.U = 0L;
        this.Y = -1L;
        this.f38489d = view.findViewById(com.tencent.mm.R.id.k9q);
        this.f38490e = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.jub);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.jtd);
        android.content.Context context = view.getContext();
        this.f38492g = context;
        android.app.Activity activity = (android.app.Activity) context;
        this.f38493h = activity.getIntent().getLongExtra("game_report_sourceid", 0L);
        this.f38494i = activity.getIntent().getLongExtra("game_report_ssid", 0L);
        java.util.Map map = s33.x.f402540a;
        int i18 = i17 != 10003 ? i17 != 10004 ? 1 : 3 : 2;
        this.f38491f = i18;
        if (i18 == 1) {
            android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ber, viewGroup, true);
            this.f38496n = (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.bfr);
            this.f38497o = view.findViewById(com.tencent.mm.R.id.oup);
            this.f38498p = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.hoe);
            com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) view.findViewById(com.tencent.mm.R.id.o7g);
            this.f38499q = mMPAGView;
            mMPAGView.o(j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigRfxChatSwitch()) == 1);
            this.f38500r = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f487522ov4);
            this.f38501s = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.ouw);
            this.f38502t = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.ov8);
            this.f38503u = view.findViewById(com.tencent.mm.R.id.f487518ov0);
            this.f38504v = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.ouz);
            this.f38505w = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f487519ov1);
            this.f38506x = (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.cgh);
            this.f38507y = (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.jtn);
            this.f38508z = (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.beu);
            com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = (com.tencent.mm.ui.widget.MMNeat7extView) view.findViewById(com.tencent.mm.R.id.bev);
            this.A = mMNeat7extView;
            mMNeat7extView.setTextColor(android.graphics.Color.parseColor("#7D90A9"));
            this.B = (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.jtc);
            this.C = (android.widget.ProgressBar) view.findViewById(com.tencent.mm.R.id.jtl);
            this.D = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.jtk);
            this.E = (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.jte);
            this.f38488J = (android.widget.FrameLayout) view.findViewById(com.tencent.mm.R.id.f484340dy4);
            this.K = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f484338dy2);
            this.L = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f484336dy0);
            this.F = (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.glg);
            this.G = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.omw);
            this.H = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.omx);
            this.I = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.hll);
        } else if (i18 == 2) {
            android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bew, viewGroup, true);
            this.f38496n = (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.bfs);
        } else if (i18 == 3) {
            android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bev, viewGroup, true);
            this.f38496n = (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.bfq);
        }
        A(this.f38496n);
    }

    public static void i(c43.x xVar, long j17, boolean z17) {
        xVar.getClass();
        int i17 = z17 ? 11 : 12;
        android.content.Context context = xVar.f38492g;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, true);
        k0Var.f211872n = new c43.i0(xVar, z17);
        k0Var.f211881s = new c43.j0(xVar, j17, z17, i17);
        k0Var.C = new c43.l0(xVar, i17);
        k0Var.t(true);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bht, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.mty)).setText(z17 ? com.tencent.mm.R.string.iiv : com.tencent.mm.R.string.aqc);
        k0Var.s(inflate, false);
        k0Var.v();
        xVar.y(i17, 1);
    }

    public final void A(android.view.View view) {
        if (view == null) {
            return;
        }
        c43.d0 d0Var = new c43.d0(this, view.getContext(), view);
        d0Var.C = true;
        d0Var.i(view, new c43.e0(this), new c43.f0(this));
    }

    public void B() {
        android.widget.ImageView imageView;
        android.graphics.drawable.GradientDrawable gradientDrawable;
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack = this.f38495m;
        if (chatroomMsgPack == null || (imageView = this.f38500r) == null) {
            return;
        }
        s33.m mVar = (s33.m) ((java.util.HashMap) this.T).get(chatroomMsgPack.from_username);
        if (mVar == null || com.tencent.mm.sdk.platformtools.t8.K0(mVar.f402526a)) {
            imageView.setVisibility(8);
            return;
        }
        r53.y.a().e(imageView, mVar.f402526a, null, null);
        com.tencent.mm.plugin.game.autogen.chatroom.Color color = mVar.f402527b;
        if (color != null) {
            java.lang.String str = color.dark_color;
            if (str == null) {
                str = "";
            }
            java.lang.Integer l17 = s33.y.l(str);
            if (l17 != null && (gradientDrawable = (android.graphics.drawable.GradientDrawable) imageView.getBackground()) != null) {
                gradientDrawable.setColor(l17.intValue());
            }
        }
        imageView.setVisibility(0);
    }

    public void j(com.tencent.mm.plugin.game.autogen.chatroom.VoteInfo voteInfo) {
        android.view.ViewGroup viewGroup = this.E;
        if (voteInfo == null) {
            viewGroup.setVisibility(8);
            return;
        }
        if (voteInfo.show_type != 2) {
            viewGroup.setVisibility(8);
            return;
        }
        viewGroup.setVisibility(0);
        boolean L0 = com.tencent.mm.sdk.platformtools.t8.L0(voteInfo.latest_voter_username_list);
        android.content.Context context = this.f38492g;
        android.widget.FrameLayout frameLayout = this.f38488J;
        if (L0) {
            frameLayout.setVisibility(8);
        } else {
            frameLayout.setVisibility(0);
            frameLayout.removeAllViews();
            for (int i17 = 0; i17 < voteInfo.latest_voter_username_list.size(); i17++) {
                java.lang.String str = voteInfo.latest_voter_username_list.get(i17);
                android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.acg, (android.view.ViewGroup) frameLayout, false);
                ng5.a.a((android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.f484341dy5), str);
                android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
                layoutParams.leftMargin = i65.a.b(context, 12) * i17;
                frameLayout.addView(inflate, 0, layoutParams);
            }
        }
        boolean z17 = voteInfo.voted_by_me;
        android.widget.TextView textView = this.K;
        android.widget.ImageView imageView = this.L;
        if (z17) {
            textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f478551al));
            imageView.setVisibility(0);
            imageView.setImageResource(com.tencent.mm.R.raw.icons_filled_game_favour);
        } else {
            textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_3));
            imageView.setVisibility(0);
            imageView.setImageResource(com.tencent.mm.R.raw.icons_filled_game_no_favour);
        }
        imageView.setTag(voteInfo);
        textView.setText(voteInfo.desc);
        imageView.setOnClickListener(new c43.c0(this));
    }

    public void k(com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack) {
    }

    public void l(final com.tencent.mm.plugin.game.autogen.chatroom.TopicInfo topicInfo, final long j17, boolean z17) {
        android.view.ViewGroup viewGroup = this.F;
        if (topicInfo == null) {
            viewGroup.setVisibility(8);
            return;
        }
        viewGroup.setVisibility(0);
        boolean z18 = topicInfo.has_publish;
        android.widget.TextView textView = this.G;
        android.widget.ImageView imageView = this.I;
        android.widget.TextView textView2 = this.H;
        if (!z18) {
            if (z17) {
                viewGroup.setClickable(true);
                viewGroup.setOnClickListener(new android.view.View.OnClickListener() { // from class: c43.x$$f
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        c43.x xVar = c43.x.this;
                        xVar.getClass();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        long j18 = j17;
                        arrayList.add(java.lang.Long.valueOf(j18));
                        arrayList.add(view);
                        java.lang.Object[] array = arrayList.toArray();
                        arrayList.clear();
                        yj0.a.b("com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", xVar, array);
                        gm0.j1.d().g(new v33.r(xVar.S, j18));
                        com.tencent.mm.game.report.f fVar = com.tencent.mm.game.report.g.f68195a;
                        long j19 = xVar.f38494i;
                        long j27 = xVar.f38493h;
                        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack = xVar.f38495m;
                        fVar.g(22L, 2L, j19, j27, chatroomMsgPack.seq, chatroomMsgPack.from_username, 0L, xVar.X);
                        yj0.a.h(xVar, "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    }
                });
            } else {
                viewGroup.setClickable(false);
            }
            imageView.setVisibility(8);
            textView.setText(q(topicInfo.left_desc, z17, false));
            textView2.setVisibility(8);
            return;
        }
        viewGroup.setClickable(true);
        viewGroup.setOnClickListener(new android.view.View.OnClickListener() { // from class: c43.x$$e
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                c43.x xVar = c43.x.this;
                xVar.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                com.tencent.mm.plugin.game.autogen.chatroom.TopicInfo topicInfo2 = topicInfo;
                arrayList.add(topicInfo2);
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", xVar, array);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(topicInfo2.content_url)) {
                    com.tencent.mm.plugin.game.commlib.util.n.b(xVar.f38492g, topicInfo2.content_url, -1, false, "");
                    com.tencent.mm.game.report.f fVar = com.tencent.mm.game.report.g.f68195a;
                    long j18 = xVar.f38494i;
                    long j19 = xVar.f38493h;
                    com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack = xVar.f38495m;
                    fVar.g(22L, 2L, j18, j19, chatroomMsgPack.seq, chatroomMsgPack.from_username, 0L, xVar.X);
                }
                yj0.a.h(xVar, "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        if (com.tencent.mm.sdk.platformtools.t8.K0(topicInfo.right_desc)) {
            textView2.setVisibility(8);
        } else {
            textView2.setText(topicInfo.right_desc);
            textView2.setVisibility(0);
        }
        textView.setText(q(topicInfo.left_desc, z17, true));
        imageView.setVisibility(0);
    }

    public boolean n() {
        return this instanceof c43.o;
    }

    public final void o(boolean z17) {
        android.widget.ImageView view = this.f38498p;
        if (view == null) {
            return;
        }
        java.util.HashMap hashMap = c43.e1.f38420a;
        kotlin.jvm.internal.o.g(view, "view");
        view.performHapticFeedback(1, 3);
        view.setAlpha(0.5f);
        view.postDelayed(new c43.o0(this, z17), 200L);
        view.postDelayed(new c43.p0(this), 230L);
    }

    public android.view.View p(android.view.ViewGroup viewGroup) {
        return null;
    }

    public final android.text.SpannableString q(java.lang.String str, boolean z17, boolean z18) {
        android.content.Context context = this.f38492g;
        if (z18) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                str = context.getString(com.tencent.mm.R.string.fl_);
            }
        } else {
            if (z17) {
                java.lang.String string = context.getString(com.tencent.mm.R.string.fl7);
                android.text.SpannableString spannableString = new android.text.SpannableString(string + ", " + context.getString(com.tencent.mm.R.string.fl8));
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(context.getColor(com.tencent.mm.R.color.Link_100)), 0, string.length(), 18);
                return spannableString;
            }
            str = context.getString(com.tencent.mm.R.string.fl6);
        }
        return new android.text.SpannableString(str);
    }

    public void r() {
        com.tencent.mm.plugin.game.autogen.chatroom.MsgOptions msgOptions;
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack = this.f38495m;
        if (chatroomMsgPack == null || chatroomMsgPack.seq != this.R || this.f38491f == 3) {
            return;
        }
        if (chatroomMsgPack == null || (msgOptions = chatroomMsgPack.msg_options) == null || msgOptions.bg_type != 2) {
            this.f38496n.setBackgroundColor(this.f38492g.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_1));
        } else {
            this.f38496n.setBackgroundColor(s33.y.l("#665A33").intValue());
        }
        ku5.u0 u0Var = ku5.t0.f312615d;
        c43.r0 r0Var = new c43.r0(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(r0Var, 3000L, false);
    }

    public boolean s() {
        return s33.y.e(this.S).f402490a;
    }

    public void v(db5.g4 g4Var) {
    }

    public void w(android.view.View view) {
    }

    public void x(int i17) {
    }

    public final void y(int i17, int i18) {
        if (this.f38495m != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                android.view.ViewGroup viewGroup = this.E;
                jSONObject.put("lightup", viewGroup != null && viewGroup.getVisibility() == 0);
            } catch (org.json.JSONException unused) {
            }
            long j17 = this.f38494i;
            long j18 = this.f38493h;
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack = this.f38495m;
            com.tencent.mm.game.report.g.f68195a.h(i17, 2L, j17, j18, chatroomMsgPack.seq, chatroomMsgPack.from_username, i18, this.X, jSONObject.toString());
        }
    }

    public final void z() {
        u33.h hVar;
        com.tencent.mm.plugin.game.autogen.chatroom.MsgOptions msgOptions;
        if (this.f38491f == 3) {
            return;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack = this.f38495m;
        android.view.ViewGroup viewGroup = this.f38496n;
        if (chatroomMsgPack != null && (msgOptions = chatroomMsgPack.msg_options) != null && msgOptions.bg_type == 2) {
            viewGroup.setBackgroundColor(s33.y.l("#665A33").intValue());
            return;
        }
        android.content.Context context = this.f38492g;
        if (chatroomMsgPack != null && (hVar = this.N) != null) {
            java.lang.String str = chatroomMsgPack.from_username;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = ((y33.e) hVar).field_userName;
            if (str.equals(str2 != null ? str2 : "")) {
                viewGroup.setBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_1));
                return;
            }
        }
        viewGroup.setBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_3));
    }
}
