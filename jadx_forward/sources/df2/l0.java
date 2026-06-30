package df2;

/* loaded from: classes3.dex */
public final class l0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v65.n f312149d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.f f312150e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.v0 f312151f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f312152g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(v65.n nVar, com.p314xaae8f345.mm.p944x882e457a.f fVar, df2.v0 v0Var, boolean z17) {
        super(0);
        this.f312149d = nVar;
        this.f312150e = fVar;
        this.f312151f = v0Var;
        this.f312152g = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.ix0 ix0Var;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = this.f312150e;
        this.f312149d.a(java.lang.Boolean.valueOf(xg2.g.e(fVar)));
        if (xg2.g.e(fVar)) {
            boolean z17 = true;
            java.util.Iterator it = ((r45.m02) fVar.f152151d).m75941xfb821914(1).iterator();
            while (true) {
                if (!it.hasNext()) {
                    ix0Var = null;
                    break;
                }
                ix0Var = (r45.ix0) it.next();
                if (ix0Var.m75939xb282bd08(0) == 15) {
                    break;
                }
            }
            if (ix0Var != null) {
                int m75939xb282bd08 = ix0Var.m75939xb282bd08(1);
                df2.v0 v0Var = this.f312151f;
                if (m75939xb282bd08 == 0) {
                    com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = ix0Var.m75934xbce7f2f(3);
                    if (m75934xbce7f2f != null) {
                        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = m75934xbce7f2f.f273689a.length > 0 ? m75934xbce7f2f : null;
                        if (gVar != null) {
                            r45.z02 z02Var = new r45.z02();
                            z02Var.mo11468x92b714fd(gVar.g());
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveEditCoverController", "#executeUpload finally done. new remain: " + z02Var.m75939xb282bd08(0));
                            ((mm2.f1) v0Var.m56788xbba4bfc0(mm2.f1.class)).f410553f = z02Var;
                            v0Var.f313105m = c01.id.c();
                            if (this.f312152g) {
                                db5.t7.h(v0Var.N6(), v0Var.O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573300e65));
                            }
                            org.json.JSONObject jSONObject = new org.json.JSONObject();
                            jSONObject.put("element", 6);
                            jSONObject.put("type", 1);
                            jSONObject.put("sub_element", 7);
                            jSONObject.put("sub_type", 4);
                            java.lang.String str = v0Var.f313106n;
                            if (str != null && str.length() != 0) {
                                z17 = false;
                            }
                            if (!z17) {
                                jSONObject.put("ai_msg_id", v0Var.f313106n);
                            }
                            i95.m c17 = i95.n0.c(ml2.j0.class);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                            zy2.zb.y6((zy2.zb) c17, ml2.z4.D1, jSONObject.toString(), null, 4, null);
                        }
                    }
                } else {
                    db5.t7.g(v0Var.O6(), ix0Var.m75945x2fec8307(2));
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
