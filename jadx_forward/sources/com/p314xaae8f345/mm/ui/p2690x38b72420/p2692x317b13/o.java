package com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13;

/* loaded from: classes11.dex */
public class o implements com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.p f288441a;

    public o(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.p pVar) {
        this.f288441a = pVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c
    public android.view.View a(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = i65.a.D(context) ? android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ck7, viewGroup, false) : android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ck6, viewGroup, false);
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.p pVar = this.f288441a;
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.n nVar = pVar.G;
        nVar.f288430b = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.a_4);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.odf);
        nVar.f288431c = textView;
        textView.setMaxWidth(i65.a.b(context, 200));
        nVar.f288433e = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.cut);
        nVar.f288432d = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.o_q);
        nVar.f288429a = inflate.findViewById(com.p314xaae8f345.mm.R.id.mjc);
        nVar.f288434f = (android.widget.CheckBox) inflate.findViewById(com.p314xaae8f345.mm.R.id.mie);
        nVar.f288435g = inflate.findViewById(com.p314xaae8f345.mm.R.id.m38);
        if (pVar.f288373i) {
            nVar.f288429a.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562843q6);
        }
        inflate.setTag(nVar);
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c
    public boolean b(android.content.Context context, android.view.View view, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.p pVar = this.f288441a;
        if (pVar.C == null) {
            return false;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).xj(pVar.f288381q, pVar.C, 1);
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c
    public void c(android.content.Context context, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.b bVar, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar, boolean z17, boolean z18) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.n nVar = (com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.n) bVar;
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.p pVar = (com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.p) dVar;
        java.lang.String str = pVar.f288352z;
        if (str == null || str.length() <= 0) {
            nVar.f288430b.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bhm);
        } else {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(nVar.f288430b, pVar.f288352z, 0.1f);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(pVar.f288351y, nVar.f288431c);
        if (c01.e2.R(pVar.f288352z)) {
            android.graphics.drawable.Drawable drawable = context.getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f80791xd2795aeb);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            nVar.f288431c.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, drawable, (android.graphics.drawable.Drawable) null);
        } else {
            nVar.f288431c.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(pVar.E, nVar.f288433e);
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(pVar.D, nVar.f288432d);
        nVar.f288434f.setVisibility(4);
        android.view.View view = nVar.f288435g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/contact/item/ChatroomMemberDetailDataItem$ChatroomViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem$BaseContactViewHolder;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/contact/item/ChatroomMemberDetailDataItem$ChatroomViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem$BaseContactViewHolder;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
