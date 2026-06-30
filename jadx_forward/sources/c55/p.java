package c55;

/* loaded from: classes12.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c55.q f120288d;

    public p(c55.q qVar) {
        this.f120288d = qVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        c55.q qVar = this.f120288d;
        if (qVar.f120290e.f120299d.isFinishing()) {
            return;
        }
        c55.u uVar = qVar.f120290e;
        com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19822xa98ed509 activityC19822xa98ed509 = uVar.f120299d;
        java.lang.Thread thread = com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19822xa98ed509.f273725s;
        activityC19822xa98ed509.f273731h.setClickable(true);
        activityC19822xa98ed509.f273731h.setVisibility(0);
        activityC19822xa98ed509.f273732i.setVisibility(8);
        com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19822xa98ed509 activityC19822xa98ed5092 = uVar.f120299d;
        activityC19822xa98ed5092.f273730g.setText(activityC19822xa98ed5092.getResources().getString(com.p314xaae8f345.p2922xd05e7f95.wx.R.C25472xcad56011.f46232xf0ad051d));
        com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19822xa98ed509 activityC19822xa98ed5093 = uVar.f120299d;
        activityC19822xa98ed5093.f273731h.setText(activityC19822xa98ed5093.getResources().getString(com.p314xaae8f345.p2922xd05e7f95.wx.R.C25472xcad56011.f46215x14fccd82));
        uVar.f120299d.f273731h.setOnClickListener(new c55.o(this));
    }
}
