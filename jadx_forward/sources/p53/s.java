package p53;

/* loaded from: classes5.dex */
public class s implements kq.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f433607a;

    public s(p53.t tVar, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        this.f433607a = rVar;
    }

    @Override // kq.p
    public void a(java.lang.String str, java.lang.String str2, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RichGameTabWidget", "onTaskFinished url:%s, save_path:%s", str, str2);
        this.f433607a.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c(true));
    }

    @Override // kq.p
    public void b(java.lang.String str, int i17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("RichGameTabWidget", "onTaskFinished Failed url:%s, err_code:%s", str, java.lang.Integer.valueOf(i17));
        this.f433607a.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c(false));
    }

    @Override // kq.p
    public void c(java.lang.String str, long j17, long j18) {
    }
}
