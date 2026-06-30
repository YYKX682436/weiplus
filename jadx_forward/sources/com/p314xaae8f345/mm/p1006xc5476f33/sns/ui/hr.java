package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class hr extends com.p314xaae8f345.mm.ui.z9 {

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View.OnClickListener f250062o;

    /* renamed from: p, reason: collision with root package name */
    public final android.app.Activity f250063p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18114x28d7f256 f250064q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hr(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18114x28d7f256 activityC18114x28d7f256, android.app.Activity activity) {
        super(activity, new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1());
        this.f250064q = activityC18114x28d7f256;
        this.f250062o = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.er(this);
        this.f250063p = activity;
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("convertFrom", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$CommentListAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1 v1Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("convertFrom", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$CommentListAdapter");
        if (v1Var == null) {
            v1Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1();
        }
        v1Var.mo9015xbf5d97fd(cursor);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("convertFrom", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$CommentListAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("convertFrom", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$CommentListAdapter");
        return v1Var;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.gr grVar;
        android.view.View view2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getView", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$CommentListAdapter");
        android.app.Activity activity = this.f250063p;
        if (view == null) {
            grVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.gr(this);
            view2 = android.view.View.inflate(activity, com.p314xaae8f345.mm.R.C30864xbddafb2a.ctt, null);
            grVar.f249989a = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.n76);
            grVar.f249992d = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.n7a);
            grVar.f249990b = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.n7e);
            grVar.f249993e = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.n7f);
            grVar.f249991c = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.n7g);
            grVar.f249994f = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.n7b);
            view2.setTag(grVar);
        } else {
            grVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.gr) view.getTag();
            view2 = view;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1 v1Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1) getItem(i17);
        try {
            r45.k76 k76Var = (r45.k76) new r45.k76().mo11468x92b714fd(v1Var.f67461x5e5c2922);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Bi(grVar.f249989a, k76Var.f459991d, pc4.d.f434943a.l());
            grVar.f249989a.setTag(k76Var.f459991d);
            grVar.f249989a.setOnClickListener(this.f250062o);
            java.lang.String str = k76Var.f459993f;
            if (str == null) {
                str = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1) this.f294140d).f67471x114ef53e;
            }
            grVar.f249990b.setTag(k76Var.f459991d);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            float textSize = grVar.f249990b.getTextSize();
            ((ke0.e) xVar).getClass();
            android.text.SpannableString j17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(activity, str, textSize);
            j17.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.fr(this, activity, k76Var.f459991d, null), 0, str.length(), 33);
            grVar.f249990b.setText(j17, android.widget.TextView.BufferType.SPANNABLE);
            grVar.f249990b.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p5());
            if (v1Var.f67472x2262335f == 3) {
                grVar.f249992d.setVisibility(0);
                grVar.f249994f.setVisibility(8);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.os.d(activity, k76Var.f459997m * 1000);
                grVar.f249992d.setText(k76Var.f459998n + " ");
                ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).oj(grVar.f249992d, 2);
                grVar.f249992d.setVisibility(0);
            } else {
                grVar.f249992d.setVisibility(8);
                grVar.f249994f.setVisibility(0);
            }
            if (c01.z1.r().equals(k76Var.f459991d)) {
                grVar.f249993e.setVisibility(8);
            } else {
                grVar.f249993e.setVisibility(0);
                t(grVar.f249993e, k76Var.f459996i);
            }
            grVar.f249991c.setText("" + com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.os.d(activity, k76Var.f459997m * 1000));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsStrangerCommentDetailUI", e17, "", new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getView", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$CommentListAdapter");
        return view2;
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void o() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initCursor", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$CommentListAdapter");
        q();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initCursor", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$CommentListAdapter");
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void q() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetCursor", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$CommentListAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w1 Aj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Aj();
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18114x28d7f256.f248956y;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1200", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18114x28d7f256 activityC18114x28d7f256 = this.f250064q;
        java.lang.String str = activityC18114x28d7f256.f248968r;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1200", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1300", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        long j17 = activityC18114x28d7f256.f248964n;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1300", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        Aj.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getStrangerCursor", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select *, rowid from SnsComment where talker = ");
        Aj.P0();
        sb6.append(d95.b0.O(str));
        sb6.append(" and  snsID = ");
        sb6.append(j17);
        sb6.append(" and ( type = 3 or type = 5 )");
        android.database.Cursor B = Aj.f247689d.B(sb6.toString(), null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getStrangerCursor", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        s(B);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetCursor", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$CommentListAdapter");
    }

    public final void t(android.widget.TextView textView, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSource", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$CommentListAdapter");
        android.app.Activity activity = this.f250063p;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18114x28d7f256 activityC18114x28d7f256 = this.f250064q;
        if (i17 != 18) {
            switch (i17) {
                case 22:
                case 23:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                    textView.setText(activityC18114x28d7f256.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jac));
                    textView.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, i65.a.i(activity, com.p314xaae8f345.mm.R.C30861xcebc809e.bld), (android.graphics.drawable.Drawable) null);
                    break;
                case 25:
                    textView.setText(activityC18114x28d7f256.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ja_));
                    textView.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, i65.a.i(activity, com.p314xaae8f345.mm.R.C30861xcebc809e.bl_), (android.graphics.drawable.Drawable) null);
                    break;
                case 30:
                    textView.setText(activityC18114x28d7f256.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jab));
                    textView.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, i65.a.i(activity, com.p314xaae8f345.mm.R.C30861xcebc809e.bla), (android.graphics.drawable.Drawable) null);
                    break;
                default:
                    textView.setText(activityC18114x28d7f256.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jad));
                    textView.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, i65.a.i(activity, com.p314xaae8f345.mm.R.C30861xcebc809e.blc), (android.graphics.drawable.Drawable) null);
                    break;
            }
        } else {
            textView.setText(activityC18114x28d7f256.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jaa));
            textView.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, i65.a.i(activity, com.p314xaae8f345.mm.R.C30861xcebc809e.blb), (android.graphics.drawable.Drawable) null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSource", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$CommentListAdapter");
    }
}
