package yw3;

/* loaded from: classes11.dex */
public final class p6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw3.q6 f548384d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(yw3.q6 q6Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f548384d = q6Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yw3.p6(this.f548384d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        yw3.p6 p6Var = (yw3.p6) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        p6Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.util.LongSparseArray longSparseArray = m95.k.f406639c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(longSparseArray, "getSVGResArray(...)");
        int size = longSparseArray.size();
        int i17 = 0;
        for (int i18 = 0; i18 < size; i18++) {
            longSparseArray.keyAt(i18);
            android.graphics.drawable.Drawable.ConstantState constantState = (android.graphics.drawable.Drawable.ConstantState) longSparseArray.valueAt(i18);
            if (constantState instanceof m95.i) {
                i17++;
                int i19 = ((m95.i) constantState).f406632a;
                java.lang.String resourceName = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getResourceName(i19);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resourceName, "getResourceName(...)");
                java.lang.String substring = resourceName.substring(19);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                arrayList.add(new yw3.s6(java.lang.String.valueOf(i17), i17, i19, substring));
            }
        }
        kz5.g0.t(arrayList, yw3.o6.f548374d);
        j75.f Q6 = this.f548384d.Q6();
        if (Q6 != null) {
            Q6.B3(new yw3.r6(arrayList));
        }
        return jz5.f0.f384359a;
    }
}
