package n20;

/* loaded from: classes9.dex */
public final class a implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p735x75644e17.v3.C10552x7102d3fe f415747a;

    public a(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p735x75644e17.v3.C10552x7102d3fe c10552x7102d3fe) {
        this.f415747a = c10552x7102d3fe;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.util.LinkedList linkedList;
        bw5.kf kfVar;
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p735x75644e17.v3.C10552x7102d3fe c10552x7102d3fe = this.f415747a;
        bw5.Cif cif = c10552x7102d3fe.getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA java.lang.String();
        boolean z17 = false;
        if (cif != null && (linkedList = cif.f110099d) != null && (kfVar = (bw5.kf) linkedList.get(0)) != null && kfVar.f110895d == 2) {
            z17 = true;
        }
        java.util.Map e17 = kz5.b1.e(new jz5.l("click_type", z17 ? "video" : "img"));
        java.lang.String g07 = e17.isEmpty() ? null : kz5.n0.g0(e17.entrySet(), ";", "{", "}", 0, null, b30.d.f99093d, 24, null);
        l20.o0 callback = c10552x7102d3fe.getCallback();
        java.util.Map mo44382x29c21c7c = callback != null ? callback.mo44382x29c21c7c() : null;
        if (mo44382x29c21c7c == null) {
            mo44382x29c21c7c = kz5.q0.f395534d;
        }
        return kz5.c1.m(mo44382x29c21c7c, kz5.b1.e(new jz5.l("element_info", g07)));
    }
}
