package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes8.dex */
public class t0 extends com.p314xaae8f345.mm.ui.z9 {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16129xb3d75601 f224542o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16129xb3d75601 activityC16129xb3d75601, android.content.Context context) {
        super(context, null);
        this.f224542o = activityC16129xb3d75601;
        r(true);
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        s83.l lVar = (s83.l) obj;
        if (lVar == null) {
            lVar = new s83.l();
        }
        lVar.mo9015xbf5d97fd(cursor);
        return lVar;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        if (view == null) {
            view = this.f224542o.getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bly, viewGroup, false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.s0 s0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.s0(this);
            s0Var.f224533a = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.l_z);
            s0Var.f224534b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f567989la1);
            s0Var.f224535c = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f567990la2);
            view.setTag(s0Var);
        }
        s83.l lVar = (s83.l) getItem(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.s0 s0Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.s0) view.getTag();
        s0Var2.f224534b.setText(t83.c.c(lVar.f68176x5b3f2672));
        long j17 = lVar.f68174xa7075739;
        if (j17 > 0) {
            s0Var2.f224535c.setText(t83.f.a(j17));
        } else {
            s0Var2.f224535c.setText(t83.f.h(lVar.f68177x10a0fed7));
        }
        s0Var2.f224533a.setText(t83.f.b(lVar.f68173x138777d0));
        return view;
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void o() {
        c();
        q();
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void q() {
        android.database.Cursor E;
        s83.c D0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16129xb3d75601 activityC16129xb3d75601 = this.f224542o;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC16129xb3d75601.f224081e)) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC16129xb3d75601.f224080d)) {
                E = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Vi().f486421d.E("IPCallRecord", s83.m.f486420f, "phonenumber=?", new java.lang.String[]{activityC16129xb3d75601.f224080d}, null, null, "calltime desc");
            }
            E = null;
        } else {
            java.lang.String str = activityC16129xb3d75601.f224081e;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && (D0 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.wi().D0(str)) != null) {
                long j17 = D0.f72763xa3c65b86;
                if (j17 != -1) {
                    E = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Vi().y0(j17);
                }
            }
            E = null;
        }
        s(E);
    }
}
