package ic3;

/* loaded from: classes12.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7 f371954d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7 activityC16419x510d00b7) {
        super(1);
        this.f371954d = activityC16419x510d00b7;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        xj.m mVar = (xj.m) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7 activityC16419x510d00b7 = this.f371954d;
        if (mVar != null) {
            java.lang.String str = activityC16419x510d00b7.f229383d;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getAdInfoAsync success: ");
            java.lang.String str2 = mVar.f536287b;
            sb6.append(str2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7.U6(activityC16419x510d00b7, sb6.toString());
            java.lang.String str3 = mVar.f536286a;
            activityC16419x510d00b7.f229385f = str3;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC16419x510d00b7.mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
            activityC16419x510d00b7.f229386g = new ic3.f0(mo55332x76847179, str2, str3);
            ((android.widget.FrameLayout) activityC16419x510d00b7.findViewById(com.p314xaae8f345.mm.R.id.cg7)).addView(activityC16419x510d00b7.f229386g);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(activityC16419x510d00b7.f229383d, "getAdInfoAsync, adInfo is empty");
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7.U6(activityC16419x510d00b7, "getAdInfoAsync failed: adInfo is empty");
        }
        return jz5.f0.f384359a;
    }
}
