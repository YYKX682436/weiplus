package nf4;

/* loaded from: classes4.dex */
public final class i extends l75.n0 implements l75.q0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f418388e = {l75.n0.m145250x3fdc6f77(nf4.h.f418386q, "MMStoryHistoryItem")};

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f418389f = "select * from MMStoryHistoryItem ";

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f418390d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l75.k0 db6) {
        super(db6, nf4.h.f418386q, "MMStoryHistoryItem", dm.y7.f322745g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        l75.e0 e0Var = nf4.h.f418386q;
        this.f418390d = db6;
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
    }

    public final nf4.h y0(java.lang.String date) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(date, "date");
        android.database.Cursor B = this.f418390d.B(f418389f + " WHERE MMStoryHistoryItem.date = '" + date + '\'', null);
        if (!B.moveToFirst()) {
            B.close();
            return null;
        }
        nf4.h hVar = new nf4.h();
        hVar.mo9015xbf5d97fd(B);
        B.close();
        return hVar;
    }

    public final boolean z0(nf4.h storyHistoryInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storyHistoryInfo, "storyHistoryInfo");
        android.database.Cursor B = this.f418390d.B(f418389f + " WHERE MMStoryHistoryItem.date = '" + storyHistoryInfo.t0() + '\'', null);
        int count = B.getCount();
        B.close();
        return count > 0 ? mo9952xce0038c9(storyHistoryInfo, com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37645x68f5f8be) : super.mo11260x413cb2b4(storyHistoryInfo);
    }
}
