package nn1;

/* loaded from: classes12.dex */
public class a extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1252x2ca13667.ActivityC12832x56c88de f420169d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f420170e = new java.util.HashSet();

    /* renamed from: f, reason: collision with root package name */
    public xn1.d f420171f;

    /* renamed from: g, reason: collision with root package name */
    public int f420172g;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1252x2ca13667.ActivityC12832x56c88de activityC12832x56c88de) {
        this.f420169d = activityC12832x56c88de;
    }

    public java.util.LinkedList a() {
        return this.f420171f.b();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        a();
        return a().size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (kn1.i) a().get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return -1L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(final int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        nn1.c cVar;
        java.lang.String e17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1252x2ca13667.ActivityC12832x56c88de activityC12832x56c88de = this.f420169d;
        if (view == null) {
            view = activityC12832x56c88de.getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569706je, viewGroup, false);
            cVar = new nn1.c(this);
            cVar.f420177a = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.a_4);
            cVar.f420178b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.odf);
            cVar.f420179c = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.cut);
            cVar.f420180d = (android.widget.CheckBox) view.findViewById(com.p314xaae8f345.mm.R.id.mie);
            cVar.f420181e = (android.widget.RelativeLayout) view.findViewById(com.p314xaae8f345.mm.R.id.mif);
            cVar.f420182f = (android.widget.ProgressBar) view.findViewById(com.p314xaae8f345.mm.R.id.imb);
            view.setTag(cVar);
        } else {
            cVar = (nn1.c) view.getTag();
        }
        view.setOnClickListener(new android.view.View.OnClickListener() { // from class: nn1.a$$a
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                nn1.a aVar = nn1.a.this;
                aVar.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                int i18 = i17;
                arrayList.add(java.lang.Integer.valueOf(i18));
                arrayList.add(view2);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", aVar, array);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Integer.valueOf(i18));
                arrayList2.add(view2);
                java.lang.Object[] array2 = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", aVar, array2);
                java.util.HashSet hashSet = aVar.f420170e;
                if (hashSet.contains(java.lang.Integer.valueOf(i18))) {
                    hashSet.remove(java.lang.Integer.valueOf(i18));
                } else {
                    hashSet.add(java.lang.Integer.valueOf(i18));
                }
                aVar.notifyDataSetChanged();
                aVar.f420169d.d7(hashSet);
                yj0.a.h(aVar, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                yj0.a.h(aVar, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        if (i17 >= getCount()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupMoveChooseAdapter", "getView error, position:%d, count:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(getCount()));
            return view;
        }
        kn1.i iVar = (kn1.i) a().get(i17);
        cVar.f420181e.setOnClickListener(new nn1.b(this, i17));
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(cVar.f420177a, iVar.f391158d, null);
        if (activityC12832x56c88de.F) {
            long j17 = iVar.f391161g;
            if (j17 >= 0) {
                if (this.f420172g == 1) {
                    cVar.f420179c.setText(kn1.k.v((float) iVar.f391160f[1]));
                } else {
                    cVar.f420179c.setText(kn1.k.v((float) j17));
                }
                cVar.f420179c.setVisibility(0);
                cVar.f420182f.setVisibility(8);
            } else {
                cVar.f420179c.setVisibility(8);
                cVar.f420182f.setVisibility(0);
            }
        } else {
            cVar.f420179c.setVisibility(8);
            cVar.f420182f.setVisibility(8);
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(iVar.f391158d)) {
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str = iVar.f391158d;
            ((sg3.a) v0Var).getClass();
            e17 = c01.a2.f(str, str);
        } else {
            tg3.v0 v0Var2 = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str2 = iVar.f391158d;
            ((sg3.a) v0Var2).getClass();
            e17 = c01.a2.e(str2);
        }
        android.widget.TextView textView = cVar.f420178b;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        if (e17 == null) {
            e17 = "群聊";
        }
        float textSize = cVar.f420178b.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(activityC12832x56c88de, e17, textSize));
        if (this.f420170e.contains(java.lang.Integer.valueOf(i17))) {
            cVar.f420180d.setChecked(true);
        } else {
            cVar.f420180d.setChecked(false);
        }
        return view;
    }
}
