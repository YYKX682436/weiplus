package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e;

/* loaded from: classes9.dex */
public class n0 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f293829d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.HashMap f293830e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public java.util.ArrayList f293831f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.p0 f293832g;

    public n0(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.p0 p0Var, android.content.Context context) {
        this.f293832g = p0Var;
        this.f293829d = context;
    }

    public java.util.ArrayList a() {
        if (this.f293830e == null) {
            return null;
        }
        this.f293831f = new java.util.ArrayList();
        for (int i17 = 0; i17 < getCount(); i17++) {
            if (((java.lang.Boolean) this.f293830e.get(java.lang.Integer.valueOf(i17))).booleanValue()) {
                this.f293831f.add(java.lang.Integer.valueOf(i17));
            }
        }
        return this.f293831f;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f293832g.f293853l.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return ((java.util.ArrayList) this.f293832g.f293853l.f309877d).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.m0 m0Var;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.p0 p0Var = this.f293832g;
        db5.h4 h4Var = (db5.h4) ((java.util.ArrayList) p0Var.f293853l.f309877d).get(i17);
        android.view.LayoutInflater from = android.view.LayoutInflater.from(this.f293829d);
        if (view == null) {
            view = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.byr, (android.view.ViewGroup) null);
            m0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.m0(this);
            m0Var.f293828d = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.hic);
            m0Var.f293827c = (android.widget.CheckBox) view.findViewById(com.p314xaae8f345.mm.R.id.hha);
            m0Var.f293825a = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.hjn);
            m0Var.f293826b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.hhg);
            view.setTag(m0Var);
        } else {
            m0Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.m0) view.getTag();
        }
        m0Var.f293825a.setText(h4Var.getTitle());
        m0Var.f293828d.setOnClickListener(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.l0(this, i17, h4Var));
        if (m0Var.f293826b != null) {
            java.lang.CharSequence charSequence = h4Var.f309906q;
            if (charSequence == null || charSequence.length() <= 0) {
                m0Var.f293826b.setVisibility(8);
            } else {
                m0Var.f293826b.setVisibility(0);
                m0Var.f293826b.setText(h4Var.f309906q);
            }
        }
        if (h4Var.f309908s) {
            m0Var.f293825a.setTextColor(p0Var.f293844c.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560261fj));
            m0Var.f293826b.setTextColor(p0Var.f293844c.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560261fj));
            m0Var.f293827c.setChecked(((java.lang.Boolean) this.f293830e.get(java.lang.Integer.valueOf(i17))).booleanValue());
            m0Var.f293827c.setEnabled(false);
        } else {
            m0Var.f293825a.setTextColor(p0Var.f293844c.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560260fi));
            m0Var.f293826b.setTextColor(p0Var.f293844c.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560262fk));
            m0Var.f293827c.setChecked(((java.lang.Boolean) this.f293830e.get(java.lang.Integer.valueOf(i17))).booleanValue());
            m0Var.f293827c.setEnabled(true);
        }
        return view;
    }
}
