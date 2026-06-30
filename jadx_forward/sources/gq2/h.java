package gq2;

/* loaded from: classes2.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gq2.j f356093d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(gq2.j jVar, hq2.c cVar) {
        super(1);
        this.f356093d = jVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78 c15359x536ace78 = this.f356093d.f356098h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveTabViewPagerConvert", "onTabClick currentItem: " + intValue);
        if (c15359x536ace78 != null) {
            c15359x536ace78.m8316x940d026a(intValue);
        }
        return jz5.f0.f384359a;
    }
}
