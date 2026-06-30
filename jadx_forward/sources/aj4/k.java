package aj4;

/* loaded from: classes10.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aj4.m f86863d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zi4.r1 f86864e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(aj4.m mVar, zi4.r1 r1Var) {
        super(1);
        this.f86863d = mVar;
        this.f86864e = r1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        aj4.n result = (aj4.n) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        java.lang.String str = this.f86863d.f86870h;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("launchGallery callback: errCode=");
        long j17 = result.f86873b;
        sb6.append(j17);
        sb6.append(", count=");
        java.util.List list = result.f86872a;
        sb6.append(list.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        bw5.jb jbVar = new bw5.jb();
        jbVar.f110439d.addAll(list);
        jbVar.f110440e[1] = true;
        this.f86864e.a(jbVar, j17, result.f86874c);
        return jz5.f0.f384359a;
    }
}
