package g43;

/* loaded from: classes5.dex */
public final class b0 implements kq.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p093xedfae76a.j0 f350276a;

    public b0(p012xc85e97e9.p093xedfae76a.j0 j0Var) {
        this.f350276a = j0Var;
    }

    @Override // kq.p
    public void a(java.lang.String url, java.lang.String save_path, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(save_path, "save_path");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.ChatroomViewModel", "onTaskFinished url:%s, save_path:%s", url, save_path);
        this.f350276a.mo7808x76db6cb1(new jz5.l(java.lang.Boolean.TRUE, save_path));
    }

    @Override // kq.p
    public void b(java.lang.String url, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("GameChatRoom.ChatroomViewModel", "onTaskFinished Failed url:%s, err_code:%s", url, java.lang.Integer.valueOf(i17));
        this.f350276a.mo7808x76db6cb1(new jz5.l(java.lang.Boolean.FALSE, null));
    }

    @Override // kq.p
    public void c(java.lang.String url, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
    }
}
