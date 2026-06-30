package aj5;

/* loaded from: classes.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f86934d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ aj5.e f86935e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86936f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.util.ArrayList arrayList, aj5.e eVar, java.lang.String str) {
        super(1);
        this.f86934d = arrayList;
        this.f86935e = eVar;
        this.f86936f = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        if (((wi5.s) state.a(wi5.s.class)) != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSelectContactAfterAction chatroomLiveItemList: ");
            java.util.ArrayList arrayList = this.f86934d;
            sb6.append(arrayList.size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MoreDuplicateGroupUIC", sb6.toString());
            boolean z17 = true;
            boolean z18 = !arrayList.isEmpty();
            aj5.e eVar = this.f86935e;
            if (z18) {
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 k17 = ((em.l2) ((jz5.n) eVar.f86949d).mo141623x754a37bb()).k();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k17, "getSelectContactRv(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe a17 = xm3.u0.a(k17);
                if (a17 != null) {
                    a17.n(arrayList, false);
                }
            }
            java.lang.String str = this.f86936f;
            if (str != null && !r26.n0.N(str)) {
                z17 = false;
            }
            if (!z17) {
                p13.u uVar = new p13.u();
                uVar.f432674c = str;
                uVar.f432673b = 99;
                uVar.f432685n = (com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) ((jz5.n) eVar.f86950e).mo141623x754a37bb();
                uVar.f432684m = new aj5.a(eVar);
                eVar.f86951f = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(2, uVar);
            }
        }
        return jz5.f0.f384359a;
    }
}
