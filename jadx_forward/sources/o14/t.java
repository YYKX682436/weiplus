package o14;

/* loaded from: classes12.dex */
public class t implements k14.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17363xb7882d32 f423833a;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17363xb7882d32 activityC17363xb7882d32) {
        this.f423833a = activityC17363xb7882d32;
    }

    @Override // k14.m
    public void a(int i17, long j17, long j18, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FixToolsUpLogUploadingUI", "fixToolsUplogProgressCallback percent:%d", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17363xb7882d32 activityC17363xb7882d32 = this.f423833a;
        if (i17 < 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(873L, 18L, 1L, false);
            activityC17363xb7882d32.f241604i.setImageResource(com.p314xaae8f345.mm.R.raw.f79348xa13ff30b);
            activityC17363xb7882d32.f241603h.setText(com.p314xaae8f345.mm.R.C30867xcad56011.fae);
            activityC17363xb7882d32.f241606n.setVisibility(8);
            activityC17363xb7882d32.f241607o.setVisibility(8);
            activityC17363xb7882d32.f241605m.setVisibility(4);
            activityC17363xb7882d32.f241601f.setVisibility(0);
            activityC17363xb7882d32.f241602g.setVisibility(8);
            return;
        }
        if (i17 >= 100) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(873L, 17L, 1L, false);
            activityC17363xb7882d32.f241604i.setImageResource(com.p314xaae8f345.mm.R.raw.f79349xa1b2eb61);
            activityC17363xb7882d32.f241603h.setText(com.p314xaae8f345.mm.R.C30867xcad56011.faf);
            activityC17363xb7882d32.f241606n.setVisibility(8);
            activityC17363xb7882d32.f241607o.setVisibility(8);
            activityC17363xb7882d32.f241605m.setVisibility(4);
            activityC17363xb7882d32.f241601f.setVisibility(0);
            activityC17363xb7882d32.f241602g.setVisibility(8);
            activityC17363xb7882d32.f241600e = true;
            return;
        }
        if (!z17) {
            activityC17363xb7882d32.f241606n.setProgress(i17);
            activityC17363xb7882d32.f241607o.setText(java.lang.String.format("%s / %s", activityC17363xb7882d32.Z6(j18), activityC17363xb7882d32.Z6(j17)));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(873L, 19L, 1L, false);
        activityC17363xb7882d32.f241604i.setImageResource(com.p314xaae8f345.mm.R.raw.f79348xa13ff30b);
        activityC17363xb7882d32.f241603h.setText(com.p314xaae8f345.mm.R.C30867xcad56011.faa);
        activityC17363xb7882d32.f241606n.setVisibility(8);
        activityC17363xb7882d32.f241607o.setVisibility(8);
        activityC17363xb7882d32.f241605m.setVisibility(4);
        activityC17363xb7882d32.f241601f.setVisibility(0);
        activityC17363xb7882d32.f241602g.setVisibility(8);
    }
}
