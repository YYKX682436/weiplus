package un1;

/* loaded from: classes12.dex */
public class d extends s35.b {

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f510959m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f510960n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f510961o;

    /* renamed from: p, reason: collision with root package name */
    public int f510962p;

    /* renamed from: q, reason: collision with root package name */
    public final int f510963q;

    public d(android.content.Context context) {
        super(context);
        this.f510959m = null;
        this.f510960n = null;
        this.f510962p = 100;
        this.f510963q = 100;
        un1.c cVar = new un1.c(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupChatBanner", "new BackupChatBanner.");
        if (!qn1.c.o().h()) {
            qn1.c.i().e().f391142a = -100;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 p17 = c01.d9.b().p();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_BACKUP_PC_MERGERING_BOOLEAN;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        boolean booleanValue = ((java.lang.Boolean) p17.m(u3Var, bool)).booleanValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupChatBanner", "initialize, isPcMerging:%s, isMoveMerging:%s", java.lang.Boolean.valueOf(booleanValue), java.lang.Boolean.valueOf(((java.lang.Boolean) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_BACKUP_MOVE_MERGERING_BOOLEAN, bool)).booleanValue()));
        if (booleanValue && qn1.c.i().k().g()) {
            kn1.f.f391134g = 1;
            qn1.c.i().e().f391142a = 24;
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        }
        qn1.c.i().l().f446483b = cVar;
        qn1.c.i().k().f446548i = cVar;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MMKV_BACKUP");
        boolean z19 = M.getBoolean("MMKV_BACKUP_NEED_REPORT", false);
        int i17 = M.getInt("MMKV_BACKUP_TRY_TIME", 0);
        if (!z19 || i17 <= 0) {
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).g(new un1.a(this, M, i17));
    }

    @Override // s35.b
    public void a() {
    }

    @Override // s35.b
    public int b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569707jk;
    }

    @Override // s35.b
    public int c() {
        return 3;
    }

    @Override // s35.b
    public void h(android.view.View view) {
        this.f510960n = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.ac7);
        this.f510959m = view.findViewById(com.p314xaae8f345.mm.R.id.f564862ac5);
        this.f510961o = view.findViewById(com.p314xaae8f345.mm.R.id.f564884af3);
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.f564862ac5);
        this.f510959m = findViewById;
        findViewById.setOnClickListener(new un1.b(this));
    }

    @Override // s35.b
    public boolean i() {
        boolean n17;
        int i17 = kn1.f.f391134g;
        if (i17 != 1) {
            n17 = false;
        } else {
            kn1.g e17 = qn1.c.i().e();
            e17.getClass();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            n17 = n(e17.f391142a);
        }
        if (n17) {
            f();
        } else if (!this.f484377i) {
            return false;
        }
        boolean z18 = this.f484372d;
        if (z18 && this.f484373e) {
            this.f510959m.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563717b73);
            this.f510960n.setBackground(null);
        } else if (z18) {
            this.f510961o.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.aj6);
            this.f510959m.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c7z);
            this.f510960n.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bfj);
        } else if (this.f484373e) {
            this.f510961o.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.aj6);
            this.f510959m.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bfj);
            this.f510960n.setBackground(null);
        } else {
            this.f510961o.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.aj6);
            this.f510959m.setBackground(null);
            this.f510960n.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bfj);
        }
        if (i17 == 1) {
            kn1.g e18 = qn1.c.i().e();
            e18.getClass();
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            m(e18.f391142a);
        } else if (i17 != 22) {
            android.view.View view = this.f510959m;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/backup/backupui/BackupChatBanner", "refreshAndReturnIsVisible", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/backup/backupui/BackupChatBanner", "refreshAndReturnIsVisible", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return n17;
    }

    public final void l(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupChatBanner", "jumpToBackupPcUI");
        java.lang.ref.WeakReference weakReference = this.f484375g;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.U0((android.content.Context) weakReference.get())) {
            if (qn1.c.i().j().g()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BackupChatBanner", new java.lang.Throwable(), "never run here", new java.lang.Object[0]);
                return;
            }
            android.content.Intent className = new android.content.Intent().setClassName((android.content.Context) weakReference.get(), "com.tencent.mm.plugin.backup.backuppcui.BackupPcUI");
            className.putExtra("isRecoverTransferFinishFromBanner", z17);
            com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.X6((android.content.Context) weakReference.get(), className);
        }
    }

    public final boolean m(int i17) {
        kn1.g e17 = qn1.c.i().e();
        boolean g17 = qn1.c.i().j().g();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupChatBanner", "refreshPcState:%d, isMigrating:%b", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(g17));
        android.widget.LinearLayout linearLayout = this.f484376h;
        java.lang.ref.WeakReference weakReference = this.f484375g;
        if (i17 == -25) {
            android.view.View view = this.f510959m;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/backup/backupui/BackupChatBanner", "refreshPcState", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/backup/backupui/BackupChatBanner", "refreshPcState", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (g17) {
                ((android.widget.ImageView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.ac6)).setImageDrawable(com.p314xaae8f345.mm.ui.uk.e((android.content.Context) weakReference.get(), com.p314xaae8f345.mm.R.raw.f80173xdad5ec9a, ((android.content.Context) weakReference.get()).getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77687x3cb06c5)));
            } else {
                ((android.widget.ImageView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.ac6)).setImageDrawable(com.p314xaae8f345.mm.ui.uk.e((android.content.Context) weakReference.get(), com.p314xaae8f345.mm.R.raw.f80082x2be9fe17, ((android.content.Context) weakReference.get()).getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77687x3cb06c5)));
            }
            ((android.widget.TextView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.ac7)).setText(linearLayout.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a8z));
            return true;
        }
        if (i17 == 14) {
            android.view.View view2 = this.f510959m;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/backup/backupui/BackupChatBanner", "refreshPcState", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/backup/backupui/BackupChatBanner", "refreshPcState", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (g17) {
                ((android.widget.ImageView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.ac6)).setImageDrawable(com.p314xaae8f345.mm.ui.uk.e((android.content.Context) weakReference.get(), com.p314xaae8f345.mm.R.raw.f80173xdad5ec9a, ((android.content.Context) weakReference.get()).getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77687x3cb06c5)));
                ((android.widget.TextView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.ac7)).setText(linearLayout.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.abf, sn1.i.L(), sn1.i.O()));
            } else {
                ((android.widget.ImageView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.ac6)).setImageDrawable(com.p314xaae8f345.mm.ui.uk.e((android.content.Context) weakReference.get(), com.p314xaae8f345.mm.R.raw.f80082x2be9fe17, ((android.content.Context) weakReference.get()).getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77687x3cb06c5)));
                android.widget.TextView textView = (android.widget.TextView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.ac7);
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                java.lang.Integer valueOf = java.lang.Integer.valueOf(e17.f391143b);
                java.lang.Integer valueOf2 = java.lang.Integer.valueOf(e17.f391144c);
                qn1.c.i().j().getClass();
                textView.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.abe, valueOf, valueOf2, sn1.i.O()));
            }
            return true;
        }
        if (i17 == 23) {
            android.view.View view3 = this.f510959m;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/backup/backupui/BackupChatBanner", "refreshPcState", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/backup/backupui/BackupChatBanner", "refreshPcState", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (g17) {
                ((android.widget.ImageView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.ac6)).setImageDrawable(com.p314xaae8f345.mm.ui.uk.e((android.content.Context) weakReference.get(), com.p314xaae8f345.mm.R.raw.f80173xdad5ec9a, ((android.content.Context) weakReference.get()).getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77687x3cb06c5)));
                ((android.widget.TextView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.ac7)).setText(linearLayout.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.abf, sn1.i.L(), sn1.i.O()));
            } else {
                ((android.widget.ImageView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.ac6)).setImageDrawable(com.p314xaae8f345.mm.ui.uk.e((android.content.Context) weakReference.get(), com.p314xaae8f345.mm.R.raw.f80082x2be9fe17, ((android.content.Context) weakReference.get()).getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77687x3cb06c5)));
                android.widget.TextView textView2 = (android.widget.TextView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.ac7);
                android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                java.lang.Integer valueOf3 = java.lang.Integer.valueOf(e17.f391143b);
                java.lang.Integer valueOf4 = java.lang.Integer.valueOf(e17.f391144c);
                qn1.c.i().j().getClass();
                textView2.setText(context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572225ab1, valueOf3, valueOf4, sn1.i.O()));
            }
            return true;
        }
        if (i17 == 4 || i17 == 5) {
            android.view.View view4 = this.f510959m;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/backup/backupui/BackupChatBanner", "refreshPcState", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/backup/backupui/BackupChatBanner", "refreshPcState", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (1 == qn1.c.i().j().f446494a || 3 == qn1.c.i().j().f446494a) {
                if (g17) {
                    ((android.widget.ImageView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.ac6)).setImageDrawable(com.p314xaae8f345.mm.ui.uk.e((android.content.Context) weakReference.get(), com.p314xaae8f345.mm.R.raw.f80173xdad5ec9a, ((android.content.Context) weakReference.get()).getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77687x3cb06c5)));
                    ((android.widget.TextView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.ac7)).setText(linearLayout.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.abf, sn1.i.L(), sn1.i.O()));
                } else {
                    ((android.widget.ImageView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.ac6)).setImageDrawable(com.p314xaae8f345.mm.ui.uk.e((android.content.Context) weakReference.get(), com.p314xaae8f345.mm.R.raw.f80082x2be9fe17, ((android.content.Context) weakReference.get()).getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77687x3cb06c5)));
                    android.widget.TextView textView3 = (android.widget.TextView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.ac7);
                    android.content.Context context3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    java.lang.Integer valueOf5 = java.lang.Integer.valueOf(e17.f391143b);
                    java.lang.Integer valueOf6 = java.lang.Integer.valueOf(e17.f391144c);
                    qn1.c.i().j().getClass();
                    textView3.setText(context3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.abe, valueOf5, valueOf6, sn1.i.O()));
                }
            } else if (2 == qn1.c.i().j().f446494a || 4 == qn1.c.i().j().f446494a) {
                if (g17) {
                    ((android.widget.ImageView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.ac6)).setImageDrawable(com.p314xaae8f345.mm.ui.uk.e((android.content.Context) weakReference.get(), com.p314xaae8f345.mm.R.raw.f80082x2be9fe17, ((android.content.Context) weakReference.get()).getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77687x3cb06c5)));
                    ((android.widget.TextView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.ac7)).setText(linearLayout.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.abf, sn1.i.L(), sn1.i.O()));
                } else {
                    ((android.widget.ImageView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.ac6)).setImageDrawable(com.p314xaae8f345.mm.ui.uk.e((android.content.Context) weakReference.get(), com.p314xaae8f345.mm.R.raw.f80082x2be9fe17, ((android.content.Context) weakReference.get()).getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77687x3cb06c5)));
                    android.widget.TextView textView4 = (android.widget.TextView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.ac7);
                    android.content.Context context4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    java.lang.Integer valueOf7 = java.lang.Integer.valueOf(e17.f391143b);
                    java.lang.Integer valueOf8 = java.lang.Integer.valueOf(e17.f391144c);
                    qn1.c.i().j().getClass();
                    textView4.setText(context4.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572225ab1, valueOf7, valueOf8, sn1.i.O()));
                }
            }
            return true;
        }
        if (i17 == this.f510962p) {
            return true;
        }
        this.f510962p = i17;
        if (i17 != -4) {
            if (i17 != 12) {
                if (i17 == 15) {
                    android.view.View view5 = this.f510959m;
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
                    arrayList5.add(0);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/backup/backupui/BackupChatBanner", "refreshPcState", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(view5, "com/tencent/mm/plugin/backup/backupui/BackupChatBanner", "refreshPcState", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    ((android.widget.ImageView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.ac6)).setImageDrawable(com.p314xaae8f345.mm.ui.uk.e((android.content.Context) weakReference.get(), com.p314xaae8f345.mm.R.raw.f80082x2be9fe17, ((android.content.Context) weakReference.get()).getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77687x3cb06c5)));
                    ((android.widget.TextView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.ac7)).setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(g17 ? com.p314xaae8f345.mm.R.C30867xcad56011.abg : com.p314xaae8f345.mm.R.C30867xcad56011.a_w));
                    return true;
                }
                if (i17 != 22) {
                    switch (i17) {
                        case 24:
                            if (qn1.c.o().f446504k) {
                                qn1.c.o().f446504k = false;
                                l(true);
                            }
                            ((android.widget.ImageView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.ac6)).setImageDrawable(com.p314xaae8f345.mm.ui.uk.e((android.content.Context) weakReference.get(), com.p314xaae8f345.mm.R.raw.f80082x2be9fe17, ((android.content.Context) weakReference.get()).getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77687x3cb06c5)));
                            ((android.widget.TextView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.ac7)).setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572227ab3));
                            return true;
                        case 25:
                            android.view.View view6 = this.f510959m;
                            java.util.ArrayList arrayList6 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal6 = zj0.c.f554818a;
                            arrayList6.add(0);
                            java.util.Collections.reverse(arrayList6);
                            yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/backup/backupui/BackupChatBanner", "refreshPcState", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                            yj0.a.f(view6, "com/tencent/mm/plugin/backup/backupui/BackupChatBanner", "refreshPcState", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            ((android.widget.ImageView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.ac6)).setImageDrawable(com.p314xaae8f345.mm.ui.uk.e((android.content.Context) weakReference.get(), com.p314xaae8f345.mm.R.raw.f80082x2be9fe17, ((android.content.Context) weakReference.get()).getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77687x3cb06c5)));
                            ((android.widget.TextView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.ac7)).setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572227ab3));
                            return true;
                        case 26:
                        case 27:
                            android.view.View view7 = this.f510959m;
                            java.util.ArrayList arrayList7 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal7 = zj0.c.f554818a;
                            arrayList7.add(8);
                            java.util.Collections.reverse(arrayList7);
                            yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/backup/backupui/BackupChatBanner", "refreshPcState", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                            yj0.a.f(view7, "com/tencent/mm/plugin/backup/backupui/BackupChatBanner", "refreshPcState", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.U0((android.content.Context) weakReference.get())) {
                                l(true);
                            }
                            return true;
                        case 28:
                            break;
                        default:
                            android.view.View view8 = this.f510959m;
                            java.util.ArrayList arrayList8 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal8 = zj0.c.f554818a;
                            arrayList8.add(8);
                            java.util.Collections.reverse(arrayList8);
                            yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/plugin/backup/backupui/BackupChatBanner", "refreshPcState", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                            yj0.a.f(view8, "com/tencent/mm/plugin/backup/backupui/BackupChatBanner", "refreshPcState", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            return false;
                    }
                }
            }
            qn1.c.o().f446504k = true;
            android.view.View view9 = this.f510959m;
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal9 = zj0.c.f554818a;
            arrayList9.add(0);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(view9, arrayList9.toArray(), "com/tencent/mm/plugin/backup/backupui/BackupChatBanner", "refreshPcState", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
            yj0.a.f(view9, "com/tencent/mm/plugin/backup/backupui/BackupChatBanner", "refreshPcState", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (1 == qn1.c.i().j().f446494a || 3 == qn1.c.i().j().f446494a) {
                ((android.widget.ImageView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.ac6)).setImageDrawable(com.p314xaae8f345.mm.ui.uk.e((android.content.Context) weakReference.get(), com.p314xaae8f345.mm.R.raw.f80082x2be9fe17, ((android.content.Context) weakReference.get()).getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77687x3cb06c5)));
            } else if (2 == qn1.c.i().j().f446494a || 4 == qn1.c.i().j().f446494a) {
                ((android.widget.ImageView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.ac6)).setImageDrawable(com.p314xaae8f345.mm.ui.uk.e((android.content.Context) weakReference.get(), com.p314xaae8f345.mm.R.raw.f80082x2be9fe17, ((android.content.Context) weakReference.get()).getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77687x3cb06c5)));
            }
            ((android.widget.TextView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.ac7)).setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.aaq));
            return true;
        }
        android.view.View view10 = this.f510959m;
        java.util.ArrayList arrayList10 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal10 = zj0.c.f554818a;
        arrayList10.add(0);
        java.util.Collections.reverse(arrayList10);
        yj0.a.d(view10, arrayList10.toArray(), "com/tencent/mm/plugin/backup/backupui/BackupChatBanner", "refreshPcState", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view10.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
        yj0.a.f(view10, "com/tencent/mm/plugin/backup/backupui/BackupChatBanner", "refreshPcState", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (1 == qn1.c.i().j().f446494a || 3 == qn1.c.i().j().f446494a) {
            if (g17) {
                ((android.widget.ImageView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.ac6)).setImageDrawable(com.p314xaae8f345.mm.ui.uk.e((android.content.Context) weakReference.get(), com.p314xaae8f345.mm.R.raw.f80097x8eab27b0, ((android.content.Context) weakReference.get()).getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac)));
                ((android.widget.TextView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.ac7)).setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.abh));
            } else {
                ((android.widget.ImageView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.ac6)).setImageDrawable(com.p314xaae8f345.mm.ui.uk.e((android.content.Context) weakReference.get(), com.p314xaae8f345.mm.R.raw.f80082x2be9fe17, ((android.content.Context) weakReference.get()).getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77687x3cb06c5)));
                ((android.widget.TextView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.ac7)).setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.aa6));
            }
        } else if (2 == qn1.c.i().j().f446494a || 4 == qn1.c.i().j().f446494a) {
            if (g17) {
                ((android.widget.ImageView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.ac6)).setImageDrawable(com.p314xaae8f345.mm.ui.uk.e((android.content.Context) weakReference.get(), com.p314xaae8f345.mm.R.raw.f80097x8eab27b0, ((android.content.Context) weakReference.get()).getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac)));
                ((android.widget.TextView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.ac7)).setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.abh));
            } else {
                ((android.widget.ImageView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.ac6)).setImageDrawable(com.p314xaae8f345.mm.ui.uk.e((android.content.Context) weakReference.get(), com.p314xaae8f345.mm.R.raw.f80082x2be9fe17, ((android.content.Context) weakReference.get()).getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77687x3cb06c5)));
                ((android.widget.TextView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.ac7)).setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.aa7));
            }
        }
        return true;
    }

    public final boolean n(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupChatBanner", "refreshPcState:%d, isMigrating:%b", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(qn1.c.i().j().g()));
        if (i17 != -25 && i17 != 14 && i17 != 23 && i17 != 4 && i17 != 5 && i17 != this.f510962p && i17 != -4 && i17 != 12 && i17 != 15 && i17 != 22) {
            switch (i17) {
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
}
