package zl2;

/* loaded from: classes.dex */
public final class c0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az2.f f555218d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f555219e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f555220f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(az2.f fVar, p3325xe03a0797.p3326xc267989b.q qVar, android.content.Context context) {
        super(1);
        this.f555218d = fVar;
        this.f555219e = qVar;
        this.f555220f = context;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.an4 an4Var;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        this.f555218d.b();
        boolean z17 = true;
        java.lang.String m75945x2fec8307 = (fVar == null || (an4Var = (r45.an4) fVar.f152151d) == null) ? null : an4Var.m75945x2fec8307(1);
        boolean z18 = fVar != null && fVar.f152148a == 0;
        android.content.Context context = this.f555220f;
        p3325xe03a0797.p3326xc267989b.q qVar = this.f555219e;
        if (z18 && fVar.f152149b == 0) {
            if (m75945x2fec8307 != null && m75945x2fec8307.length() != 0) {
                z17 = false;
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveShareProductDialog", "MmecGetProductTagLinkReq get empty link");
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new jz5.l(java.lang.Boolean.FALSE, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.leh))));
            } else {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.e(m75945x2fec8307);
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new jz5.l(java.lang.Boolean.TRUE, "")));
            }
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MmecGetProductTagLinkReq failed, err code = ");
            sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f152149b) : null);
            sb6.append(", errType = ");
            sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f152148a) : null);
            sb6.append(", errMsg = ");
            sb6.append(fVar != null ? fVar.f152150c : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveShareProductDialog", sb6.toString());
            java.lang.String str = fVar != null ? fVar.f152150c : null;
            if (str == null) {
                str = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.leh);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getString(...)");
            }
            p3321xbce91901.C29043x91b2b43d.Companion companion3 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new jz5.l(java.lang.Boolean.FALSE, str)));
        }
        return jz5.f0.f384359a;
    }
}
