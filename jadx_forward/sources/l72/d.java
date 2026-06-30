package l72;

/* loaded from: classes14.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f398373d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f398374e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l72.j f398375f;

    public d(l72.j jVar, int i17, java.lang.String str) {
        this.f398375f = jVar;
        this.f398373d = i17;
        this.f398374e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        l72.j jVar = this.f398375f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1408x1e351176.ui.ActivityC13534x1dc4b4e7 activityC13534x1dc4b4e7 = jVar.f398386a;
        activityC13534x1dc4b4e7.f181724x = this.f398373d;
        activityC13534x1dc4b4e7.f181725y = this.f398374e;
        n72.q qVar = new n72.q(activityC13534x1dc4b4e7, activityC13534x1dc4b4e7.A);
        activityC13534x1dc4b4e7.f181726z = qVar;
        qVar.f416823y = activityC13534x1dc4b4e7.f181715o;
        qVar.f416824z = activityC13534x1dc4b4e7.f181712i;
        qVar.A = activityC13534x1dc4b4e7.f181711h;
        qVar.f416817s = activityC13534x1dc4b4e7.f181724x;
        qVar.f416818t = activityC13534x1dc4b4e7.f181725y;
        qVar.D = activityC13534x1dc4b4e7.f181717q;
        qVar.C = activityC13534x1dc4b4e7.f181714n;
        qVar.f(activityC13534x1dc4b4e7.f181713m);
        activityC13534x1dc4b4e7.f181726z.g();
        com.p314xaae8f345.mm.p1006xc5476f33.p1408x1e351176.ui.ActivityC13534x1dc4b4e7 activityC13534x1dc4b4e72 = jVar.f398386a;
        activityC13534x1dc4b4e72.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceActionUI", "preview");
        n72.q qVar2 = activityC13534x1dc4b4e72.f181726z;
        if (qVar2 != null) {
            qVar2.f416815q = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceActionUI", "mCamera ！= null");
        }
        activityC13534x1dc4b4e72.f181715o.setText(com.p314xaae8f345.mm.R.C30867xcad56011.c7o);
        jVar.f398386a.D++;
    }
}
