package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class o9 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f110369d = new java.util.ArrayList();

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public r45.q21 getItem(int i17) {
        boolean z17 = false;
        if (i17 >= 0 && i17 < this.f110369d.size()) {
            z17 = true;
        }
        if (!z17) {
            return new r45.q21();
        }
        java.lang.Object obj = this.f110369d.get(i17);
        kotlin.jvm.internal.o.d(obj);
        return (r45.q21) obj;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f110369d.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup parent) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(parent, "parent");
        if (view == null) {
            view = android.view.View.inflate(parent.getContext(), com.tencent.mm.R.layout.aqe, null);
            view.setTag(new com.tencent.mm.plugin.finder.feed.ui.n9(this, view));
        }
        java.lang.Object tag = view.getTag();
        com.tencent.mm.plugin.finder.feed.ui.n9 n9Var = tag instanceof com.tencent.mm.plugin.finder.feed.ui.n9 ? (com.tencent.mm.plugin.finder.feed.ui.n9) tag : null;
        if (n9Var != null) {
            r45.q21 item = getItem(i17);
            mn2.g1 g1Var = mn2.g1.f329975a;
            vo0.d l17 = g1Var.l();
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) item.getCustom(0);
            if (finderContact == null || (str = finderContact.getHeadUrl()) == null) {
                str = "";
            }
            l17.c(new mn2.n(str, null, 2, null), n9Var.f110332d, g1Var.h(mn2.f1.f329961o));
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.widget.TextView textView = n9Var.f110333e;
            android.content.Context context = textView.getContext();
            zl2.q4 q4Var = zl2.q4.f473933a;
            com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) item.getCustom(0);
            java.lang.String username = finderContact2 != null ? finderContact2.getUsername() : null;
            com.tencent.mm.protocal.protobuf.FinderContact finderContact3 = (com.tencent.mm.protocal.protobuf.FinderContact) item.getCustom(0);
            java.lang.String p17 = q4Var.p(username, finderContact3 != null ? finderContact3.getNickname() : null, false);
            ((ke0.e) xVar).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, p17));
        }
        return view;
    }
}
