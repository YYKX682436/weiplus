package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes4.dex */
public class q2 extends com.p314xaae8f345.mm.ui.z9 {

    /* renamed from: o, reason: collision with root package name */
    public int f224519o;

    /* renamed from: p, reason: collision with root package name */
    public int f224520p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16139x444a8b0 f224521q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16139x444a8b0 activityC16139x444a8b0, android.content.Context context, s83.g gVar) {
        super(context, gVar);
        this.f224521q = activityC16139x444a8b0;
        new java.util.HashSet();
        this.f224519o = 10;
        this.f224520p = 10;
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        s83.g gVar = (s83.g) obj;
        if (gVar == null) {
            gVar = new s83.g();
        }
        gVar.mo9015xbf5d97fd(cursor);
        return gVar;
    }

    @Override // com.p314xaae8f345.mm.ui.z9, android.widget.Adapter
    public long getItemId(int i17) {
        return ((s83.g) getItem(i17)).f72763xa3c65b86;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View inflate;
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.p2 p2Var;
        boolean z17;
        java.lang.String str;
        int i18;
        s83.g gVar = (s83.g) getItem(i17);
        if (view == null || !(view.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.p2)) {
            inflate = com.p314xaae8f345.mm.ui.id.b(this.f294141e).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570717bm0, (android.view.ViewGroup) null);
            p2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.p2(this);
            p2Var.f224511a = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.obg);
            p2Var.f224512b = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.cgq);
            p2Var.f224513c = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.o7m);
            inflate.setTag(p2Var);
        } else {
            p2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.p2) view.getTag();
            inflate = view;
        }
        p2Var.f224511a.setText(gVar.f67913x29dd02d3);
        p2Var.f224512b.setText(gVar.f67907xad49e234);
        android.widget.TextView textView = p2Var.f224513c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16139x444a8b0 activityC16139x444a8b0 = this.f224521q;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC16139x444a8b0.mo55332x76847179();
        long j17 = gVar.f67911x879e62ac * 1000;
        java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar();
        java.util.GregorianCalendar gregorianCalendar2 = new java.util.GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5));
        java.lang.String str2 = (java.lang.String) android.text.format.DateFormat.format(mo55332x76847179.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573668fc2), j17);
        if (str2.indexOf("-") > 0) {
            java.lang.String str3 = str2.split("-")[0];
            java.lang.String str4 = str2.split("-")[1];
            java.lang.String[] stringArray = mo55332x76847179.getResources().getStringArray(com.p314xaae8f345.mm.R.C30856x58c7259.f559563af);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("");
            for (java.lang.String str5 : stringArray) {
                arrayList.add(str5);
            }
            z17 = false;
            try {
                i18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str3, 0);
            } catch (java.lang.Exception unused) {
                i18 = 0;
            }
            str = (str4 + " " + (i18 < arrayList.size() ? (java.lang.String) arrayList.get(i18) : "") + " ") + " " + ((java.lang.String) android.text.format.DateFormat.format(mo55332x76847179.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fcv), j17));
        } else {
            z17 = false;
            long timeInMillis = j17 - gregorianCalendar2.getTimeInMillis();
            if (timeInMillis <= 0 || timeInMillis > 86400000) {
                long timeInMillis2 = (j17 - gregorianCalendar2.getTimeInMillis()) + 86400000;
                str = (timeInMillis2 <= 0 || timeInMillis2 > 86400000) ? str2 + " " + ((java.lang.String) android.text.format.DateFormat.format(mo55332x76847179.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fcv), j17)) : mo55332x76847179.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fdi) + " " + ((java.lang.String) android.text.format.DateFormat.format(mo55332x76847179.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fcv), j17));
            } else {
                str = "" + ((java.lang.String) android.text.format.DateFormat.format(mo55332x76847179.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fcv), j17));
            }
        }
        textView.setText(str);
        if (gVar.f67909xff7b64c5 == 1 ? true : z17) {
            p2Var.f224511a.setTextColor(activityC16139x444a8b0.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560814ux));
        } else {
            p2Var.f224511a.setTextColor(activityC16139x444a8b0.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560815uy));
        }
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void o() {
        c();
        q();
    }

    @Override // com.p314xaae8f345.mm.ui.z9, l75.q0
    /* renamed from: onNotifyChange */
    public synchronized void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        f();
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void q() {
        this.f224520p = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Ri().mo78086x7444f759();
        s83.h Ri = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Ri();
        int i17 = this.f224519o;
        s(Ri.f486413d.E("IPCallMsg", s83.h.f486412f, null, null, null, null, "pushTime desc limit " + i17));
        notifyDataSetChanged();
    }
}
