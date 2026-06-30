package yh2;

/* loaded from: classes10.dex */
public final class k extends com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf implements yh2.m {
    public final java.util.ArrayList I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(in5.s itemConvertFactory, java.util.ArrayList userDataList) {
        super(itemConvertFactory, userDataList, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemConvertFactory, "itemConvertFactory");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userDataList, "userDataList");
        this.I = userDataList;
    }

    @Override // yh2.m
    public java.util.ArrayList c() {
        return this.I;
    }

    @Override // yh2.m
    public void d(km2.q micUser) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micUser, "micUser");
        int j17 = j(micUser);
        if (j17 != -1) {
            this.I.remove(j17);
            m8155x27702c4(j17);
        }
    }

    @Override // yh2.m
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f() {
        return this;
    }

    @Override // yh2.m
    public int j(km2.q data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.util.Iterator it = this.I.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            km2.q qVar = ((vi2.i) it.next()).f519085d;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(qVar != null ? qVar.f390705c : null, data.f390705c)) {
                return i17;
            }
            i17++;
        }
        return -1;
    }
}
