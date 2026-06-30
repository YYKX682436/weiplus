package kc5;

/* loaded from: classes9.dex */
public final class q implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.a f388108a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f388109b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.View f388110c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kc5.s f388111d;

    public q(yz5.a aVar, yz5.a aVar2, android.view.View view, kc5.s sVar) {
        this.f388108a = aVar;
        this.f388109b = aVar2;
        this.f388110c = view;
        this.f388111d = sVar;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.e1 fromNewsJumpInfo;
        java.util.List list = (java.util.List) this.f388108a.mo152xb9724478();
        java.util.List list2 = (java.util.List) this.f388109b.mo152xb9724478();
        android.view.View view = this.f388110c;
        boolean z17 = view instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22100x47612006;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22100x47612006 c22100x47612006 = z17 ? (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22100x47612006) view : null;
        int i17 = 0;
        boolean z18 = (c22100x47612006 == null || c22100x47612006.fromNewsJumpInfo == null) ? false : true;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22100x47612006 c22100x476120062 = z17 ? (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22100x47612006) view : null;
        if (c22100x476120062 != null && (fromNewsJumpInfo = c22100x476120062.getFromNewsJumpInfo()) != null) {
            i17 = fromNewsJumpInfo.f286317a;
        }
        kc5.s sVar = this.f388111d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        return sVar.Ai(str, list, list2, z18, i17);
    }
}
