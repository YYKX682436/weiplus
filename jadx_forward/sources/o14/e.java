package o14;

/* loaded from: classes11.dex */
public class e implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17360xa18e5951 f423808d;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17360xa18e5951 activityC17360xa18e5951) {
        this.f423808d = activityC17360xa18e5951;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FixSearchUI", "delete topstory template, and kill process");
        com.p314xaae8f345.mm.vfs.w6.f(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.g(1).l());
        su4.k3.e(31);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17360xa18e5951 activityC17360xa18e5951 = this.f423808d;
        activityC17360xa18e5951.finish();
        k35.o oVar = k35.p.f385476a;
        if (oVar != null) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC17360xa18e5951.mo55332x76847179();
            ((bt.b1) oVar).getClass();
            com.p314xaae8f345.mm.ui.vb.c(mo55332x76847179);
        }
    }
}
