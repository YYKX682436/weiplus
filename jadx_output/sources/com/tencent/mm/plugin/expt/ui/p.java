package com.tencent.mm.plugin.expt.ui;

/* loaded from: classes.dex */
public class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.expt.ui.ExptDebugUI f99846d;

    public p(com.tencent.mm.plugin.expt.ui.ExptDebugUI exptDebugUI) {
        this.f99846d = exptDebugUI;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0099, code lost:
    
        if (r1 == null) goto L24;
     */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onClick(android.view.View r7) {
        /*
            r6 = this;
            java.lang.String r0 = "com/tencent/mm/plugin/expt/ui/ExptDebugUI$7"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r7)
            java.lang.Object[] r5 = r4.toArray()
            r4.clear()
            r4 = r6
            yj0.a.b(r0, r1, r2, r3, r4, r5)
            h62.d r7 = h62.d.vj()
            java.util.ArrayList r7 = r7.Bi()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = lp0.b.D()
            r0.append(r1)
            java.lang.String r1 = "expt_export_"
            r0.append(r1)
            long r1 = com.tencent.mm.sdk.platformtools.t8.i1()
            r0.append(r1)
            java.lang.String r1 = ".txt"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            boolean r1 = com.tencent.mm.vfs.w6.j(r0)
            if (r1 == 0) goto L4e
            com.tencent.mm.vfs.w6.h(r0)
        L4e:
            boolean r1 = com.tencent.mm.vfs.w6.e(r0)
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L9c
            java.io.OutputStream r1 = com.tencent.mm.vfs.w6.K(r0, r3)     // Catch: java.lang.Throwable -> L91 java.lang.Exception -> L98
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L99
        L5e:
            boolean r4 = r7.hasNext()     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L99
            if (r4 == 0) goto L87
            java.lang.Object r4 = r7.next()     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L99
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L99
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L99
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L99
            r5.<init>()     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L99
            r5.append(r4)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L99
            java.lang.String r4 = "\r\n"
            r5.append(r4)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L99
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L99
            byte[] r4 = r4.getBytes()     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L99
            r1.write(r4)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L99
            goto L5e
        L87:
            r1.flush()     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L99
        L8a:
            r1.close()     // Catch: java.io.IOException -> L9c
            goto L9c
        L8e:
            r7 = move-exception
            r2 = r1
            goto L92
        L91:
            r7 = move-exception
        L92:
            if (r2 == 0) goto L97
            r2.close()     // Catch: java.io.IOException -> L97
        L97:
            throw r7
        L98:
            r1 = r2
        L99:
            if (r1 == 0) goto L9c
            goto L8a
        L9c:
            com.tencent.mm.plugin.expt.ui.ExptDebugUI r7 = r6.f99846d
            android.widget.TextView r1 = r7.e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Success export expt exptid : "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r1.setText(r4)
            android.content.Context r1 = com.tencent.mm.sdk.platformtools.x2.f193071a     // Catch: java.lang.Exception -> Le3
            java.lang.String r4 = "expt_id"
            com.tencent.mm.sdk.platformtools.b0.d(r1, r4, r0, r2)     // Catch: java.lang.Exception -> Le3
            androidx.appcompat.app.AppCompatActivity r1 = r7.getContext()     // Catch: java.lang.Exception -> Le3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Le3
            r2.<init>()     // Catch: java.lang.Exception -> Le3
            androidx.appcompat.app.AppCompatActivity r4 = r7.getContext()     // Catch: java.lang.Exception -> Le3
            r5 = 2131756022(0x7f1003f6, float:1.914294E38)
            java.lang.String r4 = r4.getString(r5)     // Catch: java.lang.Exception -> Le3
            r2.append(r4)     // Catch: java.lang.Exception -> Le3
            java.lang.String r4 = ":"
            r2.append(r4)     // Catch: java.lang.Exception -> Le3
            r2.append(r0)     // Catch: java.lang.Exception -> Le3
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Exception -> Le3
            android.widget.Toast r0 = dp.a.makeText(r1, r0, r3)     // Catch: java.lang.Exception -> Le3
            r0.show()     // Catch: java.lang.Exception -> Le3
            goto Lf0
        Le3:
            androidx.appcompat.app.AppCompatActivity r7 = r7.getContext()
            java.lang.String r0 = "copy failure"
            android.widget.Toast r7 = dp.a.makeText(r7, r0, r3)
            r7.show()
        Lf0:
            java.lang.String r7 = "onClick"
            java.lang.String r0 = "(Landroid/view/View;)V"
            java.lang.String r1 = "com/tencent/mm/plugin/expt/ui/ExptDebugUI$7"
            java.lang.String r2 = "android/view/View$OnClickListener"
            yj0.a.h(r6, r1, r2, r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.expt.ui.p.onClick(android.view.View):void");
    }
}
