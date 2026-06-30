package to3;

/* loaded from: classes9.dex */
public class v extends com.p314xaae8f345.mm.p2802xd031a825.h {
    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public com.p314xaae8f345.mm.p2802xd031a825.h A(android.app.Activity activity, android.os.Bundle bundle) {
        B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19112x755f8362.class, bundle);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public void c(android.app.Activity activity, int i17) {
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public java.lang.String e() {
        return "OfflineProcess";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public void f(android.app.Activity activity, android.os.Bundle bundle) {
        m(activity);
        if (bundle == null || !bundle.getBoolean("is_offline_create")) {
            return;
        }
        yo3.m.v((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) activity);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        if (r0 == 8) goto L16;
     */
    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(android.app.Activity r10) {
        /*
            r9 = this;
            if (r10 == 0) goto L5e
            android.os.Bundle r0 = r9.f295334c
            java.lang.String r1 = "offline_from_scene"
            r2 = -1
            int r0 = r0.getInt(r1, r2)
            r1 = 2
            r2 = 1
            if (r0 != r2) goto L10
            goto L21
        L10:
            if (r0 != r1) goto L14
        L12:
            r1 = r2
            goto L21
        L14:
            r1 = 3
            if (r0 != r1) goto L18
            goto L21
        L18:
            r1 = 4
            if (r0 != r1) goto L1d
            r1 = 6
            goto L21
        L1d:
            r3 = 8
            if (r0 != r3) goto L12
        L21:
            com.tencent.mm.plugin.report.service.g0 r3 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r4 = 14096(0x3710, float:1.9753E-41)
            r3.d(r4, r1)
            java.lang.ref.WeakReference r1 = r9.f295333b
            java.lang.Object r1 = r1.get()
            android.content.Context r1 = (android.content.Context) r1
            boolean r3 = r1 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38
            if (r3 == 0) goto L41
            com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI r1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38) r1
            r1.finish()
        L41:
            android.content.Intent r7 = new android.content.Intent
            java.lang.Class<com.tencent.mm.plugin.offline.ui.WalletOfflineEntranceUI> r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16769x400fef4.class
            r7.<init>(r10, r1)
            java.lang.String r1 = "key_from_scene"
            r7.putExtra(r1, r0)
            java.lang.String r0 = "is_offline_create"
            r7.putExtra(r0, r2)
            java.lang.Class<com.tencent.mm.plugin.offline.ui.WalletOfflineEntranceUI> r5 = com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16769x400fef4.class
            r8 = 1
            r6 = -1
            r3 = r9
            r4 = r10
            r3.h(r4, r5, r6, r7, r8)
            r10.finish()
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: to3.v.m(android.app.Activity):void");
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public void o(android.app.Activity activity, int i17, android.os.Bundle bundle) {
        if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19112x755f8362) {
            m(activity);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public np5.g p(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var) {
        if (abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19112x755f8362) {
            return new to3.u(this, abstractActivityC21394xb3d2c0cf, b0Var);
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public boolean t(android.app.Activity activity, android.os.Bundle bundle) {
        return false;
    }
}
