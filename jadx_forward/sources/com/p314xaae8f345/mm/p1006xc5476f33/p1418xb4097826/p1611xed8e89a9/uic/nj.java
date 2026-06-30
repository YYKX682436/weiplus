package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class nj extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.dk f205550d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.dk dkVar) {
        super(1);
        this.f205550d = dkVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        long longValue = ((java.lang.Number) obj).longValue();
        java.util.Iterator it = this.f205550d.O6().iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            if (((so2.j5) it.next()).mo2128x1ed62e84() == longValue) {
                break;
            }
            i17++;
        }
        return java.lang.Integer.valueOf(i17);
    }
}
