package df2;

/* loaded from: classes3.dex */
public final class zn extends if2.b implements mf2.c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zn(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onFloatMode */
    public void mo14866x804e7f00() {
        super.mo14866x804e7f00();
        int b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m0.f197140a.b();
        java.util.Set set = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m0.f197150k;
        synchronized (set) {
            set.add(java.lang.Integer.valueOf(b17));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSlideStatusReport", "onFloatMode offsetPos=" + b17 + " size=" + set.size());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(this, null, null, new df2.yn(this, null), 3, null);
    }
}
