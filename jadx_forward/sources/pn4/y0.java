package pn4;

/* loaded from: classes14.dex */
public final class y0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f438783d;

    /* renamed from: e, reason: collision with root package name */
    public int f438784e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f438785f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pn4.e1 f438786g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f438787h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.dh5 f438788i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ byte[] f438789m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(pn4.e1 e1Var, int i17, r45.dh5 dh5Var, byte[] bArr, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f438786g = e1Var;
        this.f438787h = i17;
        this.f438788i = dh5Var;
        this.f438789m = bArr;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        pn4.y0 y0Var = new pn4.y0(this.f438786g, this.f438787h, this.f438788i, this.f438789m, interfaceC29045xdcb5ca57);
        y0Var.f438785f = obj;
        return y0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((pn4.y0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object m143895xf1229813;
        pn4.e1 e1Var;
        int i17;
        byte[] bArr = this.f438789m;
        pz5.a aVar = pz5.a.f440719d;
        int i18 = this.f438784e;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i18 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            pn4.e1 e1Var2 = this.f438786g;
            java.lang.String str = e1Var2.f438619e;
            r45.dh5 dh5Var = this.f438788i;
            dh5Var.m75939xb282bd08(5);
            dh5Var.m75933x41a8a7f2(1);
            com.p314xaae8f345.mm.vfs.r6 s17 = new com.p314xaae8f345.mm.vfs.r6(e1Var2.g()).s();
            if (s17 != null) {
                s17.J();
            }
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                com.p314xaae8f345.mm.vfs.w6.a(e1Var2.g(), bArr);
                java.util.List list = e1Var2.f438621g;
                java.util.LinkedList m75941xfb821914 = dh5Var.m75941xfb821914(4);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getAudioExtInfo(...)");
                ((java.util.ArrayList) list).addAll(m75941xfb821914);
                java.util.ArrayList arrayList = (java.util.ArrayList) list;
                if (arrayList.size() > 1) {
                    kz5.g0.t(arrayList, new pn4.x0());
                }
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var);
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
            java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
            if (m143898xd4a2fc34 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(e1Var2.f438619e, "write tmp file error " + m143898xd4a2fc34);
            }
            e1Var2.getClass();
            int i19 = e1Var2.f438625k;
            pn4.t0 t0Var = e1Var2.f438623i;
            int length = bArr.length;
            this.f438785f = e1Var2;
            this.f438783d = i19;
            this.f438784e = 1;
            java.lang.Object c17 = t0Var.c(bArr, i19, length, this);
            if (c17 == aVar) {
                return aVar;
            }
            e1Var = e1Var2;
            obj = c17;
            i17 = i19;
        } else {
            if (i18 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i17 = this.f438783d;
            e1Var = (pn4.e1) this.f438785f;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        e1Var.f438625k = i17 + ((java.lang.Number) obj).intValue();
        return f0Var;
    }
}
