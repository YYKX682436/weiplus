package oc2;

/* loaded from: classes8.dex */
public final class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.p1451xc84b4196.C13738xbdff117b f425820d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f425821e;

    public v0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.p1451xc84b4196.C13738xbdff117b c13738xbdff117b, long j17) {
        this.f425820d = c13738xbdff117b;
        this.f425821e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.p1451xc84b4196.C13738xbdff117b c13738xbdff117b = this.f425820d;
        java.lang.String h17 = c13738xbdff117b.h();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[setRenderNodes](");
        sb6.append(c13738xbdff117b.hashCode());
        sb6.append(") ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb ctrlInfo = c13738xbdff117b.getCtrlInfo();
        sb6.append(ctrlInfo != null ? ctrlInfo.f65882x5364c75d : null);
        sb6.append(" path=");
        r45.f03 showInfo = c13738xbdff117b.getShowInfo();
        sb6.append(showInfo != null ? showInfo.f455425i : null);
        sb6.append(" render cost=");
        sb6.append(java.lang.System.currentTimeMillis() - this.f425821e);
        sb6.append("ms maxWidth=");
        sb6.append(c13738xbdff117b.getWidth());
        sb6.append(" textMaxWidth=");
        android.widget.TextView textView = (android.widget.TextView) c13738xbdff117b.findViewById(com.p314xaae8f345.mm.R.id.f565669d52);
        sb6.append(textView != null ? java.lang.Integer.valueOf(textView.getMaxWidth()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(h17, sb6.toString());
    }
}
