package com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic;

/* loaded from: classes10.dex */
public final class x0 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f240069d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f240070e;

    /* renamed from: f, reason: collision with root package name */
    public int f240071f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f240072g;

    /* renamed from: h, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f240073h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f240069d = new java.util.ArrayList();
        this.f240070e = true;
        this.f240071f = -1;
        this.f240072g = "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        if (((p3325xe03a0797.p3326xc267989b.a) r8).a() == true) goto L14;
     */
    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo739xfd763ae1(android.os.Bundle r8) {
        /*
            r7 = this;
            super.mo739xfd763ae1(r8)
            android.content.Intent r8 = r7.m158359x1e885992()
            java.lang.String r0 = "ringtone_finder_username"
            java.lang.String r8 = r8.getStringExtra(r0)
            if (r8 != 0) goto L11
            java.lang.String r8 = ""
        L11:
            r7.f240072g = r8
            boolean r8 = r7.f240070e
            if (r8 != 0) goto L32
            androidx.appcompat.app.AppCompatActivity r8 = r7.m158354x19263085()
            java.lang.String r0 = "activity"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r0)
            pf5.z r0 = pf5.z.f435481a
            pf5.v r8 = r0.a(r8)
            java.lang.Class<com.tencent.mm.plugin.ringtone.uic.g> r0 = com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.g.class
            androidx.lifecycle.c1 r8 = r8.a(r0)
            com.tencent.mm.plugin.ringtone.uic.g r8 = (com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.g) r8
            r8.O6()
            goto L57
        L32:
            kotlinx.coroutines.r2 r8 = r7.f240073h
            if (r8 == 0) goto L40
            kotlinx.coroutines.a r8 = (p3325xe03a0797.p3326xc267989b.a) r8
            boolean r8 = r8.a()
            r0 = 1
            if (r8 != r0) goto L40
            goto L41
        L40:
            r0 = 0
        L41:
            if (r0 != 0) goto L57
            kotlinx.coroutines.y0 r1 = r7.mo144225x95f74600()
            r2 = 0
            r3 = 0
            com.tencent.mm.plugin.ringtone.uic.w0 r4 = new com.tencent.mm.plugin.ringtone.uic.w0
            r8 = 0
            r4.<init>(r7, r8)
            r5 = 3
            r6 = 0
            kotlinx.coroutines.r2 r8 = p3325xe03a0797.p3326xc267989b.l.d(r1, r2, r3, r4, r5, r6)
            r7.f240073h = r8
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.x0.mo739xfd763ae1(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f240073h;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f240069d.clear();
    }
}
