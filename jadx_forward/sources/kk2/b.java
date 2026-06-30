package kk2;

/* loaded from: classes3.dex */
public final class b implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kk2.d f390015a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f390016b;

    public b(kk2.d dVar, java.lang.String str) {
        this.f390015a = dVar;
        this.f390016b = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reserve cgi: errCode=");
        sb6.append(fVar.f152149b);
        sb6.append(", errType=");
        sb6.append(fVar.f152148a);
        sb6.append(", noticeId=");
        kk2.d dVar = this.f390015a;
        sb6.append(dVar.f390019i.m75945x2fec8307(4));
        sb6.append(", anchorUsername=");
        java.lang.String str = this.f390016b;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveNoticeGuidePanel", sb6.toString());
        int i17 = fVar.f152149b;
        android.content.Context context = dVar.f199914d;
        r45.h32 h32Var = dVar.f390019i;
        if (i17 == 0 && fVar.f152148a == 0) {
            h32Var.set(1, 0);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i1 i1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i1.f189463a;
            java.lang.String m75945x2fec8307 = h32Var.m75945x2fec8307(4);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            r45.h32 e17 = i1Var.e(str, m75945x2fec8307);
            if (e17 != null) {
                e17.set(1, java.lang.Integer.valueOf(h32Var.m75939xb282bd08(1)));
            } else {
                java.lang.String m75945x2fec83072 = h32Var.m75945x2fec8307(4);
                if (m75945x2fec83072 != null) {
                    i1Var.a(str, m75945x2fec83072, h32Var);
                }
            }
            android.widget.Toast m123883x26a183b = db5.t7.m123883x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.e0j), 0);
            m123883x26a183b.setGravity(17, 0, 0);
            m123883x26a183b.show();
        } else {
            db5.t7.m123882x26a183b(context, com.p314xaae8f345.mm.R.C30867xcad56011.f81514xe34e69a8, 0).show();
        }
        java.lang.String m75945x2fec83073 = h32Var.m75945x2fec8307(4);
        dVar.y(2, 2, m75945x2fec83073 != null ? m75945x2fec83073 : "");
        dVar.a();
        ((df2.wv) dVar.f390018h).a();
        return jz5.f0.f384359a;
    }
}
