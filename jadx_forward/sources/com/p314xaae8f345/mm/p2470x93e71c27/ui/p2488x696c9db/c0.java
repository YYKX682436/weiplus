package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes8.dex */
public class c0 extends android.os.AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19725xad6fc40e f273068a;

    public c0(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19725xad6fc40e activityC19725xad6fc40e) {
        this.f273068a = activityC19725xad6fc40e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if (r4 == null) goto L15;
     */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doInBackground(java.lang.Object[] r9) {
        /*
            r8 = this;
            com.tencent.mm.pluginsdk.ui.otherway.x[] r9 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.x[]) r9
            r0 = 0
            r9 = r9[r0]
            android.graphics.drawable.Drawable r1 = r9.f272563f
            if (r1 != 0) goto L66
            android.content.pm.ResolveInfo r1 = r9.f272561d
            int r2 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19725xad6fc40e.f272863x0
            com.tencent.mm.pluginsdk.ui.tools.AppChooserUI r2 = r8.f273068a
            r2.getClass()
            java.lang.String r3 = "MicroMsg.AppChooserUI"
            java.lang.String r4 = r1.resolvePackageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L54
            r5 = 0
            if (r4 == 0) goto L2e
            int r6 = r1.icon     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L54
            if (r6 == 0) goto L2e
            android.content.pm.PackageManager r6 = r2.f272865d     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L54
            android.content.res.Resources r4 = r6.getResourcesForApplication(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L54
            int r6 = r1.icon     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L54
            android.graphics.drawable.Drawable r4 = j65.j.h(r4, r6)     // Catch: android.content.res.Resources.NotFoundException -> L2a android.content.pm.PackageManager.NameNotFoundException -> L54
            goto L2b
        L2a:
            r4 = r5
        L2b:
            if (r4 == 0) goto L2e
            goto L64
        L2e:
            int r4 = r1.getIconResource()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L54
            if (r4 == 0) goto L5e
            android.content.pm.PackageManager r6 = r2.f272865d     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L54
            android.content.pm.ActivityInfo r7 = r1.activityInfo     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L54
            java.lang.String r7 = r7.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L54
            android.content.res.Resources r6 = r6.getResourcesForApplication(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L54
            android.graphics.drawable.Drawable r5 = j65.j.h(r6, r4)     // Catch: android.content.res.Resources.NotFoundException -> L42 android.content.pm.PackageManager.NameNotFoundException -> L54
        L42:
            if (r5 == 0) goto L5e
            java.lang.String r6 = "loadIconForResolveInfo iconRes %d done"
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L54
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L54
            r7[r0] = r4     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L54
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r6, r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L54
            r4 = r5
            goto L64
        L54:
            r0 = move-exception
            java.lang.String r4 = "Couldn't find resources for package"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r4, r0)
        L5e:
            android.content.pm.PackageManager r0 = r2.f272865d
            android.graphics.drawable.Drawable r4 = r1.loadIcon(r0)
        L64:
            r9.f272563f = r4
        L66:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.c0.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19725xad6fc40e activityC19725xad6fc40e = this.f273068a;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a0 a0Var = activityC19725xad6fc40e.f272866e;
        if (a0Var != null) {
            a0Var.notifyDataSetChanged();
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = activityC19725xad6fc40e.f272869h;
        if (c22848x6ddd90cf != null) {
            c22848x6ddd90cf.m8146xced61ae5();
        }
    }
}
