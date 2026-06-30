package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class lj extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f205495d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.f4 f205496e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.dk f205497f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.f4 f4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.dk dkVar) {
        super(2);
        this.f205495d = i17;
        this.f205496e = f4Var;
        this.f205497f = dkVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        long longValue = ((java.lang.Number) obj2).longValue();
        if (intValue > this.f205495d) {
            java.util.Iterator it = this.f205497f.O6().iterator();
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
            this.f205496e.P6(i17, com.p314xaae8f345.mm.R.id.rlb);
        }
        return jz5.f0.f384359a;
    }
}
