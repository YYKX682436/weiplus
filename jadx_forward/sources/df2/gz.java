package df2;

/* loaded from: classes3.dex */
public final class gz extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f311795d;

    /* renamed from: e, reason: collision with root package name */
    public int f311796e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.lz f311797f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gz(df2.lz lzVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f311797f = lzVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.gz(this.f311797f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.gz) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        r45.aq4 aq4Var;
        java.lang.String str;
        r45.c8 c8Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f311796e;
        df2.lz lzVar = this.f311797f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            android.widget.TextView c76 = lzVar.c7();
            if (c76 != null) {
                c76.setTextSize(2, 11.0f);
            }
            r45.aq4 aq4Var2 = (r45.aq4) ((mm2.f6) lzVar.m56788xbba4bfc0(mm2.f6.class)).B1.mo3195x754a37bb();
            this.f311795d = aq4Var2;
            this.f311796e = 1;
            if (df2.lz.Z6(lzVar, aq4Var2, this) == aVar) {
                return aVar;
            }
            aq4Var = aq4Var2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aq4Var = (r45.aq4) this.f311795d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b a76 = lzVar.a7();
        if (a76 != null) {
            rj.j a17 = nn2.d.f420204a.a();
            if (aq4Var == null || (c8Var = (r45.c8) aq4Var.m75936x14adae67(3)) == null || (str = c8Var.m75945x2fec8307(0)) == null) {
                str = "";
            }
            rj.j.b(a17, str, a76, lzVar.f312263m, null, 8, null);
            a76.m82582x3ae760af(1.0d);
            a76.d();
        }
        return jz5.f0.f384359a;
    }
}
