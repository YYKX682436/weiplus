package com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui;

/* loaded from: classes11.dex */
public class a0 extends com.p314xaae8f345.mm.ui.z9 {

    /* renamed from: o, reason: collision with root package name */
    public final android.content.Context f243768o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.LayoutInflater f243769p;

    /* renamed from: q, reason: collision with root package name */
    public int f243770q;

    public a0(android.content.Context context) {
        super(context, new c34.t());
        this.f243770q = 20;
        this.f243768o = context;
        this.f243769p = android.view.LayoutInflater.from(context);
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        c34.t tVar = (c34.t) obj;
        if (tVar == null) {
            tVar = new c34.t();
        }
        tVar.mo9015xbf5d97fd(cursor);
        return tVar;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.z zVar;
        android.view.View view2;
        java.lang.String quantityString;
        if (view == null) {
            view2 = this.f243769p.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cmn, viewGroup, false);
            zVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.z(this);
            zVar.f243889a = (com.p314xaae8f345.mm.ui.C21405x85fc1ce0) view2.findViewById(com.p314xaae8f345.mm.R.id.f568420mr5);
            zVar.f243890b = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.mr7);
            zVar.f243891c = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.f568419mr4);
            zVar.f243892d = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.mr6);
            view2.setTag(zVar);
        } else {
            zVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.z) view.getTag();
            view2 = view;
        }
        c34.t tVar = (c34.t) getItem(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.f1.b(zVar.f243889a, tVar.f4168x7b28c57e, com.p314xaae8f345.mm.R.raw.f78435x7b83bce4, false);
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(tVar.f4169x29dd02d3);
        android.content.Context context = this.f243768o;
        if (K0) {
            zVar.f243890b.setVisibility(8);
        } else {
            android.widget.TextView textView = zVar.f243890b;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str = tVar.f4169x29dd02d3;
            float textSize = zVar.f243890b.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, str, textSize));
            zVar.f243890b.setVisibility(0);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(tVar.f4159x225aa2b6)) {
            zVar.f243891c.setVisibility(8);
        } else {
            android.widget.TextView textView2 = zVar.f243891c;
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str2 = tVar.f4159x225aa2b6;
            float textSize2 = zVar.f243891c.getTextSize();
            ((ke0.e) xVar2).getClass();
            textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, str2, textSize2));
            zVar.f243891c.setVisibility(0);
        }
        android.widget.TextView textView3 = zVar.f243892d;
        long j17 = tVar.f4158xad24a2e * 1000;
        java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar();
        if (j17 < 3600000) {
            quantityString = "";
        } else {
            long timeInMillis = gregorianCalendar.getTimeInMillis() - j17;
            long j18 = timeInMillis / 3600000;
            if (j18 == 0) {
                int i18 = (int) (timeInMillis / 60000);
                int i19 = i18 >= 1 ? i18 : 1;
                quantityString = context.getResources().getQuantityString(com.p314xaae8f345.mm.R.C30866xe3ab596f.f571207k, i19, java.lang.Integer.valueOf(i19));
            } else {
                java.util.GregorianCalendar gregorianCalendar2 = new java.util.GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5));
                long timeInMillis2 = j17 - gregorianCalendar2.getTimeInMillis();
                if (timeInMillis2 <= 0 || timeInMillis2 > 86400000) {
                    long timeInMillis3 = (j17 - gregorianCalendar2.getTimeInMillis()) + 86400000;
                    if (timeInMillis3 <= 0 || timeInMillis3 > 86400000) {
                        int i27 = (int) (timeInMillis / 86400000);
                        int i28 = i27 < 1 ? 1 : i27;
                        quantityString = context.getResources().getQuantityString(com.p314xaae8f345.mm.R.C30866xe3ab596f.f571208l, i28, java.lang.Integer.valueOf(i28));
                    } else {
                        quantityString = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fdi);
                    }
                } else {
                    int i29 = (int) j18;
                    int i37 = i29 < 1 ? 1 : i29;
                    quantityString = context.getResources().getQuantityString(com.p314xaae8f345.mm.R.C30866xe3ab596f.f571206j, i37, java.lang.Integer.valueOf(i37));
                }
            }
        }
        textView3.setText(quantityString);
        return view2;
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void o() {
        q();
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void q() {
        c34.u Ri = c34.h0.Ri();
        s(Ri.f119776d.B("SELECT * FROM " + Ri.mo145255x88e404c3() + " ORDER BY rowid DESC LIMIT " + this.f243770q, null));
        notifyDataSetChanged();
    }
}
