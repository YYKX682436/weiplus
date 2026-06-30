package n34;

/* loaded from: classes4.dex */
public final class c3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.h70 f416106d;

    public c3(r45.h70 h70Var) {
        this.f416106d = h70Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.SnsFinderPostManager$saveFinderPostData$1");
        java.util.LinkedList tracks = this.f416106d.f457430d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tracks, "tracks");
        java.util.Iterator it = tracks.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((r45.ho6) obj).f457867e == 2) {
                    break;
                }
            }
        }
        r45.ho6 ho6Var = (r45.ho6) obj;
        if (ho6Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.SnsFinderPostManager$saveFinderPostData$1");
            return;
        }
        java.lang.String d17 = dw3.h.d(dw3.h.f325744a, null, null, 3, null);
        com.p314xaae8f345.mm.vfs.w6.c(ho6Var.f457866d, d17);
        ho6Var.f457866d = d17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsFinderPostManager", "compositionInfo copy finish");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.SnsFinderPostManager$saveFinderPostData$1");
    }
}
