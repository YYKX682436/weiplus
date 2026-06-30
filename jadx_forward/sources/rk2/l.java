package rk2;

/* loaded from: classes3.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rk2.q f477995d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(rk2.q qVar) {
        super(0);
        this.f477995d = qVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17;
        r45.la4 la4Var;
        rk2.q qVar = this.f477995d;
        int w17 = qVar.f478007e.w();
        int y17 = qVar.f478007e.y();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MultiStreamWidget", "firstVisiblePos:" + w17 + " lastVisiblePos:" + y17);
        if (w17 == y17) {
            uk2.b x17 = qVar.f478006d.x(w17);
            java.lang.String str = (x17 == null || (la4Var = x17.f510055b) == null) ? null : la4Var.f460807e;
            if (str == null) {
                str = "";
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveViewCallback", "onItemChecked curLiveId:" + str + " selectedLiveId:" + qVar.f478014l);
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "") && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, qVar.f478014l)) {
                qVar.f478014l = str;
                z17 = true;
                return java.lang.Boolean.valueOf(z17);
            }
        }
        z17 = false;
        return java.lang.Boolean.valueOf(z17);
    }
}
