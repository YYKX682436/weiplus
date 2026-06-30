package nn1;

/* loaded from: classes12.dex */
public class e extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.n2 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1252x2ca13667.ActivityC12832x56c88de f420192e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1252x2ca13667.ActivityC12832x56c88de activityC12832x56c88de, java.lang.String[] strArr, int i17) {
        super(strArr, i17);
        this.f420192e = activityC12832x56c88de;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p2
    public java.lang.CharSequence b(int i17) {
        if (i17 == 2) {
            return this.f420192e.f174059z;
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p2
    public boolean d(int i17) {
        android.view.View view;
        final com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1252x2ca13667.ActivityC12832x56c88de activityC12832x56c88de = this.f420192e;
        if (i17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1252x2ca13667.ActivityC12832x56c88de activityC12832x56c88de2 = this.f420192e;
            activityC12832x56c88de2.f7(0, 0L, 0L, activityC12832x56c88de2.f174055v);
        } else if (i17 == 1) {
            this.f420192e.f7(1, java.lang.System.currentTimeMillis() - 7862400000L, java.lang.System.currentTimeMillis(), activityC12832x56c88de.f174055v);
        } else if (i17 == 2) {
            final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(activityC12832x56c88de.mo55332x76847179());
            android.view.View inflate = android.view.LayoutInflater.from(activityC12832x56c88de.mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569705jc, (android.view.ViewGroup) null);
            inflate.findViewById(com.p314xaae8f345.mm.R.id.f565291bz2).setOnClickListener(new android.view.View.OnClickListener() { // from class: nn1.d$$c
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1252x2ca13667.ActivityC12832x56c88de.K;
                    java.lang.Object obj = new java.lang.Object();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var2 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1.this;
                    arrayList.add(y1Var2);
                    arrayList.add(view2);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", obj, array);
                    y1Var2.q();
                    yj0.a.h(new java.lang.Object(), "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            activityC12832x56c88de.E = inflate.findViewById(com.p314xaae8f345.mm.R.id.abp);
            activityC12832x56c88de.f174052s = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.abk);
            activityC12832x56c88de.E.setOnClickListener(new android.view.View.OnClickListener() { // from class: nn1.d$$d
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1252x2ca13667.ActivityC12832x56c88de.K;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1252x2ca13667.ActivityC12832x56c88de activityC12832x56c88de3 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1252x2ca13667.ActivityC12832x56c88de.this;
                    activityC12832x56c88de3.getClass();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var2 = y1Var;
                    arrayList.add(y1Var2);
                    arrayList.add(view2);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", activityC12832x56c88de3, array);
                    long j17 = activityC12832x56c88de3.A;
                    long j18 = activityC12832x56c88de3.B;
                    if (j17 >= j18) {
                        activityC12832x56c88de3.f174052s.setVisibility(0);
                        yj0.a.h(activityC12832x56c88de3, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        return;
                    }
                    activityC12832x56c88de3.f7(1, j17, j18, activityC12832x56c88de3.f174055v);
                    y1Var2.q();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    java.text.SimpleDateFormat simpleDateFormat = activityC12832x56c88de3.f174058y;
                    sb6.append(simpleDateFormat.format(new java.util.Date(activityC12832x56c88de3.f174056w)));
                    sb6.append("~");
                    sb6.append(simpleDateFormat.format(new java.util.Date(activityC12832x56c88de3.f174057x)));
                    activityC12832x56c88de3.f174059z = sb6.toString();
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p2 p2Var = activityC12832x56c88de3.H;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w2 w2Var = p2Var.f293478a;
                    if (w2Var != null) {
                        w2Var.a(p2Var);
                    }
                    yj0.a.h(activityC12832x56c88de3, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            activityC12832x56c88de.E.setEnabled(false);
            activityC12832x56c88de.C = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.abm);
            activityC12832x56c88de.D = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.ab8);
            long j17 = activityC12832x56c88de.A;
            if (j17 > 0) {
                activityC12832x56c88de.h7(activityC12832x56c88de.C, j17);
            }
            long j18 = activityC12832x56c88de.B;
            if (j18 > 0) {
                activityC12832x56c88de.h7(activityC12832x56c88de.D, j18);
            }
            if (activityC12832x56c88de.B != 0 && activityC12832x56c88de.A != 0 && (view = activityC12832x56c88de.E) != null) {
                view.setEnabled(true);
            }
            activityC12832x56c88de.C.setOnClickListener(new android.view.View.OnClickListener() { // from class: nn1.d$$e
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1252x2ca13667.ActivityC12832x56c88de.K;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1252x2ca13667.ActivityC12832x56c88de activityC12832x56c88de3 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1252x2ca13667.ActivityC12832x56c88de.this;
                    activityC12832x56c88de3.getClass();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view2);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", activityC12832x56c88de3, array);
                    activityC12832x56c88de3.e7(true);
                    if (activityC12832x56c88de3.B != 0 && activityC12832x56c88de3.A != 0) {
                        activityC12832x56c88de3.E.setEnabled(true);
                    }
                    yj0.a.h(activityC12832x56c88de3, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            activityC12832x56c88de.D.setOnClickListener(new android.view.View.OnClickListener() { // from class: nn1.d$$f
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1252x2ca13667.ActivityC12832x56c88de.K;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1252x2ca13667.ActivityC12832x56c88de activityC12832x56c88de3 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1252x2ca13667.ActivityC12832x56c88de.this;
                    activityC12832x56c88de3.getClass();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view2);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", activityC12832x56c88de3, array);
                    activityC12832x56c88de3.e7(false);
                    if (activityC12832x56c88de3.B != 0 && activityC12832x56c88de3.A != 0) {
                        activityC12832x56c88de3.E.setEnabled(true);
                    }
                    yj0.a.h(activityC12832x56c88de3, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            y1Var.k(inflate);
            y1Var.s();
        }
        long a76 = activityC12832x56c88de.a7(activityC12832x56c88de.f174041e.f420170e);
        if (activityC12832x56c88de.F && a76 > 0) {
            activityC12832x56c88de.f174051r.setVisibility(0);
            activityC12832x56c88de.g7(a76);
        } else if (a76 == 0) {
            activityC12832x56c88de.f174051r.setVisibility(8);
        }
        super.d(i17);
        return true;
    }
}
