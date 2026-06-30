package dw3;

/* loaded from: classes10.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ct0.b f325826d;

    public y(ct0.b bVar) {
        this.f325826d = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (java.lang.String str : this.f325826d.f303748l) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaFileUtil", "delete file:" + str);
            dw3.c0.f325715a.j(str);
        }
    }
}
