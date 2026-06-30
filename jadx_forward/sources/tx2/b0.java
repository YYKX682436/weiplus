package tx2;

/* loaded from: classes.dex */
public final class b0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f504067d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tx2.i0 f504068e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(r45.h32 h32Var, tx2.i0 i0Var) {
        super(1);
        this.f504067d = h32Var;
        this.f504068e = i0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.LinkedList m75941xfb821914;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#tv_do_not_show_notice click noticeid=");
        r45.h32 h32Var = this.f504067d;
        sb6.append(h32Var.m75945x2fec8307(4));
        sb6.append(" resp.isSuccess=");
        sb6.append(fVar != null ? java.lang.Boolean.valueOf(fVar.b()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNoticeBigCardWidget", sb6.toString());
        boolean z17 = fVar != null && fVar.b();
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (z17) {
            r45.ml1 ml1Var = (r45.ml1) fVar.f152151d;
            if (ml1Var == null || (m75941xfb821914 = ml1Var.m75941xfb821914(1)) == null) {
                return null;
            }
            java.util.Iterator it = m75941xfb821914.iterator();
            while (it.hasNext()) {
                if (((r45.ix0) it.next()).m75939xb282bd08(0) == 0) {
                    tx2.i0 i0Var = this.f504068e;
                    android.content.Context context = i0Var.f199914d;
                    db5.t7.i(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m3m), com.p314xaae8f345.mm.R.raw.f79703xc84d169a);
                    java.util.Set set = tx2.h1.f504108a;
                    java.lang.String m75945x2fec8307 = h32Var.m75945x2fec8307(4);
                    if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0)) {
                        tx2.h1.f504108a.add(m75945x2fec8307);
                    }
                    yz5.a aVar = i0Var.A;
                    if (aVar != null) {
                        aVar.mo152xb9724478();
                    }
                    i0Var.a();
                }
            }
        }
        return f0Var;
    }
}
