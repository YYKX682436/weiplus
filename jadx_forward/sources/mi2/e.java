package mi2;

/* loaded from: classes10.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mi2.h f408282d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f408283e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(mi2.h hVar, int i17) {
        super(0);
        this.f408282d = hVar;
        this.f408283e = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        mi2.h hVar = this.f408282d;
        java.lang.String str = hVar.f408289m;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("set mic setting success micSettingFlag:");
        int i17 = this.f408283e;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        zh2.c cVar = hVar.f408286h;
        long j17 = i17;
        if (((mm2.o4) cVar.g().a(mm2.o4.class)).U.f458662d != j17) {
            ((mm2.o4) cVar.g().a(mm2.o4.class)).U.f458662d = j17;
            dk2.xa.f315877a.f(cVar.g());
        }
        return jz5.f0.f384359a;
    }
}
