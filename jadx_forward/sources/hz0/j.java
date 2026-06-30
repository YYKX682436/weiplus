package hz0;

/* loaded from: classes4.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.sns.p923x5525d53f.C11020xf79d3099 f367803d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f367804e;

    public j(com.p314xaae8f345.mm.p916x4268f0dc.sns.p923x5525d53f.C11020xf79d3099 c11020xf79d3099, yz5.l lVar) {
        this.f367803d = c11020xf79d3099;
        this.f367804e = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p923x5525d53f.C11020xf79d3099 c11020xf79d3099 = this.f367803d;
        java.lang.String c17 = c11020xf79d3099.f93992e.f93999b.c("KEY_EXPORT_BACKGROUND_WORK_TAG_ID");
        if (c17 == null) {
            c17 = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TemplateBackgroundWork", "onFinish: workTagId=".concat(c17));
        jz5.l j17 = c11020xf79d3099.j(c17);
        boolean booleanValue = ((java.lang.Boolean) j17.f384366d).booleanValue();
        dm.ib ibVar = (dm.ib) j17.f384367e;
        if (!booleanValue || ibVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TemplateBackgroundWork", "checkDataBeforeRemux is false");
            hz0.m.f367816a.a(c17);
            return;
        }
        c11020xf79d3099.getClass();
        int i17 = ibVar.f67037xdb9e6ea3;
        if (i17 == 4002 || i17 == 4004) {
            java.lang.String str = ibVar.f67027xae81df62;
            java.lang.String str2 = ibVar.f67026xa8a162e7;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TemplateBackgroundWork", "dealFileByLastWorkType >> " + i17 + "videoPath:  " + str + " thumbPath: " + str2 + " realVideoPath: " + com.p314xaae8f345.mm.vfs.w6.i(str, false) + "realThumbPath: " + com.p314xaae8f345.mm.vfs.w6.i(str2, false));
            com.p314xaae8f345.mm.vfs.w6.h(str);
            com.p314xaae8f345.mm.vfs.w6.h(str2);
        }
        yz5.l lVar = this.f367804e;
        if (lVar != null) {
            lVar.mo146xb9724478(ibVar);
        }
    }
}
