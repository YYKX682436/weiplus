package tb4;

/* loaded from: classes11.dex */
public class c implements com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tb4.d f498556a;

    public c(tb4.d dVar) {
        this.f498556a = dVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c
    public android.view.View a(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("inflateView", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsSelectChatRoomDataItem$SnsChatRoomViewItem");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ctd, viewGroup, false);
        tb4.d dVar = this.f498556a;
        dVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createViewHolder", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsSelectChatRoomDataItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createViewHolder", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsSelectChatRoomDataItem");
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.n6w);
        tb4.a aVar = dVar.I;
        aVar.f498549a = imageView;
        aVar.f498550b = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568550n71);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.n6x);
        aVar.f498551c = textView;
        textView.setVisibility(8);
        aVar.f498552d = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568549n70);
        aVar.f498553e = (android.widget.CheckBox) inflate.findViewById(com.p314xaae8f345.mm.R.id.n6z);
        aVar.f498554f = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.n6y);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsSelectChatRoomDataItem");
        boolean z17 = dVar.G;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsSelectChatRoomDataItem");
        if (z17) {
            aVar.f498554f.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f81106x4448d04, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77687x3cb06c5)));
            aVar.f498554f.setOnClickListener(new tb4.b(this));
            aVar.f498554f.setVisibility(0);
        } else {
            aVar.f498554f.setVisibility(8);
        }
        inflate.setTag(aVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("inflateView", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsSelectChatRoomDataItem$SnsChatRoomViewItem");
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c
    public boolean b(android.content.Context context, android.view.View view, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onItemClick", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsSelectChatRoomDataItem$SnsChatRoomViewItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onItemClick", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsSelectChatRoomDataItem$SnsChatRoomViewItem");
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c
    public void c(android.content.Context context, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.b bVar, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar, boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillingViewItem", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsSelectChatRoomDataItem$SnsChatRoomViewItem");
        tb4.a aVar = (tb4.a) bVar;
        tb4.d dVar2 = (tb4.d) dVar;
        java.lang.String str = dVar2.f288352z;
        if (str == null || str.length() <= 0) {
            aVar.f498549a.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bhm);
        } else {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(aVar.f498549a, dVar2.f288352z, 0.1f);
        }
        u50.y yVar = (u50.y) i95.n0.c(u50.y.class);
        java.lang.CharSequence charSequence = dVar2.f288351y;
        android.widget.TextView textView = aVar.f498550b;
        ((s50.r0) yVar).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(charSequence, textView);
        if (c01.e2.R(dVar2.f288352z)) {
            android.graphics.drawable.Drawable drawable = context.getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f80791xd2795aeb);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            aVar.f498550b.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, drawable, (android.graphics.drawable.Drawable) null);
        } else {
            aVar.f498550b.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        }
        u50.y yVar2 = (u50.y) i95.n0.c(u50.y.class);
        java.lang.CharSequence charSequence2 = dVar2.D;
        android.widget.TextView textView2 = aVar.f498551c;
        ((s50.r0) yVar2).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(charSequence2, textView2);
        u50.y yVar3 = (u50.y) i95.n0.c(u50.y.class);
        java.lang.CharSequence charSequence3 = dVar2.C;
        android.widget.TextView textView3 = aVar.f498552d;
        ((s50.r0) yVar3).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(charSequence3, textView3);
        tb4.d dVar3 = this.f498556a;
        if (dVar3.f288369e) {
            if (z17) {
                aVar.f498553e.setChecked(true);
                aVar.f498553e.setEnabled(false);
                aVar.f498553e.setBackgroundResource(com.p314xaae8f345.mm.ui.bk.C() ? com.p314xaae8f345.mm.R.raw.f78844x4a24e2e : com.p314xaae8f345.mm.R.raw.f78843x2ecb5687);
            } else {
                aVar.f498553e.setChecked(z18);
                aVar.f498553e.setEnabled(true);
            }
            aVar.f498553e.setVisibility(0);
        } else {
            aVar.f498553e.setVisibility(8);
        }
        aVar.f498554f.setTag(dVar3.B);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillingViewItem", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsSelectChatRoomDataItem$SnsChatRoomViewItem");
    }
}
