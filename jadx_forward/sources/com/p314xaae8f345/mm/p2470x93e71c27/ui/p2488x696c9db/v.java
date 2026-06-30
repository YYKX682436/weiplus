package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes8.dex */
public class v extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19725xad6fc40e f273480e;

    public v(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19725xad6fc40e activityC19725xad6fc40e) {
        this.f273480e = activityC19725xad6fc40e;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.acr;
    }

    @Override // in5.r
    public void h(in5.s0 s0Var, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        android.content.pm.ResolveInfo resolveInfo;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.x xVar = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.x) cVar;
        android.widget.ImageView imageView = (android.widget.ImageView) s0Var.p(com.p314xaae8f345.mm.R.id.e1s);
        android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.e1t);
        android.widget.TextView textView2 = (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.e1r);
        android.graphics.drawable.Drawable drawable = xVar.f272563f;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19725xad6fc40e activityC19725xad6fc40e = this.f273480e;
        if (drawable == null) {
            new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.c0(activityC19725xad6fc40e).execute(xVar);
        }
        imageView.setImageDrawable(xVar.f272563f);
        java.lang.CharSequence charSequence = xVar.f272562e;
        if (activityC19725xad6fc40e.E && (resolveInfo = xVar.f272561d) != null && resolveInfo.activityInfo.packageName.equals(activityC19725xad6fc40e.F)) {
            charSequence = android.text.TextUtils.concat(charSequence, activityC19725xad6fc40e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571898sy));
            if (activityC19725xad6fc40e.A == null) {
                activityC19725xad6fc40e.A = xVar;
            }
        }
        textView.setText(charSequence);
        boolean z18 = xVar.f272565h;
        if ((!z18 || xVar.f272566i || (z18 && xVar.f272568n && activityC19725xad6fc40e.H >= activityC19725xad6fc40e.I)) && !xVar.f272567m) {
            textView2.setVisibility(8);
            return;
        }
        textView2.setVisibility(0);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e0 e0Var = activityC19725xad6fc40e.N;
        if (e0Var == com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e0.UNINSTALL) {
            if (xVar.f272567m) {
                textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572032wt);
            } else {
                textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f571908t8);
            }
            textView2.setEnabled(true);
            return;
        }
        if (e0Var == com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e0.DOWNLOADING) {
            textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f571913td);
            textView2.setEnabled(false);
        } else if (e0Var == com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e0.DOWNLOADED) {
            if (xVar.f272567m) {
                textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572110yz);
            } else {
                textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572109yy);
            }
            textView2.setEnabled(true);
        }
    }
}
