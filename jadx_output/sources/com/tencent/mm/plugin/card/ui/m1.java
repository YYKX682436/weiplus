package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class m1 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardGiftReceiveUI f95075d;

    public m1(com.tencent.mm.plugin.card.ui.CardGiftReceiveUI cardGiftReceiveUI) {
        this.f95075d = cardGiftReceiveUI;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f95075d.f94822f.N.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (com.tencent.mm.plugin.card.model.CardGiftInfo.AccepterItem) this.f95075d.f94822f.N.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.card.ui.n1 n1Var;
        android.widget.ImageView imageView;
        com.tencent.mm.plugin.card.ui.CardGiftReceiveUI cardGiftReceiveUI = this.f95075d;
        com.tencent.mm.plugin.card.model.CardGiftInfo.AccepterItem accepterItem = (com.tencent.mm.plugin.card.model.CardGiftInfo.AccepterItem) cardGiftReceiveUI.f94822f.N.get(i17);
        if (view == null) {
            view = android.view.View.inflate(cardGiftReceiveUI, com.tencent.mm.R.layout.f488300pi, null);
            n1Var = new com.tencent.mm.plugin.card.ui.n1(cardGiftReceiveUI);
            n1Var.f95085a = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.hah);
            n1Var.f95086b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.okr);
            n1Var.f95087c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.okt);
            n1Var.f95088d = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.oks);
            view.setTag(n1Var);
        } else {
            n1Var = (com.tencent.mm.plugin.card.ui.n1) view.getTag();
        }
        if (accepterItem != null) {
            java.lang.String str = accepterItem.f94674g;
            if (str != null && (imageView = n1Var.f95085a) != null && !android.text.TextUtils.isEmpty(str)) {
                if (android.text.TextUtils.isEmpty(str)) {
                    imageView.setImageResource(com.tencent.mm.R.drawable.cbt);
                } else {
                    o11.f fVar = new o11.f();
                    fVar.f342083g = lp0.b.D();
                    fVar.f342082f = xt1.q.m(str);
                    fVar.f342078b = true;
                    fVar.f342096t = true;
                    fVar.f342097u = 3;
                    fVar.f342077a = true;
                    fVar.f342087k = 34;
                    fVar.f342086j = 34;
                    fVar.f342091o = com.tencent.mm.R.drawable.cbt;
                    n11.a.b().h(str, imageView, fVar.a());
                }
            }
            n1Var.f95086b.setText(accepterItem.f94673f);
            n1Var.f95087c.setText(accepterItem.f94671d);
            n1Var.f95088d.setText(accepterItem.f94672e + cardGiftReceiveUI.getContext().getString(com.tencent.mm.R.string.ask));
        }
        return view;
    }
}
