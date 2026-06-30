package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes15.dex */
public class b extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f176464d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f176465e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public android.content.Context f176466f;

    public b(android.content.Context context) {
        this.f176466f = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.ArrayList) this.f176464d).size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe) ((java.util.ArrayList) this.f176464d).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.a aVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe c13038x357affe = (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe) ((java.util.ArrayList) this.f176464d).get(i17);
        if (view == null) {
            view = android.view.View.inflate(this.f176466f, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569804op, null);
            aVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.a(this);
            aVar.f176451a = (android.widget.RelativeLayout) view.findViewById(com.p314xaae8f345.mm.R.id.b99);
            aVar.f176452b = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.b_w);
            aVar.f176453c = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.b8b);
            aVar.f176454d = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f565110bb0);
            aVar.f176458h = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.nrk);
            aVar.f176459i = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f565111bb1);
            aVar.f176455e = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.bat);
            aVar.f176456f = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.b9b);
            aVar.f176457g = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f565120bc4);
            view.setTag(aVar);
        } else {
            aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.a) view.getTag();
        }
        if (c13038x357affe.c()) {
            aVar.f176452b.setVisibility(0);
            aVar.f176454d.setVisibility(0);
            aVar.f176458h.setVisibility(0);
            aVar.f176459i.setVisibility(8);
            aVar.f176453c.setVisibility(0);
            aVar.f176453c.setText(c13038x357affe.s0().f470085m);
            if (!c13038x357affe.X()) {
                aVar.f176454d.setText(c13038x357affe.s0().f470086n);
            } else if (c13038x357affe.s0().f470093s != null && c13038x357affe.s0().f470093s.size() == 1) {
                aVar.f176454d.setText(((r45.w50) c13038x357affe.s0().f470093s.get(0)).f470411d);
            } else if (c13038x357affe.s0().f470093s != null && c13038x357affe.s0().f470093s.size() == 2) {
                aVar.f176454d.setText(((r45.w50) c13038x357affe.s0().f470093s.get(0)).f470411d + "-" + ((r45.w50) c13038x357affe.s0().f470093s.get(1)).f470411d);
            }
            if (c13038x357affe.s0().U == 1) {
                aVar.f176455e.setVisibility(0);
            } else {
                aVar.f176455e.setVisibility(8);
            }
            long j17 = c13038x357affe.f67733xfb71c908;
            long j18 = c13038x357affe.f67742x849cdd56;
            if (j18 > 0 && j17 > 0) {
                aVar.f176458h.setText(this.f176466f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.aw6, lu1.a0.f(j17) + "  -  " + lu1.a0.f(c13038x357affe.f67742x849cdd56)));
                aVar.f176458h.setVisibility(0);
            } else if (j18 > 0) {
                aVar.f176458h.setText(this.f176466f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572346aw5, lu1.a0.f(j18)));
                aVar.f176458h.setVisibility(0);
            } else {
                aVar.f176458h.setText("");
                aVar.f176458h.setVisibility(8);
            }
            lu1.g0.b(aVar.f176452b, c13038x357affe.s0().f470079e, this.f176466f.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561718qr), com.p314xaae8f345.mm.R.C30861xcebc809e.cbt, true);
            if (c13038x357affe.s0().S == 1) {
                aVar.f176452b.setAlpha(255);
                aVar.f176457g.setVisibility(8);
                aVar.f176454d.setTextColor(this.f176466f.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560314h1));
                aVar.f176453c.setTextColor(this.f176466f.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560314h1));
                aVar.f176458h.setTextColor(this.f176466f.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560744sz));
            } else {
                aVar.f176457g.setText(c13038x357affe.s0().T);
                aVar.f176452b.setAlpha(90);
                aVar.f176457g.setVisibility(0);
                aVar.f176454d.setTextColor(this.f176466f.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560744sz));
                aVar.f176453c.setTextColor(this.f176466f.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560744sz));
                aVar.f176458h.setTextColor(this.f176466f.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560744sz));
            }
            int intValue = ((java.lang.Integer) this.f176465e.get(c13038x357affe.f67737xf4648834)).intValue();
            if (intValue == 1) {
                aVar.f176456f.setText("");
                aVar.f176456f.setVisibility(8);
            } else {
                aVar.f176456f.setText("x" + intValue);
                aVar.f176456f.setVisibility(0);
            }
        } else {
            aVar.f176452b.setVisibility(8);
            aVar.f176454d.setVisibility(8);
            aVar.f176453c.setVisibility(8);
            aVar.f176458h.setVisibility(8);
            aVar.f176457g.setVisibility(8);
            aVar.f176456f.setVisibility(8);
            aVar.f176459i.setVisibility(0);
            aVar.f176451a.setBackgroundColor(this.f176466f.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560324hb));
            aVar.f176459i.setText(this.f176466f.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.auh));
        }
        return view;
    }
}
