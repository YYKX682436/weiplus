package lp2;

/* loaded from: classes2.dex */
public final class d implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1578x2ff5b9.ActivityC14516x4f028c6e f401814a;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1578x2ff5b9.ActivityC14516x4f028c6e activityC14516x4f028c6e) {
        this.f401814a = activityC14516x4f028c6e;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        oa.i k17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1578x2ff5b9.ActivityC14516x4f028c6e activityC14516x4f028c6e = this.f401814a;
        android.view.View view = activityC14516x4f028c6e.f203042v.f287834h;
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = view != null ? (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff) view.findViewById(com.p314xaae8f345.mm.R.id.nv8) : null;
        java.lang.Object obj = (c2718xca2902ff == null || (k17 = c2718xca2902ff.k(c2718xca2902ff != null ? c2718xca2902ff.m20352xe06bcb0d() : 0)) == null) ? null : k17.f425311a;
        qp2.i iVar = obj instanceof qp2.i ? (qp2.i) obj : null;
        int i17 = iVar != null ? iVar.f447319c : -1;
        jz5.l[] lVarArr = new jz5.l[2];
        android.content.Intent intent = activityC14516x4f028c6e.getIntent();
        lVarArr[0] = new jz5.l("enter_from_type", intent != null ? java.lang.Integer.valueOf(intent.getIntExtra("enter_from_type", -1)) : null);
        lVarArr[1] = new jz5.l("live_tab_id", java.lang.Integer.valueOf(i17));
        return kz5.c1.k(lVarArr);
    }
}
