package ja4;

/* loaded from: classes4.dex */
public class i extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f380164d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f380165e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.LayoutInflater f380166f;

    public i(android.content.Context context) {
        this.f380165e = context;
        this.f380166f = android.view.LayoutInflater.from(context);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f380164d.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (cb3.a) this.f380164d.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        ja4.h hVar;
        android.view.View view2;
        java.lang.String charSequence;
        if (view == null) {
            view2 = this.f380166f.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.csf, viewGroup, false);
            hVar = new ja4.h(this);
            hVar.f380159a = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.j6l);
            hVar.f380160b = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.j6p);
            hVar.f380161c = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.j6q);
            hVar.f380162d = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.j6j);
            hVar.f380163e = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.j6n);
            view2.setTag(hVar);
        } else {
            hVar = (ja4.h) view.getTag();
            view2 = view;
        }
        cb3.a aVar = (cb3.a) this.f380164d.get(i17);
        gm0.j1.i();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(aVar.f121876a, true);
        java.lang.String str = aVar.f121876a;
        if (str != null) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(hVar.f380159a, aVar.f121876a);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsLuckyMoneyReceivedRecordListAdapter", "the contact is null,by username:%s", str);
        }
        android.widget.TextView textView = hVar.f380161c;
        long j17 = aVar.f121877b * 1000;
        java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar();
        android.content.Context context = this.f380165e;
        if (j17 < 3600000) {
            charSequence = "";
        } else {
            long timeInMillis = j17 - new java.util.GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5)).getTimeInMillis();
            if (timeInMillis <= 0 || timeInMillis > 86400000) {
                android.text.format.Time time = new android.text.format.Time();
                time.set(j17);
                charSequence = k35.s.a(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573671fc5, " "), time).toString();
            } else {
                charSequence = new java.text.SimpleDateFormat("HH:mm").format(new java.util.Date(j17));
            }
        }
        textView.setText(charSequence);
        hVar.f380161c.setVisibility(0);
        if (n17 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.E(context, hVar.f380160b, n17.g2());
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsLuckyMoneyReceivedRecordListAdapter", "the contact is null,by username:%s", aVar.f121876a);
        }
        r45.vv3 vv3Var = new r45.vv3();
        try {
            r45.cu5 cu5Var = aVar.f121878c;
            if (cu5Var == null || cu5Var.f453372d <= 0) {
                hVar.f380162d.setVisibility(8);
                hVar.f380163e.setVisibility(0);
            } else {
                vv3Var.mo11468x92b714fd(x51.j1.d(cu5Var));
                long j18 = vv3Var.f470137d;
                if (j18 > 0) {
                    hVar.f380162d.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gna, com.p314xaae8f345.mm.p2802xd031a825.ui.r1.o(j18 / 100.0d)));
                    hVar.f380163e.setVisibility(8);
                } else {
                    hVar.f380162d.setVisibility(8);
                    hVar.f380163e.setVisibility(0);
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsLuckyMoneyReceivedRecordListAdapter", e17.getMessage() + "hbBuffer is error");
            hVar.f380162d.setVisibility(8);
            hVar.f380163e.setVisibility(8);
            hVar.f380159a.setVisibility(8);
            hVar.f380160b.setVisibility(8);
            hVar.f380161c.setVisibility(8);
        }
        return view2;
    }
}
