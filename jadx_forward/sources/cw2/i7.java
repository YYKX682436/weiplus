package cw2;

/* loaded from: classes15.dex */
public final class i7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd f305304d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f305305e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f305306f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd, int i17, yz5.a aVar) {
        super(1);
        this.f305304d = c15188xd8bd4bd;
        this.f305305e = i17;
        this.f305306f = aVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            java.util.HashSet hashSet = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd.f212174g2;
            int i17 = this.f305305e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = this.f305304d;
            c15188xd8bd4bd.L = i17;
            c15188xd8bd4bd.P = false;
            android.os.ConditionVariable conditionVariable = c15188xd8bd4bd.H1;
            if (conditionVariable != null) {
                conditionVariable.open();
            }
        } else {
            java.util.HashSet hashSet2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd.f212174g2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FTPP.FinderThumbPlayerProxy", "Failed to init post processor");
            this.f305306f.mo152xb9724478();
        }
        return jz5.f0.f384359a;
    }
}
