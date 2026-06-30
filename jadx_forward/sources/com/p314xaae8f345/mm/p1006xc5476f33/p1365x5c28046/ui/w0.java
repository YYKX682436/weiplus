package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* loaded from: classes5.dex */
public final class w0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13303x3d472b4c f180063d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13303x3d472b4c activityC13303x3d472b4c) {
        super(2);
        this.f180063d = activityC13303x3d472b4c;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.util.List list = (java.util.List) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13303x3d472b4c activityC13303x3d472b4c = this.f180063d;
        java.lang.String str = activityC13303x3d472b4c.f179277d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCreateView: ");
        sb6.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
        sb6.append(", ");
        sb6.append(booleanValue);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) ((jz5.n) activityC13303x3d472b4c.f179278e).mo141623x754a37bb()).post(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v0(booleanValue, activityC13303x3d472b4c, list));
        return jz5.f0.f384359a;
    }
}
