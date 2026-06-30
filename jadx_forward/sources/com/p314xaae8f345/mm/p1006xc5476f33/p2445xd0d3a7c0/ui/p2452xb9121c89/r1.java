package com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89;

/* loaded from: classes12.dex */
public class r1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f269793d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.s1 f269794e;

    public r1(com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.s1 s1Var, boolean z17) {
        this.f269794e = s1Var;
        this.f269793d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f269793d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.s1 s1Var = this.f269794e;
        if (!z17) {
            db5.e1.T(s1Var.f269800e.f269780d.f269777d.mo55332x76847179(), s1Var.f269800e.f269780d.f269777d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571243j));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteEditorUI", "sns uploadSucc false, return");
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f c5432x35bb364f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f();
        am.z9 z9Var = c5432x35bb364f.f135776g;
        z9Var.f90061a = 30;
        z9Var.f90073m = 1;
        z9Var.f90065e = s1Var.f269800e.f269780d.f269777d.A;
        c5432x35bb364f.e();
        am.aa aaVar = c5432x35bb364f.f135777h;
        java.lang.String str = aaVar.f87669c;
        s1Var.f269800e.f269780d.f269777d.Z = aaVar.f87670d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            s1Var.f269800e.f269780d.f269777d.f269674J.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.q1(this));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3.c7(s1Var.f269800e.f269780d.f269777d, str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3 = s1Var.f269800e.f269780d.f269777d;
        activityC19519x7af4daf3.f182133g.f425021m++;
        activityC19519x7af4daf3.U6(4);
    }
}
