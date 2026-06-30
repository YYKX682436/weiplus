package rg5;

/* loaded from: classes8.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rg5.x f476814d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(rg5.x xVar) {
        super(0);
        this.f476814d = xVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.ArrayList arrayList = rg5.x.f476818i;
        java.lang.String str = this.f476814d.f476820b ? "find_friends_by_ting_play_state" : "find_friends_by_ting";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingEntryPreferenceMgr", "mCurrentTingEntryKey: ".concat(str));
        return str;
    }
}
