package iy2;

/* loaded from: classes15.dex */
public final class z implements iy2.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15489x5c3b8a7a f377448a;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15489x5c3b8a7a c15489x5c3b8a7a) {
        this.f377448a = c15489x5c3b8a7a;
    }

    public void a(int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15489x5c3b8a7a c15489x5c3b8a7a = this.f377448a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c15489x5c3b8a7a.f218296d, "VoiceDetectListener onDetectError localerrorType = %s errorType = %s errCode = %s time %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15489x5c3b8a7a.a(c15489x5c3b8a7a);
        iy2.c cVar = c15489x5c3b8a7a.f218314y;
        if (cVar != null) {
            cVar.b(c15489x5c3b8a7a.f218304o);
        }
        c15489x5c3b8a7a.e();
        android.content.Context context = c15489x5c3b8a7a.f218306q;
        if (context instanceof android.app.Activity) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            ((android.app.Activity) context).getWindow().clearFlags(128);
        }
        if (i17 == 12) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15489x5c3b8a7a.b(c15489x5c3b8a7a, com.p314xaae8f345.mm.R.C30867xcad56011.nw9);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15489x5c3b8a7a.b(c15489x5c3b8a7a, com.p314xaae8f345.mm.R.C30867xcad56011.non);
        }
        iy2.r rVar = c15489x5c3b8a7a.f218303n;
        if (rVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wr) rVar).a(false);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = c15489x5c3b8a7a.f218304o;
        if (c22621x7603e017 != null) {
            c22621x7603e017.setHint((java.lang.CharSequence) null);
        }
    }
}
