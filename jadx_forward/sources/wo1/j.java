package wo1;

/* loaded from: classes5.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1265xac8f1cfd.C12856xc25e966b f529488d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f529489e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f529490f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1265xac8f1cfd.C12856xc25e966b c12856xc25e966b, java.lang.String str, android.content.Context context) {
        super(0);
        this.f529488d = c12856xc25e966b;
        this.f529489e = str;
        this.f529490f = context;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.HashMap hashMap;
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1265xac8f1cfd.C12856xc25e966b c12856xc25e966b = this.f529488d;
        hashMap = c12856xc25e966b.spannedName;
        oo1.g gVar = oo1.g.f428676a;
        android.content.Context context = this.f529490f;
        java.lang.String str = this.f529489e;
        hashMap.put(str, gVar.a(context, str));
        c12856xc25e966b.m174242x129ad476(str);
        return jz5.f0.f384359a;
    }
}
