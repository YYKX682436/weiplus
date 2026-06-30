package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes11.dex */
public class n2 implements o65.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f145918a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10342x4f979a0c f145919b;

    public n2(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10342x4f979a0c activityC10342x4f979a0c, java.lang.String str) {
        this.f145919b = activityC10342x4f979a0c;
        this.f145918a = str;
    }

    @Override // o65.c, o65.b
    /* renamed from: b */
    public void a(int i17, int i18, java.lang.String str, o65.c cVar) {
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10342x4f979a0c activityC10342x4f979a0c = this.f145919b;
        android.app.ProgressDialog progressDialog = activityC10342x4f979a0c.f145290r;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        if (i17 == 0 && i18 == 0) {
            return;
        }
        if (i18 == -2024) {
            tm.a b17 = tm.a.b(str);
            if (b17 != null) {
                b17.c(activityC10342x4f979a0c, null, null);
                return;
            }
            db5.e1.E(activityC10342x4f979a0c.mo55332x76847179(), activityC10342x4f979a0c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i4k), null, activityC10342x4f979a0c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i4l), false, new com.p314xaae8f345.mm.p648x55baa833.ui.l2(this));
        } else {
            db5.e1.E(activityC10342x4f979a0c, activityC10342x4f979a0c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i4u), null, activityC10342x4f979a0c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1), false, new com.p314xaae8f345.mm.p648x55baa833.ui.m2(this));
        }
        if (activityC10342x4f979a0c.f145286n == 1) {
            com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10342x4f979a0c.U6(activityC10342x4f979a0c, activityC10342x4f979a0c.f145291s, activityC10342x4f979a0c.f145287o, activityC10342x4f979a0c.f145283h, activityC10342x4f979a0c.f145280e.getCount(), 1, 3, this.f145918a);
        }
    }
}
