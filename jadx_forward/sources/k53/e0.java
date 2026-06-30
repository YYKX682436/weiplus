package k53;

/* loaded from: classes4.dex */
public class e0 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.a1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1752xed08e3c8.C15920x9de661ce f385889d;

    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1752xed08e3c8.C15920x9de661ce c15920x9de661ce) {
        this.f385889d = c15920x9de661ce;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.a1
    public void r(java.lang.String str, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameVideoView", "onDownloadFinish path [%s] isPlayNow [%b]", str, java.lang.Boolean.valueOf(z17));
        if (str == null || !str.endsWith(".temp")) {
            return;
        }
        java.lang.String replace = str.replace(".temp", "");
        com.p314xaae8f345.mm.vfs.w6.c(str, replace);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1752xed08e3c8.C15920x9de661ce c15920x9de661ce = this.f385889d;
        c15920x9de661ce.f221671n = true;
        c15920x9de661ce.f221672o = replace;
        ((java.util.HashSet) com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1752xed08e3c8.C15920x9de661ce.A).add(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameVideoView", "onDownloadFinish tempPath [%s] newPath [%s]", str, replace);
    }
}
