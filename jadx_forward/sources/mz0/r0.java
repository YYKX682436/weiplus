package mz0;

/* loaded from: classes5.dex */
public final /* synthetic */ class r0 extends p3321xbce91901.jvm.p3324x21ffc6bd.m implements yz5.a {
    public r0(java.lang.Object obj) {
        super(0, obj, mz0.b2.class, "refreshMusicPickerListUI", "refreshMusicPickerListUI()V", 0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        mz0.b2 b2Var = (mz0.b2) this.f72685xcfcbe9ef;
        android.app.Activity context = b2Var.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        java.util.List<? extends com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356> list = (java.util.List) ((com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b) ((dz0.l) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(dz0.l.class))).f151322m.f326585c.mo3195x754a37bb();
        if (list == null) {
            list = kz5.p0.f395529d;
        }
        b2Var.o7().getClass();
        zy0.e eVar = (zy0.e) ((dz0.f) b2Var.G.mo141623x754a37bb());
        eVar.getClass();
        if (list.hashCode() != eVar.f558852h) {
            list.size();
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356) it.next()).m33858xd75a8eb6());
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList, ",");
            eVar.f558852h = list.hashCode();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2008xb118f8f1.C17067x215f5d9e) eVar.f558854j.mo141623x754a37bb()).m68370xd81035cb(list);
        }
        return jz5.f0.f384359a;
    }
}
