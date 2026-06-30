package mx0;

/* loaded from: classes5.dex */
public final class b4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f413379d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced f413380e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f413380e = c10977x8e40eced;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mx0.b4(this.f413380e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx0.b4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        long m47321x15ed173;
        mx0.g3 m47316xc93d195a;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f413379d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f413380e.D1.dismiss();
            m47321x15ed173 = this.f413380e.m47321x15ed173();
            this.f413379d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(m47321x15ed173, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        m47316xc93d195a = this.f413380e.m47316xc93d195a();
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10973x5ab09303 c10973x5ab09303 = m47316xc93d195a.f413526g;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced = this.f413380e;
        xx0.n nVar = c10977x8e40eced.K1;
        boolean z17 = nVar != null && nVar.f539457j;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (z17) {
            return f0Var;
        }
        if (c10977x8e40eced.f151090v.M() == null) {
            if (c10977x8e40eced.D1.isShowing()) {
                c10977x8e40eced.D1.dismiss();
            }
            return f0Var;
        }
        if (c10973x5ab09303.getVisibility() == 0) {
            android.content.Context context = c10977x8e40eced.getContext();
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            if (activity == null || activity.isFinishing()) {
                return f0Var;
            }
            yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
            p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.k6(m7Var, null), 3, null);
            qx0.e eVar = c10977x8e40eced.D1;
            eVar.getClass();
            eVar.getContentView().measure(0, 0);
            int measuredWidth = eVar.getContentView().getMeasuredWidth();
            int measuredHeight = eVar.getContentView().getMeasuredHeight();
            int height = c10973x5ab09303.getHeight();
            int[] iArr = new int[2];
            c10973x5ab09303.getLocationInWindow(iArr);
            int i18 = (iArr[1] - 0) - measuredHeight;
            int i19 = eVar.f448807d ? (iArr[0] + (height / 2)) - (measuredWidth / 2) : iArr[0];
            eVar.setAnimationStyle(com.p314xaae8f345.mm.R.C30868x68b1db1.f576143rl);
            eVar.showAtLocation(c10973x5ab09303, 0, i19, i18);
            c10977x8e40eced.G1++;
        }
        return f0Var;
    }
}
