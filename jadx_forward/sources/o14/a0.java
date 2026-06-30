package o14;

/* loaded from: classes9.dex */
public class a0 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f423800a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17364x9169f957 f423801b;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17364x9169f957 activityC17364x9169f957, long j17) {
        this.f423801b = activityC17364x9169f957;
        this.f423800a = j17;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.n
    /* renamed from: onResult */
    public void mo26477x57429edc(boolean z17, int i17, int i18, int i19) {
        if (z17) {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append(java.lang.String.format("%02d", java.lang.Integer.valueOf(i17)));
            stringBuffer.append(".");
            stringBuffer.append(java.lang.String.format("%02d", java.lang.Integer.valueOf(i18)));
            stringBuffer.append(".");
            stringBuffer.append(java.lang.String.format("%02d", java.lang.Integer.valueOf(i19)));
            this.f423801b.f241616i.setText(stringBuffer);
            java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer();
            stringBuffer2.append(java.lang.String.format("%02d", java.lang.Integer.valueOf(i17)));
            stringBuffer2.append(java.lang.String.format("%02d", java.lang.Integer.valueOf(i18)));
            stringBuffer2.append(java.lang.String.format("%02d", java.lang.Integer.valueOf(i19)));
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17364x9169f957.f241609s = stringBuffer2.toString();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FixToolsUplogUI", "uplog choose time maxTime[%d], date[%s]", java.lang.Long.valueOf(this.f423800a), com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17364x9169f957.f241609s);
        }
    }
}
