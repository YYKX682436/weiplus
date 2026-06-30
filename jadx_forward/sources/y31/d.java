package y31;

/* loaded from: classes7.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y31.f f540692d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f540693e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f540694f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(y31.f fVar, java.lang.String str, java.lang.String str2) {
        super(0);
        this.f540692d = fVar;
        this.f540693e = str;
        this.f540694f = str2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        y31.f fVar = this.f540692d;
        jc3.j0 j0Var = fVar.f540696d;
        if (j0Var != null) {
            java.lang.String str = this.f540693e;
            java.lang.String str2 = this.f540694f;
            synchronized (j0Var) {
                int i17 = 500;
                if (fVar.f540701i) {
                    ((rc3.w0) j0Var).k(str, str2);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("sendEvent event:");
                    sb6.append(str);
                    sb6.append(" value:");
                    int length = str2.length();
                    if (length <= 500) {
                        i17 = length;
                    }
                    java.lang.String substring = str2.substring(0, i17);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                    sb6.append(substring);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.MagicNewPlayableBiz", sb6.toString());
                } else {
                    fVar.f540702m.add(new y31.a(str, str2));
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("sendEvent add PendingEvent key:");
                    sb7.append(str);
                    sb7.append(" value:");
                    int length2 = str2.length();
                    if (length2 <= 500) {
                        i17 = length2;
                    }
                    java.lang.String substring2 = str2.substring(0, i17);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring2, "substring(...)");
                    sb7.append(substring2);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.MagicNewPlayableBiz", sb7.toString());
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
