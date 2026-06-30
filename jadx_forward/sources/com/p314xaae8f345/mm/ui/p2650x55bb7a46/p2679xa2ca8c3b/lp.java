package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public final class lp extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 {
    public android.widget.RelativeLayout A;
    public android.widget.TextView B;
    public android.view.animation.Animation C;
    public android.view.View D;

    /* renamed from: b, reason: collision with root package name */
    public int f286037b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f286038c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f286039d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21466x35c7836f f286040e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.ViewStub f286041f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewStub f286042g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21917xeb4fc2b5 f286043h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21917xeb4fc2b5 f286044i;

    /* renamed from: j, reason: collision with root package name */
    public rl5.r f286045j;

    /* renamed from: k, reason: collision with root package name */
    public wl5.x f286046k;

    /* renamed from: l, reason: collision with root package name */
    public rl5.r f286047l;

    /* renamed from: m, reason: collision with root package name */
    public wl5.x f286048m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.CharSequence f286049n = "";

    /* renamed from: o, reason: collision with root package name */
    public android.widget.FrameLayout f286050o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.FrameLayout f286051p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ImageView f286052q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f286053r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ProgressBar f286054s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21466x35c7836f f286055t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f286056u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.ProgressBar f286057v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f286058w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.ImageView f286059x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.RelativeLayout f286060y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.TextView f286061z;

    public static void a(android.content.Context context, java.lang.CharSequence charSequence, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21642xe60a98f.class);
        intent.putExtra("key_chat_from", context.getClass().getName());
        intent.putExtra("key_chat_text", charSequence);
        intent.putExtra("Chat_Msg_Id", f9Var.m124847x74d37ac6());
        intent.putExtra("Chat_User", f9Var.Q0());
        if (dVar != null) {
            intent.putExtra("is_group_chat", dVar.D());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemVoice$VoiceItemHolder", "goPreviewText", "(Landroid/content/Context;Ljava/lang/CharSequence;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/ui/chatting/viewitems/ChattingItemVoice$VoiceItemHolder", "goPreviewText", "(Landroid/content/Context;Ljava/lang/CharSequence;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        db5.f.j(context);
    }

    public static int c(int i17) {
        int i18;
        if (i17 <= 2) {
            return 80;
        }
        if (i17 < 10) {
            i18 = i17 - 2;
        } else {
            if (i17 >= 60) {
                return 204;
            }
            i18 = (i17 / 10) + 7;
        }
        return (i18 * 9) + 80;
    }

    public static void d(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.lp lpVar, boolean z17) {
        android.view.View view = lpVar.D;
        if (view != null) {
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) view.getLayoutParams();
            int i17 = z17 ? com.p314xaae8f345.mm.R.id.f565234bs0 : com.p314xaae8f345.mm.R.id.brr;
            if (i17 != layoutParams.getRule(3)) {
                layoutParams.addRule(3, i17);
                lpVar.D.setLayoutParams(layoutParams);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0542  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 r37, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.lp r38, rd5.d r39, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.q r40, yb5.d r41, boolean r42, boolean r43, android.view.View.OnLongClickListener r44, com.p314xaae8f345.mm.ui.p2650x55bb7a46.l6 r45) {
        /*
            Method dump skipped, instructions count: 1564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.lp.e(com.tencent.mm.ui.chatting.viewitems.a0, com.tencent.mm.ui.chatting.viewitems.lp, rd5.d, com.tencent.mm.ui.chatting.adapter.q, yb5.d, boolean, boolean, android.view.View$OnLongClickListener, com.tencent.mm.ui.chatting.l6):void");
    }

    public static void f(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.lp lpVar, int i17, int i18, boolean z17, boolean z18, boolean z19) {
        lpVar.f39499x8eebed7e.setVisibility(i18);
        lpVar.f286053r.setVisibility(i18);
        lpVar.f286050o.setVisibility(i18);
        if (z17) {
            lpVar.f286055t.setVisibility(i17);
            lpVar.f286056u.setVisibility(i18);
            return;
        }
        android.widget.TextView textView = lpVar.f286058w;
        if (textView != null) {
            textView.setVisibility(i17);
        }
        android.widget.TextView textView2 = lpVar.f286058w;
        if (textView2 == null || textView2.getVisibility() != 0) {
            d(lpVar, false);
        } else {
            d(lpVar, true);
        }
    }

    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 b(android.view.View view, boolean z17, boolean z18) {
        super.mo80050xaf65a0fc(view);
        this.f39500xcbecde0f = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f565229br1);
        this.f39502xce2b2f8d = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.brc);
        this.f286039d = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.brp);
        this.f39492x5b9aa3a3 = (android.widget.CheckBox) view.findViewById(com.p314xaae8f345.mm.R.id.bkf);
        this.f39496x10665fb1 = view.findViewById(com.p314xaae8f345.mm.R.id.bpa);
        this.f39499x8eebed7e = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.bqx);
        this.f286053r = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.bkl);
        this.f286050o = (android.widget.FrameLayout) view.findViewById(com.p314xaae8f345.mm.R.id.brq);
        this.f286054s = (android.widget.ProgressBar) view.findViewById(com.p314xaae8f345.mm.R.id.brm);
        this.f286041f = (android.view.ViewStub) view.findViewById(com.p314xaae8f345.mm.R.id.ojd);
        this.f286042g = (android.view.ViewStub) view.findViewById(com.p314xaae8f345.mm.R.id.f569131vo0);
        this.f286038c = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.brn);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21466x35c7836f c21466x35c7836f = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21466x35c7836f) view.findViewById(com.p314xaae8f345.mm.R.id.brl);
        this.f286040e = c21466x35c7836f;
        c21466x35c7836f.m78868x7650bebc(1);
        this.A = (android.widget.RelativeLayout) view.findViewById(com.p314xaae8f345.mm.R.id.blz);
        this.B = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.bly);
        this.D = view.findViewById(com.p314xaae8f345.mm.R.id.vgx);
        if (z17) {
            this.f286040e.m78867x600f4566(true);
            this.f286040e.m78866x5f3d5ab3(z18);
            this.f286056u = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.bix);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21466x35c7836f c21466x35c7836f2 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21466x35c7836f) view.findViewById(com.p314xaae8f345.mm.R.id.bro);
            this.f286055t = c21466x35c7836f2;
            c21466x35c7836f2.m78867x600f4566(true);
            this.f286055t.m78866x5f3d5ab3(z18);
            this.f286055t.m78868x7650bebc(0);
            this.f286059x = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.blt);
            this.f286060y = (android.widget.RelativeLayout) view.findViewById(com.p314xaae8f345.mm.R.id.blv);
            this.f286061z = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.blu);
        } else {
            this.f286051p = (android.widget.FrameLayout) view.findViewById(com.p314xaae8f345.mm.R.id.brx);
            this.f286052q = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.bry);
            this.f286057v = (android.widget.ProgressBar) view.findViewById(com.p314xaae8f345.mm.R.id.brz);
            this.f39501x4004bbf3 = (android.widget.ProgressBar) view.findViewById(com.p314xaae8f345.mm.R.id.ott);
            this.f286058w = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f565234bs0);
            this.f286040e.m78867x600f4566(false);
            this.f286040e.m78866x5f3d5ab3(z18);
        }
        q31.n T6 = ((io.a0) ((zn5.l) ((zn5.k) i95.n0.c(zn5.k.class))).Zi()).T6(null);
        android.view.View a17 = ((io.t) T6).a(view.getContext());
        android.view.View findViewById = a17.findViewById(com.p314xaae8f345.mm.R.id.uw8);
        ((android.widget.RelativeLayout) this.D.getParent()).addView(a17);
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) a17.getLayoutParams();
        layoutParams.addRule(3, com.p314xaae8f345.mm.R.id.vgx);
        if (z17) {
            layoutParams.addRule(5, com.p314xaae8f345.mm.R.id.brc);
        } else {
            layoutParams.addRule(0, com.p314xaae8f345.mm.R.id.f565178bk4);
            layoutParams.addRule(7, com.p314xaae8f345.mm.R.id.brc);
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) findViewById.getLayoutParams();
            marginLayoutParams.leftMargin = 0;
            marginLayoutParams.rightMargin = i65.a.b(findViewById.getContext(), 5);
            findViewById.setLayoutParams(marginLayoutParams);
        }
        m80057x35d80ff(T6);
        return this;
    }

    public final void g() {
        android.view.animation.Animation animation = this.C;
        if (animation != null) {
            animation.cancel();
            this.C = null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0
    /* renamed from: getMainContainerView */
    public android.view.View mo79945xb0f558d7() {
        return this.f286050o;
    }
}
