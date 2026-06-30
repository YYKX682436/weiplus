package df2;

/* loaded from: classes3.dex */
public final class u3 extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.uv f313030m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
    }

    public final void Z6(int i17, yz5.a aVar) {
        java.lang.String str;
        xh2.e eVar = (xh2.e) ((mm2.y2) m56788xbba4bfc0(mm2.y2.class)).B.mo3195x754a37bb();
        if (eVar == null || (str = eVar.f536077b) == null) {
            str = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.uv uvVar = this.f313030m;
        boolean z17 = false;
        if (uvVar != null && uvVar.q()) {
            z17 = true;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSetMicTopicController", "openMicTopicWidget: isShowing");
            return;
        }
        this.f313030m = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.uv(O6(), new df2.t3(this, aVar, i17));
        boolean z18 = ((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).Z6() ? ((mm2.y2) m56788xbba4bfc0(mm2.y2.class)).C : true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.uv uvVar2 = this.f313030m;
        if (uvVar2 != null) {
            uvVar2.A(str, z18);
        }
    }
}
