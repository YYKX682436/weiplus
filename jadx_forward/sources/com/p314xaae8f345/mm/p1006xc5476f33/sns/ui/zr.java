package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes11.dex */
public class zr extends com.p314xaae8f345.mm.ui.z9 {

    /* renamed from: o, reason: collision with root package name */
    public final android.content.Context f253240o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f253241p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18116x89222096 f253242q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zr(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18116x89222096 activityC18116x89222096, android.content.Context context) {
        super(context, new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.q2());
        this.f253242q = activityC18116x89222096;
        this.f253241p = false;
        this.f253240o = context;
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("convertFrom", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$TagAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.q2 q2Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.q2) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("convertFrom", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$TagAdapter");
        if (q2Var == null) {
            q2Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.q2();
        }
        q2Var.mo9015xbf5d97fd(cursor);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("convertFrom", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$TagAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("convertFrom", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$TagAdapter");
        return q2Var;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.yr yrVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getView", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$TagAdapter");
        if (view == null) {
            yrVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.yr(this);
            view2 = android.view.View.inflate(this.f253240o, com.p314xaae8f345.mm.R.C30864xbddafb2a.c8w, null);
            yrVar.f253175a = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.nwz);
            yrVar.f253176b = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.nbp);
            yrVar.f253177c = (android.widget.Button) view2.findViewById(com.p314xaae8f345.mm.R.id.crz);
            view2.setTag(yrVar);
        } else {
            view2 = view;
            yrVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.yr) view.getTag();
        }
        if (p(i17)) {
            yrVar.f253175a.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f574838jo4);
            yrVar.f253176b.setVisibility(8);
            yrVar.f253177c.setVisibility(8);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.q2 q2Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.q2) getItem(i17);
            yrVar.f253175a.setText(q2Var.f69154x183bff00 + "");
            yrVar.f253176b.setVisibility(0);
            yrVar.f253176b.setText(" (" + q2Var.f69151x28f0318a + ") ");
            yrVar.f253177c.setVisibility(this.f253241p ? 0 : 8);
            android.widget.Button button = yrVar.f253177c;
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18116x89222096.f248986h;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI");
            android.view.View.OnClickListener onClickListener = this.f253242q.f248990g;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI");
            button.setOnClickListener(onClickListener);
            yrVar.f253177c.setTag(java.lang.Integer.valueOf(i17));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getView", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$TagAdapter");
        return view2;
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public int m() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVirtualCount", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$TagAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVirtualCount", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$TagAdapter");
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void o() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initCursor", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$TagAdapter");
        c();
        q();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initCursor", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$TagAdapter");
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void q() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetCursor", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$TagAdapter");
        s(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Lj().J0());
        notifyDataSetChanged();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetCursor", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$TagAdapter");
    }
}
