package pn4;

/* loaded from: classes14.dex */
public final class k0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f438664d;

    /* renamed from: e, reason: collision with root package name */
    public int f438665e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f438666f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pn4.q0 f438667g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f438668h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.hy3 f438669i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ byte[] f438670m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(pn4.q0 q0Var, int i17, r45.hy3 hy3Var, byte[] bArr, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f438667g = q0Var;
        this.f438668h = i17;
        this.f438669i = hy3Var;
        this.f438670m = bArr;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        pn4.k0 k0Var = new pn4.k0(this.f438667g, this.f438668h, this.f438669i, this.f438670m, interfaceC29045xdcb5ca57);
        k0Var.f438666f = obj;
        return k0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((pn4.k0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object m143895xf1229813;
        pn4.q0 q0Var;
        int i17;
        byte[] bArr = this.f438670m;
        pz5.a aVar = pz5.a.f440719d;
        int i18 = this.f438665e;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i18 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            pn4.q0 q0Var2 = this.f438667g;
            java.lang.String str = q0Var2.f438723e;
            r45.hy3 hy3Var = this.f438669i;
            hy3Var.m75939xb282bd08(5);
            hy3Var.m75933x41a8a7f2(1);
            com.p314xaae8f345.mm.vfs.r6 s17 = new com.p314xaae8f345.mm.vfs.r6(q0Var2.g()).s();
            if (s17 != null) {
                s17.J();
            }
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                com.p314xaae8f345.mm.vfs.w6.a(q0Var2.g(), bArr);
                java.util.List list = q0Var2.f438725g;
                java.util.LinkedList m75941xfb821914 = hy3Var.m75941xfb821914(4);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getAudioExtInfo(...)");
                ((java.util.ArrayList) list).addAll(m75941xfb821914);
                java.util.ArrayList arrayList = (java.util.ArrayList) list;
                if (arrayList.size() > 1) {
                    kz5.g0.t(arrayList, new pn4.j0());
                }
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var);
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
            java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
            if (m143898xd4a2fc34 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(q0Var2.f438723e, "write tmp file error " + m143898xd4a2fc34);
            }
            q0Var2.getClass();
            int i19 = q0Var2.f438728j;
            pn4.e0 e0Var = q0Var2.f438726h;
            int length = bArr.length;
            this.f438666f = q0Var2;
            this.f438664d = i19;
            this.f438665e = 1;
            java.lang.Object c17 = e0Var.c(bArr, i19, length, this);
            if (c17 == aVar) {
                return aVar;
            }
            q0Var = q0Var2;
            obj = c17;
            i17 = i19;
        } else {
            if (i18 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i17 = this.f438664d;
            q0Var = (pn4.q0) this.f438666f;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        q0Var.f438728j = i17 + ((java.lang.Number) obj).intValue();
        return f0Var;
    }
}
