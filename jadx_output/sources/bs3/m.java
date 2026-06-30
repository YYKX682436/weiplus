package bs3;

/* loaded from: classes11.dex */
public final class m extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.profile.ui.mod.permission_view.PermissionView f24002d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public final int O6() {
        com.tencent.mm.plugin.profile.ui.mod.permission_view.PermissionView permissionView = this.f24002d;
        if (permissionView != null) {
            if ((permissionView.permission & 8) != 0) {
                permissionView.setPermission(8);
            }
        }
        com.tencent.mm.plugin.profile.ui.mod.permission_view.PermissionView permissionView2 = this.f24002d;
        if (permissionView2 != null) {
            return permissionView2.getPermission();
        }
        return 0;
    }

    public final com.tencent.mm.plugin.profile.ui.mod.permission_view.PermissionView P6() {
        return this.f24002d;
    }

    public final void Q6(java.lang.String str) {
        com.tencent.mm.plugin.profile.ui.mod.permission_view.PermissionView permissionView = this.f24002d;
        if (permissionView != null) {
            permissionView.setHint(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0065, code lost:
    
        if ((r5 == null || r26.n0.N(r5)) != false) goto L22;
     */
    @Override // com.tencent.mm.ui.component.UIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            r8 = 2131321111(0x7f096117, float:1.8260835E38)
            android.view.View r8 = r7.findViewById(r8)
            com.tencent.mm.plugin.profile.ui.mod.permission_view.PermissionView r8 = (com.tencent.mm.plugin.profile.ui.mod.permission_view.PermissionView) r8
            r7.f24002d = r8
            android.content.Intent r8 = r7.getIntent()
            java.lang.String r0 = "Contact_User"
            java.lang.String r8 = r8.getStringExtra(r0)
            if (r8 != 0) goto L18
            return
        L18:
            java.lang.Class<vg3.x3> r0 = vg3.x3.class
            lm0.a r0 = gm0.j1.s(r0)
            vg3.x3 r0 = (vg3.x3) r0
            com.tencent.mm.plugin.messenger.foundation.h2 r0 = (com.tencent.mm.plugin.messenger.foundation.h2) r0
            com.tencent.mm.storage.k4 r0 = r0.Bi()
            r1 = 1
            com.tencent.mm.storage.z3 r0 = r0.n(r8, r1)
            android.content.Intent r2 = r7.getIntent()
            java.lang.String r3 = "Contact_Nick"
            java.lang.String r2 = r2.getStringExtra(r3)
            java.lang.String r3 = ""
            if (r2 != 0) goto L3a
            r2 = r3
        L3a:
            android.content.Intent r4 = r7.getIntent()
            java.lang.String r5 = "Contact_RemarkName"
            java.lang.String r4 = r4.getStringExtra(r5)
            if (r4 != 0) goto L47
            goto L48
        L47:
            r3 = r4
        L48:
            android.content.Intent r4 = r7.getIntent()
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
            android.content.Intent r8 = r7.getIntent()
            java.lang.String r2 = "Contact_default_permission"
            r3 = -1
            int r8 = r8.getIntExtra(r2, r3)
            if (r8 == r3) goto L95
            com.tencent.mm.plugin.profile.ui.mod.permission_view.PermissionView r2 = r7.f24002d
            if (r2 != 0) goto L87
            goto L8a
        L87:
            r2.setPermission(r8)
        L8a:
            com.tencent.mm.plugin.profile.ui.mod.permission_view.PermissionView r8 = r7.f24002d
            if (r8 != 0) goto L8f
            goto L9c
        L8f:
            int r0 = r0.I
            r8.setSex(r0)
            goto L9c
        L95:
            com.tencent.mm.plugin.profile.ui.mod.permission_view.PermissionView r8 = r7.f24002d
            if (r8 == 0) goto L9c
            r8.d(r0)
        L9c:
            java.lang.Class<c25.e> r8 = c25.e.class
            lm0.a r8 = gm0.j1.s(r8)
            c25.e r8 = (c25.e) r8
            com.tencent.mm.plugin.zero.a r8 = (com.tencent.mm.plugin.zero.a) r8
            ip.j r8 = r8.b()
            java.lang.String r0 = "MMSocialBlackListFlag"
            int r8 = r8.b(r0, r1)
            if (r8 != r1) goto Lb3
            goto Lb4
        Lb3:
            r1 = r6
        Lb4:
            com.tencent.mm.plugin.profile.ui.mod.permission_view.PermissionView r8 = r7.f24002d
            if (r8 != 0) goto Lb9
            goto Lbc
        Lb9:
            r8.setEnableChatOnly(r1)
        Lbc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bs3.m.onCreate(android.os.Bundle):void");
    }
}
