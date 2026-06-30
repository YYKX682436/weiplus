package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class qz implements l81.p0 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f201095d;

    @Override // l81.p0
    public java.lang.String a() {
        try {
            cl0.g gVar = new cl0.g(this.f201095d);
            gVar.r("usePushAnimation", true);
            java.lang.String gVar2 = gVar.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(gVar2);
            return gVar2;
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.FinderLiveVisitorGameTeamWidget", e17, "extraData toJsonString", new java.lang.Object[0]);
            return "{}";
        }
    }

    /* renamed from: toString */
    public java.lang.String m58136x9616526c() {
        return a();
    }
}
