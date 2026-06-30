package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1918x30166c;

@db5.a(m123858x6ac9171 = 32)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/mv/ui/free/MusicMvFreeMakerPreviewUI;", "Lcom/tencent/mm/plugin/mv/ui/BaseMusicMvUI;", "<init>", "()V", "plugin-mv_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.mv.ui.free.MusicMvFreeMakerPreviewUI */
/* loaded from: classes10.dex */
public final class ActivityC16658x38bdd532 extends com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.AbstractActivityC16647x3a7d7dd1 {

    /* renamed from: e, reason: collision with root package name */
    public final r45.ss4 f232427e = new r45.ss4();

    /* renamed from: f, reason: collision with root package name */
    public boolean f232428f;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c4w;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.AbstractActivityC16647x3a7d7dd1, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        java.util.Set mo43419xa59964ef = super.mo43419xa59964ef();
        if (mo43419xa59964ef != null) {
            return kz5.q1.i(mo43419xa59964ef, kz5.z.D0(new java.lang.Class[]{com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h6.class, mm3.n.class, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.k6.class, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.x6.class}));
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 7 && i18 == -1) {
            finish();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBackPressed() {
        /*
            r6 = this;
            pf5.z r0 = pf5.z.f435481a
            pf5.v r0 = r0.a(r6)
            java.lang.Class<mm3.n> r1 = mm3.n.class
            androidx.lifecycle.c1 r0 = r0.a(r1)
            mm3.n r0 = (mm3.n) r0
            boolean r1 = r0.f411192m
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L43
            boolean r1 = r0.f411193n
            if (r1 != 0) goto L43
            boolean r1 = r0.f411195p
            if (r1 == 0) goto L1d
            goto L43
        L1d:
            java.util.LinkedList r1 = r0.f411190h
            if (r1 == 0) goto L3c
            java.util.Iterator r1 = r1.iterator()
        L25:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L3a
            java.lang.Object r4 = r1.next()
            r45.jf2 r4 = (r45.jf2) r4
            r5 = 10
            java.lang.String r4 = r4.m75945x2fec8307(r5)
            if (r4 == 0) goto L25
            goto L43
        L3a:
            r1 = 0
            goto L44
        L3c:
            java.lang.String r0 = "trackList"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r0)
            throw r2
        L43:
            r1 = r3
        L44:
            if (r1 == 0) goto L91
            com.tencent.mm.ui.widget.dialog.k0 r1 = new com.tencent.mm.ui.widget.dialog.k0
            androidx.appcompat.app.AppCompatActivity r4 = r0.m158354x19263085()
            r1.<init>(r4, r3, r3)
            r1.t(r3)
            android.content.res.Resources r3 = r0.m158361x893a2f6f()
            r4 = 2131772242(0x7f104352, float:1.9175838E38)
            java.lang.String r3 = r3.getString(r4)
            android.content.res.Resources r4 = r0.m158361x893a2f6f()
            r5 = 2131165989(0x7f070325, float:1.794621E38)
            int r4 = r4.getDimensionPixelSize(r5)
            r5 = 17
            r1.r(r3, r5, r4, r2)
            android.app.Activity r2 = r0.m80379x76847179()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131099862(0x7f0600d6, float:1.781209E38)
            int r2 = r2.getColor(r3)
            r1.l(r2)
            mm3.k r2 = new mm3.k
            r2.<init>(r0)
            r1.f293405n = r2
            mm3.l r2 = new mm3.l
            r2.<init>(r0, r1)
            r1.f293414s = r2
            r1.v()
            goto L98
        L91:
            androidx.appcompat.app.AppCompatActivity r0 = r0.m158354x19263085()
            r0.finish()
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1918x30166c.ActivityC16658x38bdd532.onBackPressed():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x012f A[LOOP:1: B:32:0x00eb->B:46:0x012f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0129 A[SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.AbstractActivityC16647x3a7d7dd1, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r19) {
        /*
            Method dump skipped, instructions count: 875
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1918x30166c.ActivityC16658x38bdd532.onCreate(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        ll3.z0.a(ll3.z0.f400797a, false, 1, null);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f232428f) {
            return;
        }
        this.f232428f = false;
    }
}
