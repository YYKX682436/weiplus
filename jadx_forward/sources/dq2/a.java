package dq2;

/* loaded from: classes15.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1590x89bc6776.C14549x1a889b7 f323892d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f323893e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1590x89bc6776.C14549x1a889b7 c14549x1a889b7, long j17) {
        super(0);
        this.f323892d = c14549x1a889b7;
        this.f323893e = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("timePassed: ");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1590x89bc6776.C14549x1a889b7.K;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1590x89bc6776.C14549x1a889b7 c14549x1a889b7 = this.f323892d;
        sb6.append(c14549x1a889b7.m82931x63e1b1b0().timePassed());
        sb6.append(" animTime: ");
        sb6.append(this.f323893e);
        sb6.append(" duration: ");
        sb6.append(c14549x1a889b7.m82931x63e1b1b0().getDuration());
        return sb6.toString();
    }
}
