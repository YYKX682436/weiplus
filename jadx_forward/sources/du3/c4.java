package du3;

/* loaded from: classes3.dex */
public final class c4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f325086d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ du3.h4 f325087e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(java.util.ArrayList arrayList, du3.h4 h4Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f325086d = arrayList;
        this.f325087e = h4Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new du3.c4(this.f325086d, this.f325087e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        du3.c4 c4Var = (du3.c4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        c4Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        for (hk0.j jVar : this.f325086d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoUndoPlugin", "collect event >> " + jVar.f363285a);
            du3.h4 h4Var = this.f325087e;
            android.os.Bundle bundle = jVar.f363286b;
            int i17 = jVar.f363285a;
            if (i17 == 1) {
                h4Var.z(h4Var.D(), bundle.getBoolean("BUNDLE_KEY_BOOLEAN_1"));
            } else if (i17 == 2) {
                h4Var.z(h4Var.B(), bundle.getBoolean("BUNDLE_KEY_BOOLEAN_1"));
            }
        }
        return jz5.f0.f384359a;
    }
}
