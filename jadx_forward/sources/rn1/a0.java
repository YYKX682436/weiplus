package rn1;

/* loaded from: classes12.dex */
public class a0 implements kn1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1254xc8603089.ActivityC12834x3f237cc9 f479145a;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1254xc8603089.ActivityC12834x3f237cc9 activityC12834x3f237cc9) {
        this.f479145a = activityC12834x3f237cc9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0490, code lost:
    
        if (r2 != 4) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x054d, code lost:
    
        if (r2 != 4) goto L82;
     */
    @Override // kn1.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r17) {
        /*
            Method dump skipped, instructions count: 2078
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rn1.a0.a(int):void");
    }

    public void b() {
        int i17 = qn1.c.i().j().f446494a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcUI", "onBackupPcUpdateUICallback onBackupPcStart, commandMode[%d]", java.lang.Integer.valueOf(i17));
        if (i17 == 1) {
            qn1.c.i().e().f391142a = 11;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            a(11);
            return;
        }
        if (i17 == 2) {
            qn1.c.i().e().f391142a = 21;
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            a(21);
        } else if (i17 == 3) {
            qn1.c.i().e().f391142a = 12;
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            a(12);
        } else {
            if (i17 != 4) {
                return;
            }
            qn1.c.i().e().f391142a = 22;
            boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            a(22);
        }
    }

    @Override // kn1.e
    public void c() {
    }

    public final void d(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1254xc8603089.ActivityC12834x3f237cc9 activityC12834x3f237cc9 = this.f479145a;
        if (2 == i17 || 4 == i17) {
            activityC12834x3f237cc9.f174068m.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bwp);
        } else {
            activityC12834x3f237cc9.f174068m.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bwm);
        }
    }

    public final void e() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1254xc8603089.ActivityC12834x3f237cc9 activityC12834x3f237cc9 = this.f479145a;
        activityC12834x3f237cc9.f174067i.setText(com.p314xaae8f345.mm.R.C30867xcad56011.a7g);
        activityC12834x3f237cc9.f174067i.setOnClickListener(new rn1.m(this));
    }

    public final void f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1254xc8603089.ActivityC12834x3f237cc9 activityC12834x3f237cc9 = this.f479145a;
        activityC12834x3f237cc9.f174067i.setText(com.p314xaae8f345.mm.R.C30867xcad56011.a7l);
        activityC12834x3f237cc9.f174067i.setOnClickListener(new rn1.n(this));
    }
}
