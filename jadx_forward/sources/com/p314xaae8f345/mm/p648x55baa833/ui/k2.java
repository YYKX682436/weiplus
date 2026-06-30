package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes11.dex */
public class k2 implements o65.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f145798a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f145799b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.List f145800c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10342x4f979a0c f145801d;

    public k2(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10342x4f979a0c activityC10342x4f979a0c, java.lang.String str, boolean z17, java.util.List list) {
        this.f145801d = activityC10342x4f979a0c;
        this.f145798a = str;
        this.f145799b = z17;
        this.f145800c = list;
    }

    @Override // o65.c, o65.b
    /* renamed from: b */
    public void a(int i17, int i18, java.lang.String str, o65.c cVar) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var;
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10342x4f979a0c activityC10342x4f979a0c = this.f145801d;
        if (activityC10342x4f979a0c.f145286n == 1) {
            com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10342x4f979a0c.U6(activityC10342x4f979a0c, activityC10342x4f979a0c.f145291s, activityC10342x4f979a0c.f145287o, activityC10342x4f979a0c.f145283h, activityC10342x4f979a0c.f145280e.getCount(), 1, 2, this.f145798a);
        }
        android.app.ProgressDialog progressDialog = activityC10342x4f979a0c.f145290r;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        db5.e1.T(activityC10342x4f979a0c, this.f145799b ? activityC10342x4f979a0c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.igm) : activityC10342x4f979a0c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i4o));
        com.p314xaae8f345.mm.p648x55baa833.ui.v2 v2Var = activityC10342x4f979a0c.f145280e;
        v2Var.getClass();
        boolean z17 = false;
        for (java.lang.String str2 : this.f145800c) {
            java.util.List list = v2Var.f146122d;
            java.util.Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    z3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.z3) it.next();
                    if (z3Var.d1().equals(str2)) {
                        break;
                    }
                } else {
                    z3Var = null;
                    break;
                }
            }
            if (z3Var != null) {
                ((java.util.LinkedList) list).remove(z3Var);
                z17 = true;
            }
        }
        if (z17) {
            v2Var.notifyDataSetChanged();
        }
        activityC10342x4f979a0c.f145279d.post(new com.p314xaae8f345.mm.p648x55baa833.ui.j2(this));
    }
}
