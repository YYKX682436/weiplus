package l72;

/* loaded from: classes14.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.mf3 f398377d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l72.j f398378e;

    public f(l72.j jVar, r45.mf3 mf3Var) {
        this.f398378e = jVar;
        this.f398377d = mf3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        l72.j jVar = this.f398378e;
        jVar.f398386a.f181718r.clearAnimation();
        com.p314xaae8f345.mm.p1006xc5476f33.p1408x1e351176.ui.ActivityC13534x1dc4b4e7 activityC13534x1dc4b4e7 = jVar.f398386a;
        activityC13534x1dc4b4e7.f181707d.setVisibility(8);
        activityC13534x1dc4b4e7.f181718r.clearAnimation();
        activityC13534x1dc4b4e7.f181708e.setVisibility(8);
        activityC13534x1dc4b4e7.f181714n.setVisibility(0);
        activityC13534x1dc4b4e7.f181709f.setVisibility(0);
        activityC13534x1dc4b4e7.f181719s.setScaleX(0.0f);
        activityC13534x1dc4b4e7.f181719s.setScaleY(0.0f);
        activityC13534x1dc4b4e7.f181719s.animate().scaleX(1.0f).scaleY(1.0f).setDuration(800L);
        com.p314xaae8f345.mm.p1006xc5476f33.p1408x1e351176.ui.ActivityC13534x1dc4b4e7 activityC13534x1dc4b4e72 = jVar.f398386a;
        r45.mf3 mf3Var = this.f398377d;
        java.lang.String str = mf3Var.f461978h;
        activityC13534x1dc4b4e72.H = str;
        java.lang.String str2 = mf3Var.f461976f;
        activityC13534x1dc4b4e72.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceActionUI", "callbackDetectSuccess（）");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("token", str2);
        bundle.putString("serial_id", str);
        activityC13534x1dc4b4e72.G = 0;
        activityC13534x1dc4b4e72.U6("ok", 0, bundle, java.lang.Boolean.valueOf(activityC13534x1dc4b4e72.f181723w));
    }
}
