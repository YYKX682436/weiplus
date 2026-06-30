package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2056xe125c5cf;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting/permission/SettingMicrophonePermissionUI;", "Lcom/tencent/mm/plugin/setting/ui/setting/permission/BaseSettingPermissionUI;", "<init>", "()V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.setting.ui.setting.permission.SettingMicrophonePermissionUI */
/* loaded from: classes.dex */
public final class ActivityC17494xd9fba53d extends com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2056xe125c5cf.AbstractActivityC17490x3b7be062 {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2056xe125c5cf.AbstractActivityC17490x3b7be062
    public int T6() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ckt;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2056xe125c5cf.AbstractActivityC17490x3b7be062
    public int U6() {
        return com.p314xaae8f345.mm.R.C30867xcad56011.f574532im0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2056xe125c5cf.AbstractActivityC17490x3b7be062
    public int V6() {
        return com.p314xaae8f345.mm.R.C30867xcad56011.f574608iw5;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0053  */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() {
        /*
            r20 = this;
            r0 = r20
            super.onResume()
            boolean r1 = gm0.j1.a()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L43
            java.lang.Class<c25.e> r1 = c25.e.class
            lm0.a r1 = gm0.j1.s(r1)
            c25.e r1 = (c25.e) r1
            com.tencent.mm.plugin.zero.a r1 = (com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) r1
            ip.j r1 = r1.b()
            java.lang.String r4 = "WCOEntranceSwitch"
            int r1 = r1.b(r4, r3)
            if (r1 <= 0) goto L34
            gm0.b0 r1 = gm0.j1.u()
            com.tencent.mm.storage.n3 r1 = r1.c()
            com.tencent.mm.storage.u3 r4 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERFINO_IPCALL_HAS_ENTRY_BOOLEAN
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r1.x(r4, r5)
            r1 = r2
            goto L44
        L34:
            gm0.b0 r1 = gm0.j1.u()
            com.tencent.mm.storage.n3 r1 = r1.c()
            com.tencent.mm.storage.u3 r4 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERFINO_IPCALL_HAS_ENTRY_BOOLEAN
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r1.x(r4, r5)
        L43:
            r1 = r3
        L44:
            long r4 = c01.z1.j()
            r6 = 33554432(0x2000000, double:1.6578092E-316)
            long r4 = r4 & r6
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L53
            goto L54
        L53:
            r2 = r3
        L54:
            r4 = 2131325237(0x7f097135, float:1.8269204E38)
            if (r1 == 0) goto La2
            if (r2 != 0) goto La2
            android.view.View r1 = r0.findViewById(r4)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.ThreadLocal r4 = zj0.c.f554818a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.add(r4)
            java.util.Collections.reverse(r2)
            java.lang.Object[] r6 = r2.toArray()
            java.lang.String r7 = "com/tencent/mm/plugin/setting/ui/setting/permission/SettingMicrophonePermissionUI"
            java.lang.String r8 = "onResume"
            java.lang.String r9 = "()V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            r5 = r1
            yj0.a.d(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r2 = r2.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r6 = "com/tencent/mm/plugin/setting/ui/setting/permission/SettingMicrophonePermissionUI"
            java.lang.String r7 = "onResume"
            java.lang.String r8 = "()V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r5 = r1
            yj0.a.f(r5, r6, r7, r8, r9, r10, r11)
            goto Lea
        La2:
            android.view.View r1 = r0.findViewById(r4)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.ThreadLocal r4 = zj0.c.f554818a
            r4 = 8
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.add(r4)
            java.util.Collections.reverse(r2)
            java.lang.Object[] r13 = r2.toArray()
            java.lang.String r14 = "com/tencent/mm/plugin/setting/ui/setting/permission/SettingMicrophonePermissionUI"
            java.lang.String r15 = "onResume"
            java.lang.String r16 = "()V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r12 = r1
            yj0.a.d(r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r2 = r2.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r13 = "com/tencent/mm/plugin/setting/ui/setting/permission/SettingMicrophonePermissionUI"
            java.lang.String r14 = "onResume"
            java.lang.String r15 = "()V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r12 = r1
            yj0.a.f(r12, r13, r14, r15, r16, r17, r18)
        Lea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2056xe125c5cf.ActivityC17494xd9fba53d.onResume():void");
    }
}
