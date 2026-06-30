package xq;

/* loaded from: classes15.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xq.m f537511d;

    public g(xq.m mVar) {
        this.f537511d = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xq.m mVar = this.f537511d;
        if (mVar.f537533l) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiAnimViewHolder", "delay: recycle");
        mVar.b();
        xq.f fVar = mVar.f537539r;
        if (fVar != null) {
            xq.n nVar = ((xq.o) fVar).f537541a.f537544c;
            nVar.getClass();
            nVar.f537540a.remove(mVar);
        }
    }
}
