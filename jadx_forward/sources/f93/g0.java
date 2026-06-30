package f93;

/* loaded from: classes11.dex */
public final class g0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16165x57283aea f341873d;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16165x57283aea activityC16165x57283aea) {
        this.f341873d = activityC16165x57283aea;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16165x57283aea activityC16165x57283aea = this.f341873d;
        android.widget.EditText editText = activityC16165x57283aea.D;
        if (editText == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchET");
            throw null;
        }
        java.lang.String query = editText.getText().toString();
        f93.y yVar = activityC16165x57283aea.A;
        if (yVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        if (!r26.i0.p(yVar.f342046q, query, true)) {
            yVar.f342046q = query;
        }
        yVar.s();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(yVar.f342048s.f224724d, "query ".concat(query));
        return false;
    }
}
