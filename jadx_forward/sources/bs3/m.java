package bs3;

/* loaded from: classes11.dex */
public final class m extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1960x9f5a7715.C16879x6e8fc134 f105535d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    public final int O6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1960x9f5a7715.C16879x6e8fc134 c16879x6e8fc134 = this.f105535d;
        if (c16879x6e8fc134 != null) {
            if ((c16879x6e8fc134.permission & 8) != 0) {
                c16879x6e8fc134.m67662xfd8acbd1(8);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1960x9f5a7715.C16879x6e8fc134 c16879x6e8fc1342 = this.f105535d;
        if (c16879x6e8fc1342 != null) {
            return c16879x6e8fc1342.getPermission();
        }
        return 0;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1960x9f5a7715.C16879x6e8fc134 P6() {
        return this.f105535d;
    }

    public final void Q6(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1960x9f5a7715.C16879x6e8fc134 c16879x6e8fc134 = this.f105535d;
        if (c16879x6e8fc134 != null) {
            c16879x6e8fc134.m67659x764b0e09(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0065, code lost:
    
        if ((r5 == null || r26.n0.N(r5)) != false) goto L22;
     */
    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo450x3e5a77bb(android.os.Bundle r8) {
        /*
            r7 = this;
            r8 = 2131321111(0x7f096117, float:1.8260835E38)
            android.view.View r8 = r7.mo144222x4ff8c0f0(r8)
            com.tencent.mm.plugin.profile.ui.mod.permission_view.PermissionView r8 = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1960x9f5a7715.C16879x6e8fc134) r8
            r7.f105535d = r8
            android.content.Intent r8 = r7.m158359x1e885992()
            java.lang.String r0 = "Contact_User"
            java.lang.String r8 = r8.getStringExtra(r0)
            if (r8 != 0) goto L18
            return
        L18:
            java.lang.Class<vg3.x3> r0 = vg3.x3.class
            lm0.a r0 = gm0.j1.s(r0)
            vg3.x3 r0 = (vg3.x3) r0
            com.tencent.mm.plugin.messenger.foundation.h2 r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) r0
            com.tencent.mm.storage.k4 r0 = r0.Bi()
            r1 = 1
            com.tencent.mm.storage.z3 r0 = r0.n(r8, r1)
            android.content.Intent r2 = r7.m158359x1e885992()
            java.lang.String r3 = "Contact_Nick"
            java.lang.String r2 = r2.getStringExtra(r3)
            java.lang.String r3 = ""
            if (r2 != 0) goto L3a
            r2 = r3
        L3a:
            android.content.Intent r4 = r7.m158359x1e885992()
            java.lang.String r5 = "Contact_RemarkName"
            java.lang.String r4 = r4.getStringExtra(r5)
            if (r4 != 0) goto L47
            goto L48
        L47:
            r3 = r4
        L48:
            android.content.Intent r4 = r7.m158359x1e885992()
            java.lang.String r5 = "Contact_Sex"
            r6 = 0
            int r4 = r4.getIntExtra(r5, r6)
            if (r0 == 0) goto L67
            java.lang.String r5 = r0.d1()
            if (r5 == 0) goto L64
            boolean r5 = r26.n0.N(r5)
            if (r5 == 0) goto L62
            goto L64
        L62:
            r5 = r6
            goto L65
        L64:
            r5 = r1
        L65:
            if (r5 == 0) goto L75
        L67:
            com.tencent.mm.storage.z3 r0 = new com.tencent.mm.storage.z3
            r0.<init>(r8)
            r0.M1(r2)
            r0.n1(r3)
            r0.g3(r4)
        L75:
            android.content.Intent r8 = r7.m158359x1e885992()
            java.lang.String r2 = "Contact_default_permission"
            r3 = -1
            int r8 = r8.getIntExtra(r2, r3)
            if (r8 == r3) goto L95
            com.tencent.mm.plugin.profile.ui.mod.permission_view.PermissionView r2 = r7.f105535d
            if (r2 != 0) goto L87
            goto L8a
        L87:
            r2.m67662xfd8acbd1(r8)
        L8a:
            com.tencent.mm.plugin.profile.ui.mod.permission_view.PermissionView r8 = r7.f105535d
            if (r8 != 0) goto L8f
            goto L9c
        L8f:
            int r0 = r0.I
            r8.m67663xca0294a4(r0)
            goto L9c
        L95:
            com.tencent.mm.plugin.profile.ui.mod.permission_view.PermissionView r8 = r7.f105535d
            if (r8 == 0) goto L9c
            r8.d(r0)
        L9c:
            java.lang.Class<c25.e> r8 = c25.e.class
            lm0.a r8 = gm0.j1.s(r8)
            c25.e r8 = (c25.e) r8
            com.tencent.mm.plugin.zero.a r8 = (com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) r8
            ip.j r8 = r8.b()
            java.lang.String r0 = "MMSocialBlackListFlag"
            int r8 = r8.b(r0, r1)
            if (r8 != r1) goto Lb3
            goto Lb4
        Lb3:
            r1 = r6
        Lb4:
            com.tencent.mm.plugin.profile.ui.mod.permission_view.PermissionView r8 = r7.f105535d
            if (r8 != 0) goto Lb9
            goto Lbc
        Lb9:
            r8.m67658x20b846c9(r1)
        Lbc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bs3.m.mo450x3e5a77bb(android.os.Bundle):void");
    }
}
