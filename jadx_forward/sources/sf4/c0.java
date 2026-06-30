package sf4;

/* loaded from: classes4.dex */
public final class c0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 f488958d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 c18497x85806502) {
        super(2);
        this.f488958d = c18497x85806502;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.util.List arrayList;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        java.util.List arrayList2;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df192;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        long longValue = ((java.lang.Number) obj2).longValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18495x53f31c35 c18495x53f31c35 = this.f488958d.f253627n;
        if (c18495x53f31c35 != null && bf4.f.f101248b.f()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18486xb54a9331 c18486xb54a9331 = c18495x53f31c35.msgView;
            if (!booleanValue) {
                c18486xb54a9331.getClass();
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.B0(longValue, c18486xb54a9331.f253558w)) {
                java.util.ArrayList arrayList3 = c18486xb54a9331.f253551p;
                if (!arrayList3.isEmpty()) {
                    if (c18486xb54a9331.f253553r) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18485x239212ef c18485x239212ef = (com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18485x239212ef) arrayList3.get(1);
                        if4.a aVar = c18486xb54a9331.f253552q;
                        if (aVar == null || (arrayList2 = aVar.f372773h) == null) {
                            arrayList2 = new java.util.ArrayList();
                        }
                        c18485x239212ef.getClass();
                        if (c18485x239212ef.f253536f == 1 && (mo7946xf939df192 = c18485x239212ef.f253534d.mo7946xf939df19()) != null) {
                            ((pf4.w) mo7946xf939df192).x(c18485x239212ef.a(arrayList2));
                        }
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18485x239212ef c18485x239212ef2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18485x239212ef) arrayList3.get(0);
                        if4.a aVar2 = c18486xb54a9331.f253552q;
                        if (aVar2 == null || (arrayList = aVar2.f372773h) == null) {
                            arrayList = new java.util.ArrayList();
                        }
                        c18485x239212ef2.getClass();
                        if (c18485x239212ef2.f253536f == 1 && (mo7946xf939df19 = c18485x239212ef2.f253534d.mo7946xf939df19()) != null) {
                            ((pf4.w) mo7946xf939df19).x(c18485x239212ef2.a(arrayList));
                        }
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
