package qb2;

/* loaded from: classes10.dex */
public final class f0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qb2.t f442738d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qb2.g0 f442739e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f442740f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f442741g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(qb2.t tVar, qb2.g0 g0Var, java.lang.String str, android.view.View view) {
        super(4);
        this.f442738d = tVar;
        this.f442739e = g0Var;
        this.f442740f = str;
        this.f442741g = view;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        int intValue = ((java.lang.Number) obj2).intValue();
        int intValue2 = ((java.lang.Number) obj3).intValue();
        if (intValue == 0 && intValue2 == 0) {
            pm0.v.X(new qb2.e0(booleanValue, this.f442739e, this.f442738d, this.f442740f, this.f442741g));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p pVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p.f206755a;
        java.lang.String field_sessionId = this.f442738d.f65866xbed8694c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_sessionId, "field_sessionId");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.a6 a6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p.f206757c;
        boolean z17 = a6Var.f206482a;
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.a6 a6Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p.f206756b;
            a6Var2.getClass();
            if (a6Var2.f206482a) {
                a6Var2.b(field_sessionId, 2);
            }
        } else if (z17) {
            a6Var.b(field_sessionId, 2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p.f206760f.f206678g = r7.f65870xa35b5abb;
        return jz5.f0.f384359a;
    }
}
