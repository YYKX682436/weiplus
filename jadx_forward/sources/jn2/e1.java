package jn2;

/* loaded from: classes8.dex */
public final class e1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f382122d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jn2.r1 f382123e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.z22 f382124f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f382125g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f382126h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(jn2.r1 r1Var, r45.z22 z22Var, java.lang.String str, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f382123e = r1Var;
        this.f382124f = z22Var;
        this.f382125g = str;
        this.f382126h = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new jn2.e1(this.f382123e, this.f382124f, this.f382125g, this.f382126h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((jn2.e1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f382122d;
        jn2.r1 r1Var = this.f382123e;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                sf2.x xVar = r1Var.I;
                java.util.List c17 = kz5.b0.c(this.f382124f);
                this.f382122d = 1;
                obj = xVar.b7(c17, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
            java.lang.String str = this.f382125g;
            if (booleanValue) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1Var.f382215J, "deleteNewSong success: " + str);
                jn2.z1 z1Var = r1Var.f382219x0;
                int i18 = this.f382126h;
                if (z1Var != null && (arrayList2 = z1Var.f382302h) != null) {
                }
                jn2.z1 z1Var2 = r1Var.f382219x0;
                if (z1Var2 != null) {
                    z1Var2.m8155x27702c4(i18);
                }
                jn2.z1 z1Var3 = r1Var.f382219x0;
                int size = (z1Var3 == null || (arrayList = z1Var3.f382302h) == null) ? 0 : arrayList.size();
                r1Var.k(size);
                if (size == 0) {
                    r1Var.d(false);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1Var.f382215J, "deleteNewSong failed: " + str);
                db5.t7.m(r1Var.f199716e, "删除失败，请稍后再试");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1Var.f382215J, "deleteNewSong exception: " + e17.getMessage());
            db5.t7.m(r1Var.f199716e, "删除失败，请稍后再试");
        }
        return jz5.f0.f384359a;
    }
}
