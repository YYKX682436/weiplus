package un1;

/* loaded from: classes5.dex */
public class f implements com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.b {

    /* renamed from: a, reason: collision with root package name */
    public android.widget.LinearLayout f510970a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f510971b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.ImageView f510972c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f510973d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1255x7e7a1bd6.ActivityC12835xc2087912 f510974e;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1255x7e7a1bd6.ActivityC12835xc2087912 activityC12835xc2087912) {
        this.f510974e = activityC12835xc2087912;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.b
    public void a(android.graphics.drawable.Drawable drawable) {
        c();
        if (drawable == null) {
            this.f510970a.setVisibility(8);
            this.f510972c.setVisibility(8);
        } else {
            this.f510970a.setVisibility(0);
            this.f510972c.setVisibility(0);
            this.f510972c.setImageDrawable(drawable);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.b
    public void b(java.lang.String str, java.lang.Integer num) {
        c();
        this.f510971b.setText(str);
        if (str != null && !str.isEmpty()) {
            this.f510970a.setVisibility(0);
        }
        if (num != null) {
            this.f510971b.setTextColor(num.intValue());
        }
    }

    public final void c() {
        if (this.f510970a != null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1255x7e7a1bd6.ActivityC12835xc2087912 activityC12835xc2087912 = this.f510974e;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) activityC12835xc2087912.findViewById(com.p314xaae8f345.mm.R.id.rcx);
        this.f510970a = linearLayout;
        this.f510971b = (android.widget.TextView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.f569216sa0);
        this.f510972c = (android.widget.ImageView) this.f510970a.findViewById(com.p314xaae8f345.mm.R.id.qc9);
        this.f510973d = (android.widget.TextView) activityC12835xc2087912.findViewById(com.p314xaae8f345.mm.R.id.v3s);
        if (((u24.h) ((ct.c3) i95.n0.c(ct.c3.class))).wi()) {
            this.f510973d.setVisibility(0);
        } else {
            this.f510973d.setVisibility(8);
        }
        this.f510970a.setOnClickListener(new android.view.View.OnClickListener() { // from class: un1.f$$a
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                un1.f fVar = un1.f.this;
                fVar.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/backup/backupui/BackupChooseBackupModeUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", fVar, array);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(view);
                java.lang.Object[] array2 = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/plugin/backup/backupui/BackupChooseBackupModeUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", fVar, array2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupChooseBackupModeUI", "BackupChooseBackupModeUI onViewClick");
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1) ((mv.y) i95.n0.c(mv.y.class))).Ui()) {
                    un1.h hVar = new un1.h(fVar);
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1) ((mv.y) i95.n0.c(mv.y.class))).Zi(fVar.f510974e, hVar);
                }
                yj0.a.h(fVar, "com/tencent/mm/plugin/backup/backupui/BackupChooseBackupModeUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                yj0.a.h(fVar, "com/tencent/mm/plugin/backup/backupui/BackupChooseBackupModeUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
    }
}
