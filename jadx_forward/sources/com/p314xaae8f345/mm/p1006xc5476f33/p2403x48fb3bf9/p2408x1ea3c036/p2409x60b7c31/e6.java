package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes12.dex */
public class e6 implements android.content.DialogInterface.OnKeyListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f263836d;

    public e6(android.content.Context context) {
        this.f263836d = context;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(android.content.DialogInterface dialogInterface, int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        android.content.Context context = this.f263836d;
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l6l);
        android.content.Context context2 = this.f263836d;
        db5.e1.K(context, true, string, "", context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l6i), context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l6j), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.c6(this), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.d6(this));
        return true;
    }
}
