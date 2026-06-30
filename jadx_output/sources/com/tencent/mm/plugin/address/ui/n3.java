package com.tencent.mm.plugin.address.ui;

/* loaded from: classes12.dex */
public class n3 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.address.ui.WalletSelectAddrUI f74602d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f74603e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public boolean f74604f = false;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.WalletSelectAddrUI f74605g;

    public n3(com.tencent.mm.plugin.address.ui.WalletSelectAddrUI walletSelectAddrUI, com.tencent.mm.plugin.address.ui.WalletSelectAddrUI walletSelectAddrUI2) {
        this.f74605g = walletSelectAddrUI;
        this.f74602d = walletSelectAddrUI2;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f74603e.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (s71.b) this.f74603e.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.address.ui.m3 m3Var = new com.tencent.mm.plugin.address.ui.m3(this);
        com.tencent.mm.plugin.address.ui.WalletSelectAddrUI walletSelectAddrUI = this.f74602d;
        com.tencent.mm.plugin.address.ui.WalletSelectAddrUI walletSelectAddrUI2 = this.f74605g;
        if (view == null) {
            view = android.view.View.inflate(walletSelectAddrUI, com.tencent.mm.R.layout.d4z, null);
            m3Var.f74590a = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.sbi);
            m3Var.f74591b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f482740mn);
            m3Var.f74592c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f482747mv);
            m3Var.f74593d = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.sbh);
            m3Var.f74594e = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.ptv);
            m3Var.f74595f = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.sbg);
            m3Var.f74596g = (android.widget.FrameLayout) view.findViewById(com.tencent.mm.R.id.sbf);
            m3Var.f74597h = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.sbn);
            if (walletSelectAddrUI2.f74506y) {
                view.setBackgroundResource(com.tencent.mm.R.drawable.f481309q5);
                m3Var.f74590a.setTextColor(walletSelectAddrUI2.getContext().getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_5));
                m3Var.f74591b.setTextColor(walletSelectAddrUI2.getContext().getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
                m3Var.f74592c.setTextColor(walletSelectAddrUI2.getContext().getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_5));
                m3Var.f74593d.setTextColor(walletSelectAddrUI2.getContext().getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_5));
                m3Var.f74594e.setIconColor(walletSelectAddrUI2.getContext().getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
                m3Var.f74595f.setIconColor(walletSelectAddrUI2.getContext().getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
            }
            view.setTag(m3Var);
        } else {
            m3Var = (com.tencent.mm.plugin.address.ui.m3) view.getTag();
        }
        s71.b bVar = (s71.b) this.f74603e.get(i17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (!android.text.TextUtils.isEmpty(bVar.f403972f)) {
            sb6.append(bVar.f403972f);
        }
        if (!android.text.TextUtils.isEmpty(bVar.f403973g)) {
            sb6.append(" ");
            sb6.append(bVar.f403973g);
        }
        if (!android.text.TextUtils.isEmpty(bVar.f403974h)) {
            sb6.append(" ");
            sb6.append(bVar.f403974h);
        }
        if (!android.text.TextUtils.isEmpty(bVar.f403980q)) {
            sb6.append(" ");
            sb6.append(bVar.f403980q);
        }
        m3Var.f74590a.setText(sb6.toString());
        m3Var.f74591b.setText(bVar.f403976m);
        m3Var.f74592c.setText(bVar.f403977n);
        m3Var.f74593d.setText(bVar.f403978o);
        m3Var.f74594e.setOnClickListener(new com.tencent.mm.plugin.address.ui.i3(this, bVar));
        m3Var.f74595f.setOnClickListener(new com.tencent.mm.plugin.address.ui.j3(this, bVar));
        m3Var.f74596g.setOnClickListener(new com.tencent.mm.plugin.address.ui.k3(this));
        if (walletSelectAddrUI2.f74499r) {
            m3Var.f74594e.setVisibility(8);
        }
        if (walletSelectAddrUI2.getIntent().hasExtra("KEY_ITEM_SHOW_EDIT")) {
            if (walletSelectAddrUI2.getIntent().getBooleanExtra("KEY_ITEM_SHOW_EDIT", false)) {
                m3Var.f74595f.setVisibility(0);
            } else {
                m3Var.f74595f.setVisibility(8);
            }
        }
        if (walletSelectAddrUI2.getIntent().hasExtra("KEY_ITEM_SHOW_COPY")) {
            if (walletSelectAddrUI2.getIntent().getBooleanExtra("KEY_ITEM_SHOW_COPY", false)) {
                m3Var.f74594e.setVisibility(0);
            } else {
                m3Var.f74594e.setVisibility(8);
            }
        }
        if (this.f74604f) {
            s71.b bVar2 = walletSelectAddrUI.f74491g;
            if (bVar2 == null || bVar.f403970d != bVar2.f403970d) {
                m3Var.f74597h.setVisibility(4);
            } else {
                m3Var.f74597h.setVisibility(0);
            }
        } else {
            m3Var.f74597h.setVisibility(8);
        }
        return view;
    }
}
