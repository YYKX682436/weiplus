package du3;

/* loaded from: classes3.dex */
public final class g3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f325134d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ du3.t3 f325135e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(java.util.ArrayList arrayList, du3.t3 t3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f325134d = arrayList;
        this.f325135e = t3Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new du3.g3(this.f325134d, this.f325135e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        du3.g3 g3Var = (du3.g3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        g3Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        for (hk0.j jVar : this.f325134d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoPreviewPlugin", "collectEventStateJob " + jVar.f363285a);
            qk.g6 g6Var = qk.g6.CROP_PHOTO;
            du3.t3 t3Var = this.f325135e;
            int i17 = jVar.f363285a;
            if (i17 == 5) {
                l45.q qVar = t3Var.f325259p;
                if (qVar != null) {
                    new l45.a((l45.n) qVar).b(g6Var, 0, null);
                }
            } else if (i17 != 6) {
                qk.g6 g6Var2 = qk.g6.DEFAULT;
                if (i17 == 8) {
                    l45.q qVar2 = t3Var.f325259p;
                    if (qVar2 != null) {
                        new l45.a((l45.n) qVar2).a(g6Var2);
                    }
                    l45.q qVar3 = t3Var.f325259p;
                    if (qVar3 != null) {
                        new l45.a((l45.n) qVar3).b(g6Var, 5, null);
                    }
                    hk0.u0.e7(t3Var.E(), 4, null, 2, null);
                } else if (i17 == 9) {
                    l45.q qVar4 = t3Var.f325259p;
                    if (qVar4 != null) {
                        new l45.a((l45.n) qVar4).a(g6Var2);
                    }
                    l45.q qVar5 = t3Var.f325259p;
                    if (qVar5 != null) {
                        new l45.a((l45.n) qVar5).b(g6Var, 4, null);
                    }
                    hk0.u0.e7(t3Var.E(), 4, null, 2, null);
                }
            } else {
                l45.q qVar6 = t3Var.f325259p;
                if (qVar6 != null) {
                    new l45.a((l45.n) qVar6).b(g6Var, 3, null);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
