package g43;

/* loaded from: classes5.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g43.x f350314d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(g43.x xVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f350314d = xVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new g43.s(this.f350314d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        g43.s sVar = (g43.s) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        sVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        g43.x xVar = this.f350314d;
        java.lang.String str = xVar.f350329f;
        if (str != null) {
            jz5.g gVar = xVar.f350331h;
            java.util.List jd6 = ((y33.h) gVar.mo141623x754a37bb()).jd(str, 400);
            long e37 = ((y33.h) gVar.mo141623x754a37bb()).e3(str);
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("GameChatRoom.ChatroomMemberViewModel", "getMemberFromLocal localMemberNum = " + e37);
            int i17 = 0;
            boolean z17 = e37 > 400;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(jd6, 10));
            for (java.lang.Object obj2 : jd6) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                y33.g gVar2 = (y33.g) obj2;
                arrayList.add(i17 == 0 ? new w33.c(new jz5.l(java.lang.Boolean.TRUE, "其他成员"), gVar2.t0(), false, 201, 4, null) : i17 == jd6.size() + (-1) ? new w33.c(null, gVar2.t0(), z17, 201, 1, null) : new w33.c(null, gVar2.t0(), false, 201, 5, null));
                i17 = i18;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                if (!xVar.f350332i.contains(((w33.c) next).f524243b.f524248a)) {
                    arrayList2.add(next);
                }
            }
            xVar.f350327d.mo7808x76db6cb1(w33.b.a(xVar.O6(), null, null, null, new jz5.l(java.lang.Boolean.TRUE, arrayList2), 7, null));
        }
        return jz5.f0.f384359a;
    }
}
