package f93;

/* loaded from: classes11.dex */
public final class o2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f341942d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16170x2911e4dc f341943e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f341944f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f341945g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16170x2911e4dc activityC16170x2911e4dc, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f341943e = activityC16170x2911e4dc;
        this.f341944f = arrayList;
        this.f341945g = arrayList2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new f93.o2(this.f341943e, this.f341944f, this.f341945g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((f93.o2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f341942d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392103c;
            f93.n2 n2Var = new f93.n2(this.f341945g, this.f341944f, null);
            this.f341942d = 1;
            obj = p3325xe03a0797.p3326xc267989b.l.g(p0Var, n2Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.util.LinkedList linkedList = (java.util.LinkedList) obj;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (linkedList == null) {
            android.app.ProgressDialog progressDialog = this.f341943e.f224803p;
            if (progressDialog != null && progressDialog.isShowing()) {
                progressDialog.dismiss();
            }
            return f0Var;
        }
        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6205xeec13785().e();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.g) vg3.n3.f518269n1.a()).wi(new vg3.e(vg3.d.f518214g, vg3.b.f518178e, vg3.c.f518204z, 0, this.f341944f, 8, null));
        c01.d9.e().g(new e93.e(linkedList));
        return f0Var;
    }
}
