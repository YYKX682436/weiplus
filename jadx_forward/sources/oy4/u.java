package oy4;

/* loaded from: classes5.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f431612d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oy4.v f431613e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(java.util.ArrayList arrayList, oy4.v vVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f431612d = arrayList;
        this.f431613e = vVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new oy4.u(this.f431612d, this.f431613e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((oy4.u) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        boolean z17;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getImageFeatureResult >> ");
        java.util.ArrayList arrayList2 = this.f431612d;
        sb6.append(arrayList2.size());
        sb6.append(' ');
        sb6.append(java.lang.Thread.currentThread());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FeatureApiImpl", sb6.toString());
        oy4.v vVar = this.f431613e;
        vVar.getClass();
        if (oy4.v.f431614d != null) {
            z17 = true;
        } else {
            ny4.f fVar = new ny4.f();
            oy4.v.f431614d = fVar;
            boolean c17 = fVar.c(null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FeatureApiImpl", "initEnv >> " + c17 + ' ' + oy4.v.f431614d);
            z17 = c17;
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FeatureApiImpl", "getImageFeatureResult init error");
            return arrayList;
        }
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            oy4.a a17 = ny4.h.f423000a.a((java.lang.String) it.next());
            java.nio.Buffer buffer = a17 != null ? a17.f431585b : null;
            android.graphics.Bitmap bitmap = a17 != null ? a17.f431584a : null;
            if (buffer == null || bitmap == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FeatureApiImpl", "getImageFeatureResult >> buffer get error");
                arrayList.add(new float[0]);
            } else {
                ny4.f fVar2 = oy4.v.f431614d;
                float[] a18 = fVar2 != null ? fVar2.a(buffer, bitmap.getWidth(), bitmap.getHeight()) : new float[0];
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FeatureApiImpl", "getImageFeatureResult >> result: " + a18);
                arrayList.add(a18);
            }
        }
        vVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FeatureApiImpl", "destroyEnv " + oy4.v.f431614d);
        ny4.f fVar3 = oy4.v.f431614d;
        if (fVar3 != null) {
            fVar3.b();
        }
        oy4.v.f431614d = null;
        return arrayList;
    }
}
