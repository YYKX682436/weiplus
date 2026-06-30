package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes11.dex */
public class m1 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11344x4cd4d8d8 f154264d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11344x4cd4d8d8 activityC11344x4cd4d8d8) {
        super(false);
        this.f154264d = activityC11344x4cd4d8d8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List] */
    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        ?? y76;
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11344x4cd4d8d8 activityC11344x4cd4d8d8 = this.f154264d;
        if (activityC11344x4cd4d8d8.K.isChecked()) {
            java.util.HashSet hashSet = activityC11344x4cd4d8d8.I;
            if (hashSet != null) {
                hashSet.clear();
            } else {
                activityC11344x4cd4d8d8.I = new java.util.HashSet();
            }
            activityC11344x4cd4d8d8.K.setChecked(false);
            activityC11344x4cd4d8d8.b7().notifyDataSetChanged();
        } else {
            if (activityC11344x4cd4d8d8.C == 6) {
                y76 = new java.util.ArrayList();
                java.util.Iterator it = activityC11344x4cd4d8d8.G.iterator();
                while (it.hasNext()) {
                    y76.add((java.lang.String) it.next());
                }
            } else {
                y76 = !c01.e2.R(activityC11344x4cd4d8d8.D) ? activityC11344x4cd4d8d8.y7(activityC11344x4cd4d8d8.z7()) : activityC11344x4cd4d8d8.M;
            }
            if (y76.size() > activityC11344x4cd4d8d8.f154004J) {
                db5.e1.u(activityC11344x4cd4d8d8.mo55332x76847179(), activityC11344x4cd4d8d8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571299b3, java.lang.Long.valueOf(activityC11344x4cd4d8d8.f154004J)), "", new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.k1(this, y76), new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.l1(this));
            } else if (activityC11344x4cd4d8d8.A7() && y76.size() == 0) {
                db5.t7.g(activityC11344x4cd4d8d8.mo55332x76847179(), activityC11344x4cd4d8d8.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.iep));
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11344x4cd4d8d8.x7(activityC11344x4cd4d8d8, y76);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13721, 2, 6);
    }
}
