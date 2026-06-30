package ca3;

/* loaded from: classes13.dex */
public final class j implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMapCameraChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.map.C16226x881c42e f121333a;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.map.C16226x881c42e c16226x881c42e) {
        this.f121333a = c16226x881c42e;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMapCameraChangeListener
    /* renamed from: onCameraChange */
    public void mo14565x21a09eb4(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4394xa89e978e c4394xa89e978e) {
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMapCameraChangeListener
    /* renamed from: onCameraChangeFinish */
    public void mo14566x31824067(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4394xa89e978e c4394xa89e978e) {
        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 m37103x30959487;
        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 m37103x309594872;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.map.C16226x881c42e c16226x881c42e = this.f121333a;
        c16226x881c42e.f225639m = (c4394xa89e978e == null || (m37103x309594872 = c4394xa89e978e.m37103x30959487()) == null) ? c16226x881c42e.f225639m : m37103x309594872.m37195x2605e9e2();
        c16226x881c42e.f225638i = (c4394xa89e978e == null || (m37103x30959487 = c4394xa89e978e.m37103x30959487()) == null) ? c16226x881c42e.f225638i : m37103x30959487.m37196x79d7af9();
        c16226x881c42e.f225646t = (c4394xa89e978e != null ? java.lang.Float.valueOf(c4394xa89e978e.m37101x2fd5b378()) : java.lang.Double.valueOf(c16226x881c42e.f225646t)).doubleValue();
        c16226x881c42e.f225640n = (c4394xa89e978e != null ? java.lang.Float.valueOf(c4394xa89e978e.m37104xfb888c49()) : java.lang.Double.valueOf(c16226x881c42e.f225640n)).doubleValue();
        c16226x881c42e.f225647u = (c4394xa89e978e != null ? java.lang.Float.valueOf(c4394xa89e978e.m37102xfb854d80()) : java.lang.Double.valueOf(c16226x881c42e.f225647u)).doubleValue();
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.C25942x9518de01 c25942x9518de01 = c16226x881c42e.f225636g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c25942x9518de01);
        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4407xcb530b7b m37435x227a49d1 = c25942x9518de01.mo98900x78d58245().mo98928xf0312250().m37435x227a49d1();
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = c16226x881c42e.f225634e;
        if (c28688xe8dbe4c2 != null) {
            c28688xe8dbe4c2.m138438xd8c5c779("regionChange", kz5.c1.i(new jz5.l("northeast", kz5.c1.i(new jz5.l("latitude", java.lang.Double.valueOf(m37435x227a49d1.m37210x19d913cc().m37195x2605e9e2())), new jz5.l("longitude", java.lang.Double.valueOf(m37435x227a49d1.m37210x19d913cc().m37196x79d7af9())))), new jz5.l("southwest", kz5.c1.i(new jz5.l("latitude", java.lang.Double.valueOf(m37435x227a49d1.m37211x9dea2e46().m37195x2605e9e2())), new jz5.l("longitude", java.lang.Double.valueOf(m37435x227a49d1.m37211x9dea2e46().m37196x79d7af9()))))));
        }
    }
}
