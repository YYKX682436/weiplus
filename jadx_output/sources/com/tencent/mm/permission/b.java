package com.tencent.mm.permission;

/* loaded from: classes5.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f72372a;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        f72372a = hashMap;
        hashMap.put(1, new com.tencent.mm.permission.a(38, 40, 41, com.tencent.mm.R.string.f490516xb, com.tencent.mm.R.string.f490513x8));
        hashMap.put(2, new com.tencent.mm.permission.a(43, 44, 45, com.tencent.mm.R.string.f490515xa, com.tencent.mm.R.string.f490514x9));
    }

    public b() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.PermissionOpMarkEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.PermissionOpMarkEvent>(this, a0Var) { // from class: com.tencent.mm.permission.PermissionMgr$1
            {
                this.__eventId = 1740184941;
            }

            /* JADX WARN: Code restructure failed: missing block: B:107:0x021b, code lost:
            
                if (r7 == null) goto L61;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:11:0x0294  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x02a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:30:0x0235  */
            /* JADX WARN: Removed duplicated region for block: B:48:0x0273 A[EDGE_INSN: B:48:0x0273->B:49:0x0273 BREAK  A[LOOP:0: B:28:0x022f->B:44:0x0271], SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:56:0x0288  */
            /* JADX WARN: Type inference failed for: r1v22 */
            /* JADX WARN: Type inference failed for: r1v7 */
            /* JADX WARN: Type inference failed for: r1v8 */
            /* JADX WARN: Type inference failed for: r7v1 */
            /* JADX WARN: Type inference failed for: r7v15, types: [zo.a, java.lang.String] */
            /* JADX WARN: Type inference failed for: r7v18 */
            /* JADX WARN: Type inference failed for: r7v2 */
            /* JADX WARN: Type inference failed for: r7v24 */
            /* JADX WARN: Type inference failed for: r7v32, types: [boolean] */
            /* JADX WARN: Type inference failed for: r7v38 */
            /* JADX WARN: Type inference failed for: r7v8 */
            /* JADX WARN: Type inference failed for: r7v9 */
            @Override // com.tencent.mm.sdk.event.IListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean callback(com.tencent.mm.autogen.events.PermissionOpMarkEvent r17) {
                /*
                    Method dump skipped, instructions count: 688
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.permission.PermissionMgr$1.callback(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.PermissionShowDlgEvent> iListener2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.PermissionShowDlgEvent>(this, a0Var) { // from class: com.tencent.mm.permission.PermissionMgr$2
            {
                this.__eventId = -126342985;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.PermissionShowDlgEvent permissionShowDlgEvent) {
                com.tencent.mm.autogen.events.PermissionShowDlgEvent permissionShowDlgEvent2 = permissionShowDlgEvent;
                am.io ioVar = permissionShowDlgEvent2.f54615h;
                com.tencent.mm.permission.b.a(permissionShowDlgEvent2.f54614g.f6856a, false);
                ioVar.getClass();
                return false;
            }
        };
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MicrophoneMuteDlgEvent> iListener3 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MicrophoneMuteDlgEvent>(this, a0Var) { // from class: com.tencent.mm.permission.PermissionMgr$3
            {
                this.__eventId = -1844812114;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MicrophoneMuteDlgEvent microphoneMuteDlgEvent) {
                com.tencent.mars.xlog.Log.i("MicroMsg.PermissionMgr", "show mute dlg");
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                int i17 = com.tencent.mm.permission.PermissionWarningDialog.f72367g;
                android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.permission.PermissionWarningDialog.class);
                intent.putExtra("warning_type", 3);
                intent.addFlags(805306368);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/permission/PermissionWarningDialog", "showMicroPhoneMuteAlert", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/permission/PermissionWarningDialog", "showMicroPhoneMuteAlert", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return false;
            }
        };
        iListener.alive();
        iListener2.alive();
        iListener3.alive();
    }

    public static boolean a(int i17, boolean z17) {
        int i18;
        int i19;
        int i27;
        fp.j jVar = new fp.j();
        if (gm0.j1.a()) {
            i19 = b("ShowPermissionDialog", 0);
            i27 = b("OnlyScanRunningService", 0);
            i18 = b("Interval4ShowPmsDialog", 0);
        } else {
            i18 = 3600000;
            i19 = 1;
            i27 = 1;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PermissionMgr", "showDlg: %d, filter: %d, interval: %d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i18));
        java.util.HashMap hashMap = (java.util.HashMap) f72372a;
        java.util.Iterator it = hashMap.values().iterator();
        long j17 = 0;
        while (it.hasNext()) {
            long d17 = c01.d9.g().d(((com.tencent.mm.permission.a) it.next()).f72371b, 0L);
            if (j17 < d17) {
                j17 = d17;
            }
        }
        boolean z18 = 1 == i19 && java.lang.System.currentTimeMillis() - j17 >= ((long) i18);
        if (1 == i17) {
            c01.d9.g().h(((com.tencent.mm.permission.a) hashMap.get(java.lang.Integer.valueOf(i17))).f72371b, java.lang.System.currentTimeMillis());
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            db5.t7.m(context, context.getString(com.tencent.mm.R.string.n3q));
        } else if (z18) {
            c01.d9.g().h(((com.tencent.mm.permission.a) hashMap.get(java.lang.Integer.valueOf(i17))).f72371b, java.lang.System.currentTimeMillis());
            com.tencent.mars.xlog.Log.i("MicroMsg.PermissionMgr", "tryDirectlyShowDefaultPermissionDialog, chkType: %s, filter: %s, dueToException: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i27), java.lang.Boolean.valueOf(z17));
            if (1 == i17) {
                c01.d9.g().h(42, java.lang.System.currentTimeMillis());
                android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                boolean z19 = 1 == i27;
                int i28 = com.tencent.mm.permission.PermissionWarningDialog.f72367g;
                android.content.Intent intent = new android.content.Intent(context2, (java.lang.Class<?>) com.tencent.mm.permission.PermissionWarningDialog.class);
                intent.putExtra("warning_type", 2);
                intent.putExtra("warning_filter", z19);
                intent.putExtra("warning_due2Exception", z17);
                intent.addFlags(805306368);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/permission/PermissionWarningDialog", "showReportAppListAlert", "(Landroid/content/Context;ZZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context2.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context2, "com/tencent/mm/permission/PermissionWarningDialog", "showReportAppListAlert", "(Landroid/content/Context;ZZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PermissionMgr", "showPermissionDialog cost: " + jVar.a() + ", needShowDlg: " + z18);
        return false;
    }

    public static int b(java.lang.String str, int i17) {
        try {
            return com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d(str), i17);
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PermissionMgr", "getIntValFromDynamicConfig parseInt failed, val: " + str);
            return i17;
        }
    }
}
