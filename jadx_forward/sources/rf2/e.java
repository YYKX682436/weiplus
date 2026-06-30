package rf2;

/* loaded from: classes10.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f476233d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rf2.f f476234e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(rf2.f fVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f476234e = fVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rf2.e(this.f476234e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rf2.e) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        android.view.View view;
        android.view.ViewGroup viewGroup;
        android.view.ViewGroup viewGroup2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f476233d;
        java.lang.Object obj2 = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            rf2.f fVar = this.f476234e;
            android.view.View view2 = fVar.f476250h;
            android.view.View view3 = fVar.f476249g;
            java.lang.Object obj3 = null;
            if (view2 != null && view3 != null) {
                java.lang.String str = fVar.f476248f;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("on vote_desc back click, before animation,winnerContainner:");
                df2.ln lnVar = fVar.f476247e;
                rf2.q qVar = lnVar.f312211o;
                sb6.append((qVar == null || (viewGroup2 = qVar.f476390h) == null) ? null : new java.lang.Integer(viewGroup2.getVisibility()));
                sb6.append(",participantContainner:");
                rf2.a aVar2 = lnVar.f312212p;
                sb6.append((aVar2 == null || (viewGroup = aVar2.f476172g) == null) ? null : new java.lang.Integer(viewGroup.getVisibility()));
                sb6.append(",voteDescContainer:");
                rf2.f fVar2 = lnVar.f312213q;
                if (fVar2 != null && (view = fVar2.f476250h) != null) {
                    obj3 = new java.lang.Integer(view.getVisibility());
                }
                sb6.append(obj3);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
                rf2.t.b(rf2.t.f476423a, fVar.f476248f, view2, view3, false, new rf2.d(fVar, view2, view3), null, 32, null);
                obj3 = obj2;
            }
            if (obj3 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.f476248f, "on vote_desc back click without animation!");
                df2.ln lnVar2 = fVar.f476247e;
                r45.f02 f02Var = lnVar2.f312218v;
                if (f02Var != null) {
                    df2.dn dnVar = lnVar2.f312221y;
                    yz5.l lVar = lnVar2.f312220x;
                    this.f476233d = 1;
                    if (lnVar2.b7(dnVar, f02Var, false, false, lVar, this) == aVar) {
                        return aVar;
                    }
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return obj2;
    }
}
