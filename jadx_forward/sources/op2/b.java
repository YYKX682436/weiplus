package op2;

/* loaded from: classes2.dex */
public final class b implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd f428771a;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd c14521x246f2bd) {
        this.f428771a = c14521x246f2bd;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        android.content.Intent intent;
        jz5.l[] lVarArr = new jz5.l[2];
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd c14521x246f2bd = this.f428771a;
        lVarArr[0] = new jz5.l("live_tab_id", java.lang.Integer.valueOf(c14521x246f2bd.f203052s.m75939xb282bd08(0)));
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = c14521x246f2bd.mo7430x19263085();
        lVarArr[1] = new jz5.l("enter_from_type", (mo7430x19263085 == null || (intent = mo7430x19263085.getIntent()) == null) ? null : java.lang.Integer.valueOf(intent.getIntExtra("enter_from_type", -1)));
        return kz5.c1.k(lVarArr);
    }
}
