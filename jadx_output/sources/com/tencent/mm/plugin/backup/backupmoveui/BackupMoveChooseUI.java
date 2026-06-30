package com.tencent.mm.plugin.backup.backupmoveui;

@db5.a(3)
/* loaded from: classes12.dex */
public class BackupMoveChooseUI extends com.tencent.mm.ui.MMWizardActivity {
    public static final /* synthetic */ int K = 0;
    public long A;
    public long B;
    public android.widget.TextView C;
    public android.widget.TextView D;
    public android.view.View E;
    public com.tencent.mm.ui.widget.dialog.p2 H;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ListView f92509f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f92510g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f92511h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ProgressBar f92512i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f92513m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.MMFilterDialog f92514n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.LinearLayout f92515o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.LinearLayout f92516p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f92517q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f92518r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f92519s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.Button f92520t;

    /* renamed from: w, reason: collision with root package name */
    public long f92523w;

    /* renamed from: x, reason: collision with root package name */
    public long f92524x;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f92526z;

    /* renamed from: e, reason: collision with root package name */
    public final nn1.a f92508e = new nn1.a(this);

    /* renamed from: u, reason: collision with root package name */
    public int f92521u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f92522v = 0;

    /* renamed from: y, reason: collision with root package name */
    public final java.text.SimpleDateFormat f92525y = new java.text.SimpleDateFormat("yyyy.MM.dd");
    public boolean F = false;
    public boolean G = false;
    public final ln1.m I = new nn1.i(this);

    /* renamed from: J, reason: collision with root package name */
    public final ln1.n f92507J = new nn1.k(this);

    public void Z6() {
    }

