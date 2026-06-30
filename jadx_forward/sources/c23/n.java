package c23;

/* loaded from: classes.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c23.o f119582d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(c23.o oVar) {
        super(1);
        this.f119582d = oVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        b23.a state = (b23.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        if (dVar != null && (dVar instanceof b23.b)) {
            this.f119582d.getClass();
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "10000");
            java.lang.String f17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f17, "getCurrentLanguage(...)");
            hashMap.put("lang", f17);
            hashMap.put("platform", com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f);
            hashMap.put("version", java.lang.String.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.g(9).b()));
            hashMap.put(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56087x98abae37, com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.b());
            java.lang.String CLIENT_VERSION = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274644g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(CLIENT_VERSION, "CLIENT_VERSION");
            hashMap.put("wechatVersion", CLIENT_VERSION);
            hashMap.put("nativeHeight", "0");
            float q17 = i65.a.q(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            if (!(q17 == 1.0f)) {
                if (!(q17 == 0.8f)) {
                    if (!(q17 == 1.1f)) {
                        if (!(q17 == 1.12f)) {
                            if (!(q17 == 1.125f)) {
                                if (!(q17 == 1.4f)) {
                                    if (!(q17 == 1.55f)) {
                                        if (!(q17 == 1.65f)) {
                                            q17 = 1.0f;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            hashMap.put("fontRatio", java.lang.String.valueOf(q17));
            hashMap.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, java.lang.String.valueOf(o13.p.f423783c));
            o13.p.f423784d = o13.n.g(3);
            hashMap.put("entranceExptValue", "2");
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "103");
            hashMap.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, "" + o13.p.f423784d);
            hashMap.put("subSessionId", "" + o13.p.f423783c);
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("file://");
            stringBuffer.append(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.g(9).l());
            stringBuffer.append("/app.html?");
            stringBuffer.append(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.k(hashMap));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "getHotSearchUrl， rawurl, urlBuffer.toString() = " + ((java.lang.Object) stringBuffer));
            java.lang.String stringBuffer2 = stringBuffer.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stringBuffer2, "toString(...)");
            state.f98918e = stringBuffer2;
        }
        return jz5.f0.f384359a;
    }
}
