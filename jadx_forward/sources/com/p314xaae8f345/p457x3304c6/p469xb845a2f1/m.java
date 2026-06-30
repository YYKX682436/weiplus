package com.p314xaae8f345.p457x3304c6.p469xb845a2f1;

/* loaded from: classes5.dex */
public class m extends com.p314xaae8f345.p457x3304c6.p469xb845a2f1.AbstractC4064x9d675c3d {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p469xb845a2f1.i f129633a;

    public m(com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4063x855a1ef8 c4063x855a1ef8, com.p314xaae8f345.p457x3304c6.p469xb845a2f1.i iVar) {
        super(c4063x855a1ef8);
        this.f129633a = iVar;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p469xb845a2f1.AbstractC4064x9d675c3d
    /* renamed from: onInvoke */
    public void mo33152x48671b37(com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4063x855a1ef8 c4063x855a1ef8, java.lang.Object obj) {
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4065x844a6f32.ExportCompleteArg exportCompleteArg = (com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4065x844a6f32.ExportCompleteArg) obj;
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.i iVar = this.f129633a;
        if (iVar == null || exportCompleteArg == null) {
            return;
        }
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4056x943601cf c4056x943601cf = exportCompleteArg.f15936xca6330f1;
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b = exportCompleteArg.f15935x5c4d208;
        java.lang.String m33747x76b83bd1 = c4093x6b88526b != null ? c4093x6b88526b.m33747x76b83bd1() : null;
        nu0.i0 i0Var = (nu0.i0) iVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Map<java.lang.String, java.lang.String> m33014x5d151862 = c4056x943601cf != null ? c4056x943601cf.m33014x5d151862() : null;
        boolean z17 = true;
        if (m33747x76b83bd1 == null || m33747x76b83bd1.length() == 0) {
            if (m33014x5d151862 != null && !m33014x5d151862.isEmpty()) {
                z17 = false;
            }
            if (!z17) {
                com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4060x7aac656e[] m33150x5a8a256c = i0Var.f421492a.m33150x5a8a256c();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m33150x5a8a256c, "getImageScenes(...)");
                for (com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4060x7aac656e c4060x7aac656e : m33150x5a8a256c) {
                    java.lang.String str = m33014x5d151862.get(c4060x7aac656e.m33110xafec6a71());
                    if (str != null) {
                        arrayList.add(new nu0.u(str, c4060x7aac656e.m33114xac07aa13()));
                    }
                }
            }
        }
        arrayList.size();
        nu0.q3 q3Var = (nu0.q3) i0Var.f421493b;
        q3Var.getClass();
        ((p3325xe03a0797.p3326xc267989b.r) q3Var.f421617b).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new jz5.l(arrayList, m33747x76b83bd1)));
    }
}
