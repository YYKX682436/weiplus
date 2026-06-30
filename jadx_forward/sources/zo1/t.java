package zo1;

/* loaded from: classes5.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zo1.w f556302d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f556303e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f556304f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(zo1.w wVar, java.lang.String str, android.content.Context context) {
        super(0);
        this.f556302d = wVar;
        this.f556303e = str;
        this.f556304f = context;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        zo1.w wVar = this.f556302d;
        java.util.HashMap hashMap = wVar.f556342i;
        oo1.g gVar = oo1.g.f428676a;
        android.content.Context context = this.f556304f;
        java.lang.String str = this.f556303e;
        hashMap.put(str, gVar.a(context, str));
        java.lang.Integer num = (java.lang.Integer) wVar.f556341h.get(str);
        if (num != null) {
            wVar.m8147xed6e4d18(num.intValue());
        }
        return jz5.f0.f384359a;
    }
}
