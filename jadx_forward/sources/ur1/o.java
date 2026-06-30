package ur1;

/* loaded from: classes7.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f511896d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ur1.s f511897e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f511898f;

    public o(int i17, ur1.s sVar, java.lang.String str) {
        this.f511896d = i17;
        this.f511897e = sVar;
        this.f511898f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ur1.s sVar = this.f511897e;
        int i17 = this.f511896d;
        if (i17 != 3) {
            com.p314xaae8f345.mm.vfs.w6.f(sVar.Ri(i17, this.f511898f));
            return;
        }
        com.p314xaae8f345.mm.vfs.w6.f(ur1.s.f511905d);
        sVar.Di().remove("article_draft_key");
        sVar.Di().remove("picture_draft_key");
    }
}
