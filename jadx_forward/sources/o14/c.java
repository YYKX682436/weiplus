package o14;

/* loaded from: classes11.dex */
public class c implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17360xa18e5951 f423806d;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17360xa18e5951 activityC17360xa18e5951) {
        this.f423806d = activityC17360xa18e5951;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FixSearchUI", "delete fts db, and kill process");
        o13.p.e(24);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.i();
        sb6.append(gm0.j1.u().h());
        sb6.append("FTS5IndexMicroMsg_encrypt.db");
        java.lang.String sb7 = sb6.toString();
        java.lang.String[] strArr = {"", "-journal", "-wal", "-shm"};
        for (int i18 = 0; i18 < 4; i18++) {
            java.lang.String str = sb7 + strArr[i18];
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FixSearchUI", "deleteIndexDB %s %s", str, java.lang.Boolean.valueOf(com.p314xaae8f345.mm.vfs.w6.j(str)));
            com.p314xaae8f345.mm.vfs.w6.h(str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17360xa18e5951 activityC17360xa18e5951 = this.f423806d;
        activityC17360xa18e5951.finish();
        k35.o oVar = k35.p.f385476a;
        if (oVar != null) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC17360xa18e5951.mo55332x76847179();
            ((bt.b1) oVar).getClass();
            com.p314xaae8f345.mm.ui.vb.c(mo55332x76847179);
        }
    }
}
