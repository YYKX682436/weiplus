package com.p314xaae8f345.p457x3304c6.p469xb845a2f1;

/* loaded from: classes5.dex */
public class k extends com.p314xaae8f345.p457x3304c6.p469xb845a2f1.AbstractC4064x9d675c3d {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p469xb845a2f1.g f129631a;

    public k(com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4063x855a1ef8 c4063x855a1ef8, com.p314xaae8f345.p457x3304c6.p469xb845a2f1.g gVar) {
        super(c4063x855a1ef8);
        this.f129631a = gVar;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p469xb845a2f1.AbstractC4064x9d675c3d
    /* renamed from: onInvoke */
    public void mo33152x48671b37(com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4063x855a1ef8 c4063x855a1ef8, java.lang.Object obj) {
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4065x844a6f32.AddScenesCompleteArg addScenesCompleteArg = (com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4065x844a6f32.AddScenesCompleteArg) obj;
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.g gVar = this.f129631a;
        if (gVar == null || addScenesCompleteArg == null) {
            return;
        }
        java.lang.String[] strArr = addScenesCompleteArg.f15932xabb5ebcc;
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b = addScenesCompleteArg.f15933x5c4d208;
        gVar.a(strArr, c4093x6b88526b != null ? c4093x6b88526b.m33747x76b83bd1() : null);
    }
}
