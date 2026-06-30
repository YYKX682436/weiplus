package nn1;

/* loaded from: classes12.dex */
public class f extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.n2 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f420193e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1252x2ca13667.ActivityC12832x56c88de f420194f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1252x2ca13667.ActivityC12832x56c88de activityC12832x56c88de, java.lang.String[] strArr, int i17, java.lang.String[] strArr2) {
        super(strArr, i17);
        this.f420194f = activityC12832x56c88de;
        this.f420193e = strArr2;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p2
    public java.lang.CharSequence b(int i17) {
        if (i17 == 1) {
            return this.f420193e[1];
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p2
    public boolean d(int i17) {
        if (i17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1252x2ca13667.ActivityC12832x56c88de activityC12832x56c88de = this.f420194f;
            activityC12832x56c88de.f7(activityC12832x56c88de.f174054u, activityC12832x56c88de.f174056w, activityC12832x56c88de.f174057x, 0);
        } else if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1252x2ca13667.ActivityC12832x56c88de activityC12832x56c88de2 = this.f420194f;
            activityC12832x56c88de2.f7(activityC12832x56c88de2.f174054u, activityC12832x56c88de2.f174056w, activityC12832x56c88de2.f174057x, 1);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1252x2ca13667.ActivityC12832x56c88de activityC12832x56c88de3 = this.f420194f;
        nn1.a aVar = activityC12832x56c88de3.f174041e;
        int i18 = activityC12832x56c88de3.f174055v;
        if (i18 != aVar.f420172g) {
            aVar.f420172g = i18;
            aVar.notifyDataSetChanged();
        }
        long a76 = activityC12832x56c88de3.a7(activityC12832x56c88de3.f174041e.f420170e);
        if (activityC12832x56c88de3.F && a76 > 0) {
            activityC12832x56c88de3.f174051r.setVisibility(0);
            activityC12832x56c88de3.g7(a76);
        } else if (a76 == 0) {
            activityC12832x56c88de3.f174051r.setVisibility(8);
        }
        super.d(i17);
        return true;
    }
}