    public long a7(java.util.HashSet hashSet) {
        java.util.LinkedList b17 = b7().b();
        long j17 = 0;
        if (b17.size() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BackupMoveChooseUI", "onClickCheckBox convInfo is null.");
            return 0L;
        }
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Integer) it.next()).intValue();
            if (intValue < b17.size()) {
                j17 += this.f92522v == 1 ? ((kn1.i) b17.get(intValue)).f309627f[1] : ((kn1.i) b17.get(intValue)).f309628g;
            }
        }
        return j17;
    }

    public xn1.d b7() {
        return mn1.d.i().l();
    }

    public kn1.l c7() {
        return mn1.d.i().k();
    }

    public void d7(java.util.HashSet hashSet) {
        java.util.LinkedList b17 = b7().b();
        if (b17.size() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BackupMoveChooseUI", "onClickCheckBox convInfo is null.");
            return;
        }
        java.util.HashSet hashSet2 = new java.util.HashSet();
        java.util.Iterator it = hashSet.iterator();
        long j17 = 0;
        while (it.hasNext()) {
            int intValue = ((java.lang.Integer) it.next()).intValue();
            if (intValue < b17.size()) {
                j17 = this.f92522v == 1 ? j17 + ((kn1.i) b17.get(intValue)).f309627f[1] : j17 + ((kn1.i) b17.get(intValue)).f309628g;
            } else {
                hashSet2.add(java.lang.Integer.valueOf(intValue));
            }
        }
        java.util.Iterator it6 = hashSet2.iterator();
        while (it6.hasNext()) {
            hashSet.remove((java.lang.Integer) it6.next());
        }
        if (hashSet.size() != 0 || j17 > 0) {
            this.f92520t.setEnabled(true);
            if (hashSet.size() == this.f92508e.getCount()) {
                this.f92510g.setText(com.tencent.mm.R.string.a76);
            } else {
                this.f92510g.setText(com.tencent.mm.R.string.f490681a75);
            }
            android.view.View view = this.f92513m;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "onClickCheckBox", "(Ljava/util/HashSet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "onClickCheckBox", "(Ljava/util/HashSet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f92515o.setVisibility(0);
            if (!this.F || j17 <= 0) {
                this.f92518r.setVisibility(8);
                this.f92516p.setVisibility(0);
                this.f92517q.setText(getString(com.tencent.mm.R.string.a7d, java.lang.Integer.valueOf(hashSet.size())));
            } else {
                this.f92518r.setVisibility(0);
                g7(j17);
            }
        } else {
            this.f92518r.setVisibility(8);
            this.f92520t.setEnabled(false);
            this.f92510g.setText(com.tencent.mm.R.string.f490681a75);
            this.f92517q.setText("");
        }
        i7();
    }

    public final void e7(final boolean z17) {
        com.tencent.mm.ui.widget.picker.o oVar = new com.tencent.mm.ui.widget.picker.o(this);
        oVar.f212307n = new com.tencent.mm.ui.widget.picker.n() { // from class: nn1.d$$g
            @Override // com.tencent.mm.ui.widget.picker.n
            public final void onResult(boolean z18, int i17, int i18, int i19) {
                android.view.View view;
                int i27 = com.tencent.mm.plugin.backup.backupmoveui.BackupMoveChooseUI.K;
                com.tencent.mm.plugin.backup.backupmoveui.BackupMoveChooseUI backupMoveChooseUI = com.tencent.mm.plugin.backup.backupmoveui.BackupMoveChooseUI.this;
                backupMoveChooseUI.getClass();
                if (z18) {
                    java.util.Calendar calendar = java.util.Calendar.getInstance();
                    calendar.set(i17, i18 - 1, i19);
                    if (z17) {
                        calendar.set(11, 0);
                        calendar.set(12, 0);
                        calendar.set(13, 0);
                        calendar.set(14, 0);
                        long timeInMillis = calendar.getTimeInMillis();
                        backupMoveChooseUI.A = timeInMillis;
                        backupMoveChooseUI.h7(backupMoveChooseUI.C, timeInMillis);
                    } else {
                        calendar.set(11, 23);
                        calendar.set(12, 59);
                        calendar.set(13, 59);
                        calendar.set(14, 999);
                        long timeInMillis2 = calendar.getTimeInMillis();
                        backupMoveChooseUI.B = timeInMillis2;
                        backupMoveChooseUI.h7(backupMoveChooseUI.D, timeInMillis2);
                    }
                    if (backupMoveChooseUI.B == 0 || backupMoveChooseUI.A == 0 || (view = backupMoveChooseUI.E) == null) {
                        return;
                    }
                    view.setEnabled(true);
                }
            }
        };
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        int i17 = calendar.get(1);
        int i18 = calendar.get(2) + 1;
        int i19 = calendar.get(5);
        oVar.d(i17, i18, i19);
        oVar.e(i17, i18, i19);
        oVar.f(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_CHANGE_ROTATION, 1, 21);
        oVar.h();
    }

    public void f7(int i17, long j17, long j18, int i18) {
        c7().a(i17, j17, j18, i18);
        this.f92522v = i18;
        if (this.f92521u == i17 && this.f92523w == j17 && this.f92524x == j18) {
            return;
        }
        this.f92521u = i17;
        this.f92523w = j17;
        this.f92524x = j18;
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupMoveChooseUI", "selectTimeAndType timeMode:%d, startTime:%d, endTime:%d, contentType:%d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(i18));
        if (this.f92521u == 1) {
            android.view.View view = this.f92513m;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "setSelectExtBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "setSelectExtBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f92515o.setVisibility(0);
        }
        if (this.f92522v == 1) {
            android.view.View view2 = this.f92513m;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "setSelectExtBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "setSelectExtBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f92515o.setVisibility(0);
        }
        i7();
        this.f92512i.setVisibility(0);
        this.f92511h.setVisibility(4);
        this.f92509f.setVisibility(4);
        b7().a(i18, i17, j17, j18);
    }

    public void g7(long j17) {
        this.f92518r.setText(getResources().getString(com.tencent.mm.R.string.a77, kn1.k.v((float) j17)));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488169j4;
    }

    public final void h7(android.widget.TextView textView, long j17) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTimeInMillis(j17);
        calendar.get(5);
        if (textView != null) {
            textView.setText(getString(com.tencent.mm.R.string.a7h, java.lang.Integer.valueOf(calendar.get(1)), java.lang.Integer.valueOf(calendar.get(2) + 1), java.lang.Integer.valueOf(calendar.get(5))));
            textView.setTextColor(getResources().getColor(com.tencent.mm.R.color.f478714f5));
        }
    }

    public final void i7() {
        if (this.f92516p.getVisibility() == 8) {
            android.view.View view = this.f92513m;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "updateChooseExtInfo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "updateChooseExtInfo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f92515o.setVisibility(8);
            return;
        }
        android.view.View view2 = this.f92513m;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "updateChooseExtInfo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "updateChooseExtInfo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f92515o.setVisibility(0);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        if (this.G) {
            setMMTitle(com.tencent.mm.R.string.ac9);
        } else {
            setMMTitle(com.tencent.mm.R.string.aca);
        }
        this.f92514n = (com.tencent.mm.ui.widget.dialog.MMFilterDialog) findViewById(com.tencent.mm.R.id.e4f);
        this.f92509f = (android.widget.ListView) findViewById(com.tencent.mm.R.id.aav);
        xn1.d b76 = b7();
        nn1.a aVar = this.f92508e;
        aVar.f338638f = b76;
        this.f92509f.setAdapter((android.widget.ListAdapter) aVar);
        this.f92509f.setEmptyView(findViewById(com.tencent.mm.R.id.aax));
        this.f92510g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f483321ab3);
        this.f92511h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.aaw);
        this.f92512i = (android.widget.ProgressBar) findViewById(com.tencent.mm.R.id.f483320ab2);
        this.f92513m = findViewById(com.tencent.mm.R.id.f483319ab1);
        this.f92515o = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.aaz);
        this.f92516p = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.f483322ab4);
        this.f92517q = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ab6);
        this.f92518r = (android.widget.TextView) findViewById(com.tencent.mm.R.id.abj);
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.f483323ab5)).setText(com.tencent.mm.R.string.a7t);
        setBackBtn(new android.view.MenuItem.OnMenuItemClickListener() { // from class: nn1.d$$a
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
                int i17 = com.tencent.mm.plugin.backup.backupmoveui.BackupMoveChooseUI.K;
                com.tencent.mm.plugin.backup.backupmoveui.BackupMoveChooseUI.this.finish();
                return false;
            }
        });
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.f483318ab0);
        this.f92520t = button;
        button.setOnClickListener(new android.view.View.OnClickListener() { // from class: nn1.d$$b
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i17 = com.tencent.mm.plugin.backup.backupmoveui.BackupMoveChooseUI.K;
                com.tencent.mm.plugin.backup.backupmoveui.BackupMoveChooseUI backupMoveChooseUI = com.tencent.mm.plugin.backup.backupmoveui.BackupMoveChooseUI.this;
                backupMoveChooseUI.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", backupMoveChooseUI, array);
                backupMoveChooseUI.Z6();
                yj0.a.h(backupMoveChooseUI, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        this.f92520t.setEnabled(false);
        this.f92510g.setOnClickListener(new nn1.g(this));
        if (b7().f455457f) {
            if (b7().b().size() == 0) {
                int i17 = this.f92521u;
                if (i17 == 0) {
                    this.f92511h.setText(com.tencent.mm.R.string.a7s);
                } else if (i17 == 1) {
                    this.f92511h.setText(com.tencent.mm.R.string.abz);
                }
                this.f92511h.setVisibility(0);
            }
            this.f92512i.setVisibility(4);
        } else if (b7().f455457f) {
            this.f92512i.setVisibility(4);
        } else {
            this.f92510g.setTextColor(getResources().getColor(com.tencent.mm.R.color.f478704el));
            this.f92510g.setClickable(false);
            this.f92512i.setVisibility(0);
        }
        android.content.res.Resources resources = getResources();
        nn1.e eVar = new nn1.e(this, resources.getStringArray(com.tencent.mm.R.array.f477973b), 0);
        this.H = eVar;
        com.tencent.mm.ui.widget.dialog.MMFilterDialog mMFilterDialog = this.f92514n;
        mMFilterDialog.getClass();
        eVar.f211945a = new com.tencent.mm.ui.widget.dialog.MMFilterDialog$$d(mMFilterDialog);
        ((java.util.ArrayList) mMFilterDialog.f211701q).add(eVar);
        mMFilterDialog.f211697m.notifyItemInserted(r5.size() - 1);
        java.lang.String[] stringArray = resources.getStringArray(com.tencent.mm.R.array.f477974c);
        java.lang.String[] split = (this.G ? stringArray[2] : stringArray[1]).split("\n");
        java.lang.String[] strArr = {stringArray[0], split[0]};
        com.tencent.mm.ui.widget.dialog.MMFilterDialog mMFilterDialog2 = this.f92514n;
        nn1.f fVar = new nn1.f(this, strArr, 0, split);
        mMFilterDialog2.getClass();
        fVar.f211945a = new com.tencent.mm.ui.widget.dialog.MMFilterDialog$$d(mMFilterDialog2);
        ((java.util.ArrayList) mMFilterDialog2.f211701q).add(fVar);
        mMFilterDialog2.f211697m.notifyItemInserted(r0.size() - 1);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i18 != -1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BackupMoveChooseUI", "onActivityResult result error! resultCode:%d", java.lang.Integer.valueOf(i18));
        } else {
            f7(intent.getIntExtra("BACKUP_SELECT_TIME_MODE", this.f92521u), intent.getLongExtra("BACKUP_SELECT_TIME_START_TIME", 0L), intent.getLongExtra("BACKUP_SELECT_TIME_END_TIME", 0L), intent.getIntExtra("BACKUP_SELECT_CONTENT_TYPE", this.f92522v));
        }
    }

    @Override // com.tencent.mm.ui.MMWizardActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
        this.F = getIntent().getBooleanExtra("isMigrate", false);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        b7().f455455d = this.I;
        b7().f455456e = this.f92507J;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        b7().f455455d = null;
        b7().f455456e = null;
    }
}
