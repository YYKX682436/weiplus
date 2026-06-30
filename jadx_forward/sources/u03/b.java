package u03;

/* loaded from: classes10.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f504995d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u03.c f504996e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(byte[] bArr, u03.c cVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f504995d = bArr;
        this.f504996e = cVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new u03.b(this.f504995d, this.f504996e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((u03.b) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e;
        java.lang.String substring;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        try {
            com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.b bVar = new com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.b();
            bVar.mo11468x92b714fd(this.f504995d);
            java.lang.Object obj2 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).ol(bVar.f149467e, bVar.f149468f, 2).f384367e;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = obj2 instanceof com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 ? (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) obj2 : null;
            if (c19792x256d2725 != null) {
                u03.c cVar = this.f504996e;
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = c19792x256d2725.m76802x2dd01666();
                if (m76802x2dd01666 != null && (m76962x74cd162e = m76802x2dd01666.m76962x74cd162e()) != null && (c19788xd7cfd73e = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) kz5.n0.Z(m76962x74cd162e)) != null) {
                    dk4.a rj6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).rj(c19788xd7cfd73e, c19792x256d2725.m76784x5db1b11(), true);
                    if (rj6 != null) {
                        ck4.c cVar2 = ck4.c.f124081a;
                        java.lang.String str = rj6.f316015s;
                        if (str == null) {
                            str = "";
                        }
                        java.lang.String str2 = rj6.f316017u;
                        if (str2 == null) {
                            str2 = "";
                        }
                        java.lang.String str3 = rj6.f316016t;
                        if (str3 == null) {
                            str3 = "";
                        }
                        int i17 = rj6.f315997a;
                        java.lang.String str4 = rj6.f315998b;
                        if (str4 == null) {
                            str4 = "xV2";
                        }
                        java.lang.String str5 = rj6.f315999c;
                        if (str5 == null) {
                            str5 = "";
                        }
                        java.lang.String str6 = rj6.f316000d;
                        if (str6 == null) {
                            str6 = "";
                        }
                        java.lang.String str7 = rj6.f316014r;
                        if (str7 == null) {
                            str7 = "";
                        }
                        cVar.getClass();
                        ck4.b b17 = cVar2.b(str, str2, str3, i17, str4, str5, str6, str7, null, "MicroMsg.FinderCdnTaskFactory");
                        b17.f124067d2 = bVar.f149467e;
                        b17.f124071h2 = rj6.f316018v;
                        b17.f124072i2 = rj6.f316019w;
                        b17.f124073j2 = rj6.f316003g * 1000;
                        b17.f124074k2 = rj6.f316020x;
                        java.lang.String m76801x8010e5e4 = c19792x256d2725.m76801x8010e5e4();
                        if (m76801x8010e5e4 == null) {
                            m76801x8010e5e4 = "";
                        }
                        b17.f124075l2 = m76801x8010e5e4;
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016662 = c19792x256d2725.m76802x2dd01666();
                        java.lang.String m76944x730bcac6 = m76802x2dd016662 != null ? m76802x2dd016662.m76944x730bcac6() : null;
                        if (m76944x730bcac6 == null) {
                            m76944x730bcac6 = "";
                        }
                        b17.f124076m2 = m76944x730bcac6;
                        if (android.text.TextUtils.isEmpty(m76944x730bcac6)) {
                            substring = "";
                        } else {
                            substring = m76944x730bcac6.substring(0, java.lang.Math.min(4, m76944x730bcac6.length()));
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                        }
                        b17.f124077n2 = substring;
                        return b17;
                    }
                }
            }
        } catch (java.lang.Exception unused) {
        }
        return null;
    }
}
