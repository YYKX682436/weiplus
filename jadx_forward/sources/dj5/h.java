package dj5;

/* loaded from: classes.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dj5.m f314602d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(dj5.m mVar) {
        super(1);
        this.f314602d = mVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        wi5.y yVar = (wi5.y) state.a(wi5.y.class);
        dj5.m mVar = this.f314602d;
        if (yVar != null) {
            if (!r26.n0.N(yVar.f527896c)) {
                j75.e eVar = yVar.f379600a;
                if (eVar != null && (eVar instanceof wi5.z)) {
                    wi5.z zVar = (wi5.z) eVar;
                    mVar.getClass();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startSearch ");
                    java.lang.String str = zVar.f527900b;
                    sb6.append(str);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactChatRoomMemberSearchUIC", sb6.toString());
                    java.util.ArrayList arrayList = mVar.f314614e;
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni((p13.c) it.next());
                    }
                    arrayList.clear();
                    java.util.HashMap hashMap = new java.util.HashMap();
                    p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 b17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(0, 0, null, 7, null);
                    p13.u uVar = new p13.u();
                    uVar.f432675d = (java.lang.String) ((jz5.n) mVar.f314616g).mo141623x754a37bb();
                    uVar.f432674c = str;
                    uVar.f432673b = 12;
                    uVar.f432685n = (com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) ((jz5.n) mVar.f314613d).mo141623x754a37bb();
                    uVar.f432684m = new dj5.d(mVar, zVar, b17, 0, false, 12, null);
                    uVar.f432681j.addAll(state.f527853p);
                    uVar.f432682k.addAll((java.util.List) ((jz5.n) mVar.f314618i).mo141623x754a37bb());
                    uVar.f432687p = true;
                    p13.c sj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(2, uVar);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactChatRoomMemberSearchUIC", "startSearch " + sj6.hashCode());
                    arrayList.add(sj6);
                    com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a O6 = mVar.O6();
                    if (O6 != null) {
                        v65.i.b(O6, null, new dj5.k(b17, hashMap, mVar, zVar, null), 1, null);
                    }
                }
                dj5.m.T6(mVar).k().setVisibility(8);
                dj5.m.T6(mVar).h().setVisibility(0);
            } else {
                dj5.m.T6(mVar).k().setVisibility(0);
                dj5.m.T6(mVar).h().setVisibility(8);
                mVar.U6();
                yVar.f527897d.mo152xb9724478();
            }
        }
        wi5.w wVar = (wi5.w) state.a(wi5.w.class);
        if (wVar != null) {
            if (!r26.n0.N(wVar.f527888c)) {
                dj5.m.T6(mVar).k().setVisibility(8);
                dj5.m.T6(mVar).h().setVisibility(0);
            } else {
                dj5.m.T6(mVar).k().setVisibility(0);
                dj5.m.T6(mVar).h().setVisibility(8);
                mVar.U6();
                wVar.f527889d.mo152xb9724478();
            }
        }
        return jz5.f0.f384359a;
    }
}
