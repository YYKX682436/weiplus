package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class r30 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f195609p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.RelativeLayout f195610q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.View f195611r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View f195612s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View f195613t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.View f195614u;

    /* renamed from: v, reason: collision with root package name */
    public yz5.a f195615v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r30(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f195609p = "FinderLiveOptionPanelPlugin";
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) root.findViewById(com.p314xaae8f345.mm.R.id.pob);
        this.f195610q = relativeLayout;
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.f8f);
        this.f195611r = findViewById;
        android.view.View findViewById2 = root.findViewById(com.p314xaae8f345.mm.R.id.f8i);
        this.f195612s = findViewById2;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) root.findViewById(com.p314xaae8f345.mm.R.id.f8j);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) root.findViewById(com.p314xaae8f345.mm.R.id.f8g);
        this.f195613t = root.findViewById(com.p314xaae8f345.mm.R.id.isg);
        android.view.View findViewById3 = root.findViewById(com.p314xaae8f345.mm.R.id.tkh);
        this.f195614u = findViewById3;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) root.findViewById(com.p314xaae8f345.mm.R.id.tki);
        if (x0()) {
            relativeLayout.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.k30(this));
        } else {
            root.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.j30(root));
        }
        relativeLayout.setTranslationY(com.p314xaae8f345.mm.ui.bl.b(root.getContext()).y);
        root.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l30(this));
        findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.m30(this, root));
        findViewById2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.n30(this));
        findViewById3.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.p30(this, root));
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            c22699x3dcdb352.r(android.graphics.Color.parseColor("#ffffff"), 0.8f);
            c22699x3dcdb3522.r(android.graphics.Color.parseColor("#ffffff"), 0.8f);
            c22699x3dcdb3523.r(android.graphics.Color.parseColor("#ffffff"), 0.8f);
        } else {
            c22699x3dcdb352.r(android.graphics.Color.parseColor("#000000"), 0.8f);
            c22699x3dcdb3522.r(android.graphics.Color.parseColor("#000000"), 0.8f);
            c22699x3dcdb3523.r(android.graphics.Color.parseColor("#000000"), 0.8f);
        }
    }

    public static final boolean t1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r30 r30Var) {
        if (!((mm2.c1) r30Var.P0(mm2.c1.class)).a8()) {
            return true;
        }
        on2.z2 z2Var = (on2.z2) r30Var.P0(on2.z2.class);
        boolean V6 = z2Var.V6();
        android.view.ViewGroup viewGroup = r30Var.f446856d;
        if (V6 || z2Var.T6()) {
            java.lang.String string = viewGroup.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nrm);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            android.content.Context context = viewGroup.getContext();
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
            e4Var.f293309c = string;
            e4Var.c();
        } else {
            df2.ar arVar = (df2.ar) r30Var.U0(df2.ar.class);
            if (!(arVar != null && arVar.f7())) {
                return true;
            }
            java.lang.String string2 = viewGroup.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nrm);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            android.content.Context context2 = viewGroup.getContext();
            int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context2);
            e4Var2.f293309c = string2;
            e4Var2.c();
        }
        return false;
    }

    @Override // qo0.a
    public boolean B0() {
        if (w0() != 0) {
            return false;
        }
        u1();
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f410334f2 != 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return false;
    }

    public final void u1() {
        this.f195610q.animate().translationY(com.p314xaae8f345.mm.ui.bl.b(this.f446856d.getContext()).y).setDuration(200L).setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.q30(this)).start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x010b, code lost:
    
        if (((mm2.c1) P0(mm2.c1.class)).o7() != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x017a, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0178, code lost:
    
        if ((r5 == 1 && r5 != 0) == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v1(yz5.a r27) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r30.v1(yz5.a):void");
    }
}
